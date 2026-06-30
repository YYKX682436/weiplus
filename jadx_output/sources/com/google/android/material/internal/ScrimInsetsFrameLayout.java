package com.google.android.material.internal;

/* loaded from: classes13.dex */
public class ScrimInsetsFrameLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f44520d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Rect f44521e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f44522f;

    public ScrimInsetsFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(n3.g3 g3Var) {
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable;
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f44521e == null || (drawable = this.f44520d) == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        int i17 = this.f44521e.top;
        android.graphics.Rect rect = this.f44522f;
        rect.set(0, 0, width, i17);
        drawable.setBounds(rect);
        drawable.draw(canvas);
        rect.set(0, height - this.f44521e.bottom, width, height);
        drawable.setBounds(rect);
        drawable.draw(canvas);
        android.graphics.Rect rect2 = this.f44521e;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        drawable.setBounds(rect);
        drawable.draw(canvas);
        android.graphics.Rect rect3 = this.f44521e;
        rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
        drawable.setBounds(rect);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.graphics.drawable.Drawable drawable = this.f44520d;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.graphics.drawable.Drawable drawable = this.f44520d;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public ScrimInsetsFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f44522f = new android.graphics.Rect();
        android.content.res.TypedArray d17 = fa.d0.d(context, attributeSet, v9.a.f434127q, i17, com.tencent.mm.R.style.f494749v7, new int[0]);
        this.f44520d = d17.getDrawable(0);
        d17.recycle();
        setWillNotDraw(true);
        fa.x xVar = new fa.x(this);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.a1.u(this, xVar);
    }
}
