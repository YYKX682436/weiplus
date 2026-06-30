package com.google.android.material.circularreveal;

/* loaded from: classes15.dex */
public class CircularRevealFrameLayout extends android.widget.FrameLayout implements ca.j {

    /* renamed from: d, reason: collision with root package name */
    public final ca.d f44486d;

    public CircularRevealFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44486d = new ca.d(this);
    }

    @Override // ca.j
    public void a() {
        this.f44486d.getClass();
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
        this.f44486d.getClass();
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        ca.d dVar = this.f44486d;
        if (dVar != null) {
            dVar.a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public android.graphics.drawable.Drawable getCircularRevealOverlayDrawable() {
        return this.f44486d.f39757e;
    }

    @Override // ca.j
    public int getCircularRevealScrimColor() {
        return this.f44486d.b();
    }

    @Override // ca.j
    public ca.i getRevealInfo() {
        return this.f44486d.c();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        ca.d dVar = this.f44486d;
        return dVar != null ? dVar.d() : super.isOpaque();
    }

    @Override // ca.j
    public void setCircularRevealOverlayDrawable(android.graphics.drawable.Drawable drawable) {
        this.f44486d.e(drawable);
    }

    @Override // ca.j
    public void setCircularRevealScrimColor(int i17) {
        this.f44486d.f(i17);
    }

    @Override // ca.j
    public void setRevealInfo(ca.i iVar) {
        this.f44486d.g(iVar);
    }
}
