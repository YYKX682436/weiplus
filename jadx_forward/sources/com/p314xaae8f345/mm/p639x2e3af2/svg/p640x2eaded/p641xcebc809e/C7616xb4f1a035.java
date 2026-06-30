package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chat_comment_channel_close */
/* loaded from: classes16.dex */
public class C7616xb4f1a035 extends l95.c {

    /* renamed from: width */
    private final int f22431x6be2dc6 = 16;

    /* renamed from: height */
    private final int f22430xb7389127 = 16;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 16;
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
                m145414xacbd08c9.setColor(-2130706433);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(8.00004f, 14.6668f);
                m145417xd4061a5a.cubicTo(4.31814f, 14.6668f, 1.33337f, 11.6821f, 1.33337f, 8.00016f);
                m145417xd4061a5a.cubicTo(1.33337f, 4.31826f, 4.31814f, 1.3335f, 8.00004f, 1.3335f);
                m145417xd4061a5a.cubicTo(11.6819f, 1.3335f, 14.6667f, 4.31826f, 14.6667f, 8.00016f);
                m145417xd4061a5a.cubicTo(14.6667f, 11.6821f, 11.6819f, 14.6668f, 8.00004f, 14.6668f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(10.0035f, 5.28956f);
                m145417xd4061a5a.lineTo(10.7106f, 5.99666f);
                m145417xd4061a5a.lineTo(8.70715f, 8.00016f);
                m145417xd4061a5a.lineTo(10.7106f, 10.0036f);
                m145417xd4061a5a.lineTo(10.0035f, 10.7107f);
                m145417xd4061a5a.lineTo(8.00004f, 8.70727f);
                m145417xd4061a5a.lineTo(5.9966f, 10.7107f);
                m145417xd4061a5a.lineTo(5.2895f, 10.0036f);
                m145417xd4061a5a.lineTo(7.29293f, 8.00016f);
                m145417xd4061a5a.lineTo(5.28944f, 5.99666f);
                m145417xd4061a5a.lineTo(5.99654f, 5.28956f);
                m145417xd4061a5a.lineTo(8.00004f, 7.29306f);
                m145417xd4061a5a.lineTo(10.0035f, 5.28956f);
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
