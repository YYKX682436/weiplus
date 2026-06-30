package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_icons_filled_share */
/* loaded from: classes16.dex */
public class C8089x7061e0e1 extends l95.c {

    /* renamed from: width */
    private final int f23377x6be2dc6 = 24;

    /* renamed from: height */
    private final int f23376xb7389127 = 24;

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
                m145417xd4061a5a.moveTo(13.0034f, 2.99805f);
                m145417xd4061a5a.cubicTo(13.267f, 2.99805f, 13.5199f, 3.1021f, 13.7072f, 3.28758f);
                m145417xd4061a5a.lineTo(20.8785f, 10.3908f);
                m145417xd4061a5a.cubicTo(21.2407f, 10.7496f, 21.2711f, 11.3167f, 20.9679f, 11.7104f);
                m145417xd4061a5a.lineTo(20.8785f, 11.8118f);
                m145417xd4061a5a.lineTo(13.7072f, 18.915f);
                m145417xd4061a5a.cubicTo(13.3148f, 19.3037f, 12.6816f, 19.3006f, 12.293f, 18.9083f);
                m145417xd4061a5a.cubicTo(12.1075f, 18.721f, 12.0034f, 18.4681f, 12.0034f, 18.2045f);
                m145417xd4061a5a.lineTo(12.0034f, 14.9216f);
                m145417xd4061a5a.cubicTo(9.66482f, 15.1096f, 6.25138f, 16.4914f, 4.4756f, 20.8218f);
                m145417xd4061a5a.cubicTo(4.18058f, 21.5413f, 3.45685f, 21.5351f, 3.29934f, 20.6026f);
                m145417xd4061a5a.cubicTo(2.05286f, 13.2228f, 6.25138f, 8.21482f, 12.0034f, 7.3084f);
                m145417xd4061a5a.lineTo(12.0034f, 3.99805f);
                m145417xd4061a5a.cubicTo(12.0034f, 3.44576f, 12.4512f, 2.99805f, 13.0034f, 2.99805f);
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
