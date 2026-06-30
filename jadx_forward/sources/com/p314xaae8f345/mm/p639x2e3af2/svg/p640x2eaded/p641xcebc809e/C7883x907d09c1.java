package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.emoji_album_arrow_down */
/* loaded from: classes16.dex */
public class C7883x907d09c1 extends l95.c {

    /* renamed from: width */
    private final int f22965x6be2dc6 = 8;

    /* renamed from: height */
    private final int f22964xb7389127 = 5;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 8;
        }
        if (i17 == 1) {
            return 5;
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
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-16777216);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(4.36029f, 4.72568f);
            m145417xd4061a5a.cubicTo(4.16359f, 4.93009f, 3.83641f, 4.93009f, 3.63971f, 4.72568f);
            m145417xd4061a5a.lineTo(0.484598f, 1.44679f);
            m145417xd4061a5a.cubicTo(0.178937f, 1.12913f, 0.404056f, 0.600098f, 0.844886f, 0.600098f);
            m145417xd4061a5a.lineTo(7.15511f, 0.600098f);
            m145417xd4061a5a.cubicTo(7.59594f, 0.600098f, 7.82106f, 1.12913f, 7.5154f, 1.44679f);
            m145417xd4061a5a.lineTo(4.36029f, 4.72568f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
