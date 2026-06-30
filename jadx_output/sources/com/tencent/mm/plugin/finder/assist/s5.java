package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes7.dex */
public final class s5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f102528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f102529e;

    public s5(android.app.Activity activity, yz5.a aVar) {
        this.f102528d = activity;
        this.f102529e = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.net.Uri.Builder buildUpon = android.net.Uri.parse("pages/index/index.html").buildUpon();
        kotlin.jvm.internal.o.f(buildUpon, "buildUpon(...)");
        buildUpon.appendQueryParameter("showdetail", "true");
        buildUpon.appendQueryParameter("to_auth_company", "true");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(buildUpon.build());
        sb6.append("&username=");
        android.app.Activity context = this.f102528d;
        sb6.append(xy2.c.e(context));
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        if (sb7 == null) {
            sb7 = "";
        }
        i0Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        l81.b1 b1Var = new l81.b1();
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127874p5).getValue()).r()).booleanValue()) {
            b1Var.f317016c = 2;
        }
        b1Var.H = k91.z3.OPAQUE;
        b1Var.f317012a = "gh_4ee148a6ecaa@app";
        b1Var.f317022f = sb7;
        b1Var.f317032k = com.tencent.liteav.TXLiteAVCode.WARNING_MICROPHONE_DEVICE_EMPTY;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig backgroundShapeConfig = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9), true, true, false, false, 24, null);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z17) {
            if (i19 >= i18) {
                i18 = i19;
            }
            i19 = i18;
        }
        b1Var.G = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(true, (int) (i19 * 0.45d), k91.s2.f305760d, true, backgroundShapeConfig, false, null, k91.t2.f305768f, true, false, new com.tencent.mm.plugin.finder.view.FinderWeAppHalfScreenScListener(true, null), k91.y2.f305828e, false, false, null, true, 0, null, 0, 0, 0, false, false, false, null, false, null, (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479706d1), false, null, false, -1, false, false, false, false, null, null, null, false, null, null, false, 1742696544, 2042, null);
        b1Var.f317028i = new com.tencent.mm.plugin.finder.assist.b();
        b1Var.L = new com.tencent.mm.plugin.finder.assist.d();
        eq.a.f255778b = true;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
        yz5.a aVar = this.f102529e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
