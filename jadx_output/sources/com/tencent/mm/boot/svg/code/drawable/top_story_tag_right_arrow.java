package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class top_story_tag_right_arrow extends l95.c {
    private final int width = 6;
    private final int height = 11;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 6;
        }
        if (i17 == 1) {
            return 11;
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
        instancePaint3.setColor(-855310);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -80.0f, 0.0f, 1.0f, -322.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 34.0f, 0.0f, 1.0f, 318.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, -1.0f, 0.0f, 98.0f, 0.0f, -1.0f, 19.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(52.0f, 14.3125f);
        instancePath.lineTo(51.30351f, 15.0f);
        instancePath.lineTo(46.16417f, 9.9270115f);
        instancePath.cubicTo(45.928337f, 9.694224f, 45.92587f, 9.314333f, 46.158653f, 9.078502f);
        instancePath.cubicTo(46.16048f, 9.076652f, 46.16232f, 9.074814f, 46.16417f, 9.0729885f);
        instancePath.lineTo(51.30351f, 4.0f);
        instancePath.lineTo(52.0f, 4.6875f);
        instancePath.lineTo(47.124554f, 9.5f);
        instancePath.lineTo(52.0f, 14.3125f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
