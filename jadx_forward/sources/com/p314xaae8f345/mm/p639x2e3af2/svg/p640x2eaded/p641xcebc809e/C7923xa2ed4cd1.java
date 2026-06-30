package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.exclamation_mark_circle_filled */
/* loaded from: classes16.dex */
public class C7923xa2ed4cd1 extends l95.c {

    /* renamed from: width */
    private final int f23045x6be2dc6 = 24;

    /* renamed from: height */
    private final int f23044xb7389127 = 24;

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
                m145417xd4061a5a.moveTo(12.0f, 22.0f);
                m145417xd4061a5a.cubicTo(6.47715f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f);
                m145417xd4061a5a.cubicTo(2.0f, 6.47715f, 6.47715f, 2.0f, 12.0f, 2.0f);
                m145417xd4061a5a.cubicTo(17.5228f, 2.0f, 22.0f, 6.47715f, 22.0f, 12.0f);
                m145417xd4061a5a.cubicTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(10.983f, 6.0f);
                m145417xd4061a5a.lineTo(13.0147f, 6.0f);
                m145417xd4061a5a.lineTo(12.8981f, 14.0967f);
                m145417xd4061a5a.lineTo(11.0996f, 14.0967f);
                m145417xd4061a5a.lineTo(10.983f, 6.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(10.85f, 16.8818f);
                m145417xd4061a5a.cubicTo(10.85f, 17.5239f, 11.3635f, 18.0137f, 11.9955f, 18.0137f);
                m145417xd4061a5a.cubicTo(12.6412f, 18.0137f, 13.1478f, 17.5239f, 13.1478f, 16.8818f);
                m145417xd4061a5a.cubicTo(13.1478f, 16.2397f, 12.6412f, 15.75f, 11.9955f, 15.75f);
                m145417xd4061a5a.cubicTo(11.3635f, 15.75f, 10.85f, 16.2397f, 10.85f, 16.8818f);
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
