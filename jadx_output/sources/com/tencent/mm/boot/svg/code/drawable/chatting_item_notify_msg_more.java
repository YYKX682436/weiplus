package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class chatting_item_notify_msg_more extends l95.c {
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-2565928);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(24.0f, 0.0f);
        instancePath.lineTo(24.0f, 24.0f);
        instancePath.lineTo(0.0f, 24.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.saveLayerAlpha(null, 0, 31);
        canvas.drawPath(instancePath, l95.c.instancePaint(instancePaint4, looper));
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint5.setStrokeWidth(1.0f);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.5f, 0.0f, 1.0f, 5.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint5, looper);
        instancePaint6.setColor(855638016);
        instancePaint6.setStrokeWidth(0.5f);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.25f, 7.0f);
        instancePath2.cubicTo(0.25f, 3.2720778f, 3.2720778f, 0.25f, 7.0f, 0.25f);
        instancePath2.lineTo(14.0f, 0.25f);
        instancePath2.cubicTo(17.727922f, 0.25f, 20.75f, 3.2720778f, 20.75f, 7.0f);
        instancePath2.lineTo(20.75f, 7.0f);
        instancePath2.cubicTo(20.75f, 10.727922f, 17.727922f, 13.75f, 14.0f, 13.75f);
        instancePath2.lineTo(7.0f, 13.75f);
        instancePath2.cubicTo(3.2720778f, 13.75f, 0.25f, 10.727922f, 0.25f, 7.0f);
        instancePath2.lineTo(0.25f, 7.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(855638016);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 0.70710677f, -0.70710677f, 7.9091887f, 0.70710677f, 0.70710677f, -5.2091885f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(10.7426405f, 3.9426408f);
        instancePath3.lineTo(10.7426405f, 6.441641f);
        instancePath3.lineTo(13.2426405f, 6.442641f);
        instancePath3.lineTo(13.2426405f, 7.442641f);
        instancePath3.lineTo(10.7426405f, 7.441641f);
        instancePath3.lineTo(10.7426405f, 9.94264f);
        instancePath3.lineTo(9.7426405f, 9.94264f);
        instancePath3.lineTo(9.7426405f, 7.441641f);
        instancePath3.lineTo(7.2426405f, 7.442641f);
        instancePath3.lineTo(7.2426405f, 6.442641f);
        instancePath3.lineTo(9.7426405f, 6.441641f);
        instancePath3.lineTo(9.7426405f, 3.9426408f);
        instancePath3.lineTo(10.7426405f, 3.9426408f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
