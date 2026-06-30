package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.panel_icon_location */
/* loaded from: classes16.dex */
public class C9643xa21791c0 extends l95.c {

    /* renamed from: width */
    private final int f26487x6be2dc6 = 192;

    /* renamed from: height */
    private final int f26486xb7389127 = 192;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 192;
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
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-13421773);
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 48.0f, 0.0f, 1.0f, 48.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(45.781845f, 85.01546f);
                m145417xd4061a5a.cubicTo(45.781845f, 85.01546f, 18.0f, 61.568542f, 18.0f, 39.0f);
                m145417xd4061a5a.cubicTo(18.0f, 22.431458f, 31.431458f, 9.0f, 48.0f, 9.0f);
                m145417xd4061a5a.cubicTo(64.56854f, 9.0f, 78.0f, 22.431458f, 78.0f, 39.0f);
                m145417xd4061a5a.cubicTo(78.0f, 61.568542f, 50.230366f, 85.00419f, 50.230366f, 85.00419f);
                m145417xd4061a5a.cubicTo(49.015343f, 86.10895f, 47.006897f, 86.11149f, 45.781845f, 85.01546f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(48.0f, 51.0f);
                m145417xd4061a5a.cubicTo(54.62742f, 51.0f, 60.0f, 45.62742f, 60.0f, 39.0f);
                m145417xd4061a5a.cubicTo(60.0f, 32.37258f, 54.62742f, 27.0f, 48.0f, 27.0f);
                m145417xd4061a5a.cubicTo(41.37258f, 27.0f, 36.0f, 32.37258f, 36.0f, 39.0f);
                m145417xd4061a5a.cubicTo(36.0f, 45.62742f, 41.37258f, 51.0f, 48.0f, 51.0f);
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
