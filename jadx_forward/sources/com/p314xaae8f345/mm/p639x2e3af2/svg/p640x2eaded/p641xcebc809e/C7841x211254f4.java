package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.download_image_icon */
/* loaded from: classes16.dex */
public class C7841x211254f4 extends l95.c {

    /* renamed from: width */
    private final int f22881x6be2dc6 = 480;

    /* renamed from: height */
    private final int f22880xb7389127 = 480;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 480;
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
                m145414xacbd08c9.setColor(-2565928);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(0.0f, 0.0f);
                m145417xd4061a5a.lineTo(480.0f, 0.0f);
                m145417xd4061a5a.lineTo(480.0f, 480.0f);
                m145417xd4061a5a.lineTo(0.0f, 480.0f);
                m145417xd4061a5a.lineTo(0.0f, 0.0f);
                m145417xd4061a5a.close();
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
                canvas.restore();
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c92.setColor(-1);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(377.6f, 272.91428f);
                m145417xd4061a5a2.lineTo(377.6f, 137.6f);
                m145417xd4061a5a2.lineTo(102.4f, 137.6f);
                m145417xd4061a5a2.lineTo(102.4f, 269.6258f);
                m145417xd4061a5a2.lineTo(188.8f, 188.8f);
                m145417xd4061a5a2.lineTo(288.0f, 278.4f);
                m145417xd4061a5a2.lineTo(278.4f, 252.8f);
                m145417xd4061a5a2.lineTo(320.0f, 220.8f);
                m145417xd4061a5a2.lineTo(377.6f, 272.91428f);
                m145417xd4061a5a2.close();
                m145417xd4061a5a2.moveTo(86.4f, 124.594025f);
                m145417xd4061a5a2.cubicTo(86.4f, 122.940475f, 87.736046f, 121.6f, 89.391014f, 121.6f);
                m145417xd4061a5a2.lineTo(390.60898f, 121.6f);
                m145417xd4061a5a2.cubicTo(392.26086f, 121.6f, 393.6f, 122.946335f, 393.6f, 124.594025f);
                m145417xd4061a5a2.lineTo(393.6f, 355.40598f);
                m145417xd4061a5a2.cubicTo(393.6f, 357.05954f, 392.26395f, 358.4f, 390.60898f, 358.4f);
                m145417xd4061a5a2.lineTo(89.391014f, 358.4f);
                m145417xd4061a5a2.cubicTo(87.73912f, 358.4f, 86.4f, 357.05365f, 86.4f, 355.40598f);
                m145417xd4061a5a2.lineTo(86.4f, 124.594025f);
                m145417xd4061a5a2.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
                canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
