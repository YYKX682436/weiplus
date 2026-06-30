package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.multitalk_convert_camera_nor */
/* loaded from: classes16.dex */
public class C9501xbdfd31dd extends l95.c {

    /* renamed from: width */
    private final int f26203x6be2dc6 = 180;

    /* renamed from: height */
    private final int f26202xb7389127 = 180;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 180;
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
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 30.0f, 0.0f, 1.0f, 30.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        float[] m145419x1d8aec802 = l95.c.m145419x1d8aec80(m145419x1d8aec80, 1.0f, 0.0f, 21.0f, 0.0f, 1.0f, 30.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec802);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        m145414xacbd08c92.setColor(-855310);
        m145414xacbd08c92.setStrokeWidth(4.0f);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(6.0097566f, 12.0f);
        m145417xd4061a5a.cubicTo(3.7951674f, 12.0f, 2.0f, 13.792681f, 2.0f, 16.000319f);
        m145417xd4061a5a.lineTo(2.0f, 54.999683f);
        m145417xd4061a5a.cubicTo(2.0f, 57.20863f, 3.789142f, 59.0f, 5.991014f, 59.0f);
        m145417xd4061a5a.lineTo(72.00899f, 59.0f);
        m145417xd4061a5a.cubicTo(74.21183f, 59.0f, 76.0f, 57.208717f, 76.0f, 54.999683f);
        m145417xd4061a5a.lineTo(76.0f, 16.000319f);
        m145417xd4061a5a.cubicTo(76.0f, 13.79181f, 74.205315f, 12.0f, 71.99024f, 12.0f);
        m145417xd4061a5a.lineTo(57.5f, 12.0f);
        m145417xd4061a5a.lineTo(51.196438f, 3.5952492f);
        m145417xd4061a5a.cubicTo(50.5825f, 2.7766662f, 49.029545f, 2.0f, 48.00891f, 2.0f);
        m145417xd4061a5a.lineTo(29.99109f, 2.0f);
        m145417xd4061a5a.cubicTo(28.967781f, 2.0f, 27.419127f, 2.7744992f, 26.803562f, 3.5952492f);
        m145417xd4061a5a.lineTo(20.5f, 12.0f);
        m145417xd4061a5a.lineTo(6.0097566f, 12.0f);
        m145417xd4061a5a.close();
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c93.setColor(-855310);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(6.0f, 2.0f);
        m145417xd4061a5a2.lineTo(16.0f, 2.0f);
        m145417xd4061a5a2.lineTo(16.0f, 6.0f);
        m145417xd4061a5a2.lineTo(6.0f, 6.0f);
        m145417xd4061a5a2.lineTo(6.0f, 2.0f);
        m145417xd4061a5a2.close();
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c93);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c94 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c94.setColor(-855310);
        android.graphics.Path m145417xd4061a5a3 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a3.moveTo(21.0f, 33.0f);
        m145417xd4061a5a3.lineTo(15.0f, 33.0f);
        m145417xd4061a5a3.lineTo(23.25f, 24.75f);
        m145417xd4061a5a3.lineTo(31.5f, 33.0f);
        m145417xd4061a5a3.lineTo(25.0f, 33.0f);
        m145417xd4061a5a3.cubicTo(25.0f, 40.731987f, 31.268013f, 47.0f, 39.0f, 47.0f);
        m145417xd4061a5a3.cubicTo(42.931446f, 47.0f, 46.484406f, 45.379486f, 49.027344f, 42.769985f);
        m145417xd4061a5a3.lineTo(51.855957f, 45.598595f);
        m145417xd4061a5a3.cubicTo(48.588997f, 48.93187f, 44.03602f, 51.0f, 39.0f, 51.0f);
        m145417xd4061a5a3.cubicTo(29.058874f, 51.0f, 21.0f, 42.941124f, 21.0f, 33.0f);
        m145417xd4061a5a3.close();
        m145417xd4061a5a3.moveTo(57.0f, 33.0f);
        m145417xd4061a5a3.lineTo(63.0f, 33.0f);
        m145417xd4061a5a3.lineTo(54.75f, 41.25f);
        m145417xd4061a5a3.lineTo(46.5f, 33.0f);
        m145417xd4061a5a3.lineTo(53.0f, 33.0f);
        m145417xd4061a5a3.cubicTo(53.0f, 25.268013f, 46.731987f, 19.0f, 39.0f, 19.0f);
        m145417xd4061a5a3.cubicTo(35.068554f, 19.0f, 31.515596f, 20.620514f, 28.972656f, 23.230017f);
        m145417xd4061a5a3.lineTo(26.144045f, 20.401403f);
        m145417xd4061a5a3.cubicTo(29.411005f, 17.068129f, 33.96398f, 15.0f, 39.0f, 15.0f);
        m145417xd4061a5a3.cubicTo(48.941124f, 15.0f, 57.0f, 23.058874f, 57.0f, 33.0f);
        m145417xd4061a5a3.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a3, 2);
        canvas.drawPath(m145417xd4061a5a3, m145414xacbd08c94);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
