package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.emoji_panel_set_intro_arrow */
/* loaded from: classes16.dex */
public class C7891xd55cd4a5 extends l95.c {

    /* renamed from: width */
    private final int f22981x6be2dc6 = 24;

    /* renamed from: height */
    private final int f22980xb7389127 = 24;

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
                m145414xacbd08c9.setColor(-436207616);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(18.6465f, 11.6465f);
                m145417xd4061a5a.cubicTo(18.8418f, 11.8417f, 18.8418f, 12.1583f, 18.6465f, 12.3536f);
                m145417xd4061a5a.lineTo(17.9394f, 13.0607f);
                m145417xd4061a5a.lineTo(14.7574f, 16.2427f);
                m145417xd4061a5a.lineTo(13.6968f, 15.182f);
                m145417xd4061a5a.lineTo(16.1288f, 12.75f);
                m145417xd4061a5a.lineTo(11.0001f, 12.75f);
                m145417xd4061a5a.lineTo(11.0001f, 11.25f);
                m145417xd4061a5a.lineTo(16.1288f, 11.25f);
                m145417xd4061a5a.lineTo(13.6968f, 8.81806f);
                m145417xd4061a5a.lineTo(14.7574f, 7.7574f);
                m145417xd4061a5a.lineTo(17.9394f, 10.9394f);
                m145417xd4061a5a.lineTo(18.6465f, 11.6465f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(9.50008f, 12.75f);
                m145417xd4061a5a.lineTo(8.00008f, 12.75f);
                m145417xd4061a5a.lineTo(8.00007f, 11.25f);
                m145417xd4061a5a.lineTo(9.50007f, 11.25f);
                m145417xd4061a5a.lineTo(9.50008f, 12.75f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(5.00008f, 12.75f);
                m145417xd4061a5a.lineTo(6.50008f, 12.75f);
                m145417xd4061a5a.lineTo(6.50007f, 11.25f);
                m145417xd4061a5a.lineTo(5.00007f, 11.25f);
                m145417xd4061a5a.lineTo(5.00008f, 12.75f);
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
