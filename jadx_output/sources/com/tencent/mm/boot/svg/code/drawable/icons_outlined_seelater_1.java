package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_seelater_1 extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(43.5f, 58.1722f);
        instancePath.cubicTo(41.1456f, 58.9684f, 38.6232f, 59.4f, 36.0f, 59.4f);
        instancePath.cubicTo(23.0765f, 59.4f, 12.6f, 48.9235f, 12.6f, 36.0f);
        instancePath.cubicTo(12.6f, 23.0765f, 23.0765f, 12.6f, 36.0f, 12.6f);
        instancePath.cubicTo(48.9235f, 12.6f, 59.4f, 23.0765f, 59.4f, 36.0f);
        instancePath.cubicTo(59.4f, 38.1798f, 59.1019f, 40.29f, 58.5443f, 42.2921f);
        instancePath.lineTo(61.716f, 44.2511f);
        instancePath.cubicTo(62.5498f, 41.6502f, 63.0f, 38.8777f, 63.0f, 36.0f);
        instancePath.cubicTo(63.0f, 21.0883f, 50.9117f, 9.0f, 36.0f, 9.0f);
        instancePath.cubicTo(21.0883f, 9.0f, 9.0f, 21.0883f, 9.0f, 36.0f);
        instancePath.cubicTo(9.0f, 50.9117f, 21.0883f, 63.0f, 36.0f, 63.0f);
        instancePath.cubicTo(38.6024f, 63.0f, 41.1188f, 62.6318f, 43.5f, 61.9447f);
        instancePath.lineTo(43.5f, 58.1722f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(37.7997f, 20.9997f);
        instancePath2.cubicTo(37.7997f, 20.0056f, 36.9938f, 19.1997f, 35.9997f, 19.1997f);
        instancePath2.cubicTo(35.0056f, 19.1997f, 34.1997f, 20.0056f, 34.1997f, 20.9997f);
        instancePath2.lineTo(34.1997f, 36.7453f);
        instancePath2.lineTo(40.7269f, 43.2725f);
        instancePath2.cubicTo(41.4299f, 43.9754f, 42.5696f, 43.9754f, 43.2725f, 43.2725f);
        instancePath2.cubicTo(43.9754f, 42.5696f, 43.9754f, 41.4299f, 43.2725f, 40.7269f);
        instancePath2.lineTo(37.7997f, 35.2541f);
        instancePath2.lineTo(37.7997f, 20.9997f);
        instancePath2.close();
        instancePath2.moveTo(51.0472f, 43.0117f);
        instancePath2.cubicTo(50.3821f, 42.5768f, 49.5f, 43.054f, 49.5f, 43.8486f);
        instancePath2.lineTo(49.5f, 65.6514f);
        instancePath2.cubicTo(49.5f, 66.446f, 50.3821f, 66.9232f, 51.0472f, 66.4883f);
        instancePath2.lineTo(67.7199f, 55.587f);
        instancePath2.cubicTo(68.3236f, 55.1923f, 68.3236f, 54.3077f, 67.7199f, 53.913f);
        instancePath2.lineTo(51.0472f, 43.0117f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
