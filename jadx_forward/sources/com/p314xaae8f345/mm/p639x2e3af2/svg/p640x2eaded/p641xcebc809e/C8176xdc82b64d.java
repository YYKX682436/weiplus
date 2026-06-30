package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_pull_down_arrow */
/* loaded from: classes16.dex */
public class C8176xdc82b64d extends l95.c {

    /* renamed from: width */
    private final int f23551x6be2dc6 = 72;

    /* renamed from: height */
    private final int f23550xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        m145414xacbd08c9.setColor(-16777216);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(19.7428f, 37.6377f);
        m145417xd4061a5a.lineTo(16.5608f, 34.4557f);
        m145417xd4061a5a.lineTo(33.8975f, 17.119f);
        m145417xd4061a5a.cubicTo(35.0679f, 15.9486f, 36.955f, 15.9383f, 38.1358f, 17.119f);
        m145417xd4061a5a.lineTo(55.4725f, 34.4557f);
        m145417xd4061a5a.lineTo(52.2905f, 37.6377f);
        m145417xd4061a5a.lineTo(36.0166f, 21.3638f);
        m145417xd4061a5a.lineTo(19.7428f, 37.6377f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-16777216);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(19.7442f, 55.6377f);
        m145417xd4061a5a2.lineTo(16.5623f, 52.4557f);
        m145417xd4061a5a2.lineTo(33.8989f, 35.119f);
        m145417xd4061a5a2.cubicTo(35.0693f, 33.9486f, 36.9565f, 33.9383f, 38.1373f, 35.119f);
        m145417xd4061a5a2.lineTo(55.4739f, 52.4557f);
        m145417xd4061a5a2.lineTo(52.292f, 55.6377f);
        m145417xd4061a5a2.lineTo(36.0181f, 39.3638f);
        m145417xd4061a5a2.lineTo(19.7442f, 55.6377f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
