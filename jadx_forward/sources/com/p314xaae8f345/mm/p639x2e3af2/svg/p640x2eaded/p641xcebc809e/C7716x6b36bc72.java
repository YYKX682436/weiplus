package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.close_icon_nor */
/* loaded from: classes16.dex */
public class C7716x6b36bc72 extends l95.c {

    /* renamed from: width */
    private final int f22631x6be2dc6 = 120;

    /* renamed from: height */
    private final int f22630xb7389127 = 120;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 120;
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
                m145414xacbd08c9.setColor(-16777216);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, -0.70710677f, -0.70710677f, 131.874f, 0.70710677f, -0.70710677f, 32.16815f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(85.83542f, 16.085417f);
                m145417xd4061a5a.cubicTo(86.106865f, 16.356863f, 86.27476f, 16.731863f, 86.27476f, 17.146076f);
                m145417xd4061a5a.lineTo(86.27476f, 69.64608f);
                m145417xd4061a5a.cubicTo(86.27476f, 70.4745f, 85.60318f, 71.14608f, 84.77476f, 71.14608f);
                m145417xd4061a5a.lineTo(81.77476f, 71.14608f);
                m145417xd4061a5a.cubicTo(80.94633f, 71.14608f, 80.27476f, 70.4745f, 80.27476f, 69.64608f);
                m145417xd4061a5a.lineTo(80.27476f, 21.646076f);
                m145417xd4061a5a.lineTo(33.774757f, 21.646076f);
                m145417xd4061a5a.cubicTo(32.94633f, 21.646076f, 32.274757f, 20.974504f, 32.274757f, 20.146076f);
                m145417xd4061a5a.lineTo(32.274757f, 17.146076f);
                m145417xd4061a5a.cubicTo(32.274757f, 16.31765f, 32.94633f, 15.646077f, 33.774757f, 15.646077f);
                m145417xd4061a5a.lineTo(84.77476f, 15.646077f);
                m145417xd4061a5a.cubicTo(85.18897f, 15.646077f, 85.56397f, 15.81397f, 85.83542f, 16.085417f);
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
