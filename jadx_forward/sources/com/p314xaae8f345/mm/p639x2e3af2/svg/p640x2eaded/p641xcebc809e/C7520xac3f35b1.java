package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_email */
/* loaded from: classes16.dex */
public class C7520xac3f35b1 extends l95.c {

    /* renamed from: width */
    private final int f22239x6be2dc6 = 144;

    /* renamed from: height */
    private final int f22238xb7389127 = 144;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 144;
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
                m145414xacbd08c9.setColor(-9276814);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(8.0f, 32.0f);
                m145417xd4061a5a.cubicTo(8.0f, 28.68629f, 10.686291f, 26.0f, 14.0f, 26.0f);
                m145417xd4061a5a.lineTo(130.0f, 26.0f);
                m145417xd4061a5a.cubicTo(133.3137f, 26.0f, 136.0f, 28.68629f, 136.0f, 32.0f);
                m145417xd4061a5a.lineTo(136.0f, 112.0f);
                m145417xd4061a5a.cubicTo(136.0f, 115.313705f, 133.3137f, 118.0f, 130.0f, 118.0f);
                m145417xd4061a5a.lineTo(14.0f, 118.0f);
                m145417xd4061a5a.cubicTo(10.686291f, 118.0f, 8.0f, 115.313705f, 8.0f, 112.0f);
                m145417xd4061a5a.lineTo(8.0f, 32.0f);
                m145417xd4061a5a.close();
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
                canvas.restore();
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c92.setColor(-1);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(71.88509f, 65.0309f);
                m145417xd4061a5a2.lineTo(27.494259f, 39.401836f);
                m145417xd4061a5a2.cubicTo(26.058262f, 38.57276f, 24.230272f, 39.068474f, 23.401754f, 40.50351f);
                m145417xd4061a5a2.lineTo(21.402084f, 43.967037f);
                m145417xd4061a5a2.cubicTo(20.576242f, 45.39744f, 21.06255f, 47.23549f, 22.494259f, 48.062088f);
                m145417xd4061a5a2.lineTo(70.312874f, 75.67018f);
                m145417xd4061a5a2.cubicTo(70.809265f, 75.95677f, 71.3525f, 76.08506f, 71.88509f, 76.07097f);
                m145417xd4061a5a2.cubicTo(72.417694f, 76.08506f, 72.96093f, 75.95677f, 73.45732f, 75.67018f);
                m145417xd4061a5a2.lineTo(121.27593f, 48.062088f);
                m145417xd4061a5a2.cubicTo(122.70764f, 47.23549f, 123.19395f, 45.39744f, 122.36811f, 43.967037f);
                m145417xd4061a5a2.lineTo(120.36844f, 40.50351f);
                m145417xd4061a5a2.cubicTo(119.53992f, 39.068474f, 117.71193f, 38.57276f, 116.27593f, 39.401836f);
                m145417xd4061a5a2.lineTo(71.88509f, 65.0309f);
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
