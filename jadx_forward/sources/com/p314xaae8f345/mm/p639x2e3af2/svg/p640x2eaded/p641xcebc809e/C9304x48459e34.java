package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.kinda_right_arrow */
/* loaded from: classes16.dex */
public class C9304x48459e34 extends l95.c {

    /* renamed from: width */
    private final int f25807x6be2dc6 = 10;

    /* renamed from: height */
    private final int f25806xb7389127 = 20;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 10;
        }
        if (i17 == 1) {
            return 20;
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
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c92, looper);
            m145414xacbd08c9.setColor(-16777216);
            m145414xacbd08c92.setStrokeWidth(1.0f);
            canvas.saveLayerAlpha(null, 204, 31);
            canvas.save();
            float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 1.666667f, 0.0f, 1.0f, 4.166667f, 0.0f, 0.0f, 1.0f);
            m145412xe5ca94b6.reset();
            m145412xe5ca94b6.setValues(m145419x1d8aec80);
            canvas.concat(m145412xe5ca94b6);
            canvas.save();
            android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
            m145414xacbd08c93.setColor(-436207616);
            float[] m145419x1d8aec802 = l95.c.m145419x1d8aec80(m145419x1d8aec80, -1.0f, 1.2246469E-16f, 6.701306f, -1.2246469E-16f, -1.0f, 11.67545f, 0.0f, 0.0f, 1.0f);
            m145412xe5ca94b6.reset();
            m145412xe5ca94b6.setValues(m145419x1d8aec802);
            canvas.concat(m145412xe5ca94b6);
            canvas.save();
            android.graphics.Paint m145414xacbd08c94 = l95.c.m145414xacbd08c9(m145414xacbd08c93, looper);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(6.322924f, 10.358243f);
            m145417xd4061a5a.lineTo(5.4390407f, 11.242126f);
            m145417xd4061a5a.lineTo(0.6232929f, 6.4263787f);
            m145417xd4061a5a.cubicTo(0.29818854f, 6.1012745f, 0.29530483f, 5.5770597f, 0.6232929f, 5.2490716f);
            m145417xd4061a5a.lineTo(5.4390407f, 0.4333242f);
            m145417xd4061a5a.lineTo(6.322924f, 1.3172077f);
            m145417xd4061a5a.lineTo(1.8024063f, 5.837725f);
            m145417xd4061a5a.lineTo(6.322924f, 10.358243f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c94);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
