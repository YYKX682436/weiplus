package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_comment_reply */
/* loaded from: classes16.dex */
public class C8285xb5072f7d extends l95.c {

    /* renamed from: width */
    private final int f23769x6be2dc6 = 14;

    /* renamed from: height */
    private final int f23768xb7389127 = 14;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 14;
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
                m145414xacbd08c9.setColor(-436207616);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(5.05606f, 10.6562f);
                m145417xd4061a5a.lineTo(5.31261f, 10.7305f);
                m145417xd4061a5a.cubicTo(5.85003f, 10.8861f, 6.41801f, 10.9666f, 7.00005f, 10.9666f);
                m145417xd4061a5a.cubicTo(9.85805f, 10.9666f, 12.1334f, 9.0326f, 12.1334f, 6.7083f);
                m145417xd4061a5a.cubicTo(12.1334f, 4.384f, 9.85805f, 2.44997f, 7.00005f, 2.44997f);
                m145417xd4061a5a.cubicTo(4.14205f, 2.44997f, 1.86672f, 4.384f, 1.86672f, 6.7083f);
                m145417xd4061a5a.cubicTo(1.86672f, 7.91926f, 2.48326f, 9.05686f, 3.55873f, 9.86493f);
                m145417xd4061a5a.lineTo(3.87995f, 10.1063f);
                m145417xd4061a5a.lineTo(3.74283f, 11.2859f);
                m145417xd4061a5a.lineTo(5.05606f, 10.6562f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(7.00008f, 11.6667f);
                m145417xd4061a5a.cubicTo(6.34151f, 11.6667f, 5.70842f, 11.5739f, 5.11793f, 11.4029f);
                m145417xd4061a5a.lineTo(3.37787f, 12.2373f);
                m145417xd4061a5a.cubicTo(3.3282f, 12.2611f, 3.2728f, 12.2704f, 3.21809f, 12.264f);
                m145417xd4061a5a.cubicTo(3.05808f, 12.2454f, 2.94345f, 12.1006f, 2.96205f, 11.9406f);
                m145417xd4061a5a.lineTo(3.13827f, 10.4246f);
                m145417xd4061a5a.cubicTo(1.92916f, 9.51611f, 1.16675f, 8.1879f, 1.16675f, 6.70833f);
                m145417xd4061a5a.cubicTo(1.16675f, 3.96992f, 3.77842f, 1.75f, 7.00008f, 1.75f);
                m145417xd4061a5a.cubicTo(10.2217f, 1.75f, 12.8334f, 3.96992f, 12.8334f, 6.70833f);
                m145417xd4061a5a.cubicTo(12.8334f, 9.44674f, 10.2217f, 11.6667f, 7.00008f, 11.6667f);
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
