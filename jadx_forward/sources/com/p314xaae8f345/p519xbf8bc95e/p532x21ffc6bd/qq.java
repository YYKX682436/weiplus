package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes4.dex */
public final class qq extends android.widget.LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private android.graphics.Path f132553a;

    /* renamed from: b, reason: collision with root package name */
    private android.graphics.Paint f132554b;

    /* renamed from: c, reason: collision with root package name */
    private android.graphics.Paint f132555c;

    /* renamed from: d, reason: collision with root package name */
    private android.graphics.RectF f132556d;

    /* renamed from: e, reason: collision with root package name */
    private float f132557e;

    /* renamed from: f, reason: collision with root package name */
    private float f132558f;

    /* renamed from: g, reason: collision with root package name */
    private int f132559g;

    public qq(android.content.Context context) {
        super(context);
        this.f132559g = -1;
        a();
    }

    private void a() {
        this.f132558f = getResources().getDisplayMetrics().density / 2.0f;
        this.f132553a = new android.graphics.Path();
        b();
    }

    private void b() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f132554b = paint;
        paint.setColor(this.f132559g);
        this.f132554b.setAntiAlias(true);
        this.f132554b.setStyle(android.graphics.Paint.Style.FILL);
        this.f132554b.setShadowLayer(this.f132558f, 0.0f, 0.0f, -1);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f132555c = paint2;
        paint2.setColor(this.f132559g);
        this.f132555c.setAntiAlias(true);
        this.f132555c.setStyle(android.graphics.Paint.Style.STROKE);
        this.f132555c.setShadowLayer(this.f132558f, 0.0f, 0.0f, -16777216);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int saveLayer = canvas.saveLayer(this.f132556d, null, 31);
        canvas.drawColor(this.f132559g);
        canvas.drawPath(this.f132553a, this.f132555c);
        if (android.os.Build.VERSION.SDK_INT <= 27) {
            this.f132554b.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
            canvas.drawPath(this.f132553a, this.f132554b);
        } else {
            this.f132554b.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
            android.graphics.Path path = new android.graphics.Path();
            path.addRect(0.0f, 0.0f, getWidth(), getHeight(), android.graphics.Path.Direction.CW);
            path.op(this.f132553a, android.graphics.Path.Op.DIFFERENCE);
            canvas.drawPath(path, this.f132554b);
        }
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f132556d == null) {
            this.f132556d = new android.graphics.RectF();
        }
        this.f132556d.right = getMeasuredWidth();
        this.f132556d.bottom = getMeasuredHeight();
        if (this.f132556d.width() < this.f132556d.height()) {
            this.f132557e = this.f132556d.width() / 2.0f;
        } else {
            this.f132557e = this.f132556d.height() / 2.0f;
        }
        this.f132553a.reset();
        android.graphics.Path path = this.f132553a;
        android.graphics.RectF rectF = this.f132556d;
        float f17 = this.f132557e;
        path.addRoundRect(rectF, f17, f17, android.graphics.Path.Direction.CW);
    }

    /* renamed from: setDarkStyle */
    public final void m36939xecb3a999(boolean z17) {
        if (z17) {
            this.f132559g = android.graphics.Color.parseColor("#2C2C2C");
        } else {
            this.f132559g = -1;
        }
        b();
        invalidate();
    }

    private qq(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f132559g = -1;
        a();
    }

    private void a(android.graphics.Canvas canvas) {
        if (android.os.Build.VERSION.SDK_INT <= 27) {
            this.f132554b.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
            canvas.drawPath(this.f132553a, this.f132554b);
            return;
        }
        this.f132554b.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        android.graphics.Path path = new android.graphics.Path();
        path.addRect(0.0f, 0.0f, getWidth(), getHeight(), android.graphics.Path.Direction.CW);
        path.op(this.f132553a, android.graphics.Path.Op.DIFFERENCE);
        canvas.drawPath(path, this.f132554b);
    }
}
