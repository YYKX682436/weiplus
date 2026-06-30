package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fts_more_button_icon */
/* loaded from: classes16.dex */
public class C8263xd9fe6b16 extends l95.c {

    /* renamed from: width */
    private final int f23725x6be2dc6 = 24;

    /* renamed from: height */
    private final int f23724xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                m145414xacbd08c9.setColor(-11048043);
                canvas.save();
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(12.309931f, 11.561403f);
                m145417xd4061a5a.lineTo(16.424265f, 15.675735f);
                m145417xd4061a5a.lineTo(15.575736f, 16.524263f);
                m145417xd4061a5a.lineTo(11.452851f, 12.401379f);
                m145417xd4061a5a.cubicTo(10.24281f, 13.400067f, 8.691467f, 14.0f, 7.0f, 14.0f);
                m145417xd4061a5a.cubicTo(3.134f, 14.0f, 0.0f, 10.866f, 0.0f, 7.0f);
                m145417xd4061a5a.cubicTo(0.0f, 3.134f, 3.134f, 0.0f, 7.0f, 0.0f);
                m145417xd4061a5a.cubicTo(10.866f, 0.0f, 14.0f, 3.134f, 14.0f, 7.0f);
                m145417xd4061a5a.cubicTo(14.0f, 8.742484f, 13.363332f, 10.336264f, 12.309931f, 11.561403f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(12.799997f, 7.0000124f);
                m145417xd4061a5a.cubicTo(12.799997f, 3.796755f, 10.203255f, 1.2000122f, 6.999997f, 1.2000122f);
                m145417xd4061a5a.cubicTo(3.7967398f, 1.2000122f, 1.199997f, 3.796755f, 1.199997f, 7.0000124f);
                m145417xd4061a5a.cubicTo(1.199997f, 10.20327f, 3.7967398f, 12.800013f, 6.999997f, 12.800013f);
                m145417xd4061a5a.cubicTo(10.203255f, 12.800013f, 12.799997f, 10.20327f, 12.799997f, 7.0000124f);
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
