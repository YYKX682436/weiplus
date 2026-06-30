package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sns_ad_random_pick_card_ellipse_dark_icon */
/* loaded from: classes16.dex */
public class C9920x39b02589 extends l95.c {

    /* renamed from: width */
    private final int f27043x6be2dc6 = 87;

    /* renamed from: height */
    private final int f27042xb7389127 = 18;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 87;
        }
        if (i17 == 1) {
            return 18;
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
            m145414xacbd08c9.setColor(-13619152);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(43.5f, 0.0f);
            m145417xd4061a5a.cubicTo(67.52438f, 0.0f, 87.0f, 4.029437f, 87.0f, 9.0f);
            m145417xd4061a5a.cubicTo(87.0f, 13.970563f, 67.52438f, 18.0f, 43.5f, 18.0f);
            m145417xd4061a5a.cubicTo(19.475613f, 18.0f, 0.0f, 13.970563f, 0.0f, 9.0f);
            m145417xd4061a5a.cubicTo(0.0f, 4.029437f, 19.475613f, 0.0f, 43.5f, 0.0f);
            m145417xd4061a5a.close();
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
