package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.exclamation_mark_triangle_filled */
/* loaded from: classes16.dex */
public class C7925x29bf6899 extends l95.c {

    /* renamed from: width */
    private final int f23049x6be2dc6 = 24;

    /* renamed from: height */
    private final int f23048xb7389127 = 24;

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
                m145417xd4061a5a.moveTo(21.268f, 21.0526f);
                m145417xd4061a5a.cubicTo(22.0378f, 21.0526f, 22.5189f, 20.2192f, 22.1339f, 19.5526f);
                m145417xd4061a5a.lineTo(12.8644f, 3.49994f);
                m145417xd4061a5a.cubicTo(12.4794f, 2.83328f, 11.5171f, 2.83337f, 11.1323f, 3.5001f);
                m145417xd4061a5a.lineTo(1.86588f, 19.5543f);
                m145417xd4061a5a.cubicTo(1.48106f, 20.221f, 1.96226f, 21.0543f, 2.73204f, 21.0542f);
                m145417xd4061a5a.lineTo(21.268f, 21.0526f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(13.0082f, 9.0f);
                m145417xd4061a5a.lineTo(10.9918f, 9.0f);
                m145417xd4061a5a.lineTo(11.1194f, 15.166f);
                m145417xd4061a5a.lineTo(12.8806f, 15.166f);
                m145417xd4061a5a.lineTo(13.0082f, 9.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(10.8975f, 17.7051f);
                m145417xd4061a5a.cubicTo(10.8975f, 18.3106f, 11.389f, 18.7871f, 11.9971f, 18.7871f);
                m145417xd4061a5a.cubicTo(12.6099f, 18.7871f, 13.1025f, 18.3117f, 13.1025f, 17.7051f);
                m145417xd4061a5a.cubicTo(13.1025f, 17.0962f, 12.6076f, 16.6289f, 11.9971f, 16.6289f);
                m145417xd4061a5a.cubicTo(11.3913f, 16.6289f, 10.8975f, 17.0973f, 10.8975f, 17.7051f);
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
