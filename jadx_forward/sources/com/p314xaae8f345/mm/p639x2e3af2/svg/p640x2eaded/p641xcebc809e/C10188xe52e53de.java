package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.wallet_drag_icon */
/* loaded from: classes16.dex */
public class C10188xe52e53de extends l95.c {

    /* renamed from: width */
    private final int f27579x6be2dc6 = 24;

    /* renamed from: height */
    private final int f27578xb7389127 = 24;

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
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-16777216);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(1.75f, 7.75f);
                m145417xd4061a5a.lineTo(22.25f, 7.75f);
                m145417xd4061a5a.cubicTo(22.664213f, 7.75f, 23.0f, 8.085787f, 23.0f, 8.5f);
                m145417xd4061a5a.cubicTo(23.0f, 8.914213f, 22.664213f, 9.25f, 22.25f, 9.25f);
                m145417xd4061a5a.lineTo(1.75f, 9.25f);
                m145417xd4061a5a.cubicTo(1.3357865f, 9.25f, 1.0f, 8.914213f, 1.0f, 8.5f);
                m145417xd4061a5a.cubicTo(1.0f, 8.085787f, 1.3357865f, 7.75f, 1.75f, 7.75f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(1.75f, 11.25f);
                m145417xd4061a5a.lineTo(22.25f, 11.25f);
                m145417xd4061a5a.cubicTo(22.664213f, 11.25f, 23.0f, 11.585787f, 23.0f, 12.0f);
                m145417xd4061a5a.cubicTo(23.0f, 12.414213f, 22.664213f, 12.75f, 22.25f, 12.75f);
                m145417xd4061a5a.lineTo(1.75f, 12.75f);
                m145417xd4061a5a.cubicTo(1.3357865f, 12.75f, 1.0f, 12.414213f, 1.0f, 12.0f);
                m145417xd4061a5a.cubicTo(1.0f, 11.585787f, 1.3357865f, 11.25f, 1.75f, 11.25f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(1.75f, 14.75f);
                m145417xd4061a5a.lineTo(22.25f, 14.75f);
                m145417xd4061a5a.cubicTo(22.664213f, 14.75f, 23.0f, 15.085787f, 23.0f, 15.5f);
                m145417xd4061a5a.cubicTo(23.0f, 15.914213f, 22.664213f, 16.25f, 22.25f, 16.25f);
                m145417xd4061a5a.lineTo(1.75f, 16.25f);
                m145417xd4061a5a.cubicTo(1.3357865f, 16.25f, 1.0f, 15.914213f, 1.0f, 15.5f);
                m145417xd4061a5a.cubicTo(1.0f, 15.085787f, 1.3357865f, 14.75f, 1.75f, 14.75f);
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
