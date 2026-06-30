package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.magnifying_glass_regular */
/* loaded from: classes16.dex */
public class C9404x8f81c2bb extends l95.c {

    /* renamed from: width */
    private final int f26009x6be2dc6 = 24;

    /* renamed from: height */
    private final int f26008xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 24;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                m145417xd4061a5a.moveTo(15.4529f, 16.4014f);
                m145417xd4061a5a.cubicTo(14.2428f, 17.4001f, 12.6915f, 18.0f, 11.0f, 18.0f);
                m145417xd4061a5a.cubicTo(7.134f, 18.0f, 4.0f, 14.866f, 4.0f, 11.0f);
                m145417xd4061a5a.cubicTo(4.0f, 7.134f, 7.134f, 4.0f, 11.0f, 4.0f);
                m145417xd4061a5a.cubicTo(14.866f, 4.0f, 18.0f, 7.134f, 18.0f, 11.0f);
                m145417xd4061a5a.cubicTo(18.0f, 12.7425f, 17.3633f, 14.3363f, 16.3099f, 15.5614f);
                m145417xd4061a5a.lineTo(20.4243f, 19.6757f);
                m145417xd4061a5a.lineTo(19.5757f, 20.5243f);
                m145417xd4061a5a.lineTo(15.4529f, 16.4014f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(16.8f, 11.0f);
                m145417xd4061a5a.cubicTo(16.8f, 14.2033f, 14.2033f, 16.8f, 11.0f, 16.8f);
                m145417xd4061a5a.cubicTo(7.79674f, 16.8f, 5.2f, 14.2033f, 5.2f, 11.0f);
                m145417xd4061a5a.cubicTo(5.2f, 7.79676f, 7.79674f, 5.20001f, 11.0f, 5.20001f);
                m145417xd4061a5a.cubicTo(14.2033f, 5.20001f, 16.8f, 7.79676f, 16.8f, 11.0f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
