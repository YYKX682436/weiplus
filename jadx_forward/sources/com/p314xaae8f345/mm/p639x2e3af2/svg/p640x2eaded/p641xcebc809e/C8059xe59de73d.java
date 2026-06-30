package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_checkbox_selected */
/* loaded from: classes16.dex */
public class C8059xe59de73d extends l95.c {

    /* renamed from: width */
    private final int f23317x6be2dc6 = 20;

    /* renamed from: height */
    private final int f23316xb7389127 = 20;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 20;
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
                canvas.saveLayerAlpha(null, 204, 31);
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-1);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(10.0f, 1.6666666f);
                m145417xd4061a5a.cubicTo(14.602373f, 1.6666666f, 18.333334f, 5.397627f, 18.333334f, 10.0f);
                m145417xd4061a5a.cubicTo(18.333334f, 14.602373f, 14.602373f, 18.333334f, 10.0f, 18.333334f);
                m145417xd4061a5a.cubicTo(5.397627f, 18.333334f, 1.6666666f, 14.602373f, 1.6666666f, 10.0f);
                m145417xd4061a5a.cubicTo(1.6666666f, 5.397627f, 5.397627f, 1.6666666f, 10.0f, 1.6666666f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(13.685628f, 7.116667f);
                m145417xd4061a5a.lineTo(9.019531f, 11.7827635f);
                m145417xd4061a5a.lineTo(6.714615f, 9.477847f);
                m145417xd4061a5a.lineTo(5.8333335f, 10.359129f);
                m145417xd4061a5a.lineTo(8.550149f, 13.077909f);
                m145417xd4061a5a.lineTo(8.550149f, 13.077909f);
                m145417xd4061a5a.lineTo(8.632769f, 13.148366f);
                m145417xd4061a5a.cubicTo(8.893249f, 13.335872f, 9.258588f, 13.31251f, 9.492886f, 13.078178f);
                m145417xd4061a5a.lineTo(9.492886f, 13.078178f);
                m145417xd4061a5a.lineTo(14.571068f, 8.002107f);
                m145417xd4061a5a.lineTo(13.685628f, 7.116667f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
