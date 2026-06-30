package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.count_down_5 */
/* loaded from: classes16.dex */
public class C7760x4845bd08 extends l95.c {

    /* renamed from: width */
    private final int f22719x6be2dc6 = 80;

    /* renamed from: height */
    private final int f22718xb7389127 = 80;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 80;
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
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-1);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(24.744f, 14.0f);
            m145417xd4061a5a.lineTo(55.704f, 14.0f);
            m145417xd4061a5a.lineTo(55.704f, 20.912f);
            m145417xd4061a5a.lineTo(31.08f, 20.912f);
            m145417xd4061a5a.lineTo(29.568f, 35.744f);
            m145417xd4061a5a.lineTo(29.784f, 35.744f);
            m145417xd4061a5a.cubicTo(31.368f, 34.088f, 33.168f, 32.936f, 35.256f, 32.216f);
            m145417xd4061a5a.cubicTo(37.128f, 31.424f, 39.288f, 31.064f, 41.592f, 31.064f);
            m145417xd4061a5a.cubicTo(46.416f, 31.064f, 50.376f, 32.648f, 53.4f, 35.816f);
            m145417xd4061a5a.cubicTo(56.424f, 38.984f, 58.008f, 43.304f, 58.008f, 48.848f);
            m145417xd4061a5a.cubicTo(58.008f, 54.176f, 55.992f, 58.496f, 52.104f, 61.88f);
            m145417xd4061a5a.cubicTo(48.432f, 64.904f, 44.04f, 66.416f, 38.928f, 66.416f);
            m145417xd4061a5a.cubicTo(34.32f, 66.416f, 30.36f, 65.12f, 27.048f, 62.6f);
            m145417xd4061a5a.cubicTo(23.376f, 59.864f, 21.36f, 56.048f, 21.0f, 51.296f);
            m145417xd4061a5a.lineTo(28.704f, 51.296f);
            m145417xd4061a5a.cubicTo(28.992f, 54.176f, 30.144f, 56.408f, 32.088f, 57.848f);
            m145417xd4061a5a.cubicTo(33.816f, 59.144f, 36.12f, 59.792f, 39.0f, 59.792f);
            m145417xd4061a5a.cubicTo(42.168f, 59.792f, 44.832f, 58.784f, 46.992f, 56.84f);
            m145417xd4061a5a.cubicTo(49.152f, 54.824f, 50.232f, 52.232f, 50.232f, 48.92f);
            m145417xd4061a5a.cubicTo(50.232f, 45.32f, 49.296f, 42.512f, 47.424f, 40.496f);
            m145417xd4061a5a.cubicTo(45.552f, 38.48f, 42.96f, 37.472f, 39.504f, 37.472f);
            m145417xd4061a5a.cubicTo(37.2f, 37.472f, 35.256f, 37.832f, 33.528f, 38.696f);
            m145417xd4061a5a.cubicTo(31.656f, 39.56f, 30.288f, 40.928f, 29.28f, 42.8f);
            m145417xd4061a5a.lineTo(21.936f, 42.8f);
            m145417xd4061a5a.lineTo(24.744f, 14.0f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
