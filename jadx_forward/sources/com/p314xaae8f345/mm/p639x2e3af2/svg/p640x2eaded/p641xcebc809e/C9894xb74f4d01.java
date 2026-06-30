package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.slide_indicator */
/* loaded from: classes16.dex */
public class C9894xb74f4d01 extends l95.c {

    /* renamed from: width */
    private final int f26991x6be2dc6 = 27;

    /* renamed from: height */
    private final int f26990xb7389127 = 32;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 27;
        }
        if (i17 == 1) {
            return 32;
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
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 2.6666667f, 0.0f, 0.16666667f, 0.0f, 2.6666667f, 0.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(-436207616);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(2.74175f, 3.97746f);
        m145417xd4061a5a.lineTo(2.2998f, 3.53552f);
        m145417xd4061a5a.lineTo(4.70768f, 1.12765f);
        m145417xd4061a5a.cubicTo(4.87023f, 0.965095f, 5.13234f, 0.963653f, 5.29633f, 1.12765f);
        m145417xd4061a5a.lineTo(7.70421f, 3.53552f);
        m145417xd4061a5a.lineTo(7.26226f, 3.97746f);
        m145417xd4061a5a.lineTo(5.00201f, 1.7172f);
        m145417xd4061a5a.lineTo(2.74175f, 3.97746f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-436207616);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(2.74175f, 8.02254f);
        m145417xd4061a5a2.lineTo(2.2998f, 8.46448f);
        m145417xd4061a5a2.lineTo(4.70768f, 10.8724f);
        m145417xd4061a5a2.cubicTo(4.87023f, 11.0349f, 5.13234f, 11.0363f, 5.29633f, 10.8724f);
        m145417xd4061a5a2.lineTo(7.70421f, 8.46448f);
        m145417xd4061a5a2.lineTo(7.26226f, 8.02254f);
        m145417xd4061a5a2.lineTo(5.00201f, 10.2828f);
        m145417xd4061a5a2.lineTo(2.74175f, 8.02254f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
