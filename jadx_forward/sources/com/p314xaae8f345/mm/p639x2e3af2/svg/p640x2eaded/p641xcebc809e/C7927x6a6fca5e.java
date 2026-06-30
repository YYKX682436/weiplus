package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.exdevice_send_failed */
/* loaded from: classes16.dex */
public class C7927x6a6fca5e extends l95.c {

    /* renamed from: width */
    private final int f23053x6be2dc6 = 64;

    /* renamed from: height */
    private final int f23052xb7389127 = 64;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 64;
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
                m145414xacbd08c9.setColor(-372399);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(32.0f, 0.0f);
                m145417xd4061a5a.cubicTo(49.67311f, 0.0f, 64.0f, 14.326888f, 64.0f, 32.0f);
                m145417xd4061a5a.cubicTo(64.0f, 49.67311f, 49.67311f, 64.0f, 32.0f, 64.0f);
                m145417xd4061a5a.cubicTo(14.326888f, 64.0f, 0.0f, 49.67311f, 0.0f, 32.0f);
                m145417xd4061a5a.cubicTo(0.0f, 14.326888f, 14.326888f, 0.0f, 32.0f, 0.0f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(31.985626f, 42.684376f);
                m145417xd4061a5a.cubicTo(30.388752f, 42.684376f, 29.12f, 43.909374f, 29.12f, 45.50625f);
                m145417xd4061a5a.cubicTo(29.12f, 47.103127f, 30.388752f, 48.328125f, 31.985626f, 48.328125f);
                m145417xd4061a5a.cubicTo(33.62625f, 48.328125f, 34.873127f, 47.103127f, 34.873127f, 45.50625f);
                m145417xd4061a5a.cubicTo(34.873127f, 43.909374f, 33.62625f, 42.684376f, 31.985626f, 42.684376f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(34.435627f, 13.234375f);
                m145417xd4061a5a.lineTo(29.5575f, 13.234375f);
                m145417xd4061a5a.lineTo(29.907501f, 37.54375f);
                m145417xd4061a5a.lineTo(34.085625f, 37.54375f);
                m145417xd4061a5a.lineTo(34.435627f, 13.234375f);
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
