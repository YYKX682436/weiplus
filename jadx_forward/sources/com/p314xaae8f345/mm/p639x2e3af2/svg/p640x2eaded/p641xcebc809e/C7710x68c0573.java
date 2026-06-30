package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.clock_outlined */
/* loaded from: classes16.dex */
public class C7710x68c0573 extends l95.c {

    /* renamed from: width */
    private final int f22619x6be2dc6 = 20;

    /* renamed from: height */
    private final int f22618xb7389127 = 20;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 20;
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
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(10.0f, 18.3334f);
                m145417xd4061a5a.cubicTo(5.39765f, 18.3334f, 1.66669f, 14.6024f, 1.66669f, 10.0f);
                m145417xd4061a5a.cubicTo(1.66669f, 5.39765f, 5.39765f, 1.66669f, 10.0f, 1.66669f);
                m145417xd4061a5a.cubicTo(14.6024f, 1.66669f, 18.3334f, 5.39765f, 18.3334f, 10.0f);
                m145417xd4061a5a.cubicTo(18.3334f, 14.6024f, 14.6024f, 18.3334f, 10.0f, 18.3334f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(10.0f, 17.3334f);
                m145417xd4061a5a.cubicTo(14.0501f, 17.3334f, 17.3334f, 14.0501f, 17.3334f, 10.0f);
                m145417xd4061a5a.cubicTo(17.3334f, 5.94993f, 14.0501f, 2.66669f, 10.0f, 2.66669f);
                m145417xd4061a5a.cubicTo(5.94993f, 2.66669f, 2.66669f, 5.94993f, 2.66669f, 10.0f);
                m145417xd4061a5a.cubicTo(2.66669f, 14.0501f, 5.94993f, 17.3334f, 10.0f, 17.3334f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(9.50004f, 5.00002f);
                m145417xd4061a5a.lineTo(10.5f, 5.00002f);
                m145417xd4061a5a.lineTo(10.5f, 9.58578f);
                m145417xd4061a5a.lineTo(13.7427f, 12.8285f);
                m145417xd4061a5a.lineTo(13.0356f, 13.5356f);
                m145417xd4061a5a.lineTo(9.50007f, 10.0f);
                m145417xd4061a5a.lineTo(9.50004f, 10.0f);
                m145417xd4061a5a.lineTo(9.50004f, 5.00002f);
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
