package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.xmark_medium */
/* loaded from: classes16.dex */
public class C10273x633f39af extends l95.c {

    /* renamed from: width */
    private final int f27751x6be2dc6 = 24;

    /* renamed from: height */
    private final int f27750xb7389127 = 24;

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
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-16777216);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(11.9988f, 13.2726f);
                m145417xd4061a5a.lineTo(5.77408f, 19.4961f);
                m145417xd4061a5a.lineTo(4.50141f, 18.2232f);
                m145417xd4061a5a.lineTo(10.7259f, 11.9999f);
                m145417xd4061a5a.lineTo(4.50049f, 5.77564f);
                m145417xd4061a5a.lineTo(5.77316f, 4.50274f);
                m145417xd4061a5a.lineTo(11.9988f, 10.7272f);
                m145417xd4061a5a.lineTo(18.227f, 4.50024f);
                m145417xd4061a5a.lineTo(19.4997f, 5.77316f);
                m145417xd4061a5a.lineTo(13.2717f, 11.9999f);
                m145417xd4061a5a.lineTo(19.4997f, 18.2268f);
                m145417xd4061a5a.lineTo(18.2271f, 19.4997f);
                m145417xd4061a5a.lineTo(11.9988f, 13.2726f);
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
