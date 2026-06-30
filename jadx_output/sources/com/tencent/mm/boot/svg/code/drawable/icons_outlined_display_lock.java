package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_display_lock extends l95.c {
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
        instancePath.moveTo(9.0f, 12.0f);
        instancePath.cubicTo(7.34315f, 12.0f, 6.0f, 13.3431f, 6.0f, 15.0f);
        instancePath.lineTo(6.0f, 54.0f);
        instancePath.cubicTo(6.0f, 55.6569f, 7.34315f, 57.0f, 9.0f, 57.0f);
        instancePath.lineTo(42.0f, 57.0f);
        instancePath.lineTo(42.0f, 60.9001f);
        instancePath.lineTo(27.0f, 60.9001f);
        instancePath.cubicTo(25.3431f, 60.9001f, 24.0f, 62.2433f, 24.0f, 63.9001f);
        instancePath.lineTo(24.0f, 64.5001f);
        instancePath.lineTo(42.0f, 64.5001f);
        instancePath.cubicTo(42.0001f, 66.1569f, 43.3432f, 67.5f, 45.0f, 67.5f);
        instancePath.lineTo(69.0f, 67.5f);
        instancePath.cubicTo(70.6569f, 67.5f, 72.0f, 66.1569f, 72.0f, 64.5f);
        instancePath.lineTo(72.0f, 48.0f);
        instancePath.cubicTo(72.0f, 46.3431f, 70.6569f, 45.0f, 69.0f, 45.0f);
        instancePath.lineTo(66.0f, 45.0f);
        instancePath.lineTo(66.0f, 44.1f);
        instancePath.lineTo(66.0f, 15.0f);
        instancePath.cubicTo(66.0f, 13.3431f, 64.6569f, 12.0f, 63.0f, 12.0f);
        instancePath.lineTo(9.0f, 12.0f);
        instancePath.close();
        instancePath.moveTo(62.3999f, 45.0f);
        instancePath.lineTo(62.3999f, 44.0546f);
        instancePath.cubicTo(62.3774f, 40.5428f, 59.7551f, 38.1f, 57.0f, 38.1f);
        instancePath.cubicTo(54.233f, 38.1f, 51.6f, 40.5639f, 51.6f, 44.1f);
        instancePath.lineTo(51.6f, 45.0f);
        instancePath.lineTo(62.3999f, 45.0f);
        instancePath.close();
        instancePath.moveTo(48.0f, 45.0f);
        instancePath.lineTo(48.0f, 44.1f);
        instancePath.cubicTo(48.0f, 38.7981f, 52.0294f, 34.5f, 57.0f, 34.5f);
        instancePath.cubicTo(59.026f, 34.5f, 60.8957f, 35.2141f, 62.3999f, 36.4192f);
        instancePath.lineTo(62.3999f, 15.5999f);
        instancePath.lineTo(9.59985f, 15.5999f);
        instancePath.lineTo(9.59985f, 53.3999f);
        instancePath.lineTo(42.0f, 53.3999f);
        instancePath.lineTo(42.0f, 48.0f);
        instancePath.cubicTo(42.0f, 46.3431f, 43.3431f, 45.0f, 45.0f, 45.0f);
        instancePath.lineTo(48.0f, 45.0f);
        instancePath.close();
        instancePath.moveTo(45.6f, 63.9f);
        instancePath.lineTo(45.6f, 48.6f);
        instancePath.lineTo(68.4f, 48.6f);
        instancePath.lineTo(68.4f, 63.9f);
        instancePath.lineTo(45.6f, 63.9f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
