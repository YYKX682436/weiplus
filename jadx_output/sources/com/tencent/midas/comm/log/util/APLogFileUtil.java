package com.tencent.midas.comm.log.util;

/* loaded from: classes13.dex */
public class APLogFileUtil {
    private static final java.lang.String DEBUG_CONF = "MidasLogDebug.ini";
    private static final int DEFAULT_MAX_LOG_FILE_NUM = 2;
    private static final int DEFAULT_MAX_LOG_FILE_SIZE_MB = 1;
    private static final int DEFAULT_MAX_LOG_KEEP_DAYS = 15;
    public static final java.lang.String SEPARATOR_LINE = "\r\n";
    public static final java.lang.String SEPARATOR_LOG = " | ";
    private static int maxDirSizeMB = (15 * 2) * 1;
    public static int maxLogFileNum = 2;
    public static int maxLogFileSizeMB = 1;
    public static int maxLogKeepDays = 15;
    public static int minSDCardSpace = 20;

    public static void deleteFileUpMaxInDir(java.lang.String str, long j17, long j18, int i17) {
        try {
            java.io.File file = new java.io.File(str);
            if (file.exists() && !file.isFile()) {
                double d17 = j18;
                boolean z17 = getFileOrFilesSize(str) >= d17;
                java.io.File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length != 0) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    for (java.io.File file2 : listFiles) {
                        long lastModified = file2.lastModified();
                        if (!file2.getName().equals("MidasLog.mmap") && file2.isFile() && (z17 || currentTimeMillis - lastModified > i17 * 24 * 3600 * 1000 || (getFileSize(file2) / 1024) / 1024 >= j17)) {
                            file2.delete();
                        }
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void deleteOldFileToday(java.lang.String str) {
        deleteOldFileToday(str, maxLogFileNum);
    }

    private static int getConfValue(android.content.SharedPreferences sharedPreferences, java.lang.String str, int i17) {
        java.lang.String string = sharedPreferences.getString(str, null);
        if (android.text.TextUtils.isEmpty(string)) {
            return i17;
        }
        try {
            java.lang.String.format(java.util.Locale.CHINA, "Read log conf[%s]: %s", str, string);
            int parseInt = java.lang.Integer.parseInt(string);
            return parseInt > 0 ? parseInt : i17;
        } catch (java.lang.Throwable th6) {
            java.lang.String.format(java.util.Locale.CHINA, "Read log conf[%s] error: %s", str, th6.getMessage());
            return i17;
        }
    }

    public static double getFileOrFilesSize(java.lang.String str) {
        long j17;
        java.io.File file = new java.io.File(str);
        try {
            j17 = file.isDirectory() ? getFileSizes(file) : getFileSize(file);
        } catch (java.lang.Throwable unused) {
            j17 = 0;
        }
        return (j17 / 1024) / 1024;
    }

    private static long getFileSize(java.io.File file) {
        long j17 = 0;
        try {
            if (file.exists()) {
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
                j17 = fileInputStream.available();
                fileInputStream.close();
            } else {
                file.createNewFile();
            }
        } catch (java.lang.Throwable unused) {
        }
        return j17;
    }

    private static long getFileSizes(java.io.File file) {
        java.io.File[] listFiles = file.listFiles();
        long j17 = 0;
        for (int i17 = 0; i17 < listFiles.length; i17++) {
            j17 += listFiles[i17].isDirectory() ? getFileSizes(listFiles[i17]) : getFileSize(listFiles[i17]);
        }
        return j17;
    }

    public static java.lang.String getLastLogFileName(java.lang.String str) {
        java.util.ArrayList<java.io.File> logFiles = getLogFiles(str, getToday());
        return logFiles.size() > 0 ? logFiles.get(logFiles.size() - 1).getName() : "";
    }

    public static java.util.ArrayList<java.io.File> getLogFiles(java.lang.String str, final java.lang.String str2) {
        java.io.File file = new java.io.File(str);
        if (!file.isDirectory()) {
            return new java.util.ArrayList<>();
        }
        java.io.File[] listFiles = file.listFiles(new java.io.FilenameFilter() { // from class: com.tencent.midas.comm.log.util.APLogFileUtil.1
            @Override // java.io.FilenameFilter
            public boolean accept(java.io.File file2, java.lang.String str3) {
                return str3.startsWith(str2);
            }
        });
        java.util.Arrays.sort(listFiles, new java.util.Comparator<java.io.File>() { // from class: com.tencent.midas.comm.log.util.APLogFileUtil.2
            private int extractNumber(java.lang.String str3) {
                try {
                    return java.lang.Integer.parseInt(str3.substring(str3.indexOf(95) + 1, str3.lastIndexOf(46)));
                } catch (java.lang.Throwable unused) {
                    return 0;
                }
            }

            @Override // java.util.Comparator
            public int compare(java.io.File file2, java.io.File file3) {
                return extractNumber(file2.getName()) - extractNumber(file3.getName());
            }
        });
        return new java.util.ArrayList<>(java.util.Arrays.asList(listFiles));
    }

    public static double getSDCardSpace() {
        long j17;
        try {
            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getExternalStorageDirectory().getPath());
            j17 = ((statFs.getAvailableBlocks() * statFs.getBlockSize()) / 1024) / 1024;
        } catch (java.lang.Throwable th6) {
            th6.toString();
            j17 = 0;
        }
        return j17;
    }

    public static java.lang.String getToday() {
        return new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.CHINA).format(new java.util.Date(java.lang.System.currentTimeMillis()));
    }

    public static boolean initLogDir(java.lang.String str) {
        try {
            java.io.File file = new java.io.File(str);
            if (!file.exists()) {
                return file.mkdirs();
            }
            deleteFileUpMaxInDir(str, maxLogFileSizeMB, maxDirSizeMB, maxLogKeepDays);
            deleteOldFileToday(str, maxLogFileNum);
            return true;
        } catch (java.lang.Throwable th6) {
            th6.toString();
            return false;
        }
    }

    public static boolean isDebugMode(java.lang.String str) {
        return new java.io.File(str + DEBUG_CONF).exists();
    }

    public static void readLogKeepConf(android.content.Context context) {
        int i17 = maxLogFileSizeMB;
        if (i17 <= 0) {
            i17 = 1;
        }
        maxLogFileSizeMB = i17;
        int i18 = maxLogFileNum;
        if (i18 <= 0) {
            i18 = 2;
        }
        maxLogFileNum = i18;
        int i19 = maxLogKeepDays;
        if (i19 <= 0) {
            i19 = 15;
        }
        maxLogKeepDays = i19;
        maxDirSizeMB = i17 * i18 * i19;
        java.lang.String.format(java.util.Locale.CHINA, "current config: max log size: %d MB, max log num: %d, max keep %d DAYS", java.lang.Integer.valueOf(maxLogFileSizeMB), java.lang.Integer.valueOf(maxLogFileNum), java.lang.Integer.valueOf(maxLogKeepDays));
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(com.tencent.midas.data.APPluginDataInterface.SHARE_PREFERENCE_NAME, 4);
        maxLogFileSizeMB = getConfValue(sharedPreferences, "size", maxLogFileSizeMB);
        maxLogFileNum = getConfValue(sharedPreferences, "num", maxLogFileNum);
        int confValue = getConfValue(sharedPreferences, "log_keep_time", maxLogKeepDays);
        maxLogKeepDays = confValue;
        maxDirSizeMB = maxLogFileSizeMB * maxLogFileNum * confValue;
        java.lang.String.format(java.util.Locale.CHINA, "final config: max log size: %d MB, max log num: %d, max keep %d DAYS", java.lang.Integer.valueOf(maxLogFileSizeMB), java.lang.Integer.valueOf(maxLogFileNum), java.lang.Integer.valueOf(maxLogKeepDays));
    }

    public static void deleteOldFileToday(java.lang.String str, int i17) {
        java.util.ArrayList<java.io.File> logFiles = getLogFiles(str, getToday() + "_");
        int size = logFiles.size();
        if (size < i17 || i17 <= 0) {
            return;
        }
        for (int i18 = 0; i18 < size; i18++) {
            java.io.File file = logFiles.get(i18);
            if (file != null) {
                file.getName();
                if (i18 < size - i17) {
                    file.getName();
                    file.delete();
                }
            }
        }
    }
}
