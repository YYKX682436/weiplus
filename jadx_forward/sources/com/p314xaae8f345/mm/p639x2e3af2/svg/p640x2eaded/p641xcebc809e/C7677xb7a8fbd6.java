package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_mini_select_overlay_regular */
/* loaded from: classes16.dex */
public class C7677xb7a8fbd6 extends l95.c {

    /* renamed from: width */
    private final int f22553x6be2dc6 = 12;

    /* renamed from: height */
    private final int f22552xb7389127 = 12;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 12;
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
                m145414xacbd08c9.setColor(-16777216);
                m145414xacbd08c9.setColor(-16777216);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(6.0f, 12.0f);
                m145417xd4061a5a.cubicTo(9.31371f, 12.0f, 12.0f, 9.31371f, 12.0f, 6.0f);
                m145417xd4061a5a.cubicTo(12.0f, 2.68629f, 9.31371f, 0.0f, 6.0f, 0.0f);
                m145417xd4061a5a.cubicTo(2.68629f, 0.0f, 0.0f, 2.68629f, 0.0f, 6.0f);
                m145417xd4061a5a.cubicTo(0.0f, 9.31371f, 2.68629f, 12.0f, 6.0f, 12.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(2.84996f, 6.27236f);
                m145417xd4061a5a.lineTo(4.82986f, 8.25226f);
                m145417xd4061a5a.cubicTo(4.96654f, 8.38894f, 5.18815f, 8.38894f, 5.32483f, 8.25226f);
                m145417xd4061a5a.lineTo(9.53212f, 4.04497f);
                m145417xd4061a5a.lineTo(9.03714f, 3.55f);
                m145417xd4061a5a.lineTo(5.07734f, 7.5098f);
                m145417xd4061a5a.lineTo(3.34493f, 5.77739f);
                m145417xd4061a5a.lineTo(2.84996f, 6.27236f);
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
