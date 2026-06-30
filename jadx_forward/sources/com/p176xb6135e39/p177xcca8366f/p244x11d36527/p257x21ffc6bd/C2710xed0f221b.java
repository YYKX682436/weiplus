package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd;

/* renamed from: com.google.android.material.internal.ScrimInsetsFrameLayout */
/* loaded from: classes13.dex */
public class C2710xed0f221b extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f126053d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Rect f126054e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f126055f;

    public C2710xed0f221b(android.content.Context context, android.util.AttributeSet attributeSet) {
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
        if (this.f126054e == null || (drawable = this.f126053d) == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        int i17 = this.f126054e.top;
        android.graphics.Rect rect = this.f126055f;
        rect.set(0, 0, width, i17);
        drawable.setBounds(rect);
        drawable.draw(canvas);
        rect.set(0, height - this.f126054e.bottom, width, height);
        drawable.setBounds(rect);
        drawable.draw(canvas);
        android.graphics.Rect rect2 = this.f126054e;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        drawable.setBounds(rect);
        drawable.draw(canvas);
        android.graphics.Rect rect3 = this.f126054e;
        rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
        drawable.setBounds(rect);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.graphics.drawable.Drawable drawable = this.f126053d;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.graphics.drawable.Drawable drawable = this.f126053d;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public C2710xed0f221b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f126055f = new android.graphics.Rect();
        android.content.res.TypedArray d17 = fa.d0.d(context, attributeSet, v9.a.f515660q, i17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576282v7, new int[0]);
        this.f126053d = d17.getDrawable(0);
        d17.recycle();
        setWillNotDraw(true);
        fa.x xVar = new fa.x(this);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.a1.u(this, xVar);
    }
}
