package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.radio_checked */
/* loaded from: classes16.dex */
public class C9767x7e985f63 extends l95.c {

    /* renamed from: width */
    private final int f26737x6be2dc6 = 24;

    /* renamed from: height */
    private final int f26736xb7389127 = 24;

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
        m145414xacbd08c9.setColor(-16268960);
        m145414xacbd08c9.setColor(-16268960);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(1.0f, 12.0f);
        m145417xd4061a5a.cubicTo(1.0f, 5.92487f, 5.92487f, 1.0f, 12.0f, 1.0f);
        m145417xd4061a5a.lineTo(12.0f, 1.0f);
        m145417xd4061a5a.cubicTo(18.0751f, 1.0f, 23.0f, 5.92487f, 23.0f, 12.0f);
        m145417xd4061a5a.lineTo(23.0f, 12.0f);
        m145417xd4061a5a.cubicTo(23.0f, 18.0751f, 18.0751f, 23.0f, 12.0f, 23.0f);
        m145417xd4061a5a.lineTo(12.0f, 23.0f);
        m145417xd4061a5a.cubicTo(5.92487f, 23.0f, 1.0f, 18.0751f, 1.0f, 12.0f);
        m145417xd4061a5a.lineTo(1.0f, 12.0f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-1);
        m145414xacbd08c92.setColor(-1);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(9.85638f, 16.1306f);
        m145417xd4061a5a2.lineTo(6.22656f, 12.5008f);
        m145417xd4061a5a2.lineTo(7.13402f, 11.5933f);
        m145417xd4061a5a2.lineTo(10.3101f, 14.7694f);
        m145417xd4061a5a2.lineTo(17.5697f, 7.50977f);
        m145417xd4061a5a2.lineTo(18.4772f, 8.41722f);
        m145417xd4061a5a2.lineTo(10.7638f, 16.1306f);
        m145417xd4061a5a2.cubicTo(10.5132f, 16.3812f, 10.107f, 16.3812f, 9.85638f, 16.1306f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
