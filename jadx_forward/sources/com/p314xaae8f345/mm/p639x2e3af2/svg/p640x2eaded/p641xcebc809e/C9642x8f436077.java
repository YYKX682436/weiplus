package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.panel_icon_live */
/* loaded from: classes16.dex */
public class C9642x8f436077 extends l95.c {

    /* renamed from: width */
    private final int f26485x6be2dc6 = 96;

    /* renamed from: height */
    private final int f26484xb7389127 = 96;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 96;
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
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(0.0f, 0.0f);
            m145417xd4061a5a.lineTo(96.0f, 0.0f);
            m145417xd4061a5a.lineTo(96.0f, 96.0f);
            m145417xd4061a5a.lineTo(0.0f, 96.0f);
            m145417xd4061a5a.lineTo(0.0f, 0.0f);
            m145417xd4061a5a.close();
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
            m145414xacbd08c92.setColor(-16777216);
            m145414xacbd08c92.setStrokeWidth(6.0f);
            android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a2.moveTo(48.0f, 11.0f);
            m145417xd4061a5a2.cubicTo(68.43454f, 11.0f, 85.0f, 27.565464f, 85.0f, 48.0f);
            m145417xd4061a5a2.cubicTo(85.0f, 68.43454f, 68.43454f, 85.0f, 48.0f, 85.0f);
            m145417xd4061a5a2.cubicTo(27.565464f, 85.0f, 11.0f, 68.43454f, 11.0f, 48.0f);
            m145417xd4061a5a2.cubicTo(11.0f, 27.565464f, 27.565464f, 11.0f, 48.0f, 11.0f);
            m145417xd4061a5a2.close();
            canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
            canvas.restore();
            canvas.save();
            android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            android.graphics.Paint m145414xacbd08c94 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
            m145414xacbd08c93.setColor(-16777216);
            m145414xacbd08c94.setColor(-16777216);
            m145414xacbd08c94.setStrokeWidth(3.3333333f);
            android.graphics.Path m145417xd4061a5a3 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a3.moveTo(48.0f, 26.0f);
            m145417xd4061a5a3.cubicTo(60.150265f, 26.0f, 70.0f, 35.849735f, 70.0f, 48.0f);
            m145417xd4061a5a3.cubicTo(70.0f, 60.150265f, 60.150265f, 70.0f, 48.0f, 70.0f);
            m145417xd4061a5a3.cubicTo(35.849735f, 70.0f, 26.0f, 60.150265f, 26.0f, 48.0f);
            m145417xd4061a5a3.cubicTo(26.0f, 35.849735f, 35.849735f, 26.0f, 48.0f, 26.0f);
            m145417xd4061a5a3.close();
            canvas.drawPath(m145417xd4061a5a3, m145414xacbd08c93);
            canvas.drawPath(m145417xd4061a5a3, m145414xacbd08c94);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
