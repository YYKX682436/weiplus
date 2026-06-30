package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.device_rank_item_unliked */
/* loaded from: classes16.dex */
public class C7816x143f6f12 extends l95.c {

    /* renamed from: width */
    private final int f22831x6be2dc6 = 54;

    /* renamed from: height */
    private final int f22830xb7389127 = 54;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 54;
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
                m145414xacbd08c9.setColor(-10658467);
                canvas.saveLayerAlpha(null, 51, 31);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(27.0f, 10.48036f);
                m145417xd4061a5a.cubicTo(28.520756f, 7.5187073f, 31.927713f, 3.0f, 38.559685f, 3.0f);
                m145417xd4061a5a.cubicTo(48.42443f, 3.0f, 55.286037f, 9.86097f, 53.796867f, 19.960094f);
                m145417xd4061a5a.cubicTo(51.85492f, 31.37217f, 31.893957f, 47.352608f, 27.419691f, 51.072113f);
                m145417xd4061a5a.cubicTo(27.187933f, 51.26478f, 26.997726f, 51.424545f, 26.853727f, 51.549076f);
                m145417xd4061a5a.cubicTo(26.85368f, 51.566315f, 26.853643f, 51.58329f, 26.85362f, 51.6f);
                m145417xd4061a5a.cubicTo(26.844093f, 51.591694f, 26.83434f, 51.583206f, 26.824354f, 51.574547f);
                m145417xd4061a5a.cubicTo(26.819895f, 51.578423f, 26.815485f, 51.582264f, 26.811125f, 51.586067f);
                m145417xd4061a5a.cubicTo(26.811113f, 51.57845f, 26.8111f, 51.570774f, 26.811085f, 51.563046f);
                m145417xd4061a5a.cubicTo(23.89057f, 49.03434f, 2.2456808f, 31.963354f, 0.20313297f, 19.960094f);
                m145417xd4061a5a.cubicTo(-1.2860388f, 9.86097f, 5.5755696f, 3.0f, 15.440317f, 3.0f);
                m145417xd4061a5a.cubicTo(22.072287f, 3.0f, 25.479244f, 7.5187073f, 27.0f, 10.48036f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
