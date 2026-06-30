package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.magnifying_glass_medium */
/* loaded from: classes16.dex */
public class C9403x98fe8c76 extends l95.c {

    /* renamed from: width */
    private final int f26007x6be2dc6 = 24;

    /* renamed from: height */
    private final int f26006xb7389127 = 24;

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
                m145417xd4061a5a.moveTo(11.0f, 4.0f);
                m145417xd4061a5a.cubicTo(14.866f, 4.0f, 18.0f, 7.13401f, 18.0f, 11.0f);
                m145417xd4061a5a.cubicTo(18.0f, 12.6864f, 17.4037f, 14.2335f, 16.4103f, 15.442f);
                m145417xd4061a5a.lineTo(20.6344f, 19.6725f);
                m145417xd4061a5a.lineTo(19.5729f, 20.7324f);
                m145417xd4061a5a.lineTo(15.3398f, 16.4927f);
                m145417xd4061a5a.cubicTo(14.1469f, 17.4365f, 12.6392f, 18.0f, 11.0f, 18.0f);
                m145417xd4061a5a.cubicTo(7.13401f, 18.0f, 4.0f, 14.866f, 4.0f, 11.0f);
                m145417xd4061a5a.cubicTo(4.0f, 7.13401f, 7.13401f, 4.0f, 11.0f, 4.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(11.0f, 5.5f);
                m145417xd4061a5a.cubicTo(7.96243f, 5.5f, 5.5f, 7.96243f, 5.5f, 11.0f);
                m145417xd4061a5a.cubicTo(5.5f, 14.0376f, 7.96243f, 16.5f, 11.0f, 16.5f);
                m145417xd4061a5a.cubicTo(14.0376f, 16.5f, 16.5f, 14.0376f, 16.5f, 11.0f);
                m145417xd4061a5a.cubicTo(16.5f, 7.96243f, 14.0376f, 5.5f, 11.0f, 5.5f);
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
