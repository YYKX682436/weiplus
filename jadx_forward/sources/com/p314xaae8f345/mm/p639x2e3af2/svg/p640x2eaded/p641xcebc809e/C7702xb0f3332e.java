package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_unselect_regular */
/* loaded from: classes16.dex */
public class C7702xb0f3332e extends l95.c {

    /* renamed from: width */
    private final int f22603x6be2dc6 = 26;

    /* renamed from: height */
    private final int f22602xb7389127 = 26;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 26;
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
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c92, looper);
            m145414xacbd08c9.setColor(-16777216);
            m145414xacbd08c9.setStrokeWidth(1.2f);
            m145414xacbd08c9.setColor(-16777216);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(1.6f, 13.0f);
            m145417xd4061a5a.cubicTo(1.6f, 6.7039537f, 6.7039537f, 1.6f, 13.0f, 1.6f);
            m145417xd4061a5a.lineTo(13.0f, 1.6f);
            m145417xd4061a5a.cubicTo(19.296047f, 1.6f, 24.4f, 6.7039537f, 24.4f, 13.0f);
            m145417xd4061a5a.lineTo(24.4f, 13.0f);
            m145417xd4061a5a.cubicTo(24.4f, 19.296047f, 19.296047f, 24.4f, 13.0f, 24.4f);
            m145417xd4061a5a.lineTo(13.0f, 24.4f);
            m145417xd4061a5a.cubicTo(6.7039537f, 24.4f, 1.6f, 19.296047f, 1.6f, 13.0f);
            m145417xd4061a5a.lineTo(1.6f, 13.0f);
            m145417xd4061a5a.close();
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
