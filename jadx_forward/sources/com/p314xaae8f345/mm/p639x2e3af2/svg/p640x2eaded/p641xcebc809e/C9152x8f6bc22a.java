package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_shift */
/* loaded from: classes16.dex */
public class C9152x8f6bc22a extends l95.c {

    /* renamed from: width */
    private final int f25503x6be2dc6 = 24;

    /* renamed from: height */
    private final int f25502xb7389127 = 24;

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
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-436207616);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(18.0f, 6.0f);
                m145417xd4061a5a.lineTo(18.0f, 7.2003f);
                m145417xd4061a5a.lineTo(8.192f, 7.2f);
                m145417xd4061a5a.lineTo(17.924242f, 16.93516f);
                m145417xd4061a5a.lineTo(17.075714f, 17.7839f);
                m145417xd4061a5a.lineTo(7.198f, 7.903f);
                m145417xd4061a5a.lineTo(7.2f, 18.0f);
                m145417xd4061a5a.lineTo(6.0f, 18.0f);
                m145417xd4061a5a.lineTo(6.0f, 6.595082f);
                m145417xd4061a5a.lineTo(6.003f, 6.563f);
                m145417xd4061a5a.lineTo(6.007971f, 6.5028024f);
                m145417xd4061a5a.lineTo(6.031519f, 6.40699f);
                m145417xd4061a5a.cubicTo(6.041712f, 6.3774304f, 6.054218f, 6.3489013f, 6.0688024f, 6.3216076f);
                m145417xd4061a5a.lineTo(6.093588f, 6.2795477f);
                m145417xd4061a5a.cubicTo(6.200504f, 6.111543f, 6.3876815f, 6.0f, 6.595082f, 6.0f);
                m145417xd4061a5a.lineTo(18.0f, 6.0f);
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
