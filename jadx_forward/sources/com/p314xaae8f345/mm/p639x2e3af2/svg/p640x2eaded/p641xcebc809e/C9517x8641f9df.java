package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.multitask_indicator_scale_icon */
/* loaded from: classes16.dex */
public class C9517x8641f9df extends l95.c {

    /* renamed from: width */
    private final int f26235x6be2dc6 = 72;

    /* renamed from: height */
    private final int f26234xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-1);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(49.5f, 30.0f);
                m145417xd4061a5a.cubicTo(52.81371f, 30.0f, 55.5f, 32.68629f, 55.5f, 36.0f);
                m145417xd4061a5a.cubicTo(55.5f, 39.31371f, 52.81371f, 42.0f, 49.5f, 42.0f);
                m145417xd4061a5a.cubicTo(46.18629f, 42.0f, 43.5f, 39.31371f, 43.5f, 36.0f);
                m145417xd4061a5a.cubicTo(43.5f, 32.68629f, 46.18629f, 30.0f, 49.5f, 30.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(22.5f, 30.0f);
                m145417xd4061a5a.cubicTo(25.81371f, 30.0f, 28.5f, 32.68629f, 28.5f, 36.0f);
                m145417xd4061a5a.cubicTo(28.5f, 39.31371f, 25.81371f, 42.0f, 22.5f, 42.0f);
                m145417xd4061a5a.cubicTo(19.18629f, 42.0f, 16.5f, 39.31371f, 16.5f, 36.0f);
                m145417xd4061a5a.cubicTo(16.5f, 32.68629f, 19.18629f, 30.0f, 22.5f, 30.0f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
