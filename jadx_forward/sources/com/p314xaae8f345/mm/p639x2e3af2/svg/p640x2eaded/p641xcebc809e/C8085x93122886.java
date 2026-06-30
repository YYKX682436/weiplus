package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_icon_min_window_regular */
/* loaded from: classes16.dex */
public class C8085x93122886 extends l95.c {

    /* renamed from: width */
    private final int f23369x6be2dc6 = 32;

    /* renamed from: height */
    private final int f23368xb7389127 = 32;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 32;
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
                m145417xd4061a5a.moveTo(20.3313f, 12.7998f);
                m145417xd4061a5a.lineTo(27.6646f, 5.46664f);
                m145417xd4061a5a.lineTo(26.5332f, 4.33527f);
                m145417xd4061a5a.lineTo(19.2f, 11.6685f);
                m145417xd4061a5a.lineTo(19.2f, 6.39991f);
                m145417xd4061a5a.lineTo(17.6f, 6.39991f);
                m145417xd4061a5a.lineTo(17.6f, 13.0665f);
                m145417xd4061a5a.cubicTo(17.6f, 13.8029f, 18.1969f, 14.3998f, 18.9333f, 14.3998f);
                m145417xd4061a5a.lineTo(25.5999f, 14.3998f);
                m145417xd4061a5a.lineTo(25.5999f, 12.7998f);
                m145417xd4061a5a.lineTo(20.3313f, 12.7998f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(11.6684f, 19.2021f);
                m145417xd4061a5a.lineTo(4.33521f, 26.5353f);
                m145417xd4061a5a.lineTo(5.46658f, 27.6666f);
                m145417xd4061a5a.lineTo(12.7998f, 20.3334f);
                m145417xd4061a5a.lineTo(12.7998f, 25.602f);
                m145417xd4061a5a.lineTo(14.3998f, 25.602f);
                m145417xd4061a5a.lineTo(14.3998f, 18.9354f);
                m145417xd4061a5a.cubicTo(14.3998f, 18.199f, 13.8028f, 17.6021f, 13.0664f, 17.6021f);
                m145417xd4061a5a.lineTo(6.39985f, 17.6021f);
                m145417xd4061a5a.lineTo(6.39985f, 19.2021f);
                m145417xd4061a5a.lineTo(11.6684f, 19.2021f);
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
