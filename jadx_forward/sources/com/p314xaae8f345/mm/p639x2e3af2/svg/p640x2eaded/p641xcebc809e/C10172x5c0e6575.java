package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.voicepost_beginicon */
/* loaded from: classes16.dex */
public class C10172x5c0e6575 extends l95.c {

    /* renamed from: width */
    private final int f27547x6be2dc6 = 72;

    /* renamed from: height */
    private final int f27546xb7389127 = 72;

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
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c92, looper);
                m145414xacbd08c9.setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c92.setColor(-15028967);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(29.278912f, 21.516287f);
                m145417xd4061a5a.lineTo(52.24126f, 35.468605f);
                m145417xd4061a5a.cubicTo(52.949238f, 35.898785f, 53.17444f, 36.82145f, 52.74426f, 37.52943f);
                m145417xd4061a5a.cubicTo(52.61935f, 37.735f, 52.44683f, 37.90752f, 52.24126f, 38.03243f);
                m145417xd4061a5a.lineTo(29.278912f, 51.98475f);
                m145417xd4061a5a.cubicTo(28.57093f, 52.41493f, 27.64827f, 52.189728f, 27.218088f, 51.481747f);
                m145417xd4061a5a.cubicTo(27.07544f, 51.24698f, 27.0f, 50.977547f, 27.0f, 50.702835f);
                m145417xd4061a5a.lineTo(27.0f, 22.798197f);
                m145417xd4061a5a.cubicTo(27.0f, 21.96977f, 27.671574f, 21.298197f, 28.5f, 21.298197f);
                m145417xd4061a5a.cubicTo(28.77471f, 21.298197f, 29.044144f, 21.373636f, 29.278912f, 21.516287f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                canvas.save();
                android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                m145414xacbd08c93.setColor(-15028967);
                m145414xacbd08c93.setStrokeWidth(3.6f);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(36.0f, 1.7999992f);
                m145417xd4061a5a2.cubicTo(54.888138f, 1.7999992f, 70.2f, 17.11186f, 70.2f, 36.0f);
                m145417xd4061a5a2.cubicTo(70.2f, 54.888138f, 54.888138f, 70.2f, 36.0f, 70.2f);
                m145417xd4061a5a2.cubicTo(17.11186f, 70.2f, 1.7999992f, 54.888138f, 1.7999992f, 36.0f);
                m145417xd4061a5a2.cubicTo(1.7999992f, 17.11186f, 17.11186f, 1.7999992f, 36.0f, 1.7999992f);
                m145417xd4061a5a2.close();
                canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c93);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
