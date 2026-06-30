package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class o6 extends xt2.m6 implements jf2.j, jf2.o, jf2.l, jf2.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f200793d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f200794e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f200795f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f200796g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f200797h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f200798i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f200799m;

    public o6(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f200793d = root;
        this.f200794e = basePlugin;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.el7);
        this.f200795f = findViewById;
        android.widget.ImageView imageView = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.el6);
        this.f200796g = imageView;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.j6s);
        this.f200797h = findViewById2;
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.iys);
        this.f200798i = true;
        this.f200799m = "anchorlive.bottom.lottery.redpacket";
        android.graphics.drawable.Drawable drawable = root.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79871x420023fa);
        com.p314xaae8f345.mm.ui.uk.f(drawable, root.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        imageView.setImageDrawable(drawable);
        ll2.e eVar = ll2.e.f400666a;
        java.lang.Object context = root.getContext();
        ll2.e.l(eVar, context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null, "anchorlive.bottom.lottery.redpacket", findViewById2, null, textView, 8, null);
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n6(this));
    }

    @Override // jf2.l
    public void F(int i17) {
        ll2.e.f400666a.j(this.f200799m, false);
    }

    @Override // jf2.h
    public void b() {
        android.view.ViewGroup viewGroup = this.f200793d;
        if (viewGroup.getVisibility() != 0 || this.f200798i) {
            this.f200798i = false;
            ll2.e.f400666a.j(this.f200799m, false);
        }
        this.f200798i = true;
        viewGroup.setVisibility(0);
    }

    @Override // jf2.j
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80538x71f13798), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.nsb));
    }

    @Override // jf2.j
    public void e(int i17) {
        this.f200795f.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f200795f;
    }

    @Override // jf2.h
    public void g() {
        this.f200793d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f200793d;
    }

    @Override // jf2.h
    public boolean i() {
        if (((mm2.n0) this.f200794e.P0(mm2.n0.class)).f410806r) {
            return false;
        }
        return zl2.r4.f555483a.y1(this.f200794e.S0());
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.widget.ImageView luckyMoneyIcon = this.f200796g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(luckyMoneyIcon, "luckyMoneyIcon");
        return luckyMoneyIcon;
    }

    @Override // jf2.h
    /* renamed from: type */
    public int mo58036x368f3a() {
        return 6;
    }
}
