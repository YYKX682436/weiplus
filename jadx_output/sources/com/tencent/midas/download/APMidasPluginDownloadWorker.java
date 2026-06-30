package com.tencent.midas.download;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public class APMidasPluginDownloadWorker implements java.lang.Runnable {
    private static final java.lang.String TAG = "PluginDownloadWorker";
    private final android.content.Context context;
    private final java.util.ArrayList<com.tencent.midas.download.APMidasPluginDownInfo> downInfos;
    private final com.tencent.midas.download.IAPMidasPluginDownListener downListener;
    private final java.io.File saveDir;

    public APMidasPluginDownloadWorker(android.content.Context context, java.util.ArrayList<com.tencent.midas.download.APMidasPluginDownInfo> arrayList, java.io.File file, com.tencent.midas.download.IAPMidasPluginDownListener iAPMidasPluginDownListener) {
        this.downInfos = arrayList;
        this.saveDir = file;
        this.downListener = iAPMidasPluginDownListener;
        this.context = context;
    }

    private static void closeQuietly(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    private boolean downloadSingleDownInfo(com.tencent.midas.download.APMidasPluginDownInfo aPMidasPluginDownInfo) {
        java.lang.String str;
        java.io.FileOutputStream fileOutputStream;
        if (aPMidasPluginDownInfo == null) {
            com.tencent.midas.comm.APLog.e(TAG, "Cannot download down info, info is null!");
            return false;
        }
        if (android.text.TextUtils.isEmpty(aPMidasPluginDownInfo.full_url)) {
            com.tencent.midas.comm.APLog.e(TAG, "Cannot download down info, info's url is empty!");
            return false;
        }
        if (android.text.TextUtils.isEmpty(aPMidasPluginDownInfo.name)) {
            com.tencent.midas.comm.APLog.e(TAG, "Cannot download down info, info's name is empty!");
            return false;
        }
        if (aPMidasPluginDownInfo.name.endsWith(".apk") || aPMidasPluginDownInfo.name.endsWith(".Apk") || aPMidasPluginDownInfo.name.endsWith(".APK")) {
            str = aPMidasPluginDownInfo.name;
        } else {
            str = aPMidasPluginDownInfo.name + ".apk";
        }
        if (isPluginAlreadyExist(this.context, str, aPMidasPluginDownInfo.new_md5_decode, this.saveDir.getAbsolutePath())) {
            com.tencent.midas.comm.APLog.d(TAG, "plugin already test, no need to download! name = " + str);
            return true;
        }
        java.lang.String str2 = aPMidasPluginDownInfo.full_url;
        com.tencent.midas.comm.APLog.d(TAG, "download single down info! Start to down url = " + str2);
        com.tencent.midas.comm.APLog.d(TAG, "download single down info! Start to down file name = " + str);
        java.io.File file = new java.io.File(this.saveDir, str);
        if (file.exists()) {
            if (!file.delete()) {
                com.tencent.midas.comm.APLog.e(TAG, "File already exist test, cannot delete old file, file = " + file.getAbsolutePath());
                return false;
            }
            com.tencent.midas.comm.APLog.w(TAG, "download single down info! file name already exist, delete it successfully = " + file.getAbsolutePath());
        }
        java.io.InputStream inputStream = null;
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str2).openConnection();
            httpURLConnection.setConnectTimeout(45000);
            httpURLConnection.setReadTimeout(45000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                com.tencent.midas.comm.APLog.e(TAG, "Cannot download file, http code not 200! Code = " + responseCode);
                closeQuietly(null);
                closeQuietly(null);
                return false;
            }
            if (!file.createNewFile()) {
                com.tencent.midas.comm.APLog.e(TAG, "Cannot download file, fail to create file! File = " + file.getAbsolutePath());
                closeQuietly(null);
                closeQuietly(null);
                return false;
            }
            fileOutputStream = new java.io.FileOutputStream(file);
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            fileOutputStream.flush();
                            closeQuietly(inputStream);
                            closeQuietly(fileOutputStream);
                            com.tencent.midas.comm.APLog.d(TAG, "download single down info success! File name = " + str + " About to copy to sdcard!");
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } catch (java.lang.Exception unused) {
                    com.tencent.midas.comm.APLog.e(TAG, "download single down info fail! File name = " + str);
                    closeQuietly(inputStream);
                    closeQuietly(fileOutputStream);
                    return false;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                closeQuietly(inputStream);
                closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (java.lang.Exception unused2) {
            fileOutputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            fileOutputStream = null;
            closeQuietly(inputStream);
            closeQuietly(fileOutputStream);
            throw th;
        }
    }

    private static boolean isPluginAlreadyExist(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.midas.comm.APLog.d(TAG, "plugin already exist in midasplugins test, file name = " + str);
        com.tencent.midas.comm.APLog.d(TAG, "plugin already exist in midasplugins test, md5 = " + str2);
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.midas.comm.APLog.e(TAG, "plugin already exist in midasplugins test error, empty file name!");
            return false;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.midas.comm.APLog.e(TAG, "plugin already exist in midasplugins test error, empty md5!");
            return false;
        }
        if (context == null) {
            com.tencent.midas.comm.APLog.e(TAG, "plugin already exist in midasplugins test error, null context!");
            return false;
        }
        if (android.text.TextUtils.isEmpty(str3)) {
            com.tencent.midas.comm.APLog.e(TAG, "plugin already exist in midasplugins test error, empty saveDir!");
            return false;
        }
        java.io.File pluginPath = com.tencent.midas.plugin.APPluginConfig.getPluginPath(context);
        if (pluginPath == null) {
            com.tencent.midas.comm.APLog.e(TAG, "plugin already exist in midasplugins error, cannot get plugin path!");
            return false;
        }
        java.io.File file = new java.io.File(pluginPath, str);
        if (!file.exists()) {
            com.tencent.midas.comm.APLog.d(TAG, "plugin already exist in midasplugins test, plugin not exist! Name = " + str);
            return false;
        }
        try {
            if (com.tencent.midas.plugin.APPluginUtils.checkFileMD5(file.getCanonicalPath(), str2)) {
                com.tencent.midas.comm.APLog.d(TAG, "plugin already exist in midasplugins test, plugin exist & md5 correct!");
                if (com.tencent.midas.plugin.APPluginUtils.copyFile(file.getCanonicalPath(), str3, str)) {
                    com.tencent.midas.comm.APLog.d(TAG, "plugin already exist in midasplugins test, plugin exist & md5 correct & copy success!");
                    return true;
                }
                com.tencent.midas.comm.APLog.e(TAG, "plugin already exist in midasplugins test, plugin exist & md5 correct & copy fail!");
            } else {
                com.tencent.midas.comm.APLog.d(TAG, "plugin already exist in midasplugins test, plugin exist & md5 not correct!");
            }
        } catch (java.io.IOException e17) {
            com.tencent.midas.comm.APLog.d(TAG, "plugin already exist in midasplugins test error, exception = " + e17);
        }
        com.tencent.midas.comm.APLog.e(TAG, "plugin already exist in midasplugins test, final false!");
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.midas.comm.APLog.d(TAG, "About to enter critical region！");
        synchronized (com.tencent.midas.download.APMidasPluginDownloadWorker.class) {
            com.tencent.midas.comm.APLog.d(TAG, "Enter critical region！");
            if (this.downListener == null) {
                com.tencent.midas.comm.APLog.e(TAG, "Cannot start plugin down worker, null downListener!");
                return;
            }
            java.util.ArrayList<com.tencent.midas.download.APMidasPluginDownInfo> arrayList = this.downInfos;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.context == null) {
                    com.tencent.midas.comm.APLog.e(TAG, "Cannot start plugin down worker, null context!");
                    this.downListener.onDownloadFail(-8);
                    return;
                }
                java.io.File file = this.saveDir;
                if (file == null) {
                    com.tencent.midas.comm.APLog.e(TAG, "Cannot start plugin down worker, null save dir!");
                    this.downListener.onDownloadFail(-6);
                    return;
                }
                if (!file.isDirectory()) {
                    com.tencent.midas.comm.APLog.e(TAG, "Cannot start plugin down worker, save dir not directory!");
                    this.downListener.onDownloadFail(-7);
                    return;
                }
                if (com.tencent.midas.download.APMidasPluginDownloadUtils.checkIniFileExist(this.saveDir)) {
                    com.tencent.midas.comm.APLog.d(TAG, "MidasSign.ini already exists, no need to download again!");
                    this.downListener.onDownloadFail(-2);
                    return;
                }
                com.tencent.midas.comm.APLog.d(TAG, "MidasSign.ini not exists, start to download again!");
                com.tencent.midas.plugin.APPluginUtils.clearDirContent(this.saveDir);
                if (!this.saveDir.exists() && !this.saveDir.mkdirs()) {
                    com.tencent.midas.comm.APLog.e(TAG, "Cannot start plugin down worker, save dir not exist and cannot create it!");
                    this.downListener.onDownloadFail(-3);
                    return;
                }
                java.util.Iterator<com.tencent.midas.download.APMidasPluginDownInfo> it = this.downInfos.iterator();
                while (it.hasNext()) {
                    com.tencent.midas.download.APMidasPluginDownInfo next = it.next();
                    if (!downloadSingleDownInfo(next)) {
                        this.downListener.onDownloadFail(-4);
                        com.tencent.midas.comm.APLog.d(TAG, "File name = " + next.name + " download fail, about to clear download dir!");
                        com.tencent.midas.plugin.APPluginUtils.clearDirContent(this.saveDir);
                        return;
                    }
                }
                this.downListener.onDownloadSuccess();
                com.tencent.midas.comm.APLog.d(TAG, "About to leave critical region");
                com.tencent.midas.comm.APLog.d(TAG, "Leave critical region");
                return;
            }
            com.tencent.midas.comm.APLog.e(TAG, "Cannot start plugin down worker, empty down list!");
            this.downListener.onDownloadFail(-5);
        }
    }
}
