package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.location_filled */
/* loaded from: classes16.dex */
public class C9357xea5ce52c extends l95.c {

    /* renamed from: width */
    private final int f25915x6be2dc6 = 24;

    /* renamed from: height */
    private final int f25914xb7389127 = 24;

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
                m145414xacbd08c9.setColor(-16268960);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(12.166622f, 11.833367f);
                m145417xd4061a5a.lineTo(4.5139213f, 11.833367f);
                m145417xd4061a5a.cubicTo(4.2300906f, 11.833367f, 4.0f, 11.603278f, 4.0f, 11.319449f);
                m145417xd4061a5a.cubicTo(4.0f, 11.117918f, 4.117793f, 10.934987f, 4.3012614f, 10.851594f);
                m145417xd4061a5a.lineTo(19.273418f, 4.0461893f);
                m145417xd4061a5a.cubicTo(19.531809f, 3.928741f, 19.836487f, 4.0429964f, 19.953936f, 4.3013854f);
                m145417xd4061a5a.cubicTo(20.015356f, 4.4365077f, 20.015354f, 4.5915856f, 19.953934f, 4.7267075f);
                m145417xd4061a5a.lineTo(13.148398f, 19.69862f);
                m145417xd4061a5a.cubicTo(13.030948f, 19.957006f, 12.726269f, 20.07126f, 12.467878f, 19.95381f);
                m145417xd4061a5a.cubicTo(12.284413f, 19.870415f, 12.166622f, 19.687485f, 12.166622f, 19.485956f);
                m145417xd4061a5a.lineTo(12.166622f, 11.833367f);
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
