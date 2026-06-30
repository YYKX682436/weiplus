package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.editor_toolbar_file */
/* loaded from: classes16.dex */
public class C7872x6241d952 extends l95.c {

    /* renamed from: width */
    private final int f22943x6be2dc6 = 72;

    /* renamed from: height */
    private final int f22942xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        m145414xacbd08c9.setColor(-16777216);
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(3.6f, 3.6f);
        m145417xd4061a5a.lineTo(3.6f, 44.4f);
        m145417xd4061a5a.lineTo(56.4f, 44.4f);
        m145417xd4061a5a.lineTo(56.4f, 8.1f);
        m145417xd4061a5a.lineTo(24.612188f, 8.1f);
        m145417xd4061a5a.lineTo(18.987188f, 3.6f);
        m145417xd4061a5a.lineTo(3.6f, 3.6f);
        m145417xd4061a5a.close();
        m145417xd4061a5a.moveTo(3.0f, 0.0f);
        m145417xd4061a5a.lineTo(20.25f, 0.0f);
        m145417xd4061a5a.lineTo(25.875f, 4.5f);
        m145417xd4061a5a.lineTo(57.0f, 4.5f);
        m145417xd4061a5a.cubicTo(58.656853f, 4.5f, 60.0f, 5.843146f, 60.0f, 7.5f);
        m145417xd4061a5a.lineTo(60.0f, 45.0f);
        m145417xd4061a5a.cubicTo(60.0f, 46.656853f, 58.656853f, 48.0f, 57.0f, 48.0f);
        m145417xd4061a5a.lineTo(3.0f, 48.0f);
        m145417xd4061a5a.cubicTo(1.3431457f, 48.0f, 2.0290612E-16f, 46.656853f, 0.0f, 45.0f);
        m145417xd4061a5a.lineTo(0.0f, 3.0f);
        m145417xd4061a5a.cubicTo(-2.0290612E-16f, 1.3431457f, 1.3431457f, 3.043592E-16f, 3.0f, 0.0f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(0.0f, 12.0f);
        m145417xd4061a5a2.lineTo(60.0f, 12.0f);
        m145417xd4061a5a2.lineTo(60.0f, 15.6f);
        m145417xd4061a5a2.lineTo(0.0f, 15.6f);
        m145417xd4061a5a2.lineTo(0.0f, 12.0f);
        m145417xd4061a5a2.close();
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c93);
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
