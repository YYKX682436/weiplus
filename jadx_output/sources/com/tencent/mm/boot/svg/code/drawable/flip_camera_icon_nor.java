package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class flip_camera_icon_nor extends l95.c {
    private final int width = 40;
    private final int height = 40;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 40;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 7.0f, 0.0f, 1.0f, 10.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-1);
        instancePaint4.setStrokeWidth(1.2f);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.6f, 5.1f);
        instancePath.lineTo(0.6f, 18.9f);
        instancePath.cubicTo(0.6f, 19.452284f, 1.0477153f, 19.9f, 1.6f, 19.9f);
        instancePath.lineTo(24.4f, 19.9f);
        instancePath.cubicTo(24.952284f, 19.9f, 25.4f, 19.452284f, 25.4f, 18.9f);
        instancePath.lineTo(25.4f, 5.1f);
        instancePath.cubicTo(25.4f, 4.547715f, 24.952284f, 4.1f, 24.4f, 4.1f);
        instancePath.lineTo(19.191229f, 4.1f);
        instancePath.lineTo(16.751053f, 0.68375236f);
        instancePath.cubicTo(16.71351f, 0.63119316f, 16.652895f, 0.6f, 16.588306f, 0.6f);
        instancePath.lineTo(9.411695f, 0.6f);
        instancePath.cubicTo(9.347104f, 0.6f, 9.2864895f, 0.63119316f, 9.248947f, 0.68375236f);
        instancePath.lineTo(6.8087707f, 4.1f);
        instancePath.lineTo(1.6f, 4.1f);
        instancePath.cubicTo(1.0477153f, 4.1f, 0.6f, 4.547715f, 0.6f, 5.1f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(2.0f, 0.5f);
        instancePath2.lineTo(5.5f, 0.5f);
        instancePath2.lineTo(5.5f, 2.0f);
        instancePath2.lineTo(2.0f, 2.0f);
        instancePath2.lineTo(2.0f, 0.5f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(7.0f, 11.0f);
        instancePath3.lineTo(5.0f, 11.0f);
        instancePath3.lineTo(7.75f, 8.25f);
        instancePath3.lineTo(10.5f, 11.0f);
        instancePath3.lineTo(8.5f, 11.0f);
        instancePath3.cubicTo(8.5f, 13.485281f, 10.514719f, 15.5f, 13.0f, 15.5f);
        instancePath3.cubicTo(14.264459f, 15.5f, 15.407109f, 14.978478f, 16.224586f, 14.1388f);
        instancePath3.lineTo(17.285318f, 15.199532f);
        instancePath3.cubicTo(16.196331f, 16.310623f, 14.678672f, 17.0f, 13.0f, 17.0f);
        instancePath3.cubicTo(9.686292f, 17.0f, 7.0f, 14.313708f, 7.0f, 11.0f);
        instancePath3.close();
        instancePath3.moveTo(19.0f, 11.0f);
        instancePath3.lineTo(21.0f, 11.0f);
        instancePath3.lineTo(18.25f, 13.75f);
        instancePath3.lineTo(15.5f, 11.0f);
        instancePath3.lineTo(17.5f, 11.0f);
        instancePath3.cubicTo(17.5f, 8.514719f, 15.485281f, 6.5f, 13.0f, 6.5f);
        instancePath3.cubicTo(11.735541f, 6.5f, 10.592891f, 7.021522f, 9.7754135f, 7.8612f);
        instancePath3.lineTo(8.714682f, 6.800468f);
        instancePath3.cubicTo(9.803668f, 5.6893764f, 11.321328f, 5.0f, 13.0f, 5.0f);
        instancePath3.cubicTo(16.31371f, 5.0f, 19.0f, 7.6862917f, 19.0f, 11.0f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
