package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class default_open_im_kefu_service extends l95.c {
    private final int width = 144;
    private final int height = 144;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 144;
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
        instancePaint3.setColor(-15432210);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 12.0f);
        instancePath.cubicTo(0.0f, 5.3725824f, 5.3725824f, 0.0f, 12.0f, 0.0f);
        instancePath.lineTo(132.0f, 0.0f);
        instancePath.cubicTo(138.62741f, 0.0f, 144.0f, 5.3725824f, 144.0f, 12.0f);
        instancePath.lineTo(144.0f, 132.0f);
        instancePath.cubicTo(144.0f, 138.62741f, 138.62741f, 144.0f, 132.0f, 144.0f);
        instancePath.lineTo(12.0f, 144.0f);
        instancePath.cubicTo(5.3725824f, 144.0f, 0.0f, 138.62741f, 0.0f, 132.0f);
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
        instancePath2.moveTo(48.0f, 80.0f);
        instancePath2.cubicTo(70.09139f, 80.0f, 88.0f, 64.77768f, 88.0f, 46.0f);
        instancePath2.cubicTo(88.0f, 27.222319f, 70.09139f, 12.0f, 48.0f, 12.0f);
        instancePath2.cubicTo(25.90861f, 12.0f, 8.0f, 27.222319f, 8.0f, 46.0f);
        instancePath2.cubicTo(8.0f, 56.14562f, 13.227992f, 65.253334f, 21.519026f, 71.48293f);
        instancePath2.lineTo(20.310637f, 81.878456f);
        instancePath2.cubicTo(20.183098f, 82.97564f, 20.96915f, 83.96847f, 22.066332f, 84.09601f);
        instancePath2.cubicTo(22.44153f, 84.13962f, 22.821411f, 84.07609f, 23.162004f, 83.91277f);
        instancePath2.lineTo(35.093815f, 78.191345f);
        instancePath2.cubicTo(39.14292f, 79.36389f, 43.484066f, 80.0f, 48.0f, 80.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
