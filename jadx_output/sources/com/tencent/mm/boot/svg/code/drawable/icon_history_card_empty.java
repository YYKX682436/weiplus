package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_history_card_empty extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-2565928);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(32.0f, 0.0f);
        instancePath.lineTo(32.0f, 32.0f);
        instancePath.lineTo(0.0f, 32.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.saveLayerAlpha(null, 0, 31);
        canvas.drawPath(instancePath, l95.c.instancePaint(instancePaint3, looper));
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 5.333333f, 0.0f, 1.0f, 2.666667f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(20.0f, 0.0f);
        instancePath2.cubicTo(20.73638f, 0.0f, 21.333334f, 0.5969537f, 21.333334f, 1.3333334f);
        instancePath2.lineTo(21.333334f, 25.333334f);
        instancePath2.cubicTo(21.333334f, 26.069714f, 20.73638f, 26.666666f, 20.0f, 26.666666f);
        instancePath2.lineTo(1.3333334f, 26.666666f);
        instancePath2.cubicTo(0.5969537f, 26.666666f, 0.0f, 26.069714f, 0.0f, 25.333334f);
        instancePath2.lineTo(0.0f, 1.3333334f);
        instancePath2.cubicTo(0.0f, 0.5969537f, 0.5969537f, 0.0f, 1.3333334f, 0.0f);
        instancePath2.lineTo(20.0f, 0.0f);
        instancePath2.close();
        instancePath2.moveTo(19.333334f, 2.0f);
        instancePath2.lineTo(2.0f, 2.0f);
        instancePath2.lineTo(2.0f, 24.666666f);
        instancePath2.lineTo(19.333334f, 24.666666f);
        instancePath2.lineTo(19.333334f, 2.0f);
        instancePath2.close();
        instancePath2.moveTo(9.333333f, 14.666667f);
        instancePath2.lineTo(9.333333f, 16.666666f);
        instancePath2.lineTo(4.0f, 16.666666f);
        instancePath2.lineTo(4.0f, 14.666667f);
        instancePath2.lineTo(9.333333f, 14.666667f);
        instancePath2.close();
        instancePath2.moveTo(14.666667f, 10.0f);
        instancePath2.lineTo(14.666667f, 12.0f);
        instancePath2.lineTo(4.0f, 12.0f);
        instancePath2.lineTo(4.0f, 10.0f);
        instancePath2.lineTo(14.666667f, 10.0f);
        instancePath2.close();
        instancePath2.moveTo(14.666667f, 5.3333335f);
        instancePath2.lineTo(14.666667f, 7.3333335f);
        instancePath2.lineTo(4.0f, 7.3333335f);
        instancePath2.lineTo(4.0f, 5.3333335f);
        instancePath2.lineTo(14.666667f, 5.3333335f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
