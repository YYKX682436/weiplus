package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_voice2txt_cursor */
/* loaded from: classes16.dex */
public class C8788xc23f745d extends l95.c {

    /* renamed from: width */
    private final int f24775x6be2dc6 = 24;

    /* renamed from: height */
    private final int f24774xb7389127 = 10;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 24;
        }
        if (i17 == 1) {
            return 10;
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
            m145417xd4061a5a.moveTo(0.5f, -2.1316282E-14f);
            m145417xd4061a5a.lineTo(23.500662f, -2.1316282E-14f);
            m145417xd4061a5a.cubicTo(22.163176f, -2.1316282E-14f, 20.431269f, 1.6341983f, 19.457546f, 2.697338f);
            m145417xd4061a5a.lineTo(14.130131f, 8.638686f);
            m145417xd4061a5a.cubicTo(13.588587f, 9.242793f, 12.756226f, 9.584702f, 12.0f, 9.584702f);
            m145417xd4061a5a.cubicTo(11.231155f, 9.584702f, 10.457203f, 9.293136f, 9.870531f, 8.638686f);
            m145417xd4061a5a.lineTo(4.6710873f, 2.8385649f);
            m145417xd4061a5a.cubicTo(3.727653f, 1.7861383f, 1.8982798f, -2.1316282E-14f, 0.5f, -2.1316282E-14f);
            m145417xd4061a5a.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
