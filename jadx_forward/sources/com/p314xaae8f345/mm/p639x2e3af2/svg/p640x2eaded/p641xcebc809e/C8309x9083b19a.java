package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.get_location_icon */
/* loaded from: classes16.dex */
public class C8309x9083b19a extends l95.c {

    /* renamed from: width */
    private final int f23817x6be2dc6 = 60;

    /* renamed from: height */
    private final int f23816xb7389127 = 60;

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
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(25.094501f, 1.2469155f);
                m145417xd4061a5a.cubicTo(32.743237f, 3.0203025f, 39.219376f, 8.896839f, 41.072548f, 16.177034f);
                m145417xd4061a5a.cubicTo(43.13704f, 22.67836f, 41.587963f, 29.62878f, 38.076664f, 35.088516f);
                m145417xd4061a5a.cubicTo(34.412243f, 42.962852f, 28.066027f, 49.068085f, 21.099989f, 54.0f);
                m145417xd4061a5a.cubicTo(12.755159f, 48.05386f, 5.0597496f, 40.37757f, 1.127431f, 30.11181f);
                m145417xd4061a5a.cubicTo(-0.9466681f, 23.652811f, -0.27706745f, 15.399808f, 4.123315f, 9.209645f);
                m145417xd4061a5a.cubicTo(9.027383f, 3.1793966f, 17.492334f, 0.06711942f, 25.094501f, 1.2469155f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(16.216259f, 28.788422f);
                m145417xd4061a5a.cubicTo(21.350666f, 32.136604f, 29.266953f, 28.065493f, 28.989613f, 22.434635f);
                m145417xd4061a5a.cubicTo(29.309687f, 16.169382f, 22.162594f, 11.960802f, 17.280704f, 15.021884f);
                m145417xd4061a5a.cubicTo(11.992141f, 17.4383f, 11.564811f, 25.432486f, 16.216259f, 28.788422f);
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
