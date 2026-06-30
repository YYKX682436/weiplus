package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.scan_success_mark_dot_with_arrow */
/* loaded from: classes16.dex */
public class C9827xb08d4aba extends l95.c {

    /* renamed from: width */
    private final int f26857x6be2dc6 = 40;

    /* renamed from: height */
    private final int f26856xb7389127 = 40;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 40;
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
                android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                m145414xacbd08c92.setColor(-435699360);
                m145414xacbd08c93.setColor(-419430401);
                m145414xacbd08c93.setStrokeWidth(2.5f);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(20.0f, 1.25f);
                m145417xd4061a5a.cubicTo(30.35534f, 1.25f, 38.75f, 9.64466f, 38.75f, 20.0f);
                m145417xd4061a5a.cubicTo(38.75f, 30.35534f, 30.35534f, 38.75f, 20.0f, 38.75f);
                m145417xd4061a5a.cubicTo(9.64466f, 38.75f, 1.25f, 30.35534f, 1.25f, 20.0f);
                m145417xd4061a5a.cubicTo(1.25f, 9.64466f, 9.64466f, 1.25f, 20.0f, 1.25f);
                m145417xd4061a5a.close();
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c93);
                canvas.restore();
                canvas.save();
                android.graphics.Paint m145414xacbd08c94 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c94.setColor(-1);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(21.5f, 13.64f);
                m145417xd4061a5a2.lineTo(27.156855f, 19.296854f);
                m145417xd4061a5a2.cubicTo(27.547379f, 19.687378f, 27.547379f, 20.320543f, 27.156855f, 20.711067f);
                m145417xd4061a5a2.lineTo(21.5f, 26.367922f);
                m145417xd4061a5a2.lineTo(19.732233f, 24.600155f);
                m145417xd4061a5a2.lineTo(23.081f, 21.25f);
                m145417xd4061a5a2.lineTo(13.0f, 21.25f);
                m145417xd4061a5a2.lineTo(13.0f, 18.75f);
                m145417xd4061a5a2.lineTo(23.075f, 18.75f);
                m145417xd4061a5a2.lineTo(19.732233f, 15.407767f);
                m145417xd4061a5a2.lineTo(21.5f, 13.64f);
                m145417xd4061a5a2.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
                canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c94);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
