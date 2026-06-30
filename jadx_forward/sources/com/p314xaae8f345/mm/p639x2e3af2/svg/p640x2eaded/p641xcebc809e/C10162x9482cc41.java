package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.voice_rcd_hint_new */
/* loaded from: classes16.dex */
public class C10162x9482cc41 extends l95.c {

    /* renamed from: width */
    private final int f27527x6be2dc6 = 67;

    /* renamed from: height */
    private final int f27526xb7389127 = 67;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 67;
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
                m145414xacbd08c9.setColor(-1);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(35.416668f, 58.48882f);
                m145417xd4061a5a.lineTo(35.416668f, 67.0f);
                m145417xd4061a5a.lineTo(31.25f, 67.0f);
                m145417xd4061a5a.lineTo(31.25f, 58.48882f);
                m145417xd4061a5a.cubicTo(21.490765f, 57.440975f, 13.888889f, 49.115345f, 13.888889f, 39.0f);
                m145417xd4061a5a.lineTo(13.888889f, 33.4f);
                m145417xd4061a5a.lineTo(18.055555f, 33.4f);
                m145417xd4061a5a.lineTo(18.055555f, 39.0f);
                m145417xd4061a5a.cubicTo(18.055555f, 47.505184f, 24.895649f, 54.4f, 33.333332f, 54.4f);
                m145417xd4061a5a.cubicTo(41.771015f, 54.4f, 48.61111f, 47.505184f, 48.61111f, 39.0f);
                m145417xd4061a5a.lineTo(48.61111f, 33.4f);
                m145417xd4061a5a.lineTo(52.77778f, 33.4f);
                m145417xd4061a5a.lineTo(52.77778f, 39.0f);
                m145417xd4061a5a.cubicTo(52.77778f, 49.115345f, 45.175903f, 57.440975f, 35.416668f, 58.48882f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(22.222221f, 22.11111f);
                m145417xd4061a5a.cubicTo(22.222221f, 15.974614f, 27.196836f, 11.0f, 33.333332f, 11.0f);
                m145417xd4061a5a.cubicTo(39.46983f, 11.0f, 44.444443f, 15.974614f, 44.444443f, 22.11111f);
                m145417xd4061a5a.lineTo(44.444443f, 39.08889f);
                m145417xd4061a5a.cubicTo(44.444443f, 45.225388f, 39.46983f, 50.2f, 33.333332f, 50.2f);
                m145417xd4061a5a.cubicTo(27.196836f, 50.2f, 22.222221f, 45.225388f, 22.222221f, 39.08889f);
                m145417xd4061a5a.lineTo(22.222221f, 22.11111f);
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
