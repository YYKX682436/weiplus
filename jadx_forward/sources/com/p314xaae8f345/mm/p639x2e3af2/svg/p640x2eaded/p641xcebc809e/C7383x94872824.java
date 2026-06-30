package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.arrow_double_regular */
/* loaded from: classes16.dex */
public class C7383x94872824 extends l95.c {

    /* renamed from: width */
    private final int f21965x6be2dc6 = 24;

    /* renamed from: height */
    private final int f21964xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        m145414xacbd08c9.setColor(-16777216);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(5.51953f, 11.4851f);
        m145417xd4061a5a.lineTo(6.58019f, 12.5458f);
        m145417xd4061a5a.lineTo(12.0048f, 7.12119f);
        m145417xd4061a5a.lineTo(17.4294f, 12.5458f);
        m145417xd4061a5a.lineTo(18.4901f, 11.4851f);
        m145417xd4061a5a.lineTo(12.7112f, 5.70625f);
        m145417xd4061a5a.cubicTo(12.3176f, 5.31266f, 11.6886f, 5.31612f, 11.2984f, 5.70625f);
        m145417xd4061a5a.lineTo(5.51953f, 11.4851f);
        m145417xd4061a5a.close();
        m145417xd4061a5a.moveTo(5.51953f, 17.4851f);
        m145417xd4061a5a.lineTo(6.58019f, 18.5458f);
        m145417xd4061a5a.lineTo(12.0048f, 13.1212f);
        m145417xd4061a5a.lineTo(17.4294f, 18.5458f);
        m145417xd4061a5a.lineTo(18.4901f, 17.4851f);
        m145417xd4061a5a.lineTo(12.7112f, 11.7062f);
        m145417xd4061a5a.cubicTo(12.3176f, 11.3127f, 11.6886f, 11.3161f, 11.2984f, 11.7062f);
        m145417xd4061a5a.lineTo(5.51953f, 17.4851f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
