package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_menu_night */
/* loaded from: classes16.dex */
public class C8827x606c077d extends l95.c {

    /* renamed from: width */
    private final int f24853x6be2dc6 = 30;

    /* renamed from: height */
    private final int f24852xb7389127 = 30;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 30;
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
                m145414xacbd08c9.setColor(-855638017);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(18.8425f, 3.60738f);
                m145417xd4061a5a.cubicTo(18.6229f, 3.52639f, 18.3762f, 3.58054f, 18.2107f, 3.74607f);
                m145417xd4061a5a.cubicTo(18.0452f, 3.91159f, 17.991f, 4.15827f, 18.072f, 4.3779f);
                m145417xd4061a5a.cubicTo(18.4955f, 5.5264f, 18.727f, 6.7685f, 18.727f, 8.06603f);
                m145417xd4061a5a.cubicTo(18.727f, 13.9539f, 13.954f, 18.7269f, 8.06615f, 18.7269f);
                m145417xd4061a5a.cubicTo(6.76862f, 18.7269f, 5.52652f, 18.4954f, 4.37803f, 18.0719f);
                m145417xd4061a5a.cubicTo(4.15839f, 17.9909f, 3.91171f, 18.0451f, 3.74619f, 18.2106f);
                m145417xd4061a5a.cubicTo(3.58066f, 18.3761f, 3.52652f, 18.6228f, 3.6075f, 18.8424f);
                m145417xd4061a5a.cubicTo(5.27691f, 23.3699f, 9.63011f, 26.6f, 14.7393f, 26.6f);
                m145417xd4061a5a.cubicTo(21.2898f, 26.6f, 26.6001f, 21.2897f, 26.6001f, 14.7391f);
                m145417xd4061a5a.cubicTo(26.6001f, 9.62999f, 23.37f, 5.27679f, 18.8425f, 3.60738f);
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
