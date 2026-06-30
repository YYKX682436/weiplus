package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui;

/* loaded from: classes14.dex */
public final class v extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f258533d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f258534e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f258535f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f258536g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f258537h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f258538i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f258539m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f258540n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f258541o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f258542p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f258543q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f258544r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context, yz5.l onAddParam) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onAddParam, "onAddParam");
        this.f258533d = onAddParam;
        this.f258534e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.r(this));
        this.f258535f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.l(this));
        this.f258536g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.n(this));
        this.f258537h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.m(this));
        this.f258538i = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.o(this));
        this.f258539m = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.q(this));
        this.f258540n = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.k(this));
        this.f258541o = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.p(this));
        this.f258542p = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.u(this));
        this.f258543q = kz5.c0.i(8, 4, 2, 16, 32);
        this.f258544r = kz5.c0.i(4, 6, 8, 10, 12);
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.cgd);
        setCanceledOnTouchOutside(true);
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f258536g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.widget.ArrayAdapter<java.lang.CharSequence> createFromResource = android.widget.ArrayAdapter.createFromResource(getContext(), com.p314xaae8f345.mm.R.C30856x58c7259.f559568ai, android.R.layout.simple_spinner_item);
        createFromResource.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ((android.widget.Spinner) mo141623x754a37bb).setAdapter((android.widget.SpinnerAdapter) createFromResource);
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) this.f258537h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        android.widget.ArrayAdapter<java.lang.CharSequence> createFromResource2 = android.widget.ArrayAdapter.createFromResource(getContext(), com.p314xaae8f345.mm.R.C30856x58c7259.f559569aj, android.R.layout.simple_spinner_item);
        createFromResource2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ((android.widget.Spinner) mo141623x754a37bb2).setAdapter((android.widget.SpinnerAdapter) createFromResource2);
        jz5.g gVar = this.f258542p;
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        android.widget.ArrayAdapter<java.lang.CharSequence> createFromResource3 = android.widget.ArrayAdapter.createFromResource(getContext(), com.p314xaae8f345.mm.R.C30856x58c7259.f559570ak, android.R.layout.simple_spinner_item);
        createFromResource3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ((android.widget.Spinner) mo141623x754a37bb3).setAdapter((android.widget.SpinnerAdapter) createFromResource3);
        java.lang.Object mo141623x754a37bb4 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
        ((android.widget.Spinner) mo141623x754a37bb4).setSelection(1);
        java.lang.Object mo141623x754a37bb5 = ((jz5.n) this.f258534e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
        ((android.view.View) mo141623x754a37bb5).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.s(this));
        java.lang.Object mo141623x754a37bb6 = ((jz5.n) this.f258535f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb6, "getValue(...)");
        ((android.view.View) mo141623x754a37bb6).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.t(this));
        android.view.Window window = getWindow();
        if (window != null) {
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = com.p314xaae8f345.mm.ui.bk.o(0.9f);
            window.setAttributes(attributes);
        }
    }
}
