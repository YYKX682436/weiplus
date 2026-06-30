package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class video_icon_sub extends l95.c {
    private final int width = 42;
    private final int height = 27;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 42;
        }
        if (i17 == 1) {
            return 27;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.5f);
        instancePath.lineTo(26.0f, 0.5f);
        instancePath.lineTo(26.0f, 24.5f);
        instancePath.lineTo(0.0f, 24.5f);
        instancePath.lineTo(0.0f, 0.5f);
        instancePath.close();
        instancePath.moveTo(2.0f, 2.5f);
        instancePath.lineTo(2.0f, 22.5f);
        instancePath.lineTo(24.0f, 22.5f);
        instancePath.lineTo(24.0f, 2.5f);
        instancePath.lineTo(2.0f, 2.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 27.363636f, 0.0f, 1.0f, 1.090909f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(31.008236f, 11.565939f);
        instancePath2.lineTo(31.002834f, 13.579968f);
        instancePath2.lineTo(39.986187f, 19.714403f);
        instancePath2.lineTo(39.997097f, 5.3252935f);
        instancePath2.lineTo(31.008236f, 11.565939f);
        instancePath2.close();
        instancePath2.moveTo(29.011042f, 10.51777f);
        instancePath2.lineTo(42.0f, 1.5f);
        instancePath2.lineTo(41.983315f, 23.5f);
        instancePath2.lineTo(29.0f, 14.634123f);
        instancePath2.lineTo(29.011042f, 10.51777f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
