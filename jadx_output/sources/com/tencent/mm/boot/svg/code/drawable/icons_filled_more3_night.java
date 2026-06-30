package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_more3_night extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
        instancePaint3.setColor(-1);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(1.0f, 16.0f);
        instancePath.cubicTo(1.0f, 7.7157288f, 7.7157288f, 1.0f, 16.0f, 1.0f);
        instancePath.lineTo(16.0f, 1.0f);
        instancePath.cubicTo(24.284271f, 1.0f, 31.0f, 7.7157288f, 31.0f, 16.0f);
        instancePath.lineTo(31.0f, 16.0f);
        instancePath.cubicTo(31.0f, 24.284271f, 24.284271f, 31.0f, 16.0f, 31.0f);
        instancePath.lineTo(16.0f, 31.0f);
        instancePath.cubicTo(7.7157288f, 31.0f, 1.0f, 24.284271f, 1.0f, 16.0f);
        instancePath.lineTo(1.0f, 16.0f);
        instancePath.close();
        canvas.saveLayerAlpha(null, 12, 31);
        canvas.drawPath(instancePath, l95.c.instancePaint(instancePaint4, looper));
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(1291845631);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 5.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint5, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(4.5833335f, 9.166667f);
        instancePath2.cubicTo(5.5957f, 9.166667f, 6.4166665f, 9.987267f, 6.4166665f, 11.0f);
        instancePath2.cubicTo(6.4166665f, 12.012366f, 5.5957f, 12.833333f, 4.5833335f, 12.833333f);
        instancePath2.cubicTo(3.5709667f, 12.833333f, 2.75f, 12.012366f, 2.75f, 11.0f);
        instancePath2.cubicTo(2.75f, 9.987267f, 3.5709667f, 9.166667f, 4.5833335f, 9.166667f);
        instancePath2.close();
        instancePath2.moveTo(11.0f, 9.166667f);
        instancePath2.cubicTo(12.012366f, 9.166667f, 12.833333f, 9.987267f, 12.833333f, 11.0f);
        instancePath2.cubicTo(12.833333f, 12.012366f, 12.012366f, 12.833333f, 11.0f, 12.833333f);
        instancePath2.cubicTo(9.987634f, 12.833333f, 9.166667f, 12.012366f, 9.166667f, 11.0f);
        instancePath2.cubicTo(9.166667f, 9.987267f, 9.987634f, 9.166667f, 11.0f, 9.166667f);
        instancePath2.close();
        instancePath2.moveTo(17.416666f, 9.166667f);
        instancePath2.cubicTo(18.429033f, 9.166667f, 19.25f, 9.987267f, 19.25f, 11.0f);
        instancePath2.cubicTo(19.25f, 12.012366f, 18.429033f, 12.833333f, 17.416666f, 12.833333f);
        instancePath2.cubicTo(16.4043f, 12.833333f, 15.583333f, 12.012366f, 15.583333f, 11.0f);
        instancePath2.cubicTo(15.583333f, 9.987267f, 16.4043f, 9.166667f, 17.416666f, 9.166667f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
