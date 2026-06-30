package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class scan_custom_tips_image_bg extends l95.c {
    private final int width = 264;
    private final int height = 279;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 264;
        }
        if (i17 == 1) {
            return 279;
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
            instancePaint3.setColor(-421667363);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(24.0f, 264.0f);
            instancePath.cubicTo(10.745166f, 264.0f, 0.0f, 253.25484f, 0.0f, 240.0f);
            instancePath.lineTo(0.0f, 24.0f);
            instancePath.cubicTo(0.0f, 10.745166f, 10.745166f, -2.1316282E-13f, 24.0f, -2.1316282E-13f);
            instancePath.lineTo(240.0f, -2.1316282E-13f);
            instancePath.cubicTo(253.25484f, -2.1316282E-13f, 264.0f, 10.745166f, 264.0f, 24.0f);
            instancePath.lineTo(264.0f, 240.0f);
            instancePath.cubicTo(264.0f, 253.25484f, 253.25484f, 264.0f, 240.0f, 264.0f);
            instancePath.lineTo(148.97057f, 264.0f);
            instancePath.lineTo(136.24265f, 276.72794f);
            instancePath.cubicTo(133.89949f, 279.07108f, 130.10051f, 279.07108f, 127.75736f, 276.72794f);
            instancePath.lineTo(115.029434f, 264.0f);
            instancePath.lineTo(24.0f, 264.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
