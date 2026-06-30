package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_download_tip */
/* loaded from: classes16.dex */
public class C8288x1049cb91 extends l95.c {

    /* renamed from: width */
    private final int f23775x6be2dc6 = 166;

    /* renamed from: height */
    private final int f23774xb7389127 = 36;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 166;
        }
        if (i17 == 1) {
            return 36;
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
        m145414xacbd08c9.setColor(-11776948);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(0.0f, 4.0f);
        m145417xd4061a5a.cubicTo(0.0f, 1.7908609f, 1.7908609f, 0.0f, 4.0f, 0.0f);
        m145417xd4061a5a.lineTo(162.0f, 0.0f);
        m145417xd4061a5a.cubicTo(164.20914f, 0.0f, 166.0f, 1.7908609f, 166.0f, 4.0f);
        m145417xd4061a5a.lineTo(166.0f, 28.0f);
        m145417xd4061a5a.cubicTo(166.0f, 30.209139f, 164.20914f, 32.0f, 162.0f, 32.0f);
        m145417xd4061a5a.lineTo(4.0f, 32.0f);
        m145417xd4061a5a.cubicTo(1.7908609f, 32.0f, 0.0f, 30.209139f, 0.0f, 28.0f);
        m145417xd4061a5a.lineTo(0.0f, 4.0f);
        m145417xd4061a5a.close();
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-11776948);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(74.5149f, 31.9851f);
        m145417xd4061a5a2.lineTo(91.4853f, 31.9853f);
        m145417xd4061a5a2.lineTo(88.3713f, 31.9848f);
        m145417xd4061a5a2.cubicTo(87.8408f, 31.9847f, 87.3319f, 32.1955f, 86.9568f, 32.5706f);
        m145417xd4061a5a2.lineTo(84.0759f, 35.4515f);
        m145417xd4061a5a2.cubicTo(83.6854f, 35.842f, 83.0522f, 35.842f, 82.6617f, 35.4515f);
        m145417xd4061a5a2.lineTo(79.7808f, 32.5706f);
        m145417xd4061a5a2.cubicTo(79.4057f, 32.1955f, 78.8969f, 31.9848f, 78.3665f, 31.9848f);
        m145417xd4061a5a2.lineTo(74.5149f, 31.9851f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 1);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
