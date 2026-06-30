package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chatting_status_tick */
/* loaded from: classes16.dex */
public class C7664xe3f60151 extends l95.c {

    /* renamed from: width */
    private final int f22527x6be2dc6 = 50;

    /* renamed from: height */
    private final int f22526xb7389127 = 50;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 50;
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
        m145414xacbd08c9.setColor(-8618884);
        canvas.saveLayerAlpha(null, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5, 31);
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(23.26f, 0.0f);
        m145417xd4061a5a.lineTo(26.42f, 0.0f);
        m145417xd4061a5a.cubicTo(38.63f, 0.57f, 49.24f, 11.0f, 50.0f, 23.21f);
        m145417xd4061a5a.lineTo(50.0f, 26.5f);
        m145417xd4061a5a.cubicTo(49.44f, 38.71f, 38.94f, 49.21f, 26.78f, 50.0f);
        m145417xd4061a5a.lineTo(23.52f, 50.0f);
        m145417xd4061a5a.cubicTo(11.33f, 49.41f, 0.78f, 38.99f, 0.0f, 26.81f);
        m145417xd4061a5a.lineTo(0.0f, 23.43f);
        m145417xd4061a5a.cubicTo(0.62f, 11.24f, 11.09f, 0.77f, 23.26f, 0.0f);
        m145417xd4061a5a.lineTo(23.26f, 0.0f);
        m145417xd4061a5a.close();
        m145417xd4061a5a.moveTo(35.370926f, 15.0f);
        m145417xd4061a5a.cubicTo(30.458647f, 20.306633f, 25.646616f, 25.703379f, 20.70426f, 30.989988f);
        m145417xd4061a5a.cubicTo(18.659147f, 28.787233f, 16.654135f, 26.554443f, 14.609022f, 24.341677f);
        m145417xd4061a5a.cubicTo(13.39599f, 25.673342f, 12.192983f, 27.005007f, 11.0f, 28.346684f);
        m145417xd4061a5a.cubicTo(14.197995f, 31.931164f, 17.47619f, 35.435543f, 20.70426f, 39.0f);
        m145417xd4061a5a.cubicTo(26.8396f, 32.371716f, 32.914787f, 25.683353f, 39.0f, 19.005007f);
        m145417xd4061a5a.cubicTo(37.80702f, 17.653316f, 36.60401f, 16.321651f, 35.370926f, 15.0f);
        m145417xd4061a5a.lineTo(35.370926f, 15.0f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
        canvas.restore();
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c93.setColor(-394759);
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 11.0f, 0.0f, 1.0f, 15.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c94 = l95.c.m145414xacbd08c9(m145414xacbd08c93, looper);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(24.370928f, -1.7763568E-15f);
        m145417xd4061a5a2.cubicTo(25.60401f, 1.321652f, 26.807018f, 2.6533167f, 28.0f, 4.0050063f);
        m145417xd4061a5a2.cubicTo(21.914787f, 10.683354f, 15.839599f, 17.371716f, 9.704261f, 24.0f);
        m145417xd4061a5a2.cubicTo(6.4761906f, 20.435545f, 3.197995f, 16.931164f, 0.0f, 13.3466835f);
        m145417xd4061a5a2.cubicTo(1.1929824f, 12.005006f, 2.39599f, 10.673342f, 3.6090226f, 9.341677f);
        m145417xd4061a5a2.cubicTo(5.654135f, 11.554443f, 7.6591477f, 13.787234f, 9.704261f, 15.989987f);
        m145417xd4061a5a2.cubicTo(14.646617f, 10.70338f, 19.458647f, 5.3066335f, 24.370928f, -1.7763568E-15f);
        m145417xd4061a5a2.lineTo(24.370928f, -1.7763568E-15f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c94);
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
