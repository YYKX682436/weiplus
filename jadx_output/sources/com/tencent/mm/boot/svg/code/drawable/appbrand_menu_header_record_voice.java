package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class appbrand_menu_header_record_voice extends l95.c {
    private final int width = 10;
    private final int height = 13;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 10;
        }
        if (i17 == 1) {
            return 13;
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
            instancePaint3.setColor(-1);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -287.0f, 0.0f, 1.0f, -422.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 279.0f, 0.0f, 1.0f, 417.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 4.7f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray3);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(7.4375f, 11.06017f);
            instancePath.lineTo(7.4375f, 12.833333f);
            instancePath.lineTo(6.5625f, 12.833333f);
            instancePath.lineTo(6.5625f, 11.06017f);
            instancePath.cubicTo(4.5130606f, 10.84187f, 2.9166667f, 9.107364f, 2.9166667f, 7.0f);
            instancePath.lineTo(2.9166667f, 5.8333335f);
            instancePath.lineTo(3.7916667f, 5.8333335f);
            instancePath.lineTo(3.7916667f, 7.0f);
            instancePath.cubicTo(3.7916667f, 8.771914f, 5.2280865f, 10.208333f, 7.0f, 10.208333f);
            instancePath.cubicTo(8.771914f, 10.208333f, 10.208333f, 8.771914f, 10.208333f, 7.0f);
            instancePath.lineTo(10.208333f, 5.8333335f);
            instancePath.lineTo(11.083333f, 5.8333335f);
            instancePath.lineTo(11.083333f, 7.0f);
            instancePath.cubicTo(11.083333f, 9.107364f, 9.486939f, 10.84187f, 7.4375f, 11.06017f);
            instancePath.close();
            instancePath.moveTo(4.6666665f, 3.5f);
            instancePath.cubicTo(4.6666665f, 2.2113357f, 5.7113357f, 1.1666666f, 7.0f, 1.1666666f);
            instancePath.cubicTo(8.288665f, 1.1666666f, 9.333333f, 2.2113357f, 9.333333f, 3.5f);
            instancePath.lineTo(9.333333f, 7.0f);
            instancePath.cubicTo(9.333333f, 8.288665f, 8.288665f, 9.333333f, 7.0f, 9.333333f);
            instancePath.cubicTo(5.7113357f, 9.333333f, 4.6666665f, 8.288665f, 4.6666665f, 7.0f);
            instancePath.lineTo(4.6666665f, 3.5f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
