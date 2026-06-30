package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_request_song_delete_regular extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(6.77355f, 6.4f);
        instancePath.lineTo(7.58591f, 20.0475f);
        instancePath.cubicTo(7.61106f, 20.4702f, 7.96113f, 20.8f, 8.38449f, 20.8f);
        instancePath.lineTo(15.6155f, 20.8f);
        instancePath.cubicTo(16.0389f, 20.8f, 16.3889f, 20.4702f, 16.4141f, 20.0475f);
        instancePath.lineTo(17.2264f, 6.4f);
        instancePath.lineTo(6.77355f, 6.4f);
        instancePath.close();
        instancePath.moveTo(18.4286f, 6.4f);
        instancePath.lineTo(17.612f, 20.1188f);
        instancePath.cubicTo(17.5491f, 21.1754f, 16.6739f, 22.0f, 15.6155f, 22.0f);
        instancePath.lineTo(8.38449f, 22.0f);
        instancePath.cubicTo(7.32608f, 22.0f, 6.45092f, 21.1754f, 6.38803f, 20.1188f);
        instancePath.lineTo(5.57143f, 6.4f);
        instancePath.lineTo(3.5f, 6.4f);
        instancePath.lineTo(3.5f, 5.7f);
        instancePath.cubicTo(3.5f, 5.42386f, 3.72386f, 5.2f, 4.0f, 5.2f);
        instancePath.lineTo(20.0f, 5.2f);
        instancePath.cubicTo(20.2761f, 5.2f, 20.5f, 5.42386f, 20.5f, 5.7f);
        instancePath.lineTo(20.5f, 6.4f);
        instancePath.lineTo(18.4286f, 6.4f);
        instancePath.close();
        instancePath.moveTo(14.0f, 3.00003f);
        instancePath.cubicTo(14.2761f, 3.00003f, 14.5f, 3.22389f, 14.5f, 3.50003f);
        instancePath.lineTo(14.5f, 4.20003f);
        instancePath.lineTo(9.5f, 4.20003f);
        instancePath.lineTo(9.5f, 3.50003f);
        instancePath.cubicTo(9.5f, 3.22389f, 9.72386f, 3.00003f, 10.0f, 3.00003f);
        instancePath.lineTo(14.0f, 3.00003f);
        instancePath.close();
        instancePath.moveTo(9.5f, 9.0f);
        instancePath.lineTo(10.7f, 9.0f);
        instancePath.lineTo(11.2f, 18.0f);
        instancePath.lineTo(10.0f, 18.0f);
        instancePath.lineTo(9.5f, 9.0f);
        instancePath.close();
        instancePath.moveTo(13.3f, 9.0f);
        instancePath.lineTo(14.5f, 9.0f);
        instancePath.lineTo(14.0f, 18.0f);
        instancePath.lineTo(12.8f, 18.0f);
        instancePath.lineTo(13.3f, 9.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
