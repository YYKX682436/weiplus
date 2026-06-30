package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.radar_search_green_bg */
/* loaded from: classes16.dex */
public class C9762xfdc4e47f extends l95.c {

    /* renamed from: width */
    private final int f26727x6be2dc6 = 165;

    /* renamed from: height */
    private final int f26726xb7389127 = 74;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 165;
        }
        if (i17 == 1) {
            return 74;
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
            l95.c.m145414xacbd08c9(m145415xacbd08c92, looper).setStrokeWidth(1.0f);
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-7683054);
            float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
            m145412xe5ca94b6.reset();
            m145412xe5ca94b6.setValues(m145419x1d8aec80);
            canvas.concat(m145412xe5ca94b6);
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(87.71f, 1.02f);
            m145417xd4061a5a.cubicTo(97.18f, 0.98f, 106.65f, 1.01f, 116.11f, 1.0f);
            m145417xd4061a5a.cubicTo(122.86f, 0.94f, 129.37f, 4.23f, 133.81f, 9.23f);
            m145417xd4061a5a.cubicTo(138.87f, 14.77f, 141.51f, 22.18f, 142.0f, 29.61f);
            m145417xd4061a5a.lineTo(142.0f, 36.95f);
            m145417xd4061a5a.cubicTo(141.63f, 45.0f, 138.59f, 53.09f, 132.81f, 58.82f);
            m145417xd4061a5a.cubicTo(128.22f, 63.52f, 121.67f, 66.29f, 115.07f, 66.0f);
            m145417xd4061a5a.cubicTo(76.95f, 65.86f, 38.82f, 66.27f, 0.7f, 65.79f);
            m145417xd4061a5a.cubicTo(14.4f, 65.13f, 27.91f, 61.47f, 40.08f, 55.19f);
            m145417xd4061a5a.cubicTo(62.05f, 44.0f, 79.39f, 24.21f, 87.71f, 1.02f);
            m145417xd4061a5a.lineTo(87.71f, 1.02f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
            canvas.restore();
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
