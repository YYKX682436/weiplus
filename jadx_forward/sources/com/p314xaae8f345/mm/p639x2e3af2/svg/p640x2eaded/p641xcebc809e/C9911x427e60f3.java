package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sns_ad_lookbook_left_arrow */
/* loaded from: classes16.dex */
public class C9911x427e60f3 extends l95.c {

    /* renamed from: width */
    private final int f27025x6be2dc6 = 12;

    /* renamed from: height */
    private final int f27024xb7389127 = 12;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 12;
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
                m145414xacbd08c9.setColor(-1946157056);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(4.6464f, 2.14645f);
                m145417xd4061a5a.lineTo(1.1464f, 5.64645f);
                m145417xd4061a5a.lineTo(0.792847f, 6.0f);
                m145417xd4061a5a.lineTo(1.1464f, 6.35355f);
                m145417xd4061a5a.lineTo(4.6464f, 9.85355f);
                m145417xd4061a5a.lineTo(5.35351f, 9.14645f);
                m145417xd4061a5a.lineTo(2.70706f, 6.5f);
                m145417xd4061a5a.lineTo(11.5f, 6.5f);
                m145417xd4061a5a.lineTo(11.5f, 5.5f);
                m145417xd4061a5a.lineTo(2.70706f, 5.5f);
                m145417xd4061a5a.lineTo(5.35351f, 2.85355f);
                m145417xd4061a5a.lineTo(4.6464f, 2.14645f);
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
