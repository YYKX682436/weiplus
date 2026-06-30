package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.searchbar_icon */
/* loaded from: classes16.dex */
public class C9842x14124acd extends l95.c {

    /* renamed from: width */
    private final int f26887x6be2dc6 = 96;

    /* renamed from: height */
    private final int f26886xb7389127 = 96;

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
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-5592406);
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 18.0f, 0.0f, 1.0f, 18.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(3.35f, 12.4f);
                m145417xd4061a5a.cubicTo(7.25f, 5.36f, 14.93f, 0.63f, 22.96f, 0.27f);
                m145417xd4061a5a.cubicTo(31.48f, -0.27f, 40.05f, 4.2f, 44.53f, 11.46f);
                m145417xd4061a5a.cubicTo(49.92f, 19.74f, 49.24f, 31.19f, 43.22f, 38.97f);
                m145417xd4061a5a.cubicTo(48.42f, 44.2f, 53.65f, 49.4f, 58.86f, 54.62f);
                m145417xd4061a5a.cubicTo(57.46f, 56.07f, 56.03f, 57.5f, 54.53f, 58.84f);
                m145417xd4061a5a.cubicTo(49.4f, 53.57f, 44.14f, 48.41f, 38.95f, 43.2f);
                m145417xd4061a5a.cubicTo(34.16f, 46.84f, 28.05f, 48.71f, 22.04f, 48.11f);
                m145417xd4061a5a.cubicTo(13.48f, 47.41f, 5.55f, 41.7f, 2.22f, 33.77f);
                m145417xd4061a5a.cubicTo(-0.77f, 26.99f, -0.35f, 18.82f, 3.35f, 12.4f);
                m145417xd4061a5a.lineTo(3.35f, 12.4f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(22.25f, 6.34f);
                m145417xd4061a5a.cubicTo(12.73f, 7.14f, 5.11f, 16.55f, 6.33f, 26.04f);
                m145417xd4061a5a.cubicTo(7.03f, 35.6f, 16.43f, 43.3f, 25.94f, 42.13f);
                m145417xd4061a5a.cubicTo(35.7f, 41.45f, 43.55f, 31.72f, 42.08f, 22.03f);
                m145417xd4061a5a.cubicTo(41.15f, 12.55f, 31.71f, 5.05f, 22.25f, 6.34f);
                m145417xd4061a5a.lineTo(22.25f, 6.34f);
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
