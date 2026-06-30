package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.video_clip_slider_selected */
/* loaded from: classes16.dex */
public class C10123xf45a28e extends l95.c {

    /* renamed from: width */
    private final int f27449x6be2dc6 = 24;

    /* renamed from: height */
    private final int f27448xb7389127 = 150;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 24;
        }
        if (i17 == 1) {
            return 150;
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
            m145414xacbd08c9.setColor(-1);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(0.0f, 0.0f);
            m145417xd4061a5a.lineTo(24.0f, 0.0f);
            m145417xd4061a5a.lineTo(24.0f, 150.0f);
            m145417xd4061a5a.lineTo(0.0f, 150.0f);
            m145417xd4061a5a.lineTo(0.0f, 0.0f);
            m145417xd4061a5a.close();
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c92.setColor(-16777216);
            android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a2.moveTo(7.0f, 66.0f);
            m145417xd4061a5a2.lineTo(10.0f, 66.0f);
            m145417xd4061a5a2.lineTo(10.0f, 84.0f);
            m145417xd4061a5a2.lineTo(7.0f, 84.0f);
            m145417xd4061a5a2.lineTo(7.0f, 66.0f);
            m145417xd4061a5a2.close();
            m145417xd4061a5a2.moveTo(14.0f, 66.0f);
            m145417xd4061a5a2.lineTo(17.0f, 66.0f);
            m145417xd4061a5a2.lineTo(17.0f, 84.0f);
            m145417xd4061a5a2.lineTo(14.0f, 84.0f);
            m145417xd4061a5a2.lineTo(14.0f, 66.0f);
            m145417xd4061a5a2.close();
            canvas.saveLayerAlpha(null, 51, 31);
            android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c92, looper);
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
            canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c93);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
