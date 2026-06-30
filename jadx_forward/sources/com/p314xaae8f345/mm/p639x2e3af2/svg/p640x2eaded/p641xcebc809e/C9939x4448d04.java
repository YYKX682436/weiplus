package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sns_label_more_btn */
/* loaded from: classes16.dex */
public class C9939x4448d04 extends l95.c {

    /* renamed from: width */
    private final int f27081x6be2dc6 = 24;

    /* renamed from: height */
    private final int f27080xb7389127 = 24;

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
                canvas.saveLayerAlpha(null, 128, 31);
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-16777216);
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(10.0f, 20.0f);
                m145417xd4061a5a.cubicTo(4.4771523f, 20.0f, 0.0f, 15.522847f, 0.0f, 10.0f);
                m145417xd4061a5a.cubicTo(0.0f, 4.4771523f, 4.4771523f, 0.0f, 10.0f, 0.0f);
                m145417xd4061a5a.cubicTo(15.522847f, 0.0f, 20.0f, 4.4771523f, 20.0f, 10.0f);
                m145417xd4061a5a.cubicTo(20.0f, 15.522847f, 15.522847f, 20.0f, 10.0f, 20.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(10.0f, 18.8f);
                m145417xd4061a5a.cubicTo(14.8601055f, 18.8f, 18.8f, 14.8601055f, 18.8f, 10.0f);
                m145417xd4061a5a.cubicTo(18.8f, 5.139894f, 14.8601055f, 1.2f, 10.0f, 1.2f);
                m145417xd4061a5a.cubicTo(5.139894f, 1.2f, 1.2f, 5.139894f, 1.2f, 10.0f);
                m145417xd4061a5a.cubicTo(1.2f, 14.8601055f, 5.139894f, 18.8f, 10.0f, 18.8f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                canvas.save();
                android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(6.0f, 9.0f);
                m145417xd4061a5a2.cubicTo(6.5522847f, 9.0f, 7.0f, 9.447715f, 7.0f, 10.0f);
                m145417xd4061a5a2.cubicTo(7.0f, 10.552285f, 6.5522847f, 11.0f, 6.0f, 11.0f);
                m145417xd4061a5a2.cubicTo(5.4477153f, 11.0f, 5.0f, 10.552285f, 5.0f, 10.0f);
                m145417xd4061a5a2.cubicTo(5.0f, 9.447715f, 5.4477153f, 9.0f, 6.0f, 9.0f);
                m145417xd4061a5a2.close();
                canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c93);
                canvas.restore();
                canvas.save();
                android.graphics.Paint m145414xacbd08c94 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a3 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a3.moveTo(10.0f, 9.0f);
                m145417xd4061a5a3.cubicTo(10.552285f, 9.0f, 11.0f, 9.447715f, 11.0f, 10.0f);
                m145417xd4061a5a3.cubicTo(11.0f, 10.552285f, 10.552285f, 11.0f, 10.0f, 11.0f);
                m145417xd4061a5a3.cubicTo(9.447715f, 11.0f, 9.0f, 10.552285f, 9.0f, 10.0f);
                m145417xd4061a5a3.cubicTo(9.0f, 9.447715f, 9.447715f, 9.0f, 10.0f, 9.0f);
                m145417xd4061a5a3.close();
                canvas.drawPath(m145417xd4061a5a3, m145414xacbd08c94);
                canvas.restore();
                canvas.save();
                android.graphics.Paint m145414xacbd08c95 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a4 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a4.moveTo(14.0f, 9.0f);
                m145417xd4061a5a4.cubicTo(14.552285f, 9.0f, 15.0f, 9.447715f, 15.0f, 10.0f);
                m145417xd4061a5a4.cubicTo(15.0f, 10.552285f, 14.552285f, 11.0f, 14.0f, 11.0f);
                m145417xd4061a5a4.cubicTo(13.447715f, 11.0f, 13.0f, 10.552285f, 13.0f, 10.0f);
                m145417xd4061a5a4.cubicTo(13.0f, 9.447715f, 13.447715f, 9.0f, 14.0f, 9.0f);
                m145417xd4061a5a4.close();
                canvas.drawPath(m145417xd4061a5a4, m145414xacbd08c95);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
