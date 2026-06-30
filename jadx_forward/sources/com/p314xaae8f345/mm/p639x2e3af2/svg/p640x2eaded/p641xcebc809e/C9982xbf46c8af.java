package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.status_accountkey_off */
/* loaded from: classes16.dex */
public class C9982xbf46c8af extends l95.c {

    /* renamed from: width */
    private final int f27167x6be2dc6 = 46;

    /* renamed from: height */
    private final int f27166xb7389127 = 46;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 46;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
            if (i17 == 2) {
                android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
                android.os.Looper looper = (android.os.Looper) objArr[1];
                l95.c.m145412xe5ca94b6(looper);
                l95.c.m145413xf00d6f43(looper);
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
                m145414xacbd08c9.setColor(-499359);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(23.0f, 0.0f);
                m145417xd4061a5a.cubicTo(35.70255f, 0.0f, 46.0f, 10.29745f, 46.0f, 23.0f);
                m145417xd4061a5a.cubicTo(46.0f, 35.70255f, 35.70255f, 46.0f, 23.0f, 46.0f);
                m145417xd4061a5a.cubicTo(10.29745f, 46.0f, 0.0f, 35.70255f, 0.0f, 23.0f);
                m145417xd4061a5a.cubicTo(0.0f, 10.29745f, 10.29745f, 0.0f, 23.0f, 0.0f);
                m145417xd4061a5a.close();
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
                canvas.restore();
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c92.setColor(-1);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(29.85458f, 16.970005f);
                m145417xd4061a5a2.cubicTo(29.680027f, 15.727787f, 29.348436f, 14.533834f, 28.44f, 13.570005f);
                m145417xd4061a5a2.cubicTo(25.85f, 10.150005f, 20.18f, 10.140005f, 17.59f, 13.560005f);
                m145417xd4061a5a2.cubicTo(15.97f, 15.310005f, 16.18f, 17.790005f, 15.83f, 19.970005f);
                m145417xd4061a5a2.lineTo(13.0f, 19.970005f);
                m145417xd4061a5a2.cubicTo(13.01f, 24.310005f, 13.01f, 28.640005f, 13.01f, 32.970005f);
                m145417xd4061a5a2.lineTo(33.01f, 32.970005f);
                m145417xd4061a5a2.cubicTo(33.01f, 28.640005f, 33.01f, 24.310005f, 33.02f, 19.970005f);
                m145417xd4061a5a2.lineTo(31.605f, 19.970005f);
                m145417xd4061a5a2.lineTo(26.1f, 19.970005f);
                m145417xd4061a5a2.lineTo(18.83f, 19.970005f);
                m145417xd4061a5a2.cubicTo(18.81f, 17.350006f, 19.72f, 13.870006f, 23.0f, 13.970005f);
                m145417xd4061a5a2.cubicTo(25.080025f, 13.887314f, 26.22539f, 15.273373f, 26.773254f, 16.970005f);
                m145417xd4061a5a2.lineTo(29.85458f, 16.970005f);
                m145417xd4061a5a2.lineTo(29.85458f, 16.970005f);
                m145417xd4061a5a2.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
                canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
