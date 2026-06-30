package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.confirm_dialog_successful_icon */
/* loaded from: classes16.dex */
public class C7735xc811fe66 extends l95.c {

    /* renamed from: width */
    private final int f22669x6be2dc6 = 120;

    /* renamed from: height */
    private final int f22668xb7389127 = 80;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 120;
        }
        if (i17 == 1) {
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
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-12206054);
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(46.16f, 67.69f);
            m145417xd4061a5a.cubicTo(68.72f, 45.13f, 91.28f, 22.57f, 113.84f, 0.01f);
            m145417xd4061a5a.cubicTo(115.9f, 2.05f, 117.95f, 4.1f, 119.99f, 6.16f);
            m145417xd4061a5a.cubicTo(95.39f, 30.78f, 70.77f, 55.38f, 46.16f, 79.99f);
            m145417xd4061a5a.cubicTo(30.77f, 64.62f, 15.38f, 49.24f, 0.01f, 33.85f);
            m145417xd4061a5a.cubicTo(2.05f, 31.79f, 4.1f, 29.74f, 6.16f, 27.71f);
            m145417xd4061a5a.cubicTo(19.5f, 41.02f, 32.81f, 54.37f, 46.16f, 67.69f);
            m145417xd4061a5a.lineTo(46.16f, 67.69f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
