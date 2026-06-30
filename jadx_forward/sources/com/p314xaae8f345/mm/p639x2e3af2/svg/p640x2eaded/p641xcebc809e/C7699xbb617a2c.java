package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_selected_remove */
/* loaded from: classes16.dex */
public class C7699xbb617a2c extends l95.c {

    /* renamed from: width */
    private final int f22597x6be2dc6 = 24;

    /* renamed from: height */
    private final int f22596xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 24;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-372399);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(1.2002f, 11.99995f);
                m145417xd4061a5a.cubicTo(1.2002f, 6.0352745f, 6.0355244f, 1.19995f, 12.0002f, 1.19995f);
                m145417xd4061a5a.lineTo(12.000199f, 1.19995f);
                m145417xd4061a5a.cubicTo(17.964874f, 1.19995f, 22.8002f, 6.0352745f, 22.8002f, 11.99995f);
                m145417xd4061a5a.lineTo(22.8002f, 11.999949f);
                m145417xd4061a5a.cubicTo(22.8002f, 17.964626f, 17.964874f, 22.79995f, 12.000199f, 22.79995f);
                m145417xd4061a5a.lineTo(12.0002f, 22.79995f);
                m145417xd4061a5a.cubicTo(6.0355244f, 22.79995f, 1.2002f, 17.964626f, 1.2002f, 11.999949f);
                m145417xd4061a5a.lineTo(1.2002f, 11.99995f);
                m145417xd4061a5a.close();
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
                canvas.restore();
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c92.setColor(-1);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(11.3695f, 11.3706f);
                m145417xd4061a5a2.lineTo(12.6295f, 11.3706f);
                m145417xd4061a5a2.lineTo(17.3545f, 11.3706f);
                m145417xd4061a5a2.lineTo(17.3545f, 12.6307f);
                m145417xd4061a5a2.lineTo(12.6295f, 12.6307f);
                m145417xd4061a5a2.lineTo(11.3695f, 12.6307f);
                m145417xd4061a5a2.lineTo(6.64453f, 12.6307f);
                m145417xd4061a5a2.lineTo(6.64453f, 11.3706f);
                m145417xd4061a5a2.lineTo(11.3695f, 11.3706f);
                m145417xd4061a5a2.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
                canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
