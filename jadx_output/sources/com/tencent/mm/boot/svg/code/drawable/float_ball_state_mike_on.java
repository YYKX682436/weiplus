package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class float_ball_state_mike_on extends l95.c {
    private final int width = 60;
    private final int height = 60;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 60;
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
                instancePaint3.setColor(-16268960);
                canvas.save();
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 5.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(13.541667f, 20.833334f);
                instancePath.lineTo(13.541667f, 25.0f);
                instancePath.cubicTo(13.541667f, 31.328262f, 18.671738f, 36.458332f, 25.0f, 36.458332f);
                instancePath.cubicTo(31.328262f, 36.458332f, 36.458332f, 31.328262f, 36.458332f, 25.0f);
                instancePath.lineTo(36.458332f, 20.833334f);
                instancePath.lineTo(39.583332f, 20.833334f);
                instancePath.lineTo(39.583332f, 25.0f);
                instancePath.cubicTo(39.583332f, 32.52634f, 33.881866f, 38.721027f, 26.562386f, 39.50062f);
                instancePath.lineTo(26.5625f, 45.833332f);
                instancePath.lineTo(23.4375f, 45.833332f);
                instancePath.lineTo(23.436659f, 39.50052f);
                instancePath.cubicTo(16.117636f, 38.72049f, 10.416667f, 32.526012f, 10.416667f, 25.0f);
                instancePath.lineTo(10.416667f, 20.833334f);
                instancePath.lineTo(13.541667f, 20.833334f);
                instancePath.close();
                instancePath.moveTo(25.0f, 4.1666665f);
                instancePath.cubicTo(29.602373f, 4.1666665f, 33.333332f, 7.897627f, 33.333332f, 12.5f);
                instancePath.lineTo(33.333332f, 12.5f);
                instancePath.lineTo(33.333332f, 25.0f);
                instancePath.cubicTo(33.333332f, 29.602373f, 29.602373f, 33.333332f, 25.0f, 33.333332f);
                instancePath.cubicTo(20.397627f, 33.333332f, 16.666666f, 29.602373f, 16.666666f, 25.0f);
                instancePath.lineTo(16.666666f, 25.0f);
                instancePath.lineTo(16.666666f, 12.5f);
                instancePath.cubicTo(16.666666f, 7.897627f, 20.397627f, 4.1666665f, 25.0f, 4.1666665f);
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
