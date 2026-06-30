package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_select_overlay_regular */
/* loaded from: classes16.dex */
public class C7683xd2420566 extends l95.c {

    /* renamed from: width */
    private final int f22565x6be2dc6 = 26;

    /* renamed from: height */
    private final int f22564xb7389127 = 26;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 26;
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
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-16777216);
            m145414xacbd08c9.setColor(-16777216);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(13.0f, 1.0f);
            m145417xd4061a5a.cubicTo(19.6274f, 1.0f, 25.0f, 6.37258f, 25.0f, 13.0f);
            m145417xd4061a5a.cubicTo(25.0f, 19.6274f, 19.6274f, 25.0f, 13.0f, 25.0f);
            m145417xd4061a5a.cubicTo(6.37258f, 25.0f, 1.0f, 19.6274f, 1.0f, 13.0f);
            m145417xd4061a5a.cubicTo(1.0f, 6.37258f, 6.37258f, 1.0f, 13.0f, 1.0f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(11.2422f, 15.876f);
            m145417xd4061a5a.lineTo(7.94238f, 12.5762f);
            m145417xd4061a5a.lineTo(7.0f, 13.5186f);
            m145417xd4061a5a.lineTo(10.7715f, 17.29f);
            m145417xd4061a5a.cubicTo(11.0318f, 17.5502f, 11.4536f, 17.5502f, 11.7139f, 17.29f);
            m145417xd4061a5a.lineTo(19.7275f, 9.27637f);
            m145417xd4061a5a.lineTo(18.7852f, 8.33301f);
            m145417xd4061a5a.lineTo(11.2422f, 15.876f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
