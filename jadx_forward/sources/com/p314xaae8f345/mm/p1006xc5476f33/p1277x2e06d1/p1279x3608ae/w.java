package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes7.dex */
public class w implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f175337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175338e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f175339f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175340g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175341h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f175342i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f175343m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.database.MatrixCursor f175344n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f175345o;

    public w(int i17, java.lang.String str, int i18, java.lang.String str2, java.lang.String str3, int i19, boolean z17, android.database.MatrixCursor matrixCursor, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f175337d = i17;
        this.f175338e = str;
        this.f175339f = i18;
        this.f175340g = str2;
        this.f175341h = str3;
        this.f175342i = i19;
        this.f175343m = z17;
        this.f175344n = matrixCursor;
        this.f175345o = countDownLatch;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        int i19 = this.f175337d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizLogic", "doMiniProgramTranslateLink, %d, %d, %s, cgiType=%d", valueOf, valueOf2, str, java.lang.Integer.valueOf(i19));
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.b(false, i19);
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.b(true, i19);
        java.lang.String str2 = ((r45.zp6) oVar.f152244b.f152233a).f473817f;
        android.net.Uri parse = android.net.Uri.parse(str2);
        parse.getQueryParameter("appid");
        java.lang.String queryParameter = parse.getQueryParameter("userName");
        java.lang.String queryParameter2 = parse.getQueryParameter(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(parse.getQueryParameter("validTime"));
        java.lang.String str3 = this.f175338e;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(java.lang.String.format("%s_%d_%s_%s_%d", str3, java.lang.Integer.valueOf(this.f175339f), this.f175340g, this.f175341h, java.lang.Integer.valueOf(this.f175342i)));
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.l();
            lVar.f175302b = java.lang.System.currentTimeMillis();
            lVar.f175301a = str2;
            if (E1 > 0) {
                lVar.f175303c = E1 * 1000;
            }
            ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.f175264a).put(a17, lVar);
        }
        if (i19 != 1) {
            return 0;
        }
        ((rg1.h) ((sg1.f) i95.n0.c(sg1.f.class))).getClass();
        new rg1.n(queryParameter, queryParameter2).l();
        if (this.f175343m) {
            km5.q Bi = ((rg1.h) ((sg1.f) i95.n0.c(sg1.f.class))).Bi(queryParameter, queryParameter2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.f170363u);
            android.database.MatrixCursor matrixCursor = this.f175344n;
            java.util.concurrent.CountDownLatch countDownLatch = this.f175345o;
            ((km5.q) Bi.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.z(matrixCursor, countDownLatch))).s(new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.y(countDownLatch));
        } else {
            ((rg1.h) ((sg1.f) i95.n0.c(sg1.f.class))).Di(queryParameter, new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.v(this));
        }
        return 0;
    }
}
