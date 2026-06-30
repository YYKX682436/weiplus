package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_filled_fav */
/* loaded from: classes16.dex */
public class C8073x92cfc1d8 extends l95.c {

    /* renamed from: width */
    private final int f23345x6be2dc6 = 16;

    /* renamed from: height */
    private final int f23344xb7389127 = 16;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
        m145414xacbd08c9.setColor(-40634);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(7.99995f, 12.2061f);
        m145417xd4061a5a.lineTo(4.61006f, 13.9882f);
        m145417xd4061a5a.cubicTo(4.08375f, 14.2649f, 3.45917f, 13.7956f, 3.55732f, 13.2234f);
        m145417xd4061a5a.lineTo(4.20473f, 9.44869f);
        m145417xd4061a5a.lineTo(1.46225f, 6.77543f);
        m145417xd4061a5a.cubicTo(1.03646f, 6.36039f, 1.28978f, 5.62135f, 1.86436f, 5.53786f);
        m145417xd4061a5a.lineTo(5.65438f, 4.98714f);
        m145417xd4061a5a.lineTo(7.34932f, 1.5528f);
        m145417xd4061a5a.cubicTo(7.61247f, 1.0196f, 8.39362f, 1.03215f, 8.65058f, 1.5528f);
        m145417xd4061a5a.lineTo(10.3455f, 4.98714f);
        m145417xd4061a5a.lineTo(14.1355f, 5.53786f);
        m145417xd4061a5a.cubicTo(14.724f, 5.62337f, 14.9534f, 6.37015f, 14.5376f, 6.77543f);
        m145417xd4061a5a.lineTo(11.7952f, 9.44869f);
        m145417xd4061a5a.lineTo(12.4426f, 13.2234f);
        m145417xd4061a5a.cubicTo(12.5431f, 13.8094f, 11.9038f, 14.2584f, 11.3898f, 13.9882f);
        m145417xd4061a5a.lineTo(7.99995f, 12.2061f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
