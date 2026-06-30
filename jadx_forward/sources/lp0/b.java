package lp0;

/* loaded from: classes12.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f401791a = {null};

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f401792b = {null};

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f401793c = {null};

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f401794d = {null};

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.r6[] f401795e = {null};

    public static synchronized java.lang.String A() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "Handler/";
        }
        return str;
    }

    public static synchronized java.lang.String B() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "MixAudio/";
        }
        return str;
    }

    public static synchronized java.lang.String C() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "newyear/";
        }
        return str;
    }

    public static synchronized java.lang.String D() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = e0() + "/MicroMsg/";
        }
        return str;
    }

    public static synchronized java.lang.String E() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "preloadedRes/";
        }
        return str;
    }

    public static synchronized java.lang.String F() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "recovery/";
        }
        return str;
    }

    public static synchronized java.lang.String G() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "share/";
        }
        return str;
    }

    public static synchronized java.lang.String H() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = G() + "upload_cache/";
        }
        return str;
    }

    public static synchronized java.lang.String I() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "SQLTrace/";
        }
        return str;
    }

    public static synchronized java.lang.String J() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "temp_video_cache";
        }
        return str;
    }

    public static synchronized java.lang.String K() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = ((java.lang.String) b0().f404625a) + "/image/";
        }
        return str;
    }

    public static synchronized java.lang.String L() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "tracedog/";
        }
        return str;
    }

    public static synchronized java.lang.String M() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "vproxy/";
        }
        return str;
    }

    public static synchronized java.lang.String N() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "vusericon/";
        }
        return str;
    }

    public static synchronized java.lang.String O() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "wagamefiles/";
        }
        return str;
    }

    public static synchronized java.lang.String P() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "wallet/";
        }
        return str;
    }

    public static synchronized java.lang.String Q() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "WebviewCache/";
        }
        return str;
    }

    public static synchronized java.lang.String R() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "wepkg/";
        }
        return str;
    }

    public static synchronized java.lang.String S() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "wxacache/";
        }
        return str;
    }

    public static synchronized java.lang.String T() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "wxafiles/";
        }
        return str;
    }

    public static synchronized java.lang.String U() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "wxanewfiles/";
        }
        return str;
    }

    public static synchronized java.lang.String V() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "wxvideocache/";
        }
        return str;
    }

    public static synchronized java.lang.String W() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "wxvideotmp/";
        }
        return str;
    }

    public static synchronized java.lang.String X() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            java.lang.String[] strArr = f401791a;
            if (strArr[0] == null) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                if (context == null) {
                    throw new java.lang.RuntimeException("MMApplicationContext not initialized.");
                }
                strArr[0] = context.getFilesDir().getParentFile().getAbsolutePath() + "/";
            }
            str = strArr[0];
        }
        return str;
    }

    public static synchronized java.lang.String Y() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            java.lang.String[] strArr = f401793c;
            if (strArr[0] == null) {
                strArr[0] = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.r() ? "/sdcard" : android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
            }
            str = strArr[0];
        }
        return str;
    }

    public static synchronized java.lang.String Z(boolean z17) {
        java.io.File file;
        java.lang.String str;
        synchronized (lp0.b.class) {
            java.io.File externalStoragePublicDirectory = android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_PICTURES);
            if (externalStoragePublicDirectory != null) {
                file = new java.io.File(externalStoragePublicDirectory, c0());
                if (z17 && !file.isDirectory()) {
                    file.mkdirs();
                }
            } else {
                java.io.File file2 = new java.io.File(d0(), "Pictures/".concat(c0()));
                file = (file2.exists() || !z17 || file2.mkdirs()) ? file2 : new java.io.File(b());
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get camera path by");
            sb6.append(externalStoragePublicDirectory != null ? " Environment: " : " Context: ");
            sb6.append(file.getAbsolutePath());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CConstants", sb6.toString());
            try {
                java.lang.String canonicalPath = file.getCanonicalPath();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CConstants", "canonical=" + canonicalPath);
                str = canonicalPath + "/";
            } catch (java.lang.Throwable unused) {
                return file.getAbsolutePath() + "/";
            }
        }
        return str;
    }

    public static synchronized java.lang.String a() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "crash/";
        }
        return str;
    }

    public static synchronized java.lang.String a0() {
        java.io.File file;
        java.lang.String str;
        synchronized (lp0.b.class) {
            java.io.File externalStoragePublicDirectory = android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DCIM);
            if (externalStoragePublicDirectory != null) {
                file = new java.io.File(externalStoragePublicDirectory, c0());
            } else {
                java.io.File file2 = new java.io.File(d0(), "DCIM/".concat(c0()));
                file = (file2.exists() || file2.mkdirs()) ? file2 : new java.io.File(b());
            }
            try {
                str = file.getCanonicalPath() + "/";
            } catch (java.lang.Throwable unused) {
                return file.getAbsolutePath() + "/";
            }
        }
        return str;
    }

    public static synchronized java.lang.String b() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = Y() + "/tencent/MicroMsg/" + c0();
        }
        return str;
    }

    public static synchronized m3.d b0() {
        java.io.File file;
        m3.d dVar;
        java.io.File file2;
        synchronized (lp0.b.class) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (context == null) {
                throw new java.lang.RuntimeException("MMApplicationContext not initialized.");
            }
            try {
                file = context.getExternalCacheDir();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CConstants", "getExternalCacheDir err: " + th6.getMessage());
                ((hr0.q0) ((lp0.g) i95.n0.c(lp0.g.class))).wi(th6);
                file = null;
            }
            if (file == null) {
                throw new java.lang.IllegalStateException("getExternalCacheDir null");
            }
            if (!file.exists() && !file.mkdirs()) {
                throw new java.lang.IllegalStateException("getExternalCacheDir not exists");
            }
            ((hr0.q0) ((lp0.g) i95.n0.c(lp0.g.class))).Ai();
            boolean z17 = false;
            if (file == null) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.r()) {
                    file2 = android.os.Environment.getExternalStorageDirectory();
                    if (file2 == null) {
                        file2 = new java.io.File("/sdcard/");
                    }
                } else {
                    file2 = new java.io.File("/sdcard/");
                    z17 = true;
                }
                java.io.File file3 = new java.io.File(file2, "Android/data/" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + "/cache");
                if (!file3.exists()) {
                    file3.mkdirs();
                }
                file = file3;
            }
            try {
                dVar = new m3.d(file.getCanonicalPath(), java.lang.Boolean.valueOf(z17));
            } catch (java.lang.Throwable unused) {
                return new m3.d(file.getAbsolutePath(), java.lang.Boolean.valueOf(z17));
            }
        }
        return dVar;
    }

    public static synchronized java.lang.String c() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = Y() + "/tencent/MicroMsg/";
        }
        return str;
    }

    public static synchronized java.lang.String c0() {
        synchronized (lp0.b.class) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.z8 z8Var = yp5.a.f545942a;
            java.lang.String str2 = e() + ".camdir.use.WeChat/";
            java.lang.String str3 = e() + ".camdir.use.WeiXin/";
            if (new java.io.File(str2).exists()) {
                return "WeChat/";
            }
            if (new java.io.File(str3).exists()) {
                return "WeiXin/";
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("zh_CN")) {
                try {
                    new java.io.File(str3).createNewFile();
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CConstants", th6, "[-] Fail to create weixin camera dir marker.", new java.lang.Object[0]);
                }
                return "WeiXin/";
            }
            try {
                new java.io.File(str2).createNewFile();
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CConstants", th7, "[-] Fail to create wechat camera dir marker.", new java.lang.Object[0]);
            }
            return "WeChat/";
        }
    }

    public static synchronized java.lang.String d() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = e() + "appbrand_pkgs_temp_download_cache/";
        }
        return str;
    }

    public static synchronized java.lang.String d0() {
        java.lang.String absolutePath;
        synchronized (lp0.b.class) {
            java.lang.String str = f401794d[0];
            if (str != null) {
                return str;
            }
            m3.d b07 = b0();
            java.lang.String str2 = (java.lang.String) b07.f404625a;
            java.lang.Boolean bool = (java.lang.Boolean) b07.f404626b;
            java.io.File parentFile = new java.io.File(str2).getParentFile();
            try {
                absolutePath = parentFile.getCanonicalPath();
            } catch (java.lang.Throwable unused) {
                absolutePath = parentFile.getAbsolutePath();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.r() || !bool.booleanValue()) {
                f401794d[0] = absolutePath;
                java.lang.String[] strArr = f401792b;
                if (strArr[0] == null) {
                    strArr[0] = absolutePath;
                }
            }
            return absolutePath;
        }
    }

    public static synchronized java.lang.String e() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = X() + "MicroMsg/";
            try {
                java.io.File file = new java.io.File(str);
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return str;
    }

    public static synchronized java.lang.String e0() {
        synchronized (lp0.b.class) {
            java.lang.String str = f401792b[0];
            if (str != null) {
                return str;
            }
            return d0();
        }
    }

    public static synchronized java.lang.String f() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = e() + "appbrand/srcache/";
        }
        return str;
    }

    public static synchronized java.lang.String f0() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "watchdog/";
        }
        return str;
    }

    public static synchronized java.lang.String g() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = e() + "appbrand/pkg/";
        }
        return str;
    }

    public static synchronized java.lang.String g0() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "xlog";
        }
        return str;
    }

    public static synchronized java.lang.String h() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = X() + "files/public/";
        }
        return str;
    }

    public static com.p314xaae8f345.mm.vfs.r6 h0(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6[] r6VarArr = f401795e;
        if (r6VarArr[0] == null) {
            synchronized (r6VarArr) {
                if (r6VarArr[0] == null) {
                    r6VarArr[0] = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.r6.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir()), "temp");
                }
            }
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = r6VarArr[0];
        if (str != null) {
            r6Var = new com.p314xaae8f345.mm.vfs.r6(r6Var, str);
        }
        r6Var.J();
        return r6Var;
    }

    public static synchronized java.lang.String i() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "appbrand/";
        }
        return str;
    }

    public static synchronized java.lang.String j() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "avatar/";
        }
        return str;
    }

    public static synchronized java.lang.String k() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "browser/";
        }
        return str;
    }

    public static synchronized java.lang.String l() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "Cache/";
        }
        return str;
    }

    public static synchronized java.lang.String m() {
        java.lang.String Z;
        synchronized (lp0.b.class) {
            if (e0().equals(d0())) {
                synchronized (lp0.b.class) {
                    Z = Z(true);
                }
                return Z;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CConstants", "use legacy sdcard camera path");
            return b();
        }
    }

    public static synchronized java.lang.String n() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "card/";
        }
        return str;
    }

    public static synchronized java.lang.String o() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "CDNTemp/";
        }
        return str;
    }

    public static synchronized java.lang.String p() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "CheckResUpdate/";
        }
        return str;
    }

    public static synchronized java.lang.String q() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "crash/";
        }
        return str;
    }

    public static synchronized java.lang.String r() {
        synchronized (lp0.b.class) {
            if (e0().equals(d0())) {
                return a0();
            }
            return b();
        }
    }

    public static synchronized java.lang.String s() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "diskcache/";
        }
        return str;
    }

    public static synchronized java.lang.String t() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "Download/";
        }
        return str;
    }

    public static synchronized java.lang.String u() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "egg_spring/";
        }
        return str;
    }

    public static synchronized java.lang.String v() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "exdevice/";
        }
        return str;
    }

    public static synchronized java.lang.String w() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "FailMsgFileCache/";
        }
        return str;
    }

    public static synchronized java.lang.String x() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "favoffline/";
        }
        return str;
    }

    public static synchronized java.lang.String y() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "fts/";
        }
        return str;
    }

    public static synchronized java.lang.String z() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = D() + "Game/";
        }
        return str;
    }
}
