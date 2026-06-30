package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_filled_awesome */
/* loaded from: classes16.dex */
public class C8370x33edc30c extends l95.c {

    /* renamed from: width */
    private final int f23939x6be2dc6 = 72;

    /* renamed from: height */
    private final int f23938xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(12.664062f, 19.394531f);
            m145417xd4061a5a.cubicTo(18.523438f, 13.535156f, 28.019531f, 13.535156f, 33.878906f, 19.394531f);
            m145417xd4061a5a.cubicTo(34.42578f, 19.941406f, 35.132812f, 20.625f, 36.0f, 21.441406f);
            m145417xd4061a5a.cubicTo(36.867188f, 20.625f, 37.57422f, 19.941406f, 38.121094f, 19.394531f);
            m145417xd4061a5a.cubicTo(43.98047f, 13.535156f, 53.476562f, 13.535156f, 59.335938f, 19.394531f);
            m145417xd4061a5a.cubicTo(65.13672f, 25.195312f, 65.19141f, 34.57422f, 59.496094f, 40.441406f);
            m145417xd4061a5a.lineTo(38.121094f, 61.820312f);
            m145417xd4061a5a.cubicTo(36.94922f, 62.992188f, 35.05078f, 62.992188f, 33.878906f, 61.820312f);
            m145417xd4061a5a.lineTo(12.503906f, 40.445312f);
            m145417xd4061a5a.cubicTo(6.808594f, 34.57422f, 6.863281f, 25.195312f, 12.664062f, 19.394531f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(12.664062f, 19.394531f);
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
