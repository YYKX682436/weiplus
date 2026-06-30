package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.float_ball_state_finder */
/* loaded from: classes16.dex */
public class C8226xb8cba2b1 extends l95.c {

    /* renamed from: width */
    private final int f23651x6be2dc6 = 120;

    /* renamed from: height */
    private final int f23650xb7389127 = 120;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 120;
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
        m145414xacbd08c92.setColor(-352965);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(60.0f, 0.0f);
        m145417xd4061a5a.cubicTo(93.137085f, 0.0f, 120.0f, 26.862915f, 120.0f, 60.0f);
        m145417xd4061a5a.cubicTo(120.0f, 93.137085f, 93.137085f, 120.0f, 60.0f, 120.0f);
        m145417xd4061a5a.cubicTo(26.862915f, 120.0f, 0.0f, 93.137085f, 0.0f, 60.0f);
        m145417xd4061a5a.cubicTo(0.0f, 26.862915f, 26.862915f, 0.0f, 60.0f, 0.0f);
        m145417xd4061a5a.close();
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
        canvas.restore();
        canvas.save();
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 24.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(0.0f, 0.0f);
        m145417xd4061a5a2.lineTo(72.0f, 0.0f);
        m145417xd4061a5a2.lineTo(72.0f, 72.0f);
        m145417xd4061a5a2.lineTo(0.0f, 72.0f);
        m145417xd4061a5a2.lineTo(0.0f, 0.0f);
        m145417xd4061a5a2.close();
        canvas.save();
        android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        android.graphics.Paint m145414xacbd08c94 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        m145414xacbd08c93.setColor(-1);
        m145414xacbd08c94.setColor(-1);
        m145414xacbd08c94.setStrokeWidth(1.5f);
        android.graphics.Path m145417xd4061a5a3 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a3.moveTo(17.714867f, 12.521391f);
        m145417xd4061a5a3.cubicTo(20.004908f, 13.44775f, 22.545315f, 15.645851f, 25.37252f, 18.967289f);
        m145417xd4061a5a3.cubicTo(27.02004f, 20.902817f, 28.743801f, 23.194654f, 30.51772f, 25.77134f);
        m145417xd4061a5a3.cubicTo(32.475677f, 28.615353f, 34.393993f, 31.656507f, 36.195972f, 34.698944f);
        m145417xd4061a5a3.cubicTo(38.07104f, 32.569256f, 39.465797f, 30.440718f, 40.825825f, 28.377422f);
        m145417xd4061a5a3.lineTo(41.407867f, 27.497334f);
        m145417xd4061a5a3.lineTo(42.575592f, 25.77134f);
        m145417xd4061a5a3.cubicTo(44.34951f, 23.194654f, 46.07327f, 20.902817f, 47.72079f, 18.967289f);
        m145417xd4061a5a3.cubicTo(50.547997f, 15.645851f, 53.0884f, 13.44775f, 55.378445f, 12.521391f);
        m145417xd4061a5a3.cubicTo(57.09531f, 11.826891f, 58.682552f, 11.838786f, 60.029186f, 12.482003f);
        m145417xd4061a5a3.cubicTo(61.340725f, 13.108459f, 62.441357f, 14.348611f, 63.18625f, 16.213264f);
        m145417xd4061a5a3.cubicTo(65.099525f, 21.001545f, 63.79064f, 32.618187f, 61.082283f, 42.823254f);
        m145417xd4061a5a3.cubicTo(59.722946f, 47.945225f, 58.02014f, 52.704884f, 56.226532f, 56.04995f);
        m145417xd4061a5a3.cubicTo(55.381554f, 57.62582f, 54.512196f, 58.892654f, 53.651424f, 59.752964f);
        m145417xd4061a5a3.cubicTo(52.738945f, 60.664955f, 51.821217f, 61.12577f, 50.949104f, 61.12577f);
        m145417xd4061a5a3.cubicTo(48.641136f, 61.12577f, 46.282604f, 59.29566f, 43.561356f, 55.809723f);
        m145417xd4061a5a3.cubicTo(42.39769f, 54.31905f, 41.182602f, 52.542404f, 39.933674f, 50.536915f);
        m145417xd4061a5a3.cubicTo(38.938812f, 48.93939f, 37.960854f, 47.25977f, 37.019325f, 45.55616f);
        m145417xd4061a5a3.cubicTo(35.443832f, 46.722153f, 34.31309f, 48.684723f, 33.159637f, 50.536915f);
        m145417xd4061a5a3.cubicTo(31.910711f, 52.542404f, 30.695623f, 54.31905f, 29.531954f, 55.809723f);
        m145417xd4061a5a3.cubicTo(26.810709f, 59.29566f, 24.452173f, 61.12577f, 22.144205f, 61.12577f);
        m145417xd4061a5a3.cubicTo(21.272097f, 61.12577f, 20.354372f, 60.66496f, 19.441895f, 59.75297f);
        m145417xd4061a5a3.cubicTo(18.581127f, 58.89267f, 17.711771f, 57.625843f, 16.866795f, 56.04998f);
        m145417xd4061a5a3.cubicTo(15.073187f, 52.704933f, 13.370382f, 47.945297f, 12.011043f, 42.82335f);
        m145417xd4061a5a3.cubicTo(9.302666f, 32.61828f, 7.993758f, 21.00162f, 9.906994f, 16.213434f);
        m145417xd4061a5a3.cubicTo(10.651925f, 14.3486805f, 11.752563f, 13.108501f, 13.064101f, 12.482028f);
        m145417xd4061a5a3.cubicTo(14.410745f, 11.838786f, 15.997993f, 11.826888f, 17.714867f, 12.521391f);
        m145417xd4061a5a3.close();
        m145417xd4061a5a3.moveTo(14.930977f, 16.551762f);
        m145417xd4061a5a3.cubicTo(14.599188f, 16.740349f, 14.362779f, 17.183575f, 14.090804f, 17.864397f);
        m145417xd4061a5a3.cubicTo(12.900332f, 20.843746f, 13.4489765f, 28.354488f, 15.211088f, 36.766678f);
        m145417xd4061a5a3.lineTo(15.211088f, 36.766678f);
        m145417xd4061a5a3.lineTo(15.629712f, 38.678913f);
        m145417xd4061a5a3.lineTo(16.088438f, 40.60805f);
        m145417xd4061a5a3.lineTo(16.355417f, 41.661987f);
        m145417xd4061a5a3.cubicTo(17.34952f, 45.49381f, 18.503006f, 48.95375f, 19.56753f, 51.610027f);
        m145417xd4061a5a3.cubicTo(20.220613f, 53.23965f, 20.83856f, 54.563904f, 21.36503f, 55.480522f);
        m145417xd4061a5a3.cubicTo(21.58415f, 55.862022f, 21.787617f, 56.16456f, 22.319408f, 56.62631f);
        m145417xd4061a5a3.cubicTo(23.052942f, 56.428833f, 24.389593f, 55.09867f, 25.975286f, 53.067383f);
        m145417xd4061a5a3.cubicTo(27.03654f, 51.70791f, 28.164154f, 50.057617f, 29.331907f, 48.182472f);
        m145417xd4061a5a3.cubicTo(30.28426f, 46.653214f, 31.224194f, 45.038574f, 32.12847f, 43.40231f);
        m145417xd4061a5a3.lineTo(32.12847f, 43.40231f);
        m145417xd4061a5a3.lineTo(33.225048f, 41.375816f);
        m145417xd4061a5a3.lineTo(34.001286f, 39.880608f);
        m145417xd4061a5a3.lineTo(33.18935f, 38.458813f);
        m145417xd4061a5a3.lineTo(32.31406f, 36.964046f);
        m145417xd4061a5a3.lineTo(31.250776f, 35.192356f);
        m145417xd4061a5a3.cubicTo(29.816496f, 32.834183f, 28.319506f, 30.501034f, 26.802559f, 28.29761f);
        m145417xd4061a5a3.cubicTo(25.112808f, 25.843184f, 23.479263f, 23.670023f, 21.935764f, 21.856699f);
        m145417xd4061a5a3.cubicTo(19.59366f, 19.105167f, 17.559689f, 17.288795f, 14.930977f, 16.551762f);
        m145417xd4061a5a3.close();
        m145417xd4061a5a3.moveTo(57.075512f, 16.665077f);
        m145417xd4061a5a3.cubicTo(55.533623f, 17.288795f, 53.49965f, 19.105167f, 51.157547f, 21.856699f);
        m145417xd4061a5a3.cubicTo(49.614048f, 23.670023f, 47.980503f, 25.843184f, 46.290752f, 28.29761f);
        m145417xd4061a5a3.cubicTo(44.774017f, 30.50073f, 43.277225f, 32.833553f, 41.842396f, 35.192635f);
        m145417xd4061a5a3.lineTo(41.842396f, 35.192635f);
        m145417xd4061a5a3.lineTo(40.365555f, 37.66742f);
        m145417xd4061a5a3.lineTo(39.52827f, 40.727425f);
        m145417xd4061a5a3.lineTo(40.073864f, 41.76224f);
        m145417xd4061a5a3.lineTo(40.964767f, 43.402233f);
        m145417xd4061a5a3.cubicTo(41.868652f, 45.037792f, 42.808815f, 46.652832f, 43.761402f, 48.182472f);
        m145417xd4061a5a3.cubicTo(44.929157f, 50.057617f, 46.05677f, 51.70791f, 47.118023f, 53.067383f);
        m145417xd4061a5a3.cubicTo(48.69195f, 55.0836f, 50.04514f, 56.509083f, 51.72828f, 55.480522f);
        m145417xd4061a5a3.cubicTo(52.254753f, 54.563904f, 52.8727f, 53.23965f, 53.525784f, 51.610027f);
        m145417xd4061a5a3.cubicTo(54.68708f, 48.712273f, 55.95425f, 44.858086f, 57.006058f, 40.60317f);
        m145417xd4061a5a3.lineTo(57.006058f, 40.60317f);
        m145417xd4061a5a3.lineTo(57.46584f, 38.669098f);
        m145417xd4061a5a3.lineTo(57.657963f, 37.812153f);
        m145417xd4061a5a3.cubicTo(59.60142f, 28.981955f, 60.24257f, 20.967857f, 59.002472f, 17.864313f);
        m145417xd4061a5a3.cubicTo(58.730507f, 17.183514f, 58.494114f, 16.740318f, 57.075512f, 16.665077f);
        m145417xd4061a5a3.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a3, 1);
        canvas.drawPath(m145417xd4061a5a3, m145414xacbd08c93);
        canvas.drawPath(m145417xd4061a5a3, m145414xacbd08c94);
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
