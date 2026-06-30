package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chatting_item_notify_msg_more */
/* loaded from: classes16.dex */
public class C7661x6467c4b6 extends l95.c {

    /* renamed from: width */
    private final int f22521x6be2dc6 = 24;

    /* renamed from: height */
    private final int f22520xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c92, looper);
        m145414xacbd08c9.setStrokeWidth(1.0f);
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-2565928);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(0.0f, 0.0f);
        m145417xd4061a5a.lineTo(24.0f, 0.0f);
        m145417xd4061a5a.lineTo(24.0f, 24.0f);
        m145417xd4061a5a.lineTo(0.0f, 24.0f);
        m145417xd4061a5a.lineTo(0.0f, 0.0f);
        m145417xd4061a5a.close();
        canvas.saveLayerAlpha(null, 0, 31);
        canvas.drawPath(m145417xd4061a5a, l95.c.m145414xacbd08c9(m145414xacbd08c92, looper));
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        m145414xacbd08c93.setStrokeWidth(1.0f);
        float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 1.5f, 0.0f, 1.0f, 5.0f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec80);
        canvas.concat(m145412xe5ca94b6);
        canvas.save();
        android.graphics.Paint m145414xacbd08c94 = l95.c.m145414xacbd08c9(m145414xacbd08c93, looper);
        m145414xacbd08c94.setColor(855638016);
        m145414xacbd08c94.setStrokeWidth(0.5f);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(0.25f, 7.0f);
        m145417xd4061a5a2.cubicTo(0.25f, 3.2720778f, 3.2720778f, 0.25f, 7.0f, 0.25f);
        m145417xd4061a5a2.lineTo(14.0f, 0.25f);
        m145417xd4061a5a2.cubicTo(17.727922f, 0.25f, 20.75f, 3.2720778f, 20.75f, 7.0f);
        m145417xd4061a5a2.lineTo(20.75f, 7.0f);
        m145417xd4061a5a2.cubicTo(20.75f, 10.727922f, 17.727922f, 13.75f, 14.0f, 13.75f);
        m145417xd4061a5a2.lineTo(7.0f, 13.75f);
        m145417xd4061a5a2.cubicTo(3.2720778f, 13.75f, 0.25f, 10.727922f, 0.25f, 7.0f);
        m145417xd4061a5a2.lineTo(0.25f, 7.0f);
        m145417xd4061a5a2.close();
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c94);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c95 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c95.setColor(855638016);
        float[] m145419x1d8aec802 = l95.c.m145419x1d8aec80(m145419x1d8aec80, 0.70710677f, -0.70710677f, 7.9091887f, 0.70710677f, 0.70710677f, -5.2091885f, 0.0f, 0.0f, 1.0f);
        m145412xe5ca94b6.reset();
        m145412xe5ca94b6.setValues(m145419x1d8aec802);
        canvas.concat(m145412xe5ca94b6);
        android.graphics.Path m145417xd4061a5a3 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a3.moveTo(10.7426405f, 3.9426408f);
        m145417xd4061a5a3.lineTo(10.7426405f, 6.441641f);
        m145417xd4061a5a3.lineTo(13.2426405f, 6.442641f);
        m145417xd4061a5a3.lineTo(13.2426405f, 7.442641f);
        m145417xd4061a5a3.lineTo(10.7426405f, 7.441641f);
        m145417xd4061a5a3.lineTo(10.7426405f, 9.94264f);
        m145417xd4061a5a3.lineTo(9.7426405f, 9.94264f);
        m145417xd4061a5a3.lineTo(9.7426405f, 7.441641f);
        m145417xd4061a5a3.lineTo(7.2426405f, 7.442641f);
        m145417xd4061a5a3.lineTo(7.2426405f, 6.442641f);
        m145417xd4061a5a3.lineTo(9.7426405f, 6.441641f);
        m145417xd4061a5a3.lineTo(9.7426405f, 3.9426408f);
        m145417xd4061a5a3.lineTo(10.7426405f, 3.9426408f);
        m145417xd4061a5a3.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a3, 2);
        canvas.drawPath(m145417xd4061a5a3, m145414xacbd08c95);
        canvas.restore();
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
