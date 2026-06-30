package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class voice2txt_hint_cancel extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.saveLayerAlpha(null, 128, 31);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(6.5857863f, 6.0f);
        instancePath.lineTo(8.414213f, 7.8284273f);
        instancePath.lineTo(7.0f, 9.2426405f);
        instancePath.lineTo(3.464466f, 5.7071066f);
        instancePath.cubicTo(3.0739417f, 5.3165827f, 3.0739417f, 4.6834173f, 3.464466f, 4.2928934f);
        instancePath.lineTo(7.0f, 0.7573593f);
        instancePath.lineTo(8.414213f, 2.171573f);
        instancePath.lineTo(6.5857863f, 4.0f);
        instancePath.lineTo(11.0f, 4.0f);
        instancePath.cubicTo(14.313708f, 4.0f, 17.0f, 6.6862917f, 17.0f, 10.0f);
        instancePath.cubicTo(17.0f, 13.313708f, 14.313708f, 16.0f, 11.0f, 16.0f);
        instancePath.lineTo(0.0f, 16.0f);
        instancePath.lineTo(0.0f, 14.0f);
        instancePath.lineTo(11.0f, 14.0f);
        instancePath.cubicTo(13.209139f, 14.0f, 15.0f, 12.209139f, 15.0f, 10.0f);
        instancePath.cubicTo(15.0f, 7.790861f, 13.209139f, 6.0f, 11.0f, 6.0f);
        instancePath.lineTo(6.5857863f, 6.0f);
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
