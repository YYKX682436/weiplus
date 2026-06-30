package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_multi_device extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(19.0f, 0.0f);
        instancePath.cubicTo(19.552284f, 0.0f, 20.0f, 0.44771525f, 20.0f, 1.0f);
        instancePath.lineTo(20.0f, 5.0f);
        instancePath.lineTo(21.0f, 5.0f);
        instancePath.cubicTo(21.552284f, 5.0f, 22.0f, 5.4477153f, 22.0f, 6.0f);
        instancePath.lineTo(22.0f, 17.0f);
        instancePath.cubicTo(22.0f, 17.552284f, 21.552284f, 18.0f, 21.0f, 18.0f);
        instancePath.lineTo(14.0f, 18.0f);
        instancePath.cubicTo(13.630319f, 18.0f, 13.30749f, 17.7994f, 13.134428f, 17.501114f);
        instancePath.lineTo(6.696681f, 17.5f);
        instancePath.cubicTo(6.642261f, 17.5f, 6.588206f, 17.491116f, 6.5366483f, 17.473698f);
        instancePath.cubicTo(6.2750325f, 17.385315f, 6.1345997f, 17.101583f, 6.2229834f, 16.839968f);
        instancePath.lineTo(6.8445916f, 15.0f);
        instancePath.lineTo(1.0f, 15.0f);
        instancePath.cubicTo(0.44771525f, 15.0f, 0.0f, 14.552284f, 0.0f, 14.0f);
        instancePath.lineTo(0.0f, 1.0f);
        instancePath.cubicTo(0.0f, 0.44771525f, 0.44771525f, 0.0f, 1.0f, 0.0f);
        instancePath.lineTo(19.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(20.8f, 6.2f);
        instancePath.lineTo(14.2f, 6.2f);
        instancePath.lineTo(14.2f, 16.8f);
        instancePath.lineTo(20.8f, 16.8f);
        instancePath.lineTo(20.8f, 6.2f);
        instancePath.close();
        instancePath.moveTo(13.0f, 14.999988f);
        instancePath.lineTo(8.111226f, 14.999988f);
        instancePath.lineTo(7.6720343f, 16.3f);
        instancePath.lineTo(13.0f, 16.299f);
        instancePath.lineTo(13.0f, 14.999988f);
        instancePath.close();
        instancePath.moveTo(17.5f, 14.5f);
        instancePath.cubicTo(17.914213f, 14.5f, 18.25f, 14.835787f, 18.25f, 15.25f);
        instancePath.cubicTo(18.25f, 15.664213f, 17.914213f, 16.0f, 17.5f, 16.0f);
        instancePath.cubicTo(17.085787f, 16.0f, 16.75f, 15.664213f, 16.75f, 15.25f);
        instancePath.cubicTo(16.75f, 14.835787f, 17.085787f, 14.5f, 17.5f, 14.5f);
        instancePath.close();
        instancePath.moveTo(13.0f, 13.8f);
        instancePath.lineTo(13.0f, 12.2f);
        instancePath.lineTo(1.199f, 12.2f);
        instancePath.lineTo(1.2f, 13.8f);
        instancePath.lineTo(13.0f, 13.8f);
        instancePath.close();
        instancePath.moveTo(18.799f, 5.0f);
        instancePath.lineTo(18.8f, 1.2f);
        instancePath.lineTo(1.2f, 1.2f);
        instancePath.lineTo(1.199f, 11.0f);
        instancePath.lineTo(13.0f, 11.0f);
        instancePath.lineTo(13.0f, 6.0f);
        instancePath.cubicTo(13.0f, 5.4477153f, 13.447716f, 5.0f, 14.0f, 5.0f);
        instancePath.lineTo(18.799f, 5.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
