package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sentpic_camera_icon extends l95.c {
    private final int width = 128;
    private final int height = 128;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 128;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                instancePaint3.setColor(-5658199);
                canvas.save();
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 17.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(8.006973f, 18.0f);
                instancePath.cubicTo(3.584844f, 18.0f, 0.0f, 21.589066f, 0.0f, 26.007586f);
                instancePath.lineTo(0.0f, 85.99242f);
                instancePath.cubicTo(0.0f, 90.41488f, 3.5907528f, 94.0f, 8.006973f, 94.0f);
                instancePath.lineTo(119.99303f, 94.0f);
                instancePath.cubicTo(124.41515f, 94.0f, 128.0f, 90.410934f, 128.0f, 85.99242f);
                instancePath.lineTo(128.0f, 26.007586f);
                instancePath.cubicTo(128.0f, 21.58512f, 124.40925f, 18.0f, 119.99303f, 18.0f);
                instancePath.lineTo(8.006973f, 18.0f);
                instancePath.close();
                instancePath.moveTo(51.428135f, 0.0f);
                instancePath.lineTo(64.0f, 0.0f);
                instancePath.lineTo(64.0f, 18.0f);
                instancePath.lineTo(26.375288f, 18.0f);
                instancePath.cubicTo(36.35272f, 18.0f, 41.71253f, 0.0f, 51.428135f, 0.0f);
                instancePath.close();
                instancePath.moveTo(76.5697f, 0.0f);
                instancePath.lineTo(64.0f, 0.0f);
                instancePath.lineTo(64.0f, 18.0f);
                instancePath.lineTo(101.62471f, 18.0f);
                instancePath.cubicTo(91.647285f, 18.0f, 86.28747f, 0.0f, 76.5697f, 0.0f);
                instancePath.close();
                instancePath.moveTo(93.0f, 53.0f);
                instancePath.cubicTo(93.0f, 69.01692f, 80.01692f, 82.0f, 64.0f, 82.0f);
                instancePath.cubicTo(47.983078f, 82.0f, 35.0f, 69.01692f, 35.0f, 53.0f);
                instancePath.cubicTo(35.0f, 36.983078f, 47.983078f, 24.0f, 64.0f, 24.0f);
                instancePath.cubicTo(80.01692f, 24.0f, 93.0f, 36.983078f, 93.0f, 53.0f);
                instancePath.close();
                instancePath.moveTo(84.0f, 53.0f);
                instancePath.cubicTo(84.0f, 64.046f, 75.046f, 73.0f, 64.0f, 73.0f);
                instancePath.cubicTo(52.954f, 73.0f, 44.0f, 64.046f, 44.0f, 53.0f);
                instancePath.cubicTo(44.0f, 41.954f, 52.954f, 33.0f, 64.0f, 33.0f);
                instancePath.cubicTo(75.046f, 33.0f, 84.0f, 41.954f, 84.0f, 53.0f);
                instancePath.close();
                instancePath.moveTo(6.4545455f, 6.4315085f);
                instancePath.lineTo(24.454546f, 6.4315085f);
                instancePath.lineTo(24.454546f, 12.431508f);
                instancePath.lineTo(6.4545455f, 12.431508f);
                instancePath.lineTo(6.4545455f, 6.4315085f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
