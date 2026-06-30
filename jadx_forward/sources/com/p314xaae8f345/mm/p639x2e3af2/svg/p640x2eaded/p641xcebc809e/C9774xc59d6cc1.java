package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.radio_on_easymode */
/* loaded from: classes16.dex */
public class C9774xc59d6cc1 extends l95.c {

    /* renamed from: width */
    private final int f26751x6be2dc6 = 60;

    /* renamed from: height */
    private final int f26750xb7389127 = 60;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 60;
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
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(0.0f, 0.0f);
            m145417xd4061a5a.lineTo(60.0f, 0.0f);
            m145417xd4061a5a.lineTo(60.0f, 60.0f);
            m145417xd4061a5a.lineTo(0.0f, 60.0f);
            m145417xd4061a5a.lineTo(0.0f, 0.0f);
            m145417xd4061a5a.close();
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-16676542);
            android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a2.moveTo(30.0f, 16.0f);
            m145417xd4061a5a2.cubicTo(22.16f, 16.0f, 16.0f, 22.16f, 16.0f, 30.0f);
            m145417xd4061a5a2.cubicTo(16.0f, 37.84f, 22.16f, 44.0f, 30.0f, 44.0f);
            m145417xd4061a5a2.cubicTo(37.84f, 44.0f, 44.0f, 37.84f, 44.0f, 30.0f);
            m145417xd4061a5a2.cubicTo(44.0f, 22.16f, 37.84f, 16.0f, 30.0f, 16.0f);
            m145417xd4061a5a2.lineTo(30.0f, 16.0f);
            m145417xd4061a5a2.close();
            m145417xd4061a5a2.moveTo(30.0f, 6.0f);
            m145417xd4061a5a2.cubicTo(16.8f, 6.0f, 6.0f, 16.8f, 6.0f, 30.0f);
            m145417xd4061a5a2.cubicTo(6.0f, 43.2f, 16.8f, 54.0f, 30.0f, 54.0f);
            m145417xd4061a5a2.cubicTo(43.2f, 54.0f, 54.0f, 43.2f, 54.0f, 30.0f);
            m145417xd4061a5a2.cubicTo(54.0f, 16.8f, 43.2f, 6.0f, 30.0f, 6.0f);
            m145417xd4061a5a2.lineTo(30.0f, 6.0f);
            m145417xd4061a5a2.close();
            m145417xd4061a5a2.moveTo(10.0f, 30.0f);
            m145417xd4061a5a2.cubicTo(10.0f, 19.0f, 19.0f, 10.0f, 30.0f, 10.0f);
            m145417xd4061a5a2.cubicTo(41.0f, 10.0f, 50.0f, 19.0f, 50.0f, 30.0f);
            m145417xd4061a5a2.cubicTo(50.0f, 41.0f, 41.0f, 50.0f, 30.0f, 50.0f);
            m145417xd4061a5a2.cubicTo(19.0f, 50.0f, 10.0f, 41.0f, 10.0f, 30.0f);
            m145417xd4061a5a2.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 1);
            canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
