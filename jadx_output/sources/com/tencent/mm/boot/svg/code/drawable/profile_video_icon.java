package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class profile_video_icon extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            instancePaint3.setColor(-15028967);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(3.6f, 8.1f);
            instancePath.lineTo(3.6f, 39.9f);
            instancePath.lineTo(41.4f, 39.9f);
            instancePath.lineTo(41.4f, 8.1f);
            instancePath.lineTo(3.6f, 8.1f);
            instancePath.close();
            instancePath.moveTo(3.0f, 4.5f);
            instancePath.lineTo(42.0f, 4.5f);
            instancePath.cubicTo(43.656853f, 4.5f, 45.0f, 5.843146f, 45.0f, 7.5f);
            instancePath.lineTo(45.0f, 40.5f);
            instancePath.cubicTo(45.0f, 42.156853f, 43.656853f, 43.5f, 42.0f, 43.5f);
            instancePath.lineTo(3.0f, 43.5f);
            instancePath.cubicTo(1.3431457f, 43.5f, 0.0f, 42.156853f, 0.0f, 40.5f);
            instancePath.lineTo(0.0f, 7.5f);
            instancePath.cubicTo(0.0f, 5.843146f, 1.3431457f, 4.5f, 3.0f, 4.5f);
            instancePath.close();
            instancePath.moveTo(51.6f, 28.26975f);
            instancePath.lineTo(59.4f, 34.50975f);
            instancePath.lineTo(59.4f, 13.49025f);
            instancePath.lineTo(51.6f, 19.73025f);
            instancePath.lineTo(51.6f, 28.26975f);
            instancePath.close();
            instancePath.moveTo(48.0f, 18.0f);
            instancePath.lineTo(58.125916f, 9.899268f);
            instancePath.cubicTo(59.4197f, 8.86424f, 61.30758f, 9.074003f, 62.342606f, 10.367789f);
            instancePath.cubicTo(62.768158f, 10.899729f, 63.0f, 11.56066f, 63.0f, 12.241875f);
            instancePath.lineTo(63.0f, 35.758125f);
            instancePath.cubicTo(63.0f, 37.414978f, 61.656853f, 38.758125f, 60.0f, 38.758125f);
            instancePath.cubicTo(59.318787f, 38.758125f, 58.657852f, 38.526283f, 58.125916f, 38.10073f);
            instancePath.lineTo(48.0f, 30.0f);
            instancePath.lineTo(48.0f, 18.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
