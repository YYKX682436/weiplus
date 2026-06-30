package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.record_nopicture_icon */
/* loaded from: classes16.dex */
public class C9788x6d683109 extends l95.c {

    /* renamed from: width */
    private final int f26779x6be2dc6 = 180;

    /* renamed from: height */
    private final int f26778xb7389127 = 180;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 180;
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
                m145414xacbd08c9.setColor(-1315861);
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 20.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(171.0f, 90.18926f);
                m145417xd4061a5a.lineTo(171.0f, 9.032258f);
                m145417xd4061a5a.lineTo(9.0f, 9.032258f);
                m145417xd4061a5a.lineTo(9.0f, 89.96034f);
                m145417xd4061a5a.lineTo(60.553738f, 41.65066f);
                m145417xd4061a5a.lineTo(121.92021f, 98.15694f);
                m145417xd4061a5a.lineTo(113.13358f, 80.02691f);
                m145417xd4061a5a.lineTo(138.16164f, 60.600388f);
                m145417xd4061a5a.lineTo(171.0f, 90.18926f);
                m145417xd4061a5a.lineTo(171.0f, 90.18926f);
                m145417xd4061a5a.lineTo(171.0f, 90.18926f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(4.494371f, 0.0f);
                m145417xd4061a5a.cubicTo(2.0121984f, 0.0f, 0.0f, 2.0194945f, 0.0f, 4.5191708f);
                m145417xd4061a5a.lineTo(0.0f, 135.48083f);
                m145417xd4061a5a.cubicTo(0.0f, 137.9767f, 2.0214844f, 140.0f, 4.494371f, 140.0f);
                m145417xd4061a5a.lineTo(175.50563f, 140.0f);
                m145417xd4061a5a.cubicTo(177.98781f, 140.0f, 180.0f, 137.9805f, 180.0f, 135.48083f);
                m145417xd4061a5a.lineTo(180.0f, 4.5191708f);
                m145417xd4061a5a.cubicTo(180.0f, 2.0233016f, 177.97852f, 0.0f, 175.50563f, 0.0f);
                m145417xd4061a5a.lineTo(4.494371f, 0.0f);
                m145417xd4061a5a.lineTo(4.494371f, 0.0f);
                m145417xd4061a5a.lineTo(4.494371f, 0.0f);
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
