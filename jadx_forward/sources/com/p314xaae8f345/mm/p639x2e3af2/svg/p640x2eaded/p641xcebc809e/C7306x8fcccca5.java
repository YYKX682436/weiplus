package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_litegame_home_regular */
/* loaded from: classes16.dex */
public class C7306x8fcccca5 extends l95.c {

    /* renamed from: width */
    private final int f21811x6be2dc6 = 40;

    /* renamed from: height */
    private final int f21810xb7389127 = 40;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 40;
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
        m145414xacbd08c9.setColor(1275068416);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(2.0f, 20.0f);
        m145417xd4061a5a.cubicTo(2.0f, 10.058874f, 10.058874f, 2.0f, 20.0f, 2.0f);
        m145417xd4061a5a.lineTo(20.0f, 2.0f);
        m145417xd4061a5a.cubicTo(29.941126f, 2.0f, 38.0f, 10.058874f, 38.0f, 20.0f);
        m145417xd4061a5a.lineTo(38.0f, 20.0f);
        m145417xd4061a5a.cubicTo(38.0f, 29.941126f, 29.941126f, 38.0f, 20.0f, 38.0f);
        m145417xd4061a5a.lineTo(20.0f, 38.0f);
        m145417xd4061a5a.cubicTo(10.058874f, 38.0f, 2.0f, 29.941126f, 2.0f, 20.0f);
        m145417xd4061a5a.lineTo(2.0f, 20.0f);
        m145417xd4061a5a.close();
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-1);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(20.2077f, 18.911f);
        m145417xd4061a5a2.lineTo(15.0467f, 13.75f);
        m145417xd4061a5a2.lineTo(14.166f, 14.6307f);
        m145417xd4061a5a2.lineTo(19.327f, 19.7917f);
        m145417xd4061a5a2.lineTo(14.166f, 24.9527f);
        m145417xd4061a5a2.lineTo(15.0467f, 25.8333f);
        m145417xd4061a5a2.lineTo(20.2077f, 20.6723f);
        m145417xd4061a5a2.lineTo(25.3687f, 25.8333f);
        m145417xd4061a5a2.lineTo(26.2493f, 24.9527f);
        m145417xd4061a5a2.lineTo(21.0884f, 19.7917f);
        m145417xd4061a5a2.lineTo(26.2493f, 14.6307f);
        m145417xd4061a5a2.lineTo(25.3687f, 13.75f);
        m145417xd4061a5a2.lineTo(20.2077f, 18.911f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
