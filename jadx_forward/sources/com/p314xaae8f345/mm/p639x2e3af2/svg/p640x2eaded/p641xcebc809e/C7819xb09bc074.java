package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.diehua */
/* loaded from: classes16.dex */
public class C7819xb09bc074 extends l95.c {

    /* renamed from: width */
    private final int f22837x6be2dc6 = 72;

    /* renamed from: height */
    private final int f22836xb7389127 = 72;

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
                m145414xacbd08c9.setColor(-855638017);
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 18.0f, 0.0f, 1.0f, 18.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(35.200096f, 1.3362876f);
                m145417xd4061a5a.cubicTo(35.713497f, 1.873547f, 36.0f, 2.5880585f, 36.0f, 3.331179f);
                m145417xd4061a5a.lineTo(36.0f, 32.639317f);
                m145417xd4061a5a.cubicTo(36.0f, 34.23404f, 34.707222f, 35.526817f, 33.1125f, 35.526817f);
                m145417xd4061a5a.cubicTo(32.36938f, 35.526817f, 31.654867f, 35.240314f, 31.117609f, 34.726913f);
                m145417xd4061a5a.lineTo(17.912905f, 22.108675f);
                m145417xd4061a5a.lineTo(4.9219f, 34.66337f);
                m145417xd4061a5a.cubicTo(3.775109f, 35.771523f, 1.9471134f, 35.740204f, 0.83895725f, 34.593414f);
                m145417xd4061a5a.cubicTo(0.31870332f, 34.055023f, 0.027905475f, 33.335606f, 0.027905475f, 32.586918f);
                m145417xd4061a5a.lineTo(0.027905475f, 3.3835757f);
                m145417xd4061a5a.cubicTo(0.027905475f, 1.7888535f, 1.3206832f, 0.49607575f, 2.9154055f, 0.49607575f);
                m145417xd4061a5a.cubicTo(3.664091f, 0.49607575f, 4.3835077f, 0.7868736f, 4.9219f, 1.3071276f);
                m145417xd4061a5a.lineTo(17.912905f, 13.860674f);
                m145417xd4061a5a.lineTo(31.117609f, 1.2435809f);
                m145417xd4061a5a.cubicTo(32.270557f, 0.1418329f, 34.09835f, 0.18333909f, 35.200096f, 1.3362876f);
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
