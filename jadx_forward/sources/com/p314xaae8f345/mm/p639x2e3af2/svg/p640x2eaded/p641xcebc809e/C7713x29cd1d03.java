package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.close_ad_half_screen */
/* loaded from: classes16.dex */
public class C7713x29cd1d03 extends l95.c {

    /* renamed from: width */
    private final int f22625x6be2dc6 = 40;

    /* renamed from: height */
    private final int f22624xb7389127 = 40;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 40;
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
                m145417xd4061a5a.moveTo(20.25f, 18.6932f);
                m145417xd4061a5a.lineTo(14.0568f, 12.5f);
                m145417xd4061a5a.lineTo(13.0f, 13.5568f);
                m145417xd4061a5a.lineTo(19.1932f, 19.75f);
                m145417xd4061a5a.lineTo(13.0f, 25.9432f);
                m145417xd4061a5a.lineTo(14.0568f, 27.0f);
                m145417xd4061a5a.lineTo(20.25f, 20.8068f);
                m145417xd4061a5a.lineTo(26.4432f, 27.0f);
                m145417xd4061a5a.lineTo(27.5f, 25.9432f);
                m145417xd4061a5a.lineTo(21.3068f, 19.75f);
                m145417xd4061a5a.lineTo(27.5f, 13.5568f);
                m145417xd4061a5a.lineTo(26.4432f, 12.5f);
                m145417xd4061a5a.lineTo(20.25f, 18.6932f);
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
