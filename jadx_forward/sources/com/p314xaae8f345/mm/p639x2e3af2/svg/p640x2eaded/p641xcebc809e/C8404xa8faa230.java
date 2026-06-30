package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_openmsg_filled */
/* loaded from: classes16.dex */
public class C8404xa8faa230 extends l95.c {

    /* renamed from: width */
    private final int f24007x6be2dc6 = 24;

    /* renamed from: height */
    private final int f24006xb7389127 = 24;

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
                m145414xacbd08c9.setColor(-16777216);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(4.92893f, 4.92892f);
                m145417xd4061a5a.cubicTo(8.83418f, 1.02367f, 15.1658f, 1.02367f, 19.0711f, 4.92892f);
                m145417xd4061a5a.cubicTo(22.9763f, 8.83416f, 22.9763f, 15.1658f, 19.0711f, 19.0711f);
                m145417xd4061a5a.cubicTo(15.1658f, 22.9763f, 8.83417f, 22.9763f, 4.92893f, 19.0711f);
                m145417xd4061a5a.cubicTo(1.02369f, 15.1658f, 1.02369f, 8.83416f, 4.92893f, 4.92892f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(13.9854f, 14.7658f);
                m145417xd4061a5a.lineTo(14.0332f, 11.3126f);
                m145417xd4061a5a.lineTo(8.88947f, 16.4564f);
                m145417xd4061a5a.lineTo(7.54597f, 15.1129f);
                m145417xd4061a5a.lineTo(12.6931f, 9.9657f);
                m145417xd4061a5a.lineTo(9.18628f, 9.96571f);
                m145417xd4061a5a.lineTo(9.18628f, 8.06581f);
                m145417xd4061a5a.lineTo(14.5363f, 8.06581f);
                m145417xd4061a5a.cubicTo(15.2819f, 8.06581f, 15.8863f, 8.67023f, 15.8863f, 9.41581f);
                m145417xd4061a5a.lineTo(15.8863f, 14.7658f);
                m145417xd4061a5a.lineTo(13.9854f, 14.7658f);
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
