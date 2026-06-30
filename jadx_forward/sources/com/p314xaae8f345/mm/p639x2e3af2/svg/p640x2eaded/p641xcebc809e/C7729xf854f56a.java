package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.collect_sound_off */
/* loaded from: classes16.dex */
public class C7729xf854f56a extends l95.c {

    /* renamed from: width */
    private final int f22657x6be2dc6 = 62;

    /* renamed from: height */
    private final int f22656xb7389127 = 62;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 62;
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
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c92, looper);
            m145414xacbd08c9.setStrokeWidth(1.0f);
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
            m145414xacbd08c92.setStrokeWidth(3.0f);
            canvas.save();
            float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 11.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
            m145412xe5ca94b6.reset();
            m145412xe5ca94b6.setValues(m145419x1d8aec80);
            canvas.concat(m145412xe5ca94b6);
            canvas.save();
            android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c92, looper);
            m145414xacbd08c93.setColor(-11711155);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(11.007507f, 11.458933f);
            m145417xd4061a5a.cubicTo(12.887484f, 9.4437065f, 15.622662f, 7.9247327f, 18.017488f, 7.3999724f);
            m145417xd4061a5a.lineTo(20.244202f, 6.9120493f);
            m145417xd4061a5a.lineTo(18.915043f, 5.060115f);
            m145417xd4061a5a.cubicTo(18.642044f, 4.679744f, 18.492981f, 4.2231226f, 18.492981f, 3.7391305f);
            m145417xd4061a5a.cubicTo(18.492981f, 2.4983008f, 19.479156f, 1.5f, 20.686369f, 1.5f);
            m145417xd4061a5a.cubicTo(21.893581f, 1.5f, 22.879757f, 2.4983008f, 22.879757f, 3.7391305f);
            m145417xd4061a5a.cubicTo(22.879757f, 4.2231226f, 22.730694f, 4.679744f, 22.457695f, 5.060115f);
            m145417xd4061a5a.lineTo(21.128536f, 6.9120493f);
            m145417xd4061a5a.lineTo(23.355251f, 7.3999724f);
            m145417xd4061a5a.cubicTo(29.377106f, 8.719497f, 33.48841f, 13.843313f, 33.95838f, 24.302568f);
            m145417xd4061a5a.cubicTo(33.769905f, 28.412003f, 34.089592f, 31.934727f, 34.821133f, 34.91406f);
            m145417xd4061a5a.lineTo(28.334389f, 28.619492f);
            m145417xd4061a5a.cubicTo(28.294184f, 28.580555f, 28.294184f, 28.580555f, 28.10701f, 28.399086f);
            m145417xd4061a5a.cubicTo(27.850748f, 28.150501f, 27.707758f, 28.011713f, 27.466179f, 27.777033f);
            m145417xd4061a5a.cubicTo(26.775806f, 27.106375f, 26.006472f, 26.357574f, 25.177935f, 25.549345f);
            m145417xd4061a5a.cubicTo(22.810862f, 23.240292f, 20.44387f, 20.917908f, 18.235228f, 18.732124f);
            m145417xd4061a5a.cubicTo(18.06544f, 18.564066f, 18.06544f, 18.564066f, 17.895714f, 18.39596f);
            m145417xd4061a5a.cubicTo(15.029206f, 15.556324f, 12.680043f, 13.193508f, 11.007507f, 11.458933f);
            m145417xd4061a5a.close();
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c93);
            canvas.restore();
            canvas.save();
            android.graphics.Paint m145414xacbd08c94 = l95.c.m145414xacbd08c9(m145414xacbd08c92, looper);
            m145414xacbd08c94.setColor(-11711155);
            android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a2.moveTo(1.5f, 42.5f);
            m145417xd4061a5a2.lineTo(1.5f, 41.82444f);
            m145417xd4061a5a2.cubicTo(1.6038995f, 41.74702f, 1.7123853f, 41.662033f, 1.8249147f, 41.56911f);
            m145417xd4061a5a2.cubicTo(2.5979338f, 40.930805f, 3.3558638f, 40.07715f, 4.0502887f, 38.98194f);
            m145417xd4061a5a2.cubicTo(6.195145f, 35.59919f, 7.3330913f, 30.618256f, 7.0150514f, 23.757542f);
            m145417xd4061a5a2.cubicTo(7.107518f, 21.681265f, 7.2452464f, 20.08475f, 7.466496f, 18.886692f);
            m145417xd4061a5a2.cubicTo(14.1708975f, 26.23253f, 20.274372f, 32.6139f, 25.684317f, 38.023556f);
            m145417xd4061a5a2.cubicTo(27.371628f, 39.710777f, 28.891684f, 41.203136f, 30.23632f, 42.5f);
            m145417xd4061a5a2.lineTo(1.5f, 42.5f);
            m145417xd4061a5a2.close();
            canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c94);
            canvas.restore();
            canvas.save();
            android.graphics.Paint m145414xacbd08c95 = l95.c.m145414xacbd08c9(m145414xacbd08c92, looper);
            m145414xacbd08c95.setColor(-11776948);
            m145414xacbd08c95.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            android.graphics.Path m145417xd4061a5a3 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a3.moveTo(5.3454547f, 6.3454547f);
            m145417xd4061a5a3.lineTo(42.115005f, 43.115005f);
            canvas.drawPath(m145417xd4061a5a3, m145414xacbd08c95);
            canvas.restore();
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
