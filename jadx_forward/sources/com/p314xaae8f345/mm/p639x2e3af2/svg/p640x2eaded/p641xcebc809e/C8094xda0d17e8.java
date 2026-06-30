package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_left_scroll_guide */
/* loaded from: classes16.dex */
public class C8094xda0d17e8 extends l95.c {

    /* renamed from: width */
    private final int f23387x6be2dc6 = 72;

    /* renamed from: height */
    private final int f23386xb7389127 = 72;

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
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c9.setColor(-2565928);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(0.0f, 0.0f);
            m145417xd4061a5a.lineTo(72.0f, 0.0f);
            m145417xd4061a5a.lineTo(72.0f, 72.0f);
            m145417xd4061a5a.lineTo(0.0f, 72.0f);
            m145417xd4061a5a.lineTo(0.0f, 0.0f);
            m145417xd4061a5a.close();
            canvas.saveLayerAlpha(null, 0, 31);
            canvas.drawPath(m145417xd4061a5a, l95.c.m145414xacbd08c9(m145414xacbd08c9, looper));
            canvas.restore();
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c92.setColor(-436207616);
            android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a2.moveTo(27.87868f, 16.80868f);
            m145417xd4061a5a2.lineTo(32.12132f, 21.051321f);
            m145417xd4061a5a2.lineTo(20.164774f, 33.00468f);
            m145417xd4061a5a2.lineTo(63.0f, 33.005226f);
            m145417xd4061a5a2.lineTo(63.0f, 39.005226f);
            m145417xd4061a5a2.lineTo(20.167774f, 39.00468f);
            m145417xd4061a5a2.lineTo(32.12132f, 50.959133f);
            m145417xd4061a5a2.lineTo(27.87868f, 55.20177f);
            m145417xd4061a5a2.lineTo(10.803453f, 38.126545f);
            m145417xd4061a5a2.cubicTo(9.722002f, 37.045094f, 9.638813f, 35.343403f, 10.553888f, 34.166527f);
            m145417xd4061a5a2.lineTo(10.803453f, 33.883907f);
            m145417xd4061a5a2.lineTo(27.87868f, 16.80868f);
            m145417xd4061a5a2.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
            canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
