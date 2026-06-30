package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.moment_luckymoney_payment_close */
/* loaded from: classes16.dex */
public class C9473x765ab6b7 extends l95.c {

    /* renamed from: width */
    private final int f26147x6be2dc6 = 60;

    /* renamed from: height */
    private final int f26146xb7389127 = 60;

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
                m145414xacbd08c9.setColor(-16777216);
                canvas.saveLayerAlpha(null, 76, 31);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(32.091885f, 29.970562f);
                m145417xd4061a5a.lineTo(46.941124f, 15.121321f);
                m145417xd4061a5a.lineTo(44.819805f, 13.0f);
                m145417xd4061a5a.lineTo(29.970562f, 27.849243f);
                m145417xd4061a5a.lineTo(15.121321f, 13.0f);
                m145417xd4061a5a.lineTo(13.0f, 15.121321f);
                m145417xd4061a5a.lineTo(27.849243f, 29.970562f);
                m145417xd4061a5a.lineTo(13.0f, 44.819805f);
                m145417xd4061a5a.lineTo(15.121321f, 46.941124f);
                m145417xd4061a5a.lineTo(29.970562f, 32.091885f);
                m145417xd4061a5a.lineTo(44.819805f, 46.941124f);
                m145417xd4061a5a.lineTo(46.941124f, 44.819805f);
                m145417xd4061a5a.lineTo(32.091885f, 29.970562f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
