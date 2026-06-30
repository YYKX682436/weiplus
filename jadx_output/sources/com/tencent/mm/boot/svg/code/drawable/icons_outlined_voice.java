package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_voice extends l95.c {
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
            l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(36.0f, 66.0f);
            instancePath.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
            instancePath.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
            instancePath.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
            instancePath.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
            instancePath.close();
            instancePath.moveTo(36.0f, 62.4f);
            instancePath.cubicTo(50.58032f, 62.4f, 62.4f, 50.58032f, 62.4f, 36.0f);
            instancePath.cubicTo(62.4f, 21.419683f, 50.58032f, 9.6f, 36.0f, 9.6f);
            instancePath.cubicTo(21.419683f, 9.6f, 9.6f, 21.419683f, 9.6f, 36.0f);
            instancePath.cubicTo(9.6f, 50.58032f, 21.419683f, 62.4f, 36.0f, 62.4f);
            instancePath.close();
            instancePath.moveTo(36.92498f, 50.42498f);
            instancePath.cubicTo(40.728367f, 46.62159f, 42.9f, 41.48727f, 42.9f, 36.0f);
            instancePath.cubicTo(42.9f, 30.51273f, 40.728367f, 25.378408f, 36.92498f, 21.575022f);
            instancePath.lineTo(39.470562f, 19.029438f);
            instancePath.cubicTo(43.81371f, 23.372583f, 46.5f, 29.372583f, 46.5f, 36.0f);
            instancePath.cubicTo(46.5f, 42.62742f, 43.81371f, 48.62742f, 39.470562f, 52.970562f);
            instancePath.lineTo(36.92498f, 50.42498f);
            instancePath.close();
            instancePath.moveTo(30.985281f, 44.485283f);
            instancePath.cubicTo(33.22353f, 42.247032f, 34.5f, 39.22912f, 34.5f, 36.0f);
            instancePath.cubicTo(34.5f, 32.77088f, 33.22353f, 29.752968f, 30.985281f, 27.514719f);
            instancePath.lineTo(33.530865f, 24.969133f);
            instancePath.cubicTo(36.353912f, 27.79218f, 38.1f, 31.692179f, 38.1f, 36.0f);
            instancePath.cubicTo(38.1f, 40.30782f, 36.353912f, 44.20782f, 33.530865f, 47.030865f);
            instancePath.lineTo(30.985281f, 44.485283f);
            instancePath.close();
            instancePath.moveTo(27.59117f, 41.091167f);
            instancePath.lineTo(22.5f, 36.0f);
            instancePath.lineTo(27.59117f, 30.90883f);
            instancePath.cubicTo(28.894112f, 32.211777f, 29.7f, 34.011776f, 29.7f, 36.0f);
            instancePath.cubicTo(29.7f, 37.988224f, 28.894112f, 39.788223f, 27.59117f, 41.091167f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
