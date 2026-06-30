package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.location_copy */
/* loaded from: classes16.dex */
public class C9354x94e251bf extends l95.c {

    /* renamed from: width */
    private final int f25909x6be2dc6 = 32;

    /* renamed from: height */
    private final int f25908xb7389127 = 32;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
        canvas.save();
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, -216.0f, 0.0f, 1.0f, -713.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        float[] m145419x1d8aec802 = l95.c.m145419x1d8aec80(m145419x1d8aec80, 1.0f, 0.0f, 216.0f, 0.0f, 1.0f, 713.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec802);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(16777215);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(0.0f, 0.0f);
        m145417xd4061a5a.lineTo(32.0f, 0.0f);
        m145417xd4061a5a.lineTo(32.0f, 32.0f);
        m145417xd4061a5a.lineTo(0.0f, 32.0f);
        m145417xd4061a5a.lineTo(0.0f, 0.0f);
        m145417xd4061a5a.close();
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-436207616);
        float[] m145419x1d8aec803 = l95.c.m145419x1d8aec80(m145419x1d8aec802, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec803);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c92, looper);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(20.0f, 21.33337f);
        m145417xd4061a5a2.lineTo(16.0f, 21.33337f);
        m145417xd4061a5a2.lineTo(16.0f, 25.33337f);
        m145417xd4061a5a2.cubicTo(16.0f, 26.06967f, 15.40309f, 26.66667f, 14.66669f, 26.66667f);
        m145417xd4061a5a2.lineTo(1.33333f, 26.66667f);
        m145417xd4061a5a2.cubicTo(0.59695f, 26.66667f, 0.0f, 26.06967f, 0.0f, 25.33337f);
        m145417xd4061a5a2.lineTo(0.0f, 6.66666f);
        m145417xd4061a5a2.cubicTo(0.0f, 5.93028f, 0.59695f, 5.33333f, 1.33333f, 5.33333f);
        m145417xd4061a5a2.lineTo(5.33329f, 5.33333f);
        m145417xd4061a5a2.lineTo(5.33329f, 1.33333f);
        m145417xd4061a5a2.cubicTo(5.33329f, 0.59695f, 5.93029f, 4.440892E-16f, 6.66669f, 4.440892E-16f);
        m145417xd4061a5a2.lineTo(20.0f, 4.440892E-16f);
        m145417xd4061a5a2.cubicTo(20.73639f, 4.440892E-16f, 21.33329f, 0.59695f, 21.33329f, 1.33333f);
        m145417xd4061a5a2.lineTo(21.33329f, 19.99997f);
        m145417xd4061a5a2.cubicTo(21.33329f, 20.73637f, 20.73639f, 21.33337f, 20.0f, 21.33337f);
        m145417xd4061a5a2.close();
        m145417xd4061a5a2.moveTo(6.93329f, 5.33333f);
        m145417xd4061a5a2.lineTo(14.66669f, 5.33333f);
        m145417xd4061a5a2.cubicTo(15.40309f, 5.33333f, 15.99999f, 5.93028f, 15.99999f, 6.66666f);
        m145417xd4061a5a2.lineTo(15.99999f, 19.73337f);
        m145417xd4061a5a2.lineTo(19.73329f, 19.73337f);
        m145417xd4061a5a2.lineTo(19.73329f, 1.6f);
        m145417xd4061a5a2.lineTo(6.93329f, 1.6f);
        m145417xd4061a5a2.lineTo(6.93329f, 5.33333f);
        m145417xd4061a5a2.close();
        m145417xd4061a5a2.moveTo(1.6f, 25.06667f);
        m145417xd4061a5a2.lineTo(14.39999f, 25.06667f);
        m145417xd4061a5a2.lineTo(14.39999f, 6.93333f);
        m145417xd4061a5a2.lineTo(1.6f, 6.93333f);
        m145417xd4061a5a2.lineTo(1.6f, 25.06667f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c93);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
