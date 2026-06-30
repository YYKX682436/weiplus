package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_filled_awesome_status */
/* loaded from: classes16.dex */
public class C8371xc76cc485 extends l95.c {

    /* renamed from: width */
    private final int f23941x6be2dc6 = 60;

    /* renamed from: height */
    private final int f23940xb7389127 = 60;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 60;
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
                m145414xacbd08c9.setColor(-855638017);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(32.7151f, 13.0273f);
                m145417xd4061a5a.cubicTo(37.9356f, 7.80673f, 46.3097f, 7.66172f, 51.7054f, 12.5922f);
                m145417xd4061a5a.lineTo(52.1605f, 13.0273f);
                m145417xd4061a5a.cubicTo(57.3801f, 18.2571f, 57.517f, 26.6234f, 52.586f, 32.0089f);
                m145417xd4061a5a.lineTo(52.1509f, 32.4631f);
                m145417xd4061a5a.lineTo(30.5893f, 53.9823f);
                m145417xd4061a5a.cubicTo(30.264f, 54.307f, 29.7372f, 54.307f, 29.4119f, 53.9823f);
                m145417xd4061a5a.lineTo(7.85028f, 32.4631f);
                m145417xd4061a5a.cubicTo(2.62973f, 27.2529f, 2.47661f, 18.8872f, 7.39695f, 13.4919f);
                m145417xd4061a5a.lineTo(7.8407f, 13.0273f);
                m145417xd4061a5a.cubicTo(13.2104f, 7.65757f, 21.9164f, 7.65757f, 27.2861f, 13.0273f);
                m145417xd4061a5a.lineTo(29.9999f, 15.74f);
                m145417xd4061a5a.lineTo(32.7151f, 13.0273f);
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
