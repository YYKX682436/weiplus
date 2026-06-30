package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.youzhuan */
/* loaded from: classes16.dex */
public class C10276xd7d124b5 extends l95.c {

    /* renamed from: width */
    private final int f27757x6be2dc6 = 72;

    /* renamed from: height */
    private final int f27756xb7389127 = 72;

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
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 18.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(35.96871f, 3.6252928f);
                m145417xd4061a5a.cubicTo(43.908043f, 9.608009f, 45.49418f, 20.894049f, 39.51146f, 28.833387f);
                m145417xd4061a5a.cubicTo(33.595215f, 36.68451f, 22.49285f, 38.322857f, 14.569242f, 32.572792f);
                m145417xd4061a5a.lineTo(14.3033695f, 32.37617f);
                m145417xd4061a5a.lineTo(17.91426f, 27.584358f);
                m145417xd4061a5a.cubicTo(23.207146f, 31.572834f, 30.731163f, 30.515392f, 34.719646f, 25.222498f);
                m145417xd4061a5a.cubicTo(38.70813f, 19.929602f, 37.650707f, 12.405581f, 32.35782f, 8.417106f);
                m145417xd4061a5a.cubicTo(27.06493f, 4.4286265f, 19.540894f, 5.486061f, 15.520621f, 10.820387f);
                m145417xd4061a5a.cubicTo(14.559699f, 12.050423f, 13.854734f, 13.4099655f, 13.406418f, 14.915149f);
                m145417xd4061a5a.lineTo(20.786894f, 15.609411f);
                m145417xd4061a5a.lineTo(9.16957f, 26.340914f);
                m145417xd4061a5a.lineTo(0.29198435f, 13.682716f);
                m145417xd4061a5a.lineTo(7.3525424f, 14.3464985f);
                m145417xd4061a5a.cubicTo(7.9301133f, 11.843923f, 8.976221f, 9.561095f, 10.486247f, 7.52814f);
                m145417xd4061a5a.lineTo(10.760601f, 7.1680617f);
                m145417xd4061a5a.cubicTo(16.74332f, -0.77127427f, 28.029375f, -2.357426f, 35.96871f, 3.6252928f);
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
