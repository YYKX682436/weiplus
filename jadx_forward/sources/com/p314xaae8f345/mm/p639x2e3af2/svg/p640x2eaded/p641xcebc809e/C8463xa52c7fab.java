package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_fav_tips_arrow */
/* loaded from: classes16.dex */
public class C8463xa52c7fab extends l95.c {

    /* renamed from: width */
    private final int f24125x6be2dc6 = 72;

    /* renamed from: height */
    private final int f24124xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(40.046875f, 16.890625f);
            m145417xd4061a5a.lineTo(57.546875f, 34.390625f);
            m145417xd4061a5a.cubicTo(57.945312f, 34.789062f, 58.164062f, 35.30078f, 58.19922f, 35.82422f);
            m145417xd4061a5a.lineTo(58.19922f, 36.152344f);
            m145417xd4061a5a.cubicTo(58.164062f, 36.67578f, 57.945312f, 37.1875f, 57.546875f, 37.585938f);
            m145417xd4061a5a.lineTo(40.046875f, 55.085938f);
            m145417xd4061a5a.lineTo(37.5f, 52.54297f);
            m145417xd4061a5a.lineTo(54.05078f, 35.98828f);
            m145417xd4061a5a.lineTo(37.5f, 19.4375f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(38.25f, 34.19922f);
            m145417xd4061a5a.lineTo(38.25f, 37.80078f);
            m145417xd4061a5a.lineTo(13.5f, 37.80078f);
            m145417xd4061a5a.lineTo(13.5f, 34.19922f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(38.25f, 34.19922f);
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
