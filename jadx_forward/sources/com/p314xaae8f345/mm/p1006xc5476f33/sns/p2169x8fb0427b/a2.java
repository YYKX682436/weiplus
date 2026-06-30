package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public final class a2 extends l75.n0 implements p94.i0, fe0.g4 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.y1 f247453g = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.y1(null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f247454h = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1.U, "SnsCover")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f247455d;

    /* renamed from: e, reason: collision with root package name */
    public final kk.l f247456e;

    /* renamed from: f, reason: collision with root package name */
    public final nb4.m f247457f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(l75.k0 db6) {
        super(db6, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1.U, "SnsCover", null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        this.f247455d = db6;
        this.f247456e = new kk.l(5);
        this.f247457f = new nb4.m();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverStorage", "createSnsCoverStorage " + db6 + "  " + java.lang.Thread.currentThread().getId());
    }

    public final void D0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 x1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearDBData", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        x1Var.f67720x61895ab4 = "";
        x1Var.f67729x7b284d5e = "";
        x1Var.f67732x5719e394 = "";
        ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.z1(x1Var.f67723x63c0190, x1Var.f67722x5a2f915, x1Var.f67724x6586435));
        x1Var.f67724x6586435 = "";
        x1Var.f67722x5a2f915 = "";
        x1Var.f67723x63c0190 = "";
        W0(x1Var, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearDBData", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
    }

    public final boolean J0(java.lang.String userName, long j17, java.lang.String path) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadBitmap", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 L0 = L0(userName);
        boolean z17 = false;
        if (L0.m70535xfb85f7b0() == 1 || L0.m70535xfb85f7b0() == 6 || L0.m70535xfb85f7b0() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadPhoto", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverStorage", "downloadPhoto user:" + userName + " id:" + j17 + " path:" + path + " size:" + com.p314xaae8f345.mm.vfs.w6.k(path));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 L02 = L0(userName);
            java.lang.Long u07 = L02.u0();
            if ((u07 != null && u07.longValue() == j17) && L02.f67728x547edbe) {
                L02.f67722x5a2f915 = path;
                z17 = W0(L02, false);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadPhoto", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadPhoto", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadThumb", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverStorage", "downloadThumb user:" + userName + " id:" + j17 + " path:" + path + " size:" + com.p314xaae8f345.mm.vfs.w6.k(path));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 L03 = L0(userName);
            java.lang.Long u08 = L03.u0();
            if ((u08 != null && u08.longValue() == j17) && L03.f67728x547edbe) {
                L03.f67723x63c0190 = path;
                z17 = W0(L03, false);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadThumb", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadThumb", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadBitmap", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        return z17;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 L0(java.lang.String userName) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCoverInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        kk.l lVar = this.f247456e;
        if (lVar.get(userName) != null) {
            java.lang.Object obj = lVar.get(userName);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getAndUptime(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 x1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1) obj;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCoverInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            return x1Var;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *, rowid from SnsCover where userName=\"");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(userName);
        sb6.append(userName);
        sb6.append('\"');
        android.database.Cursor f17 = this.f247455d.f(sb6.toString(), null, 2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 x1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1();
        if (f17.moveToFirst()) {
            x1Var2.mo9015xbf5d97fd(f17);
            lVar.put(userName, x1Var2);
        } else {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(userName)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 J0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej().J0(userName);
                if ((((u41.j) ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).wi()).z0(userName) & 2) == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsCoverStorage", "openIM bg flag false, do not show bg");
                    x1Var2.f67730x2262335f = 5;
                } else {
                    x1Var2.f67730x2262335f = 6;
                }
                x1Var2.f67731xdde069b = userName;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasLike", "com.tencent.mm.plugin.sns.storage.SnsExt");
                z17 = (J0.f67950x6d5f825 & 2) > 0;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasLike", "com.tencent.mm.plugin.sns.storage.SnsExt");
                x1Var2.f67721xff78bac6 = z17;
                x1Var2.f67726xfa287b93 = J0.f67954xfa287b93;
                x1Var2.T = J0.f67938x2259bc65;
            } else {
                java.lang.String a17 = f247453g.a(userName);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 J02 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej().J0(userName);
                x1Var2.f67731xdde069b = userName;
                long j17 = J02.f67954xfa287b93;
                x1Var2.f67726xfa287b93 = j17;
                x1Var2.f67730x2262335f = j17 == 0 ? 0 : 1;
                x1Var2.f67728x547edbe = false;
                x1Var2.f67729x7b284d5e = J02.f67939x28ddff65;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasLike", "com.tencent.mm.plugin.sns.storage.SnsExt");
                z17 = (2 & J02.f67950x6d5f825) > 0;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasLike", "com.tencent.mm.plugin.sns.storage.SnsExt");
                x1Var2.f67721xff78bac6 = z17;
                x1Var2.S = "data from extra db,maybe not friend";
                if (com.p314xaae8f345.mm.vfs.w6.j(a17)) {
                    x1Var2.f67723x63c0190 = a17;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverStorage", "snscover not value,load from ext info:" + J02.f67954xfa287b93);
                this.f247457f.P6(J02.f67954xfa287b93);
            }
        }
        f17.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCoverInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        return x1Var2;
    }

    public final boolean P0(java.lang.String userName, java.lang.String thumb, java.lang.String cover, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateCoverImageInfoLocal", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumb, "thumb");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cover, "cover");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverStorage", "updateCoverImageInfoLocal :" + userName + " thumb:" + thumb);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 L0 = L0(userName);
        L0.f67731xdde069b = userName;
        L0.f67730x2262335f = 1;
        z0(L0);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(thumb, L0.f67723x63c0190)) {
            ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.z1(L0.f67723x63c0190));
            L0.f67723x63c0190 = thumb;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cover, L0.f67722x5a2f915) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(thumb, L0.f67722x5a2f915)) {
            ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.z1(L0.f67722x5a2f915));
            L0.f67722x5a2f915 = cover;
        }
        L0.f67727x69ef8877 = pc4.d.f434943a.y() ? (int) (f17 * 10000) : 0;
        boolean W0 = W0(L0, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCoverImageInfoLocal", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        return W0;
    }

    public final boolean W0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 x1Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateCoverInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverStorage", "updateCoverInfo:" + x1Var + " post:" + z17);
        if ((x1Var != null ? x1Var.f67731xdde069b : null) == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(x1Var.f67731xdde069b, "")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCoverInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            return false;
        }
        boolean mo11260x413cb2b4 = super.mo11260x413cb2b4(x1Var);
        if (mo11260x413cb2b4) {
            this.f247456e.put(x1Var.f67731xdde069b, x1Var);
        }
        if (z17) {
            nb4.m mVar = this.f247457f;
            mVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserCover", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
            p012xc85e97e9.p093xedfae76a.j0 j0Var = mVar.f417620e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserCover", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
            j0Var.mo7808x76db6cb1(x1Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCoverInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        return mo11260x413cb2b4;
    }

    public boolean b1(java.lang.String userName, long j17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFinderInfoFromDetail", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverStorage", "updateFinderInfoFromDetail :".concat(userName));
        if ((c19792x256d2725 != null ? c19792x256d2725.m76802x2dd01666() : null) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFinderInfoFromDetail", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 L0 = L0(userName);
        java.lang.Long u07 = L0.u0();
        if (u07 == null || u07.longValue() != j17 || !L0.f67728x547edbe) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFinderInfoFromDetail", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            return false;
        }
        try {
            L0.f67719x27cd822a = c19792x256d2725.mo14344x5f01b1f6();
            L0.f67718x54cb1d2a = java.lang.System.currentTimeMillis();
        } catch (java.lang.Exception unused) {
        }
        boolean W0 = W0(L0, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFinderInfoFromDetail", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        return W0;
    }

    public void y0(java.lang.String userName) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("blockCover", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverStorage", "blockCover:".concat(userName));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 L0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Bj().L0(userName);
        L0.f67730x2262335f = 5;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportCoverBlock", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa3908 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908();
        c6889x9caa3908.f142052f = c6889x9caa3908.b("UserName", L0.m70536x6bf53a6c(), true);
        c6889x9caa3908.f142050d = 5;
        java.lang.String m70537x9616526c = L0.m70537x9616526c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70537x9616526c, "toString(...)");
        c6889x9caa3908.p(r26.i0.t(m70537x9616526c, ",", ";", false));
        c6889x9caa3908.k();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportCoverBlock", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateCoverInfo$default", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        W0(L0, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCoverInfo$default", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("blockCover", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
    }

    public final void z0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 x1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearCoverResource", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverStorage", "clearCoverResource");
        x1Var.f67726xfa287b93 = -1L;
        x1Var.f67720x61895ab4 = "";
        x1Var.f67729x7b284d5e = "";
        x1Var.f67732x5719e394 = "";
        x1Var.f67719x27cd822a = null;
        x1Var.f67728x547edbe = false;
        x1Var.f67721xff78bac6 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearCoverResource", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
    }
}
