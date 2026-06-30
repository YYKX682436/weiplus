package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_star_identify_enterprise_sold extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.571429f, 0.0f, 1.0f, 3.571429f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-15432210);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(23.73465f, 0.9581761f);
        instancePath.lineTo(26.126421f, 6.731255f);
        instancePath.lineTo(31.898968f, 9.122494f);
        instancePath.cubicTo(32.497654f, 9.370478f, 32.781956f, 10.05684f, 32.53397f, 10.655527f);
        instancePath.lineTo(30.142637f, 16.42726f);
        instancePath.lineTo(32.53397f, 22.201616f);
        instancePath.cubicTo(32.781956f, 22.800303f, 32.497654f, 23.486666f, 31.898968f, 23.73465f);
        instancePath.lineTo(26.125225f, 26.126146f);
        instancePath.lineTo(23.73465f, 31.898968f);
        instancePath.cubicTo(23.486666f, 32.497654f, 22.800303f, 32.781956f, 22.201616f, 32.53397f);
        instancePath.lineTo(16.429222f, 30.142363f);
        instancePath.lineTo(10.655527f, 32.53397f);
        instancePath.cubicTo(10.05684f, 32.781956f, 9.370478f, 32.497654f, 9.122494f, 31.898968f);
        instancePath.lineTo(6.7303348f, 26.124952f);
        instancePath.lineTo(0.9581761f, 23.73465f);
        instancePath.cubicTo(0.35948908f, 23.486666f, 0.07518837f, 22.800303f, 0.32317263f, 22.201616f);
        instancePath.lineTo(2.7141187f, 16.428947f);
        instancePath.lineTo(0.32317263f, 10.655527f);
        instancePath.cubicTo(0.07518837f, 10.05684f, 0.35948908f, 9.370478f, 0.9581761f, 9.122494f);
        instancePath.lineTo(6.731529f, 6.730061f);
        instancePath.lineTo(9.122494f, 0.9581761f);
        instancePath.cubicTo(9.370478f, 0.35948908f, 10.05684f, 0.07518837f, 10.655527f, 0.32317263f);
        instancePath.lineTo(16.427532f, 2.7138445f);
        instancePath.lineTo(22.201616f, 0.32317263f);
        instancePath.cubicTo(22.800303f, 0.07518837f, 23.486666f, 0.35948908f, 23.73465f, 0.9581761f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(14.467633f, 19.994099f);
        instancePath2.lineTo(23.799828f, 10.661904f);
        instancePath2.lineTo(25.570707f, 12.432784f);
        instancePath2.lineTo(15.225742f, 22.77345f);
        instancePath2.cubicTo(14.809213f, 23.190039f, 14.133837f, 23.1899f, 13.717364f, 22.773252f);
        instancePath2.cubicTo(13.717325f, 22.773214f, 13.717287f, 22.773176f, 13.717364f, 22.773022f);
        instancePath2.lineTo(8.095238f, 17.14683f);
        instancePath2.lineTo(8.095238f, 17.14683f);
        instancePath2.lineTo(9.8578005f, 15.384266f);
        instancePath2.lineTo(14.467633f, 19.994099f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
