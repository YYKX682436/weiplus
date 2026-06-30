package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_icon_live */
/* loaded from: classes16.dex */
public class C8011x9ee30c19 extends l95.c {

    /* renamed from: width */
    private final int f23221x6be2dc6 = 72;

    /* renamed from: height */
    private final int f23220xb7389127 = 72;

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
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(0.0f, 0.0f);
            m145417xd4061a5a.lineTo(72.0f, 0.0f);
            m145417xd4061a5a.lineTo(72.0f, 72.0f);
            m145417xd4061a5a.lineTo(0.0f, 72.0f);
            m145417xd4061a5a.lineTo(0.0f, 0.0f);
            m145417xd4061a5a.close();
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-16777216);
            android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a2.moveTo(36.0f, 6.0f);
            m145417xd4061a5a2.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
            m145417xd4061a5a2.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
            m145417xd4061a5a2.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
            m145417xd4061a5a2.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
            m145417xd4061a5a2.close();
            m145417xd4061a5a2.moveTo(36.0f, 10.5f);
            m145417xd4061a5a2.cubicTo(21.916739f, 10.5f, 10.5f, 21.916739f, 10.5f, 36.0f);
            m145417xd4061a5a2.cubicTo(10.5f, 50.08326f, 21.916739f, 61.5f, 36.0f, 61.5f);
            m145417xd4061a5a2.cubicTo(50.08326f, 61.5f, 61.5f, 50.08326f, 61.5f, 36.0f);
            m145417xd4061a5a2.cubicTo(61.5f, 21.916739f, 50.08326f, 10.5f, 36.0f, 10.5f);
            m145417xd4061a5a2.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 1);
            canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c9);
            canvas.restore();
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c92.setColor(-16777216);
            android.graphics.Path m145417xd4061a5a3 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a3.moveTo(36.0f, 19.5f);
            m145417xd4061a5a3.cubicTo(45.112698f, 19.5f, 52.5f, 26.887302f, 52.5f, 36.0f);
            m145417xd4061a5a3.cubicTo(52.5f, 45.112698f, 45.112698f, 52.5f, 36.0f, 52.5f);
            m145417xd4061a5a3.cubicTo(26.887302f, 52.5f, 19.5f, 45.112698f, 19.5f, 36.0f);
            m145417xd4061a5a3.cubicTo(19.5f, 26.887302f, 26.887302f, 19.5f, 36.0f, 19.5f);
            m145417xd4061a5a3.close();
            canvas.drawPath(m145417xd4061a5a3, m145414xacbd08c92);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
