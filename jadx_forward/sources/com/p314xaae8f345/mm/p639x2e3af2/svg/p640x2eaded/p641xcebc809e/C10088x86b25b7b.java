package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.trash_on_filled */
/* loaded from: classes16.dex */
public class C10088x86b25b7b extends l95.c {

    /* renamed from: width */
    private final int f27379x6be2dc6 = 24;

    /* renamed from: height */
    private final int f27378xb7389127 = 24;

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
                m145417xd4061a5a.moveTo(18.4118f, 6.5f);
                m145417xd4061a5a.lineTo(17.6107f, 20.1174f);
                m145417xd4061a5a.cubicTo(17.5486f, 21.1746f, 16.6731f, 22.0f, 15.6142f, 22.0f);
                m145417xd4061a5a.lineTo(8.38581f, 22.0f);
                m145417xd4061a5a.cubicTo(7.32686f, 22.0f, 6.45145f, 21.1746f, 6.38926f, 20.1174f);
                m145417xd4061a5a.lineTo(5.58824f, 6.5f);
                m145417xd4061a5a.lineTo(3.5f, 6.5f);
                m145417xd4061a5a.lineTo(3.5f, 5.5f);
                m145417xd4061a5a.cubicTo(3.5f, 5.22385f, 3.72386f, 5.0f, 4.0f, 5.0f);
                m145417xd4061a5a.lineTo(20.0f, 5.0f);
                m145417xd4061a5a.cubicTo(20.2761f, 5.0f, 20.5f, 5.22385f, 20.5f, 5.5f);
                m145417xd4061a5a.lineTo(20.5f, 6.5f);
                m145417xd4061a5a.lineTo(18.4118f, 6.5f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(10.0f, 2.50003f);
                m145417xd4061a5a.lineTo(14.0f, 2.50003f);
                m145417xd4061a5a.cubicTo(14.2761f, 2.50003f, 14.5f, 2.72389f, 14.5f, 3.00003f);
                m145417xd4061a5a.lineTo(14.5f, 4.0f);
                m145417xd4061a5a.lineTo(9.5f, 4.0f);
                m145417xd4061a5a.lineTo(9.5f, 3.00003f);
                m145417xd4061a5a.cubicTo(9.5f, 2.72389f, 9.72386f, 2.50003f, 10.0f, 2.50003f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(9.0f, 8.99998f);
                m145417xd4061a5a.lineTo(9.5f, 18.0f);
                m145417xd4061a5a.lineTo(11.0f, 18.0f);
                m145417xd4061a5a.lineTo(10.6f, 8.99998f);
                m145417xd4061a5a.lineTo(9.0f, 8.99998f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(13.5f, 8.99998f);
                m145417xd4061a5a.lineTo(13.0f, 18.0f);
                m145417xd4061a5a.lineTo(14.5f, 18.0f);
                m145417xd4061a5a.lineTo(15.0f, 8.99998f);
                m145417xd4061a5a.lineTo(13.5f, 8.99998f);
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
