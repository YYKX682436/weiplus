package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.top_story_upload_play */
/* loaded from: classes16.dex */
public class C10068xe4ca3dfe extends l95.c {

    /* renamed from: width */
    private final int f27339x6be2dc6 = 24;

    /* renamed from: height */
    private final int f27338xb7389127 = 24;

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
                m145414xacbd08c9.setColor(-1);
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, -65.0f, 0.0f, 1.0f, -131.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                float[] m145419x1d8aec802 = l95.c.m145419x1d8aec80(m145419x1d8aec80, 1.0f, 0.0f, 65.0f, 0.0f, 1.0f, 131.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec802);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(12.0f, 24.0f);
                m145417xd4061a5a.cubicTo(5.372583f, 24.0f, 0.0f, 18.627417f, 0.0f, 12.0f);
                m145417xd4061a5a.cubicTo(0.0f, 5.372583f, 5.372583f, 0.0f, 12.0f, 0.0f);
                m145417xd4061a5a.cubicTo(18.627417f, 0.0f, 24.0f, 5.372583f, 24.0f, 12.0f);
                m145417xd4061a5a.cubicTo(24.0f, 18.627417f, 18.627417f, 24.0f, 12.0f, 24.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(12.0f, 22.333334f);
                m145417xd4061a5a.cubicTo(17.706942f, 22.333334f, 22.333334f, 17.706942f, 22.333334f, 12.0f);
                m145417xd4061a5a.cubicTo(22.333334f, 6.2930574f, 17.706942f, 1.6666666f, 12.0f, 1.6666666f);
                m145417xd4061a5a.cubicTo(6.2930574f, 1.6666666f, 1.6666666f, 6.2930574f, 1.6666666f, 12.0f);
                m145417xd4061a5a.cubicTo(1.6666666f, 17.706942f, 6.2930574f, 22.333334f, 12.0f, 22.333334f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                canvas.save();
                android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(13.666667f, 11.666667f);
                m145417xd4061a5a2.lineTo(13.666667f, 13.624764f);
                m145417xd4061a5a2.lineTo(13.666667f, 14.916196f);
                m145417xd4061a5a2.cubicTo(13.666667f, 15.154654f, 13.482121f, 15.333324f, 13.254474f, 15.333315f);
                m145417xd4061a5a2.lineTo(6.4121933f, 15.333003f);
                m145417xd4061a5a2.cubicTo(6.189514f, 15.332993f, 6.0f, 15.146587f, 6.0f, 14.916656f);
                m145417xd4061a5a2.lineTo(6.0f, 9.093866f);
                m145417xd4061a5a2.cubicTo(6.0f, 8.869545f, 6.184545f, 8.677277f, 6.4121933f, 8.676953f);
                m145417xd4061a5a2.lineTo(13.254474f, 8.667252f);
                m145417xd4061a5a2.cubicTo(13.477153f, 8.666935f, 13.666667f, 8.853425f, 13.666667f, 9.083804f);
                m145417xd4061a5a2.lineTo(13.666667f, 11.666667f);
                m145417xd4061a5a2.close();
                m145417xd4061a5a2.moveTo(14.666667f, 10.752296f);
                m145417xd4061a5a2.cubicTo(15.714527f, 9.888178f, 17.115644f, 8.891267f, 17.5f, 8.677538f);
                m145417xd4061a5a2.cubicTo(17.615805f, 8.618451f, 18.0f, 8.80178f, 18.0f, 9.189495f);
                m145417xd4061a5a2.lineTo(18.0f, 14.821027f);
                m145417xd4061a5a2.cubicTo(18.0f, 15.089015f, 17.652575f, 15.344082f, 17.5f, 15.332984f);
                m145417xd4061a5a2.cubicTo(17.179924f, 15.098051f, 15.743977f, 14.046944f, 14.666667f, 13.185655f);
                m145417xd4061a5a2.lineTo(14.666667f, 10.752296f);
                m145417xd4061a5a2.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
                canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c93);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
