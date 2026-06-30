package com.p314xaae8f345.p592x631407a.p602x551ac888;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.midas.download.APMidasPluginDownloadWorker */
/* loaded from: classes13.dex */
public class RunnableC4790x6142b664 implements java.lang.Runnable {
    private static final java.lang.String TAG = "PluginDownloadWorker";

    /* renamed from: context */
    private final android.content.Context f20670x38b735af;

    /* renamed from: downInfos */
    private final java.util.ArrayList<com.p314xaae8f345.p592x631407a.p602x551ac888.C4787x4ae5972e> f20671x4c50b203;

    /* renamed from: downListener */
    private final com.p314xaae8f345.p592x631407a.p602x551ac888.InterfaceC4791x6f8c6b0b f20672x28308b76;

    /* renamed from: saveDir */
    private final java.io.File f20673x6fa07dd0;

    public RunnableC4790x6142b664(android.content.Context context, java.util.ArrayList<com.p314xaae8f345.p592x631407a.p602x551ac888.C4787x4ae5972e> arrayList, java.io.File file, com.p314xaae8f345.p592x631407a.p602x551ac888.InterfaceC4791x6f8c6b0b interfaceC4791x6f8c6b0b) {
        this.f20671x4c50b203 = arrayList;
        this.f20673x6fa07dd0 = file;
        this.f20672x28308b76 = interfaceC4791x6f8c6b0b;
        this.f20670x38b735af = context;
    }

