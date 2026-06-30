package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.poi_navigation */
/* loaded from: classes16.dex */
public class C9708x13993b29 extends l95.c {

    /* renamed from: width */
    private final int f26617x6be2dc6 = 24;

    /* renamed from: height */
    private final int f26616xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                m145414xacbd08c9.setColor(-16777216);
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 0.70710677f, -0.70710677f, 11.171573f, 0.70710677f, 0.70710677f, -6.970563f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(14.464238f, 1.1605959f);
                m145417xd4061a5a.lineTo(21.408022f, 18.520058f);
                m145417xd4061a5a.cubicTo(21.51058f, 18.77645f, 21.385872f, 19.067434f, 21.12948f, 19.16999f);
                m145417xd4061a5a.cubicTo(20.977533f, 19.230768f, 20.805462f, 19.213343f, 20.668787f, 19.123337f);
                m145417xd4061a5a.lineTo(14.0f, 14.731639f);
                m145417xd4061a5a.lineTo(14.0f, 14.731639f);
                m145417xd4061a5a.lineTo(7.3312135f, 19.123337f);
                m145417xd4061a5a.cubicTo(7.1005883f, 19.275213f, 6.7905087f, 19.211374f, 6.638632f, 18.98075f);
                m145417xd4061a5a.cubicTo(6.5486245f, 18.844074f, 6.531199f, 18.672003f, 6.591977f, 18.520058f);
                m145417xd4061a5a.lineTo(13.535762f, 1.1605959f);
                m145417xd4061a5a.cubicTo(13.638318f, 0.90420413f, 13.929303f, 0.77949613f, 14.185696f, 0.88205284f);
                m145417xd4061a5a.cubicTo(14.312747f, 0.93287337f, 14.413418f, 1.0335445f, 14.464238f, 1.1605959f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
