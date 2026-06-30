package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.progress_cancel_btn_pressed */
/* loaded from: classes16.dex */
public class C9742x79224e4c extends l95.c {

    /* renamed from: width */
    private final int f26685x6be2dc6 = 66;

    /* renamed from: height */
    private final int f26684xb7389127 = 66;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 66;
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
                m145414xacbd08c9.setColor(-2800572);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(29.81802f, 33.0f);
                m145417xd4061a5a.lineTo(17.90901f, 21.09099f);
                m145417xd4061a5a.lineTo(21.09099f, 17.90901f);
                m145417xd4061a5a.lineTo(33.0f, 29.81802f);
                m145417xd4061a5a.lineTo(44.909008f, 17.90901f);
                m145417xd4061a5a.lineTo(48.090992f, 21.09099f);
                m145417xd4061a5a.lineTo(36.18198f, 33.0f);
                m145417xd4061a5a.lineTo(48.090992f, 44.909008f);
                m145417xd4061a5a.lineTo(44.909008f, 48.090992f);
                m145417xd4061a5a.lineTo(33.0f, 36.18198f);
                m145417xd4061a5a.lineTo(21.09099f, 48.090992f);
                m145417xd4061a5a.lineTo(17.90901f, 44.909008f);
                m145417xd4061a5a.lineTo(29.81802f, 33.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(33.0f, 66.0f);
                m145417xd4061a5a.cubicTo(51.225395f, 66.0f, 66.0f, 51.225395f, 66.0f, 33.0f);
                m145417xd4061a5a.cubicTo(66.0f, 14.774603f, 51.225395f, 0.0f, 33.0f, 0.0f);
                m145417xd4061a5a.cubicTo(14.774603f, 0.0f, 0.0f, 14.774603f, 0.0f, 33.0f);
                m145417xd4061a5a.cubicTo(0.0f, 51.225395f, 14.774603f, 66.0f, 33.0f, 66.0f);
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
