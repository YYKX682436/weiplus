package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_brand_video_mute_btn_off extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -168.0f, 0.0f, 1.0f, -60.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 168.0f, 0.0f, 1.0f, 60.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(24.0f, 0.0f);
        instancePath.lineTo(24.0f, 24.0f);
        instancePath.lineTo(0.0f, 24.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-1);
        instancePaint4.setStrokeWidth(1.5f);
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.75f, 5.266332f);
        instancePath2.lineTo(0.75f, 12.733709f);
        instancePath2.lineTo(5.1924944f, 12.733709f);
        instancePath2.lineTo(11.25f, 17.016748f);
        instancePath2.lineTo(11.25f, 0.9832927f);
        instancePath2.lineTo(5.1924944f, 5.266332f);
        instancePath2.lineTo(0.75f, 5.266332f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(21.336575f, 12.275914f);
        instancePath3.lineTo(23.49325f, 14.4325905f);
        instancePath3.cubicTo(23.571356f, 14.510695f, 23.571356f, 14.637328f, 23.49325f, 14.715433f);
        instancePath3.lineTo(22.715433f, 15.49325f);
        instancePath3.cubicTo(22.637327f, 15.571355f, 22.510695f, 15.571355f, 22.43259f, 15.49325f);
        instancePath3.lineTo(20.275915f, 13.336575f);
        instancePath3.lineTo(18.119238f, 15.49325f);
        instancePath3.cubicTo(18.041134f, 15.571355f, 17.914501f, 15.571355f, 17.836395f, 15.49325f);
        instancePath3.lineTo(17.058578f, 14.715433f);
        instancePath3.cubicTo(16.980474f, 14.637328f, 16.980474f, 14.510695f, 17.058578f, 14.4325905f);
        instancePath3.lineTo(19.215254f, 12.275914f);
        instancePath3.lineTo(17.058578f, 10.119239f);
        instancePath3.cubicTo(16.980474f, 10.041134f, 16.980474f, 9.914501f, 17.058578f, 9.836396f);
        instancePath3.lineTo(17.836395f, 9.0585785f);
        instancePath3.cubicTo(17.914501f, 8.9804735f, 18.041134f, 8.9804735f, 18.119238f, 9.0585785f);
        instancePath3.lineTo(20.275915f, 11.215254f);
        instancePath3.lineTo(22.43259f, 9.0585785f);
        instancePath3.cubicTo(22.510695f, 8.9804735f, 22.637327f, 8.9804735f, 22.715433f, 9.0585785f);
        instancePath3.lineTo(23.49325f, 9.836396f);
        instancePath3.cubicTo(23.571356f, 9.914501f, 23.571356f, 10.041134f, 23.49325f, 10.119239f);
        instancePath3.lineTo(21.336575f, 12.275914f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
