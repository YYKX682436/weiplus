package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sight_list_checkbox_unselected_red */
/* loaded from: classes16.dex */
public class C9892xcf3608c3 extends l95.c {

    /* renamed from: width */
    private final int f26987x6be2dc6 = 90;

    /* renamed from: height */
    private final int f26986xb7389127 = 90;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 90;
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
                m145414xacbd08c9.setColor(-27648);
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 11.0f, 0.0f, 1.0f, 11.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(26.4f, 1.66f);
                m145417xd4061a5a.cubicTo(42.28f, -1.94f, 59.61f, 8.21f, 64.37f, 23.75f);
                m145417xd4061a5a.cubicTo(69.73f, 39.03f, 61.77f, 57.35f, 46.96f, 63.88f);
                m145417xd4061a5a.cubicTo(32.58f, 71.02f, 13.62f, 65.47f, 5.24f, 51.82f);
                m145417xd4061a5a.cubicTo(-2.86f, 39.68f, -1.34f, 22.27f, 8.7f, 11.7f);
                m145417xd4061a5a.cubicTo(13.34f, 6.59f, 19.66f, 3.07f, 26.4f, 1.66f);
                m145417xd4061a5a.lineTo(26.4f, 1.66f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(26.42f, 4.73f);
                m145417xd4061a5a.cubicTo(22.56f, 5.59f, 18.89f, 7.26f, 15.66f, 9.55f);
                m145417xd4061a5a.cubicTo(3.91f, 17.54f, -0.47f, 34.34f, 5.99f, 47.02f);
                m145417xd4061a5a.cubicTo(12.27f, 60.81f, 29.81f, 67.79f, 43.84f, 61.97f);
                m145417xd4061a5a.cubicTo(58.14f, 56.76f, 66.51f, 39.71f, 61.68f, 25.23f);
                m145417xd4061a5a.cubicTo(57.54f, 10.62f, 41.2f, 1.03f, 26.42f, 4.73f);
                m145417xd4061a5a.lineTo(26.42f, 4.73f);
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
