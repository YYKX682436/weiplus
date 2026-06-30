package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_show_toast_success */
/* loaded from: classes16.dex */
public class C7331x369acc3f extends l95.c {

    /* renamed from: width */
    private final int f21861x6be2dc6 = 200;

    /* renamed from: height */
    private final int f21860xb7389127 = 200;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 200;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
            if (i17 == 2) {
                android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
                android.os.Looper looper = (android.os.Looper) objArr[1];
                android.graphics.Matrix m145412xe5ca94b6 = l95.c.m145412xe5ca94b6(looper);
                float[] m145413xf00d6f43 = l95.c.m145413xf00d6f43(looper);
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
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 29.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(0.31970137f, 77.93319f);
                m145417xd4061a5a.cubicTo(-0.063724294f, 77.53636f, -0.108552635f, 76.85273f, 0.2193248f, 76.40659f);
                m145417xd4061a5a.lineTo(9.792403f, 63.380688f);
                m145417xd4061a5a.cubicTo(10.120393f, 62.934402f, 10.738718f, 62.842735f, 11.176576f, 63.17833f);
                m145417xd4061a5a.lineTo(61.002815f, 101.36729f);
                m145417xd4061a5a.cubicTo(62.317314f, 102.37477f, 64.42048f, 102.32714f, 65.687584f, 101.27154f);
                m145417xd4061a5a.lineTo(186.95796f, 0.24350294f);
                m145417xd4061a5a.cubicTo(187.37868f, -0.10698287f, 188.04178f, -0.07305191f, 188.42578f, 0.3061832f);
                m145417xd4061a5a.lineTo(197.7745f, 9.538964f);
                m145417xd4061a5a.cubicTo(198.16446f, 9.9240675f, 198.16162f, 10.550133f, 197.76987f, 10.935685f);
                m145417xd4061a5a.lineTo(64.80481f, 141.79317f);
                m145417xd4061a5a.cubicTo(64.01734f, 142.56815f, 62.75824f, 142.55399f, 61.988094f, 141.75691f);
                m145417xd4061a5a.lineTo(0.31970137f, 77.93319f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
