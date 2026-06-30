package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.star_filled */
/* loaded from: classes16.dex */
public class C9976x59b043ef extends l95.c {

    /* renamed from: width */
    private final int f27155x6be2dc6 = 24;

    /* renamed from: height */
    private final int f27154xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        m145414xacbd08c9.setColor(-436207616);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(11.9999f, 18.309f);
        m145417xd4061a5a.lineTo(6.91507f, 20.9823f);
        m145417xd4061a5a.cubicTo(6.12562f, 21.3973f, 5.18874f, 20.6934f, 5.33597f, 19.835f);
        m145417xd4061a5a.lineTo(6.30708f, 14.173f);
        m145417xd4061a5a.lineTo(2.19336f, 10.1631f);
        m145417xd4061a5a.cubicTo(1.55468f, 9.54052f, 1.93466f, 8.43197f, 2.79653f, 8.30673f);
        m145417xd4061a5a.lineTo(8.48155f, 7.48065f);
        m145417xd4061a5a.lineTo(11.024f, 2.32915f);
        m145417xd4061a5a.cubicTo(11.4187f, 1.52934f, 12.5904f, 1.54816f, 12.9759f, 2.32915f);
        m145417xd4061a5a.lineTo(15.5183f, 7.48065f);
        m145417xd4061a5a.lineTo(21.2033f, 8.30673f);
        m145417xd4061a5a.cubicTo(22.0859f, 8.43499f, 22.4301f, 9.55517f, 21.8065f, 10.1631f);
        m145417xd4061a5a.lineTo(17.6927f, 14.173f);
        m145417xd4061a5a.lineTo(18.6639f, 19.835f);
        m145417xd4061a5a.cubicTo(18.8146f, 20.7141f, 17.8556f, 21.3876f, 17.0847f, 20.9823f);
        m145417xd4061a5a.lineTo(11.9999f, 18.309f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
