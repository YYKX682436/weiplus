package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.c2c_remittance_received_icon */
/* loaded from: classes16.dex */
public class C7582x48443101 extends l95.c {

    /* renamed from: width */
    private final int f22363x6be2dc6 = 120;

    /* renamed from: height */
    private final int f22362xb7389127 = 120;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 120;
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
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-1);
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(60.0f, 0.0f);
            m145417xd4061a5a.cubicTo(93.137085f, 0.0f, 120.0f, 26.862915f, 120.0f, 60.0f);
            m145417xd4061a5a.cubicTo(120.0f, 93.137085f, 93.137085f, 120.0f, 60.0f, 120.0f);
            m145417xd4061a5a.cubicTo(26.862915f, 120.0f, 0.0f, 93.137085f, 0.0f, 60.0f);
            m145417xd4061a5a.cubicTo(0.0f, 26.862915f, 26.862915f, 0.0f, 60.0f, 0.0f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(60.0f, 7.2f);
            m145417xd4061a5a.cubicTo(30.839365f, 7.2f, 7.2f, 30.839365f, 7.2f, 60.0f);
            m145417xd4061a5a.cubicTo(7.2f, 89.16064f, 30.839365f, 112.8f, 60.0f, 112.8f);
            m145417xd4061a5a.cubicTo(89.16064f, 112.8f, 112.8f, 89.16064f, 112.8f, 60.0f);
            m145417xd4061a5a.cubicTo(112.8f, 30.839365f, 89.16064f, 7.2f, 60.0f, 7.2f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(87.82052f, 40.5f);
            m145417xd4061a5a.lineTo(92.91169f, 45.591167f);
            m145417xd4061a5a.lineTo(57.213203f, 81.28965f);
            m145417xd4061a5a.cubicTo(54.87006f, 83.6328f, 51.071068f, 83.6328f, 48.727924f, 81.28965f);
            m145417xd4061a5a.lineTo(30.0f, 62.56173f);
            m145417xd4061a5a.lineTo(35.091167f, 57.470562f);
            m145417xd4061a5a.lineTo(52.970562f, 75.34995f);
            m145417xd4061a5a.lineTo(87.82052f, 40.5f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
