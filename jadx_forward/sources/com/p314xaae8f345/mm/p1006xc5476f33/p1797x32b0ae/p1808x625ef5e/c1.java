package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public enum c1 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f225446d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f225447e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f225448f = new java.util.concurrent.ConcurrentHashMap();

    c1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.w0 w0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.w0(this);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().a(w0Var);
    }

    public static int h(java.lang.String str, java.lang.String str2) {
        return com.p314xaae8f345.mm.vfs.w6.Q(str, str2);
    }

    public final void a(java.lang.String str, int i17, oq1.c cVar) {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        if (i17 > 0) {
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                byte[] bArr = new byte[i17];
                com.p314xaae8f345.mm.vfs.w6.D(a17, com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17)).read(bArr);
                com.p314xaae8f345.mm.vfs.w6.K(str, false).write(com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121956xbad2fdf6(bArr, cVar.f428865c, cVar.f428864b, cVar.f428866d, cVar.f428867e));
            }
        }
    }

    public void b(oq1.q qVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppDownloadPkg", "startDownloadLiteApp appId: %s, url: %s", qVar.f428879a, qVar.f428882d);
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.x0(this, abstractC3700xe41a2874, qVar, hVar, str, k2Var), "liteAppDownload");
    }

    public void d(oq1.q qVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 m65924x3e9425e = abstractC3700xe41a2874 == null ? com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1814x6a710b1.C16268x2bf8259f.INSTANCE.m65924x3e9425e(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466) : abstractC3700xe41a2874;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1293L, 93L, 1L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0(null);
        java.lang.String str2 = qVar.f428882d;
        t0Var.f178683a = str2;
        t0Var.f178686d = qVar.f428883e;
        t0Var.f178688f = 2;
        t0Var.f178692j = false;
        t0Var.B = false;
        java.util.Map map = this.f225447e;
        if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppDownloadPkg", qVar.f428882d + " is downloading");
            return;
        }
        if (m65924x3e9425e != null) {
            m65924x3e9425e.mo28861xbcd14bec(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3696xcb0f78fe.DOWNLOAD_BASE_LIBRARY, qVar.f428893o);
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        long b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().b(t0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.b1 b1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.b1(this, "downloadLiteAppBaselib", qVar, str, m65924x3e9425e, null, fVar);
        b1Var.f225441f = k2Var;
        ((java.util.concurrent.ConcurrentHashMap) this.f225446d).put(java.lang.Long.valueOf(b17), b1Var);
        ((java.util.concurrent.ConcurrentHashMap) map).put(qVar.f428882d, b1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e(oq1.q r21, java.lang.String r22, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 r23) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1.e(oq1.q, java.lang.String, com.tencent.liteapp.gen.LiteAppReporter):java.lang.String");
    }

    public void f(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.b1 b1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppDownloadPkg", "onDownloadFail. appId:%s", b1Var.f225437b.f428879a);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.f(20752, "0", true, true);
        g0Var.C(1293L, 95L, 1L);
        java.util.Map map = this.f225447e;
        oq1.q qVar = b1Var.f225437b;
        if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(qVar.f428882d)) {
            ((java.util.concurrent.ConcurrentHashMap) map).remove(qVar.f428882d);
        }
        java.util.Map map2 = this.f225448f;
        if (((java.util.concurrent.ConcurrentHashMap) map2).containsKey(qVar.f428882d)) {
            ((java.util.concurrent.ConcurrentHashMap) map2).remove(qVar.f428882d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar = b1Var.f225438c;
        if (hVar != null) {
            hVar.mo25333x2fd71e(qVar.f428879a, 5);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.f fVar = b1Var.f225439d;
            if (fVar != null) {
                fVar.a(5);
            }
        }
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = b1Var.f225443h;
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28861xbcd14bec(b1Var.f225436a.equals("downloadLiteAppPkg") ? com.p314xaae8f345.p362xadfe2b3.gen.EnumC3696xcb0f78fe.DOWNLOAD_PACKAGE_FAILED : com.p314xaae8f345.p362xadfe2b3.gen.EnumC3696xcb0f78fe.DOWNLOAD_BASE_LIBRARY_FAILED, qVar.f428893o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[Catch: MalformedURLException -> 0x0091, TRY_LEAVE, TryCatch #11 {MalformedURLException -> 0x0091, blocks: (B:8:0x003e, B:10:0x0050, B:12:0x005a, B:14:0x0065, B:16:0x006c, B:19:0x006f, B:21:0x007d, B:23:0x0085), top: B:7:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.b1 r38, java.lang.String r39, java.lang.String r40) {
        /*
            Method dump skipped, instructions count: 2203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1.g(com.tencent.mm.plugin.lite.logic.b1, java.lang.String, java.lang.String):void");
    }
}
