package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.voice2txt_hint_cancel */
/* loaded from: classes16.dex */
public class C10145xca8bc2a3 extends l95.c {

    /* renamed from: width */
    private final int f27493x6be2dc6 = 24;

    /* renamed from: height */
    private final int f27492xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        canvas.saveLayerAlpha(null, 128, 31);
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(-1);
        canvas.save();
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(6.5857863f, 6.0f);
        m145417xd4061a5a.lineTo(8.414213f, 7.8284273f);
        m145417xd4061a5a.lineTo(7.0f, 9.2426405f);
        m145417xd4061a5a.lineTo(3.464466f, 5.7071066f);
        m145417xd4061a5a.cubicTo(3.0739417f, 5.3165827f, 3.0739417f, 4.6834173f, 3.464466f, 4.2928934f);
        m145417xd4061a5a.lineTo(7.0f, 0.7573593f);
        m145417xd4061a5a.lineTo(8.414213f, 2.171573f);
        m145417xd4061a5a.lineTo(6.5857863f, 4.0f);
        m145417xd4061a5a.lineTo(11.0f, 4.0f);
        m145417xd4061a5a.cubicTo(14.313708f, 4.0f, 17.0f, 6.6862917f, 17.0f, 10.0f);
        m145417xd4061a5a.cubicTo(17.0f, 13.313708f, 14.313708f, 16.0f, 11.0f, 16.0f);
        m145417xd4061a5a.lineTo(0.0f, 16.0f);
        m145417xd4061a5a.lineTo(0.0f, 14.0f);
        m145417xd4061a5a.lineTo(11.0f, 14.0f);
        m145417xd4061a5a.cubicTo(13.209139f, 14.0f, 15.0f, 12.209139f, 15.0f, 10.0f);
        m145417xd4061a5a.cubicTo(15.0f, 7.790861f, 13.209139f, 6.0f, 11.0f, 6.0f);
        m145417xd4061a5a.lineTo(6.5857863f, 6.0f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
