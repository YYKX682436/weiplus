package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.default_avatar_round */
/* loaded from: classes16.dex */
public class C7772x3b473466 extends l95.c {

    /* renamed from: width */
    private final int f22743x6be2dc6 = 160;

    /* renamed from: height */
    private final int f22742xb7389127 = 160;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 160;
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
        m145414xacbd08c9.setColor(-526345);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(80.0f, 0.0f);
        m145417xd4061a5a.cubicTo(124.182785f, 0.0f, 160.0f, 35.81722f, 160.0f, 80.0f);
        m145417xd4061a5a.cubicTo(160.0f, 124.182785f, 124.182785f, 160.0f, 80.0f, 160.0f);
        m145417xd4061a5a.cubicTo(35.81722f, 160.0f, 0.0f, 124.182785f, 0.0f, 80.0f);
        m145417xd4061a5a.cubicTo(0.0f, 35.81722f, 35.81722f, 0.0f, 80.0f, 0.0f);
        m145417xd4061a5a.close();
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-436207616);
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 40.0f, 0.0f, 1.0f, 40.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.saveLayerAlpha(null, 25, 31);
        canvas.save();
        android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c92, looper);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(8.333333f, 66.666664f);
        m145417xd4061a5a2.lineTo(8.333333f, 64.38488f);
        m145417xd4061a5a2.lineTo(8.333333f, 64.38488f);
        m145417xd4061a5a2.cubicTo(8.333333f, 62.10125f, 9.993836f, 59.439693f, 12.046992f, 58.437775f);
        m145417xd4061a5a2.lineTo(30.914835f, 49.230476f);
        m145417xd4061a5a2.cubicTo(33.651257f, 47.895134f, 34.28753f, 44.937542f, 32.311485f, 42.595463f);
        m145417xd4061a5a2.lineTo(31.106375f, 41.167126f);
        m145417xd4061a5a2.cubicTo(28.654392f, 38.260952f, 26.666666f, 32.831654f, 26.666666f, 29.030968f);
        m145417xd4061a5a2.lineTo(26.666666f, 23.331934f);
        m145417xd4061a5a2.cubicTo(26.666666f, 15.96891f, 32.651188f, 10.0f, 40.0f, 10.0f);
        m145417xd4061a5a2.cubicTo(47.363796f, 10.0f, 53.333332f, 15.976601f, 53.333332f, 23.334024f);
        m145417xd4061a5a2.lineTo(53.333332f, 29.033953f);
        m145417xd4061a5a2.cubicTo(53.333332f, 32.830986f, 51.33644f, 38.2762f, 48.893623f, 41.17191f);
        m145417xd4061a5a2.lineTo(47.688515f, 42.60044f);
        m145417xd4061a5a2.cubicTo(45.723442f, 44.929836f, 46.33729f, 47.894657f, 49.085163f, 49.235035f);
        m145417xd4061a5a2.lineTo(67.95301f, 58.438526f);
        m145417xd4061a5a2.cubicTo(70.004005f, 59.438976f, 71.666664f, 62.0839f, 71.666664f, 64.38488f);
        m145417xd4061a5a2.lineTo(71.666664f, 66.666664f);
        m145417xd4061a5a2.cubicTo(71.666664f, 68.507614f, 70.174286f, 70.0f, 68.333336f, 70.0f);
        m145417xd4061a5a2.lineTo(11.666667f, 70.0f);
        m145417xd4061a5a2.cubicTo(9.825718f, 70.0f, 8.333333f, 68.507614f, 8.333333f, 66.666664f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c93);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
