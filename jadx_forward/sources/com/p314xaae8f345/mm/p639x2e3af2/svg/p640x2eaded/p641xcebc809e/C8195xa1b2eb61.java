package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fix_tools_finish */
/* loaded from: classes16.dex */
public class C8195xa1b2eb61 extends l95.c {

    /* renamed from: width */
    private final int f23589x6be2dc6 = 100;

    /* renamed from: height */
    private final int f23588xb7389127 = 100;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 100;
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
                m145414xacbd08c9.setColor(-16139513);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(100.0f, 50.346603f);
                m145417xd4061a5a.cubicTo(100.0f, 22.265478f, 77.614815f, 0.0f, 49.382717f, 0.0f);
                m145417xd4061a5a.cubicTo(22.385185f, 0.0f, 0.0f, 22.265478f, 0.0f, 50.346603f);
                m145417xd4061a5a.cubicTo(0.0f, 77.19976f, 22.385185f, 99.46524f, 49.382717f, 99.46524f);
                m145417xd4061a5a.cubicTo(77.614815f, 99.46524f, 100.0f, 77.19976f, 100.0f, 50.346603f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
                canvas.restore();
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c92.setColor(-1);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(26.066193f, 52.06067f);
                m145417xd4061a5a2.cubicTo(25.683428f, 51.666645f, 25.640087f, 50.985928f, 25.972504f, 50.536034f);
                m145417xd4061a5a2.lineTo(27.666462f, 48.243423f);
                m145417xd4061a5a2.cubicTo(27.997484f, 47.795414f, 28.617992f, 47.700703f, 29.062307f, 48.03942f);
                m145417xd4061a5a2.lineTo(41.715767f, 57.68571f);
                m145417xd4061a5a2.cubicTo(42.155647f, 58.021053f, 42.853935f, 58.00976f, 43.289238f, 57.64906f);
                m145417xd4061a5a2.lineTo(75.15912f, 31.240854f);
                m145417xd4061a5a2.cubicTo(75.58824f, 30.885271f, 76.25674f, 30.911966f, 76.65116f, 31.299417f);
                m145417xd4061a5a2.lineTo(78.11376f, 32.736153f);
                m145417xd4061a5a2.cubicTo(78.508675f, 33.12408f, 78.51484f, 33.745895f, 78.11964f, 34.132755f);
                m145417xd4061a5a2.lineTo(43.220352f, 68.2952f);
                m145417xd4061a5a2.cubicTo(42.828686f, 68.6786f, 42.199085f, 68.66812f, 41.81812f, 68.275955f);
                m145417xd4061a5a2.lineTo(26.066193f, 52.06067f);
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
