package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.radar_search_waiting */
/* loaded from: classes16.dex */
public class C9765x8422a90f extends l95.c {

    /* renamed from: width */
    private final int f26733x6be2dc6 = 48;

    /* renamed from: height */
    private final int f26732xb7389127 = 48;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 48;
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
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-1);
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 7.0f, 0.0f, 1.0f, 5.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(0.9f, 0.0f);
                m145417xd4061a5a.lineTo(34.1f, 0.0f);
                m145417xd4061a5a.cubicTo(33.86f, 7.5f, 29.44f, 14.06f, 24.1f, 19.0f);
                m145417xd4061a5a.cubicTo(29.21f, 23.71f, 33.38f, 29.87f, 34.09f, 36.94f);
                m145417xd4061a5a.cubicTo(23.03f, 37.05f, 11.96f, 37.01f, 0.9f, 36.97f);
                m145417xd4061a5a.cubicTo(1.62f, 29.89f, 5.78f, 23.72f, 10.9f, 19.01f);
                m145417xd4061a5a.cubicTo(5.57f, 14.06f, 1.14f, 7.5f, 0.9f, 0.0f);
                m145417xd4061a5a.lineTo(0.9f, 0.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(8.27f, 6.01f);
                m145417xd4061a5a.cubicTo(10.16f, 10.93f, 16.03f, 13.56f, 16.48f, 19.02f);
                m145417xd4061a5a.cubicTo(16.19f, 24.12f, 10.8f, 26.53f, 8.87f, 30.95f);
                m145417xd4061a5a.cubicTo(14.62f, 31.03f, 20.37f, 31.03f, 26.12f, 30.94f);
                m145417xd4061a5a.cubicTo(24.2f, 26.52f, 18.8f, 24.11f, 18.52f, 19.01f);
                m145417xd4061a5a.cubicTo(18.99f, 13.55f, 24.84f, 10.93f, 26.73f, 6.01f);
                m145417xd4061a5a.cubicTo(20.58f, 6.0f, 14.42f, 6.0f, 8.27f, 6.01f);
                m145417xd4061a5a.lineTo(8.27f, 6.01f);
                m145417xd4061a5a.close();
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
