package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.mosaic_unselected */
/* loaded from: classes16.dex */
public class C9494xc97a2709 extends l95.c {

    /* renamed from: width */
    private final int f26189x6be2dc6 = 63;

    /* renamed from: height */
    private final int f26188xb7389127 = 63;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 63;
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
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        m145414xacbd08c92.setColor(16777215);
        m145414xacbd08c93.setColor(-1);
        m145414xacbd08c93.setStrokeWidth(2.0f);
        canvas.save();
        android.graphics.Paint m145414xacbd08c94 = l95.c.m145414xacbd08c9(m145414xacbd08c92, looper);
        android.graphics.Paint m145414xacbd08c95 = l95.c.m145414xacbd08c9(m145414xacbd08c93, looper);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(0.0f, 1.5f);
        m145417xd4061a5a.cubicTo(0.0f, 0.6715728f, 0.6715728f, 0.0f, 1.5f, 0.0f);
        m145417xd4061a5a.lineTo(37.5f, 0.0f);
        m145417xd4061a5a.cubicTo(38.328426f, 0.0f, 39.0f, 0.6715728f, 39.0f, 1.5f);
        m145417xd4061a5a.lineTo(39.0f, 37.5f);
        m145417xd4061a5a.cubicTo(39.0f, 38.328426f, 38.328426f, 39.0f, 37.5f, 39.0f);
        m145417xd4061a5a.lineTo(1.5f, 39.0f);
        m145417xd4061a5a.cubicTo(0.6715728f, 39.0f, 0.0f, 38.328426f, 0.0f, 37.5f);
        m145417xd4061a5a.lineTo(0.0f, 1.5f);
        m145417xd4061a5a.close();
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c94);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c95);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c96 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c96.setColor(-1);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(0.0f, 0.0f);
        m145417xd4061a5a2.lineTo(20.0f, 0.0f);
        m145417xd4061a5a2.lineTo(20.0f, 20.0f);
        m145417xd4061a5a2.lineTo(0.0f, 20.0f);
        m145417xd4061a5a2.lineTo(0.0f, 0.0f);
        m145417xd4061a5a2.close();
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c96);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c97 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c97.setColor(-1);
        android.graphics.Path m145417xd4061a5a3 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a3.moveTo(20.0f, 20.0f);
        m145417xd4061a5a3.lineTo(39.5f, 20.0f);
        m145417xd4061a5a3.lineTo(39.5f, 39.5f);
        m145417xd4061a5a3.lineTo(20.0f, 39.5f);
        m145417xd4061a5a3.lineTo(20.0f, 20.0f);
        m145417xd4061a5a3.close();
        canvas.drawPath(m145417xd4061a5a3, m145414xacbd08c97);
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
