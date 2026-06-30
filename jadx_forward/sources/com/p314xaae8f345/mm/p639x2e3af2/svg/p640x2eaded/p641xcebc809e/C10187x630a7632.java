package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.wallet_down_arrow */
/* loaded from: classes16.dex */
public class C10187x630a7632 extends l95.c {

    /* renamed from: width */
    private final int f27577x6be2dc6 = 8;

    /* renamed from: height */
    private final int f27576xb7389127 = 6;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 8;
        }
        if (i17 == 1) {
            return 6;
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
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-16777216);
            m145414xacbd08c9.setColor(-16777216);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(0.649878f, 1.31235f);
            m145417xd4061a5a.cubicTo(0.387973f, 0.984966f, 0.621059f, 0.5f, 1.04031f, 0.5f);
            m145417xd4061a5a.lineTo(6.95969f, 0.5f);
            m145417xd4061a5a.cubicTo(7.37894f, 0.5f, 7.61203f, 0.984966f, 7.35012f, 1.31235f);
            m145417xd4061a5a.lineTo(4.39043f, 5.01196f);
            m145417xd4061a5a.cubicTo(4.19027f, 5.26216f, 3.80973f, 5.26216f, 3.60957f, 5.01196f);
            m145417xd4061a5a.lineTo(0.649878f, 1.31235f);
            m145417xd4061a5a.close();
            canvas.saveLayerAlpha(null, 128, 31);
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
