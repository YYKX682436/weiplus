package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_cell_on_dark */
/* loaded from: classes16.dex */
public class C7675x1c62def5 extends l95.c {

    /* renamed from: width */
    private final int f22549x6be2dc6 = 24;

    /* renamed from: height */
    private final int f22548xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f);
            m145412xe5ca94b6.reset();
            m145412xe5ca94b6.setValues(m145419x1d8aec80);
            canvas.concat(m145412xe5ca94b6);
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-16268960);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(22.0f, 11.135802f);
            m145417xd4061a5a.cubicTo(22.0f, 4.924741f, 17.07526f, 0.0f, 10.864198f, 0.0f);
            m145417xd4061a5a.cubicTo(4.924741f, 0.0f, 0.0f, 4.924741f, 0.0f, 11.135802f);
            m145417xd4061a5a.cubicTo(0.0f, 17.07526f, 4.924741f, 22.0f, 10.864198f, 22.0f);
            m145417xd4061a5a.cubicTo(17.07526f, 22.0f, 22.0f, 17.07526f, 22.0f, 11.135802f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c92.setColor(-1);
            android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a2.moveTo(9.363961f, 14.313708f);
            m145417xd4061a5a2.lineTo(6.0606604f, 11.010407f);
            m145417xd4061a5a2.lineTo(5.0f, 12.071068f);
            m145417xd4061a5a2.lineTo(8.656855f, 15.727922f);
            m145417xd4061a5a2.cubicTo(9.047379f, 16.118446f, 9.680544f, 16.118446f, 10.071068f, 15.727922f);
            m145417xd4061a5a2.lineTo(17.738329f, 8.06066f);
            m145417xd4061a5a2.lineTo(17.738329f, 8.06066f);
            m145417xd4061a5a2.lineTo(16.67767f, 7.0f);
            m145417xd4061a5a2.lineTo(9.363961f, 14.313708f);
            m145417xd4061a5a2.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 1);
            canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
            canvas.restore();
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
