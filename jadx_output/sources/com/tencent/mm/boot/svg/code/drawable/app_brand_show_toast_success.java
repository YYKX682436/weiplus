package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_brand_show_toast_success extends l95.c {
    private final int width = 200;
    private final int height = 200;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 200;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                canvas.save();
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 29.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.31970137f, 77.93319f);
                instancePath.cubicTo(-0.063724294f, 77.53636f, -0.108552635f, 76.85273f, 0.2193248f, 76.40659f);
                instancePath.lineTo(9.792403f, 63.380688f);
                instancePath.cubicTo(10.120393f, 62.934402f, 10.738718f, 62.842735f, 11.176576f, 63.17833f);
                instancePath.lineTo(61.002815f, 101.36729f);
                instancePath.cubicTo(62.317314f, 102.37477f, 64.42048f, 102.32714f, 65.687584f, 101.27154f);
                instancePath.lineTo(186.95796f, 0.24350294f);
                instancePath.cubicTo(187.37868f, -0.10698287f, 188.04178f, -0.07305191f, 188.42578f, 0.3061832f);
                instancePath.lineTo(197.7745f, 9.538964f);
                instancePath.cubicTo(198.16446f, 9.9240675f, 198.16162f, 10.550133f, 197.76987f, 10.935685f);
                instancePath.lineTo(64.80481f, 141.79317f);
                instancePath.cubicTo(64.01734f, 142.56815f, 62.75824f, 142.55399f, 61.988094f, 141.75691f);
                instancePath.lineTo(0.31970137f, 77.93319f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
