package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_selected_grey_dark_small */
/* loaded from: classes16.dex */
public class C7695xd3326bb6 extends l95.c {

    /* renamed from: width */
    private final int f22589x6be2dc6 = 60;

    /* renamed from: height */
    private final int f22588xb7389127 = 60;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 60;
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
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-16631268);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(60.0f, 30.37037f);
                m145417xd4061a5a.cubicTo(60.0f, 13.431111f, 46.56889f, 0.0f, 29.62963f, 0.0f);
                m145417xd4061a5a.cubicTo(13.431111f, 0.0f, 0.0f, 13.431111f, 0.0f, 30.37037f);
                m145417xd4061a5a.cubicTo(0.0f, 46.56889f, 13.431111f, 60.0f, 29.62963f, 60.0f);
                m145417xd4061a5a.cubicTo(46.56889f, 60.0f, 60.0f, 46.56889f, 60.0f, 30.37037f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
                canvas.restore();
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c92.setColor(-1);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(25.909903f, 38.28427f);
                m145417xd4061a5a2.lineTo(17.65165f, 30.02602f);
                m145417xd4061a5a2.lineTo(15.0f, 32.67767f);
                m145417xd4061a5a2.lineTo(24.142136f, 41.819805f);
                m145417xd4061a5a2.cubicTo(25.118446f, 42.796116f, 26.701359f, 42.796116f, 27.67767f, 41.819805f);
                m145417xd4061a5a2.lineTo(46.845825f, 22.65165f);
                m145417xd4061a5a2.lineTo(46.845825f, 22.65165f);
                m145417xd4061a5a2.lineTo(44.19417f, 20.0f);
                m145417xd4061a5a2.lineTo(25.909903f, 38.28427f);
                m145417xd4061a5a2.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
                canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
