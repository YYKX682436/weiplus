package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2992x8fb0427b;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.storage.StorageManager */
/* loaded from: classes12.dex */
public class C26104xba5a80d2 {

    /* renamed from: PRIVATE_ROOT_DIR */
    private static final java.lang.String f49852x9f3dceec = "/tencentMapSdk/";

    /* renamed from: ROOT_DIR */
    private static final java.lang.String f49853x24c76f90 = "/tencentmapsdk/";

    /* renamed from: mInstance */
    private static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2992x8fb0427b.C26104xba5a80d2 f49854x46143c22;

    /* renamed from: mAppRootDir */
    private java.lang.String f49857x71f4e737;

    /* renamed from: mContext */
    private android.content.Context f49858xd6cfe882;

    /* renamed from: mCustomCacheRootPath */
    private java.lang.String f49859x7fed1c2b;

    /* renamed from: mPrivateFilePath */
    private java.lang.String f49860x87003637;

    /* renamed from: mPrivateFileRootPath */
    private java.lang.String f49861xaf9c9139;

    /* renamed from: mSharedPrefNames */
    private static java.lang.String[] f49856x1009e7d3 = {"com.tencent.tencentmap.mapsdk.maps.offlinemap", "txlbs_suid", "txlbs_duid", "Tencent_MapSDK_SUB_CONFIG"};

    /* renamed from: mPrivateFileNames */
    private static java.lang.String[] f49855x58ea4776 = {"frontiers.dat"};

    private C26104xba5a80d2(android.content.Context context, java.lang.String str) {
        if (context == null) {
            throw new java.lang.Error("context can not be null");
        }
        this.f49858xd6cfe882 = context.getApplicationContext();
        this.f49859x7fed1c2b = str;
        m100085x24fe9bd7();
        m100084x3193cbbf();
    }

    /* renamed from: clearMapCache */
    public static void m100078xdd1890f3(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f(m100081x9cf0d20b(context, str).m100086x62035321());
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f(m100081x9cf0d20b(context, str).m100087xadb63e18());
        for (java.lang.String str2 : f49855x58ea4776) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f(m100081x9cf0d20b(context, str).m100088x34ae4b7c(str2));
        }
        m100083xb51ae33(context);
    }

    /* renamed from: getAvailableStorageSize */
    private static long m100079x68a05309(java.lang.String str) {
        try {
            android.os.StatFs statFs = new android.os.StatFs(str);
            return ((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1024) / 1024;
        } catch (java.lang.Exception unused) {
            return 0L;
        }
    }

    /* renamed from: getExternalStoragePath */
    private static java.lang.String m100080x1ffcc93f(android.content.Context context) {
        java.io.File externalFilesDir = context.getExternalFilesDir(null);
        return externalFilesDir != null ? externalFilesDir.getAbsolutePath() : context.getFilesDir().getPath();
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2992x8fb0427b.C26104xba5a80d2 m100081x9cf0d20b(android.content.Context context, java.lang.String str) {
        if (f49854x46143c22 == null) {
            f49854x46143c22 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2992x8fb0427b.C26104xba5a80d2(context, str);
        }
        return f49854x46143c22;
    }

    /* renamed from: getStorageRootPath */
    private java.lang.String m100082x9f77e58c() {
        if (!android.text.TextUtils.isEmpty(this.f49859x7fed1c2b)) {
            return this.f49859x7fed1c2b;
        }
        android.content.Context context = this.f49858xd6cfe882;
        java.lang.String m100080x1ffcc93f = m100080x1ffcc93f(context);
        if (m100079x68a05309(m100080x1ffcc93f) >= 5) {
            return m100080x1ffcc93f;
        }
        java.lang.String path = context.getFilesDir().getPath();
        return m100079x68a05309(path) < 5 ? m100080x1ffcc93f(context) : path;
    }

    /* renamed from: removeAllPrefs */
    public static void m100083xb51ae33(android.content.Context context) {
        try {
            java.io.File[] listFiles = new java.io.File(context.getFilesDir().getParent() + java.io.File.separator + "shared_prefs").listFiles();
            if (listFiles == null) {
                return;
            }
            for (java.io.File file : listFiles) {
                for (java.lang.String str : f49856x1009e7d3) {
                    if (file.getName().startsWith(str)) {
                        file.delete();
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: updatePrivatePath */
    private void m100084x3193cbbf() {
        this.f49861xaf9c9139 = this.f49858xd6cfe882.getFilesDir().getAbsolutePath();
        this.f49860x87003637 = this.f49861xaf9c9139 + f49852x9f3dceec;
    }

    /* renamed from: updatePublicPath */
    private void m100085x24fe9bd7() {
        java.lang.String m100082x9f77e58c = m100082x9f77e58c();
        java.lang.String a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(this.f49858xd6cfe882);
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(a17)) {
            this.f49857x71f4e737 = m100082x9f77e58c + f49853x24c76f90;
            return;
        }
        this.f49857x71f4e737 = m100082x9f77e58c + f49853x24c76f90 + a17;
    }

    /* renamed from: getCacheDir */
    public java.io.File m100086x62035321() {
        return new java.io.File(this.f49857x71f4e737);
    }

    /* renamed from: getPrivateCacheDir */
    public java.io.File m100087xadb63e18() {
        return new java.io.File(this.f49860x87003637);
    }

    /* renamed from: getPrivateCacheFileName */
    public java.io.File m100088x34ae4b7c(java.lang.String str) {
        return new java.io.File(this.f49861xaf9c9139 + java.io.File.separator + str);
    }
}
