package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.webview_menu_enable_debug */
/* loaded from: classes16.dex */
public class C10229xc0c570b1 extends l95.c {

    /* renamed from: width */
    private final int f27661x6be2dc6 = 72;

    /* renamed from: height */
    private final int f27660xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        canvas.saveLayerAlpha(null, 230, 31);
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        m145414xacbd08c92.setColor(-16777216);
        m145414xacbd08c92.setStrokeWidth(3.6f);
        canvas.save();
        android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c92, looper);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(6.6f, 16.2f);
        m145417xd4061a5a.cubicTo(6.6f, 13.549034f, 8.749033f, 11.4f, 11.4f, 11.4f);
        m145417xd4061a5a.lineTo(60.600002f, 11.4f);
        m145417xd4061a5a.cubicTo(63.25097f, 11.4f, 65.4f, 13.549034f, 65.4f, 16.2f);
        m145417xd4061a5a.lineTo(65.4f, 55.8f);
        m145417xd4061a5a.cubicTo(65.4f, 58.450966f, 63.25097f, 60.6f, 60.600002f, 60.6f);
        m145417xd4061a5a.lineTo(11.4f, 60.6f);
        m145417xd4061a5a.cubicTo(8.749033f, 60.6f, 6.6f, 58.450966f, 6.6f, 55.8f);
        m145417xd4061a5a.lineTo(6.6f, 16.2f);
        m145417xd4061a5a.close();
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c93);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c94 = l95.c.m145414xacbd08c9(m145414xacbd08c92, looper);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(21.45f, 27.75f);
        m145417xd4061a5a2.lineTo(29.85f, 35.94179f);
        m145417xd4061a5a2.lineTo(21.45f, 44.55f);
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 1);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c94);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c95 = l95.c.m145414xacbd08c9(m145414xacbd08c92, looper);
        android.graphics.Path m145417xd4061a5a3 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a3.moveTo(34.65f, 43.35f);
        m145417xd4061a5a3.lineTo(51.45f, 43.35f);
        canvas.drawPath(m145417xd4061a5a3, m145414xacbd08c95);
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
