package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_icon */
/* loaded from: classes16.dex */
public class C8082x2de5f313 extends l95.c {

    /* renamed from: width */
    private final int f23363x6be2dc6 = 24;

    /* renamed from: height */
    private final int f23362xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
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
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c92, looper);
            m145414xacbd08c9.setStrokeWidth(1.0f);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(0.0f, 0.0f);
            m145417xd4061a5a.lineTo(24.0f, 0.0f);
            m145417xd4061a5a.lineTo(24.0f, 24.0f);
            m145417xd4061a5a.lineTo(0.0f, 24.0f);
            m145417xd4061a5a.lineTo(0.0f, 0.0f);
            m145417xd4061a5a.close();
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
            m145414xacbd08c92.setColor(-40634);
            m145414xacbd08c92.setStrokeWidth(1.5f);
            android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a2.moveTo(12.0f, 2.75f);
            m145417xd4061a5a2.cubicTo(17.108635f, 2.75f, 21.25f, 6.891366f, 21.25f, 12.0f);
            m145417xd4061a5a2.cubicTo(21.25f, 17.108635f, 17.108635f, 21.25f, 12.0f, 21.25f);
            m145417xd4061a5a2.cubicTo(6.891366f, 21.25f, 2.75f, 17.108635f, 2.75f, 12.0f);
            m145417xd4061a5a2.cubicTo(2.75f, 6.891366f, 6.891366f, 2.75f, 12.0f, 2.75f);
            m145417xd4061a5a2.close();
            canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
            canvas.restore();
            canvas.save();
            android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c93.setColor(-40634);
            android.graphics.Path m145417xd4061a5a3 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a3.moveTo(12.0f, 6.5f);
            m145417xd4061a5a3.cubicTo(15.037566f, 6.5f, 17.5f, 8.962434f, 17.5f, 12.0f);
            m145417xd4061a5a3.cubicTo(17.5f, 15.037566f, 15.037566f, 17.5f, 12.0f, 17.5f);
            m145417xd4061a5a3.cubicTo(8.962434f, 17.5f, 6.5f, 15.037566f, 6.5f, 12.0f);
            m145417xd4061a5a3.cubicTo(6.5f, 8.962434f, 8.962434f, 6.5f, 12.0f, 6.5f);
            m145417xd4061a5a3.close();
            canvas.drawPath(m145417xd4061a5a3, m145414xacbd08c93);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
