package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_task_home_btn */
/* loaded from: classes16.dex */
public class C7336xff110ea0 extends l95.c {

    /* renamed from: width */
    private final int f21871x6be2dc6 = 20;

    /* renamed from: height */
    private final int f21870xb7389127 = 20;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 20;
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
        m145414xacbd08c9.setColor(-855638017);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(10.0f, 12.5f);
        m145417xd4061a5a.cubicTo(11.3807f, 12.5f, 12.5f, 11.3807f, 12.5f, 10.0f);
        m145417xd4061a5a.cubicTo(12.5f, 8.61929f, 11.3807f, 7.5f, 10.0f, 7.5f);
        m145417xd4061a5a.cubicTo(8.61929f, 7.5f, 7.5f, 8.61929f, 7.5f, 10.0f);
        m145417xd4061a5a.cubicTo(7.5f, 11.3807f, 8.61929f, 12.5f, 10.0f, 12.5f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-855638017);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(17.5f, 10.0f);
        m145417xd4061a5a2.cubicTo(17.5f, 14.1421f, 14.1421f, 17.5f, 10.0f, 17.5f);
        m145417xd4061a5a2.cubicTo(5.85786f, 17.5f, 2.5f, 14.1421f, 2.5f, 10.0f);
        m145417xd4061a5a2.cubicTo(2.5f, 5.85786f, 5.85786f, 2.5f, 10.0f, 2.5f);
        m145417xd4061a5a2.cubicTo(14.1421f, 2.5f, 17.5f, 5.85786f, 17.5f, 10.0f);
        m145417xd4061a5a2.close();
        m145417xd4061a5a2.moveTo(15.8333f, 10.0f);
        m145417xd4061a5a2.cubicTo(15.8333f, 13.2217f, 13.2217f, 15.8333f, 10.0f, 15.8333f);
        m145417xd4061a5a2.cubicTo(6.77834f, 15.8333f, 4.16667f, 13.2217f, 4.16667f, 10.0f);
        m145417xd4061a5a2.cubicTo(4.16667f, 6.77834f, 6.77834f, 4.16667f, 10.0f, 4.16667f);
        m145417xd4061a5a2.cubicTo(13.2217f, 4.16667f, 15.8333f, 6.77834f, 15.8333f, 10.0f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
