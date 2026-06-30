package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.refresh_regular */
/* loaded from: classes16.dex */
public class C9795x19dd4e38 extends l95.c {

    /* renamed from: width */
    private final int f26793x6be2dc6 = 24;

    /* renamed from: height */
    private final int f26792xb7389127 = 24;

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
        m145417xd4061a5a.moveTo(13.3033f, 5.18198f);
        m145417xd4061a5a.cubicTo(13.4986f, 4.98672f, 13.4986f, 4.67014f, 13.3033f, 4.47487f);
        m145417xd4061a5a.lineTo(10.8284f, 2.0f);
        m145417xd4061a5a.lineTo(9.9799f, 2.84853f);
        m145417xd4061a5a.lineTo(11.1692f, 4.03784f);
        m145417xd4061a5a.cubicTo(6.58809f, 4.45713f, 3.0f, 8.30954f, 3.0f, 13.0f);
        m145417xd4061a5a.cubicTo(3.0f, 17.9706f, 7.02944f, 22.0f, 12.0f, 22.0f);
        m145417xd4061a5a.cubicTo(16.9706f, 22.0f, 21.0f, 17.9706f, 21.0f, 13.0f);
        m145417xd4061a5a.cubicTo(21.0f, 10.5147f, 19.9926f, 8.26472f, 18.364f, 6.63604f);
        m145417xd4061a5a.lineTo(17.5154f, 7.48457f);
        m145417xd4061a5a.cubicTo(18.9696f, 8.93869f, 19.8f, 10.9021f, 19.8f, 13.0f);
        m145417xd4061a5a.cubicTo(19.8f, 17.3078f, 16.3078f, 20.8f, 12.0f, 20.8f);
        m145417xd4061a5a.cubicTo(7.69218f, 20.8f, 4.2f, 17.3078f, 4.2f, 13.0f);
        m145417xd4061a5a.cubicTo(4.2f, 8.83411f, 7.46585f, 5.43101f, 11.5769f, 5.21128f);
        m145417xd4061a5a.lineTo(9.9799f, 6.80833f);
        m145417xd4061a5a.lineTo(10.8284f, 7.65685f);
        m145417xd4061a5a.lineTo(13.3033f, 5.18198f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
