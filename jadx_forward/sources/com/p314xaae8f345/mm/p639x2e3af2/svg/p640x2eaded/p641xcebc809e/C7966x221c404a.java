package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.favorites_filled */
/* loaded from: classes16.dex */
public class C7966x221c404a extends l95.c {

    /* renamed from: width */
    private final int f23131x6be2dc6 = 24;

    /* renamed from: height */
    private final int f23130xb7389127 = 24;

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
                m145417xd4061a5a.moveTo(20.1991f, 6.40021f);
                m145417xd4061a5a.lineTo(12.0f, 11.134f);
                m145417xd4061a5a.lineTo(3.80086f, 6.4002f);
                m145417xd4061a5a.cubicTo(3.80086f, 6.4002f, 8.85382f, 3.50937f, 11.137f, 2.20425f);
                m145417xd4061a5a.cubicTo(11.6136f, 1.93182f, 12.3867f, 1.93202f, 12.863f, 2.20425f);
                m145417xd4061a5a.cubicTo(15.0845f, 3.4741f, 20.1991f, 6.40021f, 20.1991f, 6.40021f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(20.9896f, 7.67586f);
                m145417xd4061a5a.cubicTo(20.9896f, 7.67586f, 20.9896f, 13.5f, 21.0f, 16.1673f);
                m145417xd4061a5a.cubicTo(21.0f, 16.707f, 20.6133f, 17.3656f, 20.137f, 17.6378f);
                m145417xd4061a5a.cubicTo(17.7706f, 18.9905f, 12.75f, 21.8529f, 12.75f, 21.8529f);
                m145417xd4061a5a.lineTo(12.75f, 12.433f);
                m145417xd4061a5a.lineTo(20.9896f, 7.67586f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(11.25f, 21.8529f);
                m145417xd4061a5a.cubicTo(11.25f, 21.8529f, 6.27728f, 18.9727f, 3.86296f, 17.6378f);
                m145417xd4061a5a.cubicTo(3.38636f, 17.3654f, 3.0f, 16.7024f, 3.0f, 16.1673f);
                m145417xd4061a5a.cubicTo(3.0f, 13.4078f, 3.01026f, 7.6758f, 3.01026f, 7.6758f);
                m145417xd4061a5a.lineTo(11.25f, 12.433f);
                m145417xd4061a5a.lineTo(11.25f, 21.8529f);
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
