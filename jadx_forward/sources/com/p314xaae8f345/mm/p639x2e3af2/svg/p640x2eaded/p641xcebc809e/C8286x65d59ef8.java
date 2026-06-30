package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_comment_reply_dark */
/* loaded from: classes16.dex */
public class C8286x65d59ef8 extends l95.c {

    /* renamed from: width */
    private final int f23771x6be2dc6 = 12;

    /* renamed from: height */
    private final int f23770xb7389127 = 12;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 12;
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
                m145414xacbd08c9.setColor(-419430401);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(4.05606f, 9.65621f);
                m145417xd4061a5a.lineTo(4.31261f, 9.7305f);
                m145417xd4061a5a.cubicTo(4.85003f, 9.88613f, 5.41801f, 9.96664f, 6.00005f, 9.96664f);
                m145417xd4061a5a.cubicTo(8.85805f, 9.96664f, 11.1334f, 8.0326f, 11.1334f, 5.7083f);
                m145417xd4061a5a.cubicTo(11.1334f, 3.384f, 8.85805f, 1.44997f, 6.00005f, 1.44997f);
                m145417xd4061a5a.cubicTo(3.14205f, 1.44997f, 0.866717f, 3.384f, 0.866717f, 5.7083f);
                m145417xd4061a5a.cubicTo(0.866717f, 6.91926f, 1.48326f, 8.05686f, 2.55873f, 8.86493f);
                m145417xd4061a5a.lineTo(2.87995f, 9.10629f);
                m145417xd4061a5a.lineTo(2.74283f, 10.2859f);
                m145417xd4061a5a.lineTo(4.05606f, 9.65621f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(6.00008f, 10.6667f);
                m145417xd4061a5a.cubicTo(5.34151f, 10.6667f, 4.70842f, 10.5739f, 4.11793f, 10.4029f);
                m145417xd4061a5a.lineTo(2.37787f, 11.2373f);
                m145417xd4061a5a.cubicTo(2.3282f, 11.2611f, 2.2728f, 11.2704f, 2.21809f, 11.264f);
                m145417xd4061a5a.cubicTo(2.05808f, 11.2454f, 1.94345f, 11.1006f, 1.96205f, 10.9406f);
                m145417xd4061a5a.lineTo(2.13827f, 9.42459f);
                m145417xd4061a5a.cubicTo(0.929164f, 8.51611f, 0.166748f, 7.1879f, 0.166748f, 5.70833f);
                m145417xd4061a5a.cubicTo(0.166748f, 2.96992f, 2.77842f, 0.75f, 6.00008f, 0.75f);
                m145417xd4061a5a.cubicTo(9.22174f, 0.75f, 11.8334f, 2.96992f, 11.8334f, 5.70833f);
                m145417xd4061a5a.cubicTo(11.8334f, 8.44674f, 9.22174f, 10.6667f, 6.00008f, 10.6667f);
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
