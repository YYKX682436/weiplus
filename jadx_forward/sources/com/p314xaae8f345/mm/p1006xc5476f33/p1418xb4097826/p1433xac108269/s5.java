package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes7.dex */
public final class s5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f184061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f184062e;

    public s5(android.app.Activity activity, yz5.a aVar) {
        this.f184061d = activity;
        this.f184062e = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.net.Uri.Builder buildUpon = android.net.Uri.parse("pages/index/index.html").buildUpon();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(buildUpon, "buildUpon(...)");
        buildUpon.appendQueryParameter("showdetail", "true");
        buildUpon.appendQueryParameter("to_auth_company", "true");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(buildUpon.build());
        sb6.append("&username=");
        android.app.Activity context = this.f184061d;
        sb6.append(xy2.c.e(context));
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        if (sb7 == null) {
            sb7 = "";
        }
        i0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        l81.b1 b1Var = new l81.b1();
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209407p5).mo141623x754a37bb()).r()).booleanValue()) {
            b1Var.f398549c = 2;
        }
        b1Var.H = k91.z3.OPAQUE;
        b1Var.f398545a = "gh_4ee148a6ecaa@app";
        b1Var.f398555f = sb7;
        b1Var.f398565k = com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14496xb5b90f36;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.BackgroundShapeConfig backgroundShapeConfig = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.BackgroundShapeConfig(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), true, true, false, false, 24, null);
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!z17) {
            if (i19 >= i18) {
                i18 = i19;
            }
            i19 = i18;
        }
        b1Var.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1(true, (int) (i19 * 0.45d), k91.s2.f387293d, true, backgroundShapeConfig, false, null, k91.t2.f387301f, true, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15360x63e3b670(true, null), k91.y2.f387361e, false, false, null, true, 0, null, 0, 0, 0, false, false, false, null, false, null, (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1), false, null, false, -1, false, false, false, false, null, null, null, false, null, null, false, 1742696544, 2042, null);
        b1Var.f398561i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b();
        b1Var.L = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d();
        eq.a.f337311b = true;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, b1Var);
        yz5.a aVar = this.f184062e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
