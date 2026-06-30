package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.biz_bubble_circle_regular */
/* loaded from: classes16.dex */
public class C7472xd0faa114 extends l95.c {

    /* renamed from: width */
    private final int f22143x6be2dc6 = 24;

    /* renamed from: height */
    private final int f22142xb7389127 = 24;

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
                m145417xd4061a5a.moveTo(8.66745f, 18.2678f);
                m145417xd4061a5a.lineTo(9.10724f, 18.3952f);
                m145417xd4061a5a.cubicTo(10.0285f, 18.662f, 11.0022f, 18.8f, 12.0f, 18.8f);
                m145417xd4061a5a.cubicTo(16.8994f, 18.8f, 20.8f, 15.4845f, 20.8f, 11.5f);
                m145417xd4061a5a.cubicTo(20.8f, 7.51548f, 16.8994f, 4.2f, 12.0f, 4.2f);
                m145417xd4061a5a.cubicTo(7.10057f, 4.2f, 3.2f, 7.51548f, 3.2f, 11.5f);
                m145417xd4061a5a.cubicTo(3.2f, 13.5759f, 4.25693f, 15.5261f, 6.10059f, 16.9114f);
                m145417xd4061a5a.lineTo(6.65126f, 17.3251f);
                m145417xd4061a5a.lineTo(6.41619f, 19.3473f);
                m145417xd4061a5a.lineTo(8.66745f, 18.2678f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(12.0f, 20.0f);
                m145417xd4061a5a.cubicTo(10.871f, 20.0f, 9.78573f, 19.841f, 8.77345f, 19.5478f);
                m145417xd4061a5a.lineTo(5.7905f, 20.9782f);
                m145417xd4061a5a.cubicTo(5.70535f, 21.019f, 5.61038f, 21.0349f, 5.51658f, 21.024f);
                m145417xd4061a5a.cubicTo(5.24229f, 20.9921f, 5.04577f, 20.7439f, 5.07766f, 20.4696f);
                m145417xd4061a5a.lineTo(5.37976f, 17.8707f);
                m145417xd4061a5a.cubicTo(3.307f, 16.3133f, 2.0f, 14.0364f, 2.0f, 11.5f);
                m145417xd4061a5a.cubicTo(2.0f, 6.80558f, 6.47715f, 3.0f, 12.0f, 3.0f);
                m145417xd4061a5a.cubicTo(17.5228f, 3.0f, 22.0f, 6.80558f, 22.0f, 11.5f);
                m145417xd4061a5a.cubicTo(22.0f, 16.1944f, 17.5228f, 20.0f, 12.0f, 20.0f);
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
