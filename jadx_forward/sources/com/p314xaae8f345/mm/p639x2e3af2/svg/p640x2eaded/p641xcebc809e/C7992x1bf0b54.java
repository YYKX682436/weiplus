package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_comment_image_flow_swipe_up */
/* loaded from: classes16.dex */
public class C7992x1bf0b54 extends l95.c {

    /* renamed from: width */
    private final int f23183x6be2dc6 = 16;

    /* renamed from: height */
    private final int f23182xb7389127 = 16;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
        m145414xacbd08c9.setColor(-436207616);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(7.52612f, 8.77117f);
        m145417xd4061a5a.lineTo(3.75488f, 4.99994f);
        m145417xd4061a5a.lineTo(4.69769f, 4.05713f);
        m145417xd4061a5a.lineTo(7.99752f, 7.35696f);
        m145417xd4061a5a.lineTo(11.2974f, 4.05713f);
        m145417xd4061a5a.lineTo(12.2402f, 4.99994f);
        m145417xd4061a5a.lineTo(8.46893f, 8.77117f);
        m145417xd4061a5a.cubicTo(8.20858f, 9.03152f, 7.78647f, 9.03152f, 7.52612f, 8.77117f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-436207616);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(7.52612f, 12.7712f);
        m145417xd4061a5a2.lineTo(3.75488f, 8.99994f);
        m145417xd4061a5a2.lineTo(4.69769f, 8.05713f);
        m145417xd4061a5a2.lineTo(7.99752f, 11.357f);
        m145417xd4061a5a2.lineTo(11.2974f, 8.05713f);
        m145417xd4061a5a2.lineTo(12.2402f, 8.99994f);
        m145417xd4061a5a2.lineTo(8.46893f, 12.7712f);
        m145417xd4061a5a2.cubicTo(8.20858f, 13.0315f, 7.78647f, 13.0315f, 7.52612f, 12.7712f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
