package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.default_facebookapp */
/* loaded from: classes16.dex */
public class C7780x24f7c9d extends l95.c {

    /* renamed from: width */
    private final int f22759x6be2dc6 = 192;

    /* renamed from: height */
    private final int f22758xb7389127 = 192;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 192;
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
        l95.c.m145414xacbd08c9(m145415xacbd08c92, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(-12953699);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(0.0f, 0.0f);
        m145417xd4061a5a.lineTo(192.0f, 0.0f);
        m145417xd4061a5a.lineTo(192.0f, 192.0f);
        m145417xd4061a5a.lineTo(0.0f, 192.0f);
        m145417xd4061a5a.lineTo(0.0f, 0.0f);
        m145417xd4061a5a.close();
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-1);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(104.72727f, 192.0f);
        m145417xd4061a5a2.lineTo(104.72727f, 117.818184f);
        m145417xd4061a5a2.lineTo(80.0f, 117.818184f);
        m145417xd4061a5a2.lineTo(80.0f, 87.27273f);
        m145417xd4061a5a2.lineTo(104.72727f, 87.27273f);
        m145417xd4061a5a2.lineTo(104.72727f, 61.090908f);
        m145417xd4061a5a2.cubicTo(104.62603f, 44.320255f, 121.209656f, 29.09091f, 138.18182f, 29.09091f);
        m145417xd4061a5a2.lineTo(164.36363f, 29.09091f);
        m145417xd4061a5a2.lineTo(164.36363f, 58.18182f);
        m145417xd4061a5a2.lineTo(148.36363f, 58.18182f);
        m145417xd4061a5a2.cubicTo(137.98802f, 58.097572f, 133.74586f, 62.3439f, 133.81818f, 72.72727f);
        m145417xd4061a5a2.lineTo(133.81818f, 87.27273f);
        m145417xd4061a5a2.lineTo(164.36363f, 87.27273f);
        m145417xd4061a5a2.lineTo(158.54546f, 117.818184f);
        m145417xd4061a5a2.lineTo(133.81818f, 117.818184f);
        m145417xd4061a5a2.lineTo(133.81818f, 192.0f);
        m145417xd4061a5a2.lineTo(104.72727f, 192.0f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
