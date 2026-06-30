package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_filled_fire */
/* loaded from: classes16.dex */
public class C8000xff5dc5a extends l95.c {

    /* renamed from: width */
    private final int f23199x6be2dc6 = 24;

    /* renamed from: height */
    private final int f23198xb7389127 = 24;

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
            l95.c.m145414xacbd08c9(m145415xacbd08c92, looper).setStrokeWidth(1.0f);
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-16777216);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(11.875f, 21.5f);
            m145417xd4061a5a.cubicTo(16.224243f, 21.5f, 19.75f, 18.477922f, 19.75f, 14.75f);
            m145417xd4061a5a.cubicTo(19.75f, 12.579542f, 18.554852f, 10.648348f, 16.69787f, 9.413545f);
            m145417xd4061a5a.cubicTo(16.3116f, 11.465161f, 15.224228f, 12.390485f, 14.618286f, 12.736572f);
            m145417xd4061a5a.cubicTo(17.311035f, 5.655957f, 11.27872f, 2.0f, 10.050639f, 2.0f);
            m145417xd4061a5a.cubicTo(11.5f, 5.9606447f, 7.5165544f, 8.84056f, 6.077288f, 10.181915f);
            m145417xd4061a5a.cubicTo(4.7875156f, 11.383947f, 4.0f, 12.988145f, 4.0f, 14.75f);
            m145417xd4061a5a.cubicTo(4.0f, 18.477922f, 7.525758f, 21.5f, 11.875f, 21.5f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c92.setColor(-2565928);
            android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a2.moveTo(0.0f, 0.0f);
            m145417xd4061a5a2.lineTo(24.0f, 0.0f);
            m145417xd4061a5a2.lineTo(24.0f, 24.0f);
            m145417xd4061a5a2.lineTo(0.0f, 24.0f);
            m145417xd4061a5a2.lineTo(0.0f, 0.0f);
            m145417xd4061a5a2.close();
            canvas.saveLayerAlpha(null, 0, 31);
            canvas.drawPath(m145417xd4061a5a2, l95.c.m145414xacbd08c9(m145414xacbd08c92, looper));
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
