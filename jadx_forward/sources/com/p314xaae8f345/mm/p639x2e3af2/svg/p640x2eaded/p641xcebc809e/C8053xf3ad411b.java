package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_audio_tips */
/* loaded from: classes16.dex */
public class C8053xf3ad411b extends l95.c {

    /* renamed from: width */
    private final int f23305x6be2dc6 = 24;

    /* renamed from: height */
    private final int f23304xb7389127 = 24;

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
                l95.c.m145414xacbd08c9(m145415xacbd08c92, looper).setStrokeWidth(1.0f);
                canvas.saveLayerAlpha(null, 230, 31);
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-16777216);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(13.571068f, 4.5f);
                m145417xd4061a5a.cubicTo(15.380712f, 6.4194174f, 16.5f, 9.071068f, 16.5f, 12.0f);
                m145417xd4061a5a.cubicTo(16.5f, 14.928932f, 15.380712f, 17.580582f, 13.571068f, 19.5f);
                m145417xd4061a5a.lineTo(12.510407f, 18.375f);
                m145417xd4061a5a.cubicTo(14.095152f, 16.694124f, 15.0f, 14.425054f, 15.0f, 12.0f);
                m145417xd4061a5a.cubicTo(15.0f, 9.574946f, 14.095152f, 7.305876f, 12.510407f, 5.625f);
                m145417xd4061a5a.lineTo(13.571068f, 4.5f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(11.096194f, 7.125f);
                m145417xd4061a5a.cubicTo(12.272463f, 8.372622f, 13.0f, 10.096194f, 13.0f, 12.0f);
                m145417xd4061a5a.cubicTo(13.0f, 13.903806f, 12.272463f, 15.627378f, 11.096194f, 16.875f);
                m145417xd4061a5a.lineTo(10.035534f, 15.75f);
                m145417xd4061a5a.cubicTo(10.968138f, 14.760825f, 11.5f, 13.427082f, 11.5f, 12.0f);
                m145417xd4061a5a.cubicTo(11.5f, 10.572918f, 10.968138f, 9.239176f, 10.035534f, 8.25f);
                m145417xd4061a5a.lineTo(11.096194f, 7.125f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(8.621321f, 9.75f);
                m145417xd4061a5a.cubicTo(9.164213f, 10.325825f, 9.5f, 11.121321f, 9.5f, 12.0f);
                m145417xd4061a5a.cubicTo(9.5f, 12.878679f, 9.164213f, 13.674175f, 8.621321f, 14.25f);
                m145417xd4061a5a.lineTo(8.621321f, 14.25f);
                m145417xd4061a5a.lineTo(6.5f, 12.0f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
