package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class fav_list_img_default extends l95.c {
    private final int width = uc1.w1.CTRL_INDEX;
    private final int height = 414;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return uc1.w1.CTRL_INDEX;
        }
        if (i17 == 1) {
            return 414;
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
            l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1315861);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 225.0f, 0.0f, 1.0f, 114.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(228.0f, 119.822876f);
            instancePath.lineTo(228.0f, 12.0f);
            instancePath.lineTo(12.0f, 12.0f);
            instancePath.lineTo(12.0f, 119.51874f);
            instancePath.lineTo(80.73831f, 55.335876f);
            instancePath.lineTo(162.56027f, 130.40851f);
            instancePath.lineTo(150.84477f, 106.321465f);
            instancePath.lineTo(184.2155f, 80.51195f);
            instancePath.lineTo(228.0f, 119.822876f);
            instancePath.lineTo(228.0f, 119.822876f);
            instancePath.close();
            instancePath.moveTo(5.9924946f, 0.0f);
            instancePath.cubicTo(2.6829312f, 0.0f, 0.0f, 2.6830428f, 0.0f, 6.004041f);
            instancePath.lineTo(0.0f, 179.99596f);
            instancePath.cubicTo(0.0f, 183.3119f, 2.6953125f, 186.0f, 5.9924946f, 186.0f);
            instancePath.lineTo(234.0075f, 186.0f);
            instancePath.cubicTo(237.31706f, 186.0f, 240.0f, 183.31696f, 240.0f, 179.99596f);
            instancePath.lineTo(240.0f, 6.004041f);
            instancePath.cubicTo(240.0f, 2.6881008f, 237.30469f, 0.0f, 234.0075f, 0.0f);
            instancePath.lineTo(5.9924946f, 0.0f);
            instancePath.lineTo(5.9924946f, 0.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
