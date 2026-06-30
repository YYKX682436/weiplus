package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.mmsight_camera_preview_icon_done */
/* loaded from: classes16.dex */
public class C9467xbf6d9f39 extends l95.c {

    /* renamed from: width */
    private final int f26135x6be2dc6 = 240;

    /* renamed from: height */
    private final int f26134xb7389127 = 240;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 240;
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
                m145414xacbd08c9.setColor(-15028967);
                canvas.save();
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 68.0f, 0.0f, 1.0f, 85.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(13.540069f, 40.015434f);
                m145417xd4061a5a.cubicTo(12.961421f, 39.417805f, 12.934421f, 38.432583f, 13.489049f, 37.804356f);
                m145417xd4061a5a.lineTo(15.936921f, 35.03166f);
                m145417xd4061a5a.cubicTo(16.48739f, 34.408142f, 17.474325f, 34.316227f, 18.125168f, 34.814026f);
                m145417xd4061a5a.lineTo(37.615322f, 49.72111f);
                m145417xd4061a5a.cubicTo(38.273388f, 50.224434f, 39.324657f, 50.21021f, 39.97293f, 49.68157f);
                m145417xd4061a5a.lineTo(89.95811f, 8.920589f);
                m145417xd4061a5a.cubicTo(90.60211f, 8.395429f, 91.602684f, 8.439274f, 92.19417f, 9.019729f);
                m145417xd4061a5a.lineTo(93.4955f, 10.296785f);
                m145417xd4061a5a.cubicTo(94.08643f, 10.876699f, 94.083435f, 11.820237f, 93.50139f, 12.391867f);
                m145417xd4061a5a.lineTo(39.869316f, 65.06429f);
                m145417xd4061a5a.cubicTo(39.28163f, 65.64146f, 38.337345f, 65.62612f, 37.75749f, 65.027245f);
                m145417xd4061a5a.lineTo(13.540069f, 40.015434f);
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
