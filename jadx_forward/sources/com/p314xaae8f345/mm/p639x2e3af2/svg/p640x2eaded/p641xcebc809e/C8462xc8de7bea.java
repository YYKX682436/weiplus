package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_eyes_on_filled */
/* loaded from: classes16.dex */
public class C8462xc8de7bea extends l95.c {

    /* renamed from: width */
    private final int f24123x6be2dc6 = 24;

    /* renamed from: height */
    private final int f24122xb7389127 = 24;

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
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-16777216);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(1.0f, 12.0f);
                m145417xd4061a5a.cubicTo(3.02794f, 7.84763f, 7.19221f, 5.0f, 12.0f, 5.0f);
                m145417xd4061a5a.cubicTo(16.8078f, 5.0f, 20.9721f, 7.84763f, 23.0f, 12.0f);
                m145417xd4061a5a.cubicTo(20.9721f, 16.1524f, 16.8078f, 19.0f, 12.0f, 19.0f);
                m145417xd4061a5a.cubicTo(7.19221f, 19.0f, 3.02794f, 16.1524f, 1.0f, 12.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(15.5f, 12.0f);
                m145417xd4061a5a.cubicTo(15.5f, 13.933f, 13.933f, 15.5f, 12.0f, 15.5f);
                m145417xd4061a5a.cubicTo(10.067f, 15.5f, 8.5f, 13.933f, 8.5f, 12.0f);
                m145417xd4061a5a.cubicTo(8.5f, 10.067f, 10.067f, 8.5f, 12.0f, 8.5f);
                m145417xd4061a5a.cubicTo(13.933f, 8.5f, 15.5f, 10.067f, 15.5f, 12.0f);
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
