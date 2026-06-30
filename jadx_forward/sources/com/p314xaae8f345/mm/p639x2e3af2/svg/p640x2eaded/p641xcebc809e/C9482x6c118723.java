package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.more_icon */
/* loaded from: classes16.dex */
public class C9482x6c118723 extends l95.c {

    /* renamed from: width */
    private final int f26165x6be2dc6 = 24;

    /* renamed from: height */
    private final int f26164xb7389127 = 24;

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
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-436207616);
                canvas.save();
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 10.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(3.75f, 2.0f);
                m145417xd4061a5a.cubicTo(3.75f, 2.96635f, 2.96635f, 3.75f, 2.0f, 3.75f);
                m145417xd4061a5a.cubicTo(1.03365f, 3.75f, 0.25f, 2.96635f, 0.25f, 2.0f);
                m145417xd4061a5a.cubicTo(0.25f, 1.0333f, 1.03365f, 0.25f, 2.0f, 0.25f);
                m145417xd4061a5a.cubicTo(2.96635f, 0.25f, 3.75f, 1.0333f, 3.75f, 2.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(9.0f, 0.25f);
                m145417xd4061a5a.cubicTo(9.96635f, 0.25f, 10.75f, 1.0333f, 10.75f, 2.0f);
                m145417xd4061a5a.cubicTo(10.75f, 2.96635f, 9.96635f, 3.75f, 9.0f, 3.75f);
                m145417xd4061a5a.cubicTo(8.03365f, 3.75f, 7.25f, 2.96635f, 7.25f, 2.0f);
                m145417xd4061a5a.cubicTo(7.25f, 1.0333f, 8.03365f, 0.25f, 9.0f, 0.25f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(16.0f, 0.25f);
                m145417xd4061a5a.cubicTo(16.96635f, 0.25f, 17.75f, 1.0333f, 17.75f, 2.0f);
                m145417xd4061a5a.cubicTo(17.75f, 2.96635f, 16.96635f, 3.75f, 16.0f, 3.75f);
                m145417xd4061a5a.cubicTo(15.03365f, 3.75f, 14.25f, 2.96635f, 14.25f, 2.0f);
                m145417xd4061a5a.cubicTo(14.25f, 1.0333f, 15.03365f, 0.25f, 16.0f, 0.25f);
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
