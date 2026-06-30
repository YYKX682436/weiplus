package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.biz_voice_playing_icon_black_inner3 */
/* loaded from: classes16.dex */
public class C7509xc2c7e519 extends l95.c {

    /* renamed from: width */
    private final int f22217x6be2dc6 = 24;

    /* renamed from: height */
    private final int f22216xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                m145414xacbd08c9.setColor(-16777216);
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, -10.0f, 0.0f, 1.0f, -10.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(24.899494f, 12.0f);
                m145417xd4061a5a.cubicTo(27.432997f, 14.559223f, 29.0f, 18.094757f, 29.0f, 22.0f);
                m145417xd4061a5a.cubicTo(29.0f, 25.905243f, 27.432997f, 29.440777f, 24.899494f, 32.0f);
                m145417xd4061a5a.lineTo(23.41457f, 30.5f);
                m145417xd4061a5a.cubicTo(25.633213f, 28.258833f, 26.9f, 25.233406f, 26.9f, 22.0f);
                m145417xd4061a5a.cubicTo(26.9f, 18.766594f, 25.633213f, 15.741167f, 23.41457f, 13.5f);
                m145417xd4061a5a.lineTo(24.899494f, 12.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(21.434671f, 15.5f);
                m145417xd4061a5a.cubicTo(23.081448f, 17.163496f, 24.1f, 19.461592f, 24.1f, 22.0f);
                m145417xd4061a5a.cubicTo(24.1f, 24.538408f, 23.081448f, 26.836504f, 21.434671f, 28.5f);
                m145417xd4061a5a.lineTo(19.949747f, 27.0f);
                m145417xd4061a5a.cubicTo(21.255392f, 25.681099f, 22.0f, 23.902777f, 22.0f, 22.0f);
                m145417xd4061a5a.cubicTo(22.0f, 20.097223f, 21.255392f, 18.318901f, 19.949747f, 17.0f);
                m145417xd4061a5a.lineTo(21.434671f, 15.5f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(17.969849f, 19.0f);
                m145417xd4061a5a.cubicTo(18.729898f, 19.767767f, 19.2f, 20.828426f, 19.2f, 22.0f);
                m145417xd4061a5a.cubicTo(19.2f, 23.171574f, 18.729898f, 24.232233f, 17.969849f, 25.0f);
                m145417xd4061a5a.lineTo(17.969849f, 25.0f);
                m145417xd4061a5a.lineTo(15.0f, 22.0f);
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
