package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.offline_notification */
/* loaded from: classes16.dex */
public class C9600x9e8ecdc7 extends l95.c {

    /* renamed from: width */
    private final int f26401x6be2dc6 = 33;

    /* renamed from: height */
    private final int f26400xb7389127 = 42;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 33;
        }
        if (i17 == 1) {
            return 42;
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
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-16036);
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
            float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 6.123234E-17f, -1.0f, 37.0f, 1.0f, 6.123234E-17f, 4.0f, 0.0f, 0.0f, 1.0f);
            m145412xe5ca94b6.reset();
            m145412xe5ca94b6.setValues(m145419x1d8aec80);
            canvas.concat(m145412xe5ca94b6);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(-4.0f, 13.0f);
            m145417xd4061a5a.lineTo(6.0f, 13.0f);
            m145417xd4061a5a.lineTo(17.0f, 5.0f);
            m145417xd4061a5a.lineTo(20.0f, 5.0f);
            m145417xd4061a5a.lineTo(20.0f, 36.0f);
            m145417xd4061a5a.lineTo(17.0f, 36.0f);
            m145417xd4061a5a.lineTo(6.0f, 28.0f);
            m145417xd4061a5a.lineTo(-4.0f, 28.0f);
            m145417xd4061a5a.lineTo(-4.0f, 13.0f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(27.0f, 19.0f);
            m145417xd4061a5a.lineTo(37.0f, 19.0f);
            m145417xd4061a5a.lineTo(37.0f, 22.0f);
            m145417xd4061a5a.lineTo(27.0f, 22.0f);
            m145417xd4061a5a.lineTo(27.0f, 19.0f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(27.0f, 12.0f);
            m145417xd4061a5a.lineTo(37.0f, 8.0f);
            m145417xd4061a5a.lineTo(37.0f, 11.0f);
            m145417xd4061a5a.lineTo(27.0f, 15.0f);
            m145417xd4061a5a.lineTo(27.0f, 12.0f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(37.0f, 29.0f);
            m145417xd4061a5a.lineTo(27.0f, 25.0f);
            m145417xd4061a5a.lineTo(27.0f, 28.0f);
            m145417xd4061a5a.lineTo(37.0f, 32.0f);
            m145417xd4061a5a.lineTo(37.0f, 29.0f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
