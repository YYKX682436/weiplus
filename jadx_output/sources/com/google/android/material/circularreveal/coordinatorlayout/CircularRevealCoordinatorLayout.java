package com.google.android.material.circularreveal.coordinatorlayout;

/* loaded from: classes15.dex */
public class CircularRevealCoordinatorLayout extends androidx.coordinatorlayout.widget.CoordinatorLayout implements ca.j {
    public final ca.d D;

    public CircularRevealCoordinatorLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
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

    public android.graphics.drawable.Drawable getCircularRevealOverlayDrawable() {
        return this.D.f39757e;
    }

    @Override // ca.j
    public int getCircularRevealScrimColor() {
        return this.D.b();
    }

    @Override // ca.j
    public ca.i getRevealInfo() {
        return this.D.c();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        ca.d dVar = this.D;
        return dVar != null ? dVar.d() : super.isOpaque();
    }

    @Override // ca.j
    public void setCircularRevealOverlayDrawable(android.graphics.drawable.Drawable drawable) {
        this.D.e(drawable);
    }

    @Override // ca.j
    public void setCircularRevealScrimColor(int i17) {
        this.D.f(i17);
    }

    @Override // ca.j
    public void setRevealInfo(ca.i iVar) {
        this.D.g(iVar);
    }
}
