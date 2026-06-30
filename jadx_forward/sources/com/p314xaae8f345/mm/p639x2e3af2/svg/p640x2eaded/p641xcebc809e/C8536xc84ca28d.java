package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_copy */
/* loaded from: classes16.dex */
public class C8536xc84ca28d extends l95.c {

    /* renamed from: width */
    private final int f24271x6be2dc6 = 72;

    /* renamed from: height */
    private final int f24270xb7389127 = 72;

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
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-16777216);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(40.8f, 9.896984f);
            m145417xd4061a5a.lineTo(40.8f, 24.0f);
            m145417xd4061a5a.cubicTo(40.8f, 24.662743f, 41.337257f, 25.2f, 42.0f, 25.2f);
            m145417xd4061a5a.lineTo(56.10836f, 25.2f);
            m145417xd4061a5a.lineTo(40.8f, 9.896984f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(17.987425f, 6.0f);
            m145417xd4061a5a.lineTo(41.993713f, 6.0f);
            m145417xd4061a5a.lineTo(60.0f, 24.0f);
            m145417xd4061a5a.lineTo(60.0f, 63.004063f);
            m145417xd4061a5a.cubicTo(60.0f, 64.66269f, 58.662483f, 66.0f, 57.012573f, 66.0f);
            m145417xd4061a5a.lineTo(17.987425f, 66.0f);
            m145417xd4061a5a.cubicTo(16.34676f, 66.0f, 15.0f, 64.658676f, 15.0f, 63.004063f);
            m145417xd4061a5a.lineTo(15.0f, 8.995937f);
            m145417xd4061a5a.cubicTo(15.0f, 7.33731f, 16.337517f, 6.0f, 17.987425f, 6.0f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
