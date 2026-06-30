package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_need_verify */
/* loaded from: classes16.dex */
public class C8834x3311229d extends l95.c {

    /* renamed from: width */
    private final int f24867x6be2dc6 = 64;

    /* renamed from: height */
    private final int f24866xb7389127 = 64;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 64;
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
                m145414xacbd08c9.setColor(-15616);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(32.0f, 5.3333335f);
                m145417xd4061a5a.cubicTo(46.727592f, 5.3333335f, 58.666668f, 17.272408f, 58.666668f, 32.0f);
                m145417xd4061a5a.cubicTo(58.666668f, 46.727592f, 46.727592f, 58.666668f, 32.0f, 58.666668f);
                m145417xd4061a5a.cubicTo(17.272408f, 58.666668f, 5.3333335f, 46.727592f, 5.3333335f, 32.0f);
                m145417xd4061a5a.cubicTo(5.3333335f, 17.272408f, 17.272408f, 5.3333335f, 32.0f, 5.3333335f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(31.988022f, 40.903645f);
                m145417xd4061a5a.cubicTo(30.657293f, 40.903645f, 29.6f, 41.92448f, 29.6f, 43.255207f);
                m145417xd4061a5a.cubicTo(29.6f, 44.585938f, 30.657293f, 45.60677f, 31.988022f, 45.60677f);
                m145417xd4061a5a.cubicTo(33.35521f, 45.60677f, 34.39427f, 44.585938f, 34.39427f, 43.255207f);
                m145417xd4061a5a.cubicTo(34.39427f, 41.92448f, 33.35521f, 40.903645f, 31.988022f, 40.903645f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(34.02969f, 16.361979f);
                m145417xd4061a5a.lineTo(29.964584f, 16.361979f);
                m145417xd4061a5a.lineTo(30.25625f, 36.619793f);
                m145417xd4061a5a.lineTo(33.73802f, 36.619793f);
                m145417xd4061a5a.lineTo(34.02969f, 16.361979f);
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
