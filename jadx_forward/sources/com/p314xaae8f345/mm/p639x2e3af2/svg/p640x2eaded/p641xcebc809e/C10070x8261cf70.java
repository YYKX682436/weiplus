package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.top_story_volume_on */
/* loaded from: classes16.dex */
public class C10070x8261cf70 extends l95.c {

    /* renamed from: width */
    private final int f27343x6be2dc6 = 60;

    /* renamed from: height */
    private final int f27342xb7389127 = 60;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 60;
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
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c92, looper);
        m145414xacbd08c9.setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        m145414xacbd08c92.setColor(-1);
        m145414xacbd08c92.setStrokeWidth(3.6f);
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c92, looper);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(1.8f, 15.3f);
        m145417xd4061a5a.lineTo(1.8f, 36.0f);
        m145417xd4061a5a.lineTo(14.15169f, 36.0f);
        m145417xd4061a5a.lineTo(27.9f, 47.456924f);
        m145417xd4061a5a.lineTo(27.9f, 3.8430748f);
        m145417xd4061a5a.lineTo(14.15169f, 15.3f);
        m145417xd4061a5a.lineTo(1.8f, 15.3f);
        m145417xd4061a5a.close();
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c93);
        canvas.restore();
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c94 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        m145414xacbd08c94.setColor(-1);
        m145414xacbd08c94.setStrokeWidth(3.6f);
        m145414xacbd08c94.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(45.0f, 17.0f);
        m145417xd4061a5a2.cubicTo(50.4f, 19.571428f, 53.1f, 24.071428f, 53.1f, 30.5f);
        m145417xd4061a5a2.cubicTo(53.1f, 36.92857f, 50.4f, 41.42857f, 45.0f, 44.0f);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c94);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
