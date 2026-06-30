package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.device_profile_ui_add_followers_logo */
/* loaded from: classes16.dex */
public class C7814xbe30903f extends l95.c {

    /* renamed from: width */
    private final int f22827x6be2dc6 = 60;

    /* renamed from: height */
    private final int f22826xb7389127 = 60;

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
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-16777216);
                canvas.saveLayerAlpha(null, 51, 31);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(29.73f, 4.822f);
                m145417xd4061a5a.cubicTo(15.804f, 4.822f, 4.514f, 16.111f, 4.514f, 30.038f);
                m145417xd4061a5a.cubicTo(4.514f, 43.965f, 15.804f, 55.253f, 29.73f, 55.253f);
                m145417xd4061a5a.cubicTo(43.656f, 55.253f, 54.946f, 43.963997f, 54.946f, 30.036999f);
                m145417xd4061a5a.cubicTo(54.946f, 16.11f, 43.656f, 4.822f, 29.73f, 4.822f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(29.73f, 53.27f);
                m145417xd4061a5a.cubicTo(16.898998f, 53.27f, 6.4969997f, 42.868f, 6.4969997f, 30.037f);
                m145417xd4061a5a.cubicTo(6.4969997f, 17.206001f, 16.899f, 6.805f, 29.73f, 6.805f);
                m145417xd4061a5a.cubicTo(42.561f, 6.805f, 52.962997f, 17.207f, 52.962997f, 30.038f);
                m145417xd4061a5a.cubicTo(52.962997f, 42.869f, 42.561f, 53.27f, 29.73f, 53.27f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                canvas.save();
                android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(31.23f, 15.037f);
                m145417xd4061a5a2.lineTo(28.23f, 15.037f);
                m145417xd4061a5a2.lineTo(28.23f, 28.537f);
                m145417xd4061a5a2.lineTo(14.73f, 28.537f);
                m145417xd4061a5a2.lineTo(14.73f, 31.537f);
                m145417xd4061a5a2.lineTo(28.23f, 31.537f);
                m145417xd4061a5a2.lineTo(28.23f, 45.037f);
                m145417xd4061a5a2.lineTo(31.23f, 45.037f);
                m145417xd4061a5a2.lineTo(31.23f, 31.537f);
                m145417xd4061a5a2.lineTo(44.73f, 31.537f);
                m145417xd4061a5a2.lineTo(44.73f, 28.537f);
                m145417xd4061a5a2.lineTo(31.23f, 28.537f);
                m145417xd4061a5a2.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
                canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c93);
                canvas.restore();
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
