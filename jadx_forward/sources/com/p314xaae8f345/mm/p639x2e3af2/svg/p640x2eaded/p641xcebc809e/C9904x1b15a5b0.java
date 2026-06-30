package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sns_ad_feedback_trangle */
/* loaded from: classes16.dex */
public class C9904x1b15a5b0 extends l95.c {

    /* renamed from: width */
    private final int f27011x6be2dc6 = 15;

    /* renamed from: height */
    private final int f27010xb7389127 = 6;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 15;
        }
        if (i17 == 1) {
            return 6;
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
            m145414xacbd08c9.setColor(-1);
            float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, -1.8369701E-16f, -1.0f, 12.71027f, 1.0f, -1.8369701E-16f, -2.4164877f, 0.0f, 0.0f, 1.0f);
            m145412xe5ca94b6.reset();
            m145412xe5ca94b6.setValues(m145419x1d8aec80);
            canvas.concat(m145412xe5ca94b6);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(8.416489f, -3.8531091f);
            m145417xd4061a5a.lineTo(8.416489f, -1.4806807f);
            m145417xd4061a5a.cubicTo(8.416489f, -0.9334073f, 8.088407f, -0.1992531f, 7.6654387f, 0.17526627f);
            m145417xd4061a5a.lineTo(2.7301433f, 4.545249f);
            m145417xd4061a5a.cubicTo(2.31535f, 4.91253f, 2.3161323f, 5.5073094f, 2.7301433f, 5.8721867f);
            m145417xd4061a5a.lineTo(7.6654387f, 10.221771f);
            m145417xd4061a5a.cubicTo(8.080232f, 10.5873375f, 8.416489f, 11.337422f, 8.416489f, 11.880487f);
            m145417xd4061a5a.lineTo(8.416489f, 14.146891f);
            m145417xd4061a5a.lineTo(13.147665f, 14.146891f);
            m145417xd4061a5a.lineTo(13.147665f, -3.8531091f);
            m145417xd4061a5a.lineTo(8.416489f, -3.8531091f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
