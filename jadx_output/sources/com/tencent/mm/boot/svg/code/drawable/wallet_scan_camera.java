package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class wallet_scan_camera extends l95.c {
    private final int width = 66;
    private final int height = 52;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 66;
        }
        if (i17 == 1) {
            return 52;
        }
        if (i17 == 2) {
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
            instancePaint3.setColor(-9139786);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(19.4f, 0.0f);
            instancePath.lineTo(45.39f, 0.0f);
            instancePath.cubicTo(45.87f, 1.9689571f, 46.06f, 3.9878876f, 46.12f, 6.0068183f);
            instancePath.cubicTo(51.06f, 6.086776f, 56.02f, 5.7569504f, 60.95f, 6.1567388f);
            instancePath.cubicTo(63.61f, 6.2666807f, 65.29f, 8.605442f, 66.0f, 10.944203f);
            instancePath.lineTo(66.0f, 43.96671f);
            instancePath.cubicTo(65.34f, 46.72525f, 63.07f, 49.06401f, 60.08f, 48.904095f);
            instancePath.cubicTo(42.37f, 49.06401f, 24.65f, 48.944073f, 6.93f, 48.964066f);
            instancePath.cubicTo(3.74f, 49.293888f, 0.86f, 47.324932f, 0.0f, 44.226574f);
            instancePath.lineTo(0.0f, 11.014166f);
            instancePath.cubicTo(0.67f, 8.955256f, 1.89f, 6.726437f, 4.23f, 6.2966647f);
            instancePath.cubicTo(9.06f, 5.6270194f, 13.96f, 6.1367493f, 18.82f, 6.0068183f);
            instancePath.cubicTo(19.05f, 4.007877f, 19.27f, 2.008936f, 19.4f, 0.0f);
            instancePath.lineTo(19.4f, 0.0f);
            instancePath.close();
            instancePath.moveTo(28.390493f, 10.6254015f);
            instancePath.cubicTo(21.38109f, 12.364714f, 15.771568f, 18.70221f, 15.111625f, 25.929352f);
            instancePath.cubicTo(14.381687f, 32.00695f, 17.28144f, 38.294464f, 22.351007f, 41.723106f);
            instancePath.cubicTo(29.330412f, 46.68115f, 39.75952f, 45.961433f, 45.879f, 39.913822f);
            instancePath.cubicTo(50.78858f, 35.275658f, 52.328453f, 27.618683f, 49.798668f, 21.391146f);
            instancePath.cubicTo(46.728928f, 13.064437f, 36.919765f, 8.196362f, 28.390493f, 10.6254015f);
            instancePath.lineTo(28.390493f, 10.6254015f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(29.357378f, 16.571178f);
            instancePath2.cubicTo(35.96738f, 14.336706f, 44.02519f, 18.905405f, 44.86392f, 25.967936f);
            instancePath2.cubicTo(45.942287f, 32.382072f, 40.450596f, 38.576748f, 34.090218f, 38.925884f);
            instancePath2.cubicTo(27.719856f, 39.68401f, 21.17975f, 34.526764f, 21.019993f, 28.002903f);
            instancePath2.cubicTo(20.69049f, 22.835684f, 24.474766f, 18.017601f, 29.357378f, 16.571178f);
            instancePath2.lineTo(29.357378f, 16.571178f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
