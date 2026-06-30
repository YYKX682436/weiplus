package com.tencent.mm.plugin.appbrand.jsapi.video;

/* loaded from: classes13.dex */
public class AppBrandVideoDownLoadMgr {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f83521a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f83522b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f83523c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoDownLoadMgr f83524d;

    /* renamed from: e, reason: collision with root package name */
    public static final kq.r f83525e;

    static {
        ov1.c cVar;
        f83524d = null;
        f83525e = null;
        f83524d = new com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoDownLoadMgr();
        java.lang.String D = lp0.b.D();
        if (!D.endsWith("/")) {
            D = D.concat("/");
        }
        f83521a = D + "wagamefiles/";
        ((ux.a) ((vx.e) i95.n0.c(vx.e.class))).getClass();
        synchronized (ov1.c.class) {
            if (ov1.c.f349164c == null) {
                ov1.c.f349164c = new ov1.c();
            }
            hv1.d.f();
            cVar = ov1.c.f349164c;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("XWalkLib SetFileDownloaderProxy:");
        sb6.append(cVar == null);
        com.tencent.mars.xlog.Log.i("WXFileDownloaderBridge", sb6.toString());
        kq.r.f311227b = cVar;
        kq.r rVar = new kq.r();
        f83525e = rVar;
        rVar.f311228a = new oe1.b();
    }

    private java.lang.String genAdFileExist(java.lang.String str, oe1.a aVar) {
        java.lang.String str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(aVar.f344688a)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genAdFileExist error source or videoUrl = %s", aVar.f344688a);
            return null;
        }
        java.lang.String d17 = d(aVar.f344688a);
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genAdFileExist error urlFileMd5 = %s or videoUrl = %s", d17, aVar.f344688a);
            return null;
        }
        java.util.HashMap hashMap = f83522b;
        synchronized (hashMap) {
            str2 = hashMap.containsKey(d17) ? (java.lang.String) hashMap.get(d17) : null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return "downloading";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f83521a + str + "/");
        sb6.append(d17);
        sb6.append(".gad");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(sb7);
        java.lang.String str3 = a17.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(a17.toString());
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false) || (!d17.startsWith("unverify") && (p17 == null || !p17.equalsIgnoreCase(d17)))) {
            return null;
        }
        aVar.f344690c = 0L;
        aVar.f344691d = cm.a.DownLoaded;
        return sb7;
    }

    private java.lang.String genAdFilePath(java.lang.String str, oe1.a aVar) {
        java.lang.String str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(aVar.f344688a)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genAdFilePath error source or videoUrl = %s", aVar.f344688a);
            return null;
        }
        java.lang.String d17 = d(aVar.f344688a);
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genAdFilePath error urlFileMd5 = %s or videoUrl = %s", d17, aVar.f344688a);
            return null;
        }
        java.util.HashMap hashMap = f83522b;
        synchronized (hashMap) {
            str2 = hashMap.containsKey(d17) ? (java.lang.String) hashMap.get(d17) : null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return null;
        }
        aVar.f344689b = android.os.SystemClock.elapsedRealtime();
        aVar.f344691d = cm.a.DownLoading;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str3 = f83521a + str + "/";
        com.tencent.mm.vfs.w6.u(str3);
        try {
            com.tencent.mm.vfs.w6.e(str3 + ".nomedia");
        } catch (java.lang.Exception unused) {
        }
        sb6.append(str3);
        sb6.append(d17);
        sb6.append(".gad");
        java.lang.String sb7 = sb6.toString();
        java.util.HashMap hashMap2 = f83522b;
        synchronized (hashMap2) {
            hashMap2.put(d17, sb7);
        }
        return sb7;
    }

    public java.lang.String a(java.lang.String str) {
        oe1.a aVar = new oe1.a();
        aVar.f344688a = str;
        aVar.f344692e = null;
        java.lang.String genAdFileExist = genAdFileExist("gamead", aVar);
        if (com.tencent.mm.sdk.platformtools.t8.K0(genAdFileExist) || genAdFileExist.equalsIgnoreCase("downloading")) {
            return null;
        }
        return genAdFileExist;
    }

    public int b(java.lang.String str, oe1.d1 d1Var) {
        if (str == null || com.tencent.mm.sdk.platformtools.t8.K0(str) || d1Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genPreLoad illegal url or preLoadCallback");
            return -1;
        }
        oe1.a aVar = new oe1.a();
        aVar.f344688a = str;
        aVar.f344692e = d1Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genPreLoad  videoUrl = %s, preLoadVideoStat = %s", str, str);
        java.lang.String genAdFileExist = genAdFileExist("gamead", aVar);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(genAdFileExist);
        java.util.Map map = f83523c;
        if (K0) {
            java.lang.String genAdFilePath = genAdFilePath("gamead", aVar);
            if (com.tencent.mm.sdk.platformtools.t8.K0(genAdFilePath)) {
                return -4;
            }
            java.lang.String str2 = aVar.f344688a;
            kq.r rVar = f83525e;
            rVar.getClass();
            kq.o oVar = kq.r.f311227b;
            int a17 = oVar != null ? oVar.a(str2, genAdFilePath, 0, rVar) : -1;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad downloadVideo path=%s, ret=%d", genAdFilePath, java.lang.Integer.valueOf(a17));
            if (a17 != 0) {
                return -3;
            }
            ((java.util.concurrent.ConcurrentHashMap) map).put(aVar.f344688a, aVar);
        } else {
            if (genAdFileExist.equalsIgnoreCase("downloading")) {
                return -2;
            }
            ((java.util.concurrent.ConcurrentHashMap) map).put(aVar.f344688a, aVar);
            c(aVar.f344688a, true);
            ((com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.f) aVar.f344692e).a(aVar.f344688a, genAdFileExist);
        }
        return 0;
    }

    public final void c(java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.lang.String d17 = d(str);
        java.util.HashMap hashMap = f83522b;
        synchronized (hashMap) {
            if (hashMap.containsKey(d17)) {
                hashMap.remove(d17);
            }
        }
        oe1.a aVar = (oe1.a) ((java.util.concurrent.ConcurrentHashMap) f83523c).get(str);
        if (aVar != null) {
            if (aVar.f344688a.equalsIgnoreCase(str)) {
                long j17 = aVar.f344689b;
                if (j17 > 0) {
                    aVar.f344690c = android.os.SystemClock.elapsedRealtime() - j17;
                }
            }
            if (z17) {
                aVar.f344691d = cm.a.DownLoaded;
            } else {
                aVar.f344691d = cm.a.DownLoadFail;
            }
        }
    }

    public final java.lang.String d(java.lang.String str) {
        try {
            android.net.Uri parse = android.net.Uri.parse(str);
            if (parse.getHost().equalsIgnoreCase("wxsnsdy.wxs.qq.com")) {
                str = parse.getQueryParameter("m");
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unverify");
                char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
                sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
                str = sb6.toString();
            }
            return str;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", e17, "leonlad:getUrlFileMd5 failed videoUrl:%s", str);
            return null;
        }
    }
}
