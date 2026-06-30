package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_icon_remarks */
/* loaded from: classes16.dex */
public class C7548xd9ab8b78 extends l95.c {

    /* renamed from: width */
    private final int f22295x6be2dc6 = 96;

    /* renamed from: height */
    private final int f22294xb7389127 = 96;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 96;
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
                m145414xacbd08c9.setColor(-8683387);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(69.0f, 12.0f);
                m145417xd4061a5a.lineTo(60.0f, 21.0f);
                m145417xd4061a5a.lineTo(69.0f, 29.0f);
                m145417xd4061a5a.lineTo(77.0f, 21.0f);
                m145417xd4061a5a.lineTo(69.0f, 12.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(20.0f, 60.0f);
                m145417xd4061a5a.lineTo(20.0f, 60.0f);
                m145417xd4061a5a.lineTo(20.0f, 60.0f);
                m145417xd4061a5a.lineTo(20.0f, 69.0f);
                m145417xd4061a5a.lineTo(29.0f, 69.0f);
                m145417xd4061a5a.lineTo(63.0f, 34.0f);
                m145417xd4061a5a.lineTo(55.0f, 26.0f);
                m145417xd4061a5a.lineTo(20.0f, 60.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(12.0f, 85.0f);
                m145417xd4061a5a.lineTo(85.0f, 85.0f);
                m145417xd4061a5a.lineTo(85.0f, 77.0f);
                m145417xd4061a5a.lineTo(12.0f, 77.0f);
                m145417xd4061a5a.lineTo(12.0f, 85.0f);
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
