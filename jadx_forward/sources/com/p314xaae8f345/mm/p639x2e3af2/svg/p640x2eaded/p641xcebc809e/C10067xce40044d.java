package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.top_story_tag_right_arrow */
/* loaded from: classes16.dex */
public class C10067xce40044d extends l95.c {

    /* renamed from: width */
    private final int f27337x6be2dc6 = 6;

    /* renamed from: height */
    private final int f27336xb7389127 = 11;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 6;
        }
        if (i17 == 1) {
            return 11;
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
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(-855310);
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, -80.0f, 0.0f, 1.0f, -322.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        float[] m145419x1d8aec802 = l95.c.m145419x1d8aec80(m145419x1d8aec80, 1.0f, 0.0f, 34.0f, 0.0f, 1.0f, 318.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec802);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        float[] m145419x1d8aec803 = l95.c.m145419x1d8aec80(m145419x1d8aec802, -1.0f, 0.0f, 98.0f, 0.0f, -1.0f, 19.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec803);
        canvas.concat(m145412xe5ca94b6);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(52.0f, 14.3125f);
        m145417xd4061a5a.lineTo(51.30351f, 15.0f);
        m145417xd4061a5a.lineTo(46.16417f, 9.9270115f);
        m145417xd4061a5a.cubicTo(45.928337f, 9.694224f, 45.92587f, 9.314333f, 46.158653f, 9.078502f);
        m145417xd4061a5a.cubicTo(46.16048f, 9.076652f, 46.16232f, 9.074814f, 46.16417f, 9.0729885f);
        m145417xd4061a5a.lineTo(51.30351f, 4.0f);
        m145417xd4061a5a.lineTo(52.0f, 4.6875f);
        m145417xd4061a5a.lineTo(47.124554f, 9.5f);
        m145417xd4061a5a.lineTo(52.0f, 14.3125f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
