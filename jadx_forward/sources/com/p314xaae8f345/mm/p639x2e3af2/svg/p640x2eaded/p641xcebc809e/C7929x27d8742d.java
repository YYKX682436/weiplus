package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.expand_content_filled */
/* loaded from: classes16.dex */
public class C7929x27d8742d extends l95.c {

    /* renamed from: width */
    private final int f23057x6be2dc6 = 24;

    /* renamed from: height */
    private final int f23056xb7389127 = 24;

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
        m145414xacbd08c9.setColor(-436207616);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(10.0f, 5.5f);
        m145417xd4061a5a.lineTo(18.5f, 5.5f);
        m145417xd4061a5a.lineTo(18.5f, 14.0f);
        m145417xd4061a5a.lineTo(20.5f, 14.0f);
        m145417xd4061a5a.lineTo(20.5f, 4.92857f);
        m145417xd4061a5a.cubicTo(20.5f, 4.13959f, 19.8604f, 3.5f, 19.0714f, 3.5f);
        m145417xd4061a5a.lineTo(10.0f, 3.5f);
        m145417xd4061a5a.lineTo(10.0f, 5.5f);
        m145417xd4061a5a.close();
        m145417xd4061a5a.moveTo(14.0f, 18.5f);
        m145417xd4061a5a.lineTo(5.5f, 18.5f);
        m145417xd4061a5a.lineTo(5.5f, 10.0f);
        m145417xd4061a5a.lineTo(3.5f, 10.0f);
        m145417xd4061a5a.lineTo(3.5f, 19.0714f);
        m145417xd4061a5a.cubicTo(3.5f, 19.8604f, 4.1396f, 20.5f, 4.92857f, 20.5f);
        m145417xd4061a5a.lineTo(14.0f, 20.5f);
        m145417xd4061a5a.lineTo(14.0f, 18.5f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
