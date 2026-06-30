package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_attach_file_arrow_up */
/* loaded from: classes16.dex */
public class C7268xba0710d8 extends l95.c {

    /* renamed from: width */
    private final int f21735x6be2dc6 = 36;

    /* renamed from: height */
    private final int f21734xb7389127 = 36;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 36;
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
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, -1.8369701E-16f, -1.0f, 33.0f, 1.0f, -1.8369701E-16f, -1.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(1.0f, 0.0f);
        m145417xd4061a5a.lineTo(37.0f, 0.0f);
        m145417xd4061a5a.lineTo(37.0f, 30.0f);
        m145417xd4061a5a.lineTo(1.0f, 30.0f);
        m145417xd4061a5a.lineTo(1.0f, 0.0f);
        m145417xd4061a5a.close();
        canvas.save();
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(-436207616);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(11.684951f, 3.75f);
        m145417xd4061a5a2.lineTo(15.354067f, 7.5f);
        m145417xd4061a5a2.lineTo(10.609327f, 12.348f);
        m145417xd4061a5a2.lineTo(21.433258f, 12.34835f);
        m145417xd4061a5a2.lineTo(21.433258f, 17.65165f);
        m145417xd4061a5a2.lineTo(10.610328f, 17.651f);
        m145417xd4061a5a2.lineTo(15.354067f, 22.5f);
        m145417xd4061a5a2.lineTo(11.684951f, 26.25f);
        m145417xd4061a5a2.lineTo(1.2001371f, 15.534054f);
        m145417xd4061a5a2.cubicTo(0.9097244f, 15.237239f, 0.9097244f, 14.762761f, 1.2001371f, 14.465946f);
        m145417xd4061a5a2.lineTo(4.3467183f, 11.25f);
        m145417xd4061a5a2.lineTo(11.684951f, 3.75f);
        m145417xd4061a5a2.close();
        m145417xd4061a5a2.moveTo(29.216629f, 12.34835f);
        m145417xd4061a5a2.lineTo(29.216629f, 17.65165f);
        m145417xd4061a5a2.lineTo(24.027716f, 17.65165f);
        m145417xd4061a5a2.lineTo(24.027716f, 12.34835f);
        m145417xd4061a5a2.lineTo(29.216629f, 12.34835f);
        m145417xd4061a5a2.close();
        m145417xd4061a5a2.moveTo(37.0f, 12.34835f);
        m145417xd4061a5a2.lineTo(37.0f, 17.65165f);
        m145417xd4061a5a2.lineTo(31.811087f, 17.65165f);
        m145417xd4061a5a2.lineTo(31.811087f, 12.34835f);
        m145417xd4061a5a2.lineTo(37.0f, 12.34835f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c9);
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
