package com.tencent.mm.open_voice_control.debug;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/open_voice_control/debug/A2AVolumeBarView;", "Landroid/view/View;", "", "volume", "Ljz5/f0;", be1.x0.NAME, "", "count", "setBarCount", "width", "setBarWidth", "spacing", "setBarSpacing", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "open-voice-control-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class A2AVolumeBarView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public float f72258d;

    /* renamed from: e, reason: collision with root package name */
    public float f72259e;

    /* renamed from: f, reason: collision with root package name */
    public float f72260f;

    /* renamed from: g, reason: collision with root package name */
    public float f72261g;

    /* renamed from: h, reason: collision with root package name */
    public final float f72262h;

    /* renamed from: i, reason: collision with root package name */
    public final int f72263i;

    /* renamed from: m, reason: collision with root package name */
    public final int f72264m;

    /* renamed from: n, reason: collision with root package name */
    public int f72265n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f72266o;

    /* renamed from: p, reason: collision with root package name */
    public float[] f72267p;

    /* renamed from: q, reason: collision with root package name */
    public float[] f72268q;

    /* renamed from: r, reason: collision with root package name */
    public float[] f72269r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f72270s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.Paint f72271t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A2AVolumeBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a() {
        if (getWidth() <= 0) {
            return;
        }
        float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float f17 = this.f72259e;
        int max = java.lang.Math.max(1, (int) ((width + f17) / (this.f72258d + f17)));
        this.f72265n = max;
        float[] fArr = new float[max];
        for (int i17 = 0; i17 < max; i17++) {
            fArr[i17] = 0.0f;
        }
        this.f72267p = fArr;
        int i18 = this.f72265n;
        float[] fArr2 = new float[i18];
        for (int i19 = 0; i19 < i18; i19++) {
            fArr2[i19] = 0.0f;
        }
        this.f72268q = fArr2;
        int i27 = this.f72265n;
        this.f72269r = new float[i27];
        for (int i28 = 0; i28 < i27; i28++) {
            this.f72269r[i28] = ((i28 % 3) * 0.05f) + 0.1f;
            if (!this.f72270s) {
                this.f72267p[i28] = (float) ((java.lang.Math.random() * 0.5d) + 0.2d);
                this.f72268q[i28] = this.f72267p[i28];
            }
        }
        if (this.f72270s) {
            return;
        }
        this.f72270s = true;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f72265n == 0) {
            a();
        }
        this.f72260f = ((getHeight() - getPaddingTop()) - getPaddingBottom()) * this.f72261g;
        float f17 = 2.0f;
        float width = (getWidth() - ((this.f72265n * this.f72258d) + ((r2 - 1) * this.f72259e))) / 2.0f;
        int i17 = 0;
        if (this.f72266o) {
            int i18 = this.f72265n;
            for (int i19 = 0; i19 < i18; i19++) {
                float[] fArr = this.f72267p;
                float f18 = fArr[i19];
                float[] fArr2 = this.f72268q;
                float f19 = f18 + ((fArr2[i19] - f18) * this.f72269r[i19]);
                fArr[i19] = f19;
                if (java.lang.Math.abs(f19 - fArr2[i19]) < 0.01f) {
                    this.f72268q[i19] = (float) ((java.lang.Math.random() * 0.8d) + 0.2d);
                }
            }
        }
        int i27 = this.f72265n;
        while (i17 < i27) {
            float f27 = this.f72267p[i17] * this.f72260f;
            float f28 = (i17 * (this.f72258d + this.f72259e)) + width;
            float height = (getHeight() / f17) - (f27 / f17);
            float f29 = f28 + this.f72258d;
            float f37 = f27 + height;
            float f38 = width;
            android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(f28, height, f28, f37, this.f72263i, this.f72264m, android.graphics.Shader.TileMode.CLAMP);
            android.graphics.Paint paint = this.f72271t;
            paint.setShader(linearGradient);
            android.graphics.RectF rectF = new android.graphics.RectF(f28, height, f29, f37);
            float f39 = this.f72262h;
            canvas.drawRoundRect(rectF, f39, f39, paint);
            paint.setShader(null);
            i17++;
            i27 = i27;
            width = f38;
            f17 = 2.0f;
        }
        if (this.f72266o) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        a();
        int paddingLeft = ((int) ((this.f72265n * this.f72258d) + ((r0 - 1) * this.f72259e))) + getPaddingLeft() + getPaddingRight();
        int paddingTop = ((int) this.f72260f) + getPaddingTop() + getPaddingBottom();
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        if (mode == Integer.MIN_VALUE) {
            paddingLeft = java.lang.Math.min(android.view.View.MeasureSpec.getSize(i17), paddingLeft);
        } else if (mode == 1073741824) {
            paddingLeft = android.view.View.MeasureSpec.getSize(i17);
        }
        if (mode2 == Integer.MIN_VALUE) {
            paddingTop = java.lang.Math.min(android.view.View.MeasureSpec.getSize(i18), paddingTop);
        } else if (mode2 == 1073741824) {
            paddingTop = android.view.View.MeasureSpec.getSize(i18);
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        a();
        this.f72260f = (i18 - getPaddingTop()) - getPaddingBottom();
    }

    public final void setBarCount(int i17) {
        this.f72265n = i17;
        float[] fArr = new float[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            fArr[i18] = 0.0f;
        }
        this.f72267p = fArr;
        int i19 = this.f72265n;
        float[] fArr2 = new float[i19];
        for (int i27 = 0; i27 < i19; i27++) {
            fArr2[i27] = 0.0f;
        }
        this.f72268q = fArr2;
        int i28 = this.f72265n;
        this.f72269r = new float[i28];
        for (int i29 = 0; i29 < i28; i29++) {
            this.f72269r[i29] = ((i29 % 3) * 0.05f) + 0.1f;
        }
        requestLayout();
        invalidate();
    }

    public final void setBarSpacing(float f17) {
        this.f72259e = f17;
        a();
        invalidate();
    }

    public final void setBarWidth(float f17) {
        this.f72258d = f17;
        a();
        invalidate();
    }

    public final void setVolume(float f17) {
        this.f72261g = java.lang.Math.max(f17 * 10.0f, 1.0f);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A2AVolumeBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f72258d = 10.0f;
        this.f72259e = 8.0f;
        this.f72261g = 1.0f;
        this.f72262h = 5.0f;
        this.f72263i = -11486724;
        this.f72264m = -3872045;
        this.f72267p = new float[0];
        this.f72268q = new float[0];
        this.f72269r = new float[0];
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f72271t = paint;
    }
}
