package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class file_float_ball_icon_ppt extends l95.c {
    private final int width = 48;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 48;
        }
        if (i17 == 2) {
            android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
            android.os.Looper looper = (android.os.Looper) objArr[1];
            l95.c.instanceMatrix(looper);
            l95.c.instanceMatrixArray(looper);
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
            instancePaint3.setColor(-892609);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(48.0f, 0.0f);
            instancePath.lineTo(48.0f, 48.0f);
            instancePath.lineTo(0.0f, 48.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(19.751953f, 16.089844f);
            instancePath2.lineTo(26.326172f, 16.089844f);
            instancePath2.cubicTo(29.689453f, 16.089844f, 32.021484f, 18.375f, 32.021484f, 21.75f);
            instancePath2.cubicTo(32.021484f, 25.125f, 29.61914f, 27.410156f, 26.197266f, 27.410156f);
            instancePath2.lineTo(22.77539f, 27.410156f);
            instancePath2.lineTo(22.77539f, 33.0f);
            instancePath2.lineTo(19.751953f, 33.0f);
            instancePath2.lineTo(19.751953f, 16.089844f);
            instancePath2.close();
            instancePath2.moveTo(22.77539f, 18.5625f);
            instancePath2.lineTo(22.77539f, 24.972656f);
            instancePath2.lineTo(25.517578f, 24.972656f);
            instancePath2.cubicTo(27.685547f, 24.972656f, 28.951172f, 23.800781f, 28.951172f, 21.75f);
            instancePath2.cubicTo(28.951172f, 19.722656f, 27.697266f, 18.5625f, 25.529297f, 18.5625f);
            instancePath2.lineTo(22.77539f, 18.5625f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
