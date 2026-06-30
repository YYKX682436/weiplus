package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class g5 extends xt2.m6 implements jf2.j {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f199934d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f199935e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f199936f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f199937g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f199938h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f199939i;

    public g5(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f199934d = root;
        this.f199935e = basePlugin;
        this.f199936f = "Finder.FinderLiveAnchorFlipCameraWidget";
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f566546tx0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f199937g = findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.tii);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f199938h = imageView;
        this.f199939i = true;
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.f5(this));
        android.graphics.drawable.Drawable drawable = root.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79659x62521576);
        com.p314xaae8f345.mm.ui.uk.f(drawable, root.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        imageView.setImageDrawable(drawable);
    }

    @Override // jf2.h
    public void b() {
        android.view.ViewGroup viewGroup = this.f199934d;
        if (viewGroup.getVisibility() != 0 || this.f199939i) {
            this.f199939i = false;
        }
        viewGroup.setVisibility(0);
    }

    @Override // jf2.j
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78741xb1d91122), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.osl));
    }

    @Override // jf2.j
    public void e(int i17) {
        this.f199937g.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f199934d.findViewById(com.p314xaae8f345.mm.R.id.tih);
    }

    @Override // jf2.h
    public void g() {
        this.f199934d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f199934d;
    }

    @Override // jf2.h
    public boolean i() {
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.h7 h7Var = (mm2.h7) efVar.i(mm2.h7.class);
        boolean z17 = h7Var != null && h7Var.O6();
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        boolean z18 = e1Var != null && e1Var.g7();
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        boolean z19 = c1Var != null && c1Var.f410311a5;
        mm2.e1 e1Var2 = (mm2.e1) efVar.i(mm2.e1.class);
        boolean z27 = e1Var2 != null && e1Var2.b7();
        mm2.e1 e1Var3 = (mm2.e1) efVar.i(mm2.e1.class);
        boolean z28 = e1Var3 != null && e1Var3.f7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f199936f, "#getIfVisible conditions - voiceRoom: " + z18 + ", gameLive: " + z19 + ", ktvRoom: " + z27 + ", screenCastGameMode: " + z28 + "multiStream :" + z17);
        return !(z18 || z19 || z27 || z28 || z17);
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        return this.f199938h;
    }

    @Override // jf2.h
    /* renamed from: type */
    public int mo58036x368f3a() {
        return 24;
    }
}
