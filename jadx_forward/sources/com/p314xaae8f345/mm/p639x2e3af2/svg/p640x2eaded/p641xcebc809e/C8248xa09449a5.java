package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.friendactivity_comment_likeicon_pressed */
/* loaded from: classes16.dex */
public class C8248xa09449a5 extends l95.c {

    /* renamed from: width */
    private final int f23695x6be2dc6 = 80;

    /* renamed from: height */
    private final int f23694xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 80;
        }
        if (i17 == 1) {
            return 72;
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
            float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.3333334f, 0.0f, 0.0f, 0.0f, 1.3333334f, 0.0f, 0.0f, 0.0f, 1.0f);
            m145412xe5ca94b6.reset();
            m145412xe5ca94b6.setValues(m145419x1d8aec80);
            canvas.concat(m145412xe5ca94b6);
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-2171170);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(10.02f, 4.03f);
            m145417xd4061a5a.cubicTo(16.37f, -0.03f, 25.25f, 2.32f, 30.0f, 7.82f);
            m145417xd4061a5a.cubicTo(34.75f, 2.31f, 43.65f, -0.03f, 50.0f, 4.04f);
            m145417xd4061a5a.cubicTo(56.64f, 8.75f, 57.4f, 18.37f, 54.62f, 25.46f);
            m145417xd4061a5a.cubicTo(49.99f, 36.69f, 40.55f, 45.38f, 30.0f, 51.04f);
            m145417xd4061a5a.cubicTo(19.44f, 45.38f, 10.0f, 36.68f, 5.38f, 25.44f);
            m145417xd4061a5a.cubicTo(2.59f, 18.35f, 3.37f, 8.73f, 10.02f, 4.03f);
            m145417xd4061a5a.moveTo(10.78f, 12.53f);
            m145417xd4061a5a.cubicTo(9.05f, 17.39f, 9.87f, 23.01f, 12.63f, 27.35f);
            m145417xd4061a5a.cubicTo(16.91f, 34.26f, 23.39f, 39.46f, 30.0f, 44.02f);
            m145417xd4061a5a.cubicTo(35.84f, 40.01f, 41.47f, 35.49f, 45.75f, 29.79f);
            m145417xd4061a5a.cubicTo(48.53f, 26.15f, 50.43f, 21.67f, 50.08f, 17.01f);
            m145417xd4061a5a.cubicTo(50.12f, 13.43f, 48.4f, 9.15f, 44.52f, 8.35f);
            m145417xd4061a5a.cubicTo(38.67f, 6.6f, 34.27f, 11.91f, 30.0f, 14.96f);
            m145417xd4061a5a.cubicTo(26.8f, 12.47f, 23.72f, 9.6f, 19.86f, 8.15f);
            m145417xd4061a5a.cubicTo(16.34f, 7.44f, 12.05f, 8.89f, 10.78f, 12.53f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
