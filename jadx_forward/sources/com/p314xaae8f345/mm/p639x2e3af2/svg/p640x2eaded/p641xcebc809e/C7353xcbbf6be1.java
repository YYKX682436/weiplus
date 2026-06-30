package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_weishi_video_btn_close */
/* loaded from: classes16.dex */
public class C7353xcbbf6be1 extends l95.c {

    /* renamed from: width */
    private final int f21905x6be2dc6 = 96;

    /* renamed from: height */
    private final int f21904xb7389127 = 96;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 96;
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
        l95.c.m145414xacbd08c9(m145415xacbd08c92, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(Integer.MIN_VALUE);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(0.0f, 9.6f);
        m145417xd4061a5a.cubicTo(0.0f, 4.298066f, 4.298066f, 0.0f, 9.6f, 0.0f);
        m145417xd4061a5a.lineTo(86.4f, 0.0f);
        m145417xd4061a5a.cubicTo(91.701935f, 0.0f, 96.0f, 4.298066f, 96.0f, 9.6f);
        m145417xd4061a5a.lineTo(96.0f, 86.4f);
        m145417xd4061a5a.cubicTo(96.0f, 91.701935f, 91.701935f, 96.0f, 86.4f, 96.0f);
        m145417xd4061a5a.lineTo(9.6f, 96.0f);
        m145417xd4061a5a.cubicTo(4.298066f, 96.0f, 0.0f, 91.701935f, 0.0f, 86.4f);
        m145417xd4061a5a.lineTo(0.0f, 9.6f);
        m145417xd4061a5a.close();
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-1);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(48.0f, 45.001343f);
        m145417xd4061a5a2.lineTo(30.427227f, 27.428572f);
        m145417xd4061a5a2.lineTo(27.428572f, 30.427227f);
        m145417xd4061a5a2.lineTo(45.001343f, 48.0f);
        m145417xd4061a5a2.lineTo(27.428572f, 65.57277f);
        m145417xd4061a5a2.lineTo(30.427227f, 68.57143f);
        m145417xd4061a5a2.lineTo(48.0f, 50.998657f);
        m145417xd4061a5a2.lineTo(65.57277f, 68.57143f);
        m145417xd4061a5a2.lineTo(68.57143f, 65.57277f);
        m145417xd4061a5a2.lineTo(50.998657f, 48.0f);
        m145417xd4061a5a2.lineTo(68.57143f, 30.427227f);
        m145417xd4061a5a2.lineTo(65.57277f, 27.428572f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 1);
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
