package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bank_remit_waiting */
/* loaded from: classes16.dex */
public class C7462xf1f06e90 extends l95.c {

    /* renamed from: width */
    private final int f22123x6be2dc6 = 120;

    /* renamed from: height */
    private final int f22122xb7389127 = 120;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 120;
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
                l95.c.m145414xacbd08c9(m145415xacbd08c92, looper).setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-15683841);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(115.8f, 60.68889f);
                m145417xd4061a5a.cubicTo(115.8f, 29.181868f, 90.81813f, 4.2f, 59.31111f, 4.2f);
                m145417xd4061a5a.cubicTo(29.181868f, 4.2f, 4.2f, 29.181868f, 4.2f, 60.68889f);
                m145417xd4061a5a.cubicTo(4.2f, 90.81813f, 29.181868f, 115.8f, 59.31111f, 115.8f);
                m145417xd4061a5a.cubicTo(90.81813f, 115.8f, 115.8f, 90.81813f, 115.8f, 60.68889f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
                canvas.restore();
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c92.setColor(-1);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(62.12374f, 65.15995f);
                m145417xd4061a5a2.lineTo(60.59251f, 27.389608f);
                m145417xd4061a5a2.cubicTo(60.57021f, 26.839443f, 60.108807f, 26.4f, 59.561615f, 26.4f);
                m145417xd4061a5a2.lineTo(55.54317f, 26.4f);
                m145417xd4061a5a2.cubicTo(55.00337f, 26.4f, 54.53443f, 26.843063f, 54.51227f, 27.389608f);
                m145417xd4061a5a2.lineTo(52.833233f, 68.80597f);
                m145417xd4061a5a2.cubicTo(52.807594f, 69.43838f, 53.077152f, 69.998924f, 53.51898f, 70.363365f);
                m145417xd4061a5a2.cubicTo(53.700817f, 70.78672f, 54.031994f, 71.146774f, 54.481876f, 71.3614f);
                m145417xd4061a5a2.lineTo(81.584015f, 84.290726f);
                m145417xd4061a5a2.cubicTo(82.09355f, 84.5338f, 82.71503f, 84.33845f, 82.98967f, 83.862755f);
                m145417xd4061a5a2.lineTo(84.3951f, 81.42847f);
                m145417xd4061a5a2.cubicTo(84.6709f, 80.95077f, 84.51857f, 80.31419f, 84.05744f, 80.00215f);
                m145417xd4061a5a2.lineTo(62.12374f, 65.15995f);
                m145417xd4061a5a2.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
                canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
