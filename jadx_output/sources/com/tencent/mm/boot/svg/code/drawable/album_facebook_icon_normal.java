package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class album_facebook_icon_normal extends l95.c {
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(16.972387f, 0.040298507f);
        instancePath.lineTo(1.027612f, 0.040298507f);
        instancePath.cubicTo(0.48358208f, 0.040298507f, 0.040298507f, 0.48358208f, 0.040298507f, 1.027612f);
        instancePath.lineTo(0.040298507f, 16.972387f);
        instancePath.cubicTo(0.040298507f, 17.516418f, 0.48358208f, 17.959702f, 1.027612f, 17.959702f);
        instancePath.lineTo(9.611194f, 17.959702f);
        instancePath.lineTo(9.611194f, 11.021642f);
        instancePath.lineTo(7.2738805f, 11.021642f);
        instancePath.lineTo(7.2738805f, 8.314925f);
        instancePath.lineTo(9.611194f, 8.314925f);
        instancePath.lineTo(9.611194f, 6.3201494f);
        instancePath.cubicTo(9.611194f, 4.002985f, 11.028358f, 2.747015f, 13.090299f, 2.747015f);
        instancePath.cubicTo(14.077612f, 2.747015f, 14.930597f, 2.8208954f, 15.179105f, 2.8544776f);
        instancePath.lineTo(15.179105f, 5.272388f);
        instancePath.lineTo(13.7485075f, 5.272388f);
        instancePath.cubicTo(12.626865f, 5.272388f, 12.405224f, 5.802985f, 12.405224f, 6.588806f);
        instancePath.lineTo(12.405224f, 8.314925f);
        instancePath.lineTo(15.085074f, 8.314925f);
        instancePath.lineTo(14.735821f, 11.021642f);
        instancePath.lineTo(12.405224f, 11.021642f);
        instancePath.lineTo(12.405224f, 17.966417f);
        instancePath.lineTo(16.972387f, 17.966417f);
        instancePath.cubicTo(17.516418f, 17.966417f, 17.959702f, 17.523134f, 17.959702f, 16.979105f);
        instancePath.lineTo(17.959702f, 1.027612f);
        instancePath.cubicTo(17.959702f, 0.47686568f, 17.523134f, 0.040298507f, 16.972387f, 0.040298507f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
