package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class c2c_remittance_cancle_icon extends l95.c {
    private final int width = 120;
    private final int height = 120;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 120;
        }
        if (i17 != 2) {
            return 0;
        }
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(60.0f, 0.0f);
        instancePath.cubicTo(93.137085f, 0.0f, 120.0f, 26.862915f, 120.0f, 60.0f);
        instancePath.cubicTo(120.0f, 93.137085f, 93.137085f, 120.0f, 60.0f, 120.0f);
        instancePath.cubicTo(26.862915f, 120.0f, 0.0f, 93.137085f, 0.0f, 60.0f);
        instancePath.cubicTo(0.0f, 26.862915f, 26.862915f, 0.0f, 60.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(60.0f, 7.2f);
        instancePath.cubicTo(30.839365f, 7.2f, 7.2f, 30.839365f, 7.2f, 60.0f);
        instancePath.cubicTo(7.2f, 89.16064f, 30.839365f, 112.8f, 60.0f, 112.8f);
        instancePath.cubicTo(89.16064f, 112.8f, 112.8f, 89.16064f, 112.8f, 60.0f);
        instancePath.cubicTo(112.8f, 30.839365f, 89.16064f, 7.2f, 60.0f, 7.2f);
        instancePath.close();
        instancePath.moveTo(46.970562f, 34.800003f);
        instancePath.lineTo(52.061733f, 39.89117f);
        instancePath.lineTo(43.949646f, 47.99859f);
        instancePath.lineTo(72.0f, 48.0f);
        instancePath.cubicTo(81.941124f, 48.0f, 90.0f, 56.058876f, 90.0f, 66.0f);
        instancePath.cubicTo(90.0f, 75.941124f, 81.941124f, 84.0f, 72.0f, 84.0f);
        instancePath.lineTo(60.0f, 84.0f);
        instancePath.lineTo(60.0f, 76.8f);
        instancePath.lineTo(72.0f, 76.8f);
        instancePath.cubicTo(77.964676f, 76.8f, 82.8f, 71.964676f, 82.8f, 66.0f);
        instancePath.cubicTo(82.8f, 60.035324f, 77.964676f, 55.2f, 72.0f, 55.2f);
        instancePath.lineTo(43.610825f, 55.19859f);
        instancePath.lineTo(52.061733f, 63.649956f);
        instancePath.lineTo(46.970562f, 68.74113f);
        instancePath.lineTo(32.12132f, 53.891884f);
        instancePath.cubicTo(30.949747f, 52.72031f, 30.949747f, 50.820816f, 32.12132f, 49.649242f);
        instancePath.lineTo(46.970562f, 34.800003f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
