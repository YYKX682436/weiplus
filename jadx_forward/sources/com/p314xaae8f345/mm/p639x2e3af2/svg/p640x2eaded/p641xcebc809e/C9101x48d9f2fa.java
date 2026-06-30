package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_pay_transfer */
/* loaded from: classes16.dex */
public class C9101x48d9f2fa extends l95.c {

    /* renamed from: width */
    private final int f25401x6be2dc6 = 72;

    /* renamed from: height */
    private final int f25400xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
        }
        if (i17 == 2) {
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
            m145414xacbd08c9.setColor(-16777216);
            float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 15.0f, 0.0f, 0.0f, 1.0f);
            m145412xe5ca94b6.reset();
            m145412xe5ca94b6.setValues(m145419x1d8aec80);
            canvas.concat(m145412xe5ca94b6);
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(46.5f, 25.5f);
            m145417xd4061a5a.cubicTo(47.328426f, 25.5f, 48.0f, 26.171574f, 48.0f, 27.0f);
            m145417xd4061a5a.cubicTo(48.0f, 27.43211f, 47.813652f, 27.84323f, 47.488693f, 28.128046f);
            m145417xd4061a5a.lineTo(32.69047f, 41.098175f);
            m145417xd4061a5a.cubicTo(32.19207f, 41.535007f, 31.433912f, 41.485096f, 30.99708f, 40.986694f);
            m145417xd4061a5a.cubicTo(30.636261f, 40.57502f, 30.599783f, 39.971336f, 30.908403f, 39.51921f);
            m145417xd4061a5a.lineTo(37.406178f, 30.0f);
            m145417xd4061a5a.lineTo(-0.003277817f, 30.0f);
            m145417xd4061a5a.lineTo(-0.003277817f, 25.5f);
            m145417xd4061a5a.lineTo(46.5f, 25.5f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(16.999641f, 1.0133055f);
            m145417xd4061a5a.cubicTo(17.36046f, 1.4249806f, 17.39694f, 2.028662f, 17.08832f, 2.4807901f);
            m145417xd4061a5a.lineTo(10.590546f, 12.0f);
            m145417xd4061a5a.lineTo(48.0f, 12.0f);
            m145417xd4061a5a.lineTo(48.0f, 16.5f);
            m145417xd4061a5a.lineTo(1.4967222f, 16.5f);
            m145417xd4061a5a.cubicTo(0.6682951f, 16.5f, -0.003277817f, 15.828427f, -0.003277817f, 15.0f);
            m145417xd4061a5a.cubicTo(-0.003277817f, 14.56789f, 0.18306966f, 14.156771f, 0.5080293f, 13.871955f);
            m145417xd4061a5a.lineTo(15.306251f, 0.9018236f);
            m145417xd4061a5a.cubicTo(15.804652f, 0.4649916f, 16.562809f, 0.5149038f, 16.999641f, 1.0133055f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
            canvas.restore();
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
