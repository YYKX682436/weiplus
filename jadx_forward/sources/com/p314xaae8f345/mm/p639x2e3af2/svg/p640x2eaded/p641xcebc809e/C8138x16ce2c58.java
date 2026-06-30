package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_star_shine */
/* loaded from: classes16.dex */
public class C8138x16ce2c58 extends l95.c {

    /* renamed from: width */
    private final int f23475x6be2dc6 = 24;

    /* renamed from: height */
    private final int f23474xb7389127 = 24;

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
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(-1);
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 0.70710677f, -0.70710677f, 12.117641f, 0.70710677f, 0.70710677f, -5.019291f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(12.1176405f, 15.899811f);
        m145417xd4061a5a.lineTo(7.188856f, 17.772009f);
        m145417xd4061a5a.cubicTo(6.898442f, 17.882322f, 6.573587f, 17.736322f, 6.463273f, 17.445908f);
        m145417xd4061a5a.cubicTo(6.414396f, 17.317232f, 6.414396f, 17.1751f, 6.463273f, 17.046425f);
        m145417xd4061a5a.lineTo(8.335471f, 12.1176405f);
        m145417xd4061a5a.lineTo(8.335471f, 12.1176405f);
        m145417xd4061a5a.lineTo(6.463273f, 7.188856f);
        m145417xd4061a5a.cubicTo(6.352959f, 6.898442f, 6.49896f, 6.573587f, 6.7893744f, 6.463273f);
        m145417xd4061a5a.cubicTo(6.91805f, 6.414396f, 7.0601807f, 6.414396f, 7.188856f, 6.463273f);
        m145417xd4061a5a.lineTo(12.1176405f, 8.335471f);
        m145417xd4061a5a.lineTo(12.1176405f, 8.335471f);
        m145417xd4061a5a.lineTo(17.046425f, 6.463273f);
        m145417xd4061a5a.cubicTo(17.33684f, 6.352959f, 17.661694f, 6.49896f, 17.772009f, 6.7893744f);
        m145417xd4061a5a.cubicTo(17.820885f, 6.91805f, 17.820885f, 7.0601807f, 17.772009f, 7.188856f);
        m145417xd4061a5a.lineTo(15.899811f, 12.1176405f);
        m145417xd4061a5a.lineTo(15.899811f, 12.1176405f);
        m145417xd4061a5a.lineTo(17.772009f, 17.046425f);
        m145417xd4061a5a.cubicTo(17.882322f, 17.33684f, 17.736322f, 17.661694f, 17.445908f, 17.772009f);
        m145417xd4061a5a.cubicTo(17.317232f, 17.820885f, 17.1751f, 17.820885f, 17.046425f, 17.772009f);
        m145417xd4061a5a.lineTo(12.1176405f, 15.899811f);
        m145417xd4061a5a.lineTo(12.1176405f, 15.899811f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
