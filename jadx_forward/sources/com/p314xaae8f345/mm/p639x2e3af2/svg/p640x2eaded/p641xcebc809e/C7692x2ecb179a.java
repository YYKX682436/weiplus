package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_selected_game */
/* loaded from: classes16.dex */
public class C7692x2ecb179a extends l95.c {

    /* renamed from: width */
    private final int f22583x6be2dc6 = 60;

    /* renamed from: height */
    private final int f22582xb7389127 = 60;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 60;
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
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(-15616);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(0.0f, 6.4f);
        m145417xd4061a5a.cubicTo(0.0f, 2.8653774f, 2.8653774f, 0.0f, 6.4f, 0.0f);
        m145417xd4061a5a.lineTo(41.6f, 0.0f);
        m145417xd4061a5a.cubicTo(45.13462f, 0.0f, 48.0f, 2.8653774f, 48.0f, 6.4f);
        m145417xd4061a5a.lineTo(48.0f, 41.6f);
        m145417xd4061a5a.cubicTo(48.0f, 45.13462f, 45.13462f, 48.0f, 41.6f, 48.0f);
        m145417xd4061a5a.lineTo(6.4f, 48.0f);
        m145417xd4061a5a.cubicTo(2.8653774f, 48.0f, 0.0f, 45.13462f, 0.0f, 41.6f);
        m145417xd4061a5a.lineTo(0.0f, 6.4f);
        m145417xd4061a5a.close();
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-1);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(37.20189f, 9.6f);
        m145417xd4061a5a2.lineTo(41.72737f, 14.1254835f);
        m145417xd4061a5a2.lineTo(23.89f, 31.962f);
        m145417xd4061a5a2.lineTo(23.91362f, 31.98589f);
        m145417xd4061a5a2.lineTo(19.388138f, 36.51137f);
        m145417xd4061a5a2.lineTo(6.4f, 23.523235f);
        m145417xd4061a5a2.lineTo(10.925484f, 18.997753f);
        m145417xd4061a5a2.lineTo(19.365f, 27.437f);
        m145417xd4061a5a2.lineTo(37.20189f, 9.6f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
