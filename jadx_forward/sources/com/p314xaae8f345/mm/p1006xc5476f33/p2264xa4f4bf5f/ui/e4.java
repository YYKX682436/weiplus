package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class e4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f255360a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f255361b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f255362c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f255363d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f255364e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f255365f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f255366g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f255367h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f255368i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f255369j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f255370k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f255371l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f255372m;

    public e4(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f255360a = context;
        this.f255361b = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.z3(this));
        this.f255362c = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.y3(this));
        this.f255363d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.d4(this));
        this.f255364e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.v3(this));
        this.f255365f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.x3(this));
        this.f255366g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.a4(this));
        this.f255367h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.b4(this));
        this.f255370k = true;
    }

    public static final android.graphics.drawable.Drawable a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.e4 e4Var, int i17) {
        e4Var.getClass();
        try {
            android.graphics.drawable.Drawable drawable = e4Var.f255360a.getResources().getDrawable(i17);
            com.p314xaae8f345.mm.ui.uk.f(drawable, -1);
            return drawable;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TextStatus.StatusMuteButtonHelper", th6, "loadIcon failed: " + i17, new java.lang.Object[0]);
            return null;
        }
    }

    public final int b() {
        return ((java.lang.Number) ((jz5.n) this.f255362c).mo141623x754a37bb()).intValue();
    }

    public final void c(boolean z17) {
        android.widget.ImageView imageView = this.f255368i;
        if (imageView == null) {
            return;
        }
        this.f255370k = z17;
        imageView.setImageDrawable(z17 ? (android.graphics.drawable.Drawable) ((jz5.n) this.f255366g).mo141623x754a37bb() : (android.graphics.drawable.Drawable) ((jz5.n) this.f255367h).mo141623x754a37bb());
    }
}
