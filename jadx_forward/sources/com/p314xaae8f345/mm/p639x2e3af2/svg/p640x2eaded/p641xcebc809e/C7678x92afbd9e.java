package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_mini_unselect_regular */
/* loaded from: classes16.dex */
public class C7678x92afbd9e extends l95.c {

    /* renamed from: width */
    private final int f22555x6be2dc6 = 12;

    /* renamed from: height */
    private final int f22554xb7389127 = 12;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 12;
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
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c92, looper);
            m145414xacbd08c9.setColor(-16777216);
            m145414xacbd08c9.setStrokeWidth(1.2f);
            m145414xacbd08c9.setColor(-16777216);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(0.6f, 6.0f);
            m145417xd4061a5a.cubicTo(0.6f, 3.017662f, 3.017662f, 0.6f, 6.0f, 0.6f);
            m145417xd4061a5a.lineTo(6.0000005f, 0.6f);
            m145417xd4061a5a.cubicTo(8.982338f, 0.6f, 11.400001f, 3.017662f, 11.400001f, 6.0f);
            m145417xd4061a5a.lineTo(11.400001f, 6.0000005f);
            m145417xd4061a5a.cubicTo(11.400001f, 8.982338f, 8.982338f, 11.400001f, 6.0000005f, 11.400001f);
            m145417xd4061a5a.lineTo(6.0f, 11.400001f);
            m145417xd4061a5a.cubicTo(3.017662f, 11.400001f, 0.6f, 8.982338f, 0.6f, 6.0000005f);
            m145417xd4061a5a.lineTo(0.6f, 6.0f);
            m145417xd4061a5a.close();
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
