package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_sku_load_more_arrow */
/* loaded from: classes16.dex */
public class C8137x47e85e9c extends l95.c {

    /* renamed from: width */
    private final int f23473x6be2dc6 = 24;

    /* renamed from: height */
    private final int f23472xb7389127 = 24;

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
        m145414xacbd08c9.setColor(-436207616);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(12.9531f, 16.5f);
        m145417xd4061a5a.lineTo(13.9985f, 15.4375f);
        m145417xd4061a5a.lineTo(10.6803f, 12.0f);
        m145417xd4061a5a.lineTo(13.9985f, 8.5625f);
        m145417xd4061a5a.lineTo(12.9531f, 7.5f);
        m145417xd4061a5a.lineTo(9.2644f, 11.3038f);
        m145417xd4061a5a.cubicTo(8.88826f, 11.6917f, 8.88826f, 12.3083f, 9.2644f, 12.6962f);
        m145417xd4061a5a.lineTo(12.9531f, 16.5f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-436207616);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(12.0f, 22.0f);
        m145417xd4061a5a2.cubicTo(6.47715f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f);
        m145417xd4061a5a2.cubicTo(2.0f, 6.47715f, 6.47715f, 2.0f, 12.0f, 2.0f);
        m145417xd4061a5a2.cubicTo(17.5228f, 2.0f, 22.0f, 6.47715f, 22.0f, 12.0f);
        m145417xd4061a5a2.cubicTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f);
        m145417xd4061a5a2.close();
        m145417xd4061a5a2.moveTo(12.0f, 20.8f);
        m145417xd4061a5a2.cubicTo(16.8601f, 20.8f, 20.8f, 16.8601f, 20.8f, 12.0f);
        m145417xd4061a5a2.cubicTo(20.8f, 7.13989f, 16.8601f, 3.2f, 12.0f, 3.2f);
        m145417xd4061a5a2.cubicTo(7.13989f, 3.2f, 3.2f, 7.13989f, 3.2f, 12.0f);
        m145417xd4061a5a2.cubicTo(3.2f, 16.8601f, 7.13989f, 20.8f, 12.0f, 20.8f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
