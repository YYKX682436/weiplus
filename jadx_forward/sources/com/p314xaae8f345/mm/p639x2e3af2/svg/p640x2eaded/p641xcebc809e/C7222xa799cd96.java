package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ad_living_description_icon */
/* loaded from: classes16.dex */
public class C7222xa799cd96 extends l95.c {

    /* renamed from: width */
    private final int f21643x6be2dc6 = 72;

    /* renamed from: height */
    private final int f21642xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                m145414xacbd08c9.setColor(-40634);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(36.0f, 71.0f);
                m145417xd4061a5a.cubicTo(55.33f, 71.0f, 71.0f, 55.33f, 71.0f, 36.0f);
                m145417xd4061a5a.cubicTo(71.0f, 16.67f, 55.33f, 1.0f, 36.0f, 1.0f);
                m145417xd4061a5a.cubicTo(16.67f, 1.0f, 1.0f, 16.67f, 1.0f, 36.0f);
                m145417xd4061a5a.cubicTo(1.0f, 55.33f, 16.67f, 71.0f, 36.0f, 71.0f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
                canvas.restore();
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c92.setColor(-1);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(21.4166f, 27.4931f);
                m145417xd4061a5a2.lineTo(27.493f, 27.4931f);
                m145417xd4061a5a2.lineTo(27.493f, 44.507f);
                m145417xd4061a5a2.lineTo(21.4166f, 44.507f);
                m145417xd4061a5a2.cubicTo(20.0743f, 44.507f, 18.9861f, 43.4188f, 18.9861f, 42.0764f);
                m145417xd4061a5a2.lineTo(18.9861f, 29.9237f);
                m145417xd4061a5a2.cubicTo(18.9861f, 28.5813f, 20.0743f, 27.4931f, 21.4166f, 27.4931f);
                m145417xd4061a5a2.close();
                m145417xd4061a5a2.moveTo(29.9236f, 27.4931f);
                m145417xd4061a5a2.lineTo(47.6657f, 19.731f);
                m145417xd4061a5a2.cubicTo(48.2806f, 19.462f, 48.9971f, 19.7424f, 49.2661f, 20.3572f);
                m145417xd4061a5a2.cubicTo(49.3333f, 20.5108f, 49.368f, 20.6767f, 49.368f, 20.8444f);
                m145417xd4061a5a2.lineTo(49.368f, 51.1557f);
                m145417xd4061a5a2.cubicTo(49.368f, 51.827f, 48.824f, 52.371f, 48.1528f, 52.371f);
                m145417xd4061a5a2.cubicTo(47.9851f, 52.371f, 47.8193f, 52.3363f, 47.6657f, 52.2691f);
                m145417xd4061a5a2.lineTo(29.9236f, 44.507f);
                m145417xd4061a5a2.lineTo(29.9236f, 27.4931f);
                m145417xd4061a5a2.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
                canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
