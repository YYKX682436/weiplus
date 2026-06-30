package com.google.android.material.circularreveal;

/* loaded from: classes15.dex */
public class CircularRevealLinearLayout extends android.widget.LinearLayout implements ca.j {

    /* renamed from: d, reason: collision with root package name */
    public final ca.d f44488d;

    public CircularRevealLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44488d = new ca.d(this);
    }

    @Override // ca.j
    public void a() {
        this.f44488d.getClass();
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
        this.f44488d.getClass();
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        ca.d dVar = this.f44488d;
        if (dVar != null) {
            dVar.a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public android.graphics.drawable.Drawable getCircularRevealOverlayDrawable() {
        return this.f44488d.f39757e;
    }

    @Override // ca.j
    public int getCircularRevealScrimColor() {
        return this.f44488d.b();
    }

    @Override // ca.j
    public ca.i getRevealInfo() {
        return this.f44488d.c();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        ca.d dVar = this.f44488d;
        return dVar != null ? dVar.d() : super.isOpaque();
    }

    @Override // ca.j
    public void setCircularRevealOverlayDrawable(android.graphics.drawable.Drawable drawable) {
        this.f44488d.e(drawable);
    }

    @Override // ca.j
    public void setCircularRevealScrimColor(int i17) {
        this.f44488d.f(i17);
    }

    @Override // ca.j
    public void setRevealInfo(ca.i iVar) {
        this.f44488d.g(iVar);
    }
}
