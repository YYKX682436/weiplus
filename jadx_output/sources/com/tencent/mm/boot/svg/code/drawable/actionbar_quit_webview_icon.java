package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class actionbar_quit_webview_icon extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 96;
        }
        if (i17 != 2) {
            return 0;
        }
        android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
        android.os.Looper looper = (android.os.Looper) objArr[1];
        android.graphics.Matrix instanceMatrix = l95.c.instanceMatrix(looper);
        float[] instanceMatrixArray = l95.c.instanceMatrixArray(looper);
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
        instancePaint3.setColor(-1);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 24.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(1.0f, 5.270896f);
        instancePath.cubicTo(2.4202743f, 3.8405488f, 3.8405488f, 2.4202743f, 5.270896f, 1.0f);
        instancePath.cubicTo(11.687312f, 7.3962708f, 18.083584f, 13.812688f, 24.5f, 20.21903f);
        instancePath.cubicTo(30.916416f, 13.822761f, 37.312687f, 7.3962708f, 43.729103f, 1.0f);
        instancePath.cubicTo(45.15945f, 2.4202743f, 46.579727f, 3.8405488f, 48.0f, 5.270896f);
        instancePath.cubicTo(41.60373f, 11.687312f, 35.17724f, 18.083584f, 28.78097f, 24.5f);
        instancePath.cubicTo(35.17724f, 30.916416f, 41.60373f, 37.312687f, 48.0f, 43.739178f);
        instancePath.cubicTo(46.579727f, 45.15945f, 45.15945f, 46.579727f, 43.739178f, 48.0f);
        instancePath.cubicTo(37.312687f, 41.60373f, 30.916416f, 35.17724f, 24.5f, 28.78097f);
        instancePath.cubicTo(18.083584f, 35.17724f, 11.687312f, 41.60373f, 5.270896f, 48.0f);
        instancePath.cubicTo(3.8405488f, 46.579727f, 2.4202743f, 45.15945f, 1.0f, 43.739178f);
        instancePath.cubicTo(7.3962708f, 37.312687f, 13.822761f, 30.916416f, 20.21903f, 24.5f);
        instancePath.cubicTo(13.822761f, 18.083584f, 7.3962708f, 11.687312f, 1.0f, 5.270896f);
        instancePath.lineTo(1.0f, 5.270896f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
