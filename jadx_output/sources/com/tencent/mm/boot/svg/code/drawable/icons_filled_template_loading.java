package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_template_loading extends l95.c {
    private final int width = 48;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 48;
        }
        if (i17 != 2) {
            return 0;
        }
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
        instancePaint3.setColor(-855638017);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 12.0f);
        instancePath.cubicTo(0.0f, 5.3725824f, 5.3725824f, 0.0f, 12.0f, 0.0f);
        instancePath.lineTo(36.0f, 0.0f);
        instancePath.cubicTo(42.62742f, 0.0f, 48.0f, 5.3725824f, 48.0f, 12.0f);
        instancePath.lineTo(48.0f, 36.0f);
        instancePath.cubicTo(48.0f, 42.62742f, 42.62742f, 48.0f, 36.0f, 48.0f);
        instancePath.lineTo(12.0f, 48.0f);
        instancePath.cubicTo(5.3725824f, 48.0f, 0.0f, 42.62742f, 0.0f, 36.0f);
        instancePath.lineTo(0.0f, 12.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(419430400);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(31.029f, 27.9995f);
        instancePath2.lineTo(31.7862f, 30.2133f);
        instancePath2.lineTo(34.0f, 30.9705f);
        instancePath2.lineTo(31.7862f, 31.7278f);
        instancePath2.lineTo(31.029f, 33.9995f);
        instancePath2.lineTo(30.2717f, 31.7278f);
        instancePath2.lineTo(28.0f, 30.9705f);
        instancePath2.lineTo(30.2717f, 30.2133f);
        instancePath2.lineTo(31.029f, 27.9995f);
        instancePath2.close();
        instancePath2.moveTo(21.8928f, 24.6925f);
        instancePath2.lineTo(23.3072f, 26.1066f);
        instancePath2.lineTo(15.7085f, 33.7066f);
        instancePath2.lineTo(14.2942f, 32.2925f);
        instancePath2.lineTo(21.8928f, 24.6925f);
        instancePath2.close();
        instancePath2.moveTo(24.1436f, 12.9957f);
        instancePath2.lineTo(24.2258f, 13.048f);
        instancePath2.lineTo(28.1624f, 16.001f);
        instancePath2.lineTo(32.7618f, 14.4803f);
        instancePath2.cubicTo(33.23f, 14.3255f, 33.6747f, 14.7702f, 33.5199f, 15.2384f);
        instancePath2.lineTo(31.9984f, 19.8371f);
        instancePath2.lineTo(34.9522f, 23.7744f);
        instancePath2.cubicTo(35.2326f, 24.1482f, 34.9959f, 24.6702f, 34.5562f, 24.7291f);
        instancePath2.lineTo(34.4589f, 24.7344f);
        instancePath2.lineTo(29.5915f, 24.6256f);
        instancePath2.lineTo(26.8193f, 28.572f);
        instancePath2.cubicTo(26.552f, 28.9525f, 25.9846f, 28.8921f, 25.7904f, 28.4937f);
        instancePath2.lineTo(25.7568f, 28.4096f);
        instancePath2.lineTo(24.2641f, 23.7346f);
        instancePath2.lineTo(19.5906f, 22.2434f);
        instancePath2.cubicTo(19.1476f, 22.1019f, 19.0357f, 21.5425f, 19.358f, 21.2381f);
        instancePath2.lineTo(19.4282f, 21.1809f);
        instancePath2.lineTo(23.3739f, 18.408f);
        instancePath2.lineTo(23.2658f, 13.5412f);
        instancePath2.cubicTo(23.2554f, 13.0741f, 23.7518f, 12.7875f, 24.1436f, 12.9957f);
        instancePath2.close();
        instancePath2.moveTo(16.0391f, 13.9995f);
        instancePath2.lineTo(16.5086f, 15.4909f);
        instancePath2.lineTo(18.0f, 16.0386f);
        instancePath2.lineTo(16.5086f, 16.5081f);
        instancePath2.lineTo(16.0391f, 17.9995f);
        instancePath2.lineTo(15.4914f, 16.5081f);
        instancePath2.lineTo(14.0f, 16.0386f);
        instancePath2.lineTo(15.4914f, 15.4909f);
        instancePath2.lineTo(16.0391f, 13.9995f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
