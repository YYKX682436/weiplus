package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* renamed from: com.tencent.mm.ui.tools.MaskImageButton */
/* loaded from: classes4.dex */
public class C22509xc04419c1 extends com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7 {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f291618f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f291619g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.RectF f291620h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f291621i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Paint f291622m;

    /* renamed from: n, reason: collision with root package name */
    public final int f291623n;

    /* renamed from: o, reason: collision with root package name */
    public int f291624o;

    /* renamed from: p, reason: collision with root package name */
    public int f291625p;

    public C22509xc04419c1(android.content.Context context) {
        super(context);
        this.f291620h = new android.graphics.RectF();
        this.f291622m = null;
        this.f291623n = 90;
        this.f291624o = 0;
        this.f291625p = 0;
        n();
    }

    public final void n() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f291622m = paint;
        paint.setColor(android.graphics.Color.argb(this.f291623n, 0, 0, 0));
        this.f291618f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f291619g = new com.p314xaae8f345.mm.ui.p2740x696c9db.b7(this);
        super.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.c7(this));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (isPressed()) {
            float paddingLeft = getPaddingLeft() + 0;
            float paddingTop = getPaddingTop() + 0;
            float paddingRight = this.f291624o - getPaddingRight();
            float paddingBottom = this.f291625p - getPaddingBottom();
            android.graphics.RectF rectF = this.f291620h;
            rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
            canvas.drawRoundRect(rectF, getMeasuredHeight() / 10, getMeasuredHeight() / 10, this.f291622m);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f291624o = getMeasuredWidth();
        this.f291625p = getMeasuredHeight();
    }

    public C22509xc04419c1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f291620h = new android.graphics.RectF();
        this.f291622m = null;
        this.f291623n = 90;
        this.f291624o = 0;
        this.f291625p = 0;
        n();
    }
}
