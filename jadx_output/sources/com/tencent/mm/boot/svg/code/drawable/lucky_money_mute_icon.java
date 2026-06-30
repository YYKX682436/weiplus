package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class lucky_money_mute_icon extends l95.c {
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
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(15.364f, 9.0f);
                instancePath.lineTo(12.182f, 12.182f);
                instancePath.lineTo(24.0f, 24.0f);
                instancePath.lineTo(39.0f, 39.0f);
                instancePath.lineTo(63.0937f, 63.0937f);
                instancePath.lineTo(66.2756f, 59.9117f);
                instancePath.lineTo(57.1724f, 50.8085f);
                instancePath.cubicTo(60.4575f, 46.5094f, 62.1f, 41.46f, 62.1f, 36.0f);
                instancePath.cubicTo(62.1f, 29.4f, 59.4f, 23.1f, 54.9f, 18.6f);
                instancePath.lineTo(54.6f, 18.3f);
                instancePath.lineTo(51.3f, 21.6f);
                instancePath.lineTo(51.6f, 21.9f);
                instancePath.cubicTo(55.2f, 25.8f, 57.3f, 30.6f, 57.3f, 36.0f);
                instancePath.cubicTo(57.3f, 40.2392f, 56.1907f, 44.1085f, 53.827f, 47.463f);
                instancePath.lineTo(51.0712f, 44.7073f);
                instancePath.cubicTo(52.7467f, 42.1132f, 53.7f, 39.0566f, 53.7f, 36.0f);
                instancePath.cubicTo(53.7f, 31.8f, 51.9f, 27.6f, 48.9f, 24.6f);
                instancePath.lineTo(48.6f, 24.3f);
                instancePath.lineTo(45.3f, 27.6f);
                instancePath.lineTo(45.6f, 27.9f);
                instancePath.cubicTo(47.7f, 30.0f, 48.9f, 33.0f, 48.9f, 36.0f);
                instancePath.cubicTo(48.9f, 37.8247f, 48.456f, 39.6495f, 47.6356f, 41.2717f);
                instancePath.lineTo(39.0f, 32.636f);
                instancePath.lineTo(39.0f, 16.2f);
                instancePath.cubicTo(39.0f, 15.3f, 38.7f, 14.7f, 38.1f, 14.1f);
                instancePath.cubicTo(36.9f, 12.9f, 35.1f, 12.9f, 33.9f, 14.1f);
                instancePath.lineTo(27.182f, 20.818f);
                instancePath.lineTo(15.364f, 9.0f);
                instancePath.close();
                instancePath.moveTo(9.0f, 25.5f);
                instancePath.lineTo(19.136f, 25.5f);
                instancePath.lineTo(39.0f, 45.364f);
                instancePath.lineTo(39.0f, 55.8f);
                instancePath.cubicTo(39.0f, 57.6f, 37.8f, 58.8f, 36.0f, 58.8f);
                instancePath.cubicTo(35.1f, 58.8f, 34.5f, 58.5f, 33.9f, 57.9f);
                instancePath.lineTo(22.5f, 46.5f);
                instancePath.lineTo(9.0f, 46.5f);
                instancePath.cubicTo(7.2f, 46.5f, 6.0f, 45.3f, 6.0f, 43.5f);
                instancePath.lineTo(6.0f, 28.5f);
                instancePath.cubicTo(6.0f, 26.7f, 7.2f, 25.5f, 9.0f, 25.5f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
