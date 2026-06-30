package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.doodle_selected */
/* loaded from: classes16.dex */
public class C7826xf2f48701 extends l95.c {

    /* renamed from: width */
    private final int f22851x6be2dc6 = 63;

    /* renamed from: height */
    private final int f22850xb7389127 = 63;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 63;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                m145414xacbd08c9.setColor(-14624737);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 0.70710677f, -0.70710677f, 31.39409f, 0.70710677f, 0.70710677f, -12.125177f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(25.405478f, 12.6148405f);
                m145417xd4061a5a.lineTo(25.645857f, 54.121506f);
                m145417xd4061a5a.lineTo(30.480642f, 63.385418f);
                m145417xd4061a5a.lineTo(35.31543f, 54.121506f);
                m145417xd4061a5a.lineTo(35.21498f, 12.6148405f);
                m145417xd4061a5a.lineTo(25.405478f, 12.6148405f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(25.389639f, 9.879872f);
                m145417xd4061a5a.lineTo(25.351372f, 3.272119f);
                m145417xd4061a5a.cubicTo(25.341805f, 1.6204139f, 26.683146f, 0.28144225f, 28.343227f, 0.28144225f);
                m145417xd4061a5a.lineTo(32.175957f, 0.28144225f);
                m145417xd4061a5a.cubicTo(33.83788f, 0.28144225f, 35.188385f, 1.6257602f, 35.19237f, 3.272119f);
                m145417xd4061a5a.lineTo(35.208363f, 9.879872f);
                m145417xd4061a5a.lineTo(25.389639f, 9.879872f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
