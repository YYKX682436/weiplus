package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class lucky_money_emoji_reply_btn extends l95.c {
    private final int width = 60;
    private final int height = 60;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 60;
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-3955858);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -124.0f, 0.0f, 1.0f, -377.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 108.0f, 0.0f, 1.0f, 363.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 16.0f, 0.0f, 1.0f, 14.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray3);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(30.0f, 0.0f);
                instancePath.cubicTo(46.568542f, 0.0f, 60.0f, 13.4314575f, 60.0f, 30.0f);
                instancePath.cubicTo(60.0f, 46.568542f, 46.568542f, 60.0f, 30.0f, 60.0f);
                instancePath.cubicTo(13.4314575f, 60.0f, 0.0f, 46.568542f, 0.0f, 30.0f);
                instancePath.cubicTo(0.0f, 13.4314575f, 13.4314575f, 0.0f, 30.0f, 0.0f);
                instancePath.close();
                instancePath.moveTo(30.0f, 3.6f);
                instancePath.cubicTo(15.4196825f, 3.6f, 3.6f, 15.4196825f, 3.6f, 30.0f);
                instancePath.cubicTo(3.6f, 44.58032f, 15.4196825f, 56.4f, 30.0f, 56.4f);
                instancePath.cubicTo(44.58032f, 56.4f, 56.4f, 44.58032f, 56.4f, 30.0f);
                instancePath.cubicTo(56.4f, 15.4196825f, 44.58032f, 3.6f, 30.0f, 3.6f);
                instancePath.close();
                instancePath.moveTo(48.0f, 31.5f);
                instancePath.cubicTo(48.0f, 41.441124f, 39.941124f, 49.5f, 30.0f, 49.5f);
                instancePath.cubicTo(20.058874f, 49.5f, 12.0f, 41.441124f, 12.0f, 31.5f);
                instancePath.lineTo(48.0f, 31.5f);
                instancePath.close();
                instancePath.moveTo(43.94634f, 35.1f);
                instancePath.lineTo(16.053663f, 35.1f);
                instancePath.cubicTo(17.652218f, 41.310818f, 23.290178f, 45.9f, 30.0f, 45.9f);
                instancePath.cubicTo(36.709824f, 45.9f, 42.347782f, 41.310818f, 43.94634f, 35.1f);
                instancePath.close();
                instancePath.moveTo(19.5f, 16.5f);
                instancePath.cubicTo(21.985281f, 16.5f, 24.0f, 18.514719f, 24.0f, 21.0f);
                instancePath.cubicTo(24.0f, 23.485281f, 21.985281f, 25.5f, 19.5f, 25.5f);
                instancePath.cubicTo(17.014719f, 25.5f, 15.0f, 23.485281f, 15.0f, 21.0f);
                instancePath.cubicTo(15.0f, 18.514719f, 17.014719f, 16.5f, 19.5f, 16.5f);
                instancePath.close();
                instancePath.moveTo(40.5f, 16.5f);
                instancePath.cubicTo(42.985283f, 16.5f, 45.0f, 18.514719f, 45.0f, 21.0f);
                instancePath.cubicTo(45.0f, 23.485281f, 42.985283f, 25.5f, 40.5f, 25.5f);
                instancePath.cubicTo(38.014717f, 25.5f, 36.0f, 23.485281f, 36.0f, 21.0f);
                instancePath.cubicTo(36.0f, 18.514719f, 38.014717f, 16.5f, 40.5f, 16.5f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
