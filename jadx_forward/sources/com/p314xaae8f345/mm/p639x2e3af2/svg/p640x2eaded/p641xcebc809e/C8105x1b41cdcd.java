package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_move_icon */
/* loaded from: classes16.dex */
public class C8105x1b41cdcd extends l95.c {

    /* renamed from: width */
    private final int f23409x6be2dc6 = 24;

    /* renamed from: height */
    private final int f23408xb7389127 = 24;

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
                l95.c.m145414xacbd08c9(m145415xacbd08c92, looper).setStrokeWidth(1.0f);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(0.0f, 0.0f);
                m145417xd4061a5a.lineTo(24.0f, 0.0f);
                m145417xd4061a5a.lineTo(24.0f, 24.0f);
                m145417xd4061a5a.lineTo(0.0f, 24.0f);
                m145417xd4061a5a.lineTo(0.0f, 0.0f);
                m145417xd4061a5a.close();
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-436207616);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(22.0f, 17.2f);
                m145417xd4061a5a2.lineTo(22.0f, 18.4f);
                m145417xd4061a5a2.lineTo(2.0f, 18.4f);
                m145417xd4061a5a2.lineTo(2.0f, 17.2f);
                m145417xd4061a5a2.lineTo(22.0f, 17.2f);
                m145417xd4061a5a2.close();
                m145417xd4061a5a2.moveTo(22.0f, 11.4f);
                m145417xd4061a5a2.lineTo(22.0f, 12.6f);
                m145417xd4061a5a2.lineTo(2.0f, 12.6f);
                m145417xd4061a5a2.lineTo(2.0f, 11.4f);
                m145417xd4061a5a2.lineTo(22.0f, 11.4f);
                m145417xd4061a5a2.close();
                m145417xd4061a5a2.moveTo(22.0f, 5.6f);
                m145417xd4061a5a2.lineTo(22.0f, 6.8f);
                m145417xd4061a5a2.lineTo(2.0f, 6.8f);
                m145417xd4061a5a2.lineTo(2.0f, 5.6f);
                m145417xd4061a5a2.lineTo(22.0f, 5.6f);
                m145417xd4061a5a2.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
                canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c9);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
