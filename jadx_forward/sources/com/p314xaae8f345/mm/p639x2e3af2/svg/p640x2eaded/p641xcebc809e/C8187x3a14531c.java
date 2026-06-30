package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_timeline_add */
/* loaded from: classes16.dex */
public class C8187x3a14531c extends l95.c {

    /* renamed from: width */
    private final int f23573x6be2dc6 = 72;

    /* renamed from: height */
    private final int f23572xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            m145414xacbd08c9.setColor(-16777216);
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(40.96418f, 6.735821f);
            m145417xd4061a5a.lineTo(40.964f, 31.04982f);
            m145417xd4061a5a.lineTo(65.27836f, 31.05f);
            m145417xd4061a5a.lineTo(65.27836f, 40.95f);
            m145417xd4061a5a.lineTo(40.964f, 40.94982f);
            m145417xd4061a5a.lineTo(40.96418f, 65.264175f);
            m145417xd4061a5a.lineTo(31.064178f, 65.264175f);
            m145417xd4061a5a.lineTo(31.064f, 40.94982f);
            m145417xd4061a5a.lineTo(6.75f, 40.95f);
            m145417xd4061a5a.lineTo(6.75f, 31.05f);
            m145417xd4061a5a.lineTo(31.064f, 31.04982f);
            m145417xd4061a5a.lineTo(31.064178f, 6.735821f);
            m145417xd4061a5a.lineTo(40.96418f, 6.735821f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
