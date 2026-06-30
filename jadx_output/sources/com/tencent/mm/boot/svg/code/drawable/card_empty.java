package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class card_empty extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 32;
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
                instancePaint3.setColor(-436207616);
                canvas.save();
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(1.6f, 5.6614323f);
                instancePath.lineTo(1.6f, 19.100517f);
                instancePath.lineTo(23.733334f, 22.012798f);
                instancePath.lineTo(23.733334f, 8.573713f);
                instancePath.lineTo(1.6f, 5.6614323f);
                instancePath.close();
                instancePath.moveTo(22.87462f, 0.8229694f);
                instancePath.cubicTo(23.496151f, 0.73664576f, 24.0f, 1.1719935f, 24.0f, 1.8082237f);
                instancePath.lineTo(24.0f, 1.8082237f);
                instancePath.lineTo(24.0f, 6.994067f);
                instancePath.lineTo(24.212105f, 7.022918f);
                instancePath.cubicTo(24.831343f, 7.104397f, 25.333334f, 7.6875243f, 25.333334f, 8.316016f);
                instancePath.lineTo(25.333334f, 22.501385f);
                instancePath.cubicTo(25.333334f, 23.239088f, 24.7321f, 23.758005f, 24.006971f, 23.662594f);
                instancePath.lineTo(1.1212294f, 20.651312f);
                instancePath.cubicTo(0.5019915f, 20.569834f, 0.0f, 19.986706f, 0.0f, 19.358213f);
                instancePath.lineTo(0.0f, 5.172845f);
                instancePath.lineTo(0.001f, 5.141067f);
                instancePath.cubicTo(0.0f, 4.5531235f, 0.43666545f, 4.008028f, 1.0023082f, 3.867489f);
                instancePath.lineTo(1.1253794f, 3.8436973f);
                instancePath.close();
                instancePath.moveTo(22.4f, 2.5042472f);
                instancePath.lineTo(6.576f, 4.702067f);
                instancePath.lineTo(22.399f, 6.783067f);
                instancePath.lineTo(22.4f, 2.5042472f);
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
