package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* loaded from: classes16.dex */
public class wu extends l95.c {

    /* renamed from: width */
    private final int f27729x6be2dc6 = 72;

    /* renamed from: height */
    private final int f27728xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            canvas.saveLayerAlpha(null, 204, 31);
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-1);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(36.0f, 16.0f);
            m145417xd4061a5a.cubicTo(47.045696f, 16.0f, 56.0f, 24.954306f, 56.0f, 36.0f);
            m145417xd4061a5a.cubicTo(56.0f, 47.045696f, 47.045696f, 56.0f, 36.0f, 56.0f);
            m145417xd4061a5a.cubicTo(24.954306f, 56.0f, 16.0f, 47.045696f, 16.0f, 36.0f);
            m145417xd4061a5a.cubicTo(16.0f, 24.954306f, 24.954306f, 16.0f, 36.0f, 16.0f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(23.48019f, 26.306059f);
            m145417xd4061a5a.cubicTo(21.4031f, 28.98474f, 20.166666f, 32.347977f, 20.166666f, 36.0f);
            m145417xd4061a5a.cubicTo(20.166666f, 44.744507f, 27.255491f, 51.833332f, 36.0f, 51.833332f);
            m145417xd4061a5a.cubicTo(39.652023f, 51.833332f, 43.01526f, 50.5969f, 45.693943f, 48.51981f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(36.0f, 20.166666f);
            m145417xd4061a5a.cubicTo(32.347977f, 20.166666f, 28.98474f, 21.4031f, 26.306059f, 23.48019f);
            m145417xd4061a5a.lineTo(48.51981f, 45.693943f);
            m145417xd4061a5a.cubicTo(50.5969f, 43.01526f, 51.833332f, 39.652023f, 51.833332f, 36.0f);
            m145417xd4061a5a.cubicTo(51.833332f, 27.255491f, 44.744507f, 20.166666f, 36.0f, 20.166666f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
