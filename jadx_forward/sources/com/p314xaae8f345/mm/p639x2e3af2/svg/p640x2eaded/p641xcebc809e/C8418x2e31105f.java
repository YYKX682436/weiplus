package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_outlined_search */
/* loaded from: classes16.dex */
public class C8418x2e31105f extends l95.c {

    /* renamed from: width */
    private final int f24035x6be2dc6 = 24;

    /* renamed from: height */
    private final int f24034xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
        }
        if (i17 != 2) {
            return 0;
        }
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
        m145417xd4061a5a.lineTo(24.0f, 0.0f);
        m145417xd4061a5a.lineTo(24.0f, 24.0f);
        m145417xd4061a5a.lineTo(0.0f, 24.0f);
        m145417xd4061a5a.lineTo(0.0f, 0.0f);
        m145417xd4061a5a.close();
        canvas.save();
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(-16777216);
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 3.6f, 0.0f, 1.0f, 3.6f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(7.245378f, 0.0f);
        m145417xd4061a5a2.cubicTo(11.246897f, 0.0f, 14.490756f, 3.2438593f, 14.490756f, 7.245378f);
        m145417xd4061a5a2.cubicTo(14.490756f, 9.048666f, 13.831973f, 10.698084f, 12.741946f, 11.966092f);
        m145417xd4061a5a2.lineTo(17.0f, 16.225233f);
        m145417xd4061a5a2.lineTo(16.121727f, 17.103506f);
        m145417xd4061a5a2.lineTo(11.853742f, 12.836574f);
        m145417xd4061a5a2.cubicTo(10.601368f, 13.869984f, 8.995869f, 14.490756f, 7.245378f, 14.490756f);
        m145417xd4061a5a2.cubicTo(3.2438593f, 14.490756f, 0.0f, 11.246897f, 0.0f, 7.245378f);
        m145417xd4061a5a2.cubicTo(0.0f, 3.2438593f, 3.2438593f, 0.0f, 7.245378f, 0.0f);
        m145417xd4061a5a2.close();
        m145417xd4061a5a2.moveTo(7.245375f, 1.2420775f);
        m145417xd4061a5a2.cubicTo(3.9298308f, 1.2420775f, 1.2420616f, 3.9298465f, 1.2420616f, 7.245391f);
        m145417xd4061a5a2.cubicTo(1.2420616f, 10.560935f, 3.9298308f, 13.248704f, 7.245375f, 13.248704f);
        m145417xd4061a5a2.cubicTo(10.560919f, 13.248704f, 13.248688f, 10.560935f, 13.248688f, 7.245391f);
        m145417xd4061a5a2.cubicTo(13.248688f, 3.9298465f, 10.560919f, 1.2420775f, 7.245375f, 1.2420775f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
