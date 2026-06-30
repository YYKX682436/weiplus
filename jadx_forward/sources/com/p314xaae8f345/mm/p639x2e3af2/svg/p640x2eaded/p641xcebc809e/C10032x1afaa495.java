package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.tips_background */
/* loaded from: classes16.dex */
public class C10032x1afaa495 extends l95.c {

    /* renamed from: width */
    private final int f27267x6be2dc6 = 200;

    /* renamed from: height */
    private final int f27266xb7389127 = 101;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 200;
        }
        if (i17 == 1) {
            return 101;
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
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c92, looper);
            m145414xacbd08c9.setStrokeWidth(1.0f);
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
            m145414xacbd08c92.setColor(-1);
            m145414xacbd08c93.setColor(436207616);
            float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, -192.0f, 0.0f, 1.0f, -236.0f, 0.0f, 0.0f, 1.0f);
            m145412xe5ca94b6.reset();
            m145412xe5ca94b6.setValues(m145419x1d8aec80);
            canvas.concat(m145412xe5ca94b6);
            canvas.save();
            android.graphics.Paint m145414xacbd08c94 = l95.c.m145414xacbd08c9(m145414xacbd08c92, looper);
            android.graphics.Paint m145414xacbd08c95 = l95.c.m145414xacbd08c9(m145414xacbd08c93, looper);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(192.5f, 244.5f);
            m145417xd4061a5a.cubicTo(192.5f, 240.08173f, 196.08173f, 236.5f, 200.5f, 236.5f);
            m145417xd4061a5a.lineTo(383.5f, 236.5f);
            m145417xd4061a5a.cubicTo(387.91827f, 236.5f, 391.5f, 240.08173f, 391.5f, 244.5f);
            m145417xd4061a5a.lineTo(391.5f, 328.5f);
            m145417xd4061a5a.cubicTo(391.5f, 332.91827f, 387.91827f, 336.5f, 383.5f, 336.5f);
            m145417xd4061a5a.lineTo(200.5f, 336.5f);
            m145417xd4061a5a.cubicTo(196.08173f, 336.5f, 192.5f, 332.91827f, 192.5f, 328.5f);
            m145417xd4061a5a.lineTo(192.5f, 244.5f);
            m145417xd4061a5a.close();
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c94);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c95);
            canvas.restore();
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
