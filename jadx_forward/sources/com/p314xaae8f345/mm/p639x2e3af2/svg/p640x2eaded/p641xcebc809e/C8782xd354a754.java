package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_transform */
/* loaded from: classes16.dex */
public class C8782xd354a754 extends l95.c {

    /* renamed from: width */
    private final int f24763x6be2dc6 = 72;

    /* renamed from: height */
    private final int f24762xb7389127 = 72;

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
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(0.0f, 0.0f);
                m145417xd4061a5a.lineTo(72.0f, 0.0f);
                m145417xd4061a5a.lineTo(72.0f, 72.0f);
                m145417xd4061a5a.lineTo(0.0f, 72.0f);
                m145417xd4061a5a.lineTo(0.0f, 0.0f);
                m145417xd4061a5a.close();
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-436207616);
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, -1.8369701E-16f, -1.0f, 72.0f, 1.0f, -1.8369701E-16f, 6.6130924E-15f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(57.57888f, 13.5f);
                m145417xd4061a5a2.cubicTo(58.738678f, 13.5f, 59.67888f, 14.440202f, 59.67888f, 15.6f);
                m145417xd4061a5a2.cubicTo(59.67888f, 16.19069f, 59.430107f, 16.754065f, 58.993565f, 17.151989f);
                m145417xd4061a5a2.lineTo(38.315105f, 36.0f);
                m145417xd4061a5a2.lineTo(58.993565f, 54.84801f);
                m145417xd4061a5a2.cubicTo(59.850704f, 55.629322f, 59.912174f, 56.957546f, 59.130867f, 57.814686f);
                m145417xd4061a5a2.cubicTo(58.732944f, 58.25123f, 58.169567f, 58.5f, 57.57888f, 58.5f);
                m145417xd4061a5a2.lineTo(14.421122f, 58.5f);
                m145417xd4061a5a2.cubicTo(13.261323f, 58.5f, 12.321121f, 57.5598f, 12.321121f, 56.4f);
                m145417xd4061a5a2.cubicTo(12.321121f, 55.80931f, 12.569893f, 55.245934f, 13.006436f, 54.84801f);
                m145417xd4061a5a2.lineTo(33.68411f, 36.0f);
                m145417xd4061a5a2.lineTo(13.006436f, 17.151989f);
                m145417xd4061a5a2.cubicTo(12.149298f, 16.37068f, 12.087824f, 15.042455f, 12.869133f, 14.185315f);
                m145417xd4061a5a2.cubicTo(13.2670555f, 13.748772f, 13.830432f, 13.5f, 14.421122f, 13.5f);
                m145417xd4061a5a2.lineTo(57.57888f, 13.5f);
                m145417xd4061a5a2.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
                canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c9);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
