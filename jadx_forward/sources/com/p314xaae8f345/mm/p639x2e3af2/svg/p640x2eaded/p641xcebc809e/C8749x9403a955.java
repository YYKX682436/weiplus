package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_specialplay */
/* loaded from: classes16.dex */
public class C8749x9403a955 extends l95.c {

    /* renamed from: width */
    private final int f24697x6be2dc6 = 24;

    /* renamed from: height */
    private final int f24696xb7389127 = 24;

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
                l95.c.m145414xacbd08c9(m145415xacbd08c92, looper).setStrokeWidth(1.0f);
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-16777216);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(8.496139f, 4.8549366f);
                m145417xd4061a5a.lineTo(19.480574f, 11.131757f);
                m145417xd4061a5a.cubicTo(19.960093f, 11.4057665f, 20.126688f, 12.016622f, 19.852678f, 12.496139f);
                m145417xd4061a5a.cubicTo(19.76409f, 12.65117f, 19.635605f, 12.779654f, 19.480574f, 12.868243f);
                m145417xd4061a5a.lineTo(8.496139f, 19.145063f);
                m145417xd4061a5a.cubicTo(8.016622f, 19.419073f, 7.405767f, 19.252478f, 7.131757f, 18.772959f);
                m145417xd4061a5a.cubicTo(7.0454154f, 18.621862f, 7.0f, 18.450848f, 7.0f, 18.276821f);
                m145417xd4061a5a.lineTo(7.0f, 5.72318f);
                m145417xd4061a5a.cubicTo(7.0f, 5.170895f, 7.4477153f, 4.72318f, 8.0f, 4.72318f);
                m145417xd4061a5a.cubicTo(8.1740265f, 4.72318f, 8.345041f, 4.768595f, 8.496139f, 4.8549366f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
