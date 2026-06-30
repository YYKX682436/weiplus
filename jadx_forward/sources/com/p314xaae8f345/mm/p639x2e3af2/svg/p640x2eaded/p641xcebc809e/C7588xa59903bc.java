package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.camera_filled */
/* loaded from: classes16.dex */
public class C7588xa59903bc extends l95.c {

    /* renamed from: width */
    private final int f22375x6be2dc6 = 24;

    /* renamed from: height */
    private final int f22374xb7389127 = 24;

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
                m145417xd4061a5a.moveTo(14.7324f, 4.0f);
                m145417xd4061a5a.cubicTo(14.8996f, 4.0f, 15.0557f, 4.08355f, 15.1484f, 4.22265f);
                m145417xd4061a5a.lineTo(17.0f, 7.0f);
                m145417xd4061a5a.lineTo(21.0f, 7.0f);
                m145417xd4061a5a.cubicTo(21.5523f, 7.0f, 22.0f, 7.44772f, 22.0f, 8.0f);
                m145417xd4061a5a.lineTo(22.0f, 19.0f);
                m145417xd4061a5a.cubicTo(22.0f, 19.5523f, 21.5523f, 20.0f, 21.0f, 20.0f);
                m145417xd4061a5a.lineTo(3.0f, 20.0f);
                m145417xd4061a5a.cubicTo(2.44772f, 20.0f, 2.0f, 19.5523f, 2.0f, 19.0f);
                m145417xd4061a5a.lineTo(2.0f, 8.0f);
                m145417xd4061a5a.cubicTo(2.0f, 7.44772f, 2.44772f, 7.0f, 3.0f, 7.0f);
                m145417xd4061a5a.lineTo(7.0f, 7.0f);
                m145417xd4061a5a.lineTo(8.85157f, 4.22265f);
                m145417xd4061a5a.cubicTo(8.9443f, 4.08355f, 9.10042f, 4.0f, 9.26759f, 4.0f);
                m145417xd4061a5a.lineTo(14.7324f, 4.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(15.5f, 13.0f);
                m145417xd4061a5a.cubicTo(15.5f, 14.933f, 13.933f, 16.5f, 12.0f, 16.5f);
                m145417xd4061a5a.cubicTo(10.067f, 16.5f, 8.5f, 14.933f, 8.5f, 13.0f);
                m145417xd4061a5a.cubicTo(8.5f, 11.067f, 10.067f, 9.5f, 12.0f, 9.5f);
                m145417xd4061a5a.cubicTo(13.933f, 9.5f, 15.5f, 11.067f, 15.5f, 13.0f);
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
