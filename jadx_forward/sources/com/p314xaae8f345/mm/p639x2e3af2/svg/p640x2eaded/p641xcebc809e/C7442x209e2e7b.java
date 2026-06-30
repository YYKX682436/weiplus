package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.backup_avatar_star */
/* loaded from: classes16.dex */
public class C7442x209e2e7b extends l95.c {

    /* renamed from: width */
    private final int f22083x6be2dc6 = 40;

    /* renamed from: height */
    private final int f22082xb7389127 = 40;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 40;
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
        m145414xacbd08c9.setColor(-15616);
        android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a.moveTo(0.0f, 4.0f);
        m145417xd4061a5a.cubicTo(0.0f, 1.7908609f, 1.7908609f, 0.0f, 4.0f, 0.0f);
        m145417xd4061a5a.lineTo(36.0f, 0.0f);
        m145417xd4061a5a.cubicTo(38.20914f, 0.0f, 40.0f, 1.7908609f, 40.0f, 4.0f);
        m145417xd4061a5a.lineTo(40.0f, 36.0f);
        m145417xd4061a5a.cubicTo(40.0f, 38.20914f, 38.20914f, 40.0f, 36.0f, 40.0f);
        m145417xd4061a5a.lineTo(4.0f, 40.0f);
        m145417xd4061a5a.cubicTo(1.7908609f, 40.0f, 0.0f, 38.20914f, 0.0f, 36.0f);
        m145417xd4061a5a.lineTo(0.0f, 4.0f);
        m145417xd4061a5a.close();
        canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
        m145414xacbd08c92.setColor(-1);
        android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
        m145417xd4061a5a2.moveTo(19.9999f, 28.6667f);
        m145417xd4061a5a2.lineTo(13.7704f, 31.9417f);
        m145417xd4061a5a2.cubicTo(12.8032f, 32.4502f, 11.6554f, 31.5878f, 11.8358f, 30.5362f);
        m145417xd4061a5a2.lineTo(13.0255f, 23.5995f);
        m145417xd4061a5a2.lineTo(7.98571f, 18.6869f);
        m145417xd4061a5a2.cubicTo(7.20325f, 17.9241f, 7.66877f, 16.566f, 8.72466f, 16.4126f);
        m145417xd4061a5a2.lineTo(15.6895f, 15.4005f);
        m145417xd4061a5a2.lineTo(18.8043f, 9.08931f);
        m145417xd4061a5a2.cubicTo(19.2879f, 8.10945f, 20.7234f, 8.13251f, 21.1956f, 9.08931f);
        m145417xd4061a5a2.lineTo(24.3104f, 15.4005f);
        m145417xd4061a5a2.lineTo(31.2752f, 16.4126f);
        m145417xd4061a5a2.cubicTo(32.3566f, 16.5697f, 32.7782f, 17.9421f, 32.0142f, 18.6869f);
        m145417xd4061a5a2.lineTo(26.9744f, 23.5995f);
        m145417xd4061a5a2.lineTo(28.1641f, 30.5362f);
        m145417xd4061a5a2.cubicTo(28.3488f, 31.6131f, 27.1739f, 32.4382f, 26.2295f, 31.9417f);
        m145417xd4061a5a2.lineTo(19.9999f, 28.6667f);
        m145417xd4061a5a2.close();
        com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a2, 2);
        canvas.drawPath(m145417xd4061a5a2, m145414xacbd08c92);
        canvas.restore();
        l95.c.m145409x2f2382(looper);
        return 0;
    }
}
