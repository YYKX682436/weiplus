package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.honey_checkbox_selected_orange */
/* loaded from: classes16.dex */
public class C8322xeb30185a extends l95.c {

    /* renamed from: width */
    private final int f23843x6be2dc6 = 72;

    /* renamed from: height */
    private final int f23842xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            l95.c.m145414xacbd08c9(m145415xacbd08c92, looper).setStrokeWidth(1.0f);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(0.0f, 0.0f);
            m145417xd4061a5a.lineTo(72.0f, 0.0f);
            m145417xd4061a5a.lineTo(72.0f, 72.0f);
            m145417xd4061a5a.lineTo(0.0f, 72.0f);
            m145417xd4061a5a.lineTo(0.0f, 0.0f);
            m145417xd4061a5a.close();
            canvas.saveLayerAlpha(null, 0, 31);
            canvas.restore();
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-352965);
            android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a2.moveTo(35.5679f, 1.0f);
            m145417xd4061a5a2.cubicTo(55.33037f, 1.0f, 71.0f, 16.66963f, 71.0f, 36.4321f);
            m145417xd4061a5a2.cubicTo(71.0f, 55.33037f, 55.33037f, 71.0f, 35.5679f, 71.0f);
            m145417xd4061a5a2.cubicTo(16.66963f, 71.0f, 1.0f, 55.33037f, 1.0f, 36.4321f);
            m145417xd4061a5a2.cubicTo(1.0f, 16.66963f, 16.66963f, 1.0f, 35.5679f, 1.0f);
            m145417xd4061a5a2.close();
            m145417xd4061a5a2.moveTo(53.03301f, 24.0f);
            m145417xd4061a5a2.lineTo(31.091883f, 45.941124f);
            m145417xd4061a5a2.lineTo(21.18198f, 36.031223f);
            m145417xd4061a5a2.lineTo(18.0f, 39.213203f);
            m145417xd4061a5a2.lineTo(28.970562f, 50.183765f);
            m145417xd4061a5a2.cubicTo(30.142136f, 51.35534f, 32.04163f, 51.35534f, 33.213203f, 50.183765f);
            m145417xd4061a5a2.lineTo(56.21499f, 27.18198f);
            m145417xd4061a5a2.lineTo(53.03301f, 24.0f);
            m145417xd4061a5a2.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 1);
            canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
