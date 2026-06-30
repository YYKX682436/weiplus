package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_delete_icon */
/* loaded from: classes16.dex */
public class C8064x1044cab3 extends l95.c {

    /* renamed from: width */
    private final int f23327x6be2dc6 = 72;

    /* renamed from: height */
    private final int f23326xb7389127 = 72;

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
            m145417xd4061a5a.moveTo(36.0f, 6.0f);
            m145417xd4061a5a.cubicTo(52.570312f, 6.0f, 66.0f, 19.429688f, 66.0f, 36.0f);
            m145417xd4061a5a.cubicTo(66.0f, 52.570312f, 52.570312f, 66.0f, 36.0f, 66.0f);
            m145417xd4061a5a.cubicTo(19.429688f, 66.0f, 6.0f, 52.570312f, 6.0f, 36.0f);
            m145417xd4061a5a.cubicTo(6.0f, 19.429688f, 19.429688f, 6.0f, 36.0f, 6.0f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(36.0f, 9.601562f);
            m145417xd4061a5a.cubicTo(21.417969f, 9.601562f, 9.601562f, 21.417969f, 9.601562f, 36.0f);
            m145417xd4061a5a.cubicTo(9.601562f, 50.58203f, 21.417969f, 62.398438f, 36.0f, 62.398438f);
            m145417xd4061a5a.cubicTo(50.58203f, 62.398438f, 62.398438f, 50.58203f, 62.398438f, 36.0f);
            m145417xd4061a5a.cubicTo(62.398438f, 21.417969f, 50.58203f, 9.601562f, 36.0f, 9.601562f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(51.0f, 34.19922f);
            m145417xd4061a5a.lineTo(51.0f, 37.80078f);
            m145417xd4061a5a.lineTo(21.0f, 37.80078f);
            m145417xd4061a5a.lineTo(21.0f, 34.19922f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(51.0f, 34.19922f);
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
