package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sns_img_tipsbubble */
/* loaded from: classes16.dex */
public class C9938x93b52567 extends l95.c {

    /* renamed from: width */
    private final int f27079x6be2dc6 = nd1.k2.f72953x366c91de;

    /* renamed from: height */
    private final int f27078xb7389127 = 96;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return nd1.k2.f72953x366c91de;
        }
        if (i17 == 1) {
            return 96;
        }
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
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(419430400);
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(0.0f, 9.00051f);
            m145417xd4061a5a.cubicTo(0.0f, 4.0296655f, 4.0212784f, 0.0f, 8.997707f, 0.0f);
            m145417xd4061a5a.lineTo(575.0023f, 0.0f);
            m145417xd4061a5a.cubicTo(579.9716f, 0.0f, 584.0f, 4.0326095f, 584.0f, 9.00051f);
            m145417xd4061a5a.lineTo(584.0f, 76.99949f);
            m145417xd4061a5a.cubicTo(584.0f, 81.97034f, 579.9787f, 86.0f, 575.0023f, 86.0f);
            m145417xd4061a5a.lineTo(8.997707f, 86.0f);
            m145417xd4061a5a.cubicTo(4.028411f, 86.0f, 0.0f, 81.96739f, 0.0f, 76.99949f);
            m145417xd4061a5a.lineTo(0.0f, 9.00051f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(113.04867f, 96.0f);
            m145417xd4061a5a.lineTo(104.0f, 86.0f);
            m145417xd4061a5a.lineTo(122.09733f, 86.0f);
            m145417xd4061a5a.lineTo(113.04867f, 96.0f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
