package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_arrow_down_line_regular */
/* loaded from: classes16.dex */
public class C8452x748495f3 extends l95.c {

    /* renamed from: width */
    private final int f24103x6be2dc6 = 24;

    /* renamed from: height */
    private final int f24102xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                m145414xacbd08c9.setColor(-16777216);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(11.6464f, 18.6465f);
                m145417xd4061a5a.cubicTo(11.8417f, 18.8418f, 12.1583f, 18.8418f, 12.3535f, 18.6465f);
                m145417xd4061a5a.lineTo(13.0606f, 17.9394f);
                m145417xd4061a5a.lineTo(16.2426f, 14.7574f);
                m145417xd4061a5a.lineTo(15.1819f, 13.6968f);
                m145417xd4061a5a.lineTo(12.75f, 16.1288f);
                m145417xd4061a5a.lineTo(12.75f, 12.0352f);
                m145417xd4061a5a.lineTo(12.75f, 12.0352f);
                m145417xd4061a5a.lineTo(12.75f, 5.0f);
                m145417xd4061a5a.lineTo(11.25f, 5.0f);
                m145417xd4061a5a.lineTo(11.25f, 11.0001f);
                m145417xd4061a5a.lineTo(11.25f, 11.0001f);
                m145417xd4061a5a.lineTo(11.25f, 16.1288f);
                m145417xd4061a5a.lineTo(8.81798f, 13.6968f);
                m145417xd4061a5a.lineTo(7.75732f, 14.7574f);
                m145417xd4061a5a.lineTo(10.9393f, 17.9394f);
                m145417xd4061a5a.lineTo(11.6464f, 18.6465f);
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
