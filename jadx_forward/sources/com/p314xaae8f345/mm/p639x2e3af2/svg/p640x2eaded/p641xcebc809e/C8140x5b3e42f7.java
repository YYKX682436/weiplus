package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_task_reward_left */
/* loaded from: classes16.dex */
public class C8140x5b3e42f7 extends l95.c {

    /* renamed from: width */
    private final int f23479x6be2dc6 = 80;

    /* renamed from: height */
    private final int f23478xb7389127 = 48;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 80;
        }
        if (i17 == 1) {
            return 48;
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
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c92, looper);
        m145414xacbd08c9.setColor(-26527);
        m145414xacbd08c9.setStrokeWidth(2.0f);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(70.0f, 39.0f);
        m145417xd4061a5a.cubicTo(72.2091f, 39.0f, 74.0f, 37.2091f, 74.0f, 35.0f);
        m145417xd4061a5a.cubicTo(74.0f, 32.7909f, 72.2091f, 31.0f, 70.0f, 31.0f);
        m145417xd4061a5a.cubicTo(67.7909f, 31.0f, 66.0f, 32.7909f, 66.0f, 35.0f);
        m145417xd4061a5a.cubicTo(66.0f, 37.2091f, 67.7909f, 39.0f, 70.0f, 39.0f);
        m145417xd4061a5a.close();
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-14080);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(74.3554f, 4.0f);
        m145417xd4061a5a2.lineTo(80.0f, 11.0f);
        m145417xd4061a5a2.lineTo(70.0f, 8.03291f);
        m145417xd4061a5a2.lineTo(74.3554f, 4.0f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145415xacbd08c92, looper);
        m145414xacbd08c93.setColor(-299695);
        m145414xacbd08c93.setStrokeWidth(2.0f);
        m145414xacbd08c93.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        android.graphics.Path m145417xd4061a5a3 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a3.moveTo(20.0f, 17.79f);
        m145417xd4061a5a3.cubicTo(29.2925f, 9.62301f, 33.0981f, 8.82343f, 31.417f, 15.3913f);
        m145417xd4061a5a3.cubicTo(29.7359f, 21.9592f, 32.5969f, 22.7587f, 40.0f, 17.79f);
        canvas.drawPath(m145417xd4061a5a3, m145414xacbd08c93);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
