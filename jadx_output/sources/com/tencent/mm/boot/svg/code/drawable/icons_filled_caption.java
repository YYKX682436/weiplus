package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_caption extends l95.c {
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 72.17484f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(62.768333f, 12.588635f);
                instancePath.cubicTo(64.15884f, 12.588635f, 65.286064f, 13.71586f, 65.286064f, 15.106362f);
                instancePath.lineTo(65.286064f, 57.06848f);
                instancePath.cubicTo(65.286064f, 58.45898f, 64.15884f, 59.58621f, 62.768333f, 59.58621f);
                instancePath.lineTo(9.056824f, 59.58621f);
                instancePath.cubicTo(7.6663213f, 59.58621f, 6.539097f, 58.45898f, 6.539097f, 57.06848f);
                instancePath.lineTo(6.539097f, 15.106362f);
                instancePath.cubicTo(6.539097f, 13.71586f, 7.6663213f, 12.588635f, 9.056824f, 12.588635f);
                instancePath.lineTo(62.768333f, 12.588635f);
                instancePath.close();
                instancePath.moveTo(43.990288f, 26.908209f);
                instancePath.lineTo(21.960175f, 26.908209f);
                instancePath.lineTo(21.960175f, 32.782906f);
                instancePath.lineTo(43.990288f, 32.782906f);
                instancePath.lineTo(43.990288f, 26.908209f);
                instancePath.close();
                instancePath.moveTo(16.827158f, 26.908209f);
                instancePath.lineTo(10.945119f, 26.908209f);
                instancePath.lineTo(10.945119f, 32.782906f);
                instancePath.lineTo(16.827158f, 32.782906f);
                instancePath.lineTo(16.827158f, 26.908209f);
                instancePath.close();
                instancePath.moveTo(61.614376f, 16.994658f);
                instancePath.lineTo(10.945119f, 16.994658f);
                instancePath.lineTo(10.945119f, 22.869354f);
                instancePath.lineTo(61.614376f, 22.869354f);
                instancePath.lineTo(61.614376f, 16.994658f);
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
