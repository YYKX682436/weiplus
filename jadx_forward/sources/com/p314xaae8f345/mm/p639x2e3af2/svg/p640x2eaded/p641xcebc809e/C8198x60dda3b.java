package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fix_tools_uplog */
/* loaded from: classes16.dex */
public class C8198x60dda3b extends l95.c {

    /* renamed from: width */
    private final int f23595x6be2dc6 = 120;

    /* renamed from: height */
    private final int f23594xb7389127 = 120;

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
        l95.c.m145414xacbd08c9(m145415xacbd08c92, looper).setStrokeWidth(1.0f);
        canvas.save();
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 15.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(-1);
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(60.0f, 0.0f);
        m145417xd4061a5a.lineTo(90.0f, 30.0f);
        m145417xd4061a5a.lineTo(90.0f, 116.0f);
        m145417xd4061a5a.cubicTo(90.0f, 118.20914f, 88.20914f, 120.0f, 86.0f, 120.0f);
        m145417xd4061a5a.lineTo(4.0f, 120.0f);
        m145417xd4061a5a.cubicTo(1.790861f, 120.0f, 2.705415E-16f, 118.20914f, 0.0f, 116.0f);
        m145417xd4061a5a.lineTo(0.0f, 4.0f);
        m145417xd4061a5a.cubicTo(-2.705415E-16f, 1.790861f, 1.790861f, 4.0581224E-16f, 4.0f, 0.0f);
        m145417xd4061a5a.lineTo(60.0f, 0.0f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
        canvas.restore();
        android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c93.setColor(201326592);
        canvas.save();
        android.graphics.Paint m145414xacbd08c94 = l95.c.m145414xacbd08c9(m145414xacbd08c93, looper);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(60.0f, 0.0f);
        m145417xd4061a5a2.lineTo(90.0f, 30.0f);
        m145417xd4061a5a2.lineTo(90.0f, 116.0f);
        m145417xd4061a5a2.cubicTo(90.0f, 118.20914f, 88.20914f, 120.0f, 86.0f, 120.0f);
        m145417xd4061a5a2.lineTo(4.0f, 120.0f);
        m145417xd4061a5a2.cubicTo(1.790861f, 120.0f, 2.705415E-16f, 118.20914f, 0.0f, 116.0f);
        m145417xd4061a5a2.lineTo(0.0f, 4.0f);
        m145417xd4061a5a2.cubicTo(-2.705415E-16f, 1.790861f, 1.790861f, 4.0581224E-16f, 4.0f, 0.0f);
        m145417xd4061a5a2.lineTo(60.0f, 0.0f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c94);
        canvas.restore();
        android.graphics.Paint m145414xacbd08c95 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c95.setColor(-16777216);
        android.graphics.Path m145417xd4061a5a3 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a3.moveTo(90.0f, 30.0f);
        m145417xd4061a5a3.lineTo(64.0f, 30.0f);
        m145417xd4061a5a3.cubicTo(61.79086f, 30.0f, 60.0f, 28.209139f, 60.0f, 26.0f);
        m145417xd4061a5a3.lineTo(60.0f, 0.0f);
        m145417xd4061a5a3.lineTo(90.0f, 30.0f);
        m145417xd4061a5a3.close();
        canvas.saveLayerAlpha(null, 25, 31);
        android.graphics.Paint m145414xacbd08c96 = l95.c.m145414xacbd08c9(m145414xacbd08c95, looper);
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a3, 2);
        canvas.drawPath(m145417xd4061a5a3, m145414xacbd08c96);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c97 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c97.setColor(-10461088);
        float[] m145419x1d8aec802 = l95.c.m145419x1d8aec80(m145419x1d8aec80, 1.0f, 0.0f, 21.0f, 0.0f, 1.0f, 58.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec802);
        canvas.concat(m145412xe5ca94b6);
        canvas.saveLayerAlpha(null, 204, 31);
        canvas.save();
        android.graphics.Paint m145414xacbd08c98 = l95.c.m145414xacbd08c9(m145414xacbd08c97, looper);
        android.graphics.Path m145417xd4061a5a4 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a4.moveTo(-3.5527137E-15f, 13.20906f);
        m145417xd4061a5a4.lineTo(13.891402f, 3.9411764f);
        m145417xd4061a5a4.lineTo(13.891402f, 7.1200304f);
        m145417xd4061a5a4.lineTo(3.5791855f, 14.0f);
        m145417xd4061a5a4.lineTo(13.891402f, 20.87997f);
        m145417xd4061a5a4.lineTo(13.891402f, 24.058823f);
        m145417xd4061a5a4.lineTo(-1.5543122E-15f, 14.79094f);
        m145417xd4061a5a4.lineTo(0.0f, 13.20906f);
        m145417xd4061a5a4.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a4, 2);
        canvas.drawPath(m145417xd4061a5a4, m145414xacbd08c98);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c99 = l95.c.m145414xacbd08c9(m145414xacbd08c97, looper);
        float[] m145419x1d8aec803 = l95.c.m145419x1d8aec80(m145419x1d8aec802, -1.0f, 0.0f, 76.23529f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec803);
        canvas.concat(m145412xe5ca94b6);
        android.graphics.Path m145417xd4061a5a5 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a5.moveTo(31.235294f, 13.20906f);
        m145417xd4061a5a5.lineTo(45.126698f, 3.9411764f);
        m145417xd4061a5a5.lineTo(45.126698f, 7.1200304f);
        m145417xd4061a5a5.lineTo(34.81448f, 14.0f);
        m145417xd4061a5a5.lineTo(45.126698f, 20.87997f);
        m145417xd4061a5a5.lineTo(45.126698f, 24.058823f);
        m145417xd4061a5a5.lineTo(31.235294f, 14.79094f);
        m145417xd4061a5a5.lineTo(31.235294f, 13.20906f);
        m145417xd4061a5a5.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a5, 2);
        canvas.drawPath(m145417xd4061a5a5, m145414xacbd08c99);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c910 = l95.c.m145414xacbd08c9(m145414xacbd08c97, looper);
        android.graphics.Path m145417xd4061a5a6 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a6.moveTo(26.200712f, 0.0f);
        m145417xd4061a5a6.lineTo(29.377182f, 0.0f);
        m145417xd4061a5a6.lineTo(19.588236f, 28.0f);
        m145417xd4061a5a6.lineTo(16.411764f, 28.0f);
        m145417xd4061a5a6.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a6, 1);
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a6, 2);
        canvas.drawPath(m145417xd4061a5a6, m145414xacbd08c910);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
