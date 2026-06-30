package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.new_voice2search_cancel */
/* loaded from: classes16.dex */
public class C9550xe9260292 extends l95.c {

    /* renamed from: width */
    private final int f26301x6be2dc6 = 27;

    /* renamed from: height */
    private final int f26300xb7389127 = 27;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 27;
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
                m145414xacbd08c9.setColor(-1);
                m145414xacbd08c9.setColor(-1);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(13.65f, 14.9396f);
                m145417xd4061a5a.lineTo(8.10712f, 21.7832f);
                m145417xd4061a5a.lineTo(6.51625f, 20.4946f);
                m145417xd4061a5a.lineTo(12.0589f, 13.6514f);
                m145417xd4061a5a.lineTo(5.21355f, 8.10916f);
                m145417xd4061a5a.lineTo(6.50176f, 6.51805f);
                m145417xd4061a5a.lineTo(13.3474f, 12.0605f);
                m145417xd4061a5a.lineTo(18.8934f, 5.2131f);
                m145417xd4061a5a.lineTo(20.4843f, 6.50161f);
                m145417xd4061a5a.lineTo(14.9385f, 13.3487f);
                m145417xd4061a5a.lineTo(21.7868f, 18.8933f);
                m145417xd4061a5a.lineTo(20.4986f, 20.4844f);
                m145417xd4061a5a.lineTo(13.65f, 14.9396f);
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
