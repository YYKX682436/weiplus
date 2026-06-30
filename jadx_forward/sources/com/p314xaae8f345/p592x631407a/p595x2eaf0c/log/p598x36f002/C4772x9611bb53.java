package com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002;

/* renamed from: com.tencent.midas.comm.log.util.APLogFileUtil */
/* loaded from: classes13.dex */
public class C4772x9611bb53 {

    /* renamed from: DEBUG_CONF */
    private static final java.lang.String f20372xb0f5a9b0 = "MidasLogDebug.ini";

    /* renamed from: DEFAULT_MAX_LOG_FILE_NUM */
    private static final int f20373x25d0d657 = 2;

    /* renamed from: DEFAULT_MAX_LOG_FILE_SIZE_MB */
    private static final int f20374x7f1cd104 = 1;

    /* renamed from: DEFAULT_MAX_LOG_KEEP_DAYS */
    private static final int f20375x7a90471d = 15;

    /* renamed from: SEPARATOR_LINE */
    public static final java.lang.String f20376x98ef612e = "\r\n";

    /* renamed from: SEPARATOR_LOG */
    public static final java.lang.String f20377xba9c5eaa = " | ";

    /* renamed from: maxDirSizeMB */
    private static int f20378x536a4b3f = (15 * 2) * 1;

    /* renamed from: maxLogFileNum */
    public static int f20379xea2110a = 2;

    /* renamed from: maxLogFileSizeMB */
    public static int f20380xe5c36952 = 1;

    /* renamed from: maxLogKeepDays */
    public static int f20381xee1144dc = 15;

    /* renamed from: minSDCardSpace */
    public static int f20382xdf55a2f3 = 20;

