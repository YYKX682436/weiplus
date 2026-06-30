package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_video_mute_btn_on */
/* loaded from: classes16.dex */
public class C7347x7958d2ee extends l95.c {

    /* renamed from: width */
    private final int f21893x6be2dc6 = 24;

    /* renamed from: height */
    private final int f21892xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, -222.0f, 0.0f, 1.0f, -60.0f, 0.0f, 0.0f, 1.0f);
            m145412xe5ca94b6.reset();
            m145412xe5ca94b6.setValues(m145419x1d8aec80);
            canvas.concat(m145412xe5ca94b6);
            canvas.save();
            float[] m145419x1d8aec802 = l95.c.m145419x1d8aec80(m145419x1d8aec80, 1.0f, 0.0f, 222.0f, 0.0f, 1.0f, 60.0f, 0.0f, 0.0f, 1.0f);
            m145412xe5ca94b6.reset();
            m145412xe5ca94b6.setValues(m145419x1d8aec802);
            canvas.concat(m145412xe5ca94b6);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(0.0f, 0.0f);
            m145417xd4061a5a.lineTo(24.0f, 0.0f);
            m145417xd4061a5a.lineTo(24.0f, 24.0f);
            m145417xd4061a5a.lineTo(0.0f, 24.0f);
            m145417xd4061a5a.lineTo(0.0f, 0.0f);
            m145417xd4061a5a.close();
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
            m145414xacbd08c92.setColor(-1);
            m145414xacbd08c92.setStrokeWidth(1.5f);
            float[] m145419x1d8aec803 = l95.c.m145419x1d8aec80(m145419x1d8aec802, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
            m145412xe5ca94b6.reset();
            m145412xe5ca94b6.setValues(m145419x1d8aec803);
            canvas.concat(m145412xe5ca94b6);
            canvas.save();
            android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c92, looper);
            android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a2.moveTo(0.75f, 5.266332f);
            m145417xd4061a5a2.lineTo(0.75f, 12.733709f);
            m145417xd4061a5a2.lineTo(5.1924944f, 12.733709f);
            m145417xd4061a5a2.lineTo(11.25f, 17.016748f);
            m145417xd4061a5a2.lineTo(11.25f, 0.9832927f);
            m145417xd4061a5a2.lineTo(5.1924944f, 5.266332f);
            m145417xd4061a5a2.lineTo(0.75f, 5.266332f);
            m145417xd4061a5a2.close();
            canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c93);
            canvas.restore();
            canvas.save();
            android.graphics.Paint m145414xacbd08c94 = l95.c.m145414xacbd08c9(m145414xacbd08c92, looper);
            m145414xacbd08c94.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
            android.graphics.Path m145417xd4061a5a3 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a3.moveTo(16.0f, 5.0f);
            m145417xd4061a5a3.cubicTo(17.8f, 5.857143f, 18.7f, 7.357143f, 18.7f, 9.5f);
            m145417xd4061a5a3.cubicTo(18.7f, 11.642858f, 17.8f, 13.142858f, 16.0f, 14.0f);
            canvas.drawPath(m145417xd4061a5a3, m145414xacbd08c94);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
