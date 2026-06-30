package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_chat */
/* loaded from: classes16.dex */
public class C8515xc84c8670 extends l95.c {

    /* renamed from: width */
    private final int f24229x6be2dc6 = 24;

    /* renamed from: height */
    private final int f24228xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                l95.c.m145414xacbd08c9(m145415xacbd08c92, looper).setStrokeWidth(1.0f);
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-1);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(12.0f, 20.0f);
                m145417xd4061a5a.cubicTo(17.522848f, 20.0f, 22.0f, 16.19442f, 22.0f, 11.5f);
                m145417xd4061a5a.cubicTo(22.0f, 6.8055797f, 17.522848f, 3.0f, 12.0f, 3.0f);
                m145417xd4061a5a.cubicTo(6.4771523f, 3.0f, 2.0f, 6.8055797f, 2.0f, 11.5f);
                m145417xd4061a5a.cubicTo(2.0f, 14.036405f, 3.306998f, 16.313334f, 5.3797565f, 17.870733f);
                m145417xd4061a5a.lineTo(5.077659f, 20.469614f);
                m145417xd4061a5a.cubicTo(5.0457745f, 20.74391f, 5.2422876f, 20.992117f, 5.516583f, 21.024002f);
                m145417xd4061a5a.cubicTo(5.6103826f, 21.034904f, 5.705353f, 21.019022f, 5.790501f, 20.978193f);
                m145417xd4061a5a.lineTo(8.773454f, 19.547836f);
                m145417xd4061a5a.cubicTo(9.78573f, 19.840973f, 10.8710165f, 20.0f, 12.0f, 20.0f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
