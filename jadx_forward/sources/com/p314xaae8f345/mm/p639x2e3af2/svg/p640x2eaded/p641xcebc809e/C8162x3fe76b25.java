package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_outlined_arrow */
/* loaded from: classes16.dex */
public class C8162x3fe76b25 extends l95.c {

    /* renamed from: width */
    private final int f23523x6be2dc6 = 24;

    /* renamed from: height */
    private final int f23522xb7389127 = 24;

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
        canvas.save();
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(-436207616);
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 6.123234E-17f, 1.0f, 7.757359f, -1.0f, 6.123234E-17f, 18.792892f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(13.792893f, 3.4926407f);
        m145417xd4061a5a.lineTo(13.792893f, 4.9926405f);
        m145417xd4061a5a.lineTo(2.664f, 4.992f);
        m145417xd4061a5a.lineTo(5.0961943f, 7.424621f);
        m145417xd4061a5a.lineTo(4.035534f, 8.485281f);
        m145417xd4061a5a.lineTo(0.14644662f, 4.5961943f);
        m145417xd4061a5a.cubicTo(-0.048815537f, 4.400932f, -0.048815537f, 4.0843496f, 0.14644662f, 3.8890872f);
        m145417xd4061a5a.lineTo(0.8535534f, 3.1819806f);
        m145417xd4061a5a.lineTo(0.854f, 3.182f);
        m145417xd4061a5a.lineTo(4.035534f, -7.1054274E-15f);
        m145417xd4061a5a.lineTo(5.0961943f, 1.0606601f);
        m145417xd4061a5a.lineTo(2.664f, 3.492f);
        m145417xd4061a5a.lineTo(13.792893f, 3.4926407f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
