package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_xmark_light */
/* loaded from: classes16.dex */
public class C9225x577435f7 extends l95.c {

    /* renamed from: width */
    private final int f25649x6be2dc6 = 20;

    /* renamed from: height */
    private final int f25648xb7389127 = 20;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 20;
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
            m145414xacbd08c9.setColor(419430400);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(10.0f, 2.0f);
            m145417xd4061a5a.cubicTo(14.418278f, 2.0f, 18.0f, 5.581722f, 18.0f, 10.0f);
            m145417xd4061a5a.cubicTo(18.0f, 14.418278f, 14.418278f, 18.0f, 10.0f, 18.0f);
            m145417xd4061a5a.cubicTo(5.581722f, 18.0f, 2.0f, 14.418278f, 2.0f, 10.0f);
            m145417xd4061a5a.cubicTo(2.0f, 5.581722f, 5.581722f, 2.0f, 10.0f, 2.0f);
            m145417xd4061a5a.close();
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c92.setColor(-436207616);
            android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a2.moveTo(12.5927f, 6.70016f);
            m145417xd4061a5a2.lineTo(13.2998f, 7.40727f);
            m145417xd4061a5a2.lineTo(10.7071f, 9.99999f);
            m145417xd4061a5a2.lineTo(13.2663f, 12.5592f);
            m145417xd4061a5a2.lineTo(12.5592f, 13.2663f);
            m145417xd4061a5a2.lineTo(9.99995f, 10.7071f);
            m145417xd4061a5a2.lineTo(7.40722f, 13.2998f);
            m145417xd4061a5a2.lineTo(6.70011f, 12.5927f);
            m145417xd4061a5a2.lineTo(9.29285f, 9.99999f);
            m145417xd4061a5a2.lineTo(6.66663f, 7.37376f);
            m145417xd4061a5a2.lineTo(7.37373f, 6.66666f);
            m145417xd4061a5a2.lineTo(9.99995f, 9.29288f);
            m145417xd4061a5a2.lineTo(12.5927f, 6.70016f);
            m145417xd4061a5a2.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 1);
            canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
