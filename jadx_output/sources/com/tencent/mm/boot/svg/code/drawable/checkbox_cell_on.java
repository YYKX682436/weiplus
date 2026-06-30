package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class checkbox_cell_on extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
        }
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
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16268960);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(22.0f, 11.135802f);
            instancePath.cubicTo(22.0f, 4.924741f, 17.07526f, 0.0f, 10.864198f, 0.0f);
            instancePath.cubicTo(4.924741f, 0.0f, 0.0f, 4.924741f, 0.0f, 11.135802f);
            instancePath.cubicTo(0.0f, 17.07526f, 4.924741f, 22.0f, 10.864198f, 22.0f);
            instancePath.cubicTo(17.07526f, 22.0f, 22.0f, 17.07526f, 22.0f, 11.135802f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(9.363961f, 14.313708f);
            instancePath2.lineTo(6.0606604f, 11.010407f);
            instancePath2.lineTo(5.0f, 12.071068f);
            instancePath2.lineTo(8.656855f, 15.727922f);
            instancePath2.cubicTo(9.047379f, 16.118446f, 9.680544f, 16.118446f, 10.071068f, 15.727922f);
            instancePath2.lineTo(17.738329f, 8.06066f);
            instancePath2.lineTo(17.738329f, 8.06066f);
            instancePath2.lineTo(16.67767f, 7.0f);
            instancePath2.lineTo(9.363961f, 14.313708f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
