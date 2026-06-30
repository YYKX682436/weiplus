package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.appbrand_menu_header_camera_white */
/* loaded from: classes16.dex */
public class C7362xfeef9c3a extends l95.c {

    /* renamed from: width */
    private final int f21923x6be2dc6 = 24;

    /* renamed from: height */
    private final int f21922xb7389127 = 24;

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
        m145414xacbd08c9.setColor(-855638017);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(3.0f, 5.5f);
        m145417xd4061a5a.cubicTo(2.44772f, 5.5f, 2.0f, 5.94772f, 2.0f, 6.5f);
        m145417xd4061a5a.lineTo(2.0f, 17.5f);
        m145417xd4061a5a.cubicTo(2.0f, 18.0523f, 2.44772f, 18.5f, 3.0f, 18.5f);
        m145417xd4061a5a.lineTo(16.5f, 18.5f);
        m145417xd4061a5a.cubicTo(17.0523f, 18.5f, 17.5f, 18.0523f, 17.5f, 17.5f);
        m145417xd4061a5a.lineTo(17.5f, 6.5f);
        m145417xd4061a5a.cubicTo(17.5f, 5.94772f, 17.0523f, 5.5f, 16.5f, 5.5f);
        m145417xd4061a5a.lineTo(3.0f, 5.5f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-855638017);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(23.0f, 8.22684f);
        m145417xd4061a5a2.cubicTo(23.0f, 7.36399f, 21.9805f, 6.90619f, 21.3356f, 7.47943f);
        m145417xd4061a5a2.lineTo(18.5f, 10.0f);
        m145417xd4061a5a2.lineTo(18.5f, 14.0f);
        m145417xd4061a5a2.lineTo(21.3356f, 16.5206f);
        m145417xd4061a5a2.cubicTo(21.9805f, 17.0938f, 23.0f, 16.636f, 23.0f, 15.7732f);
        m145417xd4061a5a2.lineTo(23.0f, 8.22684f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 1);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
