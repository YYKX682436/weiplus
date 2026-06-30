package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.shadow_down */
/* loaded from: classes16.dex */
public class C9860xa2c41861 extends l95.c {

    /* renamed from: width */
    private final int f26923x6be2dc6 = 375;

    /* renamed from: height */
    private final int f26922xb7389127 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 375;
        }
        if (i17 == 1) {
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5;
        }
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
            float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -659.0f, 0.0f, 0.0f, 1.0f);
            m145412xe5ca94b6.reset();
            m145412xe5ca94b6.setValues(m145419x1d8aec80);
            canvas.concat(m145412xe5ca94b6);
            canvas.save();
            float[] m145419x1d8aec802 = l95.c.m145419x1d8aec80(m145419x1d8aec80, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 659.0f, 0.0f, 0.0f, 1.0f);
            m145412xe5ca94b6.reset();
            m145412xe5ca94b6.setValues(m145419x1d8aec802);
            canvas.concat(m145412xe5ca94b6);
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(0.0f, 0.0f);
            m145417xd4061a5a.lineTo(375.0f, 0.0f);
            m145417xd4061a5a.lineTo(375.0f, 152.17392f);
            m145417xd4061a5a.lineTo(0.0f, 152.17392f);
            m145417xd4061a5a.lineTo(0.0f, 0.0f);
            m145417xd4061a5a.close();
            android.graphics.Paint m145415xacbd08c93 = l95.c.m145415xacbd08c9(looper);
            m145415xacbd08c93.setFlags(385);
            m145415xacbd08c93.setStyle(android.graphics.Paint.Style.FILL);
            android.graphics.Paint m145415xacbd08c94 = l95.c.m145415xacbd08c9(looper);
            m145415xacbd08c94.setFlags(385);
            m145415xacbd08c94.setStyle(android.graphics.Paint.Style.STROKE);
            m145415xacbd08c93.setColor(-16777216);
            m145415xacbd08c94.setStrokeWidth(1.0f);
            m145415xacbd08c94.setStrokeCap(android.graphics.Paint.Cap.BUTT);
            m145415xacbd08c94.setStrokeJoin(android.graphics.Paint.Join.MITER);
            m145415xacbd08c94.setStrokeMiter(4.0f);
            m145415xacbd08c94.setPathEffect(null);
            float[] m145419x1d8aec803 = l95.c.m145419x1d8aec80(m145419x1d8aec802, 375.0f, 0.0f, 0.0f, 0.0f, 152.17392f, 0.0f, 0.0f, 0.0f, 1.0f);
            m145412xe5ca94b6.reset();
            m145412xe5ca94b6.setValues(m145419x1d8aec803);
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78193x7fec2a77(m145414xacbd08c9, 0.5f, 0.0f, 0.5f, 1.0f, new int[]{0, Integer.MIN_VALUE}, new float[]{0.0f, 1.0f}, m145412xe5ca94b6, 0);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
