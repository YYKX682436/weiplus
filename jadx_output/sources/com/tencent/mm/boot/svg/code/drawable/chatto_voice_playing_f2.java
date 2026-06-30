package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class chatto_voice_playing_f2 extends l95.c {
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
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, -1.0f, 0.0f, 83.55f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(46.21744f, 20.4f);
        instancePath.cubicTo(50.09913f, 24.392387f, 52.5f, 29.907822f, 52.5f, 36.0f);
        instancePath.cubicTo(52.5f, 42.09218f, 50.09913f, 47.607613f, 46.21744f, 51.6f);
        instancePath.lineTo(42.717262f, 48.0f);
        instancePath.cubicTo(45.703175f, 44.928932f, 47.55f, 40.68629f, 47.55f, 36.0f);
        instancePath.cubicTo(47.55f, 31.31371f, 45.703175f, 27.071068f, 42.717262f, 24.0f);
        instancePath.lineTo(46.21744f, 20.4f);
        instancePath.close();
        instancePath.moveTo(38.050358f, 28.8f);
        instancePath.cubicTo(39.841904f, 30.642641f, 40.95f, 33.188225f, 40.95f, 36.0f);
        instancePath.cubicTo(40.95f, 38.811775f, 39.841904f, 41.35736f, 38.050358f, 43.2f);
        instancePath.lineTo(31.05f, 36.0f);
        instancePath.lineTo(38.050358f, 28.8f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
