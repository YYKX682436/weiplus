package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ofm_audio_icon */
/* loaded from: classes16.dex */
public class C9606xdb3511ab extends l95.c {

    /* renamed from: width */
    private final int f26413x6be2dc6 = 96;

    /* renamed from: height */
    private final int f26412xb7389127 = 96;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 96;
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
                m145414xacbd08c9.setColor(-1);
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 20.0f, 0.0f, 1.0f, 19.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(2.253182f, 8.691923f);
                m145417xd4061a5a.cubicTo(4.7252164f, 5.0494986f, 8.263815f, 2.0657039f, 12.131352f, -3.5527137E-15f);
                m145417xd4061a5a.cubicTo(14.832648f, 0.5189208f, 15.699854f, 3.8819268f, 17.404362f, 5.748046f);
                m145417xd4061a5a.cubicTo(19.068998f, 8.801695f, 22.458078f, 11.346403f, 22.747147f, 14.8590975f);
                m145417xd4061a5a.cubicTo(20.334919f, 17.693203f, 16.547125f, 18.850796f, 13.327498f, 20.52731f);
                m145417xd4061a5a.cubicTo(15.231364f, 26.904047f, 19.736847f, 32.053337f, 24.511461f, 36.50408f);
                m145417xd4061a5a.cubicTo(27.77096f, 39.537773f, 31.52885f, 42.09246f, 35.805073f, 43.459618f);
                m145417xd4061a5a.cubicTo(37.50958f, 40.186424f, 38.596077f, 36.27456f, 41.466827f, 33.8496f);
                m145417xd4061a5a.cubicTo(44.98549f, 34.27871f, 47.477463f, 37.71157f, 50.527634f, 39.43798f);
                m145417xd4061a5a.cubicTo(52.331818f, 41.124474f, 55.501606f, 41.99267f, 56.0f, 44.63717f);
                m145417xd4061a5a.cubicTo(54.056263f, 48.439262f, 51.23535f, 51.89208f, 47.84627f, 54.486683f);
                m145417xd4061a5a.cubicTo(45.08517f, 56.67214f, 41.31731f, 56.213093f, 38.30701f, 54.855915f);
                m145417xd4061a5a.cubicTo(22.009523f, 48.020134f, 8.732305f, 34.40844f, 2.1435351f, 18.00256f);
                m145417xd4061a5a.cubicTo(0.9573573f, 15.048703f, 0.26957348f, 11.486113f, 2.253182f, 8.691923f);
                m145417xd4061a5a.lineTo(2.253182f, 8.691923f);
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
