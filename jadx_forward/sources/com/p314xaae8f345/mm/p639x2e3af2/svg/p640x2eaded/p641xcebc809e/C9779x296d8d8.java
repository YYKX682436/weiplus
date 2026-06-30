package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.realname_done */
/* loaded from: classes16.dex */
public class C9779x296d8d8 extends l95.c {

    /* renamed from: width */
    private final int f26761x6be2dc6 = 192;

    /* renamed from: height */
    private final int f26760xb7389127 = 192;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 192;
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
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-16268960);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(96.0f, 176.0f);
                m145417xd4061a5a.cubicTo(51.81722f, 176.0f, 16.0f, 140.18279f, 16.0f, 96.0f);
                m145417xd4061a5a.cubicTo(16.0f, 51.81722f, 51.81722f, 16.0f, 96.0f, 16.0f);
                m145417xd4061a5a.cubicTo(140.18279f, 16.0f, 176.0f, 51.81722f, 176.0f, 96.0f);
                m145417xd4061a5a.cubicTo(176.0f, 140.18279f, 140.18279f, 176.0f, 96.0f, 176.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(86.5875f, 113.11453f);
                m145417xd4061a5a.lineTo(64.460304f, 90.987335f);
                m145417xd4061a5a.lineTo(56.0f, 99.44764f);
                m145417xd4061a5a.lineTo(80.95047f, 124.41615f);
                m145417xd4061a5a.cubicTo(80.94989f, 124.41731f, 80.95018f, 124.4176f, 80.95047f, 124.41789f);
                m145417xd4061a5a.cubicTo(84.07402f, 127.54274f, 89.139336f, 127.54379f, 92.26331f, 124.41937f);
                m145417xd4061a5a.lineTo(139.88225f, 76.82022f);
                m145417xd4061a5a.lineTo(131.38203f, 68.32f);
                m145417xd4061a5a.lineTo(86.5875f, 113.11453f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
