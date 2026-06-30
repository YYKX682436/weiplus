package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.card_empty */
/* loaded from: classes16.dex */
public class C7601x3a68d75e extends l95.c {

    /* renamed from: width */
    private final int f22401x6be2dc6 = 32;

    /* renamed from: height */
    private final int f22400xb7389127 = 32;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 32;
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
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-436207616);
                canvas.save();
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(1.6f, 5.6614323f);
                m145417xd4061a5a.lineTo(1.6f, 19.100517f);
                m145417xd4061a5a.lineTo(23.733334f, 22.012798f);
                m145417xd4061a5a.lineTo(23.733334f, 8.573713f);
                m145417xd4061a5a.lineTo(1.6f, 5.6614323f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(22.87462f, 0.8229694f);
                m145417xd4061a5a.cubicTo(23.496151f, 0.73664576f, 24.0f, 1.1719935f, 24.0f, 1.8082237f);
                m145417xd4061a5a.lineTo(24.0f, 1.8082237f);
                m145417xd4061a5a.lineTo(24.0f, 6.994067f);
                m145417xd4061a5a.lineTo(24.212105f, 7.022918f);
                m145417xd4061a5a.cubicTo(24.831343f, 7.104397f, 25.333334f, 7.6875243f, 25.333334f, 8.316016f);
                m145417xd4061a5a.lineTo(25.333334f, 22.501385f);
                m145417xd4061a5a.cubicTo(25.333334f, 23.239088f, 24.7321f, 23.758005f, 24.006971f, 23.662594f);
                m145417xd4061a5a.lineTo(1.1212294f, 20.651312f);
                m145417xd4061a5a.cubicTo(0.5019915f, 20.569834f, 0.0f, 19.986706f, 0.0f, 19.358213f);
                m145417xd4061a5a.lineTo(0.0f, 5.172845f);
                m145417xd4061a5a.lineTo(0.001f, 5.141067f);
                m145417xd4061a5a.cubicTo(0.0f, 4.5531235f, 0.43666545f, 4.008028f, 1.0023082f, 3.867489f);
                m145417xd4061a5a.lineTo(1.1253794f, 3.8436973f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(22.4f, 2.5042472f);
                m145417xd4061a5a.lineTo(6.576f, 4.702067f);
                m145417xd4061a5a.lineTo(22.399f, 6.783067f);
                m145417xd4061a5a.lineTo(22.4f, 2.5042472f);
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
