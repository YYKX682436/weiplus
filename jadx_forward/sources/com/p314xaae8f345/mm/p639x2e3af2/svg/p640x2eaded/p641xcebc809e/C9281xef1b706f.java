package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.kinda_icon_filled_paragraph_dot */
/* loaded from: classes16.dex */
public class C9281xef1b706f extends l95.c {

    /* renamed from: width */
    private final int f25761x6be2dc6 = 6;

    /* renamed from: height */
    private final int f25760xb7389127 = 6;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 6;
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
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c92, looper);
            m145414xacbd08c9.setColor(-436207616);
            m145414xacbd08c92.setStrokeWidth(1.0f);
            canvas.save();
            android.graphics.Paint m145414xacbd08c93 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(3.0f, 1.0f);
            m145417xd4061a5a.cubicTo(4.1045694f, 1.0f, 5.0f, 1.8954304f, 5.0f, 3.0f);
            m145417xd4061a5a.cubicTo(5.0f, 4.1045694f, 4.1045694f, 5.0f, 3.0f, 5.0f);
            m145417xd4061a5a.cubicTo(1.8954304f, 5.0f, 1.0f, 4.1045694f, 1.0f, 3.0f);
            m145417xd4061a5a.cubicTo(1.0f, 1.8954304f, 1.8954304f, 1.0f, 3.0f, 1.0f);
            m145417xd4061a5a.close();
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c93);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
