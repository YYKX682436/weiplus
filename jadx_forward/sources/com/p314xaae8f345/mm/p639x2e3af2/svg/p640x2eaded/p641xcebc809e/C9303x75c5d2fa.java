package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.kinda_ret_dot_with_frame */
/* loaded from: classes16.dex */
public class C9303x75c5d2fa extends l95.c {

    /* renamed from: width */
    private final int f25805x6be2dc6 = 11;

    /* renamed from: height */
    private final int f25804xb7389127 = 11;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 11;
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
            m145414xacbd08c9.setColor(-372399);
            m145414xacbd08c9.setColor(-372399);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(1.5f, 5.5f);
            m145417xd4061a5a.cubicTo(1.5f, 3.290861f, 3.290861f, 1.5f, 5.5f, 1.5f);
            m145417xd4061a5a.lineTo(5.5f, 1.5f);
            m145417xd4061a5a.cubicTo(7.709139f, 1.5f, 9.5f, 3.290861f, 9.5f, 5.5f);
            m145417xd4061a5a.lineTo(9.5f, 5.5f);
            m145417xd4061a5a.cubicTo(9.5f, 7.709139f, 7.709139f, 9.5f, 5.5f, 9.5f);
            m145417xd4061a5a.lineTo(5.5f, 9.5f);
            m145417xd4061a5a.cubicTo(3.290861f, 9.5f, 1.5f, 7.709139f, 1.5f, 5.5f);
            m145417xd4061a5a.lineTo(1.5f, 5.5f);
            m145417xd4061a5a.close();
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c92, looper);
            m145414xacbd08c92.setColor(-1275068417);
            m145414xacbd08c92.setStrokeWidth(1.5f);
            m145414xacbd08c92.setColor(-1275068417);
            android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a2.moveTo(0.75f, 5.5f);
            m145417xd4061a5a2.cubicTo(0.75f, 2.8766472f, 2.8766472f, 0.75f, 5.5f, 0.75f);
            m145417xd4061a5a2.lineTo(5.5f, 0.75f);
            m145417xd4061a5a2.cubicTo(8.123353f, 0.75f, 10.25f, 2.8766472f, 10.25f, 5.5f);
            m145417xd4061a5a2.lineTo(10.25f, 5.5f);
            m145417xd4061a5a2.cubicTo(10.25f, 8.123353f, 8.123353f, 10.25f, 5.5f, 10.25f);
            m145417xd4061a5a2.lineTo(5.5f, 10.25f);
            m145417xd4061a5a2.cubicTo(2.8766472f, 10.25f, 0.75f, 8.123353f, 0.75f, 5.5f);
            m145417xd4061a5a2.lineTo(0.75f, 5.5f);
            m145417xd4061a5a2.close();
            canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
