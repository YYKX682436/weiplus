package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_mini_select_filled */
/* loaded from: classes16.dex */
public class C7676xe2c3ca19 extends l95.c {

    /* renamed from: width */
    private final int f22551x6be2dc6 = 12;

    /* renamed from: height */
    private final int f22550xb7389127 = 12;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 12;
        }
        if (i17 != 2) {
            return 0;
        }
        android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
        android.os.Looper looper = (android.os.Looper) objArr[1];
        l95.c.m145412xe5ca94b6(looper);
        l95.c.m145413xf00d6f43(looper);
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
        m145414xacbd08c9.setColor(-16268960);
        m145414xacbd08c9.setColor(-16268960);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(0.0f, 6.0f);
        m145417xd4061a5a.cubicTo(0.0f, 2.6862912f, 2.6862912f, 0.0f, 6.0f, 0.0f);
        m145417xd4061a5a.lineTo(6.0f, 0.0f);
        m145417xd4061a5a.cubicTo(9.313709f, 0.0f, 12.0f, 2.6862912f, 12.0f, 6.0f);
        m145417xd4061a5a.lineTo(12.0f, 6.0f);
        m145417xd4061a5a.cubicTo(12.0f, 9.313709f, 9.313709f, 12.0f, 6.0f, 12.0f);
        m145417xd4061a5a.lineTo(6.0f, 12.0f);
        m145417xd4061a5a.cubicTo(2.6862912f, 12.0f, 0.0f, 9.313709f, 0.0f, 6.0f);
        m145417xd4061a5a.lineTo(0.0f, 6.0f);
        m145417xd4061a5a.close();
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-1);
        m145414xacbd08c92.setColor(-1);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(4.83024f, 8.2528f);
        m145417xd4061a5a2.lineTo(2.85034f, 6.2729f);
        m145417xd4061a5a2.lineTo(3.34532f, 5.77792f);
        m145417xd4061a5a2.lineTo(5.07773f, 7.51033f);
        m145417xd4061a5a2.lineTo(9.03753f, 3.55054f);
        m145417xd4061a5a2.lineTo(9.5325f, 4.04551f);
        m145417xd4061a5a2.lineTo(5.32522f, 8.2528f);
        m145417xd4061a5a2.cubicTo(5.18853f, 8.38948f, 4.96692f, 8.38948f, 4.83024f, 8.2528f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
