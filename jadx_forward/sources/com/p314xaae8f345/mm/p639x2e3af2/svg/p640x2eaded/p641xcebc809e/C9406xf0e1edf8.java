package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.mall_index_bankcard_bind */
/* loaded from: classes16.dex */
public class C9406xf0e1edf8 extends l95.c {

    /* renamed from: width */
    private final int f26013x6be2dc6 = 90;

    /* renamed from: height */
    private final int f26012xb7389127 = 70;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 90;
        }
        if (i17 == 1) {
            return 70;
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
            m145414xacbd08c9.setColor(-1);
            float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f);
            m145412xe5ca94b6.reset();
            m145412xe5ca94b6.setValues(m145419x1d8aec80);
            canvas.concat(m145412xe5ca94b6);
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(0.0f, 4.4922566f);
            m145417xd4061a5a.cubicTo(0.46f, 1.6837293f, 3.04f, -0.3052276f, 5.88f, 0.044588927f);
            m145417xd4061a5a.cubicTo(31.95f, 0.02459941f, 58.02f, 0.03459417f, 84.09f, 0.044588927f);
            m145417xd4061a5a.cubicTo(86.85f, -0.31522238f, 89.24f, 1.5438027f, 90.0f, 4.1324453f);
            m145417xd4061a5a.lineTo(90.0f, 61.532345f);
            m145417xd4061a5a.cubicTo(89.6f, 63.73119f, 88.0f, 65.33035f, 85.92f, 66.0f);
            m145417xd4061a5a.lineTo(4.35f, 66.0f);
            m145417xd4061a5a.cubicTo(2.2f, 65.55024f, 0.66f, 63.94108f, 0.0f, 61.892155f);
            m145417xd4061a5a.lineTo(0.0f, 4.4922566f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(7.0f, 14.0f);
            m145417xd4061a5a.lineTo(83.0f, 14.0f);
            m145417xd4061a5a.lineTo(83.0f, 26.0f);
            m145417xd4061a5a.lineTo(7.0f, 26.0f);
            m145417xd4061a5a.lineTo(7.0f, 14.0f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
            canvas.restore();
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
