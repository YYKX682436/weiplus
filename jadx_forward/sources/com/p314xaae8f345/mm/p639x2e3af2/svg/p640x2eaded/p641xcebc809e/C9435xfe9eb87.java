package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.media_player_btn_cur_status_on */
/* loaded from: classes16.dex */
public class C9435xfe9eb87 extends l95.c {

    /* renamed from: width */
    private final int f26071x6be2dc6 = 32;

    /* renamed from: height */
    private final int f26070xb7389127 = 32;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(0.0f, 0.0f);
        m145417xd4061a5a.lineTo(32.0f, 0.0f);
        m145417xd4061a5a.lineTo(32.0f, 32.0f);
        m145417xd4061a5a.lineTo(0.0f, 32.0f);
        m145417xd4061a5a.lineTo(0.0f, 0.0f);
        m145417xd4061a5a.close();
        canvas.save();
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(-1);
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(0.0f, 1.0f);
        m145417xd4061a5a2.cubicTo(0.0f, 0.44771522f, 0.44771522f, 0.0f, 1.0f, 0.0f);
        m145417xd4061a5a2.lineTo(3.0f, 0.0f);
        m145417xd4061a5a2.cubicTo(3.5522847f, 0.0f, 4.0f, 0.44771522f, 4.0f, 1.0f);
        m145417xd4061a5a2.lineTo(4.0f, 13.0f);
        m145417xd4061a5a2.cubicTo(4.0f, 13.552285f, 3.5522847f, 14.0f, 3.0f, 14.0f);
        m145417xd4061a5a2.lineTo(1.0f, 14.0f);
        m145417xd4061a5a2.cubicTo(0.44771522f, 14.0f, 0.0f, 13.552285f, 0.0f, 13.0f);
        m145417xd4061a5a2.lineTo(0.0f, 1.0f);
        m145417xd4061a5a2.close();
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        android.graphics.Path m145417xd4061a5a3 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a3.moveTo(8.0f, 1.0f);
        m145417xd4061a5a3.cubicTo(8.0f, 0.44771522f, 8.447715f, 0.0f, 9.0f, 0.0f);
        m145417xd4061a5a3.lineTo(11.0f, 0.0f);
        m145417xd4061a5a3.cubicTo(11.552285f, 0.0f, 12.0f, 0.44771522f, 12.0f, 1.0f);
        m145417xd4061a5a3.lineTo(12.0f, 13.0f);
        m145417xd4061a5a3.cubicTo(12.0f, 13.552285f, 11.552285f, 14.0f, 11.0f, 14.0f);
        m145417xd4061a5a3.lineTo(9.0f, 14.0f);
        m145417xd4061a5a3.cubicTo(8.447715f, 14.0f, 8.0f, 13.552285f, 8.0f, 13.0f);
        m145417xd4061a5a3.lineTo(8.0f, 1.0f);
        m145417xd4061a5a3.close();
        canvas.drawPath(m145417xd4061a5a3, m145414xacbd08c93);
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
