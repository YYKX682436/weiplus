package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fav_list_tag */
/* loaded from: classes16.dex */
public class C7954x6ae9151d extends l95.c {

    /* renamed from: width */
    private final int f23107x6be2dc6 = 24;

    /* renamed from: height */
    private final int f23106xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                m145414xacbd08c9.setColor(-16777216);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(4.25911f, 13.9146f);
                m145417xd4061a5a.cubicTo(3.91363f, 13.5691f, 3.91363f, 13.009f, 4.25911f, 12.6635f);
                m145417xd4061a5a.lineTo(12.6635f, 4.25911f);
                m145417xd4061a5a.cubicTo(12.8294f, 4.09321f, 13.0544f, 4.0f, 13.2891f, 4.0f);
                m145417xd4061a5a.lineTo(19.1153f, 4.0f);
                m145417xd4061a5a.cubicTo(19.6039f, 4.0f, 20.0f, 4.39608f, 20.0f, 4.88467f);
                m145417xd4061a5a.lineTo(20.0f, 10.7109f);
                m145417xd4061a5a.cubicTo(20.0f, 10.9456f, 19.9068f, 11.1706f, 19.7409f, 11.3365f);
                m145417xd4061a5a.lineTo(11.3365f, 19.7409f);
                m145417xd4061a5a.cubicTo(10.991f, 20.0864f, 10.4309f, 20.0864f, 10.0854f, 19.7409f);
                m145417xd4061a5a.lineTo(4.25911f, 13.9146f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(18.8002f, 10.6938f);
                m145417xd4061a5a.lineTo(18.8002f, 5.2f);
                m145417xd4061a5a.lineTo(13.3064f, 5.2f);
                m145417xd4061a5a.lineTo(5.2002f, 13.3062f);
                m145417xd4061a5a.lineTo(10.694f, 18.8f);
                m145417xd4061a5a.lineTo(18.8002f, 10.6938f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(15.75f, 9.5f);
                m145417xd4061a5a.cubicTo(16.4404f, 9.5f, 17.0f, 8.94036f, 17.0f, 8.25f);
                m145417xd4061a5a.cubicTo(17.0f, 7.55964f, 16.4404f, 7.0f, 15.75f, 7.0f);
                m145417xd4061a5a.cubicTo(15.0596f, 7.0f, 14.5f, 7.55964f, 14.5f, 8.25f);
                m145417xd4061a5a.cubicTo(14.5f, 8.94036f, 15.0596f, 9.5f, 15.75f, 9.5f);
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
