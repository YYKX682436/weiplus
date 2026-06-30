package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_post_mode_arrow_down */
/* loaded from: classes16.dex */
public class C8117xe2a4402f extends l95.c {

    /* renamed from: width */
    private final int f23433x6be2dc6 = 16;

    /* renamed from: height */
    private final int f23432xb7389127 = 8;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 16;
        }
        if (i17 == 1) {
            return 8;
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
            m145414xacbd08c9.setColor(-419430401);
            m145414xacbd08c9.setColor(-419430401);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(7.52567f, 6.41629f);
            m145417xd4061a5a.lineTo(3.75443f, 2.64505f);
            m145417xd4061a5a.lineTo(4.69724f, 1.70225f);
            m145417xd4061a5a.lineTo(7.99707f, 5.00208f);
            m145417xd4061a5a.lineTo(11.2969f, 1.70225f);
            m145417xd4061a5a.lineTo(12.2397f, 2.64506f);
            m145417xd4061a5a.lineTo(8.46847f, 6.41629f);
            m145417xd4061a5a.cubicTo(8.20813f, 6.67664f, 7.78602f, 6.67664f, 7.52567f, 6.41629f);
            m145417xd4061a5a.lineTo(7.52567f, 6.41629f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
