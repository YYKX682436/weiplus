package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_select_filled */
/* loaded from: classes16.dex */
public class C7682xf55ebe89 extends l95.c {

    /* renamed from: width */
    private final int f22563x6be2dc6 = 26;

    /* renamed from: height */
    private final int f22562xb7389127 = 26;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 26;
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
        m145417xd4061a5a.moveTo(1.0f, 13.0f);
        m145417xd4061a5a.cubicTo(1.0f, 6.3725824f, 6.3725824f, 1.0f, 13.0f, 1.0f);
        m145417xd4061a5a.lineTo(13.0f, 1.0f);
        m145417xd4061a5a.cubicTo(19.627419f, 1.0f, 25.0f, 6.3725824f, 25.0f, 13.0f);
        m145417xd4061a5a.lineTo(25.0f, 13.0f);
        m145417xd4061a5a.cubicTo(25.0f, 19.627419f, 19.627419f, 25.0f, 13.0f, 25.0f);
        m145417xd4061a5a.lineTo(13.0f, 25.0f);
        m145417xd4061a5a.cubicTo(6.3725824f, 25.0f, 1.0f, 19.627419f, 1.0f, 13.0f);
        m145417xd4061a5a.lineTo(1.0f, 13.0f);
        m145417xd4061a5a.close();
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-1);
        m145414xacbd08c92.setColor(-1);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(10.7712f, 17.2902f);
        m145417xd4061a5a2.lineTo(7.0f, 13.5189f);
        m145417xd4061a5a2.lineTo(7.94281f, 12.5761f);
        m145417xd4061a5a2.lineTo(11.2426f, 15.876f);
        m145417xd4061a5a2.lineTo(18.7851f, 8.3335f);
        m145417xd4061a5a2.lineTo(19.7279f, 9.27631f);
        m145417xd4061a5a2.lineTo(11.714f, 17.2902f);
        m145417xd4061a5a2.cubicTo(11.4537f, 17.5505f, 11.0316f, 17.5505f, 10.7712f, 17.2902f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
