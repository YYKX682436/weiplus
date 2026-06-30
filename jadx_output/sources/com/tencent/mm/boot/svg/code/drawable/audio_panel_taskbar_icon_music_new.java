package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class audio_panel_taskbar_icon_music_new extends l95.c {
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-43177);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(49.2112f, 26.0954f);
            instancePath.cubicTo(49.2112f, 26.089f, 49.2084f, 26.0829f, 49.2035f, 26.0788f);
            instancePath.cubicTo(45.4936f, 22.9739f, 39.1763f, 23.0116f, 38.5792f, 17.9873f);
            instancePath.lineTo(38.5792f, 17.9048f);
            instancePath.cubicTo(38.5792f, 17.1218f, 38.0228f, 16.4212f, 37.2398f, 16.3182f);
            instancePath.cubicTo(36.292f, 16.1946f, 35.4884f, 16.9364f, 35.4884f, 17.843f);
            instancePath.lineTo(35.4884f, 35.7288f);
            instancePath.cubicTo(35.4884f, 42.9201f, 34.0667f, 41.3953f, 29.5337f, 42.5286f);
            instancePath.cubicTo(26.1957f, 43.3735f, 23.4141f, 45.6195f, 23.4141f, 49.0812f);
            instancePath.cubicTo(23.4141f, 52.543f, 26.4224f, 55.3248f, 29.9046f, 55.2629f);
            instancePath.cubicTo(38.3525f, 55.0775f, 38.5792f, 46.6498f, 38.5792f, 42.6729f);
            instancePath.lineTo(38.5792f, 27.4247f);
            instancePath.cubicTo(38.6822f, 25.2817f, 39.733f, 25.055f, 41.9583f, 25.735f);
            instancePath.cubicTo(44.9048f, 26.9095f, 48.3252f, 27.3835f, 49.5615f, 30.4949f);
            instancePath.cubicTo(50.3857f, 33.3591f, 48.4488f, 35.976f, 45.7702f, 37.1299f);
            instancePath.cubicTo(45.4405f, 37.2742f, 45.5848f, 37.7481f, 45.9351f, 37.7069f);
            instancePath.cubicTo(51.1451f, 36.842f, 54.2147f, 30.0492f, 49.2197f, 26.1125f);
            instancePath.cubicTo(49.2144f, 26.1084f, 49.2112f, 26.102f, 49.2112f, 26.0954f);
            instancePath.lineTo(49.2112f, 26.0954f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
