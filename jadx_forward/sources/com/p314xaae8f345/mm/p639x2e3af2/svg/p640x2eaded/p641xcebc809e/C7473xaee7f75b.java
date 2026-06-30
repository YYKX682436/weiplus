package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.biz_fans_msg_state_sending */
/* loaded from: classes16.dex */
public class C7473xaee7f75b extends l95.c {

    /* renamed from: width */
    private final int f22145x6be2dc6 = 60;

    /* renamed from: height */
    private final int f22144xb7389127 = 60;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 60;
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
                l95.c.m145414xacbd08c9(m145415xacbd08c92, looper).setStrokeWidth(1.0f);
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-5592406);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(28.0f, 24.0f);
                m145417xd4061a5a.lineTo(34.0f, 24.0f);
                m145417xd4061a5a.lineTo(34.0f, 36.0f);
                m145417xd4061a5a.lineTo(28.0f, 36.0f);
                m145417xd4061a5a.lineTo(28.0f, 24.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(38.0f, 24.0f);
                m145417xd4061a5a.lineTo(43.0f, 24.0f);
                m145417xd4061a5a.lineTo(43.0f, 36.0f);
                m145417xd4061a5a.lineTo(38.0f, 36.0f);
                m145417xd4061a5a.lineTo(38.0f, 24.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(47.0f, 24.0f);
                m145417xd4061a5a.lineTo(51.0f, 24.0f);
                m145417xd4061a5a.lineTo(51.0f, 36.0f);
                m145417xd4061a5a.lineTo(47.0f, 36.0f);
                m145417xd4061a5a.lineTo(47.0f, 24.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(25.763962f, 14.012434f);
                m145417xd4061a5a.cubicTo(26.998892f, 12.900997f, 28.0f, 13.345539f, 28.0f, 15.00742f);
                m145417xd4061a5a.lineTo(28.0f, 44.99258f);
                m145417xd4061a5a.cubicTo(28.0f, 46.653534f, 27.008198f, 47.107376f, 25.763962f, 45.987564f);
                m145417xd4061a5a.lineTo(10.236038f, 32.012436f);
                m145417xd4061a5a.cubicTo(9.001108f, 30.900997f, 8.991803f, 29.107378f, 10.236038f, 27.987566f);
                m145417xd4061a5a.lineTo(25.763962f, 14.012434f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
