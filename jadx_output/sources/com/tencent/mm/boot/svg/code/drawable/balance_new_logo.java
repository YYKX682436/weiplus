package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class balance_new_logo extends l95.c {
    private final int width = 40;
    private final int height = 40;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 40;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        l95.c.instancePaint(instancePaint3, looper).setStrokeWidth(1.0f);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.333333f, 0.0f, 1.0f, 3.333333f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-15616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(16.666666f, 33.333332f);
        instancePath.cubicTo(7.4619207f, 33.333332f, 0.0f, 25.871412f, 0.0f, 16.666666f);
        instancePath.cubicTo(0.0f, 7.4619207f, 7.4619207f, 0.0f, 16.666666f, 0.0f);
        instancePath.cubicTo(25.871412f, 0.0f, 33.333332f, 7.4619207f, 33.333332f, 16.666666f);
        instancePath.cubicTo(33.333332f, 25.871412f, 25.871412f, 33.333332f, 16.666666f, 33.333332f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(17.333323f, 15.333354f);
        instancePath2.lineTo(20.0f, 10.0f);
        instancePath2.lineTo(22.5f, 10.0f);
        instancePath2.lineTo(19.833323f, 15.333354f);
        instancePath2.lineTo(22.5f, 15.333354f);
        instancePath2.lineTo(22.5f, 17.333353f);
        instancePath2.lineTo(17.666708f, 17.333353f);
        instancePath2.lineTo(17.666708f, 19.166666f);
        instancePath2.lineTo(22.5f, 19.166666f);
        instancePath2.lineTo(22.5f, 21.166666f);
        instancePath2.lineTo(17.666708f, 21.166666f);
        instancePath2.lineTo(17.666708f, 24.166666f);
        instancePath2.lineTo(15.666707f, 24.166666f);
        instancePath2.lineTo(15.666707f, 21.166666f);
        instancePath2.lineTo(10.833333f, 21.166666f);
        instancePath2.lineTo(10.833333f, 19.166666f);
        instancePath2.lineTo(15.666707f, 19.166666f);
        instancePath2.lineTo(15.666707f, 17.333353f);
        instancePath2.lineTo(10.833333f, 17.333353f);
        instancePath2.lineTo(10.833333f, 15.333354f);
        instancePath2.lineTo(13.5000105f, 15.333354f);
        instancePath2.lineTo(10.833333f, 10.0f);
        instancePath2.lineTo(13.333333f, 10.0f);
        instancePath2.lineTo(16.00001f, 15.333354f);
        instancePath2.lineTo(17.333323f, 15.333354f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(0.0f, 0.0f);
        instancePath3.lineTo(40.0f, 0.0f);
        instancePath3.lineTo(40.0f, 40.0f);
        instancePath3.lineTo(0.0f, 40.0f);
        instancePath3.lineTo(0.0f, 0.0f);
        instancePath3.close();
        canvas.saveLayerAlpha(null, 0, 31);
        canvas.drawPath(instancePath3, l95.c.instancePaint(instancePaint6, looper));
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
