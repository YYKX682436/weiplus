package la4;

/* loaded from: classes4.dex */
public class k extends la4.i {

    /* renamed from: l, reason: collision with root package name */
    public boolean f399127l;

    public k(la4.e eVar, la4.a aVar) {
        super(eVar, aVar);
        this.f399127l = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(150L, 10L, 1L, true);
    }

    @Override // la4.i, la4.f
    public java.lang.String h(java.lang.String str) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendUrlArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
        java.lang.String h17 = super.h(str);
        r45.jj4 jj4Var = this.f399123g;
        if (jj4Var != null && ((i17 = jj4Var.f459389e) == 6 || i17 == 4)) {
            pc4.d dVar = pc4.d.f434943a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableDownloadThumbWxam", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17838x2d571c97 c17838x2d571c97 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17838x2d571c97();
            int h18 = bm5.o1.f104252a.h(c17838x2d571c97);
            int nj6 = h18 != 2 ? h18 != 3 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(c17838x2d571c97) : 0 : 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableDownloadThumbWxam", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            if (!android.text.TextUtils.isEmpty(h17) && nj6 > 0) {
                h17 = t(h17, "picformat=" + nj6);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDownloadThumb", "media id:%s download wxam thumb,picFormat:%d", jj4Var.f459388d, java.lang.Integer.valueOf(nj6));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendUrlArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
        return h17;
    }

