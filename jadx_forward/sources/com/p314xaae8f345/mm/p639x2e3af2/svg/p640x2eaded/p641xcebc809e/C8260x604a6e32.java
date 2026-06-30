package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fts_arrow_down */
/* loaded from: classes16.dex */
public class C8260x604a6e32 extends l95.c {

    /* renamed from: width */
    private final int f23719x6be2dc6 = 20;

    /* renamed from: height */
    private final int f23718xb7389127 = 10;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 20;
        }
        if (i17 == 1) {
            return 10;
        }
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
            canvas.save();
            android.graphics.Paint m145415xacbd08c93 = l95.c.m145415xacbd08c9(looper);
            m145415xacbd08c93.setFlags(385);
            m145415xacbd08c93.setStyle(android.graphics.Paint.Style.FILL);
            android.graphics.Paint m145415xacbd08c94 = l95.c.m145415xacbd08c9(looper);
            m145415xacbd08c94.setFlags(385);
            m145415xacbd08c94.setStyle(android.graphics.Paint.Style.STROKE);
            m145415xacbd08c93.setColor(-16777216);
            m145415xacbd08c94.setStrokeWidth(1.0f);
            m145415xacbd08c94.setStrokeCap(android.graphics.Paint.Cap.BUTT);
            m145415xacbd08c94.setStrokeJoin(android.graphics.Paint.Join.MITER);
            m145415xacbd08c94.setStrokeMiter(4.0f);
            m145415xacbd08c94.setPathEffect(null);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            l95.c.m145414xacbd08c9(m145415xacbd08c93, looper).setColor(-983041);
            android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a2.moveTo(0.0f, 0.0f);
            m145417xd4061a5a2.lineTo(20.0f, 0.0f);
            m145417xd4061a5a2.lineTo(20.0f, 10.0f);
            m145417xd4061a5a2.lineTo(0.0f, 10.0f);
            m145417xd4061a5a2.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            m145412xe5ca94b6.reset();
            m145412xe5ca94b6.setValues(m145419x1d8aec80);
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78184xbb881866(m145417xd4061a5a, m145412xe5ca94b6, m145417xd4061a5a2, false);
            canvas.clipPath(m145417xd4061a5a);
            canvas.restore();
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-436207616);
            android.graphics.Path m145417xd4061a5a3 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a3.moveTo(16.198f, 1.66667f);
            m145417xd4061a5a3.lineTo(17.0834f, 2.53789f);
            m145417xd4061a5a3.lineTo(10.7015f, 8.81755f);
            m145417xd4061a5a3.cubicTo(10.3123f, 9.20049f, 9.68789f, 9.20049f, 9.29871f, 8.81755f);
            m145417xd4061a5a3.lineTo(2.91675f, 2.53789f);
            m145417xd4061a5a3.lineTo(3.80216f, 1.66667f);
            m145417xd4061a5a3.lineTo(10.0001f, 7.76523f);
            m145417xd4061a5a3.lineTo(16.198f, 1.66667f);
            m145417xd4061a5a3.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a3, 2);
            canvas.drawPath(m145417xd4061a5a3, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
