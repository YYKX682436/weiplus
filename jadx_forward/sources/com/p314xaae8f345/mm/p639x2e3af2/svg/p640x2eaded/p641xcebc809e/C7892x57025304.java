package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.emoji_pop_bg_smiley */
/* loaded from: classes16.dex */
public class C7892x57025304 extends l95.c {

    /* renamed from: width */
    private final int f22983x6be2dc6 = 192;

    /* renamed from: height */
    private final int f22982xb7389127 = 405;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 192;
        }
        if (i17 == 1) {
            return 405;
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
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c92, looper);
        m145414xacbd08c9.setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        m145414xacbd08c92.setColor(-1);
        m145414xacbd08c93.setColor(838860800);
        m145414xacbd08c93.setStrokeWidth(1.5f);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(155.25f, 272.53323f);
        m145417xd4061a5a.cubicTo(155.25f, 262.90875f, 158.09885f, 253.49963f, 163.43755f, 245.4916f);
        m145417xd4061a5a.lineTo(183.31438f, 215.67636f);
        m145417xd4061a5a.cubicTo(188.4888f, 207.91472f, 191.25f, 198.7951f, 191.25f, 189.46677f);
        m145417xd4061a5a.lineTo(191.25f, 48.0f);
        m145417xd4061a5a.cubicTo(191.25f, 21.904545f, 170.09546f, 0.75f, 144.0f, 0.75f);
        m145417xd4061a5a.lineTo(48.0f, 0.75f);
        m145417xd4061a5a.cubicTo(21.904545f, 0.75f, 0.75f, 21.904545f, 0.75f, 48.0f);
        m145417xd4061a5a.lineTo(0.75f, 189.46677f);
        m145417xd4061a5a.cubicTo(0.75f, 198.7951f, 3.5111969f, 207.91472f, 8.685623f, 215.67636f);
        m145417xd4061a5a.lineTo(28.562452f, 245.4916f);
        m145417xd4061a5a.cubicTo(33.901146f, 253.49963f, 36.75f, 262.90875f, 36.75f, 272.53323f);
        m145417xd4061a5a.lineTo(36.75f, 381.0f);
        m145417xd4061a5a.cubicTo(36.75f, 393.8406f, 47.159378f, 404.25f, 60.0f, 404.25f);
        m145417xd4061a5a.lineTo(132.0f, 404.25f);
        m145417xd4061a5a.cubicTo(144.84062f, 404.25f, 155.25f, 393.8406f, 155.25f, 381.0f);
        m145417xd4061a5a.lineTo(155.25f, 272.53323f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c93);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
