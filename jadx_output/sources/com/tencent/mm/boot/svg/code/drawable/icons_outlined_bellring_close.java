package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_bellring_close extends l95.c {
    private final int width = 24;
    private final int height = 25;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 24;
        }
        if (i17 == 1) {
            return 25;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(5.1867065f, 20.000029f);
        instancePath.cubicTo(4.973726f, 20.000029f, 4.766308f, 19.932f, 4.5946674f, 19.8059f);
        instancePath.cubicTo(4.1496005f, 19.478926f, 4.053867f, 18.853064f, 4.3808413f, 18.407995f);
        instancePath.cubicTo(5.460271f, 16.93865f, 6.0f, 15.469325f, 6.0f, 14.0f);
        instancePath.lineTo(6.0f, 10.0f);
        instancePath.cubicTo(6.0f, 7.377336f, 7.682712f, 5.147691f, 10.027397f, 4.3318033f);
        instancePath.cubicTo(10.0093775f, 4.2238827f, 10.0f, 4.1130366f, 10.0f, 4.0f);
        instancePath.cubicTo(10.0f, 2.8954306f, 10.895431f, 2.0f, 12.0f, 2.0f);
        instancePath.cubicTo(13.104569f, 2.0f, 14.0f, 2.8954306f, 14.0f, 4.0f);
        instancePath.cubicTo(14.0f, 4.1130366f, 13.9906225f, 4.2238827f, 13.972603f, 4.3318033f);
        instancePath.cubicTo(16.317287f, 5.147691f, 18.0f, 7.377336f, 18.0f, 10.0f);
        instancePath.lineTo(18.0f, 14.0f);
        instancePath.cubicTo(18.0f, 15.469309f, 18.539717f, 16.938618f, 19.619152f, 18.407927f);
        instancePath.cubicTo(19.745256f, 18.579578f, 19.813261f, 18.787006f, 19.813261f, 19.0f);
        instancePath.cubicTo(19.813261f, 19.5523f, 19.365532f, 20.000029f, 18.813232f, 20.000029f);
        instancePath.lineTo(13.0f, 20.0f);
        instancePath.lineTo(13.0f, 20.2f);
        instancePath.cubicTo(13.0f, 20.752285f, 12.552284f, 21.2f, 12.0f, 21.2f);
        instancePath.cubicTo(11.447716f, 21.2f, 11.0f, 20.752285f, 11.0f, 20.2f);
        instancePath.lineTo(11.0f, 20.0f);
        instancePath.lineTo(5.1867065f, 20.000029f);
        instancePath.close();
        instancePath.moveTo(12.0f, 3.2f);
        instancePath.cubicTo(11.558172f, 3.2f, 11.2f, 3.5581722f, 11.2f, 4.0f);
        instancePath.cubicTo(11.2f, 4.0457406f, 11.203718f, 4.0904965f, 11.211012f, 4.134177f);
        instancePath.lineTo(11.377702f, 5.132509f);
        instancePath.lineTo(10.42177f, 5.4651475f);
        instancePath.cubicTo(8.508613f, 6.130875f, 7.2f, 7.9408607f, 7.2f, 10.0f);
        instancePath.lineTo(7.2f, 14.0f);
        instancePath.cubicTo(7.2f, 15.630327f, 6.6484923f, 17.235512f, 5.574221f, 18.800026f);
        instancePath.lineTo(18.42583f, 18.800026f);
        instancePath.cubicTo(17.351528f, 17.235563f, 16.8f, 15.630358f, 16.8f, 14.0f);
        instancePath.lineTo(16.8f, 10.0f);
        instancePath.cubicTo(16.8f, 7.9408607f, 15.491387f, 6.130875f, 13.57823f, 5.4651475f);
        instancePath.lineTo(12.622298f, 5.132509f);
        instancePath.lineTo(12.788988f, 4.134177f);
        instancePath.cubicTo(12.796282f, 4.0904965f, 12.8f, 4.0457406f, 12.8f, 4.0f);
        instancePath.cubicTo(12.8f, 3.5581722f, 12.441828f, 3.2f, 12.0f, 3.2f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
