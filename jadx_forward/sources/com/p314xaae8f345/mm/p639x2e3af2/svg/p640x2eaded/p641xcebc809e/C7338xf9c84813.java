package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_third_party_running_flag */
/* loaded from: classes16.dex */
public class C7338xf9c84813 extends l95.c {

    /* renamed from: width */
    private final int f21875x6be2dc6 = 24;

    /* renamed from: height */
    private final int f21874xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
        }
        if (i17 != 2) {
            return 0;
        }
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
        m145414xacbd08c92.setColor(16777215);
        m145414xacbd08c93.setColor(-1);
        m145414xacbd08c93.setStrokeWidth(1.2f);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(14.72445f, 3.0f);
        m145417xd4061a5a.cubicTo(16.5315f, 3.0f, 17.4348f, 3.0f, 18.40755f, 3.3075f);
        m145417xd4061a5a.cubicTo(19.46955f, 3.69405f, 20.30595f, 4.53045f, 20.6925f, 5.59245f);
        m145417xd4061a5a.cubicTo(21.0f, 6.56505f, 21.0f, 7.46865f, 21.0f, 9.27555f);
        m145417xd4061a5a.lineTo(21.0f, 14.72445f);
        m145417xd4061a5a.cubicTo(21.0f, 16.5315f, 21.0f, 17.4348f, 20.6925f, 18.40755f);
        m145417xd4061a5a.cubicTo(20.30595f, 19.46955f, 19.46955f, 20.30595f, 18.40755f, 20.69235f);
        m145417xd4061a5a.cubicTo(17.4348f, 21.0f, 16.5315f, 21.0f, 14.72445f, 21.0f);
        m145417xd4061a5a.lineTo(9.27555f, 21.0f);
        m145417xd4061a5a.cubicTo(7.4685f, 21.0f, 6.56505f, 21.0f, 5.59245f, 20.69235f);
        m145417xd4061a5a.cubicTo(4.53045f, 20.30595f, 3.69405f, 19.46955f, 3.3075f, 18.40755f);
        m145417xd4061a5a.cubicTo(3.0f, 17.4348f, 3.0f, 16.5315f, 3.0f, 14.72445f);
        m145417xd4061a5a.lineTo(3.0f, 9.27555f);
        m145417xd4061a5a.cubicTo(3.0f, 7.46865f, 3.0f, 6.56505f, 3.3075f, 5.59245f);
        m145417xd4061a5a.cubicTo(3.69405f, 4.53045f, 4.53045f, 3.69405f, 5.59245f, 3.3075f);
        m145417xd4061a5a.cubicTo(6.56505f, 3.0f, 7.4685f, 3.0f, 9.27555f, 3.0f);
        m145417xd4061a5a.lineTo(14.72445f, 3.0f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c93);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
