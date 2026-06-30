package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class talk_room_mic_idle extends l95.c {
    private final int width = 48;
    private final int height = 52;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 48;
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
            instancePaint3.setColor(-4534078);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(31.0f, 6.0f);
            instancePath.cubicTo(32.539345f, 3.7781641f, 34.441322f, 1.8890821f, 36.0f, 0.0f);
            instancePath.cubicTo(43.293613f, 6.9936233f, 47.35049f, 16.770628f, 47.0f, 27.0f);
            instancePath.cubicTo(46.814297f, 36.18396f, 42.433674f, 45.40831f, 36.0f, 52.0f);
            instancePath.cubicTo(33.69267f, 50.060677f, 31.821043f, 48.1314f, 30.0f, 46.0f);
            instancePath.cubicTo(35.007866f, 41.29855f, 38.376797f, 34.676716f, 39.0f, 28.0f);
            instancePath.cubicTo(39.520008f, 19.584154f, 36.30283f, 11.455072f, 31.0f, 6.0f);
            instancePath.lineTo(31.0f, 6.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(23.0f, 13.0f);
            instancePath2.cubicTo(24.986967f, 11.330923f, 26.594074f, 9.670524f, 28.0f, 8.0f);
            instancePath2.cubicTo(33.15886f, 13.376049f, 35.837368f, 21.009834f, 35.0f, 28.0f);
            instancePath2.cubicTo(34.181564f, 34.009544f, 31.386173f, 39.031242f, 28.0f, 43.0f);
            instancePath2.cubicTo(26.116812f, 41.299103f, 24.538925f, 39.598206f, 23.0f, 38.0f);
            instancePath2.cubicTo(29.632965f, 31.40758f, 29.837507f, 19.693665f, 23.0f, 13.0f);
            instancePath2.lineTo(23.0f, 13.0f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath3 = l95.c.instancePath(looper);
            instancePath3.moveTo(7.0f, 15.0f);
            instancePath3.cubicTo(13.824487f, 12.176701f, 21.437187f, 17.153526f, 22.0f, 24.0f);
            instancePath3.cubicTo(22.804081f, 30.548067f, 16.49841f, 36.811485f, 10.0f, 36.0f);
            instancePath3.cubicTo(3.6775446f, 35.425156f, -1.1115723f, 29.012133f, 0.0f, 23.0f);
            instancePath3.cubicTo(0.96371174f, 19.158218f, 3.7872953f, 15.866932f, 7.0f, 15.0f);
            instancePath3.lineTo(7.0f, 15.0f);
            instancePath3.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
            canvas.drawPath(instancePath3, instancePaint6);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
