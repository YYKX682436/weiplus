package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_icon_addtag */
/* loaded from: classes16.dex */
public class C7522x65d03434 extends l95.c {

    /* renamed from: width */
    private final int f22243x6be2dc6 = 96;

    /* renamed from: height */
    private final int f22242xb7389127 = 96;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 96;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
            if (i17 == 2) {
                android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
                android.os.Looper looper = (android.os.Looper) objArr[1];
                android.graphics.Matrix m145412xe5ca94b6 = l95.c.m145412xe5ca94b6(looper);
                float[] m145413xf00d6f43 = l95.c.m145413xf00d6f43(looper);
                android.graphics.Paint m145415xacbd08c9 = l95.c.m145415xacbd08c9(looper);
                m145415xacbd08c9.setFlags(385);
                m145415xacbd08c9.setStyle(android.graphics.Paint.Style.FILL);
                android.graphics.Paint m145415xacbd08c92 = l95.c.m145415xacbd08c9(looper);
                m145415xacbd08c92.setFlags(385);
                m145415xacbd08c92.setStyle(android.graphics.Paint.Style.STROKE);
                m145415xacbd08c9.setColor(-16777216);
                m145415xacbd08c92.setStrokeWidth(1.0f);
                m145415xacbd08c92.setStrokeCap(android.graphics.Paint.Cap.BUTT);
                m145415xacbd08c92.setStrokeJoin(android.graphics.Paint.Join.MITER);
                m145415xacbd08c92.setStrokeMiter(4.0f);
                m145415xacbd08c92.setPathEffect(null);
                l95.c.m145414xacbd08c9(m145415xacbd08c92, looper).setStrokeWidth(1.0f);
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-8617851);
                canvas.save();
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 10.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(20.0f, 65.0f);
                m145417xd4061a5a.cubicTo(15.581831f, 65.0f, 12.0f, 61.418266f, 12.0f, 57.00022f);
                m145417xd4061a5a.cubicTo(12.0f, 52.581734f, 15.581831f, 49.0f, 20.0f, 49.0f);
                m145417xd4061a5a.cubicTo(24.418169f, 49.0f, 28.0f, 52.581734f, 28.0f, 57.00022f);
                m145417xd4061a5a.cubicTo(28.0f, 61.418266f, 24.418169f, 65.0f, 20.0f, 65.0f);
                m145417xd4061a5a.moveTo(75.81466f, 29.779163f);
                m145417xd4061a5a.lineTo(47.19909f, 1.1844771f);
                m145417xd4061a5a.cubicTo(45.618633f, -0.3948257f, 43.056522f, -0.3948257f, 41.476063f, 1.1844771f);
                m145417xd4061a5a.lineTo(1.252038f, 41.379147f);
                m145417xd4061a5a.cubicTo(0.3639593f, 42.26658f, -0.024743835f, 43.463757f, 0.08502881f, 44.62272f);
                m145417xd4061a5a.lineTo(0.004948767f, 44.70319f);
                m145417xd4061a5a.lineTo(0.0f, 76.91503f);
                m145417xd4061a5a.lineTo(0.08502881f, 77.0f);
                m145417xd4061a5a.cubicTo(5.8085027f, 77.0f, 23.96283f, 76.97392f, 32.275406f, 76.961334f);
                m145417xd4061a5a.lineTo(32.376633f, 76.86018f);
                m145417xd4061a5a.cubicTo(33.526546f, 76.95999f, 34.71065f, 76.57157f, 35.59063f, 75.69268f);
                m145417xd4061a5a.lineTo(75.81466f, 35.49801f);
                m145417xd4061a5a.cubicTo(77.39511f, 33.91871f, 77.39511f, 31.358015f, 75.81466f, 29.779163f);
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
