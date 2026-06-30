package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.rcd_cancel_icon */
/* loaded from: classes16.dex */
public class C9777x4e2f532 extends l95.c {

    /* renamed from: width */
    private final int f26757x6be2dc6 = 80;

    /* renamed from: height */
    private final int f26756xb7389127 = 80;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 80;
        }
        if (i17 != 2) {
            return 0;
        }
        android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
        android.os.Looper looper = (android.os.Looper) objArr[1];
        android.graphics.Matrix m145412xe5ca94b6 = l95.c.m145412xe5ca94b6(looper);
        float[] m145413xf00d6f43 = l95.c.m145413xf00d6f43(looper);
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
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(-1);
        canvas.save();
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 13.333333f, 0.0f, 1.0f, 10.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(21.952621f, 20.0f);
        m145417xd4061a5a.lineTo(28.047379f, 26.094757f);
        m145417xd4061a5a.lineTo(23.333334f, 30.808802f);
        m145417xd4061a5a.lineTo(11.548221f, 19.02369f);
        m145417xd4061a5a.cubicTo(10.246472f, 17.721941f, 10.246472f, 15.611392f, 11.548221f, 14.309644f);
        m145417xd4061a5a.lineTo(23.333334f, 2.5245311f);
        m145417xd4061a5a.lineTo(28.047379f, 7.2385764f);
        m145417xd4061a5a.lineTo(21.952621f, 13.333333f);
        m145417xd4061a5a.lineTo(36.666668f, 13.333333f);
        m145417xd4061a5a.cubicTo(47.71236f, 13.333333f, 56.666668f, 22.287638f, 56.666668f, 33.333332f);
        m145417xd4061a5a.cubicTo(56.666668f, 44.37903f, 47.71236f, 53.333332f, 36.666668f, 53.333332f);
        m145417xd4061a5a.lineTo(0.0f, 53.333332f);
        m145417xd4061a5a.lineTo(0.0f, 46.666668f);
        m145417xd4061a5a.lineTo(36.666668f, 46.666668f);
        m145417xd4061a5a.cubicTo(44.030464f, 46.666668f, 50.0f, 40.69713f, 50.0f, 33.333332f);
        m145417xd4061a5a.cubicTo(50.0f, 25.969536f, 44.030464f, 20.0f, 36.666668f, 20.0f);
        m145417xd4061a5a.lineTo(21.952621f, 20.0f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
