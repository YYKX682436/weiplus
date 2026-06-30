package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.tag_filled */
/* loaded from: classes16.dex */
public class C9995x4709a7 extends l95.c {

    /* renamed from: width */
    private final int f27193x6be2dc6 = 24;

    /* renamed from: height */
    private final int f27192xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                m145417xd4061a5a.moveTo(3.20696f, 12.7929f);
                m145417xd4061a5a.cubicTo(2.81643f, 13.1834f, 2.81643f, 13.8166f, 3.20696f, 14.2071f);
                m145417xd4061a5a.lineTo(9.79274f, 20.7929f);
                m145417xd4061a5a.cubicTo(10.1833f, 21.1834f, 10.8164f, 21.1834f, 11.207f, 20.7929f);
                m145417xd4061a5a.lineTo(20.707f, 11.2929f);
                m145417xd4061a5a.cubicTo(20.8945f, 11.1054f, 20.9998f, 10.851f, 20.9998f, 10.5858f);
                m145417xd4061a5a.lineTo(20.9998f, 4.0f);
                m145417xd4061a5a.cubicTo(20.9998f, 3.44772f, 20.5521f, 3.0f, 19.9998f, 3.0f);
                m145417xd4061a5a.lineTo(13.4141f, 3.0f);
                m145417xd4061a5a.cubicTo(13.1488f, 3.0f, 12.8945f, 3.10536f, 12.707f, 3.29289f);
                m145417xd4061a5a.lineTo(3.20696f, 12.7929f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(15.9998f, 10.0f);
                m145417xd4061a5a.cubicTo(17.1044f, 10.0f, 17.9998f, 9.10457f, 17.9998f, 8.0f);
                m145417xd4061a5a.cubicTo(17.9998f, 6.89543f, 17.1044f, 6.0f, 15.9998f, 6.0f);
                m145417xd4061a5a.cubicTo(14.8953f, 6.0f, 13.9998f, 6.89543f, 13.9998f, 8.0f);
                m145417xd4061a5a.cubicTo(13.9998f, 9.10457f, 14.8953f, 10.0f, 15.9998f, 10.0f);
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
