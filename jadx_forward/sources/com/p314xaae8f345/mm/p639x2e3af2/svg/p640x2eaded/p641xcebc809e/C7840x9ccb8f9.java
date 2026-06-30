package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.download_filled */
/* loaded from: classes16.dex */
public class C7840x9ccb8f9 extends l95.c {

    /* renamed from: width */
    private final int f22879x6be2dc6 = 24;

    /* renamed from: height */
    private final int f22878xb7389127 = 24;

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
        m145414xacbd08c9.setColor(-16777216);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(5.0f, 7.0f);
        m145417xd4061a5a.cubicTo(4.44772f, 7.0f, 4.0f, 7.44772f, 4.0f, 8.0f);
        m145417xd4061a5a.lineTo(4.0f, 21.0f);
        m145417xd4061a5a.cubicTo(4.0f, 21.5523f, 4.44772f, 22.0f, 5.0f, 22.0f);
        m145417xd4061a5a.lineTo(19.0f, 22.0f);
        m145417xd4061a5a.cubicTo(19.5523f, 22.0f, 20.0f, 21.5523f, 20.0f, 21.0f);
        m145417xd4061a5a.lineTo(20.0f, 8.0f);
        m145417xd4061a5a.cubicTo(20.0f, 7.44772f, 19.5523f, 7.0f, 19.0f, 7.0f);
        m145417xd4061a5a.lineTo(13.0001f, 7.0f);
        m145417xd4061a5a.lineTo(13.0001f, 12.6497f);
        m145417xd4061a5a.lineTo(14.405f, 11.2447f);
        m145417xd4061a5a.lineTo(15.8192f, 12.6589f);
        m145417xd4061a5a.lineTo(12.7128f, 15.7656f);
        m145417xd4061a5a.cubicTo(12.3183f, 16.1601f, 11.6788f, 16.1601f, 11.2844f, 15.7657f);
        m145417xd4061a5a.lineTo(8.17798f, 12.6591f);
        m145417xd4061a5a.lineTo(9.59223f, 11.245f);
        m145417xd4061a5a.lineTo(11.0001f, 12.6529f);
        m145417xd4061a5a.lineTo(11.0001f, 7.0f);
        m145417xd4061a5a.lineTo(5.0f, 7.0f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-16777216);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(13.0f, 2.0f);
        m145417xd4061a5a2.lineTo(13.0001f, 7.0f);
        m145417xd4061a5a2.lineTo(11.0001f, 7.0f);
        m145417xd4061a5a2.lineTo(11.0f, 2.0f);
        m145417xd4061a5a2.lineTo(13.0f, 2.0f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
