package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class default_linkedin extends l95.c {
    private final int width = 192;
    private final int height = 192;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 192;
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16745032);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(192.0f, 0.0f);
        instancePath.lineTo(192.0f, 192.0f);
        instancePath.lineTo(0.0f, 192.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(100.36363f, 132.43181f);
        instancePath2.lineTo(100.36363f, 148.36363f);
        instancePath2.lineTo(78.545456f, 148.36363f);
        instancePath2.lineTo(78.545456f, 74.181816f);
        instancePath2.lineTo(100.36363f, 74.181816f);
        instancePath2.lineTo(100.36363f, 81.31886f);
        instancePath2.cubicTo(106.0796f, 75.988815f, 113.749794f, 72.72727f, 122.181816f, 72.72727f);
        instancePath2.cubicTo(139.85522f, 72.72727f, 154.18182f, 87.05574f, 154.18182f, 104.72727f);
        instancePath2.cubicTo(154.18182f, 105.21475f, 154.17091f, 105.69968f, 154.14935f, 106.18183f);
        instancePath2.lineTo(154.18182f, 106.181816f);
        instancePath2.lineTo(154.18182f, 149.81818f);
        instancePath2.lineTo(132.36363f, 149.81818f);
        instancePath2.lineTo(132.36363f, 135.90036f);
        instancePath2.lineTo(132.36363f, 112.0f);
        instancePath2.lineTo(132.29858f, 112.0f);
        instancePath2.cubicTo(132.34158f, 111.520935f, 132.36363f, 111.035774f, 132.36363f, 110.545456f);
        instancePath2.cubicTo(132.36363f, 101.70946f, 125.19964f, 94.545456f, 117.30481f, 94.545456f);
        instancePath2.cubicTo(107.52763f, 94.545456f, 100.36363f, 101.70946f, 100.36363f, 110.545456f);
        instancePath2.cubicTo(100.36363f, 111.035774f, 100.38569f, 111.520935f, 100.42901f, 112.0f);
        instancePath2.lineTo(100.36363f, 112.0f);
        instancePath2.lineTo(100.36363f, 132.43181f);
        instancePath2.lineTo(100.36363f, 132.43181f);
        instancePath2.close();
        instancePath2.moveTo(42.18182f, 74.181816f);
        instancePath2.lineTo(64.0f, 74.181816f);
        instancePath2.lineTo(64.0f, 148.36363f);
        instancePath2.lineTo(42.18182f, 148.36363f);
        instancePath2.lineTo(42.18182f, 74.181816f);
        instancePath2.close();
        instancePath2.moveTo(66.90909f, 50.909092f);
        instancePath2.cubicTo(66.90909f, 58.942547f, 60.39709f, 65.454544f, 52.363636f, 65.454544f);
        instancePath2.cubicTo(44.33018f, 65.454544f, 37.81818f, 58.942547f, 37.81818f, 50.909092f);
        instancePath2.cubicTo(37.81818f, 42.875637f, 44.33018f, 36.363636f, 52.363636f, 36.363636f);
        instancePath2.cubicTo(60.39709f, 36.363636f, 66.90909f, 42.875637f, 66.90909f, 50.909092f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
