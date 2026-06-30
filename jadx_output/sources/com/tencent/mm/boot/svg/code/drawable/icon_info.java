package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_info extends l95.c {
    private final int width = 29;
    private final int height = 27;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 29;
        }
        if (i17 == 1) {
            return 27;
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
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -333.0f, 0.0f, 1.0f, -227.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16268960);
            float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 335.0f, 0.0f, 1.0f, 229.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(12.0f, 24.0f);
            instancePath.cubicTo(5.372583f, 24.0f, 0.0f, 18.627417f, 0.0f, 12.0f);
            instancePath.cubicTo(0.0f, 5.372583f, 5.372583f, 0.0f, 12.0f, 0.0f);
            instancePath.cubicTo(18.627417f, 0.0f, 24.0f, 5.372583f, 24.0f, 12.0f);
            instancePath.cubicTo(24.0f, 18.627417f, 18.627417f, 24.0f, 12.0f, 24.0f);
            instancePath.close();
            instancePath.moveTo(12.0f, 22.56f);
            instancePath.cubicTo(17.832127f, 22.56f, 22.56f, 17.832127f, 22.56f, 12.0f);
            instancePath.cubicTo(22.56f, 6.167873f, 17.832127f, 1.44f, 12.0f, 1.44f);
            instancePath.cubicTo(6.167873f, 1.44f, 1.44f, 6.167873f, 1.44f, 12.0f);
            instancePath.cubicTo(1.44f, 17.832127f, 6.167873f, 22.56f, 12.0f, 22.56f);
            instancePath.close();
            instancePath.moveTo(11.28f, 9.6f);
            instancePath.lineTo(12.719999f, 9.6f);
            instancePath.lineTo(12.719999f, 18.0f);
            instancePath.lineTo(11.28f, 18.0f);
            instancePath.lineTo(11.28f, 9.6f);
            instancePath.close();
            instancePath.moveTo(12.0f, 8.4f);
            instancePath.cubicTo(11.337258f, 8.4f, 10.8f, 7.8627415f, 10.8f, 7.2f);
            instancePath.cubicTo(10.8f, 6.537258f, 11.337258f, 6.0f, 12.0f, 6.0f);
            instancePath.cubicTo(12.662742f, 6.0f, 13.2f, 6.537258f, 13.2f, 7.2f);
            instancePath.cubicTo(13.2f, 7.8627415f, 12.662742f, 8.4f, 12.0f, 8.4f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(14211288);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(333.0f, 227.0f);
            instancePath2.lineTo(362.0f, 227.0f);
            instancePath2.lineTo(362.0f, 254.0f);
            instancePath2.lineTo(333.0f, 254.0f);
            instancePath2.lineTo(333.0f, 227.0f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
