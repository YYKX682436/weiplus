package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_cut_song */
/* loaded from: classes16.dex */
public class C8366x7e3e31f8 extends l95.c {

    /* renamed from: width */
    private final int f23931x6be2dc6 = 24;

    /* renamed from: height */
    private final int f23930xb7389127 = 24;

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
                m145417xd4061a5a.moveTo(14.8199f, 12.821f);
                m145417xd4061a5a.lineTo(6.07107f, 18.9071f);
                m145417xd4061a5a.cubicTo(5.40803f, 19.3684f, 4.5f, 18.8939f, 4.5f, 18.0862f);
                m145417xd4061a5a.lineTo(4.5f, 5.91387f);
                m145417xd4061a5a.cubicTo(4.5f, 5.10618f, 5.40803f, 4.63172f, 6.07106f, 5.09297f);
                m145417xd4061a5a.lineTo(14.8199f, 11.1791f);
                m145417xd4061a5a.cubicTo(15.3919f, 11.577f, 15.3919f, 12.4231f, 14.8199f, 12.821f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(18.5f, 19.0001f);
                m145417xd4061a5a.lineTo(17.75f, 19.0001f);
                m145417xd4061a5a.cubicTo(17.3358f, 19.0001f, 17.0f, 18.6643f, 17.0f, 18.2501f);
                m145417xd4061a5a.lineTo(17.0f, 5.75005f);
                m145417xd4061a5a.cubicTo(17.0f, 5.33584f, 17.3358f, 5.00005f, 17.75f, 5.00005f);
                m145417xd4061a5a.lineTo(18.5f, 5.00005f);
                m145417xd4061a5a.cubicTo(18.9142f, 5.00005f, 19.25f, 5.33584f, 19.25f, 5.75005f);
                m145417xd4061a5a.lineTo(19.25f, 18.2501f);
                m145417xd4061a5a.cubicTo(19.25f, 18.6643f, 18.9142f, 19.0001f, 18.5f, 19.0001f);
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
