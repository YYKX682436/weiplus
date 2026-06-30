package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_edit_photo_eraser */
/* loaded from: classes16.dex */
public class C8559xbca7f536 extends l95.c {

    /* renamed from: width */
    private final int f24317x6be2dc6 = 24;

    /* renamed from: height */
    private final int f24316xb7389127 = 24;

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
                m145414xacbd08c9.setColor(-436207616);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(7.2569f, 12.2506f);
                m145417xd4061a5a.lineTo(14.0449f, 5.46262f);
                m145417xd4061a5a.lineTo(19.7017f, 11.1195f);
                m145417xd4061a5a.lineTo(12.9138f, 17.9074f);
                m145417xd4061a5a.lineTo(7.2569f, 12.2506f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(6.12553f, 11.1192f);
                m145417xd4061a5a.lineTo(13.4792f, 3.76556f);
                m145417xd4061a5a.cubicTo(13.7916f, 3.45315f, 14.2981f, 3.45315f, 14.6105f, 3.76556f);
                m145417xd4061a5a.lineTo(21.3988f, 10.5538f);
                m145417xd4061a5a.cubicTo(21.7112f, 10.8662f, 21.7112f, 11.3727f, 21.3988f, 11.6852f);
                m145417xd4061a5a.lineTo(12.2841f, 20.7998f);
                m145417xd4061a5a.lineTo(12.284f, 20.7998f);
                m145417xd4061a5a.lineTo(6.75476f, 20.7998f);
                m145417xd4061a5a.lineTo(6.75463f, 20.7998f);
                m145417xd4061a5a.lineTo(2.16547f, 16.2106f);
                m145417xd4061a5a.cubicTo(1.85305f, 15.8982f, 1.85305f, 15.3917f, 2.16547f, 15.0793f);
                m145417xd4061a5a.lineTo(2.29732f, 14.9474f);
                m145417xd4061a5a.cubicTo(2.30049f, 14.9442f, 2.30367f, 14.9409f, 2.30689f, 14.9377f);
                m145417xd4061a5a.lineTo(6.12547f, 11.1191f);
                m145417xd4061a5a.lineTo(6.12553f, 11.1192f);
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
