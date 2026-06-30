package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_speed_guide */
/* loaded from: classes16.dex */
public class C8180x2b96da6b extends l95.c {

    /* renamed from: width */
    private final int f23559x6be2dc6 = 91;

    /* renamed from: height */
    private final int f23558xb7389127 = 96;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 91;
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
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-1);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(32.3575f, 58.2393f);
            m145417xd4061a5a.lineTo(20.2149f, 22.4082f);
            m145417xd4061a5a.cubicTo(18.9422f, 18.6526f, 20.8247f, 14.5569f, 24.5037f, 13.0774f);
            m145417xd4061a5a.cubicTo(28.2111f, 11.5864f, 32.4353f, 13.2761f, 34.0917f, 16.9125f);
            m145417xd4061a5a.lineTo(42.3406f, 35.0218f);
            m145417xd4061a5a.lineTo(60.1161f, 33.2356f);
            m145417xd4061a5a.cubicTo(70.1537f, 32.2269f, 79.0603f, 39.6633f, 79.8593f, 49.7197f);
            m145417xd4061a5a.lineTo(81.7014f, 72.905f);
            m145417xd4061a5a.cubicTo(82.007f, 76.7511f, 79.5239f, 80.2674f, 75.7971f, 81.266f);
            m145417xd4061a5a.lineTo(47.3008f, 88.9016f);
            m145417xd4061a5a.cubicTo(46.0981f, 89.2238f, 44.8139f, 88.9608f, 43.8347f, 88.1917f);
            m145417xd4061a5a.lineTo(17.0914f, 67.1848f);
            m145417xd4061a5a.cubicTo(14.4019f, 65.0722f, 13.5497f, 61.37f, 15.045f, 58.2942f);
            m145417xd4061a5a.cubicTo(16.7478f, 54.7914f, 20.9097f, 53.2542f, 24.4806f, 54.8092f);
            m145417xd4061a5a.lineTo(32.3575f, 58.2393f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
