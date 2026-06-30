package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_selected_black */
/* loaded from: classes16.dex */
public class C7685xaa563957 extends l95.c {

    /* renamed from: width */
    private final int f22569x6be2dc6 = 72;

    /* renamed from: height */
    private final int f22568xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(35.0f, 0.0f);
                m145417xd4061a5a.cubicTo(54.329967f, 0.0f, 70.0f, 15.670033f, 70.0f, 35.0f);
                m145417xd4061a5a.cubicTo(70.0f, 54.329967f, 54.329967f, 70.0f, 35.0f, 70.0f);
                m145417xd4061a5a.cubicTo(15.670033f, 70.0f, 0.0f, 54.329967f, 0.0f, 35.0f);
                m145417xd4061a5a.cubicTo(0.0f, 15.670033f, 15.670033f, 0.0f, 35.0f, 0.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(50.479637f, 22.89f);
                m145417xd4061a5a.lineTo(30.88203f, 42.48761f);
                m145417xd4061a5a.lineTo(21.201382f, 32.806957f);
                m145417xd4061a5a.lineTo(17.5f, 36.50834f);
                m145417xd4061a5a.lineTo(27.70898f, 46.724705f);
                m145417xd4061a5a.cubicTo(27.708654f, 46.725357f, 27.708818f, 46.72552f, 27.70898f, 46.725685f);
                m145417xd4061a5a.lineTo(27.876831f, 46.885323f);
                m145417xd4061a5a.cubicTo(29.642986f, 48.481728f, 32.37013f, 48.429077f, 34.072453f, 46.726517f);
                m145417xd4061a5a.lineTo(34.072453f, 46.726517f);
                m145417xd4061a5a.lineTo(54.198486f, 26.608847f);
                m145417xd4061a5a.lineTo(50.479637f, 22.89f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                canvas.restore();
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(0.0f, 0.0f);
                m145417xd4061a5a2.lineTo(72.0f, 0.0f);
                m145417xd4061a5a2.lineTo(72.0f, 72.0f);
                m145417xd4061a5a2.lineTo(0.0f, 72.0f);
                m145417xd4061a5a2.lineTo(0.0f, 0.0f);
                m145417xd4061a5a2.close();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
