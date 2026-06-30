package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.album_group_icon_pressed */
/* loaded from: classes16.dex */
public class C7244x96a3bec extends l95.c {

    /* renamed from: width */
    private final int f21687x6be2dc6 = 72;

    /* renamed from: height */
    private final int f21686xb7389127 = 72;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            canvas.save();
            android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
            android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
            m145417xd4061a5a.moveTo(7.5f, 60.0f);
            m145417xd4061a5a.lineTo(7.5f, 57.945312f);
            m145417xd4061a5a.cubicTo(7.5f, 55.890625f, 8.996094f, 53.496094f, 10.84375f, 52.59375f);
            m145417xd4061a5a.lineTo(27.824219f, 44.308594f);
            m145417xd4061a5a.cubicTo(30.285156f, 43.10547f, 30.859375f, 40.445312f, 29.082031f, 38.335938f);
            m145417xd4061a5a.lineTo(27.996094f, 37.05078f);
            m145417xd4061a5a.cubicTo(25.789062f, 34.433594f, 24.0f, 29.546875f, 24.0f, 26.128906f);
            m145417xd4061a5a.lineTo(24.0f, 21.0f);
            m145417xd4061a5a.cubicTo(24.0f, 14.371094f, 29.386719f, 9.0f, 36.0f, 9.0f);
            m145417xd4061a5a.cubicTo(42.628906f, 9.0f, 48.0f, 14.378906f, 48.0f, 21.0f);
            m145417xd4061a5a.lineTo(48.0f, 26.128906f);
            m145417xd4061a5a.cubicTo(48.0f, 29.546875f, 46.203125f, 34.44922f, 44.003906f, 37.054688f);
            m145417xd4061a5a.lineTo(42.91797f, 38.339844f);
            m145417xd4061a5a.cubicTo(41.152344f, 40.4375f, 41.703125f, 43.10547f, 44.17578f, 44.3125f);
            m145417xd4061a5a.lineTo(61.15625f, 52.59375f);
            m145417xd4061a5a.cubicTo(63.003906f, 53.496094f, 64.5f, 55.875f, 64.5f, 57.945312f);
            m145417xd4061a5a.lineTo(64.5f, 60.0f);
            m145417xd4061a5a.cubicTo(64.5f, 61.65625f, 63.15625f, 63.0f, 61.5f, 63.0f);
            m145417xd4061a5a.lineTo(10.5f, 63.0f);
            m145417xd4061a5a.cubicTo(8.84375f, 63.0f, 7.5f, 61.65625f, 7.5f, 60.0f);
            m145417xd4061a5a.close();
            m145417xd4061a5a.moveTo(7.5f, 60.0f);
            com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
            canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
            canvas.restore();
            l95.c.m145409x2f2382(looper);
        }
        return 0;
    }
}
