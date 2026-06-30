package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class xp extends xt2.m6 implements jf2.j, jf2.o, jf2.l, jf2.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f201895d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f201896e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f201897f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f201898g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f201899h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f201900i;

    public xp(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f201895d = root;
        this.f201896e = basePlugin;
        this.f201897f = true;
        this.f201898g = "anchorlive.bottom.multiangle";
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f567550jv5);
        this.f201899h = findViewById;
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.f567549jv4);
        this.f201900i = true;
        root.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wp(this));
        ll2.e eVar = ll2.e.f400666a;
        java.lang.Object context = root.getContext();
        ll2.e.l(eVar, context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null, "anchorlive.bottom.multiangle", findViewById, textView, null, 16, null);
    }

    @Override // jf2.l
    public void F(int i17) {
        rk2.r.b(rk2.r.f478018a, 2, null, null, 6, null);
        ll2.e.f400666a.j(this.f201898g, false);
    }

    @Override // jf2.h
    public void b() {
        this.f201895d.setVisibility(0);
        if (this.f201897f) {
            this.f201897f = false;
            rk2.r.b(rk2.r.f478018a, 2, null, null, 6, null);
            ll2.e.f400666a.j(this.f201898g, false);
        }
    }

    @Override // jf2.j
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80262xf98eb1e4), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.mir));
    }

    @Override // jf2.j
    public void e(int i17) {
        this.f201895d.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f201895d.findViewById(com.p314xaae8f345.mm.R.id.fcm);
    }

    @Override // jf2.h
    public void g() {
        this.f201895d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f201895d;
    }

    @Override // jf2.h
    public boolean i() {
        return this.f201900i && ((mm2.h7) this.f201896e.P0(mm2.h7.class)).f410650i.size() > 1;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.view.View findViewById = this.f201895d.findViewById(com.p314xaae8f345.mm.R.id.fcn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    @Override // jf2.h
    /* renamed from: type */
    public int mo58036x368f3a() {
        return 12;
    }
}
