package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes10.dex */
public final class yc extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f198374d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f198375e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f198376f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.RectF f198377g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14371xe1e185e f198378h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14371xe1e185e c14371xe1e185e, android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f198378h = c14371xe1e185e;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.f198374d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.f198375e = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        this.f198376f = paint3;
        this.f198377g = new android.graphics.RectF();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14371xe1e185e c14371xe1e185e = this.f198378h;
        if (c14371xe1e185e.R) {
            int width = getWidth();
            int height = getHeight();
            if (width == 0 || height == 0) {
                return;
            }
            float f17 = c14371xe1e185e.P;
            android.graphics.RectF rectF = this.f198377g;
            float f18 = width;
            float f19 = height;
            rectF.set(f17, f17, f18 - f17, f19 - f17);
            float f27 = 2 * f17;
            float f28 = f18 - f27;
            float f29 = f19 - f27;
            float f37 = 0.0f;
            if (f28 <= 0.0f || f29 <= 0.0f) {
                return;
            }
            float f38 = c14371xe1e185e.F.f198396a;
            boolean z17 = c14371xe1e185e.B;
            float f39 = z17 ? c14371xe1e185e.I.f198396a : c14371xe1e185e.Q;
            float f47 = c14371xe1e185e.f197671J.f198396a;
            if (f47 < 0.0f) {
                f47 = 0.0f;
            }
            if (z17) {
                float f48 = c14371xe1e185e.K.f198396a;
                if (f48 >= 0.0f) {
                    f37 = f48;
                }
            }
            float f49 = f28 / 2.0f;
            float f57 = f17 + f49;
            float f58 = f29 / 2.0f;
            float f59 = f17 + f58;
            float f66 = c14371xe1e185e.f197676h;
            int[] iArr = c14371xe1e185e.f197673e;
            iArr[0] = c14371xe1e185e.b(f66);
            iArr[1] = c14371xe1e185e.b((0.33333334f + f66) % 1.0f);
            iArr[2] = c14371xe1e185e.b((f66 + 0.6666667f) % 1.0f);
            android.graphics.Paint paint = this.f198374d;
            paint.setShader(new android.graphics.LinearGradient(f57 - f49, f59, f57 + f49, f59, c14371xe1e185e.f197673e, c14371xe1e185e.f197672d, android.graphics.Shader.TileMode.CLAMP));
            paint.setStrokeWidth(f39);
            float f67 = 255;
            paint.setAlpha(e06.p.f((int) (f38 * f67), 0, 255));
            float f68 = c14371xe1e185e.f197690v;
            canvas.drawRoundRect(rectF, f68, f68, paint);
            float f69 = c14371xe1e185e.f197677i;
            int[] iArr2 = c14371xe1e185e.f197674f;
            iArr2[0] = c14371xe1e185e.b((0.6666667f + f69) % 1.0f);
            iArr2[1] = c14371xe1e185e.b(f69);
            android.graphics.Paint paint2 = this.f198375e;
            paint2.setShader(new android.graphics.LinearGradient(f57, f59 - f58, f57, f58 + f59, c14371xe1e185e.f197674f, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
            paint2.setStrokeWidth(f39);
            paint2.setAlpha(e06.p.f((int) (f47 * f38 * f67), 0, 255));
            float f76 = c14371xe1e185e.f197690v;
            canvas.drawRoundRect(rectF, f76, f76, paint2);
            if (f37 > 0.001f) {
                android.graphics.Paint paint3 = this.f198376f;
                paint3.setShader(paint.getShader());
                paint3.setAlpha(e06.p.f((int) (f37 * f67), 0, 255));
                float f77 = c14371xe1e185e.f197690v;
                canvas.drawRoundRect(rectF, f77, f77, paint3);
            }
        }
    }
}
