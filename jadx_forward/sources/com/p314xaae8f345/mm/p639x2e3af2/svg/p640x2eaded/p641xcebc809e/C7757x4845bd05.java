package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.count_down_2 */
/* loaded from: classes16.dex */
public class C7757x4845bd05 extends l95.c {

    /* renamed from: width */
    private final int f22713x6be2dc6 = 80;

    /* renamed from: height */
    private final int f22712xb7389127 = 80;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 80;
        }
        if (i17 == 2) {
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
            l95.c.m145414xacbd08c9(m145415xacbd08c92, looper).setStrokeWidth(1.0f);
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-1);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(40.504f, 14.0f);
            m145417xd4061a5a.cubicTo(45.4f, 14.0f, 49.504f, 15.368f, 52.672f, 18.248f);
            m145417xd4061a5a.cubicTo(55.768f, 21.128f, 57.352f, 24.8f, 57.352f, 29.336f);
            m145417xd4061a5a.cubicTo(57.352f, 33.8f, 55.624f, 37.832f, 52.312f, 41.504f);
            m145417xd4061a5a.cubicTo(50.296f, 43.592f, 46.768f, 46.328f, 41.656f, 49.784f);
            m145417xd4061a5a.cubicTo(36.112f, 53.456f, 32.8f, 56.696f, 31.72f, 59.504f);
            m145417xd4061a5a.lineTo(57.424f, 59.504f);
            m145417xd4061a5a.lineTo(57.424f, 66.416f);
            m145417xd4061a5a.lineTo(22.0f, 66.416f);
            m145417xd4061a5a.cubicTo(22.0f, 61.304f, 23.656f, 56.84f, 27.112f, 52.952f);
            m145417xd4061a5a.cubicTo(28.984f, 50.72f, 32.872f, 47.624f, 38.704f, 43.592f);
            m145417xd4061a5a.cubicTo(42.16f, 41.144f, 44.608f, 39.2f, 46.048f, 37.688f);
            m145417xd4061a5a.cubicTo(48.352f, 35.096f, 49.576f, 32.288f, 49.576f, 29.264f);
            m145417xd4061a5a.cubicTo(49.576f, 26.384f, 48.784f, 24.224f, 47.2f, 22.784f);
            m145417xd4061a5a.cubicTo(45.616f, 21.344f, 43.24f, 20.624f, 40.216f, 20.624f);
            m145417xd4061a5a.cubicTo(36.976f, 20.624f, 34.528f, 21.704f, 32.872f, 23.936f);
            m145417xd4061a5a.cubicTo(31.144f, 26.096f, 30.28f, 29.192f, 30.136f, 33.368f);
            m145417xd4061a5a.lineTo(22.288f, 33.368f);
            m145417xd4061a5a.cubicTo(22.36f, 27.608f, 24.016f, 23.0f, 27.256f, 19.544f);
            m145417xd4061a5a.cubicTo(30.568f, 15.8f, 35.032f, 14.0f, 40.504f, 14.0f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
