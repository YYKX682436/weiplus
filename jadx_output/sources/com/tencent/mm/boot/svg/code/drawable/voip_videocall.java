package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class voip_videocall extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        canvas.saveLayerAlpha(null, 230, 31);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, -1.0f, 0.0f, 72.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, -1.0f, 0.0f, 72.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 18.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        float[] matrixFloatArray4 = l95.c.setMatrixFloatArray(matrixFloatArray3, -1.0f, 0.0f, 66.650795f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(15.814285f, 31.066668f);
        instancePath.lineTo(50.83651f, 31.066668f);
        instancePath.lineTo(50.83651f, 3.6f);
        instancePath.lineTo(15.814285f, 3.6f);
        instancePath.lineTo(15.814285f, 31.066668f);
        instancePath.close();
        instancePath.moveTo(14.401286f, 2.220446E-16f);
        instancePath.lineTo(52.249508f, -1.110223E-16f);
        instancePath.cubicTo(53.457355f, -3.3290015E-16f, 54.43651f, 0.9791533f, 54.43651f, 2.187f);
        instancePath.lineTo(54.43651f, 32.479668f);
        instancePath.cubicTo(54.43651f, 33.687515f, 53.457355f, 34.666668f, 52.249508f, 34.666668f);
        instancePath.lineTo(14.401286f, 34.666668f);
        instancePath.cubicTo(13.193439f, 34.666668f, 12.214286f, 33.687515f, 12.214286f, 32.479668f);
        instancePath.lineTo(12.214286f, 2.187f);
        instancePath.cubicTo(12.214286f, 0.9791533f, 13.193439f, 1.1100563E-15f, 14.401286f, 2.220446E-16f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        float[] matrixFloatArray5 = l95.c.setMatrixFloatArray(matrixFloatArray4, -1.0f, 0.0f, 15.079366f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray5);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(3.6f, 19.946148f);
        instancePath2.lineTo(11.479365f, 27.687836f);
        instancePath2.lineTo(11.479365f, 6.7578244f);
        instancePath2.lineTo(3.6f, 14.499511f);
        instancePath2.lineTo(3.6f, 19.946148f);
        instancePath2.close();
        instancePath2.moveTo(0.0f, 12.989721f);
        instancePath2.lineTo(11.3596115f, 1.8286f);
        instancePath2.cubicTo(12.221183f, 0.9820839f, 13.605861f, 0.99428797f, 14.452377f, 1.8558587f);
        instancePath2.cubicTo(14.854209f, 2.2648373f, 15.079365f, 2.8152597f, 15.079365f, 3.3886118f);
        instancePath2.lineTo(15.079365f, 31.057047f);
        instancePath2.cubicTo(15.079365f, 32.264893f, 14.100212f, 33.24405f, 12.892365f, 33.24405f);
        instancePath2.cubicTo(12.319013f, 33.24405f, 11.768591f, 33.01889f, 11.3596115f, 32.617058f);
        instancePath2.lineTo(0.0f, 21.455938f);
        instancePath2.lineTo(0.0f, 12.989721f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
