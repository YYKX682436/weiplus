package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.live_anchor_top_shadow_new */
/* loaded from: classes16.dex */
public class C9328xf52d22e2 extends l95.c {

    /* renamed from: width */
    private final int f25855x6be2dc6 = 414;

    /* renamed from: height */
    private final int f25854xb7389127 = 260;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 414;
        }
        if (i17 == 1) {
            return 260;
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
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(414.0f, 260.0f);
            m145417xd4061a5a.lineTo(0.0f, 260.0f);
            m145417xd4061a5a.lineTo(0.0f, 0.0f);
            m145417xd4061a5a.lineTo(414.0f, 0.0f);
            m145417xd4061a5a.lineTo(414.0f, 260.0f);
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
            float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            m145412xe5ca94b6.reset();
            m145412xe5ca94b6.setValues(m145419x1d8aec80);
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78193x7fec2a77(m145414xacbd08c9, 20717.6f, -1235.29f, 20717.6f, -25740.0f, new int[]{0, 201326592, 1275068416}, new float[]{0.0f, 0.341528f, 1.0f}, m145412xe5ca94b6, 0);
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
