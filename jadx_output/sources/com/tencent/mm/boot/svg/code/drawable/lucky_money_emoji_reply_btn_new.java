package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class lucky_money_emoji_reply_btn_new extends l95.c {
    private final int width = 60;
    private final int height = 60;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 60;
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(looper);
        instancePaint3.setFlags(385);
        instancePaint3.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint3.setColor(-16777216);
        instancePaint4.setStrokeWidth(1.0f);
        instancePaint4.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint4.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint4.setStrokeMiter(4.0f);
        instancePaint4.setPathEffect(null);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        l95.c.instancePaint(instancePaint3, looper).setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(60.0f, 0.0f);
        instancePath2.lineTo(60.0f, 60.0f);
        instancePath2.lineTo(0.0f, 60.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.addPath(instancePath, instanceMatrix, instancePath2, true);
        canvas.clipPath(instancePath);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-3955858);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(30.0f, 0.0f);
        instancePath3.cubicTo(46.5685f, 0.0f, 60.0f, 13.4315f, 60.0f, 30.0f);
        instancePath3.cubicTo(60.0f, 46.5685f, 46.5685f, 60.0f, 30.0f, 60.0f);
        instancePath3.cubicTo(13.4315f, 60.0f, 0.0f, 46.5685f, 0.0f, 30.0f);
        instancePath3.cubicTo(0.0f, 13.4315f, 13.4315f, 0.0f, 30.0f, 0.0f);
        instancePath3.close();
        instancePath3.moveTo(30.0f, 4.5f);
        instancePath3.cubicTo(15.9167f, 4.5f, 4.5f, 15.9167f, 4.5f, 30.0f);
        instancePath3.cubicTo(4.5f, 44.0833f, 15.9167f, 55.5f, 30.0f, 55.5f);
        instancePath3.cubicTo(44.0833f, 55.5f, 55.5f, 44.0833f, 55.5f, 30.0f);
        instancePath3.cubicTo(55.5f, 15.9167f, 44.0833f, 4.5f, 30.0f, 4.5f);
        instancePath3.close();
        instancePath3.moveTo(48.0f, 31.5f);
        instancePath3.cubicTo(48.0f, 41.4411f, 39.9411f, 49.5f, 30.0f, 49.5f);
        instancePath3.cubicTo(20.2848f, 49.5f, 12.3673f, 41.8033f, 12.0124f, 32.1748f);
        instancePath3.lineTo(12.0f, 31.5f);
        instancePath3.lineTo(48.0f, 31.5f);
        instancePath3.close();
        instancePath3.moveTo(42.7262f, 36.0f);
        instancePath3.lineTo(17.2712f, 36.0f);
        instancePath3.lineTo(17.3597f, 36.2531f);
        instancePath3.cubicTo(19.2135f, 41.1818f, 23.8674f, 44.7292f, 29.3626f, 44.9852f);
        instancePath3.lineTo(30.0002f, 45.0f);
        instancePath3.cubicTo(35.7519f, 45.0f, 40.6634f, 41.4031f, 42.6082f, 36.336f);
        instancePath3.lineTo(42.7262f, 36.0f);
        instancePath3.close();
        instancePath3.moveTo(24.558f, 20.5477f);
        instancePath3.cubicTo(24.558f, 23.2815f, 22.3418f, 25.4977f, 19.608f, 25.4977f);
        instancePath3.cubicTo(16.8741f, 25.4977f, 14.658f, 23.2815f, 14.658f, 20.5477f);
        instancePath3.cubicTo(14.658f, 17.8138f, 16.8741f, 15.5977f, 19.608f, 15.5977f);
        instancePath3.cubicTo(22.3418f, 15.5977f, 24.558f, 17.8138f, 24.558f, 20.5477f);
        instancePath3.close();
        instancePath3.moveTo(40.5728f, 25.4977f);
        instancePath3.cubicTo(43.3066f, 25.4977f, 45.5228f, 23.2815f, 45.5228f, 20.5477f);
        instancePath3.cubicTo(45.5228f, 17.8138f, 43.3066f, 15.5977f, 40.5728f, 15.5977f);
        instancePath3.cubicTo(37.839f, 15.5977f, 35.6228f, 17.8138f, 35.6228f, 20.5477f);
        instancePath3.cubicTo(35.6228f, 23.2815f, 37.839f, 25.4977f, 40.5728f, 25.4977f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
