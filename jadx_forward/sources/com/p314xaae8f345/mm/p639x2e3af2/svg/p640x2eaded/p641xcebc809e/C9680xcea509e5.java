package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.photo_accounts_icon */
/* loaded from: classes16.dex */
public class C9680xcea509e5 extends l95.c {

    /* renamed from: width */
    private final int f26561x6be2dc6 = 192;

    /* renamed from: height */
    private final int f26560xb7389127 = 192;

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
        canvas.save();
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(-15683841);
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
        m145417xd4061a5a2.moveTo(117.048f, 55.6449f);
        m145417xd4061a5a2.cubicTo(119.223f, 51.8967f, 124.712f, 51.8958f, 126.886f, 55.6449f);
        m145417xd4061a5a2.lineTo(146.946f, 90.2316f);
        m145417xd4061a5a2.cubicTo(149.018f, 93.8057f, 149.018f, 98.1939f, 146.946f, 101.768f);
        m145417xd4061a5a2.lineTo(126.886f, 136.355f);
        m145417xd4061a5a2.cubicTo(124.712f, 140.104f, 119.223f, 140.104f, 117.048f, 136.355f);
        m145417xd4061a5a2.lineTo(95.9978f, 100.065f);
        m145417xd4061a5a2.lineTo(74.952f, 136.355f);
        m145417xd4061a5a2.cubicTo(72.777f, 140.104f, 67.2884f, 140.104f, 65.1137f, 136.355f);
        m145417xd4061a5a2.lineTo(45.0546f, 101.768f);
        m145417xd4061a5a2.cubicTo(42.9819f, 98.1938f, 42.9817f, 93.8058f, 45.0546f, 90.2316f);
        m145417xd4061a5a2.lineTo(65.1137f, 55.6449f);
        m145417xd4061a5a2.cubicTo(67.2884f, 51.8959f, 72.7769f, 51.8965f, 74.952f, 55.6449f);
        m145417xd4061a5a2.lineTo(95.9978f, 91.9303f);
        m145417xd4061a5a2.lineTo(117.048f, 55.6449f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 1);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
