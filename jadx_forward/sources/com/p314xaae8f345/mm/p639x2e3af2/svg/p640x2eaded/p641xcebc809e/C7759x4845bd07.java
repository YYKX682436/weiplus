package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.count_down_4 */
/* loaded from: classes16.dex */
public class C7759x4845bd07 extends l95.c {

    /* renamed from: width */
    private final int f22717x6be2dc6 = 80;

    /* renamed from: height */
    private final int f22716xb7389127 = 80;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 80;
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
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-1);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(45.344f, 14.0f);
            m145417xd4061a5a.lineTo(52.544f, 14.0f);
            m145417xd4061a5a.lineTo(52.544f, 47.984f);
            m145417xd4061a5a.lineTo(60.32f, 47.984f);
            m145417xd4061a5a.lineTo(60.32f, 54.248f);
            m145417xd4061a5a.lineTo(52.544f, 54.248f);
            m145417xd4061a5a.lineTo(52.544f, 65.408f);
            m145417xd4061a5a.lineTo(45.056f, 65.408f);
            m145417xd4061a5a.lineTo(45.056f, 54.248f);
            m145417xd4061a5a.lineTo(20.0f, 54.248f);
            m145417xd4061a5a.lineTo(20.0f, 46.832f);
            m145417xd4061a5a.lineTo(45.344f, 14.0f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(44.84f, 23.936f);
            m145417xd4061a5a.lineTo(26.408f, 47.984f);
            m145417xd4061a5a.lineTo(45.056f, 47.984f);
            m145417xd4061a5a.lineTo(45.056f, 23.936f);
            m145417xd4061a5a.lineTo(44.84f, 23.936f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
