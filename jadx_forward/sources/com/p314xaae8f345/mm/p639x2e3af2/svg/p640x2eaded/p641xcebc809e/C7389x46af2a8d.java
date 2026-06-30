package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.arrow_heavy_large */
/* loaded from: classes16.dex */
public class C7389x46af2a8d extends l95.c {

    /* renamed from: width */
    private final int f21977x6be2dc6 = 48;

    /* renamed from: height */
    private final int f21976xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 48;
        }
        if (i17 == 1) {
            return 24;
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
            m145417xd4061a5a.moveTo(26.1584f, 17.574f);
            m145417xd4061a5a.cubicTo(24.4325f, 18.142f, 22.5698f, 18.142f, 20.8439f, 17.574f);
            m145417xd4061a5a.lineTo(2.96989f, 11.6912f);
            m145417xd4061a5a.cubicTo(1.6585f, 11.2596f, 0.944752f, 9.84636f, 1.37614f, 8.53495f);
            m145417xd4061a5a.cubicTo(1.78085f, 7.30528f, 3.04869f, 6.60108f, 4.2863f, 6.87382f);
            m145417xd4061a5a.lineTo(4.53239f, 6.94121f);
            m145417xd4061a5a.lineTo(22.4074f, 12.824f);
            m145417xd4061a5a.cubicTo(23.1179f, 13.0578f, 23.8844f, 13.0578f, 24.5949f, 12.824f);
            m145417xd4061a5a.lineTo(42.4699f, 6.94121f);
            m145417xd4061a5a.cubicTo(43.7813f, 6.50982f, 45.1945f, 7.22357f, 45.6261f, 8.53496f);
            m145417xd4061a5a.cubicTo(46.0575f, 9.84637f, 45.3438f, 11.2596f, 44.0324f, 11.6912f);
            m145417xd4061a5a.lineTo(26.1584f, 17.574f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
