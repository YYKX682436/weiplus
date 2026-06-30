package com.tencent.mapsdk.internal;

/* loaded from: classes4.dex */
public final class qq extends android.widget.LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private android.graphics.Path f51020a;

    /* renamed from: b, reason: collision with root package name */
    private android.graphics.Paint f51021b;

    /* renamed from: c, reason: collision with root package name */
    private android.graphics.Paint f51022c;

    /* renamed from: d, reason: collision with root package name */
    private android.graphics.RectF f51023d;

    /* renamed from: e, reason: collision with root package name */
    private float f51024e;

    /* renamed from: f, reason: collision with root package name */
    private float f51025f;

    /* renamed from: g, reason: collision with root package name */
    private int f51026g;

    public qq(android.content.Context context) {
        super(context);
        this.f51026g = -1;
        a();
    }

    private void a() {
        this.f51025f = getResources().getDisplayMetrics().density / 2.0f;
        this.f51020a = new android.graphics.Path();
        b();
    }

    private void b() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f51021b = paint;
        paint.setColor(this.f51026g);
        this.f51021b.setAntiAlias(true);
        this.f51021b.setStyle(android.graphics.Paint.Style.FILL);
        this.f51021b.setShadowLayer(this.f51025f, 0.0f, 0.0f, -1);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f51022c = paint2;
        paint2.setColor(this.f51026g);
        this.f51022c.setAntiAlias(true);
        this.f51022c.setStyle(android.graphics.Paint.Style.STROKE);
        this.f51022c.setShadowLayer(this.f51025f, 0.0f, 0.0f, -16777216);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int saveLayer = canvas.saveLayer(this.f51023d, null, 31);
        canvas.drawColor(this.f51026g);
        canvas.drawPath(this.f51020a, this.f51022c);
        if (android.os.Build.VERSION.SDK_INT <= 27) {
            this.f51021b.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
            canvas.drawPath(this.f51020a, this.f51021b);
        } else {
            this.f51021b.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
            android.graphics.Path path = new android.graphics.Path();
            path.addRect(0.0f, 0.0f, getWidth(), getHeight(), android.graphics.Path.Direction.CW);
            path.op(this.f51020a, android.graphics.Path.Op.DIFFERENCE);
            canvas.drawPath(path, this.f51021b);
        }
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f51023d == null) {
            this.f51023d = new android.graphics.RectF();
        }
        this.f51023d.right = getMeasuredWidth();
        this.f51023d.bottom = getMeasuredHeight();
        if (this.f51023d.width() < this.f51023d.height()) {
            this.f51024e = this.f51023d.width() / 2.0f;
        } else {
            this.f51024e = this.f51023d.height() / 2.0f;
        }
        this.f51020a.reset();
        android.graphics.Path path = this.f51020a;
        android.graphics.RectF rectF = this.f51023d;
        float f17 = this.f51024e;
        path.addRoundRect(rectF, f17, f17, android.graphics.Path.Direction.CW);
    }

    public final void setDarkStyle(boolean z17) {
        if (z17) {
            this.f51026g = android.graphics.Color.parseColor("#2C2C2C");
        } else {
            this.f51026g = -1;
        }
        b();
        invalidate();
    }

    private qq(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51026g = -1;
        a();
    }

    private void a(android.graphics.Canvas canvas) {
        if (android.os.Build.VERSION.SDK_INT <= 27) {
            this.f51021b.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
            canvas.drawPath(this.f51020a, this.f51021b);
            return;
        }
        this.f51021b.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        android.graphics.Path path = new android.graphics.Path();
        path.addRect(0.0f, 0.0f, getWidth(), getHeight(), android.graphics.Path.Direction.CW);
        path.op(this.f51020a, android.graphics.Path.Op.DIFFERENCE);
        canvas.drawPath(path, this.f51021b);
    }
}
