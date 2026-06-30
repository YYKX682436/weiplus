package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.note_filled */
/* loaded from: classes16.dex */
public class C9565x666e864f extends l95.c {

    /* renamed from: width */
    private final int f26331x6be2dc6 = 24;

    /* renamed from: height */
    private final int f26330xb7389127 = 24;

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
        m145417xd4061a5a.moveTo(18.5f, 18.9463f);
        m145417xd4061a5a.cubicTo(18.3402f, 18.9874f, 18.1726f, 19.0093f, 18.0f, 19.0093f);
        m145417xd4061a5a.lineTo(5.5f, 19.0093f);
        m145417xd4061a5a.lineTo(5.5f, 20.5f);
        m145417xd4061a5a.lineTo(18.0f, 20.5f);
        m145417xd4061a5a.cubicTo(18.2761f, 20.5f, 18.5f, 20.2761f, 18.5f, 20.0f);
        m145417xd4061a5a.lineTo(18.5f, 18.9463f);
        m145417xd4061a5a.close();
        m145417xd4061a5a.moveTo(4.0f, 2.0f);
        m145417xd4061a5a.lineTo(18.0f, 2.0f);
        m145417xd4061a5a.cubicTo(19.1046f, 2.0f, 20.0f, 2.89543f, 20.0f, 4.0f);
        m145417xd4061a5a.lineTo(20.0f, 20.0f);
        m145417xd4061a5a.cubicTo(20.0f, 21.1046f, 19.1046f, 22.0f, 18.0f, 22.0f);
        m145417xd4061a5a.lineTo(4.0f, 22.0f);
        m145417xd4061a5a.lineTo(4.0f, 2.0f);
        m145417xd4061a5a.close();
        m145417xd4061a5a.moveTo(7.0f, 3.5f);
        m145417xd4061a5a.lineTo(7.0f, 17.5f);
        m145417xd4061a5a.lineTo(8.5f, 17.5f);
        m145417xd4061a5a.lineTo(8.5f, 3.5f);
        m145417xd4061a5a.lineTo(7.0f, 3.5f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
