package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sns_icons_outlined_top_off extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(7.408529f, 9.105f);
        instancePath.lineTo(8.256529f, 9.953f);
        instancePath.lineTo(6.412f, 11.799f);
        instancePath.lineTo(9.2f, 11.8f);
        instancePath.lineTo(9.2f, 20.8f);
        instancePath.lineTo(14.8f, 20.8f);
        instancePath.lineTo(14.799529f, 16.496f);
        instancePath.lineTo(15.999529f, 17.696f);
        instancePath.lineTo(16.0f, 21.0f);
        instancePath.cubicTo(16.0f, 21.552284f, 15.552284f, 22.0f, 15.0f, 22.0f);
        instancePath.lineTo(9.0f, 22.0f);
        instancePath.cubicTo(8.447715f, 22.0f, 8.0f, 21.552284f, 8.0f, 21.0f);
        instancePath.lineTo(8.0f, 13.0f);
        instancePath.lineTo(5.928932f, 13.0f);
        instancePath.cubicTo(5.3766475f, 13.0f, 4.928932f, 12.552284f, 4.928932f, 12.0f);
        instancePath.cubicTo(4.928932f, 11.734783f, 5.034289f, 11.48043f, 5.2218256f, 11.292893f);
        instancePath.lineTo(7.408529f, 9.105f);
        instancePath.close();
        instancePath.moveTo(4.697057f, 3.0f);
        instancePath.lineTo(9.105529f, 7.408f);
        instancePath.lineTo(11.292893f, 5.2218256f);
        instancePath.cubicTo(11.683417f, 4.831301f, 12.316583f, 4.831301f, 12.707107f, 5.2218256f);
        instancePath.lineTo(18.778175f, 11.292893f);
        instancePath.cubicTo(19.1687f, 11.683417f, 19.1687f, 12.316583f, 18.778175f, 12.707107f);
        instancePath.cubicTo(18.59064f, 12.894643f, 18.336285f, 13.0f, 18.071068f, 13.0f);
        instancePath.lineTo(16.0f, 13.0f);
        instancePath.lineTo(15.999529f, 14.302f);
        instancePath.lineTo(21.424978f, 19.727922f);
        instancePath.lineTo(20.57645f, 20.57645f);
        instancePath.lineTo(3.8485286f, 3.8485281f);
        instancePath.lineTo(4.697057f, 3.0f);
        instancePath.close();
        instancePath.moveTo(12.0f, 6.212f);
        instancePath.lineTo(9.953528f, 8.257f);
        instancePath.lineTo(14.799529f, 13.102f);
        instancePath.lineTo(14.8f, 11.8f);
        instancePath.lineTo(17.588f, 11.8f);
        instancePath.lineTo(12.0f, 6.212f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
