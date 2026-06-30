package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_post_mode_change */
/* loaded from: classes16.dex */
public class C8118x7417f047 extends l95.c {

    /* renamed from: width */
    private final int f23435x6be2dc6 = 24;

    /* renamed from: height */
    private final int f23434xb7389127 = 24;

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
                m145417xd4061a5a.moveTo(4.49905f, 10.4997f);
                m145417xd4061a5a.cubicTo(4.03757f, 10.4997f, 3.82244f, 9.92785f, 4.16949f, 9.62368f);
                m145417xd4061a5a.lineTo(9.10225f, 5.30037f);
                m145417xd4061a5a.cubicTo(9.4557f, 4.99059f, 9.96124f, 5.43851f, 9.69627f, 5.82669f);
                m145417xd4061a5a.lineTo(7.53017f, 8.99995f);
                m145417xd4061a5a.lineTo(20.0003f, 8.99995f);
                m145417xd4061a5a.lineTo(20.0003f, 10.4999f);
                m145417xd4061a5a.lineTo(6.00028f, 10.4999f);
                m145417xd4061a5a.lineTo(6.00028f, 10.4997f);
                m145417xd4061a5a.lineTo(4.49905f, 10.4997f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(19.5001f, 13.5021f);
                m145417xd4061a5a.cubicTo(19.9616f, 13.5021f, 20.1767f, 14.0739f, 19.8296f, 14.3781f);
                m145417xd4061a5a.lineTo(14.8969f, 18.7014f);
                m145417xd4061a5a.cubicTo(14.5434f, 19.0112f, 14.0379f, 18.5632f, 14.3029f, 18.1751f);
                m145417xd4061a5a.lineTo(16.469f, 15.0018f);
                m145417xd4061a5a.lineTo(3.99881f, 15.0018f);
                m145417xd4061a5a.lineTo(3.99881f, 13.5018f);
                m145417xd4061a5a.lineTo(17.9989f, 13.5018f);
                m145417xd4061a5a.lineTo(17.9989f, 13.5021f);
                m145417xd4061a5a.lineTo(19.5001f, 13.5021f);
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
