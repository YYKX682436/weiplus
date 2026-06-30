package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.note_filled_camera */
/* loaded from: classes16.dex */
public class C9567x5db55315 extends l95.c {

    /* renamed from: width */
    private final int f26335x6be2dc6 = 24;

    /* renamed from: height */
    private final int f26334xb7389127 = 24;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
        }
        if (i17 != 2) {
            return 0;
        }
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
        m145414xacbd08c9.setColor(-16777216);
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(14.732409f, 4.0f);
        m145417xd4061a5a.cubicTo(14.899585f, 4.0f, 15.0557f, 4.0835505f, 15.148434f, 4.22265f);
        m145417xd4061a5a.lineTo(17.0f, 7.0f);
        m145417xd4061a5a.lineTo(21.0f, 7.0f);
        m145417xd4061a5a.cubicTo(21.552284f, 7.0f, 22.0f, 7.4477153f, 22.0f, 8.0f);
        m145417xd4061a5a.lineTo(22.0f, 19.0f);
        m145417xd4061a5a.cubicTo(22.0f, 19.552284f, 21.552284f, 20.0f, 21.0f, 20.0f);
        m145417xd4061a5a.lineTo(3.0f, 20.0f);
        m145417xd4061a5a.cubicTo(2.4477153f, 20.0f, 2.0f, 19.552284f, 2.0f, 19.0f);
        m145417xd4061a5a.lineTo(2.0f, 8.0f);
        m145417xd4061a5a.cubicTo(2.0f, 7.4477153f, 2.4477153f, 7.0f, 3.0f, 7.0f);
        m145417xd4061a5a.lineTo(7.0f, 7.0f);
        m145417xd4061a5a.lineTo(8.851566f, 4.22265f);
        m145417xd4061a5a.cubicTo(8.9443f, 4.0835505f, 9.100415f, 4.0f, 9.267591f, 4.0f);
        m145417xd4061a5a.lineTo(14.732409f, 4.0f);
        m145417xd4061a5a.close();
        m145417xd4061a5a.moveTo(12.0f, 16.5f);
        m145417xd4061a5a.cubicTo(13.932997f, 16.5f, 15.5f, 14.932997f, 15.5f, 13.0f);
        m145417xd4061a5a.cubicTo(15.5f, 11.067003f, 13.932997f, 9.5f, 12.0f, 9.5f);
        m145417xd4061a5a.cubicTo(10.067003f, 9.5f, 8.5f, 11.067003f, 8.5f, 13.0f);
        m145417xd4061a5a.cubicTo(8.5f, 14.932997f, 10.067003f, 16.5f, 12.0f, 16.5f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
