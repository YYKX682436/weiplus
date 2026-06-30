package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.arrow_2_inward */
/* loaded from: classes16.dex */
public class C7382xd7d44 extends l95.c {

    /* renamed from: width */
    private final int f21963x6be2dc6 = 24;

    /* renamed from: height */
    private final int f21962xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
        }
        if (i17 != 2) {
            return 0;
        }
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
        m145417xd4061a5a.moveTo(9.80029f, 13.2017f);
        m145417xd4061a5a.cubicTo(10.3524f, 13.2019f, 10.8003f, 13.6495f, 10.8003f, 14.2017f);
        m145417xd4061a5a.lineTo(10.8003f, 19.2017f);
        m145417xd4061a5a.lineTo(9.6001f, 19.2017f);
        m145417xd4061a5a.lineTo(9.6001f, 15.2505f);
        m145417xd4061a5a.lineTo(4.1001f, 20.7495f);
        m145417xd4061a5a.lineTo(3.25146f, 19.9019f);
        m145417xd4061a5a.lineTo(8.75146f, 14.4019f);
        m145417xd4061a5a.lineTo(4.80029f, 14.4019f);
        m145417xd4061a5a.lineTo(4.80029f, 13.2017f);
        m145417xd4061a5a.lineTo(9.80029f, 13.2017f);
        m145417xd4061a5a.close();
        m145417xd4061a5a.moveTo(20.7485f, 4.1001f);
        m145417xd4061a5a.lineTo(15.2485f, 9.6001f);
        m145417xd4061a5a.lineTo(19.1997f, 9.6001f);
        m145417xd4061a5a.lineTo(19.1997f, 10.8003f);
        m145417xd4061a5a.lineTo(14.1997f, 10.8003f);
        m145417xd4061a5a.cubicTo(13.6477f, 10.8002f, 13.1999f, 10.3523f, 13.1997f, 9.80029f);
        m145417xd4061a5a.lineTo(13.1997f, 4.80029f);
        m145417xd4061a5a.lineTo(14.3999f, 4.80029f);
        m145417xd4061a5a.lineTo(14.3999f, 8.75146f);
        m145417xd4061a5a.lineTo(19.8999f, 3.25146f);
        m145417xd4061a5a.lineTo(20.7485f, 4.1001f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
