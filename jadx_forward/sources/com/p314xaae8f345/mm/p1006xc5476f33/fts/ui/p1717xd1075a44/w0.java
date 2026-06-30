package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes12.dex */
public final class w0 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.m0 {

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.k1 f219871p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f219872q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f219873r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f219874s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f219875t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f219876u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.k1 proxy) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proxy, "proxy");
        this.f219871p = proxy;
        this.f219872q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v0(this, context));
        this.f219873r = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.t0(this));
        this.f219874s = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.p0(this));
        this.f219875t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.u0(context, this));
        this.f219876u = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.o0(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.m0
    public void D() {
        android.view.Window window;
        super.D();
        if (!com.p314xaae8f345.mm.ui.b4.c(getContext()) || (window = getWindow()) == null) {
            return;
        }
        new n3.m3(window, window.getDecorView()).b(true);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setNavigationBarColor(0);
        com.p314xaae8f345.mm.ui.a4.f278650a.j(window);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.m0, p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        jz5.g gVar = this.f219876u;
        android.view.View view = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
        if (view != null) {
            view.setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.idl));
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.b1) ((jz5.n) this.f219875t).mo141623x754a37bb()).f219780b = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.q0(this);
        android.view.View view2 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
        if (view2 != null) {
            view2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.r0(this));
        }
        this.f219833o = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.s0(this);
    }
}
