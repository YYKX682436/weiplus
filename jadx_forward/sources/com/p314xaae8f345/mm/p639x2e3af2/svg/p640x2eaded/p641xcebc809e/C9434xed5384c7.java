package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.media_player_btn_cur_status_off */
/* loaded from: classes16.dex */
public class C9434xed5384c7 extends l95.c {

    /* renamed from: width */
    private final int f26069x6be2dc6 = 32;

    /* renamed from: height */
    private final int f26068xb7389127 = 32;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 32;
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
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, -1.8369701E-16f, -1.0f, 33.0f, 1.0f, -1.8369701E-16f, -1.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(17.83205f, 11.2480755f);
                m145417xd4061a5a2.lineTo(23.963533f, 20.4453f);
                m145417xd4061a5a2.cubicTo(24.269886f, 20.904829f, 24.145712f, 21.525698f, 23.686184f, 21.83205f);
                m145417xd4061a5a2.cubicTo(23.521915f, 21.941563f, 23.328907f, 22.0f, 23.131483f, 22.0f);
                m145417xd4061a5a2.lineTo(10.868517f, 22.0f);
                m145417xd4061a5a2.cubicTo(10.316233f, 22.0f, 9.868517f, 21.552284f, 9.868517f, 21.0f);
                m145417xd4061a5a2.cubicTo(9.868517f, 20.802574f, 9.926955f, 20.609568f, 10.036467f, 20.4453f);
                m145417xd4061a5a2.lineTo(16.16795f, 11.2480755f);
                m145417xd4061a5a2.cubicTo(16.474302f, 10.788547f, 17.095171f, 10.664372f, 17.5547f, 10.970725f);
                m145417xd4061a5a2.cubicTo(17.664553f, 11.043961f, 17.758816f, 11.138224f, 17.83205f, 11.2480755f);
                m145417xd4061a5a2.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
                canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c9);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
