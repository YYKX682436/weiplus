package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_record_effect_template */
/* loaded from: classes16.dex */
public class C8723xbe01d492 extends l95.c {

    /* renamed from: width */
    private final int f24645x6be2dc6 = 30;

    /* renamed from: height */
    private final int f24644xb7389127 = 30;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 30;
        }
        if (i17 != 2) {
            return 0;
        }
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
        canvas.save();
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(-1);
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 0.9659258f, 0.25881904f, -1.8715264f, -0.25881904f, 0.9659258f, 1.0363061f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(3.0f, 8.62598f);
        m145417xd4061a5a.cubicTo(3.0f, 8.073695f, 3.4477153f, 7.62598f, 4.0f, 7.62598f);
        m145417xd4061a5a.lineTo(16.0098f, 7.62598f);
        m145417xd4061a5a.cubicTo(16.562084f, 7.62598f, 17.0098f, 8.073695f, 17.0098f, 8.62598f);
        m145417xd4061a5a.lineTo(17.0098f, 26.64008f);
        m145417xd4061a5a.cubicTo(17.0098f, 27.192364f, 16.562084f, 27.64008f, 16.0098f, 27.64008f);
        m145417xd4061a5a.lineTo(4.0f, 27.64008f);
        m145417xd4061a5a.cubicTo(3.4477153f, 27.64008f, 3.0f, 27.192364f, 3.0f, 26.64008f);
        m145417xd4061a5a.lineTo(3.0f, 8.62598f);
        m145417xd4061a5a.close();
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-1);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(22.8185f, 18.0709f);
        m145417xd4061a5a2.lineTo(25.2145f, 9.12883f);
        m145417xd4061a5a2.cubicTo(25.3575f, 8.59536f, 25.0409f, 8.04703f, 24.5074f, 7.90408f);
        m145417xd4061a5a2.lineTo(19.7529f, 6.63013f);
        m145417xd4061a5a2.lineTo(22.8185f, 18.0709f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