    @Override // la4.f
    public int l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
        return 3;
    }

    @Override // la4.f
    public boolean q(dn.h hVar, int i17) {
        int m77710x7cda4f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
        la4.a aVar = this.f399122f;
        if (aVar.f399082h == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
            return true;
        }
        r45.jj4 jj4Var = this.f399123g;
        java.lang.String U = ca4.z0.U(jj4Var);
        this.f399127l = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.o2(aVar.d() + aVar.h());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDownloadThumb", "media id:%s processData isWebp:%b isWxam:%b", jj4Var.f459388d, java.lang.Boolean.valueOf(this.f399127l), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.D2(aVar.d() + aVar.h())));
        if (this.f399127l) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(22L, 64L, 1L, true);
        }
        java.lang.String str = aVar.d() + aVar.h();
        aVar.f399088n = ca4.z0.C(str);
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, options);
        java.lang.String str2 = options.outMimeType;
        java.lang.String lowerCase = str2 != null ? str2.toLowerCase() : "";
        java.lang.String str3 = options.outMimeType;
        if (str3 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(150L, 35L, 1L, true);
        }
        int i18 = ((lowerCase.contains("jpg") || lowerCase.contains("jpeg")) && (m77710x7cda4f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.C20996x490c1edf.m77710x7cda4f17(str)) != 0) ? m77710x7cda4f17 : -1;
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
        if (k17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsDownloadThumb", "processData!!! file err!!! [%s].", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(150L, 23L, 1L, true);
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String U2 = ca4.z0.U(jj4Var);
        com.p314xaae8f345.mm.vfs.w6.P(aVar.d(), aVar.h(), U2);
        com.p314xaae8f345.mm.vfs.w6.j(aVar.d() + U2);
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.W0(aVar.d(), U2, U, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.tj())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsDownloadThumb", "decodeInfo createThumb failed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(150L, 27L, 1L, true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDownloadThumb", "processData execute step1.");
        long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime2;
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(aVar.d() + U2);
        long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        if (!com.p314xaae8f345.mm.vfs.w6.j(aVar.d() + U)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDownloadThumb", "fileExists is false %s", java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(aVar.d() + U)));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(150L, 31L, 1L, true);
            if (j17) {
                if (!com.p314xaae8f345.mm.vfs.w6.j(aVar.d() + U)) {
                    boolean Ga = fo3.s.INSTANCE.Ga();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDownloadThumb", "let me see Is DuplicatedApp? %s", java.lang.Boolean.valueOf(Ga));
                    g0Var.mo68477x336bdfd8(150L, 32L, 1L, true);
                    if (Ga) {
                        g0Var.mo68477x336bdfd8(150L, 33L, 1L, true);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Long valueOf = java.lang.Long.valueOf(elapsedRealtime4);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.f399125i);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.fj();
        g0Var2.d(11696, 3, valueOf, valueOf2, name, "", lp0.b.e0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDownloadThumb", "processData execute step2.");
        if (aVar.f399082h.a() == 0 || aVar.f399082h.a() == 5) {
            java.lang.String e07 = ca4.z0.e0(jj4Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.i1(aVar.d(), U, e07, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.mj());
            U = e07;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.r.c(aVar.d() + U, aVar.f399077c, 1, options.outMimeType, options.outWidth, options.outHeight, i18, k17, elapsedRealtime3, hVar.f69547xcabbcef8, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDownloadThumb", "processData execute step3.");
        com.p314xaae8f345.mm.p872xbfc2bd01.r n17 = ca4.z0.n(aVar.d() + U);
        this.f399120d = n17;
        boolean g17 = ca4.z0.g(n17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDownloadThumb", "download decode bitmap done : succ: " + g17 + " isWebp: " + this.f399127l + " srcImgFileSize: " + k17);
        if (!g17) {
            g0Var2.mo68477x336bdfd8(150L, 65L, 1L, true);
            g0Var2.mo68477x336bdfd8(150L, 51L, 1L, true);
        }
        if (this.f399127l && !g17) {
            g0Var2.mo68477x336bdfd8(22L, 65L, 1L, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
        return g17;
    }

    @Override // la4.f
    public boolean r(dn.h hVar, int i17) {
        int m77710x7cda4f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processGroupDownloadSuccessData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
        int i18 = hVar.f323306h;
        la4.a aVar = this.f399122f;
        android.util.SparseArray sparseArray = aVar.f399091q;
        if (sparseArray == null || sparseArray.size() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processGroupDownloadSuccessData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
            return true;
        }
        ca4.s0 s0Var = (ca4.s0) aVar.f399091q.get(i18);
        r45.jj4 jj4Var = (r45.jj4) aVar.f399090p.get(i18);
        if (s0Var == null || jj4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsDownloadThumb", "decodeElement or media is null.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processGroupDownloadSuccessData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDownloadThumb", "In processGroupDownloadSuccessData ing, %d.", java.lang.Integer.valueOf(i18));
        java.lang.String str = aVar.b(jj4Var.f459388d) + aVar.c(jj4Var);
        java.lang.String U = ca4.z0.U(jj4Var);
        boolean o27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.o2(str);
        this.f399127l = o27;
        if (o27) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(22L, 64L, 1L, true);
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, options);
        java.lang.String str2 = options.outMimeType;
        java.lang.String lowerCase = str2 != null ? str2.toLowerCase() : "";
        java.lang.String str3 = options.outMimeType;
        if (str3 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(150L, 35L, 1L, true);
        }
        int i19 = ((lowerCase.contains("jpg") || lowerCase.contains("jpeg")) && (m77710x7cda4f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.C20996x490c1edf.m77710x7cda4f17(str)) != 0) ? m77710x7cda4f17 : -1;
        aVar.f399088n = ca4.z0.C(str);
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
        if (k17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsDownloadThumb", "processGroupDownloadSuccessData!!! file err!!! [%s].", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(150L, 23L, 1L, true);
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsSrcName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str4 = "snstblur_src_" + ca4.z0.s(jj4Var.f459388d);
        if (jj4Var.D == 1) {
            str4 = l21.c.a(str4 + ca4.z0.f0(jj4Var), jj4Var.E);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsSrcName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsSrcName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        }
        com.p314xaae8f345.mm.vfs.w6.c(str, aVar.b(jj4Var.f459388d) + str4);
        com.p314xaae8f345.mm.vfs.w6.j(aVar.b(jj4Var.f459388d) + str4);
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.W0(aVar.b(jj4Var.f459388d), aVar.c(jj4Var), U, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.tj())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsDownloadThumb", "decodeInfo createThumb failed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(150L, 27L, 1L, true);
        }
        long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime2;
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str);
        com.p314xaae8f345.mm.vfs.w6.h(str);
        long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        if (!com.p314xaae8f345.mm.vfs.w6.j(aVar.b(jj4Var.f459388d) + U)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDownloadThumb", "fileExists is false %s.", java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(aVar.d() + U)));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(150L, 31L, 1L, true);
            if (j17) {
                if (!com.p314xaae8f345.mm.vfs.w6.j(aVar.b(jj4Var.f459388d) + U)) {
                    boolean Ga = fo3.s.INSTANCE.Ga();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDownloadThumb", "let me see Is DuplicatedApp? %s", java.lang.Boolean.valueOf(Ga));
                    g0Var.mo68477x336bdfd8(150L, 32L, 1L, true);
                    if (Ga) {
                        g0Var.mo68477x336bdfd8(150L, 33L, 1L, true);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Long valueOf = java.lang.Long.valueOf(elapsedRealtime4);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.f399125i);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.fj();
        g0Var2.d(11696, 3, valueOf, valueOf2, name, "", lp0.b.e0());
        if (s0Var.a() == 0 || aVar.f399082h.a() == 5) {
            java.lang.String e07 = ca4.z0.e0(jj4Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.i1(aVar.b(jj4Var.f459388d), U, e07, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.mj());
            U = e07;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.r.c(aVar.b(jj4Var.f459388d) + U, jj4Var.f459393i, 1, options.outMimeType, options.outWidth, options.outHeight, i19, k17, elapsedRealtime3, hVar.f69547xcabbcef8, i17);
        com.p314xaae8f345.mm.p872xbfc2bd01.r n17 = ca4.z0.n(aVar.b(jj4Var.f459388d) + U);
        this.f399120d = n17;
        this.f399121e.put(i18, n17);
        boolean g17 = ca4.z0.g(this.f399120d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDownloadThumb", "download decode bitmap done : succ: " + g17 + " isWebp: " + this.f399127l + " srcImgFileSize: " + k17 + " index: " + i18);
        if (!g17) {
            g0Var2.mo68477x336bdfd8(150L, 65L, 1L, true);
            g0Var2.mo68477x336bdfd8(150L, 51L, 1L, true);
        }
        if (this.f399127l && !g17) {
            g0Var2.mo68477x336bdfd8(22L, 65L, 1L, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processGroupDownloadSuccessData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
        return g17;
    }
}
