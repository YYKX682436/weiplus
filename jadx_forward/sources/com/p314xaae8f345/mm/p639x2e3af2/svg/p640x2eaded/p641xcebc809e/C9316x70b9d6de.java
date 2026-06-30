package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.line_semibold */
/* loaded from: classes16.dex */
public class C9316x70b9d6de extends l95.c {

    /* renamed from: width */
    private final int f25831x6be2dc6 = 12;

    /* renamed from: height */
    private final int f25830xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 12;
        }
        if (i17 == 1) {
            return 24;
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
            m145414xacbd08c9.setColor(-855638017);
            m145414xacbd08c9.setColor(-855638017);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(4.7998f, 5.2f);
            m145417xd4061a5a.cubicTo(4.7998f, 4.537258f, 5.337058f, 4.0f, 5.9997997f, 4.0f);
            m145417xd4061a5a.lineTo(5.9997997f, 4.0f);
            m145417xd4061a5a.cubicTo(6.6625414f, 4.0f, 7.1998f, 4.537258f, 7.1998f, 5.2f);
            m145417xd4061a5a.lineTo(7.1998f, 18.8f);
            m145417xd4061a5a.cubicTo(7.1998f, 19.462742f, 6.6625414f, 20.0f, 5.9997997f, 20.0f);
            m145417xd4061a5a.lineTo(5.9997997f, 20.0f);
            m145417xd4061a5a.cubicTo(5.337058f, 20.0f, 4.7998f, 19.462742f, 4.7998f, 18.8f);
            m145417xd4061a5a.lineTo(4.7998f, 5.2f);
            m145417xd4061a5a.close();
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
