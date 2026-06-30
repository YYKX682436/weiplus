package com.p314xaae8f345.mm.p639x2e3af2.svg.p640x2eaded.p641xcebc809e;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sight_list_checkbox_selected_red */
/* loaded from: classes16.dex */
public class C9890x13b7a2ea extends l95.c {

    /* renamed from: width */
    private final int f26983x6be2dc6 = 90;

    /* renamed from: height */
    private final int f26982xb7389127 = 90;

    @Override // l95.c
    /* renamed from: doCommand */
    public int mo43368x913c4840(int i17, java.lang.Object... objArr) {
        int i18 = 90;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
            if (i17 == 2) {
                android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
                android.os.Looper looper = (android.os.Looper) objArr[1];
                android.graphics.Matrix m145412xe5ca94b6 = l95.c.m145412xe5ca94b6(looper);
                float[] m145413xf00d6f43 = l95.c.m145413xf00d6f43(looper);
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
                m145414xacbd08c9.setColor(-27648);
                float[] m145419x1d8aec80 = l95.c.m145419x1d8aec80(m145413xf00d6f43, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 11.0f, 0.0f, 0.0f, 1.0f);
                m145412xe5ca94b6.reset();
                m145412xe5ca94b6.setValues(m145419x1d8aec80);
                canvas.concat(m145412xe5ca94b6);
                canvas.save();
                android.graphics.Paint m145414xacbd08c92 = l95.c.m145414xacbd08c9(m145414xacbd08c9, looper);
                android.graphics.Path m145417xd4061a5a = l95.c.m145417xd4061a5a(looper);
                m145417xd4061a5a.moveTo(26.41996f, 1.7123995f);
                m145417xd4061a5a.cubicTo(42.029785f, -1.784037f, 59.069595f, 7.9460464f, 64.08954f, 23.090612f);
                m145417xd4061a5a.cubicTo(69.899475f, 38.474934f, 61.969563f, 57.26578f, 46.91973f, 63.879044f);
                m145417xd4061a5a.cubicTo(32.549892f, 71.01177f, 13.600102f, 65.46742f, 5.210196f, 51.84131f);
                m145417xd4061a5a.cubicTo(-2.9097135f, 39.703682f, -1.3797306f, 22.281437f, 8.690157f, 11.712208f);
                m145417xd4061a5a.cubicTo(13.340105f, 6.6174006f, 19.670034f, 3.110974f, 26.41996f, 1.7123995f);
                m145417xd4061a5a.lineTo(26.41996f, 1.7123995f);
                m145417xd4061a5a.close();
                m145417xd4061a5a.moveTo(12.0f, 32.0f);
                m145417xd4061a5a.lineTo(12.0f, 36.0f);
                m145417xd4061a5a.lineTo(54.0f, 36.0f);
                m145417xd4061a5a.lineTo(54.0f, 32.0f);
                m145417xd4061a5a.lineTo(12.0f, 32.0f);
                m145417xd4061a5a.lineTo(12.0f, 32.0f);
                m145417xd4061a5a.close();
                com.p314xaae8f345.mm.svg.C21323x60230c65.m78192x4b1e1ddf(m145417xd4061a5a, 2);
                canvas.drawPath(m145417xd4061a5a, m145414xacbd08c92);
                canvas.restore();
                canvas.restore();
                l95.c.m145409x2f2382(looper);
            }
        }
        return i18;
    }
}
