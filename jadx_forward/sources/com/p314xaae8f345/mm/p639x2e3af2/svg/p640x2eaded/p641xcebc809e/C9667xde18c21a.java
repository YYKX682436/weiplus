package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.pencil_rectangle_regular */
/* loaded from: classes16.dex */
public class C9667xde18c21a extends l95.c {

    /* renamed from: width */
    private final int f26535x6be2dc6 = 24;

    /* renamed from: height */
    private final int f26534xb7389127 = 24;

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
        m145417xd4061a5a.moveTo(4.2f, 4.2f);
        m145417xd4061a5a.lineTo(4.2f, 19.8f);
        m145417xd4061a5a.lineTo(19.8f, 19.8f);
        m145417xd4061a5a.lineTo(19.8f, 10.0f);
        m145417xd4061a5a.lineTo(21.0f, 10.0f);
        m145417xd4061a5a.lineTo(21.0f, 20.0f);
        m145417xd4061a5a.cubicTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f);
        m145417xd4061a5a.lineTo(4.0f, 21.0f);
        m145417xd4061a5a.cubicTo(3.44772f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f);
        m145417xd4061a5a.lineTo(3.0f, 4.0f);
        m145417xd4061a5a.cubicTo(3.0f, 3.44772f, 3.44772f, 3.0f, 4.0f, 3.0f);
        m145417xd4061a5a.lineTo(14.0f, 3.0f);
        m145417xd4061a5a.lineTo(14.0f, 4.2f);
        m145417xd4061a5a.lineTo(4.2f, 4.2f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-16777216);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(20.0662f, 3.14608f);
        m145417xd4061a5a2.cubicTo(19.8714f, 2.95131f, 19.5557f, 2.95131f, 19.3609f, 3.14608f);
        m145417xd4061a5a2.lineTo(9.85136f, 12.6556f);
        m145417xd4061a5a2.lineTo(8.53941f, 14.9523f);
        m145417xd4061a5a2.cubicTo(8.48735f, 15.0434f, 8.48684f, 15.1552f, 8.53807f, 15.2468f);
        m145417xd4061a5a2.cubicTo(8.61874f, 15.391f, 8.80107f, 15.4425f, 8.94531f, 15.3619f);
        m145417xd4061a5a2.lineTo(11.2619f, 14.0664f);
        m145417xd4061a5a2.lineTo(20.7716f, 4.55675f);
        m145417xd4061a5a2.cubicTo(20.9663f, 4.36198f, 20.9663f, 4.04619f, 20.7716f, 3.85142f);
        m145417xd4061a5a2.lineTo(20.0662f, 3.14608f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 1);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
