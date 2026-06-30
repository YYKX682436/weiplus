package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class chatting_avatar_story_hint extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
        }
        if (i17 == 2) {
            android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
            android.os.Looper looper = (android.os.Looper) objArr[1];
            l95.c.instanceMatrix(looper);
            l95.c.instanceMatrixArray(looper);
            android.graphics.Paint instancePaint = l95.c.instancePaint(looper);
            instancePaint.setFlags(385);
            instancePaint.setStyle(android.graphics.Paint.Style.FILL);
            android.graphics.Paint instancePaint2 = l95.c.instancePaint(looper);
            instancePaint2.setFlags(385);
            instancePaint2.setStyle(android.graphics.Paint.Style.STROKE);
            instancePaint.setColor(-16777216);
            instancePaint2.setStrokeWidth(1.0f);
            instancePaint2.setStrokeCap(android.graphics.Paint.Cap.BUTT);
            instancePaint2.setStrokeJoin(android.graphics.Paint.Join.MITER);
            instancePaint2.setStrokeMiter(4.0f);
            instancePaint2.setPathEffect(null);
            l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-15819547);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(19.426306f, 8.069898f);
            instancePath.cubicTo(18.960836f, 7.191491f, 19.295588f, 6.1020646f, 20.173994f, 5.6365957f);
            instancePath.cubicTo(21.0524f, 5.1711264f, 22.141829f, 5.5058784f, 22.607296f, 6.384285f);
            instancePath.cubicTo(25.054684f, 11.002852f, 24.237564f, 16.734251f, 20.485281f, 20.486532f);
            instancePath.cubicTo(15.79899f, 25.172825f, 8.20101f, 25.172825f, 3.5147185f, 20.486532f);
            instancePath.cubicTo(-1.1715729f, 15.800241f, -1.1715729f, 8.202262f, 3.5147185f, 3.5159702f);
            instancePath.cubicTo(7.2670016f, -0.23631252f, 12.998399f, -1.053432f, 17.616966f, 1.3939549f);
            instancePath.cubicTo(18.495373f, 1.8594241f, 18.830126f, 2.9488506f, 18.364656f, 3.8272574f);
            instancePath.cubicTo(17.899187f, 4.705664f, 16.809761f, 5.040416f, 15.931354f, 4.574947f);
            instancePath.cubicTo(12.700203f, 2.8627546f, 8.686935f, 3.4349222f, 6.060303f, 6.061555f);
            instancePath.cubicTo(2.779899f, 9.341959f, 2.779899f, 14.660544f, 6.060303f, 17.940948f);
            instancePath.cubicTo(9.340707f, 21.221354f, 14.659293f, 21.221354f, 17.939697f, 17.940948f);
            instancePath.cubicTo(20.56633f, 15.314316f, 21.138496f, 11.301048f, 19.426306f, 8.069898f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
