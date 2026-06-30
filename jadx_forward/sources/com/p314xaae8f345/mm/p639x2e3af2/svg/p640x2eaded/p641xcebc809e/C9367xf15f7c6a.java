package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.login_showpassword_icon */
/* loaded from: classes16.dex */
public class C9367xf15f7c6a extends l95.c {

    /* renamed from: width */
    private final int f25935x6be2dc6 = 96;

    /* renamed from: height */
    private final int f25934xb7389127 = 96;

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
                m145414xacbd08c9.setColor(-2500135);
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 14.0f, 0.0f, 1.0f, 27.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(0.0f, 21.0f);
                m145417xd4061a5a.cubicTo(6.541142f, 9.067516f, 19.195314f, 0.2773516f, 33.0f, -3.5527137E-15f);
                m145417xd4061a5a.cubicTo(47.47057f, -0.56266415f, 61.090485f, 8.457505f, 68.0f, 21.0f);
                m145417xd4061a5a.cubicTo(61.279648f, 33.217968f, 48.147583f, 42.128136f, 34.0f, 42.0f);
                m145417xd4061a5a.cubicTo(19.862371f, 42.148136f, 6.7402635f, 33.23797f, 0.0f, 21.0f);
                m145417xd4061a5a.lineTo(0.0f, 21.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(30.0f, 10.0f);
                m145417xd4061a5a.cubicTo(26.510271f, 10.850008f, 23.349888f, 14.148959f, 22.0f, 18.0f);
                m145417xd4061a5a.cubicTo(20.448715f, 24.932842f, 25.872211f, 32.447674f, 33.0f, 33.0f);
                m145417xd4061a5a.cubicTo(40.05904f, 33.833035f, 46.808502f, 27.08563f, 46.0f, 20.0f);
                m145417xd4061a5a.cubicTo(45.492508f, 12.574233f, 37.337322f, 7.1324587f, 30.0f, 10.0f);
                m145417xd4061a5a.lineTo(30.0f, 10.0f);
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
