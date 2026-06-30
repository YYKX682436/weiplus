package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class album_test_open extends l95.c {
    private final int width = 46;
    private final int height = 46;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 46;
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-11184811);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 5.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(1.1462798f, 3.4678159f);
                instancePath.cubicTo(-0.14277528f, 2.6805818f, -0.7123578f, 0.109614864f, 1.4360675f, 0.0f);
                instancePath.cubicTo(4.623731f, 1.624293f, 6.612273f, 4.872879f, 9.310296f, 7.1548615f);
                instancePath.cubicTo(10.96908f, 5.699973f, 12.857696f, 4.5440345f, 14.886209f, 3.6970105f);
                instancePath.cubicTo(15.485769f, 1.9431727f, 16.874752f, -0.3188796f, 19.083132f, 0.52814436f);
                instancePath.cubicTo(20.75191f, 0.827094f, 20.961756f, 2.7104766f, 21.561316f, 3.9660652f);
                instancePath.cubicTo(24.129435f, 5.3213034f, 26.577639f, 7.134931f, 27.756775f, 9.885268f);
                instancePath.cubicTo(30.714607f, 15.515486f, 28.865961f, 22.112309f, 30.7246f, 28.001616f);
                instancePath.cubicTo(32.263474f, 30.851603f, 35.39118f, 32.42607f, 37.0f, 35.26609f);
                instancePath.cubicTo(36.56032f, 35.70455f, 35.70095f, 36.56154f, 35.261276f, 37.0f);
                instancePath.cubicTo(33.11285f, 35.624832f, 31.424088f, 33.68166f, 29.645391f, 31.88796f);
                instancePath.cubicTo(20.142357f, 22.411257f, 10.639321f, 12.944519f, 1.1462798f, 3.4678159f);
                instancePath.lineTo(1.1462798f, 3.4678159f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(6.4937344f, 13.0f);
                instancePath2.cubicTo(14.062656f, 20.270292f, 21.491228f, 27.668304f, 29.0f, 34.997543f);
                instancePath2.cubicTo(19.666666f, 34.997543f, 10.333333f, 35.00737f, 1.0f, 34.98772f);
                instancePath2.cubicTo(1.7719299f, 32.541363f, 3.9172933f, 30.812214f, 4.5889726f, 28.336386f);
                instancePath2.cubicTo(6.3233085f, 23.394552f, 5.3508773f, 18.05973f, 6.4937344f, 13.0f);
                instancePath2.lineTo(6.4937344f, 13.0f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
