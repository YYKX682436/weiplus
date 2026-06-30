package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_task_icon */
/* loaded from: classes16.dex */
public class C8139xe65ac499 extends l95.c {

    /* renamed from: width */
    private final int f23477x6be2dc6 = 16;

    /* renamed from: height */
    private final int f23476xb7389127 = 16;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(12.3332f, 12.6308f);
            m145417xd4061a5a.cubicTo(12.2266f, 12.6582f, 12.1149f, 12.6728f, 11.9998f, 12.6728f);
            m145417xd4061a5a.lineTo(3.6665f, 12.6728f);
            m145417xd4061a5a.lineTo(3.6665f, 13.6666f);
            m145417xd4061a5a.lineTo(11.9998f, 13.6666f);
            m145417xd4061a5a.cubicTo(12.1839f, 13.6666f, 12.3332f, 13.5173f, 12.3332f, 13.3333f);
            m145417xd4061a5a.lineTo(12.3332f, 12.6308f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(2.6665f, 1.33325f);
            m145417xd4061a5a.lineTo(11.9998f, 1.33325f);
            m145417xd4061a5a.cubicTo(12.7362f, 1.33325f, 13.3332f, 1.93021f, 13.3332f, 2.66659f);
            m145417xd4061a5a.lineTo(13.3332f, 13.3333f);
            m145417xd4061a5a.cubicTo(13.3332f, 14.0696f, 12.7362f, 14.6666f, 11.9998f, 14.6666f);
            m145417xd4061a5a.lineTo(2.6665f, 14.6666f);
            m145417xd4061a5a.lineTo(2.6665f, 1.33325f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(4.6665f, 2.33325f);
            m145417xd4061a5a.lineTo(4.6665f, 11.6666f);
            m145417xd4061a5a.lineTo(5.6665f, 11.6666f);
            m145417xd4061a5a.lineTo(5.6665f, 2.33325f);
            m145417xd4061a5a.lineTo(4.6665f, 2.33325f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
