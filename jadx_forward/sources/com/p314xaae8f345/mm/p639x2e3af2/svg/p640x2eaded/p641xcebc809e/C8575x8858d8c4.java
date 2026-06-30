package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_eyes_on */
/* loaded from: classes16.dex */
public class C8575x8858d8c4 extends l95.c {

    /* renamed from: width */
    private final int f24349x6be2dc6 = 72;

    /* renamed from: height */
    private final int f24348xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                l95.c.m145414xacbd08c9(m145415xacbd08c92, looper).setStrokeWidth(1.0f);
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-16777216);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(3.0f, 36.0f);
                m145417xd4061a5a.cubicTo(9.08381f, 23.542883f, 21.576628f, 15.0f, 36.0f, 15.0f);
                m145417xd4061a5a.cubicTo(50.42337f, 15.0f, 62.91619f, 23.542883f, 69.0f, 36.0f);
                m145417xd4061a5a.cubicTo(62.91619f, 48.45712f, 50.42337f, 57.0f, 36.0f, 57.0f);
                m145417xd4061a5a.cubicTo(21.576628f, 57.0f, 9.08381f, 48.45712f, 3.0f, 36.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(36.0f, 46.5f);
                m145417xd4061a5a.cubicTo(41.79899f, 46.5f, 46.5f, 41.79899f, 46.5f, 36.0f);
                m145417xd4061a5a.cubicTo(46.5f, 30.20101f, 41.79899f, 25.5f, 36.0f, 25.5f);
                m145417xd4061a5a.cubicTo(30.20101f, 25.5f, 25.5f, 30.20101f, 25.5f, 36.0f);
                m145417xd4061a5a.cubicTo(25.5f, 41.79899f, 30.20101f, 46.5f, 36.0f, 46.5f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
