package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_pay_transfer */
/* loaded from: classes16.dex */
public class C8700xc7b9d0ba extends l95.c {

    /* renamed from: width */
    private final int f24599x6be2dc6 = 72;

    /* renamed from: height */
    private final int f24598xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
        }
        if (i17 == 2) {
            android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
            android.os.Looper looper = (android.os.Looper) objArr[1];
            android.graphics.Matrix m145412xe5ca94b6 = l95.c.m145412xe5ca94b6(looper);
            float[] m145413xf00d6f43 = l95.c.m145413xf00d6f43(looper);
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
            m145414xacbd08c9.setColor(-16777216);
            float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 14.0f, 0.0f, 0.0f, 1.0f);
            m145412xe5ca94b6.reset();
            m145412xe5ca94b6.setValues(m145419x1d8aec80);
            canvas.concat(m145412xe5ca94b6);
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(52.015984f, 26.5f);
            m145417xd4061a5a.cubicTo(52.84441f, 26.5f, 53.515984f, 27.171574f, 53.515984f, 28.0f);
            m145417xd4061a5a.cubicTo(53.515984f, 28.470095f, 53.295597f, 28.913002f, 52.920616f, 29.19651f);
            m145417xd4061a5a.lineTo(34.561848f, 43.076824f);
            m145417xd4061a5a.cubicTo(34.033195f, 43.476513f, 33.280624f, 43.37197f, 32.88093f, 42.84332f);
            m145417xd4061a5a.cubicTo(32.647045f, 42.53397f, 32.577076f, 42.130657f, 32.693104f, 41.7606f);
            m145417xd4061a5a.lineTo(35.596638f, 32.5f);
            m145417xd4061a5a.lineTo(1.5f, 32.5f);
            m145417xd4061a5a.lineTo(1.5f, 26.5f);
            m145417xd4061a5a.lineTo(52.015984f, 26.5f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(21.115791f, 1.1566801f);
            m145417xd4061a5a.cubicTo(21.349678f, 1.4660312f, 21.419645f, 1.8693439f, 21.30362f, 2.2393975f);
            m145417xd4061a5a.lineTo(18.400084f, 11.5f);
            m145417xd4061a5a.lineTo(52.5f, 11.5f);
            m145417xd4061a5a.lineTo(52.5f, 17.5f);
            m145417xd4061a5a.lineTo(1.9807396f, 17.5f);
            m145417xd4061a5a.cubicTo(1.1523125f, 17.5f, 0.48073965f, 16.828426f, 0.48073965f, 16.0f);
            m145417xd4061a5a.cubicTo(0.48073965f, 15.529904f, 0.70112365f, 15.086998f, 1.0761067f, 14.803489f);
            m145417xd4061a5a.lineTo(19.434875f, 0.92317754f);
            m145417xd4061a5a.cubicTo(19.963528f, 0.52348554f, 20.716099f, 0.6280282f, 21.115791f, 1.1566801f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
            canvas.restore();
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
