package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sight_list_checkbox_selected_red extends l95.c {
    private final int width = 90;
    private final int height = 90;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 90;
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
                instancePaint3.setColor(-27648);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 11.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(26.41996f, 1.7123995f);
                instancePath.cubicTo(42.029785f, -1.784037f, 59.069595f, 7.9460464f, 64.08954f, 23.090612f);
                instancePath.cubicTo(69.899475f, 38.474934f, 61.969563f, 57.26578f, 46.91973f, 63.879044f);
                instancePath.cubicTo(32.549892f, 71.01177f, 13.600102f, 65.46742f, 5.210196f, 51.84131f);
                instancePath.cubicTo(-2.9097135f, 39.703682f, -1.3797306f, 22.281437f, 8.690157f, 11.712208f);
                instancePath.cubicTo(13.340105f, 6.6174006f, 19.670034f, 3.110974f, 26.41996f, 1.7123995f);
                instancePath.lineTo(26.41996f, 1.7123995f);
                instancePath.close();
                instancePath.moveTo(12.0f, 32.0f);
                instancePath.lineTo(12.0f, 36.0f);
                instancePath.lineTo(54.0f, 36.0f);
                instancePath.lineTo(54.0f, 32.0f);
                instancePath.lineTo(12.0f, 32.0f);
                instancePath.lineTo(12.0f, 32.0f);
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
