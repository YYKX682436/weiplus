package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_location */
/* loaded from: classes16.dex */
public class C8999x9d99890d extends l95.c {

    /* renamed from: width */
    private final int f25197x6be2dc6 = 72;

    /* renamed from: height */
    private final int f25196xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
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
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c92, looper);
            m145414xacbd08c9.setStrokeWidth(1.0f);
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
            m145414xacbd08c92.setColor(-16777216);
            m145414xacbd08c92.setStrokeWidth(3.8f);
            canvas.save();
            float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 13.5f, 0.0f, 1.0f, 7.5f, 0.0f, 0.0f, 1.0f);
            m145412xe5ca94b6.reset();
            m145412xe5ca94b6.setValues(m145419x1d8aec80);
            canvas.concat(m145412xe5ca94b6);
            canvas.save();
            android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c92, looper);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(22.5f, 1.9f);
            m145417xd4061a5a.cubicTo(16.80991f, 1.9f, 11.657898f, 4.1889653f, 7.9288034f, 7.8915734f);
            m145417xd4061a5a.cubicTo(4.2046285f, 11.589297f, 1.9f, 16.697329f, 1.9f, 22.340193f);
            m145417xd4061a5a.cubicTo(1.9f, 38.49178f, 21.652529f, 54.777836f, 21.700645f, 54.819466f);
            m145417xd4061a5a.cubicTo(21.922876f, 55.018337f, 22.219185f, 55.103367f, 22.507957f, 55.10272f);
            m145417xd4061a5a.cubicTo(22.790081f, 55.102085f, 23.079666f, 55.019444f, 23.357542f, 54.768497f);
            m145417xd4061a5a.cubicTo(23.357542f, 54.768497f, 43.1f, 38.49152f, 43.1f, 22.340193f);
            m145417xd4061a5a.cubicTo(43.1f, 16.697329f, 40.795372f, 11.589297f, 37.071198f, 7.8915734f);
            m145417xd4061a5a.cubicTo(33.342102f, 4.1889653f, 28.19009f, 1.9f, 22.5f, 1.9f);
            m145417xd4061a5a.close();
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c93);
            canvas.restore();
            canvas.save();
            android.graphics.Paint m145414xacbd08c94 = l95.c.m145414xacbd08c9(m145414xacbd08c92, looper);
            android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a2.moveTo(22.5f, 13.9f);
            m145417xd4061a5a2.cubicTo(27.24965f, 13.9f, 31.1f, 17.75035f, 31.1f, 22.5f);
            m145417xd4061a5a2.cubicTo(31.1f, 27.24965f, 27.24965f, 31.1f, 22.5f, 31.1f);
            m145417xd4061a5a2.cubicTo(17.75035f, 31.1f, 13.9f, 27.24965f, 13.9f, 22.5f);
            m145417xd4061a5a2.cubicTo(13.9f, 17.75035f, 17.75035f, 13.9f, 22.5f, 13.9f);
            m145417xd4061a5a2.close();
            canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c94);
            canvas.restore();
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
