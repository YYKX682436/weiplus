package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.profile_subtract */
/* loaded from: classes16.dex */
public class C9739x8ecf90ea extends l95.c {

    /* renamed from: width */
    private final int f26679x6be2dc6 = 18;

    /* renamed from: height */
    private final int f26678xb7389127 = 18;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 18;
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
        canvas.save();
        android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c9.setColor(-15683841);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(9.0f, 1.5f);
        m145417xd4061a5a.cubicTo(13.1421f, 1.5f, 16.5f, 4.85786f, 16.5f, 9.0f);
        m145417xd4061a5a.cubicTo(16.5f, 13.1421f, 13.1421f, 16.5f, 9.0f, 16.5f);
        m145417xd4061a5a.cubicTo(4.85786f, 16.5f, 1.5f, 13.1421f, 1.5f, 9.0f);
        m145417xd4061a5a.cubicTo(1.5f, 4.85786f, 4.85786f, 1.5f, 9.0f, 1.5f);
        m145417xd4061a5a.close();
        m145417xd4061a5a.moveTo(11.8682f, 5.25293f);
        m145417xd4061a5a.cubicTo(11.6662f, 4.9048f, 11.1561f, 4.90488f, 10.9541f, 5.25293f);
        m145417xd4061a5a.lineTo(9.0f, 8.62207f);
        m145417xd4061a5a.lineTo(7.0459f, 5.25293f);
        m145417xd4061a5a.cubicTo(6.84392f, 4.90486f, 6.33377f, 4.90481f, 6.13184f, 5.25293f);
        m145417xd4061a5a.lineTo(4.26953f, 8.46484f);
        m145417xd4061a5a.cubicTo(4.07719f, 8.79669f, 4.07712f, 9.20432f, 4.26953f, 9.53613f);
        m145417xd4061a5a.lineTo(6.13184f, 12.7471f);
        m145417xd4061a5a.cubicTo(6.33377f, 13.0952f, 6.84394f, 13.0952f, 7.0459f, 12.7471f);
        m145417xd4061a5a.lineTo(9.0f, 9.37793f);
        m145417xd4061a5a.lineTo(10.9541f, 12.7471f);
        m145417xd4061a5a.cubicTo(11.1561f, 13.0952f, 11.6662f, 13.0952f, 11.8682f, 12.7471f);
        m145417xd4061a5a.lineTo(13.7305f, 9.53613f);
        m145417xd4061a5a.cubicTo(13.9229f, 9.20433f, 13.9228f, 8.79667f, 13.7305f, 8.46484f);
        m145417xd4061a5a.lineTo(11.8682f, 5.25293f);
        m145417xd4061a5a.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
