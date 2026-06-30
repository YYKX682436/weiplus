package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_selected_grey */
/* loaded from: classes16.dex */
public class C7693x2ecb5687 extends l95.c {

    /* renamed from: width */
    private final int f22585x6be2dc6 = 72;

    /* renamed from: height */
    private final int f22584xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                canvas.saveLayerAlpha(null, 76, 31);
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-16268960);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(72.0f, 36.444443f);
                m145417xd4061a5a.cubicTo(72.0f, 16.117332f, 55.882668f, 0.0f, 35.555557f, 0.0f);
                m145417xd4061a5a.cubicTo(16.117332f, 0.0f, 0.0f, 16.117332f, 0.0f, 36.444443f);
                m145417xd4061a5a.cubicTo(0.0f, 55.882668f, 16.117332f, 72.0f, 35.555557f, 72.0f);
                m145417xd4061a5a.cubicTo(55.882668f, 72.0f, 72.0f, 55.882668f, 72.0f, 36.444443f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
                canvas.restore();
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c92.setColor(-1);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(31.091883f, 45.941124f);
                m145417xd4061a5a2.lineTo(21.18198f, 36.031223f);
                m145417xd4061a5a2.lineTo(18.0f, 39.213203f);
                m145417xd4061a5a2.lineTo(28.970562f, 50.183765f);
                m145417xd4061a5a2.cubicTo(30.142136f, 51.35534f, 32.04163f, 51.35534f, 33.213203f, 50.183765f);
                m145417xd4061a5a2.lineTo(56.21499f, 27.18198f);
                m145417xd4061a5a2.lineTo(56.21499f, 27.18198f);
                m145417xd4061a5a2.lineTo(53.03301f, 24.0f);
                m145417xd4061a5a2.lineTo(31.091883f, 45.941124f);
                m145417xd4061a5a2.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
                canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
                canvas.restore();
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
