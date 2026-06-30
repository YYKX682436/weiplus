package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chatfrom_voice_playing_new */
/* loaded from: classes16.dex */
public class C7636xc14a1285 extends l95.c {

    /* renamed from: width */
    private final int f22471x6be2dc6 = 72;

    /* renamed from: height */
    private final int f22470xb7389127 = 72;

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
                m145414xacbd08c9.setColor(-15028967);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(45.4242f, 69.0f);
                m145417xd4061a5a.lineTo(39.6252f, 63.291f);
                m145417xd4061a5a.cubicTo(47.0982f, 56.445f, 51.7692f, 46.713f, 51.7692f, 35.919f);
                m145417xd4061a5a.cubicTo(51.7692f, 25.209f, 47.1732f, 15.546f, 39.8022f, 8.709f);
                m145417xd4061a5a.lineTo(45.6012f, 3.0f);
                m145417xd4061a5a.cubicTo(54.4722f, 11.295f, 60.0012f, 22.977f, 60.0012f, 35.919f);
                m145417xd4061a5a.cubicTo(60.0012f, 48.945f, 54.4002f, 60.696f, 45.4242f, 69.0f);
                m145417xd4061a5a.moveTo(31.8912f, 55.674f);
                m145417xd4061a5a.lineTo(26.0892f, 49.959f);
                m145417xd4061a5a.cubicTo(30.0582f, 46.524f, 32.5602f, 41.505f, 32.5602f, 35.919f);
                m145417xd4061a5a.cubicTo(32.5602f, 30.417f, 30.1332f, 25.467f, 26.2692f, 22.035f);
                m145417xd4061a5a.lineTo(32.0712f, 16.323f);
                m145417xd4061a5a.cubicTo(37.4382f, 21.213f, 40.7922f, 28.185f, 40.7922f, 35.919f);
                m145417xd4061a5a.cubicTo(40.7922f, 43.737f, 37.3632f, 50.775f, 31.8912f, 55.674f);
                m145417xd4061a5a.moveTo(19.3032f, 43.278f);
                m145417xd4061a5a.lineTo(12.0012f, 36.087f);
                m145417xd4061a5a.lineTo(19.4952f, 28.707f);
                m145417xd4061a5a.cubicTo(21.6102f, 30.429f, 22.9572f, 33.018f, 22.9572f, 35.919f);
                m145417xd4061a5a.cubicTo(22.9572f, 38.904f, 21.5292f, 41.562f, 19.3032f, 43.278f);
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
