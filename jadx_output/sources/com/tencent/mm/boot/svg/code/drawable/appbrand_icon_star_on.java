package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class appbrand_icon_star_on extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 32;
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
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.733333f, 0.0f, 1.0f, 3.733333f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(5.6f, 13.6f);
                instancePath.cubicTo(8.545519f, 13.6f, 10.933333f, 15.987815f, 10.933333f, 18.933332f);
                instancePath.cubicTo(10.933333f, 21.878853f, 8.545519f, 24.266666f, 5.6f, 24.266666f);
                instancePath.cubicTo(2.6544814f, 24.266666f, 0.26666668f, 21.878853f, 0.26666668f, 18.933332f);
                instancePath.cubicTo(0.26666668f, 15.987815f, 2.6544814f, 13.6f, 5.6f, 13.6f);
                instancePath.close();
                instancePath.moveTo(18.933332f, 13.6f);
                instancePath.cubicTo(21.878853f, 13.6f, 24.266666f, 15.987815f, 24.266666f, 18.933332f);
                instancePath.cubicTo(24.266666f, 21.878853f, 21.878853f, 24.266666f, 18.933332f, 24.266666f);
                instancePath.cubicTo(15.987815f, 24.266666f, 13.6f, 21.878853f, 13.6f, 18.933332f);
                instancePath.cubicTo(13.6f, 15.987815f, 15.987815f, 13.6f, 18.933332f, 13.6f);
                instancePath.close();
                instancePath.moveTo(5.6f, 0.26666668f);
                instancePath.cubicTo(8.545519f, 0.26666668f, 10.933333f, 2.6544814f, 10.933333f, 5.6f);
                instancePath.cubicTo(10.933333f, 8.545519f, 8.545519f, 10.933333f, 5.6f, 10.933333f);
                instancePath.cubicTo(2.6544814f, 10.933333f, 0.26666668f, 8.545519f, 0.26666668f, 5.6f);
                instancePath.cubicTo(0.26666668f, 2.6544814f, 2.6544814f, 0.26666668f, 5.6f, 0.26666668f);
                instancePath.close();
                instancePath.moveTo(18.933332f, 0.26666668f);
                instancePath.cubicTo(21.878853f, 0.26666668f, 24.266666f, 2.6544814f, 24.266666f, 5.6f);
                instancePath.cubicTo(24.266666f, 8.545519f, 21.878853f, 10.933333f, 18.933332f, 10.933333f);
                instancePath.cubicTo(15.987815f, 10.933333f, 13.6f, 8.545519f, 13.6f, 5.6f);
                instancePath.cubicTo(13.6f, 2.6544814f, 15.987815f, 0.26666668f, 18.933332f, 0.26666668f);
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
