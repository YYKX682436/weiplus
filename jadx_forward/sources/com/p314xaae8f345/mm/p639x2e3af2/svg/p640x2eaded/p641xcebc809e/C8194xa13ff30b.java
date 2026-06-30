package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fix_tools_failed */
/* loaded from: classes16.dex */
public class C8194xa13ff30b extends l95.c {

    /* renamed from: width */
    private final int f23587x6be2dc6 = 100;

    /* renamed from: height */
    private final int f23586xb7389127 = 100;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 100;
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
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-1686720);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(51.515152f, 100.0f);
                m145417xd4061a5a.cubicTo(22.385763f, 100.0f, 0.0f, 77.614235f, 0.0f, 51.515152f);
                m145417xd4061a5a.cubicTo(0.0f, 22.385763f, 22.385763f, 0.0f, 51.515152f, 0.0f);
                m145417xd4061a5a.cubicTo(77.614235f, 0.0f, 100.0f, 22.385763f, 100.0f, 51.515152f);
                m145417xd4061a5a.cubicTo(100.0f, 77.614235f, 77.614235f, 100.0f, 51.515152f, 100.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(45.567917f, 25.108103f);
                m145417xd4061a5a.lineTo(47.272728f, 60.909092f);
                m145417xd4061a5a.lineTo(54.545456f, 60.909092f);
                m145417xd4061a5a.lineTo(56.250263f, 25.108103f);
                m145417xd4061a5a.cubicTo(56.309967f, 23.85433f, 55.341984f, 22.789549f, 54.08821f, 22.729845f);
                m145417xd4061a5a.cubicTo(54.052204f, 22.72813f, 54.01616f, 22.727272f, 53.98011f, 22.727272f);
                m145417xd4061a5a.lineTo(47.838074f, 22.727272f);
                m145417xd4061a5a.cubicTo(46.582882f, 22.727272f, 45.565346f, 23.744808f, 45.565346f, 25.0f);
                m145417xd4061a5a.cubicTo(45.565346f, 25.036049f, 45.566204f, 25.072094f, 45.567917f, 25.108103f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(50.909092f, 76.818184f);
                m145417xd4061a5a.cubicTo(53.921555f, 76.818184f, 56.363636f, 74.3761f, 56.363636f, 71.36364f);
                m145417xd4061a5a.cubicTo(56.363636f, 68.35117f, 53.921555f, 65.90909f, 50.909092f, 65.90909f);
                m145417xd4061a5a.cubicTo(47.89663f, 65.90909f, 45.454544f, 68.35117f, 45.454544f, 71.36364f);
                m145417xd4061a5a.cubicTo(45.454544f, 74.3761f, 47.89663f, 76.818184f, 50.909092f, 76.818184f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
