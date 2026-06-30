package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_microphone_mute_on_light */
/* loaded from: classes16.dex */
public class C9015xfa8a011f extends l95.c {

    /* renamed from: width */
    private final int f25229x6be2dc6 = 32;

    /* renamed from: height */
    private final int f25228xb7389127 = 32;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
        }
        if (i17 != 2) {
            return 0;
        }
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
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 4.5f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(-436207616);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(10.0f, 0.0f);
        m145417xd4061a5a.cubicTo(6.6863f, 0.0f, 4.0f, 2.68629f, 4.0f, 6.0f);
        m145417xd4061a5a.lineTo(4.0f, 14.0f);
        m145417xd4061a5a.cubicTo(4.0f, 16.76061f, 5.8644f, 19.08581f, 8.4027f, 19.78511f);
        m145417xd4061a5a.cubicTo(8.4168f, 19.23271f, 8.4851f, 18.69371f, 8.6025f, 18.17341f);
        m145417xd4061a5a.cubicTo(6.8575f, 17.58931f, 5.6f, 15.94151f, 5.6f, 14.0f);
        m145417xd4061a5a.lineTo(5.6f, 6.0f);
        m145417xd4061a5a.cubicTo(5.6f, 3.56995f, 7.5699f, 1.6f, 10.0f, 1.6f);
        m145417xd4061a5a.cubicTo(12.4301f, 1.6f, 14.4f, 3.56995f, 14.4f, 6.0f);
        m145417xd4061a5a.lineTo(14.4f, 12.04791f);
        m145417xd4061a5a.cubicTo(14.9146f, 11.90151f, 15.4497f, 11.80371f, 16.0f, 11.75981f);
        m145417xd4061a5a.lineTo(16.0f, 6.0f);
        m145417xd4061a5a.cubicTo(16.0f, 2.68629f, 13.3137f, 0.0f, 10.0f, 0.0f);
        m145417xd4061a5a.close();
        m145417xd4061a5a.moveTo(8.7253f, 22.30391f);
        m145417xd4061a5a.cubicTo(9.1153f, 23.65061f, 9.8386f, 24.85571f, 10.8f, 25.82411f);
        m145417xd4061a5a.lineTo(10.8f, 28.00001f);
        m145417xd4061a5a.lineTo(9.2f, 28.00001f);
        m145417xd4061a5a.lineTo(9.2f, 23.96851f);
        m145417xd4061a5a.cubicTo(4.0512f, 23.56091f, 0.0f, 19.25361f, 0.0f, 14.00001f);
        m145417xd4061a5a.lineTo(0.0f, 12.00001f);
        m145417xd4061a5a.lineTo(1.6f, 12.00001f);
        m145417xd4061a5a.lineTo(1.6f, 14.00001f);
        m145417xd4061a5a.cubicTo(1.6f, 18.20581f, 4.691f, 21.68971f, 8.7253f, 22.30391f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-372399);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(16.6667f, 13.33301f);
        m145417xd4061a5a2.cubicTo(20.3486f, 13.33301f, 23.3333f, 16.31781f, 23.3333f, 19.99971f);
        m145417xd4061a5a2.cubicTo(23.3333f, 23.68161f, 20.3486f, 26.66631f, 16.6667f, 26.66631f);
        m145417xd4061a5a2.cubicTo(12.9848f, 26.66631f, 10.0f, 23.68161f, 10.0f, 19.99971f);
        m145417xd4061a5a2.cubicTo(10.0f, 16.31781f, 12.9848f, 13.33301f, 16.6667f, 13.33301f);
        m145417xd4061a5a2.close();
        m145417xd4061a5a2.moveTo(12.563f, 17.02741f);
        m145417xd4061a5a2.cubicTo(11.9572f, 17.86231f, 11.6f, 18.88931f, 11.6f, 19.99971f);
        m145417xd4061a5a2.cubicTo(11.6f, 22.79791f, 13.8684f, 25.06631f, 16.6667f, 25.06631f);
        m145417xd4061a5a2.cubicTo(17.7771f, 25.06631f, 18.8041f, 24.70911f, 19.639f, 24.10331f);
        m145417xd4061a5a2.lineTo(12.563f, 17.02741f);
        m145417xd4061a5a2.close();
        m145417xd4061a5a2.moveTo(13.6944f, 15.89601f);
        m145417xd4061a5a2.lineTo(20.7703f, 22.97201f);
        m145417xd4061a5a2.cubicTo(21.3761f, 22.13711f, 21.7333f, 21.11011f, 21.7333f, 19.99971f);
        m145417xd4061a5a2.cubicTo(21.7333f, 17.20141f, 19.4649f, 14.93301f, 16.6667f, 14.93301f);
        m145417xd4061a5a2.cubicTo(15.5563f, 14.93301f, 14.5293f, 15.29021f, 13.6944f, 15.89601f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
