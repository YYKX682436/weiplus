package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class lucky_money_business_arrow extends l95.c {
    private final int width = 49;
    private final int height = 49;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 49;
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
                instancePaint3.setColor(-7503);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -187.0f, 0.0f, 1.0f, -58.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 146.0f, 0.0f, 1.0f, 56.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, -1.0f, 0.0f, 90.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray3);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray4 = l95.c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 0.347368f, 0.0f, 1.0f, 0.347368f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray4);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(24.252632f, 4.042105f);
                instancePath.cubicTo(35.414597f, 4.042105f, 44.463158f, 13.090666f, 44.463158f, 24.252632f);
                instancePath.cubicTo(44.463158f, 35.414597f, 35.414597f, 44.463158f, 24.252632f, 44.463158f);
                instancePath.cubicTo(13.090666f, 44.463158f, 4.042105f, 35.414597f, 4.042105f, 24.252632f);
                instancePath.cubicTo(4.042105f, 13.090666f, 13.090666f, 4.042105f, 24.252632f, 4.042105f);
                instancePath.close();
                instancePath.moveTo(24.252632f, 6.4673686f);
                instancePath.cubicTo(14.430102f, 6.4673686f, 6.4673686f, 14.430102f, 6.4673686f, 24.252632f);
                instancePath.cubicTo(6.4673686f, 34.07516f, 14.430102f, 42.037895f, 24.252632f, 42.037895f);
                instancePath.cubicTo(34.07516f, 42.037895f, 42.037895f, 34.07516f, 42.037895f, 24.252632f);
                instancePath.cubicTo(42.037895f, 14.430102f, 34.07516f, 6.4673686f, 24.252632f, 6.4673686f);
                instancePath.close();
                instancePath.moveTo(26.17883f, 15.157895f);
                instancePath.lineTo(28.291775f, 17.305264f);
                instancePath.lineTo(21.585367f, 24.252632f);
                instancePath.lineTo(28.291775f, 31.2f);
                instancePath.lineTo(26.17883f, 33.34737f);
                instancePath.lineTo(19.028698f, 25.973974f);
                instancePath.cubicTo(18.106813f, 25.023302f, 18.11141f, 23.477219f, 19.028698f, 22.531288f);
                instancePath.lineTo(26.17883f, 15.157895f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
