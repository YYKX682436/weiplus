package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class vb0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f196235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f196236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 f196237f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.g0 f196238g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f196239h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb0(android.graphics.Bitmap bitmap, android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 dc0Var, cm2.g0 g0Var, android.view.View view) {
        super(0);
        this.f196235d = bitmap;
        this.f196236e = imageView;
        this.f196237f = dc0Var;
        this.f196238g = g0Var;
        this.f196239h = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 dc0Var = this.f196237f;
        android.graphics.Bitmap bitmap = this.f196235d;
        if (bitmap != null) {
            this.f196236e.setImageBitmap(bitmap);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dc0Var.f193791h, "resource is null!");
        }
        android.view.View itemView = this.f196239h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "$itemView");
        android.graphics.Bitmap bitmap2 = this.f196235d;
        cm2.g0 g0Var = this.f196238g;
        boolean m75933x41a8a7f2 = g0Var.f124879v.m75933x41a8a7f2(2);
        dc0Var.getClass();
        r45.qy1 qy1Var = g0Var.f124879v;
        java.lang.String m75945x2fec8307 = qy1Var.m75945x2fec8307(1);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            bw5.mb0 P0 = zl2.r4.f555483a.P0(qy1Var);
            java.lang.String c17 = P0 != null ? P0.c() : null;
            dc0Var.d(c17 == null ? "" : c17, itemView, bitmap2, g0Var, m75933x41a8a7f2);
        } else {
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
            java.lang.String m75945x2fec83072 = qy1Var.m75945x2fec8307(1);
            wo0.c a17 = d1Var.a(new mn2.q3(m75945x2fec83072 != null ? m75945x2fec83072 : "", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
            a17.f529406d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bc0(itemView, dc0Var, g0Var, m75933x41a8a7f2, bitmap2);
            a17.f();
        }
        return jz5.f0.f384359a;
    }
}
