package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_commment_status */
/* loaded from: classes16.dex */
public class C8365xa11dc3a1 extends l95.c {

    /* renamed from: width */
    private final int f23929x6be2dc6 = 60;

    /* renamed from: height */
    private final int f23928xb7389127 = 60;

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
                m145417xd4061a5a.moveTo(7.5f, 11.4502f);
                m145417xd4061a5a.cubicTo(7.5f, 10.9324f, 7.91973f, 10.5127f, 8.4375f, 10.5127f);
                m145417xd4061a5a.lineTo(51.5625f, 10.5127f);
                m145417xd4061a5a.cubicTo(52.0803f, 10.5127f, 52.5f, 10.9324f, 52.5f, 11.4502f);
                m145417xd4061a5a.lineTo(52.5f, 42.0752f);
                m145417xd4061a5a.cubicTo(52.5f, 42.593f, 52.0803f, 43.0127f, 51.5625f, 43.0127f);
                m145417xd4061a5a.lineTo(27.5f, 43.0127f);
                m145417xd4061a5a.lineTo(18.5669f, 51.9458f);
                m145417xd4061a5a.cubicTo(18.1732f, 52.3395f, 17.5f, 52.0606f, 17.5f, 51.5038f);
                m145417xd4061a5a.lineTo(17.5f, 43.0127f);
                m145417xd4061a5a.lineTo(8.4375f, 43.0127f);
                m145417xd4061a5a.cubicTo(7.91973f, 43.0127f, 7.5f, 42.593f, 7.5f, 42.0752f);
                m145417xd4061a5a.lineTo(7.5f, 11.4502f);
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
