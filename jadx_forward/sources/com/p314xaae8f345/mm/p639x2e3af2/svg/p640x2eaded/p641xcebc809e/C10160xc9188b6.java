package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.voice_password_icon_normal */
/* loaded from: classes16.dex */
public class C10160xc9188b6 extends l95.c {

    /* renamed from: width */
    private final int f27523x6be2dc6 = 240;

    /* renamed from: height */
    private final int f27522xb7389127 = 240;

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
                canvas.save();
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, -4094.0f, 0.0f, 1.0f, -5370.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                float[] m145419x1d8aec802 = l95.c.m145419x1d8aec80(m145419x1d8aec80, 1.0f, 0.0f, 4094.0f, 0.0f, 1.0f, 5370.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec802);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-16268960);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(120.0f, 0.0f);
                m145417xd4061a5a.cubicTo(186.27417f, 0.0f, 240.0f, 53.72583f, 240.0f, 120.0f);
                m145417xd4061a5a.cubicTo(240.0f, 186.27417f, 186.27417f, 240.0f, 120.0f, 240.0f);
                m145417xd4061a5a.cubicTo(53.72583f, 240.0f, 0.0f, 186.27417f, 0.0f, 120.0f);
                m145417xd4061a5a.cubicTo(0.0f, 53.72583f, 53.72583f, 0.0f, 120.0f, 0.0f);
                m145417xd4061a5a.close();
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
                canvas.restore();
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c92.setColor(-1);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(87.27273f, 109.09091f);
                m145417xd4061a5a2.lineTo(87.27273f, 121.55844f);
                m145417xd4061a5a2.cubicTo(87.27273f, 140.49391f, 102.62296f, 155.84416f, 121.55844f, 155.84416f);
                m145417xd4061a5a2.cubicTo(140.49391f, 155.84416f, 155.84416f, 140.49391f, 155.84416f, 121.55844f);
                m145417xd4061a5a2.lineTo(155.84416f, 109.09091f);
                m145417xd4061a5a2.lineTo(165.19481f, 109.09091f);
                m145417xd4061a5a2.lineTo(165.19481f, 121.55844f);
                m145417xd4061a5a2.cubicTo(165.19481f, 144.07864f, 148.13507f, 162.61435f, 126.233894f, 164.94727f);
                m145417xd4061a5a2.lineTo(126.233765f, 183.8961f);
                m145417xd4061a5a2.lineTo(116.88312f, 183.8961f);
                m145417xd4061a5a2.lineTo(116.88344f, 164.94731f);
                m145417xd4061a5a2.cubicTo(94.98204f, 162.6146f, 77.92208f, 144.0788f, 77.92208f, 121.55844f);
                m145417xd4061a5a2.lineTo(77.92208f, 109.09091f);
                m145417xd4061a5a2.lineTo(87.27273f, 109.09091f);
                m145417xd4061a5a2.close();
                m145417xd4061a5a2.moveTo(121.55844f, 59.22078f);
                m145417xd4061a5a2.cubicTo(135.3297f, 59.22078f, 146.4935f, 70.38459f, 146.4935f, 84.155846f);
                m145417xd4061a5a2.lineTo(146.4935f, 84.155846f);
                m145417xd4061a5a2.lineTo(146.4935f, 121.55844f);
                m145417xd4061a5a2.cubicTo(146.4935f, 135.3297f, 135.3297f, 146.4935f, 121.55844f, 146.4935f);
                m145417xd4061a5a2.cubicTo(107.787186f, 146.4935f, 96.623375f, 135.3297f, 96.623375f, 121.55844f);
                m145417xd4061a5a2.lineTo(96.623375f, 121.55844f);
                m145417xd4061a5a2.lineTo(96.623375f, 84.155846f);
                m145417xd4061a5a2.cubicTo(96.623375f, 70.38459f, 107.787186f, 59.22078f, 121.55844f, 59.22078f);
                m145417xd4061a5a2.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
                canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
