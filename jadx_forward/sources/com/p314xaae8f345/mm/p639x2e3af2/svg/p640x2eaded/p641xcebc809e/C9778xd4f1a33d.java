package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.read_more_btn_icon */
/* loaded from: classes16.dex */
public class C9778xd4f1a33d extends l95.c {

    /* renamed from: width */
    private final int f26759x6be2dc6 = 46;

    /* renamed from: height */
    private final int f26758xb7389127 = 46;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 46;
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
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-8744017);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(30.152525f, 34.384174f);
                m145417xd4061a5a.cubicTo(27.020466f, 36.658646f, 23.166878f, 38.0f, 19.0f, 38.0f);
                m145417xd4061a5a.cubicTo(8.50659f, 38.0f, 0.0f, 29.49341f, 0.0f, 19.0f);
                m145417xd4061a5a.cubicTo(0.0f, 8.50659f, 8.50659f, 0.0f, 19.0f, 0.0f);
                m145417xd4061a5a.cubicTo(29.49341f, 0.0f, 38.0f, 8.50659f, 38.0f, 19.0f);
                m145417xd4061a5a.cubicTo(38.0f, 23.166878f, 36.658646f, 27.020466f, 34.384174f, 30.152525f);
                m145417xd4061a5a.lineTo(45.66412f, 41.432472f);
                m145417xd4061a5a.lineTo(41.432472f, 45.66412f);
                m145417xd4061a5a.lineTo(30.152525f, 34.384174f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(19.0f, 33.0f);
                m145417xd4061a5a.cubicTo(26.731987f, 33.0f, 33.0f, 26.731987f, 33.0f, 19.0f);
                m145417xd4061a5a.cubicTo(33.0f, 11.268014f, 26.731987f, 5.0f, 19.0f, 5.0f);
                m145417xd4061a5a.cubicTo(11.268014f, 5.0f, 5.0f, 11.268014f, 5.0f, 19.0f);
                m145417xd4061a5a.cubicTo(5.0f, 26.731987f, 11.268014f, 33.0f, 19.0f, 33.0f);
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
