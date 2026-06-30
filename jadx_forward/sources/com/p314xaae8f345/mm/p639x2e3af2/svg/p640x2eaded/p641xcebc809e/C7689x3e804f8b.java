package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_selected_filled_dark */
/* loaded from: classes16.dex */
public class C7689x3e804f8b extends l95.c {

    /* renamed from: width */
    private final int f22577x6be2dc6 = 70;

    /* renamed from: height */
    private final int f22576xb7389127 = 70;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 70;
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
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-16268960);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(34.5679f, 0.0f);
            m145417xd4061a5a.cubicTo(54.33037f, 0.0f, 70.0f, 15.66963f, 70.0f, 35.4321f);
            m145417xd4061a5a.cubicTo(70.0f, 54.33037f, 54.33037f, 70.0f, 34.5679f, 70.0f);
            m145417xd4061a5a.cubicTo(15.66963f, 70.0f, 0.0f, 54.33037f, 0.0f, 35.4321f);
            m145417xd4061a5a.cubicTo(0.0f, 15.66963f, 15.66963f, 0.0f, 34.5679f, 0.0f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c92.setColor(-1);
            android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a2.moveTo(52.03301f, 23.0f);
            m145417xd4061a5a2.lineTo(30.091883f, 44.941124f);
            m145417xd4061a5a2.lineTo(20.18198f, 35.031223f);
            m145417xd4061a5a2.lineTo(17.0f, 38.213203f);
            m145417xd4061a5a2.lineTo(27.970562f, 49.183765f);
            m145417xd4061a5a2.cubicTo(29.142136f, 50.35534f, 31.04163f, 50.35534f, 32.213203f, 49.183765f);
            m145417xd4061a5a2.lineTo(55.21499f, 26.18198f);
            m145417xd4061a5a2.lineTo(52.03301f, 23.0f);
            m145417xd4061a5a2.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 1);
            canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
