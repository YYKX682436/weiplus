package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p253x13a63b2c.p255xee01125a;

/* renamed from: com.google.android.material.circularreveal.coordinatorlayout.CircularRevealCoordinatorLayout */
/* loaded from: classes15.dex */
public class C2701x1428106e extends p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a implements ca.j {
    public final ca.d D;

    public C2701x1428106e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = new ca.d(this);
    }

    @Override // ca.j
    public void a() {
        this.D.getClass();
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
        this.D.getClass();
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        ca.d dVar = this.D;
        if (dVar != null) {
            dVar.a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    /* renamed from: getCircularRevealOverlayDrawable */
    public android.graphics.drawable.Drawable m20260x102e506c() {
        return this.D.f121290e;
    }

    @Override // ca.j
    /* renamed from: getCircularRevealScrimColor */
    public int mo14551xc357681f() {
        return this.D.b();
    }

    @Override // ca.j
    /* renamed from: getRevealInfo */
    public ca.i mo14552xa22fca11() {
        return this.D.c();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        ca.d dVar = this.D;
        return dVar != null ? dVar.d() : super.isOpaque();
    }

    @Override // ca.j
    /* renamed from: setCircularRevealOverlayDrawable */
    public void mo14553x72714ee0(android.graphics.drawable.Drawable drawable) {
        this.D.e(drawable);
    }

    @Override // ca.j
    /* renamed from: setCircularRevealScrimColor */
    public void mo14554x7324312b(int i17) {
        this.D.f(i17);
    }

    @Override // ca.j
    /* renamed from: setRevealInfo */
    public void mo14555xd054181d(ca.i iVar) {
        this.D.g(iVar);
    }
}
