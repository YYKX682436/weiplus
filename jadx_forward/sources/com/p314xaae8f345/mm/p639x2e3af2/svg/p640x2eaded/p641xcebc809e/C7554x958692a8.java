package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_messenger */
/* loaded from: classes16.dex */
public class C7554x958692a8 extends l95.c {

    /* renamed from: width */
    private final int f22307x6be2dc6 = 144;

    /* renamed from: height */
    private final int f22306xb7389127 = 144;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 144;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
            if (i17 == 2) {
                android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
                android.os.Looper looper = (android.os.Looper) objArr[1];
                l95.c.m145412xe5ca94b6(looper);
                l95.c.m145413xf00d6f43(looper);
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
                m145414xacbd08c9.setColor(-9276814);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(32.316944f, 114.45962f);
                m145417xd4061a5a.cubicTo(17.49707f, 103.41242f, 8.0f, 86.3897f, 8.0f, 67.29348f);
                m145417xd4061a5a.cubicTo(8.0f, 33.99431f, 36.877632f, 7.0f, 72.5f, 7.0f);
                m145417xd4061a5a.cubicTo(108.12237f, 7.0f, 137.0f, 33.99431f, 137.0f, 67.29348f);
                m145417xd4061a5a.cubicTo(137.0f, 100.59264f, 108.12237f, 127.58696f, 72.5f, 127.58696f);
                m145417xd4061a5a.cubicTo(66.06798f, 127.58696f, 59.85585f, 126.70688f, 53.993908f, 125.06851f);
                m145417xd4061a5a.lineTo(32.316944f, 136.89055f);
                m145417xd4061a5a.lineTo(32.316944f, 114.45962f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(30.467037f, 88.38713f);
                m145417xd4061a5a.lineTo(66.017456f, 50.875744f);
                m145417xd4061a5a.lineTo(82.72663f, 68.6543f);
                m145417xd4061a5a.lineTo(114.75198f, 50.19022f);
                m145417xd4061a5a.lineTo(79.51087f, 88.32609f);
                m145417xd4061a5a.lineTo(63.189262f, 70.64465f);
                m145417xd4061a5a.lineTo(30.467037f, 88.38713f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
