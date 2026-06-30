package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.note_filled_album */
/* loaded from: classes16.dex */
public class C9566xd9a4307f extends l95.c {

    /* renamed from: width */
    private final int f26333x6be2dc6 = 24;

    /* renamed from: height */
    private final int f26332xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-16777216);
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(20.5f, 14.136058f);
            m145417xd4061a5a.lineTo(20.5f, 5.5f);
            m145417xd4061a5a.lineTo(3.5f, 5.5f);
            m145417xd4061a5a.lineTo(3.5f, 13.849606f);
            m145417xd4061a5a.lineTo(8.199245f, 10.049258f);
            m145417xd4061a5a.cubicTo(8.661799f, 9.675185f, 9.404626f, 9.693327f, 9.850495f, 10.085084f);
            m145417xd4061a5a.lineTo(14.326923f, 14.018227f);
            m145417xd4061a5a.lineTo(16.609102f, 12.0774975f);
            m145417xd4061a5a.cubicTo(17.071318f, 11.684438f, 17.806723f, 11.692423f, 18.255432f, 12.095083f);
            m145417xd4061a5a.lineTo(20.5f, 14.136058f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(2.9918032f, 4.0f);
            m145417xd4061a5a.lineTo(21.008198f, 4.0f);
            m145417xd4061a5a.cubicTo(21.544695f, 4.0f, 22.0f, 4.481137f, 22.0f, 5.0746493f);
            m145417xd4061a5a.lineTo(22.0f, 18.92535f);
            m145417xd4061a5a.cubicTo(22.0f, 19.521152f, 21.555954f, 20.0f, 21.008198f, 20.0f);
            m145417xd4061a5a.lineTo(2.9918032f, 20.0f);
            m145417xd4061a5a.cubicTo(2.4553056f, 20.0f, 2.0f, 19.518864f, 2.0f, 18.92535f);
            m145417xd4061a5a.lineTo(2.0f, 5.0746493f);
            m145417xd4061a5a.cubicTo(2.0f, 4.4788485f, 2.4440453f, 4.0f, 2.9918032f, 4.0f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
