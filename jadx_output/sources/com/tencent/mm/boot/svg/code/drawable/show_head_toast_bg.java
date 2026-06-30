package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class show_head_toast_bg extends l95.c {
    private final int width = nd1.d1.CTRL_INDEX;
    private final int height = nd1.d1.CTRL_INDEX;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = nd1.d1.CTRL_INDEX;
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
                instancePaint3.setColor(-3355444);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, 0.70710677f, -41.00714f, -0.70710677f, 0.70710677f, 99.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(168.0f, 99.0f);
                instancePath.lineTo(168.0f, 165.0f);
                instancePath.cubicTo(168.0f, 166.65686f, 166.65686f, 168.0f, 165.0f, 168.0f);
                instancePath.lineTo(99.0f, 168.0f);
                instancePath.cubicTo(60.892353f, 168.0f, 30.0f, 137.10765f, 30.0f, 99.0f);
                instancePath.cubicTo(30.0f, 60.892353f, 60.892353f, 30.0f, 99.0f, 30.0f);
                instancePath.cubicTo(137.10765f, 30.0f, 168.0f, 60.892353f, 168.0f, 99.0f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
