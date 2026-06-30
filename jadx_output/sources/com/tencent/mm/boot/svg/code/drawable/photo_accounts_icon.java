package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class photo_accounts_icon extends l95.c {
    private final int width = 192;
    private final int height = 192;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 192;
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
        instancePaint3.setColor(-15683841);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(192.0f, 0.0f);
        instancePath.lineTo(192.0f, 192.0f);
        instancePath.lineTo(0.0f, 192.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(117.048f, 55.6449f);
        instancePath2.cubicTo(119.223f, 51.8967f, 124.712f, 51.8958f, 126.886f, 55.6449f);
        instancePath2.lineTo(146.946f, 90.2316f);
        instancePath2.cubicTo(149.018f, 93.8057f, 149.018f, 98.1939f, 146.946f, 101.768f);
        instancePath2.lineTo(126.886f, 136.355f);
        instancePath2.cubicTo(124.712f, 140.104f, 119.223f, 140.104f, 117.048f, 136.355f);
        instancePath2.lineTo(95.9978f, 100.065f);
        instancePath2.lineTo(74.952f, 136.355f);
        instancePath2.cubicTo(72.777f, 140.104f, 67.2884f, 140.104f, 65.1137f, 136.355f);
        instancePath2.lineTo(45.0546f, 101.768f);
        instancePath2.cubicTo(42.9819f, 98.1938f, 42.9817f, 93.8058f, 45.0546f, 90.2316f);
        instancePath2.lineTo(65.1137f, 55.6449f);
        instancePath2.cubicTo(67.2884f, 51.8959f, 72.7769f, 51.8965f, 74.952f, 55.6449f);
        instancePath2.lineTo(95.9978f, 91.9303f);
        instancePath2.lineTo(117.048f, 55.6449f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
