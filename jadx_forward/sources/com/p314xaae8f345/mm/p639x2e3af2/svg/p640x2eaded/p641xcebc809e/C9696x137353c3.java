package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.picture_filled */
/* loaded from: classes16.dex */
public class C9696x137353c3 extends l95.c {

    /* renamed from: width */
    private final int f26593x6be2dc6 = 24;

    /* renamed from: height */
    private final int f26592xb7389127 = 24;

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
                m145417xd4061a5a.moveTo(2.9918f, 4.0f);
                m145417xd4061a5a.lineTo(21.0082f, 4.0f);
                m145417xd4061a5a.cubicTo(21.5447f, 4.0f, 22.0f, 4.48114f, 22.0f, 5.07465f);
                m145417xd4061a5a.lineTo(22.0f, 18.9254f);
                m145417xd4061a5a.cubicTo(22.0f, 19.5212f, 21.556f, 20.0f, 21.0082f, 20.0f);
                m145417xd4061a5a.lineTo(2.9918f, 20.0f);
                m145417xd4061a5a.cubicTo(2.45531f, 20.0f, 2.0f, 19.5189f, 2.0f, 18.9254f);
                m145417xd4061a5a.lineTo(2.0f, 5.07465f);
                m145417xd4061a5a.cubicTo(2.0f, 4.47885f, 2.44405f, 4.0f, 2.9918f, 4.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(20.0f, 13.6814f);
                m145417xd4061a5a.lineTo(18.2554f, 12.0951f);
                m145417xd4061a5a.cubicTo(17.8067f, 11.6924f, 17.0713f, 11.6844f, 16.6091f, 12.0775f);
                m145417xd4061a5a.lineTo(14.3269f, 14.0182f);
                m145417xd4061a5a.lineTo(9.8505f, 10.0851f);
                m145417xd4061a5a.cubicTo(9.40463f, 9.69333f, 8.6618f, 9.67518f, 8.19925f, 10.0493f);
                m145417xd4061a5a.lineTo(4.0f, 13.4452f);
                m145417xd4061a5a.lineTo(4.0f, 6.0f);
                m145417xd4061a5a.lineTo(20.0f, 6.0f);
                m145417xd4061a5a.lineTo(20.0f, 13.6814f);
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
