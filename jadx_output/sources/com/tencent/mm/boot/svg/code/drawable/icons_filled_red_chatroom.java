package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_red_chatroom extends l95.c {
    private final int width = 120;
    private final int height = 120;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 120;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-40634);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 12.0f);
        instancePath.cubicTo(0.0f, 5.3725824f, 5.3725824f, 0.0f, 12.0f, 0.0f);
        instancePath.lineTo(108.0f, 0.0f);
        instancePath.cubicTo(114.62742f, 0.0f, 120.0f, 5.3725824f, 120.0f, 12.0f);
        instancePath.lineTo(120.0f, 108.0f);
        instancePath.cubicTo(120.0f, 114.62742f, 114.62742f, 120.0f, 108.0f, 120.0f);
        instancePath.lineTo(12.0f, 120.0f);
        instancePath.cubicTo(5.3725824f, 120.0f, 0.0f, 114.62742f, 0.0f, 108.0f);
        instancePath.lineTo(0.0f, 12.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 24.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(45.33321f, 12.00534f);
        instancePath2.cubicTo(50.759956f, 12.179521f, 55.105263f, 16.592695f, 55.105263f, 22.000519f);
        instancePath2.lineTo(55.105263f, 26.275465f);
        instancePath2.cubicTo(55.105263f, 29.12324f, 53.591827f, 33.20715f, 51.74043f, 35.378933f);
        instancePath2.lineTo(50.827084f, 36.450333f);
        instancePath2.cubicTo(49.337765f, 38.197376f, 49.803f, 40.420994f, 51.885597f, 41.426277f);
        instancePath2.lineTo(66.18544f, 48.328896f);
        instancePath2.cubicTo(67.739876f, 49.07923f, 69.0f, 51.062923f, 69.0f, 52.78866f);
        instancePath2.lineTo(69.0f, 54.503906f);
        instancePath2.cubicTo(69.0f, 55.88246f, 67.86082f, 57.0f, 66.47007f, 57.0f);
        instancePath2.lineTo(64.44962f, 57.0f);
        instancePath2.cubicTo(64.08242f, 53.51807f, 61.744213f, 50.06899f, 58.630554f, 48.550186f);
        instancePath2.lineTo(42.38079f, 40.62376f);
        instancePath2.lineTo(42.94383f, 39.956337f);
        instancePath2.cubicTo(45.82947f, 36.5357f, 48.0f, 30.606369f, 48.0f, 26.130558f);
        instancePath2.lineTo(48.0f, 21.000622f);
        instancePath2.cubicTo(48.0f, 17.683062f, 47.019802f, 14.593231f, 45.33321f, 12.00534f);
        instancePath2.lineTo(45.33321f, 12.00534f);
        instancePath2.close();
        instancePath2.moveTo(23.495739f, 37.050415f);
        instancePath2.cubicTo(21.288954f, 34.434856f, 19.5f, 29.548489f, 19.5f, 26.127872f);
        instancePath2.lineTo(19.5f, 20.998741f);
        instancePath2.cubicTo(19.5f, 14.37202f, 24.886068f, 9.0f, 31.5f, 9.0f);
        instancePath2.cubicTo(38.12742f, 9.0f, 43.5f, 14.378941f, 43.5f, 21.000622f);
        instancePath2.lineTo(43.5f, 26.130558f);
        instancePath2.cubicTo(43.5f, 29.547888f, 41.702797f, 34.44858f, 39.50426f, 37.054718f);
        instancePath2.lineTo(38.419662f, 38.340397f);
        instancePath2.cubicTo(36.651096f, 40.43685f, 37.203564f, 43.105194f, 39.676647f, 44.31153f);
        instancePath2.lineTo(56.657707f, 52.594673f);
        instancePath2.cubicTo(58.503605f, 53.49508f, 60.0f, 55.87551f, 60.0f, 57.94639f);
        instancePath2.lineTo(60.0f, 60.004684f);
        instancePath2.cubicTo(60.0f, 61.65895f, 58.647224f, 63.0f, 56.995712f, 63.0f);
        instancePath2.lineTo(6.0042887f, 63.0f);
        instancePath2.cubicTo(4.345066f, 63.0f, 3.0f, 61.667267f, 3.0f, 60.004684f);
        instancePath2.lineTo(3.0f, 57.94639f);
        instancePath2.cubicTo(3.0f, 55.891125f, 4.494453f, 53.495724f, 6.342293f, 52.593998f);
        instancePath2.lineTo(23.323353f, 44.30743f);
        instancePath2.cubicTo(25.78613f, 43.10562f, 26.358778f, 40.443787f, 24.580336f, 38.33592f);
        instancePath2.lineTo(23.495739f, 37.050415f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
