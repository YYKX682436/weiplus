package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.arrow_down_line */
/* loaded from: classes16.dex */
public class C7386x585c90bb extends l95.c {

    /* renamed from: width */
    private final int f21971x6be2dc6 = 20;

    /* renamed from: height */
    private final int f21970xb7389127 = 20;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 20;
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
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-2130706433);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(9.70538f, 4.46127f);
                m145417xd4061a5a.cubicTo(9.8681f, 4.29855f, 10.1319f, 4.29855f, 10.2946f, 4.46127f);
                m145417xd4061a5a.lineTo(10.8839f, 5.05053f);
                m145417xd4061a5a.lineTo(13.5355f, 7.70218f);
                m145417xd4061a5a.lineTo(12.6517f, 8.58606f);
                m145417xd4061a5a.lineTo(10.625f, 6.55941f);
                m145417xd4061a5a.lineTo(10.625f, 9.97078f);
                m145417xd4061a5a.lineTo(10.6251f, 9.97078f);
                m145417xd4061a5a.lineTo(10.6251f, 15.8334f);
                m145417xd4061a5a.lineTo(9.37506f, 15.8334f);
                m145417xd4061a5a.lineTo(9.37506f, 10.8333f);
                m145417xd4061a5a.lineTo(9.37501f, 10.8333f);
                m145417xd4061a5a.lineTo(9.37501f, 6.55941f);
                m145417xd4061a5a.lineTo(7.34836f, 8.58606f);
                m145417xd4061a5a.lineTo(6.46448f, 7.70218f);
                m145417xd4061a5a.lineTo(9.11613f, 5.05053f);
                m145417xd4061a5a.lineTo(9.70538f, 4.46127f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
