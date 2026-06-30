package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_record_effect_template extends l95.c {
    private final int width = 30;
    private final int height = 30;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 30;
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 0.9659258f, 0.25881904f, -1.8715264f, -0.25881904f, 0.9659258f, 1.0363061f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(3.0f, 8.62598f);
        instancePath.cubicTo(3.0f, 8.073695f, 3.4477153f, 7.62598f, 4.0f, 7.62598f);
        instancePath.lineTo(16.0098f, 7.62598f);
        instancePath.cubicTo(16.562084f, 7.62598f, 17.0098f, 8.073695f, 17.0098f, 8.62598f);
        instancePath.lineTo(17.0098f, 26.64008f);
        instancePath.cubicTo(17.0098f, 27.192364f, 16.562084f, 27.64008f, 16.0098f, 27.64008f);
        instancePath.lineTo(4.0f, 27.64008f);
        instancePath.cubicTo(3.4477153f, 27.64008f, 3.0f, 27.192364f, 3.0f, 26.64008f);
        instancePath.lineTo(3.0f, 8.62598f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(22.8185f, 18.0709f);
        instancePath2.lineTo(25.2145f, 9.12883f);
        instancePath2.cubicTo(25.3575f, 8.59536f, 25.0409f, 8.04703f, 24.5074f, 7.90408f);
        instancePath2.lineTo(19.7529f, 6.63013f);
        instancePath2.lineTo(22.8185f, 18.0709f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
