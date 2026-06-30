package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_arrow_down_circle extends l95.c {
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
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(48.15f, 33.43f);
        instancePath.lineTo(45.29f, 30.6f);
        instancePath.lineTo(36.0f, 39.56f);
        instancePath.lineTo(26.71f, 30.600002f);
        instancePath.lineTo(23.849998f, 33.43f);
        instancePath.lineTo(34.11f, 43.39f);
        instancePath.cubicTo(35.16f, 44.39f, 36.84f, 44.39f, 37.89f, 43.39f);
        instancePath.lineTo(48.15f, 33.43f);
        instancePath.lineTo(48.16f, 33.43f);
        instancePath.lineTo(48.15f, 33.43f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(63.0f, 36.0f);
        instancePath2.cubicTo(63.0f, 50.9f, 50.9f, 63.0f, 36.0f, 63.0f);
        instancePath2.cubicTo(21.1f, 63.0f, 9.0f, 50.9f, 9.0f, 36.0f);
        instancePath2.cubicTo(9.0f, 21.1f, 21.1f, 9.0f, 36.0f, 9.0f);
        instancePath2.cubicTo(50.9f, 9.0f, 63.0f, 21.1f, 63.0f, 36.0f);
        instancePath2.close();
        instancePath2.moveTo(59.76f, 36.0f);
        instancePath2.cubicTo(59.76f, 22.880001f, 49.12f, 12.24f, 36.0f, 12.24f);
        instancePath2.cubicTo(22.880001f, 12.24f, 12.24f, 22.880001f, 12.24f, 36.0f);
        instancePath2.cubicTo(12.24f, 49.12f, 22.880001f, 59.760002f, 36.0f, 59.760002f);
        instancePath2.cubicTo(49.12f, 59.760002f, 59.760002f, 49.120003f, 59.760002f, 36.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
