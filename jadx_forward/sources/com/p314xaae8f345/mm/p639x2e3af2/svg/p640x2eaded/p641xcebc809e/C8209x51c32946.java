package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.float_ball_icon_audio_play */
/* loaded from: classes16.dex */
public class C8209x51c32946 extends l95.c {

    /* renamed from: width */
    private final int f23617x6be2dc6 = 72;

    /* renamed from: height */
    private final int f23616xb7389127 = 72;

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
                l95.c.m145414xacbd08c9(m145415xacbd08c92, looper).setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-436207616);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(19.860521f, 9.206012f);
                m145417xd4061a5a.lineTo(61.052155f, 32.744087f);
                m145417xd4061a5a.cubicTo(62.850346f, 33.771626f, 63.475082f, 36.062332f, 62.447544f, 37.86052f);
                m145417xd4061a5a.cubicTo(62.115334f, 38.441887f, 61.633522f, 38.923702f, 61.052155f, 39.255913f);
                m145417xd4061a5a.lineTo(19.860521f, 62.793987f);
                m145417xd4061a5a.cubicTo(18.06233f, 63.821526f, 15.7716255f, 63.19679f, 14.744088f, 61.398598f);
                m145417xd4061a5a.cubicTo(14.420307f, 60.83198f, 14.25f, 60.190678f, 14.25f, 59.538074f);
                m145417xd4061a5a.lineTo(14.25f, 12.461924f);
                m145417xd4061a5a.cubicTo(14.25f, 10.390856f, 15.928932f, 8.711924f, 18.0f, 8.711924f);
                m145417xd4061a5a.cubicTo(18.652601f, 8.711924f, 19.293905f, 8.882231f, 19.860521f, 9.206012f);
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
