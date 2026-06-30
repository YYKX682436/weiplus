package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chat_room_rule_pass_light */
/* loaded from: classes16.dex */
public class C7625x244f03ae extends l95.c {

    /* renamed from: width */
    private final int f22449x6be2dc6 = 12;

    /* renamed from: height */
    private final int f22448xb7389127 = 12;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 12;
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
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-1659134);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(1.0f, 6.0f);
                m145417xd4061a5a.cubicTo(1.0f, 8.76142f, 3.23858f, 11.0f, 6.0f, 11.0f);
                m145417xd4061a5a.cubicTo(8.76142f, 11.0f, 11.0f, 8.76142f, 11.0f, 6.0f);
                m145417xd4061a5a.cubicTo(11.0f, 3.23858f, 8.76142f, 1.0f, 6.0f, 1.0f);
                m145417xd4061a5a.cubicTo(3.23858f, 1.0f, 1.0f, 3.23858f, 1.0f, 6.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(8.21137f, 4.27f);
                m145417xd4061a5a.lineTo(5.41171f, 7.06966f);
                m145417xd4061a5a.lineTo(4.02876f, 5.68671f);
                m145417xd4061a5a.lineTo(3.49999f, 6.21548f);
                m145417xd4061a5a.lineTo(4.70586f, 7.42222f);
                m145417xd4061a5a.cubicTo(5.09629f, 7.81293f, 5.72954f, 7.81311f, 6.12019f, 7.42262f);
                m145417xd4061a5a.lineTo(8.74264f, 4.80126f);
                m145417xd4061a5a.lineTo(8.21137f, 4.27f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
