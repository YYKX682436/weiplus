package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.arrow_left_circle_filled */
/* loaded from: classes16.dex */
public class C7391x155f196f extends l95.c {

    /* renamed from: width */
    private final int f21981x6be2dc6 = 24;

    /* renamed from: height */
    private final int f21980xb7389127 = 24;

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
                m145417xd4061a5a.moveTo(12.0f, 22.0f);
                m145417xd4061a5a.cubicTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f);
                m145417xd4061a5a.cubicTo(22.0f, 6.47715f, 17.5228f, 2.0f, 12.0f, 2.0f);
                m145417xd4061a5a.cubicTo(6.47715f, 2.0f, 2.0f, 6.47715f, 2.0f, 12.0f);
                m145417xd4061a5a.cubicTo(2.0f, 17.5228f, 6.47715f, 22.0f, 12.0f, 22.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(12.9246f, 7.32495f);
                m145417xd4061a5a.lineTo(9.03639f, 11.3179f);
                m145417xd4061a5a.cubicTo(8.6535f, 11.7112f, 8.6547f, 12.3381f, 9.03902f, 12.7299f);
                m145417xd4061a5a.lineTo(12.9135f, 16.6792f);
                m145417xd4061a5a.lineTo(14.3412f, 15.2786f);
                m145417xd4061a5a.lineTo(11.1443f, 12.02f);
                m145417xd4061a5a.lineTo(14.3575f, 8.72023f);
                m145417xd4061a5a.lineTo(12.9246f, 7.32495f);
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
