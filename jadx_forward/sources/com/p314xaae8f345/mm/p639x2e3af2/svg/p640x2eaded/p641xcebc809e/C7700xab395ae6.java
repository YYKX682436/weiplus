package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_selected_round */
/* loaded from: classes16.dex */
public class C7700xab395ae6 extends l95.c {

    /* renamed from: width */
    private final int f22599x6be2dc6 = 24;

    /* renamed from: height */
    private final int f22598xb7389127 = 24;

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
                l95.c.m145414xacbd08c9(m145415xacbd08c92, looper).setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-1);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(11.0f, 3.0f);
                m145417xd4061a5a.cubicTo(15.970563f, 3.0f, 20.0f, 7.029437f, 20.0f, 12.0f);
                m145417xd4061a5a.cubicTo(20.0f, 16.970562f, 15.970563f, 21.0f, 11.0f, 21.0f);
                m145417xd4061a5a.cubicTo(6.029437f, 21.0f, 2.0f, 16.970562f, 2.0f, 12.0f);
                m145417xd4061a5a.cubicTo(2.0f, 7.029437f, 6.029437f, 3.0f, 11.0f, 3.0f);
                m145417xd4061a5a.close();
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
                canvas.restore();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c92.setColor(-16268960);
                canvas.save();
                android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c92, looper);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(12.0f, 22.0f);
                m145417xd4061a5a2.cubicTo(6.4771523f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f);
                m145417xd4061a5a2.cubicTo(2.0f, 6.4771523f, 6.4771523f, 2.0f, 12.0f, 2.0f);
                m145417xd4061a5a2.cubicTo(17.522848f, 2.0f, 22.0f, 6.4771523f, 22.0f, 12.0f);
                m145417xd4061a5a2.cubicTo(22.0f, 17.522848f, 17.522848f, 22.0f, 12.0f, 22.0f);
                m145417xd4061a5a2.close();
                m145417xd4061a5a2.moveTo(10.823438f, 14.139317f);
                m145417xd4061a5a2.lineTo(8.057538f, 11.373417f);
                m145417xd4061a5a2.lineTo(7.0f, 12.430955f);
                m145417xd4061a5a2.lineTo(10.1187f, 15.552128f);
                m145417xd4061a5a2.cubicTo(10.118736f, 15.552164f, 10.1187725f, 15.5522f, 10.118809f, 15.552237f);
                m145417xd4061a5a2.cubicTo(10.509253f, 15.9428425f, 11.142417f, 15.942974f, 11.533023f, 15.55253f);
                m145417xd4061a5a2.lineTo(17.485281f, 9.602528f);
                m145417xd4061a5a2.lineTo(16.422754f, 8.54f);
                m145417xd4061a5a2.lineTo(10.823438f, 14.139317f);
                m145417xd4061a5a2.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
                canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c93);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
