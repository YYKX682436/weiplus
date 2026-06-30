package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.person_tie_filled */
/* loaded from: classes16.dex */
public class C9672x8fdfeb1b extends l95.c {

    /* renamed from: width */
    private final int f26545x6be2dc6 = 24;

    /* renamed from: height */
    private final int f26544xb7389127 = 24;

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
                m145417xd4061a5a.moveTo(2.5f, 20.0f);
                m145417xd4061a5a.cubicTo(2.5f, 20.5523f, 2.94771f, 21.0f, 3.5f, 21.0f);
                m145417xd4061a5a.lineTo(20.5f, 21.0f);
                m145417xd4061a5a.cubicTo(21.0523f, 21.0f, 21.5f, 20.5523f, 21.5f, 20.0f);
                m145417xd4061a5a.lineTo(21.5f, 19.3155f);
                m145417xd4061a5a.cubicTo(21.5f, 18.6252f, 21.0012f, 17.8317f, 20.3859f, 17.5316f);
                m145417xd4061a5a.lineTo(14.7255f, 14.7705f);
                m145417xd4061a5a.cubicTo(13.9012f, 14.3684f, 13.717f, 13.479f, 14.3066f, 12.7801f);
                m145417xd4061a5a.lineTo(14.6681f, 12.3516f);
                m145417xd4061a5a.cubicTo(15.4009f, 11.4829f, 16.0f, 9.8493f, 16.0f, 8.71019f);
                m145417xd4061a5a.lineTo(16.0f, 7.00021f);
                m145417xd4061a5a.cubicTo(16.0f, 4.79298f, 14.2091f, 3.0f, 12.0f, 3.0f);
                m145417xd4061a5a.cubicTo(9.79536f, 3.0f, 8.0f, 4.79067f, 8.0f, 6.99958f);
                m145417xd4061a5a.lineTo(8.0f, 8.70929f);
                m145417xd4061a5a.cubicTo(8.0f, 9.8495f, 8.59632f, 11.4783f, 9.33191f, 12.3501f);
                m145417xd4061a5a.lineTo(9.69345f, 12.7786f);
                m145417xd4061a5a.cubicTo(10.2863f, 13.4813f, 10.0954f, 14.3685f, 9.27445f, 14.7691f);
                m145417xd4061a5a.lineTo(3.6141f, 17.5313f);
                m145417xd4061a5a.cubicTo(2.99815f, 17.8319f, 2.5f, 18.6304f, 2.5f, 19.3155f);
                m145417xd4061a5a.lineTo(2.5f, 20.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(12.0f, 15.0f);
                m145417xd4061a5a.lineTo(11.0f, 18.0f);
                m145417xd4061a5a.lineTo(12.0f, 19.0f);
                m145417xd4061a5a.lineTo(13.0f, 18.0f);
                m145417xd4061a5a.lineTo(12.0f, 15.0f);
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
