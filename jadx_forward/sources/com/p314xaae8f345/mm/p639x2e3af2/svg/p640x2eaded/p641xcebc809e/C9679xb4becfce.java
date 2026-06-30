package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.photo_accounts_filled */
/* loaded from: classes16.dex */
public class C9679xb4becfce extends l95.c {

    /* renamed from: width */
    private final int f26559x6be2dc6 = 24;

    /* renamed from: height */
    private final int f26558xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
        }
        if (i17 != 2) {
            return 0;
        }
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
        m145417xd4061a5a.moveTo(16.5103f, 3.35247f);
        m145417xd4061a5a.cubicTo(16.9764f, 2.54928f, 18.1525f, 2.5491f, 18.6185f, 3.35247f);
        m145417xd4061a5a.lineTo(22.9169f, 10.7639f);
        m145417xd4061a5a.cubicTo(23.3611f, 11.5298f, 23.361f, 12.4701f, 22.9169f, 13.236f);
        m145417xd4061a5a.lineTo(18.6185f, 20.6474f);
        m145417xd4061a5a.cubicTo(18.1525f, 21.4509f, 16.9764f, 21.4508f, 16.5103f, 20.6474f);
        m145417xd4061a5a.lineTo(11.9995f, 12.871f);
        m145417xd4061a5a.lineTo(7.48972f, 20.6474f);
        m145417xd4061a5a.cubicTo(7.02365f, 21.4508f, 5.84752f, 21.4509f, 5.38152f, 20.6474f);
        m145417xd4061a5a.lineTo(1.08312f, 13.236f);
        m145417xd4061a5a.cubicTo(0.638983f, 12.4701f, 0.638936f, 11.5298f, 1.08312f, 10.7639f);
        m145417xd4061a5a.lineTo(5.38152f, 3.35247f);
        m145417xd4061a5a.cubicTo(5.84751f, 2.54912f, 7.02361f, 2.54923f, 7.48972f, 3.35247f);
        m145417xd4061a5a.lineTo(11.9995f, 11.1279f);
        m145417xd4061a5a.lineTo(16.5103f, 3.35247f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
