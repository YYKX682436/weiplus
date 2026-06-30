package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.float_ball_icon_eyes_on */
/* loaded from: classes16.dex */
public class C8211x59692433 extends l95.c {

    /* renamed from: width */
    private final int f23621x6be2dc6 = 18;

    /* renamed from: height */
    private final int f23620xb7389127 = 18;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 18;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                m145414xacbd08c9.setColor(-1);
                m145414xacbd08c9.setColor(-1);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(1.7998f, 9.00001f);
                m145417xd4061a5a.cubicTo(3.12719f, 6.28209f, 5.8529f, 4.4182f, 8.99981f, 4.4182f);
                m145417xd4061a5a.cubicTo(12.1468f, 4.4182f, 14.8725f, 6.28209f, 16.1998f, 9.00001f);
                m145417xd4061a5a.cubicTo(14.8725f, 11.7179f, 12.1468f, 13.5818f, 8.99981f, 13.5818f);
                m145417xd4061a5a.cubicTo(5.8529f, 13.5818f, 3.12719f, 11.7179f, 1.7998f, 9.00001f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(11.2907f, 8.99995f);
                m145417xd4061a5a.cubicTo(11.2907f, 10.2652f, 10.265f, 11.2908f, 8.99976f, 11.2908f);
                m145417xd4061a5a.cubicTo(7.73452f, 11.2908f, 6.70885f, 10.2652f, 6.70885f, 8.99995f);
                m145417xd4061a5a.cubicTo(6.70885f, 7.73471f, 7.73452f, 6.70903f, 8.99976f, 6.70903f);
                m145417xd4061a5a.cubicTo(10.265f, 6.70903f, 11.2907f, 7.73471f, 11.2907f, 8.99995f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
