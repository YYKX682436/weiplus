package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_imac extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(66.0f, 54.0f);
            instancePath.cubicTo(66.0f, 55.65625f, 64.65625f, 57.0f, 63.0f, 57.0f);
            instancePath.lineTo(45.464844f, 57.0f);
            instancePath.lineTo(47.33203f, 62.51953f);
            instancePath.cubicTo(47.382812f, 62.67578f, 47.410156f, 62.835938f, 47.410156f, 63.0f);
            instancePath.cubicTo(47.410156f, 63.828125f, 46.73828f, 64.5f, 45.910156f, 64.5f);
            instancePath.lineTo(26.089844f, 64.5f);
            instancePath.cubicTo(25.925781f, 64.5f, 25.765625f, 64.47266f, 25.609375f, 64.421875f);
            instancePath.cubicTo(24.824219f, 64.15625f, 24.402344f, 63.304688f, 24.667969f, 62.51953f);
            instancePath.lineTo(26.527344f, 57.0f);
            instancePath.lineTo(9.0f, 57.0f);
            instancePath.cubicTo(7.34375f, 57.0f, 6.0f, 55.65625f, 6.0f, 54.0f);
            instancePath.lineTo(6.0f, 15.0f);
            instancePath.cubicTo(6.0f, 13.34375f, 7.34375f, 12.0f, 9.0f, 12.0f);
            instancePath.lineTo(63.0f, 12.0f);
            instancePath.cubicTo(64.65625f, 12.0f, 66.0f, 13.34375f, 66.0f, 15.0f);
            instancePath.close();
            instancePath.moveTo(41.66797f, 57.0f);
            instancePath.lineTo(30.332031f, 57.0f);
            instancePath.lineTo(29.015625f, 60.898438f);
            instancePath.lineTo(42.984375f, 60.898438f);
            instancePath.close();
            instancePath.moveTo(62.398438f, 48.601562f);
            instancePath.lineTo(9.597656f, 48.601562f);
            instancePath.lineTo(9.601562f, 53.398438f);
            instancePath.lineTo(62.398438f, 53.398438f);
            instancePath.close();
            instancePath.moveTo(62.398438f, 15.601562f);
            instancePath.lineTo(9.601562f, 15.601562f);
            instancePath.lineTo(9.597656f, 45.0f);
            instancePath.lineTo(62.398438f, 45.0f);
            instancePath.close();
            instancePath.moveTo(62.398438f, 15.601562f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
