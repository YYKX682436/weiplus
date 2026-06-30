package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sns_sight_icon_mark extends l95.c {
    private final int width = 42;
    private final int height = 30;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 42;
        }
        if (i17 == 1) {
            return 30;
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1);
            canvas.save();
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(3.0f, 21.0f);
            instancePath.lineTo(25.0f, 21.0f);
            instancePath.lineTo(25.0f, 3.0f);
            instancePath.lineTo(3.0f, 3.0f);
            instancePath.lineTo(3.0f, 21.0f);
            instancePath.close();
            instancePath.moveTo(0.0f, 2.0049467f);
            instancePath.cubicTo(0.0f, 0.8976452f, 0.8998975f, 0.0f, 1.9912443f, 0.0f);
            instancePath.lineTo(26.008757f, 0.0f);
            instancePath.cubicTo(27.10849f, 0.0f, 28.0f, 0.89702624f, 28.0f, 2.0049467f);
            instancePath.lineTo(28.0f, 21.995054f);
            instancePath.cubicTo(28.0f, 23.102354f, 27.100103f, 24.0f, 26.008757f, 24.0f);
            instancePath.lineTo(1.9912443f, 24.0f);
            instancePath.cubicTo(0.8915104f, 24.0f, 0.0f, 23.102974f, 0.0f, 21.995054f);
            instancePath.lineTo(0.0f, 2.0049467f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(34.0f, 14.914493f);
            instancePath2.lineTo(39.0f, 18.323584f);
            instancePath2.lineTo(39.0f, 5.6764164f);
            instancePath2.lineTo(34.0f, 9.085507f);
            instancePath2.lineTo(34.0f, 14.914493f);
            instancePath2.close();
            instancePath2.moveTo(31.0f, 7.5f);
            instancePath2.lineTo(39.51767f, 1.692498f);
            instancePath2.cubicTo(40.888622f, 0.7577572f, 42.0f, 1.3417706f, 42.0f, 2.9910905f);
            instancePath2.lineTo(42.0f, 21.00891f);
            instancePath2.cubicTo(42.0f, 22.660843f, 40.884727f, 23.239586f, 39.51767f, 22.307503f);
            instancePath2.lineTo(31.0f, 16.5f);
            instancePath2.lineTo(31.0f, 7.5f);
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
