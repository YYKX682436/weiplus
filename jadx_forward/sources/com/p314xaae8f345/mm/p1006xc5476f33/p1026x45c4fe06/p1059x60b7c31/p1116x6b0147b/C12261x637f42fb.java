package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoDownLoadMgr */
/* loaded from: classes13.dex */
public class C12261x637f42fb {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f165054a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f165055b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f165056c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12261x637f42fb f165057d;

    /* renamed from: e, reason: collision with root package name */
    public static final kq.r f165058e;

    static {
        ov1.c cVar;
        f165057d = null;
        f165058e = null;
        f165057d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12261x637f42fb();
        java.lang.String D = lp0.b.D();
        if (!D.endsWith("/")) {
            D = D.concat("/");
        }
        f165054a = D + "wagamefiles/";
        ((ux.a) ((vx.e) i95.n0.c(vx.e.class))).getClass();
        synchronized (ov1.c.class) {
            if (ov1.c.f430697c == null) {
                ov1.c.f430697c = new ov1.c();
            }
            hv1.d.f();
            cVar = ov1.c.f430697c;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("XWalkLib SetFileDownloaderProxy:");
        sb6.append(cVar == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WXFileDownloaderBridge", sb6.toString());
        kq.r.f392760b = cVar;
        kq.r rVar = new kq.r();
        f165058e = rVar;
        rVar.f392761a = new oe1.b();
    }

    /* renamed from: genAdFileExist */
    private java.lang.String m51327xaa950488(java.lang.String str, oe1.a aVar) {
        java.lang.String str2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f426221a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genAdFileExist error source or videoUrl = %s", aVar.f426221a);
            return null;
        }
        java.lang.String d17 = d(aVar.f426221a);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genAdFileExist error urlFileMd5 = %s or videoUrl = %s", d17, aVar.f426221a);
            return null;
        }
        java.util.HashMap hashMap = f165055b;
        synchronized (hashMap) {
            str2 = hashMap.containsKey(d17) ? (java.lang.String) hashMap.get(d17) : null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return "downloading";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f165054a + str + "/");
        sb6.append(d17);
        sb6.append(".gad");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(sb7);
        java.lang.String str3 = a17.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(a17.m82499x9616526c());
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false) || (!d17.startsWith("unverify") && (p17 == null || !p17.equalsIgnoreCase(d17)))) {
            return null;
        }
        aVar.f426223c = 0L;
        aVar.f426224d = cm.a.DownLoaded;
        return sb7;
    }

    /* renamed from: genAdFilePath */
    private java.lang.String m51328xc374d474(java.lang.String str, oe1.a aVar) {
        java.lang.String str2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f426221a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genAdFilePath error source or videoUrl = %s", aVar.f426221a);
            return null;
        }
        java.lang.String d17 = d(aVar.f426221a);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genAdFilePath error urlFileMd5 = %s or videoUrl = %s", d17, aVar.f426221a);
            return null;
        }
        java.util.HashMap hashMap = f165055b;
        synchronized (hashMap) {
            str2 = hashMap.containsKey(d17) ? (java.lang.String) hashMap.get(d17) : null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return null;
        }
        aVar.f426222b = android.os.SystemClock.elapsedRealtime();
        aVar.f426224d = cm.a.DownLoading;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str3 = f165054a + str + "/";
        com.p314xaae8f345.mm.vfs.w6.u(str3);
        try {
            com.p314xaae8f345.mm.vfs.w6.e(str3 + ".nomedia");
        } catch (java.lang.Exception unused) {
        }
        sb6.append(str3);
        sb6.append(d17);
        sb6.append(".gad");
        java.lang.String sb7 = sb6.toString();
        java.util.HashMap hashMap2 = f165055b;
        synchronized (hashMap2) {
            hashMap2.put(d17, sb7);
        }
        return sb7;
    }

    public java.lang.String a(java.lang.String str) {
        oe1.a aVar = new oe1.a();
        aVar.f426221a = str;
        aVar.f426225e = null;
        java.lang.String m51327xaa950488 = m51327xaa950488("gamead", aVar);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m51327xaa950488) || m51327xaa950488.equalsIgnoreCase("downloading")) {
            return null;
        }
        return m51327xaa950488;
    }

    public int b(java.lang.String str, oe1.d1 d1Var) {
        if (str == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || d1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genPreLoad illegal url or preLoadCallback");
            return -1;
        }
        oe1.a aVar = new oe1.a();
        aVar.f426221a = str;
        aVar.f426225e = d1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genPreLoad  videoUrl = %s, preLoadVideoStat = %s", str, str);
        java.lang.String m51327xaa950488 = m51327xaa950488("gamead", aVar);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m51327xaa950488);
        java.util.Map map = f165056c;
        if (K0) {
            java.lang.String m51328xc374d474 = m51328xc374d474("gamead", aVar);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m51328xc374d474)) {
                return -4;
            }
            java.lang.String str2 = aVar.f426221a;
            kq.r rVar = f165058e;
            rVar.getClass();
            kq.o oVar = kq.r.f392760b;
            int a17 = oVar != null ? oVar.a(str2, m51328xc374d474, 0, rVar) : -1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad downloadVideo path=%s, ret=%d", m51328xc374d474, java.lang.Integer.valueOf(a17));
            if (a17 != 0) {
                return -3;
            }
            ((java.util.concurrent.ConcurrentHashMap) map).put(aVar.f426221a, aVar);
        } else {
            if (m51327xaa950488.equalsIgnoreCase("downloading")) {
                return -2;
            }
            ((java.util.concurrent.ConcurrentHashMap) map).put(aVar.f426221a, aVar);
            c(aVar.f426221a, true);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.f) aVar.f426225e).a(aVar.f426221a, m51327xaa950488);
        }
        return 0;
    }

    public final void c(java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.lang.String d17 = d(str);
        java.util.HashMap hashMap = f165055b;
        synchronized (hashMap) {
            if (hashMap.containsKey(d17)) {
                hashMap.remove(d17);
            }
        }
        oe1.a aVar = (oe1.a) ((java.util.concurrent.ConcurrentHashMap) f165056c).get(str);
        if (aVar != null) {
            if (aVar.f426221a.equalsIgnoreCase(str)) {
                long j17 = aVar.f426222b;
                if (j17 > 0) {
                    aVar.f426223c = android.os.SystemClock.elapsedRealtime() - j17;
                }
            }
            if (z17) {
                aVar.f426224d = cm.a.DownLoaded;
            } else {
                aVar.f426224d = cm.a.DownLoadFail;
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
                char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
                str = sb6.toString();
            }
            return str;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", e17, "leonlad:getUrlFileMd5 failed videoUrl:%s", str);
            return null;
        }
    }
}
