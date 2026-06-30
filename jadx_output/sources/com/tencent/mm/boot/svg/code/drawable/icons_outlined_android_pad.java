package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_android_pad extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 6.123234E-17f, 1.0f, 0.0f, -1.0f, 6.123234E-17f, 72.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(57.0f, 6.0f);
        instancePath.cubicTo(58.656853f, 6.0f, 60.0f, 7.343146f, 60.0f, 9.0f);
        instancePath.lineTo(60.0f, 63.0f);
        instancePath.cubicTo(60.0f, 64.65685f, 58.656853f, 66.0f, 57.0f, 66.0f);
        instancePath.lineTo(15.0f, 66.0f);
        instancePath.cubicTo(13.343145f, 66.0f, 12.0f, 64.65685f, 12.0f, 63.0f);
        instancePath.lineTo(12.0f, 9.0f);
        instancePath.cubicTo(12.0f, 7.343146f, 13.343145f, 6.0f, 15.0f, 6.0f);
        instancePath.lineTo(57.0f, 6.0f);
        instancePath.close();
        instancePath.moveTo(56.4f, 9.6f);
        instancePath.lineTo(15.6f, 9.6f);
        instancePath.lineTo(15.6f, 62.4f);
        instancePath.lineTo(56.4f, 62.4f);
        instancePath.lineTo(56.4f, 9.6f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(36.0f, 18.0f);
        instancePath2.cubicTo(37.656853f, 18.0f, 39.0f, 19.343145f, 39.0f, 21.0f);
        instancePath2.cubicTo(39.0f, 22.656855f, 37.656853f, 24.0f, 36.0f, 24.0f);
        instancePath2.cubicTo(34.343147f, 24.0f, 33.0f, 22.656855f, 33.0f, 21.0f);
        instancePath2.cubicTo(33.0f, 19.343145f, 34.343147f, 18.0f, 36.0f, 18.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
