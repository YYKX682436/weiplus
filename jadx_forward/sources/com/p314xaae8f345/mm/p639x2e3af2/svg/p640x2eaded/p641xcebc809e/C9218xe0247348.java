package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_verify_back */
/* loaded from: classes16.dex */
public class C9218xe0247348 extends l95.c {

    /* renamed from: width */
    private final int f25635x6be2dc6 = 28;

    /* renamed from: height */
    private final int f25634xb7389127 = 28;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 28;
        }
        if (i17 != 2) {
            return 0;
        }
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
        m145414xacbd08c9.setColor(-1);
        canvas.save();
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 2.333333f, 0.0f, 1.0f, 2.333333f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(11.666667f, 0.0f);
        m145417xd4061a5a.cubicTo(18.10999f, 0.0f, 23.333334f, 5.223345f, 23.333334f, 11.666667f);
        m145417xd4061a5a.cubicTo(23.333334f, 18.10999f, 18.10999f, 23.333334f, 11.666667f, 23.333334f);
        m145417xd4061a5a.cubicTo(5.223345f, 23.333334f, 0.0f, 18.10999f, 0.0f, 11.666667f);
        m145417xd4061a5a.cubicTo(0.0f, 5.223345f, 5.223345f, 0.0f, 11.666667f, 0.0f);
        m145417xd4061a5a.close();
        m145417xd4061a5a.moveTo(12.778577f, 6.4166665f);
        m145417xd4061a5a.lineTo(8.384757f, 10.947684f);
        m145417xd4061a5a.cubicTo(8.006012f, 11.338256f, 7.9996977f, 11.988565f, 8.384757f, 12.385649f);
        m145417xd4061a5a.lineTo(8.384757f, 12.385649f);
        m145417xd4061a5a.lineTo(12.778577f, 16.916666f);
        m145417xd4061a5a.lineTo(13.99829f, 15.677083f);
        m145417xd4061a5a.lineTo(10.12697f, 11.666667f);
        m145417xd4061a5a.lineTo(13.99829f, 7.65625f);
        m145417xd4061a5a.lineTo(12.778577f, 6.4166665f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
