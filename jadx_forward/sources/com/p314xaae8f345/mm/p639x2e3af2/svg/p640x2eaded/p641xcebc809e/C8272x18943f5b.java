package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_at_select_someone_box_dark */
/* loaded from: classes16.dex */
public class C8272x18943f5b extends l95.c {

    /* renamed from: width */
    private final int f23743x6be2dc6 = 40;

    /* renamed from: height */
    private final int f23742xb7389127 = 40;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 40;
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
                m145414xacbd08c9.setColor(-14803426);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(32.0f, 24.0f);
                m145417xd4061a5a.cubicTo(36.418278f, 24.0f, 40.0f, 27.581722f, 40.0f, 32.0f);
                m145417xd4061a5a.cubicTo(40.0f, 36.418278f, 36.418278f, 40.0f, 32.0f, 40.0f);
                m145417xd4061a5a.cubicTo(27.581722f, 40.0f, 24.0f, 36.418278f, 24.0f, 32.0f);
                m145417xd4061a5a.cubicTo(24.0f, 27.581722f, 27.581722f, 24.0f, 32.0f, 24.0f);
                m145417xd4061a5a.close();
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
                canvas.restore();
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c92.setColor(-16728129);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(25.3335f, 32.0002f);
                m145417xd4061a5a2.cubicTo(25.3335f, 35.6821f, 28.3183f, 38.6668f, 32.0002f, 38.6668f);
                m145417xd4061a5a2.cubicTo(35.6821f, 38.6668f, 38.6668f, 35.6821f, 38.6668f, 32.0002f);
                m145417xd4061a5a2.cubicTo(38.6668f, 28.3183f, 35.6821f, 25.3335f, 32.0002f, 25.3335f);
                m145417xd4061a5a2.cubicTo(28.3183f, 25.3335f, 25.3335f, 28.3183f, 25.3335f, 32.0002f);
                m145417xd4061a5a2.close();
                m145417xd4061a5a2.moveTo(34.9485f, 29.6934f);
                m145417xd4061a5a2.lineTo(31.2156f, 33.4262f);
                m145417xd4061a5a2.lineTo(29.3717f, 31.5823f);
                m145417xd4061a5a2.lineTo(28.6667f, 32.2873f);
                m145417xd4061a5a2.lineTo(30.7458f, 34.368f);
                m145417xd4061a5a2.cubicTo(31.0061f, 34.6284f, 31.4282f, 34.6286f, 31.6887f, 34.3682f);
                m145417xd4061a5a2.lineTo(35.6569f, 30.4017f);
                m145417xd4061a5a2.lineTo(34.9485f, 29.6934f);
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
