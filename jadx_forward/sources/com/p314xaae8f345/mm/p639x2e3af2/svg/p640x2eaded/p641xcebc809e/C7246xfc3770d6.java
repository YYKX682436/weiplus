package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.album_location_icon_pressed */
/* loaded from: classes16.dex */
public class C7246xfc3770d6 extends l95.c {

    /* renamed from: width */
    private final int f21691x6be2dc6 = 72;

    /* renamed from: height */
    private final int f21690xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(33.785156f, 66.40234f);
            m145417xd4061a5a.cubicTo(33.785156f, 66.40234f, 12.0f, 48.054688f, 12.0f, 30.0f);
            m145417xd4061a5a.cubicTo(12.0f, 16.746094f, 22.746094f, 6.0f, 36.0f, 6.0f);
            m145417xd4061a5a.cubicTo(49.253906f, 6.0f, 60.0f, 16.746094f, 60.0f, 30.0f);
            m145417xd4061a5a.cubicTo(60.0f, 48.054688f, 38.214844f, 66.40234f, 38.214844f, 66.40234f);
            m145417xd4061a5a.cubicTo(37.0f, 67.51953f, 35.007812f, 67.50781f, 33.785156f, 66.40234f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(36.0f, 39.601562f);
            m145417xd4061a5a.cubicTo(41.30078f, 39.601562f, 45.601562f, 35.30078f, 45.601562f, 30.0f);
            m145417xd4061a5a.cubicTo(45.601562f, 24.699219f, 41.30078f, 20.398438f, 36.0f, 20.398438f);
            m145417xd4061a5a.cubicTo(30.699219f, 20.398438f, 26.398438f, 24.699219f, 26.398438f, 30.0f);
            m145417xd4061a5a.cubicTo(26.398438f, 35.30078f, 30.699219f, 39.601562f, 36.0f, 39.601562f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(36.0f, 39.601562f);
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
