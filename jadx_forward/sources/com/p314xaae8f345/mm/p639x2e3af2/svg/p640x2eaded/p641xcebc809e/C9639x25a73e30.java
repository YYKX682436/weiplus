package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.panel_icon_fav */
/* loaded from: classes16.dex */
public class C9639x25a73e30 extends l95.c {

    /* renamed from: width */
    private final int f26479x6be2dc6 = 192;

    /* renamed from: height */
    private final int f26478xb7389127 = 192;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 192;
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
        m145414xacbd08c9.setColor(-13421773);
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 48.0f, 0.0f, 1.0f, 48.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(81.37307f, 25.26795f);
        m145417xd4061a5a.lineTo(48.0f, 44.5359f);
        m145417xd4061a5a.lineTo(14.626933f, 25.26795f);
        m145417xd4061a5a.lineTo(45.398735f, 7.5018406f);
        m145417xd4061a5a.cubicTo(46.835373f, 6.672397f, 49.169003f, 6.674923f, 50.601265f, 7.5018406f);
        m145417xd4061a5a.lineTo(81.37307f, 25.26795f);
        m145417xd4061a5a.close();
        m145417xd4061a5a.moveTo(84.37307f, 30.464102f);
        m145417xd4061a5a.lineTo(84.37307f, 65.996315f);
        m145417xd4061a5a.cubicTo(84.37307f, 67.655205f, 83.20406f, 69.67493f, 81.771805f, 70.50184f);
        m145417xd4061a5a.lineTo(51.0f, 88.26795f);
        m145417xd4061a5a.lineTo(51.0f, 49.73205f);
        m145417xd4061a5a.lineTo(84.37307f, 30.464102f);
        m145417xd4061a5a.close();
        m145417xd4061a5a.moveTo(45.0f, 88.26795f);
        m145417xd4061a5a.lineTo(14.228197f, 70.50184f);
        m145417xd4061a5a.cubicTo(12.791558f, 69.67239f, 11.626933f, 67.650154f, 11.626933f, 65.996315f);
        m145417xd4061a5a.lineTo(11.626933f, 30.464102f);
        m145417xd4061a5a.lineTo(45.0f, 49.73205f);
        m145417xd4061a5a.lineTo(45.0f, 88.26795f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
