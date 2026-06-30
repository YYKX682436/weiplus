package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_chat_tips_icon_down */
/* loaded from: classes16.dex */
public class C8274xf9d8585b extends l95.c {

    /* renamed from: width */
    private final int f23747x6be2dc6 = 16;

    /* renamed from: height */
    private final int f23746xb7389127 = 16;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
            m145414xacbd08c9.setColor(-1);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(3.184f, 8.954f);
            m145417xd4061a5a.lineTo(3.968f, 8.17f);
            m145417xd4061a5a.lineTo(8.0f, 12.16f);
            m145417xd4061a5a.lineTo(12.018f, 8.17f);
            m145417xd4061a5a.lineTo(12.816f, 8.954f);
            m145417xd4061a5a.lineTo(8.518f, 13.196f);
            m145417xd4061a5a.cubicTo(8.36867f, 13.3453f, 8.19133f, 13.42f, 7.986f, 13.42f);
            m145417xd4061a5a.cubicTo(7.79f, 13.42f, 7.622f, 13.3453f, 7.482f, 13.196f);
            m145417xd4061a5a.lineTo(3.184f, 8.954f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(3.212f, 4.474f);
            m145417xd4061a5a.lineTo(3.996f, 3.69f);
            m145417xd4061a5a.lineTo(8.014f, 7.68f);
            m145417xd4061a5a.lineTo(12.032f, 3.69f);
            m145417xd4061a5a.lineTo(12.83f, 4.474f);
            m145417xd4061a5a.lineTo(8.546f, 8.716f);
            m145417xd4061a5a.cubicTo(8.39667f, 8.86533f, 8.21933f, 8.94f, 8.014f, 8.94f);
            m145417xd4061a5a.cubicTo(7.80867f, 8.94f, 7.636f, 8.86533f, 7.496f, 8.716f);
            m145417xd4061a5a.lineTo(3.212f, 4.474f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
