package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.avatar_del_btn_pressed */
/* loaded from: classes16.dex */
public class C7423x68fc2425 extends l95.c {

    /* renamed from: width */
    private final int f22045x6be2dc6 = 60;

    /* renamed from: height */
    private final int f22044xb7389127 = 60;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 60;
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
            m145414xacbd08c9.setColor(-1);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(11.0f, 15.0f);
            m145417xd4061a5a.lineTo(44.0f, 15.0f);
            m145417xd4061a5a.lineTo(44.0f, 48.0f);
            m145417xd4061a5a.lineTo(11.0f, 48.0f);
            m145417xd4061a5a.lineTo(11.0f, 15.0f);
            m145417xd4061a5a.close();
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            canvas.save();
            android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            m145414xacbd08c92.setColor(-2012855);
            android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a2.moveTo(30.0f, 28.37868f);
            m145417xd4061a5a2.lineTo(20.454058f, 18.832739f);
            m145417xd4061a5a2.lineTo(18.332739f, 20.954058f);
            m145417xd4061a5a2.lineTo(27.87868f, 30.5f);
            m145417xd4061a5a2.lineTo(18.332739f, 40.04594f);
            m145417xd4061a5a2.lineTo(20.454058f, 42.167263f);
            m145417xd4061a5a2.lineTo(30.0f, 32.62132f);
            m145417xd4061a5a2.lineTo(39.54594f, 42.167263f);
            m145417xd4061a5a2.lineTo(41.667263f, 40.04594f);
            m145417xd4061a5a2.lineTo(32.12132f, 30.5f);
            m145417xd4061a5a2.lineTo(41.667263f, 20.954058f);
            m145417xd4061a5a2.lineTo(39.54594f, 18.832739f);
            m145417xd4061a5a2.lineTo(30.0f, 28.37868f);
            m145417xd4061a5a2.close();
            m145417xd4061a5a2.moveTo(30.0f, 60.0f);
            m145417xd4061a5a2.cubicTo(13.4314575f, 60.0f, 0.0f, 46.568542f, 0.0f, 30.0f);
            m145417xd4061a5a2.cubicTo(0.0f, 13.4314575f, 13.4314575f, 0.0f, 30.0f, 0.0f);
            m145417xd4061a5a2.cubicTo(46.568542f, 0.0f, 60.0f, 13.4314575f, 60.0f, 30.0f);
            m145417xd4061a5a2.cubicTo(60.0f, 46.568542f, 46.568542f, 60.0f, 30.0f, 60.0f);
            m145417xd4061a5a2.close();
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 1);
            canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
