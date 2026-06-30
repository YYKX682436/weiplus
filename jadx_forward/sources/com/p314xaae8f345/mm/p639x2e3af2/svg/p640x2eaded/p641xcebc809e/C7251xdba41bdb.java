package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.album_test_close */
/* loaded from: classes16.dex */
public class C7251xdba41bdb extends l95.c {

    /* renamed from: width */
    private final int f21701x6be2dc6 = 45;

    /* renamed from: height */
    private final int f21700xb7389127 = 45;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 45;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                m145414xacbd08c9.setColor(-11184811);
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(14.634262f, 3.4369836f);
                m145417xd4061a5a.cubicTo(15.279194f, 1.8675201f, 16.155897f, -0.3917077f, 18.31239f, 0.058138534f);
                m145417xd4061a5a.cubicTo(20.186722f, 0.08812828f, 20.589804f, 2.1574209f, 21.315353f, 3.4469802f);
                m145417xd4061a5a.cubicTo(24.09662f, 4.796519f, 26.817427f, 6.6258936f, 28.07706f, 9.564889f);
                m145417xd4061a5a.cubicTo(31.13041f, 15.372904f, 29.185537f, 22.17058f, 31.251333f, 28.218513f);
                m145417xd4061a5a.cubicTo(32.138115f, 30.637686f, 33.831062f, 32.656998f, 35.0f, 34.93622f);
                m145417xd4061a5a.cubicTo(23.673386f, 35.026188f, 12.336693f, 35.01619f, 1.0f, 34.93622f);
                m145417xd4061a5a.cubicTo(2.1487849f, 32.647f, 3.861885f, 30.657679f, 4.7486663f, 28.22851f);
                m145417xd4061a5a.cubicTo(6.8144636f, 22.190573f, 4.8595138f, 15.372904f, 7.9229403f, 9.564889f);
                m145417xd4061a5a.cubicTo(9.182572f, 6.6558833f, 11.873148f, 4.8065157f, 14.634262f, 3.4369836f);
                m145417xd4061a5a.lineTo(14.634262f, 3.4369836f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
