package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_poi_transmit_btn_filled */
/* loaded from: classes16.dex */
public class C8175x1704a306 extends l95.c {

    /* renamed from: width */
    private final int f23549x6be2dc6 = 72;

    /* renamed from: height */
    private final int f23548xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-16777216);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(41.1222f, 9.86273f);
                m145417xd4061a5a.lineTo(62.6361f, 31.1724f);
                m145417xd4061a5a.cubicTo(63.7227f, 32.2487f, 63.814f, 33.95f, 62.9046f, 35.1312f);
                m145417xd4061a5a.lineTo(62.6361f, 35.4353f);
                m145417xd4061a5a.lineTo(62.6361f, 35.4353f);
                m145417xd4061a5a.lineTo(41.1222f, 56.745f);
                m145417xd4061a5a.cubicTo(39.9451f, 57.911f, 38.0456f, 57.9019f, 36.8796f, 56.7248f);
                m145417xd4061a5a.cubicTo(36.3232f, 56.163f, 36.0111f, 55.4043f, 36.0111f, 54.6136f);
                m145417xd4061a5a.lineTo(36.0111f, 44.7648f);
                m145417xd4061a5a.lineTo(36.0111f, 44.7648f);
                m145417xd4061a5a.cubicTo(28.9952f, 45.3287f, 18.7549f, 49.4741f, 13.4275f, 62.4655f);
                m145417xd4061a5a.cubicTo(12.5425f, 64.6239f, 10.3713f, 64.6053f, 9.89875f, 61.8077f);
                m145417xd4061a5a.cubicTo(6.1593f, 39.6684f, 18.7549f, 24.6444f, 36.0111f, 21.9252f);
                m145417xd4061a5a.lineTo(36.0111f, 11.9941f);
                m145417xd4061a5a.cubicTo(36.0111f, 10.3373f, 37.3542f, 8.99414f, 39.0111f, 8.99414f);
                m145417xd4061a5a.cubicTo(39.8017f, 8.99414f, 40.5605f, 9.3063f, 41.1222f, 9.86273f);
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
