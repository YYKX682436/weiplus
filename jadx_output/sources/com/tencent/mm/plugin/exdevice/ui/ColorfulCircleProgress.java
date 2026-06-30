package com.tencent.mm.plugin.exdevice.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/exdevice/ui/ColorfulCircleProgress;", "Landroid/view/View;", "", "d", "I", "getAnimateDuration", "()I", "setAnimateDuration", "(I)V", "animateDuration", "e", "getOutDestDegree", "setOutDestDegree", "outDestDegree", "f", "getMidDestDegree", "setMidDestDegree", "midDestDegree", "g", "getInnerDestDegree", "setInnerDestDegree", "innerDestDegree", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class ColorfulCircleProgress extends android.view.View {
    public final android.graphics.Paint A;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int animateDuration;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int outDestDegree;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int midDestDegree;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int innerDestDegree;

    /* renamed from: h, reason: collision with root package name */
    public final int f99146h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f99147i;

    /* renamed from: m, reason: collision with root package name */
    public final int f99148m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f99149n;

    /* renamed from: o, reason: collision with root package name */
    public final int f99150o;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f99151p;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f99152q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.RectF f99153r;

    /* renamed from: s, reason: collision with root package name */
    public float f99154s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.Paint f99155t;

    /* renamed from: u, reason: collision with root package name */
    public float f99156u;

    /* renamed from: v, reason: collision with root package name */
    public final android.graphics.Matrix f99157v;

    /* renamed from: w, reason: collision with root package name */
    public float f99158w;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Paint f99159x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.Paint f99160y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.Paint f99161z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorfulCircleProgress(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.animateDuration = 500;
        this.f99153r = new android.graphics.RectF();
        this.f99157v = new android.graphics.Matrix();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f99159x = paint;
        this.f99160y = new android.graphics.Paint();
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f99161z = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.A = paint3;
        setLayerType(1, null);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, bi0.a.f20976a);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        obtainStyledAttributes.getBoolean(0, false);
        int color = obtainStyledAttributes.getColor(8, getResources().getColor(com.tencent.mm.R.color.a0p));
        int color2 = obtainStyledAttributes.getColor(7, getResources().getColor(com.tencent.mm.R.color.a0q));
        this.f99146h = obtainStyledAttributes.getColor(9, getResources().getColor(com.tencent.mm.R.color.a0r));
        this.f99147i = new int[]{color, color2};
        int color3 = obtainStyledAttributes.getColor(5, getResources().getColor(com.tencent.mm.R.color.f479407ye));
        int color4 = obtainStyledAttributes.getColor(4, getResources().getColor(com.tencent.mm.R.color.f479406yd));
        this.f99148m = obtainStyledAttributes.getColor(6, getResources().getColor(com.tencent.mm.R.color.f479408yf));
        this.f99149n = new int[]{color3, color4};
        int color5 = obtainStyledAttributes.getColor(2, getResources().getColor(com.tencent.mm.R.color.f479275ur));
        int color6 = obtainStyledAttributes.getColor(1, getResources().getColor(com.tencent.mm.R.color.f479274uq));
        this.f99150o = obtainStyledAttributes.getColor(3, getResources().getColor(com.tencent.mm.R.color.f479276us));
        this.f99151p = new int[]{color5, color6};
        obtainStyledAttributes.recycle();
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.f99155t = paint4;
        paint4.setStyle(android.graphics.Paint.Style.STROKE);
        paint4.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint2.setColor(getResources().getColor(com.tencent.mm.R.color.f478717f8));
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.OVERLAY));
        paint2.setAntiAlias(true);
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setAntiAlias(true);
        paint3.setColor(getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9));
        this.f99152q = new int[]{getResources().getColor(com.tencent.mm.R.color.f478712f3), getResources().getColor(com.tencent.mm.R.color.f478712f3), getResources().getColor(com.tencent.mm.R.color.f478712f3)};
        kotlin.jvm.internal.o.f(android.animation.ValueAnimator.ofFloat(0.0f, 1.0f), "ofFloat(...)");
    }

    public static void b(com.tencent.mm.plugin.exdevice.ui.ColorfulCircleProgress colorfulCircleProgress, android.graphics.Canvas canvas, int[] iArr, float f17, float f18, float f19, int i17, java.lang.Object obj) {
        float f27 = (i17 & 16) != 0 ? -90.0f : f19;
        float f28 = colorfulCircleProgress.f99154s / 2;
        float[] fArr = {0.0f, f18 / 360.0f};
        if (f18 > 360.0f) {
            fArr[1] = 1.0f;
        }
        android.graphics.SweepGradient sweepGradient = new android.graphics.SweepGradient(f28, f28, iArr, fArr);
        android.graphics.Matrix matrix = colorfulCircleProgress.f99157v;
        if (f18 > 360.0f) {
            matrix.setRotate((f18 - com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) + f27, f28, f28);
        } else {
            matrix.setRotate(f27, f28, f28);
        }
        sweepGradient.setLocalMatrix(matrix);
        android.graphics.Paint paint = colorfulCircleProgress.f99155t;
        paint.setShader(sweepGradient);
        android.graphics.RectF rectF = colorfulCircleProgress.f99153r;
        float f29 = colorfulCircleProgress.f99154s - f17;
        rectF.set(f17, f17, f29, f29);
        if (f18 <= 360.0f) {
            if (canvas != null) {
                canvas.drawArc(rectF, f27, f18, false, paint);
            }
            colorfulCircleProgress.c(canvas, rectF, f28 - f17, 0.0f, iArr[0], false);
        } else if (canvas != null) {
            canvas.drawArc(rectF, f27 + (f18 - com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1), 360.0f, false, paint);
        }
        if (iArr.length == 1) {
            return;
        }
        colorfulCircleProgress.c(canvas, rectF, f28 - f17, f18, iArr[1], false);
    }

    public final void a(android.graphics.Canvas canvas, int i17, float f17, float f18, float f19) {
        android.graphics.RectF rectF = this.f99153r;
        float f27 = this.f99154s;
        rectF.set(f17, f17, f27 - f17, f27 - f17);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(i17);
        paint.setStrokeWidth(this.f99158w);
        if (canvas != null) {
            canvas.drawArc(rectF, f19, f18, false, paint);
        }
    }

    public final void c(android.graphics.Canvas canvas, android.graphics.RectF rectF, float f17, float f18, int i17, boolean z17) {
        if (z17) {
            double d17 = ((f18 - 90.0f) + 5) * 0.017453292519943295d;
            float f19 = 2;
            double d18 = f17;
            float width = (float) (rectF.left + (rectF.width() / f19) + (java.lang.Math.cos(d17) * d18));
            float height = (float) (rectF.top + (rectF.height() / 2.0f) + (d18 * java.lang.Math.sin(d17)));
            android.graphics.RadialGradient radialGradient = new android.graphics.RadialGradient(width, height, this.f99158w / f19, this.f99152q, (float[]) null, android.graphics.Shader.TileMode.CLAMP);
            android.graphics.Paint paint = this.f99160y;
            paint.setShader(radialGradient);
            if (canvas != null) {
                canvas.drawCircle(width, height, this.f99158w / f19, paint);
            }
        }
        double d19 = (f18 - 90.0f) * 0.017453292519943295d;
        android.graphics.Paint paint2 = this.f99159x;
        paint2.setColor(i17);
        if (canvas != null) {
            double d27 = f17;
            canvas.drawCircle((float) (rectF.left + (rectF.width() / r9) + (java.lang.Math.cos(d19) * d27)), (float) (rectF.top + (rectF.height() / 2.0f) + (d27 * java.lang.Math.sin(d19))), this.f99158w / 2, paint2);
        }
    }

    public final int getAnimateDuration() {
        return this.animateDuration;
    }

    public final int getInnerDestDegree() {
        return this.innerDestDegree;
    }

    public final int getMidDestDegree() {
        return this.midDestDegree;
    }

    public final int getOutDestDegree() {
        return this.outDestDegree;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        float f17 = this.f99154s;
        float f18 = 2;
        canvas.drawCircle(f17 / f18, f17 / f18, f17 / f18, this.f99161z);
        if (this.outDestDegree < 360) {
            a(canvas, this.f99146h, this.f99158w / f18, 360.0f, 0.0f);
        }
        b(this, canvas, this.f99147i, this.f99158w / f18, this.outDestDegree, 0.0f, 16, null);
        float f19 = this.f99158w;
        float f27 = (f19 / 2.0f) + f19 + this.f99156u;
        int i17 = this.midDestDegree;
        if (i17 < 360) {
            a(canvas, this.f99148m, f27, i17 + 360.0f, (i17 - 90.0f) + f19);
        }
        b(this, canvas, this.f99149n, f27, this.midDestDegree, 0.0f, 16, null);
        float f28 = this.f99158w;
        float f29 = this.f99156u;
        float f37 = (f18 * f28) + (f28 / 2.0f) + f29 + f29;
        int i18 = this.innerDestDegree;
        if (i18 < 360) {
            a(canvas, this.f99150o, f37, i18 + 360.0f, (i18 - 90.0f) + f28);
        }
        b(this, canvas, this.f99151p, f37, this.innerDestDegree, 0.0f, 16, null);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        if (measuredWidth > measuredHeight) {
            measuredWidth = measuredHeight;
        }
        this.f99154s = measuredWidth;
        float f17 = (float) (measuredWidth * 0.12d);
        this.f99158w = f17;
        this.f99156u = measuredWidth * 0.03f;
        this.f99155t.setStrokeWidth(f17);
        this.A.setStrokeWidth(this.f99158w);
    }

    public final void setAnimateDuration(int i17) {
        this.animateDuration = i17;
    }

    public final void setInnerDestDegree(int i17) {
        this.innerDestDegree = i17;
    }

    public final void setMidDestDegree(int i17) {
        this.midDestDegree = i17;
    }

    public final void setOutDestDegree(int i17) {
        this.outDestDegree = i17;
    }
}
