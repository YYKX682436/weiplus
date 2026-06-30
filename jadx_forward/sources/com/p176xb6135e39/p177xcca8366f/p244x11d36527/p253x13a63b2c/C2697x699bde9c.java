package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p253x13a63b2c;

/* renamed from: com.google.android.material.circularreveal.CircularRevealGridLayout */
/* loaded from: classes15.dex */
public class C2697x699bde9c extends android.widget.GridLayout implements ca.j {

    /* renamed from: d, reason: collision with root package name */
    public final ca.d f126020d;

    public C2697x699bde9c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f126020d = new ca.d(this);
    }

    @Override // ca.j
    public void a() {
        this.f126020d.getClass();
    }

    @Override // ca.c
    public void b(android.graphics.Canvas canvas) {
        super.draw(canvas);
    }

    @Override // ca.c
    public boolean c() {
        return super.isOpaque();
    }

    @Override // ca.j
    public void d() {
        this.f126020d.getClass();
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        ca.d dVar = this.f126020d;
        if (dVar != null) {
            dVar.a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    /* renamed from: getCircularRevealOverlayDrawable */
    public android.graphics.drawable.Drawable m20256x102e506c() {
        return this.f126020d.f121290e;
    }

    @Override // ca.j
    /* renamed from: getCircularRevealScrimColor */
    public int mo14551xc357681f() {
        return this.f126020d.b();
    }

    @Override // ca.j
    /* renamed from: getRevealInfo */
    public ca.i mo14552xa22fca11() {
        return this.f126020d.c();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        ca.d dVar = this.f126020d;
        return dVar != null ? dVar.d() : super.isOpaque();
    }

    @Override // ca.j
    /* renamed from: setCircularRevealOverlayDrawable */
    public void mo14553x72714ee0(android.graphics.drawable.Drawable drawable) {
        this.f126020d.e(drawable);
    }

    @Override // ca.j
    /* renamed from: setCircularRevealScrimColor */
    public void mo14554x7324312b(int i17) {
        this.f126020d.f(i17);
    }

    @Override // ca.j
    /* renamed from: setRevealInfo */
    public void mo14555xd054181d(ca.i iVar) {
        this.f126020d.g(iVar);
    }
}
