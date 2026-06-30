package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_call_good extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(46.996094f, 20.203125f);
            instancePath.lineTo(46.429688f, 28.664062f);
            instancePath.lineTo(58.664062f, 28.664062f);
            instancePath.cubicTo(62.027344f, 28.664062f, 65.47266f, 32.296875f, 64.9375f, 36.777344f);
            instancePath.lineTo(64.859375f, 37.21875f);
            instancePath.lineTo(60.660156f, 57.234375f);
            instancePath.cubicTo(59.945312f, 60.621094f, 57.539062f, 62.76953f, 54.628906f, 62.976562f);
            instancePath.lineTo(54.164062f, 62.992188f);
            instancePath.lineTo(26.621094f, 62.976562f);
            instancePath.cubicTo(25.203125f, 62.972656f, 24.050781f, 61.820312f, 24.050781f, 60.402344f);
            instancePath.lineTo(24.050781f, 33.527344f);
            instancePath.cubicTo(24.050781f, 32.304688f, 24.910156f, 31.253906f, 26.105469f, 31.007812f);
            instancePath.cubicTo(26.136719f, 31.0f, 26.167969f, 30.996094f, 26.195312f, 30.988281f);
            instancePath.cubicTo(30.003906f, 30.054688f, 33.160156f, 23.785156f, 33.73828f, 18.203125f);
            instancePath.lineTo(33.76953f, 17.726562f);
            instancePath.lineTo(33.835938f, 16.019531f);
            instancePath.lineTo(33.90625f, 15.195312f);
            instancePath.cubicTo(34.128906f, 13.082031f, 34.757812f, 10.429688f, 37.13672f, 9.402344f);
            instancePath.cubicTo(43.38672f, 6.714844f, 47.339844f, 14.878906f, 46.996094f, 20.203125f);
            instancePath.close();
            instancePath.moveTo(16.972656f, 62.98047f);
            instancePath.lineTo(12.625f, 62.98828f);
            instancePath.cubicTo(11.207031f, 62.992188f, 10.054688f, 61.839844f, 10.050781f, 60.421875f);
            instancePath.cubicTo(10.050781f, 60.41797f, 10.050781f, 60.41797f, 10.050781f, 60.41797f);
            instancePath.lineTo(10.050781f, 33.820312f);
            instancePath.cubicTo(10.050781f, 32.40625f, 11.195312f, 31.253906f, 12.613281f, 31.25f);
            instancePath.lineTo(16.957031f, 31.234375f);
            instancePath.cubicTo(18.378906f, 31.230469f, 19.53125f, 32.378906f, 19.539062f, 33.796875f);
            instancePath.cubicTo(19.539062f, 33.80078f, 19.539062f, 33.804688f, 19.539062f, 33.804688f);
            instancePath.lineTo(19.539062f, 60.40625f);
            instancePath.cubicTo(19.539062f, 61.82422f, 18.390625f, 62.976562f, 16.972656f, 62.98047f);
            instancePath.close();
            instancePath.moveTo(16.972656f, 62.98047f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
