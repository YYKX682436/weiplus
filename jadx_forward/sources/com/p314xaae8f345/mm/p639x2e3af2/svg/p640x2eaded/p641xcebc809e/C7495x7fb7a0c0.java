package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.biz_profile_publish_pic_icon */
/* loaded from: classes16.dex */
public class C7495x7fb7a0c0 extends l95.c {

    /* renamed from: width */
    private final int f22189x6be2dc6 = 16;

    /* renamed from: height */
    private final int f22188xb7389127 = 16;

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
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-436207616);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(1.99445f, 2.66663f);
                m145417xd4061a5a.lineTo(14.0054f, 2.66663f);
                m145417xd4061a5a.cubicTo(14.363f, 2.66663f, 14.6666f, 2.98738f, 14.6666f, 3.38306f);
                m145417xd4061a5a.lineTo(14.6666f, 12.6169f);
                m145417xd4061a5a.cubicTo(14.6666f, 13.0141f, 14.3706f, 13.3333f, 14.0054f, 13.3333f);
                m145417xd4061a5a.lineTo(1.99445f, 13.3333f);
                m145417xd4061a5a.cubicTo(1.63679f, 13.3333f, 1.33325f, 13.0125f, 1.33325f, 12.6169f);
                m145417xd4061a5a.lineTo(1.33325f, 3.38306f);
                m145417xd4061a5a.cubicTo(1.33325f, 2.98586f, 1.62928f, 2.66663f, 1.99445f, 2.66663f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(13.3333f, 9.1209f);
                m145417xd4061a5a.lineTo(12.1702f, 8.06335f);
                m145417xd4061a5a.cubicTo(11.8711f, 7.79491f, 11.3808f, 7.78958f, 11.0727f, 8.05162f);
                m145417xd4061a5a.lineTo(9.5512f, 9.34544f);
                m145417xd4061a5a.lineTo(6.56692f, 6.72335f);
                m145417xd4061a5a.cubicTo(6.26967f, 6.46218f, 5.77445f, 6.45008f, 5.46608f, 6.69946f);
                m145417xd4061a5a.lineTo(2.66659f, 8.96346f);
                m145417xd4061a5a.lineTo(2.66659f, 3.99996f);
                m145417xd4061a5a.lineTo(13.3333f, 3.99996f);
                m145417xd4061a5a.lineTo(13.3333f, 9.1209f);
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
