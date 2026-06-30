package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_volume_off extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(26.545586f, 21.454414f);
        instancePath.lineTo(33.87868f, 14.121321f);
        instancePath.cubicTo(35.05025f, 12.949747f, 36.94975f, 12.949747f, 38.12132f, 14.121321f);
        instancePath.cubicTo(38.68393f, 14.683929f, 39.0f, 15.446991f, 39.0f, 16.242641f);
        instancePath.lineTo(39.0f, 33.90883f);
        instancePath.lineTo(47.590534f, 42.499363f);
        instancePath.cubicTo(48.822994f, 40.591305f, 49.5f, 38.35166f, 49.5f, 36.0f);
        instancePath.cubicTo(49.5f, 32.77088f, 48.22353f, 29.752968f, 45.985283f, 27.514719f);
        instancePath.lineTo(48.530865f, 24.969133f);
        instancePath.cubicTo(51.353912f, 27.79218f, 53.1f, 31.692179f, 53.1f, 36.0f);
        instancePath.cubicTo(53.1f, 39.39122f, 52.01791f, 42.5297f, 50.180176f, 45.08901f);
        instancePath.lineTo(53.609615f, 48.518444f);
        instancePath.cubicTo(56.362686f, 44.983818f, 57.9f, 40.616837f, 57.9f, 36.0f);
        instancePath.cubicTo(57.9f, 30.51273f, 55.728367f, 25.378408f, 51.92498f, 21.575022f);
        instancePath.lineTo(54.470562f, 19.029438f);
        instancePath.cubicTo(58.81371f, 23.372583f, 61.5f, 29.372583f, 61.5f, 36.0f);
        instancePath.cubicTo(61.5f, 41.712715f, 59.504047f, 46.959255f, 56.171463f, 51.080296f);
        instancePath.lineTo(64.27494f, 59.183765f);
        instancePath.lineTo(61.72935f, 61.72935f);
        instancePath.lineTo(11.545586f, 11.545585f);
        instancePath.lineTo(14.09117f, 9.0f);
        instancePath.lineTo(26.545586f, 21.454414f);
        instancePath.close();
        instancePath.moveTo(36.0f, 30.908829f);
        instancePath.lineTo(36.0f, 16.242641f);
        instancePath.lineTo(28.666906f, 23.575735f);
        instancePath.lineTo(36.0f, 30.908829f);
        instancePath.close();
        instancePath.moveTo(23.408829f, 28.5f);
        instancePath.lineTo(9.0f, 28.5f);
        instancePath.lineTo(9.0f, 43.5f);
        instancePath.lineTo(23.742641f, 43.5f);
        instancePath.lineTo(36.0f, 55.75736f);
        instancePath.lineTo(36.0f, 41.09117f);
        instancePath.lineTo(39.0f, 44.09117f);
        instancePath.lineTo(39.0f, 55.75736f);
        instancePath.cubicTo(39.0f, 57.414215f, 37.656853f, 58.75736f, 36.0f, 58.75736f);
        instancePath.cubicTo(35.20435f, 58.75736f, 34.441288f, 58.441288f, 33.87868f, 57.87868f);
        instancePath.lineTo(22.5f, 46.5f);
        instancePath.lineTo(9.0f, 46.5f);
        instancePath.cubicTo(7.343146f, 46.5f, 6.0f, 45.156853f, 6.0f, 43.5f);
        instancePath.lineTo(6.0f, 28.5f);
        instancePath.cubicTo(6.0f, 26.843145f, 7.343146f, 25.5f, 9.0f, 25.5f);
        instancePath.lineTo(20.408829f, 25.5f);
        instancePath.lineTo(23.408829f, 28.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
