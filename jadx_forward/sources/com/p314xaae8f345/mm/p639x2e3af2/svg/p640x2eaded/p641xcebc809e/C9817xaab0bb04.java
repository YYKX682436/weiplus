package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.scan_custom_tips_image_bg */
/* loaded from: classes16.dex */
public class C9817xaab0bb04 extends l95.c {

    /* renamed from: width */
    private final int f26837x6be2dc6 = 264;

    /* renamed from: height */
    private final int f26836xb7389127 = 279;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 264;
        }
        if (i17 == 1) {
            return 279;
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
            m145414xacbd08c9.setColor(-421667363);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(24.0f, 264.0f);
            m145417xd4061a5a.cubicTo(10.745166f, 264.0f, 0.0f, 253.25484f, 0.0f, 240.0f);
            m145417xd4061a5a.lineTo(0.0f, 24.0f);
            m145417xd4061a5a.cubicTo(0.0f, 10.745166f, 10.745166f, -2.1316282E-13f, 24.0f, -2.1316282E-13f);
            m145417xd4061a5a.lineTo(240.0f, -2.1316282E-13f);
            m145417xd4061a5a.cubicTo(253.25484f, -2.1316282E-13f, 264.0f, 10.745166f, 264.0f, 24.0f);
            m145417xd4061a5a.lineTo(264.0f, 240.0f);
            m145417xd4061a5a.cubicTo(264.0f, 253.25484f, 253.25484f, 264.0f, 240.0f, 264.0f);
            m145417xd4061a5a.lineTo(148.97057f, 264.0f);
            m145417xd4061a5a.lineTo(136.24265f, 276.72794f);
            m145417xd4061a5a.cubicTo(133.89949f, 279.07108f, 130.10051f, 279.07108f, 127.75736f, 276.72794f);
            m145417xd4061a5a.lineTo(115.029434f, 264.0f);
            m145417xd4061a5a.lineTo(24.0f, 264.0f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
