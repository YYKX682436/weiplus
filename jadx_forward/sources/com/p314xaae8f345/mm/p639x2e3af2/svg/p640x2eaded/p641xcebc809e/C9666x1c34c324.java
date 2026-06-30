package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.pencil_rectangle_filled */
/* loaded from: classes16.dex */
public class C9666x1c34c324 extends l95.c {

    /* renamed from: width */
    private final int f26533x6be2dc6 = 24;

    /* renamed from: height */
    private final int f26532xb7389127 = 24;

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
        m145417xd4061a5a.moveTo(8.7405f, 16.0109f);
        m145417xd4061a5a.lineTo(11.1055f, 14.6884f);
        m145417xd4061a5a.lineTo(20.6544f, 5.1395f);
        m145417xd4061a5a.cubicTo(21.0053f, 4.78852f, 21.0053f, 4.21946f, 20.6544f, 3.86848f);
        m145417xd4061a5a.lineTo(19.949f, 3.16314f);
        m145417xd4061a5a.cubicTo(19.598f, 2.81216f, 19.029f, 2.81216f, 18.678f, 3.16314f);
        m145417xd4061a5a.lineTo(9.13057f, 12.7106f);
        m145417xd4061a5a.lineTo(7.79203f, 15.0538f);
        m145417xd4061a5a.cubicTo(7.67038f, 15.2667f, 7.66919f, 15.5278f, 7.7889f, 15.7419f);
        m145417xd4061a5a.cubicTo(7.9774f, 16.079f, 8.40344f, 16.1994f, 8.7405f, 16.0109f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-16777216);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(5.0f, 4.99995f);
        m145417xd4061a5a2.lineTo(5.0f, 19.0f);
        m145417xd4061a5a2.lineTo(19.0f, 19.0f);
        m145417xd4061a5a2.lineTo(19.0f, 9.99995f);
        m145417xd4061a5a2.lineTo(21.0f, 9.99995f);
        m145417xd4061a5a2.lineTo(21.0f, 20.0f);
        m145417xd4061a5a2.cubicTo(21.0f, 20.5522f, 20.5523f, 21.0f, 20.0f, 21.0f);
        m145417xd4061a5a2.lineTo(4.0f, 21.0f);
        m145417xd4061a5a2.cubicTo(3.44772f, 21.0f, 3.0f, 20.5522f, 3.0f, 20.0f);
        m145417xd4061a5a2.lineTo(3.0f, 3.99995f);
        m145417xd4061a5a2.cubicTo(3.0f, 3.44767f, 3.44772f, 2.99995f, 4.0f, 2.99995f);
        m145417xd4061a5a2.lineTo(14.0f, 2.99995f);
        m145417xd4061a5a2.lineTo(14.0f, 4.99995f);
        m145417xd4061a5a2.lineTo(5.0f, 4.99995f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 1);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
