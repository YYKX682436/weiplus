package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_self_feed_like_arrow */
/* loaded from: classes16.dex */
public class C8177xbe7ffe28 extends l95.c {

    /* renamed from: width */
    private final int f23553x6be2dc6 = 24;

    /* renamed from: height */
    private final int f23552xb7389127 = 24;

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
        canvas.save();
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(-16777216);
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, -1.0f, 1.2246469E-16f, 19.0f, -1.2246469E-16f, -1.0f, 17.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(13.0f, 4.25f);
        m145417xd4061a5a.lineTo(13.0f, 5.75f);
        m145417xd4061a5a.lineTo(2.8711069f, 5.749359f);
        m145417xd4061a5a.lineTo(5.303301f, 8.18198f);
        m145417xd4061a5a.lineTo(4.2426405f, 9.2426405f);
        m145417xd4061a5a.lineTo(0.35355338f, 5.3535533f);
        m145417xd4061a5a.cubicTo(0.15829125f, 5.1582913f, 0.15829125f, 4.8417087f, 0.35355338f, 4.6464467f);
        m145417xd4061a5a.lineTo(1.0606601f, 3.9393399f);
        m145417xd4061a5a.lineTo(1.0611068f, 3.9393594f);
        m145417xd4061a5a.lineTo(4.2426405f, 0.7573593f);
        m145417xd4061a5a.lineTo(5.303301f, 1.8180195f);
        m145417xd4061a5a.lineTo(2.8711069f, 4.249359f);
        m145417xd4061a5a.lineTo(13.0f, 4.25f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
