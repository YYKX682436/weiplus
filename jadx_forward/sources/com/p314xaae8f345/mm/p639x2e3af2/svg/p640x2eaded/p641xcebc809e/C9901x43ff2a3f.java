package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sns_ad_feedback_checkmark_circle */
/* loaded from: classes16.dex */
public class C9901x43ff2a3f extends l95.c {

    /* renamed from: width */
    private final int f27005x6be2dc6 = 64;

    /* renamed from: height */
    private final int f27004xb7389127 = 64;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 64;
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
                m145414xacbd08c9.setColor(-16268960);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(5.33325f, 32.0f);
                m145417xd4061a5a.cubicTo(5.33325f, 46.7276f, 17.2723f, 58.6667f, 31.9999f, 58.6667f);
                m145417xd4061a5a.cubicTo(46.7275f, 58.6667f, 58.6666f, 46.7276f, 58.6666f, 32.0f);
                m145417xd4061a5a.cubicTo(58.6666f, 17.2724f, 46.7275f, 5.33337f, 31.9999f, 5.33337f);
                m145417xd4061a5a.cubicTo(17.2723f, 5.33337f, 5.33325f, 17.2724f, 5.33325f, 32.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(43.7939f, 22.7734f);
                m145417xd4061a5a.lineTo(28.8624f, 37.7049f);
                m145417xd4061a5a.lineTo(21.4867f, 30.3292f);
                m145417xd4061a5a.lineTo(18.6666f, 33.1493f);
                m145417xd4061a5a.lineTo(28.1614f, 42.6509f);
                m145417xd4061a5a.cubicTo(28.5518f, 43.0416f, 29.1851f, 43.0418f, 29.5757f, 42.6513f);
                m145417xd4061a5a.lineTo(46.6273f, 25.6068f);
                m145417xd4061a5a.lineTo(43.7939f, 22.7734f);
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
