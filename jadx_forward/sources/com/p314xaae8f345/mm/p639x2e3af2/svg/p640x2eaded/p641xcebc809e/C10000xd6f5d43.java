package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.text_bg_selected */
/* loaded from: classes16.dex */
public class C10000xd6f5d43 extends l95.c {

    /* renamed from: width */
    private final int f27203x6be2dc6 = 60;

    /* renamed from: height */
    private final int f27202xb7389127 = 60;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 60;
        }
        if (i17 != 2) {
            return 0;
        }
        android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
        android.os.Looper looper = (android.os.Looper) objArr[1];
        l95.c.m145412xe5ca94b6(looper);
        l95.c.m145413xf00d6f43(looper);
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
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(0.0f, 3.0f);
        m145417xd4061a5a.cubicTo(0.0f, 1.3431456f, 1.3431456f, 0.0f, 3.0f, 0.0f);
        m145417xd4061a5a.lineTo(55.5f, 0.0f);
        m145417xd4061a5a.cubicTo(57.156853f, 0.0f, 58.5f, 1.3431456f, 58.5f, 3.0f);
        m145417xd4061a5a.lineTo(58.5f, 55.5f);
        m145417xd4061a5a.cubicTo(58.5f, 57.156853f, 57.156853f, 58.5f, 55.5f, 58.5f);
        m145417xd4061a5a.lineTo(3.0f, 58.5f);
        m145417xd4061a5a.cubicTo(1.3431456f, 58.5f, 0.0f, 57.156853f, 0.0f, 55.5f);
        m145417xd4061a5a.lineTo(0.0f, 3.0f);
        m145417xd4061a5a.close();
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-16777216);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(31.5f, 18.0f);
        m145417xd4061a5a2.lineTo(31.5f, 46.5f);
        m145417xd4061a5a2.cubicTo(31.5f, 47.328426f, 30.828426f, 48.0f, 30.0f, 48.0f);
        m145417xd4061a5a2.lineTo(27.0f, 48.0f);
        m145417xd4061a5a2.cubicTo(26.171574f, 48.0f, 25.5f, 47.328426f, 25.5f, 46.5f);
        m145417xd4061a5a2.lineTo(25.5f, 18.0f);
        m145417xd4061a5a2.lineTo(13.5f, 18.0f);
        m145417xd4061a5a2.cubicTo(12.671573f, 18.0f, 12.0f, 17.328426f, 12.0f, 16.5f);
        m145417xd4061a5a2.lineTo(12.0f, 13.5f);
        m145417xd4061a5a2.cubicTo(12.0f, 12.671573f, 12.671573f, 12.0f, 13.5f, 12.0f);
        m145417xd4061a5a2.lineTo(45.0f, 12.0f);
        m145417xd4061a5a2.cubicTo(45.828426f, 12.0f, 46.5f, 12.671573f, 46.5f, 13.5f);
        m145417xd4061a5a2.lineTo(46.5f, 16.5f);
        m145417xd4061a5a2.cubicTo(46.5f, 17.328426f, 45.828426f, 18.0f, 45.0f, 18.0f);
        m145417xd4061a5a2.lineTo(31.5f, 18.0f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
