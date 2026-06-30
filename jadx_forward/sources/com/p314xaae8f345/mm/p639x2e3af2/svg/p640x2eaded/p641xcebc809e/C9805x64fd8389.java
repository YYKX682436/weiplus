package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ringtone_status_icon */
/* loaded from: classes16.dex */
public class C9805x64fd8389 extends l95.c {

    /* renamed from: width */
    private final int f26813x6be2dc6 = 18;

    /* renamed from: height */
    private final int f26812xb7389127 = 18;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 18;
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
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c92, looper);
        m145414xacbd08c9.setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-16777216);
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, -3.0f, 0.0f, 1.0f, -3.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c92, looper);
        float[] m145419x1d8aec802 = l95.c.m145419x1d8aec80(m145419x1d8aec80, 0.9848077f, -0.17364818f, 2.265991f, 0.17364818f, 0.9848077f, -1.9011347f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec802);
        canvas.concat(m145412xe5ca94b6);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(16.075117f, 3.9996266f);
        m145417xd4061a5a.cubicTo(16.743757f, 3.9996266f, 16.986221f, 4.069246f, 17.230667f, 4.199976f);
        m145417xd4061a5a.cubicTo(17.475111f, 4.3307066f, 17.666952f, 4.5225477f, 17.797682f, 4.766992f);
        m145417xd4061a5a.cubicTo(17.928413f, 5.011437f, 17.998032f, 5.2539015f, 17.998032f, 5.9225407f);
        m145417xd4061a5a.lineTo(17.998032f, 18.076714f);
        m145417xd4061a5a.cubicTo(17.998032f, 18.745352f, 17.928413f, 18.987816f, 17.797682f, 19.232262f);
        m145417xd4061a5a.cubicTo(17.666952f, 19.476706f, 17.475111f, 19.668547f, 17.230667f, 19.799276f);
        m145417xd4061a5a.cubicTo(16.986221f, 19.930008f, 16.743757f, 19.999626f, 16.075117f, 19.999626f);
        m145417xd4061a5a.lineTo(7.9209456f, 19.999626f);
        m145417xd4061a5a.cubicTo(7.252307f, 19.999626f, 7.009842f, 19.930008f, 6.7653975f, 19.799276f);
        m145417xd4061a5a.cubicTo(6.520953f, 19.668547f, 6.3291116f, 19.476706f, 6.1983814f, 19.232262f);
        m145417xd4061a5a.cubicTo(6.0676513f, 18.987816f, 5.998032f, 18.745352f, 5.998032f, 18.076714f);
        m145417xd4061a5a.lineTo(5.998032f, 5.9225407f);
        m145417xd4061a5a.cubicTo(5.998032f, 5.2539015f, 6.0676513f, 5.011437f, 6.1983814f, 4.766992f);
        m145417xd4061a5a.cubicTo(6.3291116f, 4.5225477f, 6.520953f, 4.3307066f, 6.7653975f, 4.199976f);
        m145417xd4061a5a.cubicTo(7.009842f, 4.069246f, 7.252307f, 3.9996266f, 7.9209456f, 3.9996266f);
        m145417xd4061a5a.lineTo(16.075117f, 3.9996266f);
        m145417xd4061a5a.close();
        m145417xd4061a5a.moveTo(14.90174f, 6.9970813f);
        m145417xd4061a5a.lineTo(12.308649f, 6.9970813f);
        m145417xd4061a5a.cubicTo(12.086152f, 6.9970813f, 11.901101f, 7.1574097f, 11.862725f, 7.368839f);
        m145417xd4061a5a.lineTo(11.855424f, 7.4503064f);
        m145417xd4061a5a.cubicTo(11.855424f, 7.4504595f, 11.855424f, 7.450612f, 11.855424f, 7.4507647f);
        m145417xd4061a5a.lineTo(11.860798f, 12.764127f);
        m145417xd4061a5a.cubicTo(11.510798f, 12.570945f, 11.114132f, 12.451627f, 10.694132f, 12.451627f);
        m145417xd4061a5a.cubicTo(9.399132f, 12.451627f, 8.354965f, 13.468672f, 8.354965f, 14.724354f);
        m145417xd4061a5a.cubicTo(8.354965f, 15.980036f, 9.399132f, 16.997082f, 10.694132f, 16.997082f);
        m145417xd4061a5a.cubicTo(11.989132f, 16.997082f, 13.021631f, 15.980036f, 13.021631f, 14.724354f);
        m145417xd4061a5a.lineTo(13.021631f, 9.269809f);
        m145417xd4061a5a.lineTo(14.90174f, 9.269809f);
        m145417xd4061a5a.cubicTo(15.152049f, 9.269809f, 15.354965f, 9.066893f, 15.354965f, 8.816584f);
        m145417xd4061a5a.lineTo(15.354965f, 7.4503064f);
        m145417xd4061a5a.cubicTo(15.354965f, 7.199997f, 15.152049f, 6.9970813f, 14.90174f, 6.9970813f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c93);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c94 = l95.c.m145414xacbd08c9(m145414xacbd08c92, looper);
        android.graphics.Paint m145414xacbd08c95 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        m145414xacbd08c94.setColor(-16777216);
        m145414xacbd08c95.setColor(-16777216);
        m145414xacbd08c95.setStrokeWidth(1.5f);
        m145414xacbd08c95.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        float[] m145419x1d8aec803 = l95.c.m145419x1d8aec80(m145419x1d8aec802, 0.9848077f, 0.17364818f, -2.6991818f, -0.17364818f, 0.9848077f, 3.6482053f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec803);
        canvas.concat(m145412xe5ca94b6);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(20.383112f, 15.121007f);
        m145417xd4061a5a2.cubicTo(20.12264f, 16.598219f, 19.948992f, 17.583027f, 18.616888f, 19.378994f);
        canvas.saveLayerAlpha(null, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53182x14a8432, 31);
        android.graphics.Paint m145414xacbd08c96 = l95.c.m145414xacbd08c9(m145414xacbd08c94, looper);
        android.graphics.Paint m145414xacbd08c97 = l95.c.m145414xacbd08c9(m145414xacbd08c95, looper);
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c96);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c97);
        canvas.restore();
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c98 = l95.c.m145414xacbd08c9(m145414xacbd08c92, looper);
        android.graphics.Paint m145414xacbd08c99 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        m145414xacbd08c98.setColor(-16777216);
        m145414xacbd08c99.setColor(-16777216);
        m145414xacbd08c99.setStrokeWidth(1.5f);
        m145414xacbd08c99.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        float[] m145419x1d8aec804 = l95.c.m145419x1d8aec80(m145419x1d8aec803, -0.9848077f, -0.17364818f, 10.147172f, 0.17364818f, -0.9848077f, 13.112237f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec804);
        canvas.concat(m145412xe5ca94b6);
        android.graphics.Path m145417xd4061a5a3 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a3.moveTo(5.426524f, 4.6248045f);
        m145417xd4061a5a3.cubicTo(5.079228f, 6.5944204f, 4.9055796f, 7.579228f, 3.5734756f, 9.3751955f);
        canvas.saveLayerAlpha(null, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53182x14a8432, 31);
        android.graphics.Paint m145414xacbd08c910 = l95.c.m145414xacbd08c9(m145414xacbd08c98, looper);
        android.graphics.Paint m145414xacbd08c911 = l95.c.m145414xacbd08c9(m145414xacbd08c99, looper);
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a3, 2);
        canvas.drawPath(m145417xd4061a5a3, m145414xacbd08c910);
        canvas.drawPath(m145417xd4061a5a3, m145414xacbd08c911);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
