package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.tips_background_dark */
/* loaded from: classes16.dex */
public class C10033x8fb798e0 extends l95.c {

    /* renamed from: width */
    private final int f27269x6be2dc6 = 200;

    /* renamed from: height */
    private final int f27268xb7389127 = 101;

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
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c92, looper);
            m145414xacbd08c9.setStrokeWidth(1.0f);
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
            m145414xacbd08c92.setColor(-13882324);
            m145414xacbd08c93.setColor(268435455);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(0.5f, 8.5f);
            m145417xd4061a5a.cubicTo(0.5f, 4.081722f, 4.081722f, 0.5f, 8.5f, 0.5f);
            m145417xd4061a5a.lineTo(191.5f, 0.5f);
            m145417xd4061a5a.cubicTo(195.91827f, 0.5f, 199.5f, 4.081722f, 199.5f, 8.5f);
            m145417xd4061a5a.lineTo(199.5f, 92.5f);
            m145417xd4061a5a.cubicTo(199.5f, 96.91828f, 195.91827f, 100.5f, 191.5f, 100.5f);
            m145417xd4061a5a.lineTo(8.5f, 100.5f);
            m145417xd4061a5a.cubicTo(4.081722f, 100.5f, 0.5f, 96.91828f, 0.5f, 92.5f);
            m145417xd4061a5a.lineTo(0.5f, 8.5f);
            m145417xd4061a5a.close();
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c93);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
