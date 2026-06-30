package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class friendactivity_comment_likeicon_pressed extends l95.c {
    private final int width = 80;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 80;
        }
        if (i17 == 1) {
            return 72;
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
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.3333334f, 0.0f, 0.0f, 0.0f, 1.3333334f, 0.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-2171170);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(10.02f, 4.03f);
            instancePath.cubicTo(16.37f, -0.03f, 25.25f, 2.32f, 30.0f, 7.82f);
            instancePath.cubicTo(34.75f, 2.31f, 43.65f, -0.03f, 50.0f, 4.04f);
            instancePath.cubicTo(56.64f, 8.75f, 57.4f, 18.37f, 54.62f, 25.46f);
            instancePath.cubicTo(49.99f, 36.69f, 40.55f, 45.38f, 30.0f, 51.04f);
            instancePath.cubicTo(19.44f, 45.38f, 10.0f, 36.68f, 5.38f, 25.44f);
            instancePath.cubicTo(2.59f, 18.35f, 3.37f, 8.73f, 10.02f, 4.03f);
            instancePath.moveTo(10.78f, 12.53f);
            instancePath.cubicTo(9.05f, 17.39f, 9.87f, 23.01f, 12.63f, 27.35f);
            instancePath.cubicTo(16.91f, 34.26f, 23.39f, 39.46f, 30.0f, 44.02f);
            instancePath.cubicTo(35.84f, 40.01f, 41.47f, 35.49f, 45.75f, 29.79f);
            instancePath.cubicTo(48.53f, 26.15f, 50.43f, 21.67f, 50.08f, 17.01f);
            instancePath.cubicTo(50.12f, 13.43f, 48.4f, 9.15f, 44.52f, 8.35f);
            instancePath.cubicTo(38.67f, 6.6f, 34.27f, 11.91f, 30.0f, 14.96f);
            instancePath.cubicTo(26.8f, 12.47f, 23.72f, 9.6f, 19.86f, 8.15f);
            instancePath.cubicTo(16.34f, 7.44f, 12.05f, 8.89f, 10.78f, 12.53f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
