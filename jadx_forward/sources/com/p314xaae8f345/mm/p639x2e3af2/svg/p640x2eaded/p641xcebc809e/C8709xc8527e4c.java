package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_play */
/* loaded from: classes16.dex */
public class C8709xc8527e4c extends l95.c {

    /* renamed from: width */
    private final int f24617x6be2dc6 = 72;

    /* renamed from: height */
    private final int f24616xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-16777216);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(22.488417f, 14.56481f);
                m145417xd4061a5a.lineTo(55.441723f, 33.39527f);
                m145417xd4061a5a.cubicTo(56.880276f, 34.2173f, 57.380066f, 36.049866f, 56.558037f, 37.48842f);
                m145417xd4061a5a.cubicTo(56.292267f, 37.95351f, 55.90682f, 38.338963f, 55.441723f, 38.60473f);
                m145417xd4061a5a.lineTo(22.488417f, 57.435192f);
                m145417xd4061a5a.cubicTo(21.049864f, 58.25722f, 19.2173f, 57.75743f, 18.395271f, 56.31888f);
                m145417xd4061a5a.cubicTo(18.136246f, 55.865585f, 18.0f, 55.352543f, 18.0f, 54.83046f);
                m145417xd4061a5a.lineTo(18.0f, 17.169538f);
                m145417xd4061a5a.cubicTo(18.0f, 15.512685f, 19.343145f, 14.169539f, 21.0f, 14.169539f);
                m145417xd4061a5a.cubicTo(21.522081f, 14.169539f, 22.035124f, 14.305785f, 22.488417f, 14.56481f);
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
