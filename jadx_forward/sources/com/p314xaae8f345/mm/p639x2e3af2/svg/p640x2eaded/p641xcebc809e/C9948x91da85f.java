package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sns_shoot_location_pressed */
/* loaded from: classes16.dex */
public class C9948x91da85f extends l95.c {

    /* renamed from: width */
    private final int f27099x6be2dc6 = 60;

    /* renamed from: height */
    private final int f27098xb7389127 = 60;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 60;
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
                m145414xacbd08c9.setColor(-12206054);
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(4.24f, 9.3f);
                m145417xd4061a5a.cubicTo(8.92f, 2.94f, 17.39f, -0.19f, 25.1f, 1.41f);
                m145417xd4061a5a.cubicTo(32.66f, 2.78f, 39.15f, 8.72f, 41.17f, 16.14f);
                m145417xd4061a5a.cubicTo(43.04f, 22.59f, 41.49f, 29.57f, 38.39f, 35.38f);
                m145417xd4061a5a.cubicTo(34.3f, 42.96f, 27.97f, 49.1f, 21.0f, 54.04f);
                m145417xd4061a5a.cubicTo(12.64f, 48.07f, 4.94f, 40.33f, 1.47f, 30.46f);
                m145417xd4061a5a.cubicTo(-1.06f, 23.52f, -0.39f, 15.22f, 4.24f, 9.3f);
                m145417xd4061a5a.lineTo(4.24f, 9.3f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(17.121176f, 14.014381f);
                m145417xd4061a5a.cubicTo(11.980267f, 16.542173f, 11.574966f, 24.57351f, 16.44923f, 27.602592f);
                m145417xd4061a5a.cubicTo(21.355494f, 31.324953f, 29.25884f, 27.197294f, 28.949532f, 21.032469f);
                m145417xd4061a5a.cubicTo(29.25884f, 15.198284f, 22.102098f, 10.963966f, 17.121176f, 14.014381f);
                m145417xd4061a5a.lineTo(17.121176f, 14.014381f);
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