    /* renamed from: deleteFileUpMaxInDir */
    public static void m41721xb2803306(java.lang.String str, long j17, long j18, int i17) {
        try {
            java.io.File file = new java.io.File(str);
            if (file.exists() && !file.isFile()) {
                double d17 = j18;
                boolean z17 = m41725xe3727b23(str) >= d17;
                java.io.File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length != 0) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    for (java.io.File file2 : listFiles) {
                        long lastModified = file2.lastModified();
                        if (!file2.getName().equals("MidasLog.mmap") && file2.isFile() && (z17 || currentTimeMillis - lastModified > i17 * 24 * 3600 * 1000 || (m41726x50026913(file2) / 1024) / 1024 >= j17)) {
                            file2.delete();
                        }
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: deleteOldFileToday */
    public static void m41722x70a9e609(java.lang.String str) {
        m41723x70a9e609(str, f20379xea2110a);
    }

    /* renamed from: getConfValue */
    private static int m41724xce6c39f7(android.content.SharedPreferences sharedPreferences, java.lang.String str, int i17) {
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

    /* renamed from: getFileOrFilesSize */
    public static double m41725xe3727b23(java.lang.String str) {
        long j17;
        java.io.File file = new java.io.File(str);
        try {
            j17 = file.isDirectory() ? m41727xb04ab9c0(file) : m41726x50026913(file);
        } catch (java.lang.Throwable unused) {
            j17 = 0;
        }
        return (j17 / 1024) / 1024;
    }

    /* renamed from: getFileSize */
    private static long m41726x50026913(java.io.File file) {
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

    /* renamed from: getFileSizes */
    private static long m41727xb04ab9c0(java.io.File file) {
        java.io.File[] listFiles = file.listFiles();
        long j17 = 0;
        for (int i17 = 0; i17 < listFiles.length; i17++) {
            j17 += listFiles[i17].isDirectory() ? m41727xb04ab9c0(listFiles[i17]) : m41726x50026913(listFiles[i17]);
        }
        return j17;
    }

    /* renamed from: getLastLogFileName */
    public static java.lang.String m41728xa29cd6df(java.lang.String str) {
        java.util.ArrayList<java.io.File> m41729xf27bcf09 = m41729xf27bcf09(str, m41731x7534458b());
        return m41729xf27bcf09.size() > 0 ? m41729xf27bcf09.get(m41729xf27bcf09.size() - 1).getName() : "";
    }

    /* renamed from: getLogFiles */
    public static java.util.ArrayList<java.io.File> m41729xf27bcf09(java.lang.String str, final java.lang.String str2) {
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
            /* renamed from: extractNumber */
            private int m41735xd35f7f2a(java.lang.String str3) {
                try {
                    return java.lang.Integer.parseInt(str3.substring(str3.indexOf(95) + 1, str3.lastIndexOf(46)));
                } catch (java.lang.Throwable unused) {
                    return 0;
                }
            }

            @Override // java.util.Comparator
            public int compare(java.io.File file2, java.io.File file3) {
                return m41735xd35f7f2a(file2.getName()) - m41735xd35f7f2a(file3.getName());
            }
        });
        return new java.util.ArrayList<>(java.util.Arrays.asList(listFiles));
    }

    /* renamed from: getSDCardSpace */
    public static double m41730x840af6f() {
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

    /* renamed from: getToday */
    public static java.lang.String m41731x7534458b() {
        return new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.CHINA).format(new java.util.Date(java.lang.System.currentTimeMillis()));
    }

    /* renamed from: initLogDir */
    public static boolean m41732x331b7d9(java.lang.String str) {
        try {
            java.io.File file = new java.io.File(str);
            if (!file.exists()) {
                return file.mkdirs();
            }
            m41721xb2803306(str, f20380xe5c36952, f20378x536a4b3f, f20381xee1144dc);
            m41723x70a9e609(str, f20379xea2110a);
            return true;
        } catch (java.lang.Throwable th6) {
            th6.toString();
            return false;
        }
    }

    /* renamed from: isDebugMode */
    public static boolean m41733x3a69248c(java.lang.String str) {
        return new java.io.File(str + f20372xb0f5a9b0).exists();
    }

    /* renamed from: readLogKeepConf */
    public static void m41734x48f71c37(android.content.Context context) {
        int i17 = f20380xe5c36952;
        if (i17 <= 0) {
            i17 = 1;
        }
        f20380xe5c36952 = i17;
        int i18 = f20379xea2110a;
        if (i18 <= 0) {
            i18 = 2;
        }
        f20379xea2110a = i18;
        int i19 = f20381xee1144dc;
        if (i19 <= 0) {
            i19 = 15;
        }
        f20381xee1144dc = i19;
        f20378x536a4b3f = i17 * i18 * i19;
        java.lang.String.format(java.util.Locale.CHINA, "current config: max log size: %d MB, max log num: %d, max keep %d DAYS", java.lang.Integer.valueOf(f20380xe5c36952), java.lang.Integer.valueOf(f20379xea2110a), java.lang.Integer.valueOf(f20381xee1144dc));
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.f20554x1a22ef, 4);
        f20380xe5c36952 = m41724xce6c39f7(sharedPreferences, "size", f20380xe5c36952);
        f20379xea2110a = m41724xce6c39f7(sharedPreferences, "num", f20379xea2110a);
        int m41724xce6c39f7 = m41724xce6c39f7(sharedPreferences, "log_keep_time", f20381xee1144dc);
        f20381xee1144dc = m41724xce6c39f7;
        f20378x536a4b3f = f20380xe5c36952 * f20379xea2110a * m41724xce6c39f7;
        java.lang.String.format(java.util.Locale.CHINA, "final config: max log size: %d MB, max log num: %d, max keep %d DAYS", java.lang.Integer.valueOf(f20380xe5c36952), java.lang.Integer.valueOf(f20379xea2110a), java.lang.Integer.valueOf(f20381xee1144dc));
    }

    /* renamed from: deleteOldFileToday */
    public static void m41723x70a9e609(java.lang.String str, int i17) {
        java.util.ArrayList<java.io.File> m41729xf27bcf09 = m41729xf27bcf09(str, m41731x7534458b() + "_");
        int size = m41729xf27bcf09.size();
        if (size < i17 || i17 <= 0) {
            return;
        }
        for (int i18 = 0; i18 < size; i18++) {
            java.io.File file = m41729xf27bcf09.get(i18);
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
