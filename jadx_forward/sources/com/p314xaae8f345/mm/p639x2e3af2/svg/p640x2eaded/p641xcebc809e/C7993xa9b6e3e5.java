package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_down_arrow */
/* loaded from: classes16.dex */
public class C7993xa9b6e3e5 extends l95.c {

    /* renamed from: width */
    private final int f23185x6be2dc6 = 72;

    /* renamed from: height */
    private final int f23184xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-436207616);
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 6.123234E-17f, 1.0f, 23.0f, -1.0f, 6.123234E-17f, 57.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(12.727922f, 0.27207795f);
                m145417xd4061a5a.lineTo(16.970562f, 4.5147185f);
                m145417xd4061a5a.lineTo(11.4863205f, 9.999078f);
                m145417xd4061a5a.lineTo(42.0f, 10.0f);
                m145417xd4061a5a.lineTo(42.0f, 16.0f);
                m145417xd4061a5a.lineTo(11.484321f, 15.999078f);
                m145417xd4061a5a.lineTo(16.970562f, 21.485281f);
                m145417xd4061a5a.lineTo(12.727922f, 25.727922f);
                m145417xd4061a5a.lineTo(1.0606601f, 14.06066f);
                m145417xd4061a5a.cubicTo(0.47487372f, 13.474874f, 0.47487372f, 12.525126f, 1.0606601f, 11.93934f);
                m145417xd4061a5a.lineTo(12.727922f, 0.27207795f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
