package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.location_cross_hair */
/* loaded from: classes16.dex */
public class C9356x15174b4b extends l95.c {

    /* renamed from: width */
    private final int f25913x6be2dc6 = 24;

    /* renamed from: height */
    private final int f25912xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        canvas.save();
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(-16777216);
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(20.0f, 9.285714f);
        m145417xd4061a5a.lineTo(18.535715f, 9.285714f);
        m145417xd4061a5a.cubicTo(18.196428f, 5.125f, 14.875f, 1.8035715f, 10.714286f, 1.4642857f);
        m145417xd4061a5a.lineTo(10.714286f, 0.0f);
        m145417xd4061a5a.lineTo(9.285714f, 0.0f);
        m145417xd4061a5a.lineTo(9.285714f, 1.4642857f);
        m145417xd4061a5a.cubicTo(5.125f, 1.8035715f, 1.8035715f, 5.125f, 1.4642857f, 9.285714f);
        m145417xd4061a5a.lineTo(0.0f, 9.285714f);
        m145417xd4061a5a.lineTo(0.0f, 10.714286f);
        m145417xd4061a5a.lineTo(1.4642857f, 10.714286f);
        m145417xd4061a5a.cubicTo(1.8035715f, 14.875f, 5.125f, 18.196428f, 9.285714f, 18.535715f);
        m145417xd4061a5a.lineTo(9.285714f, 20.0f);
        m145417xd4061a5a.lineTo(10.714286f, 20.0f);
        m145417xd4061a5a.lineTo(10.714286f, 18.535715f);
        m145417xd4061a5a.cubicTo(14.875f, 18.196428f, 18.196428f, 14.875f, 18.535715f, 10.714286f);
        m145417xd4061a5a.lineTo(20.0f, 10.714286f);
        m145417xd4061a5a.lineTo(20.0f, 9.285714f);
        m145417xd4061a5a.close();
        m145417xd4061a5a.moveTo(10.0f, 17.142857f);
        m145417xd4061a5a.cubicTo(6.053571f, 17.142857f, 2.857143f, 13.946428f, 2.857143f, 10.0f);
        m145417xd4061a5a.cubicTo(2.857143f, 6.053571f, 6.053571f, 2.857143f, 10.0f, 2.857143f);
        m145417xd4061a5a.cubicTo(13.946428f, 2.857143f, 17.142857f, 6.053571f, 17.142857f, 10.0f);
        m145417xd4061a5a.cubicTo(17.142857f, 13.946428f, 13.946428f, 17.142857f, 10.0f, 17.142857f);
        m145417xd4061a5a.close();
        m145417xd4061a5a.moveTo(12.857142f, 10.0f);
        m145417xd4061a5a.cubicTo(12.857142f, 11.571428f, 11.571428f, 12.857142f, 10.0f, 12.857142f);
        m145417xd4061a5a.cubicTo(8.428572f, 12.857142f, 7.142857f, 11.571428f, 7.142857f, 10.0f);
        m145417xd4061a5a.cubicTo(7.142857f, 8.428572f, 8.428572f, 7.142857f, 10.0f, 7.142857f);
        m145417xd4061a5a.cubicTo(11.571428f, 7.142857f, 12.857142f, 8.428572f, 12.857142f, 10.0f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
        canvas.restore();
        canvas.restore();
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(0.0f, 0.0f);
        m145417xd4061a5a2.lineTo(24.0f, 0.0f);
        m145417xd4061a5a2.lineTo(24.0f, 24.0f);
        m145417xd4061a5a2.lineTo(0.0f, 24.0f);
        m145417xd4061a5a2.lineTo(0.0f, 0.0f);
        m145417xd4061a5a2.close();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
