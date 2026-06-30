package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public class f1 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f164663a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164664b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164665c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f164666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f164667e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f164668f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164669g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.q2 f164670h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164671i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164672j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f164673k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164674l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.g1 f164675m;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.g1 g1Var, android.app.Activity activity, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.q2 q2Var, java.lang.String str4, java.lang.String str5, int i18, java.lang.String str6) {
        this.f164675m = g1Var;
        this.f164663a = activity;
        this.f164664b = str;
        this.f164665c = str2;
        this.f164666d = c0Var;
        this.f164667e = i17;
        this.f164668f = c11809xbc286be4;
        this.f164669g = str3;
        this.f164670h = q2Var;
        this.f164671i = str4;
        this.f164672j = str5;
        this.f164673k = i18;
        this.f164674l = str6;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.g1 g1Var = this.f164675m;
        if (i17 != g1Var.f164678g) {
            return false;
        }
        int i19 = this.f164667e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f164666d;
        if (i18 != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareTimeline", "result is cancel");
            c0Var.a(i19, g1Var.o("cancel"));
            java.lang.String str = this.f164664b;
            java.lang.String str2 = this.f164665c;
            g1Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.e(str, str2, 3, "", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), 3, i18);
            return true;
        }
        android.app.Activity activity = this.f164663a;
        db5.e1.T(activity, activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
        java.lang.String str3 = this.f164664b;
        java.lang.String str4 = this.f164665c;
        g1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.e(str3, str4, 3, "", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), 1, i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareTimeline", "result is success");
        c0Var.a(i19, g1Var.o("ok"));
        java.lang.String Y1 = c0Var.V0().Y1();
        java.lang.String J1 = c0Var.V0().J1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = this.f164668f;
        int i27 = c11809xbc286be4.f128817z;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.r2.b(this.f164669g, this.f164670h);
        java.lang.String str5 = this.f164664b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = c11809xbc286be4.f128802b2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n2.d(str5, c12559xbdae8559.f169323f, c12559xbdae8559.f169324g, c11809xbc286be4.f128809v, null, this.f164671i, this.f164665c, Y1, J1, 0, this.f164669g, null, i27, this.f164672j, this.f164673k, 3, this.f164674l);
        return true;
    }
}
