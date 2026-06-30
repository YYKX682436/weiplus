package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_location_blue */
/* loaded from: classes16.dex */
public class C8632x3aa7da8c extends l95.c {

    /* renamed from: width */
    private final int f24463x6be2dc6 = 24;

    /* renamed from: height */
    private final int f24462xb7389127 = 24;

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
                m145414xacbd08c9.setColor(-6640172);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(12.0f, 2.5f);
                m145417xd4061a5a.cubicTo(16.1421f, 2.5f, 19.5f, 5.83401f, 19.5f, 9.94673f);
                m145417xd4061a5a.cubicTo(19.5f, 15.5488f, 12.6788f, 21.2544f, 12.6788f, 21.2544f);
                m145417xd4061a5a.cubicTo(12.3033f, 21.5963f, 11.702f, 21.5952f, 11.3344f, 21.2666f);
                m145417xd4061a5a.cubicTo(11.3344f, 21.2666f, 4.5f, 15.5488f, 4.5f, 9.94673f);
                m145417xd4061a5a.cubicTo(4.5f, 5.83401f, 7.85786f, 2.5f, 12.0f, 2.5f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(12.0f, 7.0f);
                m145417xd4061a5a.cubicTo(10.3431f, 7.0f, 9.0f, 8.34315f, 9.0f, 10.0f);
                m145417xd4061a5a.cubicTo(9.0f, 11.6569f, 10.3431f, 13.0f, 12.0f, 13.0f);
                m145417xd4061a5a.cubicTo(13.6569f, 13.0f, 15.0f, 11.6569f, 15.0f, 10.0f);
                m145417xd4061a5a.cubicTo(15.0f, 8.34315f, 13.6569f, 7.0f, 12.0f, 7.0f);
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
