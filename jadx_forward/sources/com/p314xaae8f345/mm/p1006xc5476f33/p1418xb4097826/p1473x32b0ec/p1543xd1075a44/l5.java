package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class l5 extends xt2.m6 implements jf2.j {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f200431d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f200432e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f200433f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f200434g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f200435h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f200436i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f200437m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f200438n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f200439o;

    public l5(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f200431d = root;
        this.f200432e = statusMonitor;
        this.f200433f = basePlugin;
        this.f200434g = "Finder.FinderLiveAnchorGameEntranceWidget";
        this.f200435h = true;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.gp_);
        this.f200436i = findViewById;
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.gp7);
        this.f200437m = "anchorlive.bottom.game";
        root.setVisibility(8);
        android.view.ViewParent parent = root.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        viewGroup.setClipToPadding(false);
        viewGroup.setClipChildren(false);
        root.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.j5(this));
        ll2.e eVar = ll2.e.f400666a;
        java.lang.Object context = root.getContext();
        ll2.e.l(eVar, context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null, "anchorlive.bottom.game", findViewById, null, textView, 8, null);
    }

    @Override // jf2.h
    public void b() {
        android.view.ViewGroup viewGroup = this.f200431d;
        if (viewGroup.getVisibility() == 8 && this.f200435h) {
            ll2.e.f400666a.j(this.f200437m, false);
            this.f200435h = false;
        }
        viewGroup.setVisibility(0);
    }

    @Override // jf2.j
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79454x559dc51c), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f573288e50));
    }

    @Override // jf2.j
    public void e(int i17) {
        this.f200431d.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f200431d.findViewById(com.p314xaae8f345.mm.R.id.f564535tz);
    }

    @Override // jf2.h
    public void g() {
        this.f200431d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f200431d;
    }

    @Override // jf2.h
    public boolean i() {
        if (zl2.r4.F1(this.f200433f.S0())) {
            return false;
        }
        return this.f200438n;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.view.View findViewById = this.f200431d.findViewById(com.p314xaae8f345.mm.R.id.f564536u0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    @Override // jf2.h
    /* renamed from: type */
    public int mo58036x368f3a() {
        return 11;
    }
}
