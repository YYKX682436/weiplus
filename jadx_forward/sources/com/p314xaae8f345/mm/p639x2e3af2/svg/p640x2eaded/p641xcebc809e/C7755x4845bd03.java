package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.count_down_0 */
/* loaded from: classes16.dex */
public class C7755x4845bd03 extends l95.c {

    /* renamed from: width */
    private final int f22709x6be2dc6 = 80;

    /* renamed from: height */
    private final int f22708xb7389127 = 80;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 80;
        }
        if (i17 == 2) {
            android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
            android.os.Looper looper = (android.os.Looper) objArr[1];
            l95.c.m145412xe5ca94b6(looper);
            l95.c.m145413xf00d6f43(looper);
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
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(39.576f, 13.0f);
            m145417xd4061a5a.cubicTo(45.624f, 13.0f, 50.304f, 15.52f, 53.616f, 20.632f);
            m145417xd4061a5a.cubicTo(56.64f, 25.384f, 58.152f, 31.72f, 58.152f, 39.712f);
            m145417xd4061a5a.cubicTo(58.152f, 47.632f, 56.64f, 54.04f, 53.616f, 58.792f);
            m145417xd4061a5a.cubicTo(50.304f, 63.832f, 45.624f, 66.424f, 39.576f, 66.424f);
            m145417xd4061a5a.cubicTo(33.528f, 66.424f, 28.848f, 63.832f, 25.536f, 58.792f);
            m145417xd4061a5a.cubicTo(22.512f, 54.04f, 21.0f, 47.704f, 21.0f, 39.712f);
            m145417xd4061a5a.cubicTo(21.0f, 31.648f, 22.512f, 25.312f, 25.536f, 20.632f);
            m145417xd4061a5a.cubicTo(28.848f, 15.52f, 33.528f, 13.0f, 39.576f, 13.0f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(39.576f, 19.624f);
            m145417xd4061a5a.cubicTo(35.328f, 19.624f, 32.376f, 21.928f, 30.648f, 26.608f);
            m145417xd4061a5a.cubicTo(29.352f, 29.776f, 28.776f, 34.168f, 28.776f, 39.712f);
            m145417xd4061a5a.cubicTo(28.776f, 45.184f, 29.352f, 49.576f, 30.648f, 52.816f);
            m145417xd4061a5a.cubicTo(32.376f, 57.424f, 35.328f, 59.8f, 39.576f, 59.8f);
            m145417xd4061a5a.cubicTo(43.752f, 59.8f, 46.776f, 57.424f, 48.504f, 52.816f);
            m145417xd4061a5a.cubicTo(49.728f, 49.576f, 50.376f, 45.184f, 50.376f, 39.712f);
            m145417xd4061a5a.cubicTo(50.376f, 34.168f, 49.728f, 29.776f, 48.504f, 26.608f);
            m145417xd4061a5a.cubicTo(46.776f, 21.928f, 43.752f, 19.624f, 39.576f, 19.624f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