    /* renamed from: closeQuietly */
    private static void m41961xd71209a9(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    /* renamed from: downloadSingleDownInfo */
    private boolean m41962xb30d0380(com.p314xaae8f345.p592x631407a.p602x551ac888.C4787x4ae5972e c4787x4ae5972e) {
        java.lang.String str;
        java.io.FileOutputStream fileOutputStream;
        if (c4787x4ae5972e == null) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot download down info, info is null!");
            return false;
        }
        if (android.text.TextUtils.isEmpty(c4787x4ae5972e.f20652x4f5b37bf)) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot download down info, info's url is empty!");
            return false;
        }
        if (android.text.TextUtils.isEmpty(c4787x4ae5972e.f20656x337a8b)) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot download down info, info's name is empty!");
            return false;
        }
        if (c4787x4ae5972e.f20656x337a8b.endsWith(".apk") || c4787x4ae5972e.f20656x337a8b.endsWith(".Apk") || c4787x4ae5972e.f20656x337a8b.endsWith(".APK")) {
            str = c4787x4ae5972e.f20656x337a8b;
        } else {
            str = c4787x4ae5972e.f20656x337a8b + ".apk";
        }
        if (m41963x1e6c631c(this.f20670x38b735af, str, c4787x4ae5972e.f20657xbce1c7ce, this.f20673x6fa07dd0.getAbsolutePath())) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "plugin already test, no need to download! name = " + str);
            return true;
        }
        java.lang.String str2 = c4787x4ae5972e.f20652x4f5b37bf;
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "download single down info! Start to down url = " + str2);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "download single down info! Start to down file name = " + str);
        java.io.File file = new java.io.File(this.f20673x6fa07dd0, str);
        if (file.exists()) {
            if (!file.delete()) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "File already exist test, cannot delete old file, file = " + file.getAbsolutePath());
                return false;
            }
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w(TAG, "download single down info! file name already exist, delete it successfully = " + file.getAbsolutePath());
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
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot download file, http code not 200! Code = " + responseCode);
                m41961xd71209a9(null);
                m41961xd71209a9(null);
                return false;
            }
            if (!file.createNewFile()) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot download file, fail to create file! File = " + file.getAbsolutePath());
                m41961xd71209a9(null);
                m41961xd71209a9(null);
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
                            m41961xd71209a9(inputStream);
                            m41961xd71209a9(fileOutputStream);
                            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "download single down info success! File name = " + str + " About to copy to sdcard!");
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "download single down info fail! File name = " + str);
                    m41961xd71209a9(inputStream);
                    m41961xd71209a9(fileOutputStream);
                    return false;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                m41961xd71209a9(inputStream);
                m41961xd71209a9(fileOutputStream);
                throw th;
            }
        } catch (java.lang.Exception unused2) {
            fileOutputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            fileOutputStream = null;
            m41961xd71209a9(inputStream);
            m41961xd71209a9(fileOutputStream);
            throw th;
        }
    }

    /* renamed from: isPluginAlreadyExist */
    private static boolean m41963x1e6c631c(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "plugin already exist in midasplugins test, file name = " + str);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "plugin already exist in midasplugins test, md5 = " + str2);
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "plugin already exist in midasplugins test error, empty file name!");
            return false;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "plugin already exist in midasplugins test error, empty md5!");
            return false;
        }
        if (context == null) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "plugin already exist in midasplugins test error, null context!");
            return false;
        }
        if (android.text.TextUtils.isEmpty(str3)) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "plugin already exist in midasplugins test error, empty saveDir!");
            return false;
        }
        java.io.File m42077xd72d2dee = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.m42077xd72d2dee(context);
        if (m42077xd72d2dee == null) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "plugin already exist in midasplugins error, cannot get plugin path!");
            return false;
        }
        java.io.File file = new java.io.File(m42077xd72d2dee, str);
        if (!file.exists()) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "plugin already exist in midasplugins test, plugin not exist! Name = " + str);
            return false;
        }
        try {
            if (com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42138xc96bec5a(file.getCanonicalPath(), str2)) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "plugin already exist in midasplugins test, plugin exist & md5 correct!");
                if (com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42143xe1d15691(file.getCanonicalPath(), str3, str)) {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "plugin already exist in midasplugins test, plugin exist & md5 correct & copy success!");
                    return true;
                }
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "plugin already exist in midasplugins test, plugin exist & md5 correct & copy fail!");
            } else {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "plugin already exist in midasplugins test, plugin exist & md5 not correct!");
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "plugin already exist in midasplugins test error, exception = " + e17);
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "plugin already exist in midasplugins test, final false!");
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "About to enter critical region！");
        synchronized (com.p314xaae8f345.p592x631407a.p602x551ac888.RunnableC4790x6142b664.class) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Enter critical region！");
            if (this.f20672x28308b76 == null) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot start plugin down worker, null downListener!");
                return;
            }
            java.util.ArrayList<com.p314xaae8f345.p592x631407a.p602x551ac888.C4787x4ae5972e> arrayList = this.f20671x4c50b203;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f20670x38b735af == null) {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot start plugin down worker, null context!");
                    this.f20672x28308b76.mo41959xb7571b45(-8);
                    return;
                }
                java.io.File file = this.f20673x6fa07dd0;
                if (file == null) {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot start plugin down worker, null save dir!");
                    this.f20672x28308b76.mo41959xb7571b45(-6);
                    return;
                }
                if (!file.isDirectory()) {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot start plugin down worker, save dir not directory!");
                    this.f20672x28308b76.mo41959xb7571b45(-7);
                    return;
                }
                if (com.p314xaae8f345.p592x631407a.p602x551ac888.C4789x4d5bb90b.m41953xd7a9a87f(this.f20673x6fa07dd0)) {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "MidasSign.ini already exists, no need to download again!");
                    this.f20672x28308b76.mo41959xb7571b45(-2);
                    return;
                }
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "MidasSign.ini not exists, start to download again!");
                com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42139xed0d5559(this.f20673x6fa07dd0);
                if (!this.f20673x6fa07dd0.exists() && !this.f20673x6fa07dd0.mkdirs()) {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot start plugin down worker, save dir not exist and cannot create it!");
                    this.f20672x28308b76.mo41959xb7571b45(-3);
                    return;
                }
                java.util.Iterator<com.p314xaae8f345.p592x631407a.p602x551ac888.C4787x4ae5972e> it = this.f20671x4c50b203.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.p592x631407a.p602x551ac888.C4787x4ae5972e next = it.next();
                    if (!m41962xb30d0380(next)) {
                        this.f20672x28308b76.mo41959xb7571b45(-4);
                        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "File name = " + next.f20656x337a8b + " download fail, about to clear download dir!");
                        com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42139xed0d5559(this.f20673x6fa07dd0);
                        return;
                    }
                }
                this.f20672x28308b76.mo41960x5329367c();
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "About to leave critical region");
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Leave critical region");
                return;
            }
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot start plugin down worker, empty down list!");
            this.f20672x28308b76.mo41959xb7571b45(-5);
        }
    }
}
