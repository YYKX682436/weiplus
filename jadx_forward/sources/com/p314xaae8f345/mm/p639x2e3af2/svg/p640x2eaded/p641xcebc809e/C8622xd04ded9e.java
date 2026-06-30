package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_live_checkbox */
/* loaded from: classes16.dex */
public class C8622xd04ded9e extends l95.c {

    /* renamed from: width */
    private final int f24443x6be2dc6 = 16;

    /* renamed from: height */
    private final int f24442xb7389127 = 16;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 16;
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
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-40634);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(16.0f, 8.098765f);
                m145417xd4061a5a.cubicTo(16.0f, 3.5816295f, 12.41837f, 0.0f, 7.9012346f, 0.0f);
                m145417xd4061a5a.cubicTo(3.5816295f, 0.0f, 0.0f, 3.5816295f, 0.0f, 8.098765f);
                m145417xd4061a5a.cubicTo(0.0f, 12.41837f, 3.5816295f, 16.0f, 7.9012346f, 16.0f);
                m145417xd4061a5a.cubicTo(12.41837f, 16.0f, 16.0f, 12.41837f, 16.0f, 8.098765f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
                canvas.restore();
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c92.setColor(-1);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(6.9093075f, 10.209139f);
                m145417xd4061a5a2.lineTo(4.7071066f, 8.006938f);
                m145417xd4061a5a2.lineTo(4.0f, 8.714046f);
                m145417xd4061a5a2.lineTo(6.437903f, 11.151948f);
                m145417xd4061a5a2.cubicTo(6.698252f, 11.412297f, 7.1203623f, 11.412297f, 7.380712f, 11.151948f);
                m145417xd4061a5a2.lineTo(12.49222f, 6.04044f);
                m145417xd4061a5a2.lineTo(12.49222f, 6.04044f);
                m145417xd4061a5a2.lineTo(11.785113f, 5.3333335f);
                m145417xd4061a5a2.lineTo(6.9093075f, 10.209139f);
                m145417xd4061a5a2.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
                canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
