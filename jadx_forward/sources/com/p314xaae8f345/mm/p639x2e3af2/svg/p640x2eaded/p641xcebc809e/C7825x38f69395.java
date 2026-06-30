package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.doc_regular */
/* loaded from: classes16.dex */
public class C7825x38f69395 extends l95.c {

    /* renamed from: width */
    private final int f22849x6be2dc6 = 24;

    /* renamed from: height */
    private final int f22848xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-16777216);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(11.9127f, 3.20021f);
            m145417xd4061a5a.lineTo(5.7127f, 3.20021f);
            m145417xd4061a5a.lineTo(5.7127f, 20.8002f);
            m145417xd4061a5a.lineTo(18.3127f, 20.8002f);
            m145417xd4061a5a.lineTo(18.3127f, 9.60021f);
            m145417xd4061a5a.lineTo(13.5127f, 9.60021f);
            m145417xd4061a5a.cubicTo(12.629f, 9.60021f, 11.9127f, 8.88387f, 11.9127f, 8.00021f);
            m145417xd4061a5a.lineTo(11.9127f, 3.20021f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(13.1127f, 3.29921f);
            m145417xd4061a5a.lineTo(13.1127f, 8.00021f);
            m145417xd4061a5a.cubicTo(13.1127f, 8.22113f, 13.2918f, 8.40021f, 13.5127f, 8.40021f);
            m145417xd4061a5a.lineTo(18.2155f, 8.40021f);
            m145417xd4061a5a.lineTo(13.1127f, 3.29921f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(5.5085f, 2.00021f);
            m145417xd4061a5a.lineTo(13.5106f, 2.00021f);
            m145417xd4061a5a.lineTo(19.5127f, 8.00021f);
            m145417xd4061a5a.lineTo(19.5127f, 21.0016f);
            m145417xd4061a5a.cubicTo(19.5127f, 21.5544f, 19.0669f, 22.0002f, 18.5169f, 22.0002f);
            m145417xd4061a5a.lineTo(5.5085f, 22.0002f);
            m145417xd4061a5a.cubicTo(4.96162f, 22.0002f, 4.5127f, 21.5531f, 4.5127f, 21.0016f);
            m145417xd4061a5a.lineTo(4.5127f, 2.99886f);
            m145417xd4061a5a.cubicTo(4.5127f, 2.44598f, 4.95853f, 2.00021f, 5.5085f, 2.00021f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
