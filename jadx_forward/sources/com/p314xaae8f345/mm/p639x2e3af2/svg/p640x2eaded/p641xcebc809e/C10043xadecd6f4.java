package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.toast_ok */
/* loaded from: classes16.dex */
public class C10043xadecd6f4 extends l95.c {

    /* renamed from: width */
    private final int f27289x6be2dc6 = be1.r0.f4232x366c91de;

    /* renamed from: height */
    private final int f27288xb7389127 = be1.r0.f4232x366c91de;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = be1.r0.f4232x366c91de;
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
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-983041);
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 30.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(0.46822503f, 59.37996f);
                m145417xd4061a5a.cubicTo(-0.09250131f, 58.791977f, -0.15752915f, 57.7783f, 0.31603217f, 57.12543f);
                m145417xd4061a5a.lineTo(6.444848f, 48.676014f);
                m145417xd4061a5a.cubicTo(6.9215207f, 48.018856f, 7.825557f, 47.88808f, 8.465721f, 48.38521f);
                m145417xd4061a5a.lineTo(44.8357f, 76.628586f);
                m145417xd4061a5a.cubicTo(45.475124f, 77.12514f, 46.492798f, 77.10621f, 47.11644f, 76.57981f);
                m145417xd4061a5a.lineTo(135.63168f, 1.8662949f);
                m145417xd4061a5a.cubicTo(136.25188f, 1.3428068f, 137.22249f, 1.3865731f, 137.79367f, 1.95812f);
                m145417xd4061a5a.lineTo(143.57062f, 7.7387013f);
                m145417xd4061a5a.cubicTo(144.14445f, 8.312903f, 144.14244f, 9.244253f, 143.56883f, 9.816216f);
                m145417xd4061a5a.lineTo(47.031418f, 106.07728f);
                m145417xd4061a5a.cubicTo(46.456593f, 106.65046f, 45.5375f, 106.63998f, 44.975323f, 106.050476f);
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
