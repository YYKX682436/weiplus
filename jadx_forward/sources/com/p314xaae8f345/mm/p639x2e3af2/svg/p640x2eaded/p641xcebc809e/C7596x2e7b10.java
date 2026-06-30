package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.card */
/* loaded from: classes16.dex */
public class C7596x2e7b10 extends l95.c {

    /* renamed from: width */
    private final int f22391x6be2dc6 = 192;

    /* renamed from: height */
    private final int f22390xb7389127 = 192;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 192;
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
                m145414xacbd08c9.setColor(-15432210);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(16.0f, 40.006973f);
                m145417xd4061a5a.cubicTo(16.0f, 35.584843f, 19.642445f, 32.0f, 23.934425f, 32.0f);
                m145417xd4061a5a.lineTo(168.06558f, 32.0f);
                m145417xd4061a5a.cubicTo(172.44763f, 32.0f, 176.0f, 35.55705f, 176.0f, 40.006973f);
                m145417xd4061a5a.lineTo(176.0f, 151.99303f);
                m145417xd4061a5a.cubicTo(176.0f, 156.41516f, 172.35756f, 160.0f, 168.06558f, 160.0f);
                m145417xd4061a5a.lineTo(23.934425f, 160.0f);
                m145417xd4061a5a.cubicTo(19.552362f, 160.0f, 16.0f, 156.44295f, 16.0f, 151.99303f);
                m145417xd4061a5a.lineTo(16.0f, 40.006973f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(25.6f, 41.6f);
                m145417xd4061a5a.lineTo(25.6f, 150.4f);
                m145417xd4061a5a.lineTo(166.4f, 150.4f);
                m145417xd4061a5a.lineTo(166.4f, 41.6f);
                m145417xd4061a5a.lineTo(25.6f, 41.6f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(40.0f, 64.0f);
                m145417xd4061a5a.lineTo(152.0f, 64.0f);
                m145417xd4061a5a.lineTo(152.0f, 73.6f);
                m145417xd4061a5a.lineTo(40.0f, 73.6f);
                m145417xd4061a5a.lineTo(40.0f, 64.0f);
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
