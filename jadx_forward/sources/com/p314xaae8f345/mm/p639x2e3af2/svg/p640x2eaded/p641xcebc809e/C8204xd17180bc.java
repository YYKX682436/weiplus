package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.float_ball_download_filled */
/* loaded from: classes16.dex */
public class C8204xd17180bc extends l95.c {

    /* renamed from: width */
    private final int f23607x6be2dc6 = 24;

    /* renamed from: height */
    private final int f23606xb7389127 = 24;

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
        m145414xacbd08c9.setColor(-16268960);
        m145414xacbd08c9.setColor(-16268960);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(12.5791f, 13.6147f);
        m145417xd4061a5a.lineTo(14.3008f, 11.8931f);
        m145417xd4061a5a.lineTo(15.4316f, 13.0239f);
        m145417xd4061a5a.lineTo(12.332f, 16.1235f);
        m145417xd4061a5a.cubicTo(12.0196f, 16.436f, 11.5126f, 16.436f, 11.2002f, 16.1235f);
        m145417xd4061a5a.lineTo(8.10059f, 13.0239f);
        m145417xd4061a5a.lineTo(9.23242f, 11.8931f);
        m145417xd4061a5a.lineTo(10.9795f, 13.6401f);
        m145417xd4061a5a.lineTo(10.9795f, 7.64404f);
        m145417xd4061a5a.lineTo(12.5791f, 7.64404f);
        m145417xd4061a5a.lineTo(12.5791f, 13.6147f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
