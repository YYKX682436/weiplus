package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class checkbox_selected_black extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                instancePaint3.setColor(-13421773);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(35.0f, 0.0f);
                instancePath.cubicTo(54.329967f, 0.0f, 70.0f, 15.670033f, 70.0f, 35.0f);
                instancePath.cubicTo(70.0f, 54.329967f, 54.329967f, 70.0f, 35.0f, 70.0f);
                instancePath.cubicTo(15.670033f, 70.0f, 0.0f, 54.329967f, 0.0f, 35.0f);
                instancePath.cubicTo(0.0f, 15.670033f, 15.670033f, 0.0f, 35.0f, 0.0f);
                instancePath.close();
                instancePath.moveTo(50.479637f, 22.89f);
                instancePath.lineTo(30.88203f, 42.48761f);
                instancePath.lineTo(21.201382f, 32.806957f);
                instancePath.lineTo(17.5f, 36.50834f);
                instancePath.lineTo(27.70898f, 46.724705f);
                instancePath.cubicTo(27.708654f, 46.725357f, 27.708818f, 46.72552f, 27.70898f, 46.725685f);
                instancePath.lineTo(27.876831f, 46.885323f);
                instancePath.cubicTo(29.642986f, 48.481728f, 32.37013f, 48.429077f, 34.072453f, 46.726517f);
                instancePath.lineTo(34.072453f, 46.726517f);
                instancePath.lineTo(54.198486f, 26.608847f);
                instancePath.lineTo(50.479637f, 22.89f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(0.0f, 0.0f);
                instancePath2.lineTo(72.0f, 0.0f);
                instancePath2.lineTo(72.0f, 72.0f);
                instancePath2.lineTo(0.0f, 72.0f);
                instancePath2.lineTo(0.0f, 0.0f);
                instancePath2.close();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
