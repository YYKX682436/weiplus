package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_mini_game_filled */
/* loaded from: classes16.dex */
public class C8155xca219d60 extends l95.c {

    /* renamed from: width */
    private final int f23509x6be2dc6 = 24;

    /* renamed from: height */
    private final int f23508xb7389127 = 24;

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
                canvas.save();
                android.graphics.Paint m145414xacbd08c9 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c9.setColor(-16777216);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(22.8737f, 4.55576f);
                m145417xd4061a5a.cubicTo(23.3281f, 6.30438f, 22.5181f, 8.03323f, 21.056f, 8.41852f);
                m145417xd4061a5a.cubicTo(19.5939f, 8.80381f, 18.033f, 7.68746f, 17.5786f, 5.93885f);
                m145417xd4061a5a.cubicTo(17.1241f, 4.19023f, 17.9342f, 2.46138f, 19.3963f, 2.07609f);
                m145417xd4061a5a.cubicTo(20.8584f, 1.6908f, 22.4193f, 2.80715f, 22.8737f, 4.55576f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 1);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c9);
                canvas.restore();
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145415xacbd08c9, looper);
                m145414xacbd08c92.setColor(-16777216);
                android.graphics.Path m145417xd4061a5a2 = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a2.moveTo(3.85626f, 7.075f);
                m145417xd4061a5a2.cubicTo(6.81008f, 3.82475f, 12.2336f, 3.95318f, 15.9778f, 7.35162f);
                m145417xd4061a5a2.cubicTo(19.712f, 10.7501f, 20.3541f, 16.1441f, 17.4003f, 19.3943f);
                m145417xd4061a5a2.cubicTo(14.4465f, 22.6446f, 9.02297f, 22.5162f, 5.27884f, 19.1177f);
                m145417xd4061a5a2.cubicTo(1.54459f, 15.7193f, 0.902453f, 10.3252f, 3.85626f, 7.075f);
                m145417xd4061a5a2.close();
                m145417xd4061a5a2.moveTo(11.552f, 13.1112f);
                m145417xd4061a5a2.cubicTo(13.1425f, 13.9608f, 15.0195f, 13.5854f, 15.7308f, 12.2517f);
                m145417xd4061a5a2.cubicTo(16.4421f, 10.918f, 15.7308f, 9.14963f, 14.1304f, 8.29014f);
                m145417xd4061a5a2.cubicTo(12.5399f, 7.44053f, 10.6629f, 7.81594f, 9.95159f, 9.14963f);
                m145417xd4061a5a2.cubicTo(9.2403f, 10.4833f, 9.95159f, 12.2517f, 11.552f, 13.1112f);
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
