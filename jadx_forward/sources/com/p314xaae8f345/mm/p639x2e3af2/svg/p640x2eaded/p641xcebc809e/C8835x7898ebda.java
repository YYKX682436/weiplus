package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outline_change_speed */
/* loaded from: classes16.dex */
public class C8835x7898ebda extends l95.c {

    /* renamed from: width */
    private final int f24869x6be2dc6 = 72;

    /* renamed from: height */
    private final int f24868xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                m145414xacbd08c9.setColor(-436207616);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(36.0f, 6.0f);
                m145417xd4061a5a.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
                m145417xd4061a5a.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
                m145417xd4061a5a.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
                m145417xd4061a5a.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(36.0f, 10.8f);
                m145417xd4061a5a.cubicTo(22.082424f, 10.8f, 10.8f, 22.082424f, 10.8f, 36.0f);
                m145417xd4061a5a.cubicTo(10.8f, 49.917576f, 22.082424f, 61.2f, 36.0f, 61.2f);
                m145417xd4061a5a.cubicTo(49.917576f, 61.2f, 61.2f, 49.917576f, 61.2f, 36.0f);
                m145417xd4061a5a.cubicTo(61.2f, 22.082424f, 49.917576f, 10.8f, 36.0f, 10.8f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(47.39183f, 23.515844f);
                m145417xd4061a5a.cubicTo(47.463448f, 23.661095f, 47.473305f, 23.829126f, 47.419167f, 23.981754f);
                m145417xd4061a5a.lineTo(42.45432f, 37.982044f);
                m145417xd4061a5a.cubicTo(41.60756f, 40.74275f, 39.03819f, 42.75f, 36.0f, 42.75f);
                m145417xd4061a5a.cubicTo(32.27208f, 42.75f, 29.25f, 39.72792f, 29.25f, 36.0f);
                m145417xd4061a5a.cubicTo(29.25f, 33.34366f, 30.784407f, 31.045694f, 33.015236f, 29.944092f);
                m145417xd4061a5a.lineTo(33.008957f, 29.938238f);
                m145417xd4061a5a.lineTo(46.58836f, 23.243027f);
                m145417xd4061a5a.cubicTo(46.885567f, 23.09649f, 47.245296f, 23.218636f, 47.39183f, 23.515844f);
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
