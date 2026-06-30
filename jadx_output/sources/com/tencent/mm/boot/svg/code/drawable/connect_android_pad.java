package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class connect_android_pad extends l95.c {
    private final int width = 104;
    private final int height = 104;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 104;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 16.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(100.590164f, 0.0f);
        instancePath.cubicTo(102.473366f, 0.0f, 104.0f, 1.5266356f, 104.0f, 3.409836f);
        instancePath.lineTo(104.0f, 68.196724f);
        instancePath.cubicTo(104.0f, 70.079926f, 102.473366f, 71.60656f, 100.590164f, 71.60656f);
        instancePath.lineTo(3.409836f, 71.60656f);
        instancePath.cubicTo(1.5266356f, 71.60656f, 0.0f, 70.079926f, 0.0f, 68.196724f);
        instancePath.lineTo(0.0f, 3.409836f);
        instancePath.cubicTo(0.0f, 1.5266356f, 1.5266356f, 0.0f, 3.409836f, 0.0f);
        instancePath.lineTo(100.590164f, 0.0f);
        instancePath.close();
        instancePath.moveTo(100.590164f, 0.852459f);
        instancePath.lineTo(3.409836f, 0.852459f);
        instancePath.cubicTo(2.0478785f, 0.852459f, 0.9345842f, 1.9171121f, 0.8568003f, 3.2595708f);
        instancePath.lineTo(0.852459f, 3.409836f);
        instancePath.lineTo(0.852459f, 68.196724f);
        instancePath.cubicTo(0.852459f, 69.55868f, 1.9171121f, 70.671974f, 3.2595708f, 70.749756f);
        instancePath.lineTo(3.409836f, 70.7541f);
        instancePath.lineTo(100.590164f, 70.7541f);
        instancePath.cubicTo(101.952126f, 70.7541f, 103.065414f, 69.689445f, 103.1432f, 68.346985f);
        instancePath.lineTo(103.14754f, 68.196724f);
        instancePath.lineTo(103.14754f, 3.409836f);
        instancePath.cubicTo(103.14754f, 2.0478785f, 102.082886f, 0.9345842f, 100.74043f, 0.8568003f);
        instancePath.lineTo(100.590164f, 0.852459f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(52.0f, 2.409836f);
        instancePath2.cubicTo(52.552284f, 2.409836f, 53.0f, 2.8575513f, 53.0f, 3.409836f);
        instancePath2.cubicTo(53.0f, 3.9621208f, 52.552284f, 4.409836f, 52.0f, 4.409836f);
        instancePath2.cubicTo(51.447716f, 4.409836f, 51.0f, 3.9621208f, 51.0f, 3.409836f);
        instancePath2.cubicTo(51.0f, 2.8575513f, 51.447716f, 2.409836f, 52.0f, 2.409836f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
