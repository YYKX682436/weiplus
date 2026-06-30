package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chatfrom_voice_playing_f3_dark */
/* loaded from: classes16.dex */
public class C7635x139bda4d extends l95.c {

    /* renamed from: width */
    private final int f22469x6be2dc6 = 72;

    /* renamed from: height */
    private final int f22468xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        canvas.saveLayerAlpha(null, 204, 31);
        canvas.save();
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, -1.0f, 0.0f, 72.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.restore();
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(-1);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(52.5f, 36.0f);
        m145417xd4061a5a.cubicTo(52.5f, 45.37258f, 48.80635f, 53.857864f, 42.834522f, 60.0f);
        m145417xd4061a5a.lineTo(39.334347f, 56.4f);
        m145417xd4061a5a.cubicTo(44.410397f, 51.179184f, 47.55f, 43.966694f, 47.55f, 36.0f);
        m145417xd4061a5a.cubicTo(47.55f, 28.033304f, 44.410397f, 20.820816f, 39.334347f, 15.6f);
        m145417xd4061a5a.lineTo(42.834522f, 12.0f);
        m145417xd4061a5a.cubicTo(48.80635f, 18.142136f, 52.5f, 26.627417f, 52.5f, 36.0f);
        m145417xd4061a5a.close();
        m145417xd4061a5a.moveTo(40.95f, 36.0f);
        m145417xd4061a5a.cubicTo(40.95f, 42.09218f, 38.549126f, 47.607613f, 34.667442f, 51.6f);
        m145417xd4061a5a.lineTo(31.167261f, 48.0f);
        m145417xd4061a5a.cubicTo(34.153175f, 44.928932f, 36.0f, 40.68629f, 36.0f, 36.0f);
        m145417xd4061a5a.cubicTo(36.0f, 31.31371f, 34.153175f, 27.071068f, 31.167261f, 24.0f);
        m145417xd4061a5a.lineTo(34.668404f, 20.40099f);
        m145417xd4061a5a.cubicTo(38.549522f, 24.3933f, 40.95f, 29.908325f, 40.95f, 36.0f);
        m145417xd4061a5a.close();
        m145417xd4061a5a.moveTo(29.4f, 36.0f);
        m145417xd4061a5a.cubicTo(29.4f, 38.811775f, 28.291904f, 41.35736f, 26.500357f, 43.2f);
        m145417xd4061a5a.lineTo(19.5f, 36.0f);
        m145417xd4061a5a.lineTo(26.501314f, 28.800985f);
        m145417xd4061a5a.cubicTo(28.2923f, 30.643549f, 29.4f, 33.188725f, 29.4f, 36.0f);
        m145417xd4061a5a.close();
        canvas.saveLayerAlpha(null, 230, 31);
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
