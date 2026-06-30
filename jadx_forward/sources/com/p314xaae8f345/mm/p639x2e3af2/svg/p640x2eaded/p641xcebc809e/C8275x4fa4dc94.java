package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_chat_tips_icon_up */
/* loaded from: classes16.dex */
public class C8275x4fa4dc94 extends l95.c {

    /* renamed from: width */
    private final int f23749x6be2dc6 = 16;

    /* renamed from: height */
    private final int f23748xb7389127 = 16;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
        }
        if (i17 != 2) {
            return 0;
        }
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
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(12.816f, 11.328f);
        m145417xd4061a5a.lineTo(12.032f, 12.112f);
        m145417xd4061a5a.lineTo(8.0f, 8.122f);
        m145417xd4061a5a.lineTo(3.982f, 12.112f);
        m145417xd4061a5a.lineTo(3.184f, 11.328f);
        m145417xd4061a5a.lineTo(7.482f, 7.086f);
        m145417xd4061a5a.cubicTo(7.63133f, 6.93667f, 7.804f, 6.862f, 8.0f, 6.862f);
        m145417xd4061a5a.cubicTo(8.20533f, 6.862f, 8.378f, 6.93667f, 8.518f, 7.086f);
        m145417xd4061a5a.lineTo(12.816f, 11.328f);
        m145417xd4061a5a.close();
        m145417xd4061a5a.moveTo(12.816f, 6.764f);
        m145417xd4061a5a.lineTo(12.032f, 7.548f);
        m145417xd4061a5a.lineTo(8.014f, 3.558f);
        m145417xd4061a5a.lineTo(3.996f, 7.548f);
        m145417xd4061a5a.lineTo(3.198f, 6.764f);
        m145417xd4061a5a.lineTo(7.482f, 2.522f);
        m145417xd4061a5a.cubicTo(7.63133f, 2.37267f, 7.80867f, 2.298f, 8.014f, 2.298f);
        m145417xd4061a5a.cubicTo(8.21933f, 2.298f, 8.392f, 2.37267f, 8.532f, 2.522f);
        m145417xd4061a5a.lineTo(12.816f, 6.764f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
