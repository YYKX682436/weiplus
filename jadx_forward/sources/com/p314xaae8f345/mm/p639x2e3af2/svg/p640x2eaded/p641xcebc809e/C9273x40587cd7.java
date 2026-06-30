package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.kinda_down_bubble */
/* loaded from: classes16.dex */
public class C9273x40587cd7 extends l95.c {

    /* renamed from: width */
    private final int f25745x6be2dc6 = 80;

    /* renamed from: height */
    private final int f25744xb7389127 = 41;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 80;
        }
        if (i17 == 1) {
            return 41;
        }
        if (i17 != 2) {
            return 0;
        }
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
        canvas.save();
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(-526345);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(0.0f, 4.0f);
        m145417xd4061a5a.cubicTo(0.0f, 1.7908609f, 1.7908609f, 0.0f, 4.0f, 0.0f);
        m145417xd4061a5a.lineTo(76.0f, 0.0f);
        m145417xd4061a5a.cubicTo(78.20914f, 0.0f, 80.0f, 1.7908609f, 80.0f, 4.0f);
        m145417xd4061a5a.lineTo(80.0f, 32.0f);
        m145417xd4061a5a.cubicTo(80.0f, 34.20914f, 78.20914f, 36.0f, 76.0f, 36.0f);
        m145417xd4061a5a.lineTo(4.0f, 36.0f);
        m145417xd4061a5a.cubicTo(1.7908609f, 36.0f, 0.0f, 34.20914f, 0.0f, 32.0f);
        m145417xd4061a5a.lineTo(0.0f, 4.0f);
        m145417xd4061a5a.close();
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-526345);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(64.0f, 35.0005f);
        m145417xd4061a5a2.cubicTo(64.0f, 35.5529f, 63.5369f, 36.0043f, 63.0364f, 36.238f);
        m145417xd4061a5a2.cubicTo(62.5985f, 36.4425f, 62.1833f, 36.7601f, 61.859f, 37.1152f);
        m145417xd4061a5a2.lineTo(58.7688f, 40.4994f);
        m145417xd4061a5a2.cubicTo(58.1567f, 41.1696f, 57.1811f, 41.1693f, 56.5694f, 40.4994f);
        m145417xd4061a5a2.lineTo(53.4791f, 37.1152f);
        m145417xd4061a5a2.cubicTo(53.1239f, 36.7262f, 52.5576f, 36.3829f, 51.9789f, 36.1835f);
        m145417xd4061a5a2.cubicTo(51.4566f, 36.0035f, 51.0f, 35.5529f, 51.0f, 35.0005f);
        m145417xd4061a5a2.lineTo(51.0f, 35.0005f);
        m145417xd4061a5a2.cubicTo(51.0f, 34.4481f, 51.4478f, 34.0002f, 52.0002f, 34.0002f);
        m145417xd4061a5a2.lineTo(62.9998f, 34.0002f);
        m145417xd4061a5a2.cubicTo(63.5522f, 34.0002f, 64.0f, 34.4481f, 64.0f, 35.0005f);
        m145417xd4061a5a2.lineTo(64.0f, 35.0005f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
