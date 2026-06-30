package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_outlined_search extends l95.c {
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(24.0f, 0.0f);
        instancePath.lineTo(24.0f, 24.0f);
        instancePath.lineTo(0.0f, 24.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.6f, 0.0f, 1.0f, 3.6f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(7.245378f, 0.0f);
        instancePath2.cubicTo(11.246897f, 0.0f, 14.490756f, 3.2438593f, 14.490756f, 7.245378f);
        instancePath2.cubicTo(14.490756f, 9.048666f, 13.831973f, 10.698084f, 12.741946f, 11.966092f);
        instancePath2.lineTo(17.0f, 16.225233f);
        instancePath2.lineTo(16.121727f, 17.103506f);
        instancePath2.lineTo(11.853742f, 12.836574f);
        instancePath2.cubicTo(10.601368f, 13.869984f, 8.995869f, 14.490756f, 7.245378f, 14.490756f);
        instancePath2.cubicTo(3.2438593f, 14.490756f, 0.0f, 11.246897f, 0.0f, 7.245378f);
        instancePath2.cubicTo(0.0f, 3.2438593f, 3.2438593f, 0.0f, 7.245378f, 0.0f);
        instancePath2.close();
        instancePath2.moveTo(7.245375f, 1.2420775f);
        instancePath2.cubicTo(3.9298308f, 1.2420775f, 1.2420616f, 3.9298465f, 1.2420616f, 7.245391f);
        instancePath2.cubicTo(1.2420616f, 10.560935f, 3.9298308f, 13.248704f, 7.245375f, 13.248704f);
        instancePath2.cubicTo(10.560919f, 13.248704f, 13.248688f, 10.560935f, 13.248688f, 7.245391f);
        instancePath2.cubicTo(13.248688f, 3.9298465f, 10.560919f, 1.2420775f, 7.245375f, 1.2420775f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
