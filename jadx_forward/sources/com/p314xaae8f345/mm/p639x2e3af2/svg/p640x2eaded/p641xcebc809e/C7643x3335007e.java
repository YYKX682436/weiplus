package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chatting_avatar_story_hint */
/* loaded from: classes16.dex */
public class C7643x3335007e extends l95.c {

    /* renamed from: width */
    private final int f22485x6be2dc6 = 24;

    /* renamed from: height */
    private final int f22484xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
        }
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
            m145414xacbd08c9.setColor(-15819547);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(19.426306f, 8.069898f);
            m145417xd4061a5a.cubicTo(18.960836f, 7.191491f, 19.295588f, 6.1020646f, 20.173994f, 5.6365957f);
            m145417xd4061a5a.cubicTo(21.0524f, 5.1711264f, 22.141829f, 5.5058784f, 22.607296f, 6.384285f);
            m145417xd4061a5a.cubicTo(25.054684f, 11.002852f, 24.237564f, 16.734251f, 20.485281f, 20.486532f);
            m145417xd4061a5a.cubicTo(15.79899f, 25.172825f, 8.20101f, 25.172825f, 3.5147185f, 20.486532f);
            m145417xd4061a5a.cubicTo(-1.1715729f, 15.800241f, -1.1715729f, 8.202262f, 3.5147185f, 3.5159702f);
            m145417xd4061a5a.cubicTo(7.2670016f, -0.23631252f, 12.998399f, -1.053432f, 17.616966f, 1.3939549f);
            m145417xd4061a5a.cubicTo(18.495373f, 1.8594241f, 18.830126f, 2.9488506f, 18.364656f, 3.8272574f);
            m145417xd4061a5a.cubicTo(17.899187f, 4.705664f, 16.809761f, 5.040416f, 15.931354f, 4.574947f);
            m145417xd4061a5a.cubicTo(12.700203f, 2.8627546f, 8.686935f, 3.4349222f, 6.060303f, 6.061555f);
            m145417xd4061a5a.cubicTo(2.779899f, 9.341959f, 2.779899f, 14.660544f, 6.060303f, 17.940948f);
            m145417xd4061a5a.cubicTo(9.340707f, 21.221354f, 14.659293f, 21.221354f, 17.939697f, 17.940948f);
            m145417xd4061a5a.cubicTo(20.56633f, 15.314316f, 21.138496f, 11.301048f, 19.426306f, 8.069898f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
