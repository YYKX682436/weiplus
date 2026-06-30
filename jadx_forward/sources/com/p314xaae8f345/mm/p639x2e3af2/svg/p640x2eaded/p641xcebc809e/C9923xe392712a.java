package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sns_ad_scratch_card_corner */
/* loaded from: classes16.dex */
public class C9923xe392712a extends l95.c {

    /* renamed from: width */
    private final int f27049x6be2dc6 = 4;

    /* renamed from: height */
    private final int f27048xb7389127 = 12;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 4;
        }
        if (i17 == 1) {
            return 12;
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
            m145414xacbd08c9.setColor(-16777216);
            m145414xacbd08c9.setColor(-16777216);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(4.0f, 12.0f);
            m145417xd4061a5a.cubicTo(4.0f, 10.8954f, 3.05093f, 10.0411f, 2.08203f, 9.51074f);
            m145417xd4061a5a.cubicTo(0.841406f, 8.83153f, 0.0f, 7.51413f, 0.0f, 6.0f);
            m145417xd4061a5a.cubicTo(0.0f, 4.48587f, 0.841406f, 3.16847f, 2.08203f, 2.48926f);
            m145417xd4061a5a.cubicTo(3.05093f, 1.95887f, 4.0f, 1.10457f, 4.0f, 0.0f);
            m145417xd4061a5a.lineTo(4.0f, 12.0f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
