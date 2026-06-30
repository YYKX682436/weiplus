package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_highlight_play_medium */
/* loaded from: classes16.dex */
public class C8080x61654c7b extends l95.c {

    /* renamed from: width */
    private final int f23359x6be2dc6 = 24;

    /* renamed from: height */
    private final int f23358xb7389127 = 24;

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
                m145417xd4061a5a.moveTo(7.5f, 6.58473f);
                m145417xd4061a5a.lineTo(7.5f, 17.4152f);
                m145417xd4061a5a.lineTo(16.9767f, 12.0f);
                m145417xd4061a5a.lineTo(7.5f, 6.58473f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(18.4806f, 11.1317f);
                m145417xd4061a5a.lineTo(7.49614f, 4.8549f);
                m145417xd4061a5a.cubicTo(7.34504f, 4.76856f, 7.17403f, 4.72314f, 7.0f, 4.72314f);
                m145417xd4061a5a.cubicTo(6.44772f, 4.72314f, 6.0f, 5.17086f, 6.0f, 5.72314f);
                m145417xd4061a5a.lineTo(6.0f, 18.2768f);
                m145417xd4061a5a.cubicTo(6.0f, 18.4508f, 6.04542f, 18.6218f, 6.13176f, 18.7729f);
                m145417xd4061a5a.cubicTo(6.40577f, 19.2524f, 7.01662f, 19.419f, 7.49614f, 19.145f);
                m145417xd4061a5a.lineTo(18.4806f, 12.8682f);
                m145417xd4061a5a.cubicTo(18.6356f, 12.7796f, 18.7641f, 12.6511f, 18.8527f, 12.4961f);
                m145417xd4061a5a.cubicTo(19.1267f, 12.0166f, 18.9601f, 11.4057f, 18.4806f, 11.1317f);
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
