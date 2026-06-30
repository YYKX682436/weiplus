package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class z3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f246329a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f246330b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 f246331c;

    /* renamed from: d, reason: collision with root package name */
    public final int f246332d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y3 f246333e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f246334f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f246336h;

    /* renamed from: i, reason: collision with root package name */
    public r45.mj4 f246337i;

    /* renamed from: j, reason: collision with root package name */
    public int f246338j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f246339k;

    /* renamed from: g, reason: collision with root package name */
    public long f246335g = 0;

    /* renamed from: l, reason: collision with root package name */
    public final dn.k f246340l = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x3(this);

    public z3(java.lang.String str, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 l2Var, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y3 y3Var) {
        this.f246334f = "";
        this.f246336h = "";
        this.f246337i = new r45.mj4();
        java.lang.System.currentTimeMillis();
        this.f246329a = str2;
        this.f246330b = str3;
        this.f246333e = y3Var;
        this.f246332d = i17;
        this.f246331c = l2Var;
        this.f246339k = str;
        try {
            r45.mj4 mj4Var = (r45.mj4) new r45.mj4().mo11468x92b714fd(l2Var.h());
            this.f246337i = mj4Var;
            java.lang.String str4 = mj4Var.f462105p;
            this.f246334f = str4;
            this.f246336h = mj4Var.f462112w;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                java.lang.String g17 = kk.k.g(("" + android.os.SystemClock.elapsedRealtime()).getBytes());
                this.f246334f = g17;
                r45.mj4 mj4Var2 = this.f246337i;
                mj4Var2.f462105p = g17;
                try {
                    l2Var.m(mj4Var2.mo14344x5f01b1f6());
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().Y2(l2Var.c(), l2Var);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SightCdnUpload", e17, "", new java.lang.Object[0]);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCdnUpload", "sightupload %d videopath %s sightFileSize %d md5 %s", java.lang.Integer.valueOf(i17), str2, java.lang.Integer.valueOf((int) com.p314xaae8f345.mm.vfs.w6.k(str2)), this.f246336h);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.v0.c(this.f246332d);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCdnUpload", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
        }
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z3 z3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        java.lang.String str = z3Var.f246329a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 l2Var = z3Var.f246331c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateMd5Info", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        try {
            z3Var.f246337i = (r45.mj4) new r45.mj4().mo11468x92b714fd(l2Var.h());
            java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str);
            z3Var.f246336h = p17;
            r45.mj4 mj4Var = z3Var.f246337i;
            mj4Var.f462112w = p17;
            l2Var.m(mj4Var.mo14344x5f01b1f6());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCdnUpload", "new md5 is %s %s", str, z3Var.f246336h);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().Y2(l2Var.c(), l2Var);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCdnUpload", "parseFrom MediaUploadInfo error in updateMd5Info %s", e17.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateMd5Info", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z3 z3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 l2Var = z3Var.f246331c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        return l2Var;
    }

    public static /* synthetic */ java.lang.String c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z3 z3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        z3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        return null;
    }

    public static /* synthetic */ int d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z3 z3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        int i17 = z3Var.f246332d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        return i17;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y3 e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z3 z3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y3 y3Var = z3Var.f246333e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        return y3Var;
    }

    public final boolean f(r45.vh4 vh4Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doupload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        if (this.f246335g == 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f246335g = java.lang.System.currentTimeMillis();
        }
        java.lang.String str2 = this.f246334f;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SightCdnUpload", "cdntra genClientId failed not use cdn");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doupload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
            return false;
        }
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_NetSceneSnsUpload_2";
        mVar.f323320f = this.f246340l;
        mVar.f69601xaca5bdda = str2;
        java.lang.String str3 = this.f246329a;
        mVar.f69595x6d25b0d9 = str3;
        java.lang.String str4 = this.f246330b;
        mVar.f69619xe9ed65f6 = str4;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.D2(str4)) {
            mVar.f323326n = 20251;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCdnUpload", "upload sight with wxam thumb, %s", str4);
        }
        mVar.f69592xf1ebe47b = 20202;
        mVar.f69618x114ef53e = "";
        mVar.f69609xd84b8349 = 2;
        mVar.f69606xccdbf540 = true;
        mVar.f69597x853bb235 = false;
        mVar.f69580x454032b6 = 102;
        mVar.f69584x89a4c0cf = 1;
        if (pc4.d.f434943a.v(false)) {
            mVar.f69598x47e3df1e = 0;
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            mVar.f69598x47e3df1e = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("OpenSdkVideoTime").o(str, 10);
        } else if (vh4Var.f469776p) {
            mVar.f69598x47e3df1e = d11.s.fj().Bi(d11.s.fj().qj());
        } else {
            mVar.f69598x47e3df1e = d11.s.fj().Bi(vh4Var.f469768e ? d11.s.fj().pj() : d11.s.fj().nj());
        }
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e4.c(str3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(106L, 31L, 1L, false);
        }
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str3);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f246336h) && !this.f246336h.equals(p17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCdnUpload", "isNotSafeSightVideo old srcmd5 %s newmd5 %s ", this.f246336h, p17);
            h(-2);
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.u7) this.f246333e).a(false, this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doupload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
            return false;
        }
        if (pc4.f.f434968a.b() && vh4Var != null && !vh4Var.f469768e && !vh4Var.f469776p) {
            try {
                r45.u76 u76Var = new r45.u76();
                u76Var.f468663d = 2;
                mVar.P = u76Var.mo14344x5f01b1f6();
            } catch (java.io.IOException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCdnUpload", "set cdnUploadInfo error");
            }
        }
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            this.f246338j = (vh4Var == null || !vh4Var.f469768e) ? 5 : 4;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doupload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCdnUpload", "cdntra addSendTask failed. clientid:%s", str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doupload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        return false;
    }

    public final void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onError", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCdnUpload", "snsupload sight by cdn error!");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2 Hj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj();
        int i17 = this.f246332d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 n17 = Hj.n1(i17);
        n17.j(0);
        try {
            r45.mj4 mj4Var = (r45.mj4) new r45.mj4().mo11468x92b714fd(n17.h());
            mj4Var.f462105p = "";
            r45.vh4 vh4Var = mj4Var.B;
            if (vh4Var != null) {
                vh4Var.f469769f = 0;
            }
            n17.m(mj4Var.mo14344x5f01b1f6());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().Y2(i17, n17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().A(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onError", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCdnUpload", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onError", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        }
    }

    public final void h(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onErrorServer", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCdnUpload", "snsupload sight by cdn error!");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2 Hj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj();
        int i18 = this.f246332d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 n17 = Hj.n1(i18);
        try {
            r45.mj4 mj4Var = (r45.mj4) new r45.mj4().mo11468x92b714fd(n17.h());
            mj4Var.f462103n = 1;
            mj4Var.f462108s = i17;
            r45.vh4 vh4Var = this.f246337i.B;
            if (vh4Var != null) {
                vh4Var.f469769f = 0;
            }
            n17.m(mj4Var.mo14344x5f01b1f6());
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().A(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().Y2(i18, n17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onErrorServer", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
    }
}
