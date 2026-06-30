package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ofm_radar_icon */
/* loaded from: classes16.dex */
public class C9619xdca9987b extends l95.c {

    /* renamed from: width */
    private final int f26439x6be2dc6 = 96;

    /* renamed from: height */
    private final int f26438xb7389127 = 96;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 96;
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
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(-1);
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 16.0f, 0.0f, 1.0f, 27.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(7.0f, 1.0f);
        m145417xd4061a5a.cubicTo(10.526494f, -1.3853347f, 15.476821f, 1.5766289f, 14.0f, 5.0f);
        m145417xd4061a5a.cubicTo(7.392988f, 12.569689f, 5.9232f, 23.522991f, 11.0f, 32.0f);
        m145417xd4061a5a.cubicTo(11.93504f, 34.386837f, 14.650065f, 36.63316f, 14.0f, 40.0f);
        m145417xd4061a5a.cubicTo(12.914899f, 42.31854f, 8.964845f, 42.795635f, 7.0f, 41.0f);
        m145417xd4061a5a.cubicTo(-2.6607683f, 29.516495f, -2.181046f, 11.8341675f, 7.0f, 1.0f);
        m145417xd4061a5a.lineTo(7.0f, 1.0f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(51.0f, 2.0f);
        m145417xd4061a5a2.cubicTo(51.81792f, -0.5502939f, 54.604008f, -0.16187043f, 57.0f, 1.0f);
        m145417xd4061a5a2.cubicTo(66.176994f, 11.769702f, 66.65665f, 29.467869f, 57.0f, 41.0f);
        m145417xd4061a5a2.cubicTo(55.236748f, 42.504955f, 51.83833f, 42.504955f, 51.0f, 40.0f);
        m145417xd4061a5a2.cubicTo(49.133884f, 38.062984f, 50.82799f, 35.712524f, 52.0f, 34.0f);
        m145417xd4061a5a2.cubicTo(57.3901f, 26.250925f, 57.51256f, 15.444786f, 52.0f, 8.0f);
        m145417xd4061a5a2.cubicTo(50.99128f, 6.013067f, 48.960392f, 3.782122f, 51.0f, 2.0f);
        m145417xd4061a5a2.lineTo(51.0f, 2.0f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c93);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c94 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        android.graphics.Path m145417xd4061a5a3 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a3.moveTo(18.0f, 7.0f);
        m145417xd4061a5a3.cubicTo(20.819609f, 5.5211906f, 24.681755f, 10.051395f, 22.0f, 13.0f);
        m145417xd4061a5a3.cubicTo(19.615078f, 16.237059f, 18.668661f, 20.876305f, 20.0f, 25.0f);
        m145417xd4061a5a3.cubicTo(20.695332f, 26.992579f, 23.085274f, 28.112738f, 23.0f, 30.0f);
        m145417xd4061a5a3.cubicTo(22.989677f, 33.426064f, 19.060612f, 35.21039f, 17.0f, 33.0f);
        m145417xd4061a5a3.cubicTo(11.584872f, 25.703897f, 11.508394f, 14.214823f, 18.0f, 7.0f);
        m145417xd4061a5a3.lineTo(18.0f, 7.0f);
        m145417xd4061a5a3.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a3, 2);
        canvas.drawPath(m145417xd4061a5a3, m145414xacbd08c94);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c95 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        android.graphics.Path m145417xd4061a5a4 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a4.moveTo(43.0f, 7.0f);
        m145417xd4061a5a4.cubicTo(44.48336f, 6.7782235f, 45.84865f, 6.9965997f, 47.0f, 8.0f);
        m145417xd4061a5a4.cubicTo(51.157063f, 13.766257f, 52.436428f, 22.223366f, 49.0f, 29.0f);
        m145417xd4061a5a4.cubicTo(48.130505f, 30.958408f, 47.366707f, 33.916412f, 45.0f, 34.0f);
        m145417xd4061a5a4.cubicTo(41.762325f, 34.36309f, 39.67142f, 29.975716f, 42.0f, 28.0f);
        m145417xd4061a5a4.cubicTo(45.82001f, 23.791702f, 45.01802f, 16.972414f, 42.0f, 13.0f);
        m145417xd4061a5a4.cubicTo(40.20608f, 11.02663f, 41.218117f, 7.979292f, 43.0f, 7.0f);
        m145417xd4061a5a4.lineTo(43.0f, 7.0f);
        m145417xd4061a5a4.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a4, 2);
        canvas.drawPath(m145417xd4061a5a4, m145414xacbd08c95);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c96 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        android.graphics.Path m145417xd4061a5a5 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a5.moveTo(30.0f, 13.0f);
        m145417xd4061a5a5.cubicTo(35.026703f, 11.379892f, 41.03034f, 16.427767f, 40.0f, 22.0f);
        m145417xd4061a5a5.cubicTo(39.239254f, 27.1483f, 31.95484f, 29.994547f, 28.0f, 26.0f);
        m145417xd4061a5a5.cubicTo(23.189528f, 23.102068f, 24.520334f, 15.15836f, 30.0f, 13.0f);
        m145417xd4061a5a5.lineTo(30.0f, 13.0f);
        m145417xd4061a5a5.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a5, 2);
        canvas.drawPath(m145417xd4061a5a5, m145414xacbd08c96);
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
