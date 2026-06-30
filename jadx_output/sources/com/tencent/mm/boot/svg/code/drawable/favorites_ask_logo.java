package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class favorites_ask_logo extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(4.50012f, 7.48024f);
            instancePath.cubicTo(4.50012f, 4.19024f, 7.86012f, 1.51024f, 12.0001f, 1.51024f);
            instancePath.lineTo(12.0001f, 1.50024f);
            instancePath.cubicTo(16.1401f, 1.50024f, 19.5001f, 4.18024f, 19.5001f, 7.47024f);
            instancePath.cubicTo(19.5001f, 9.14024f, 18.6201f, 10.6902f, 16.9401f, 11.9602f);
            instancePath.cubicTo(16.9201f, 11.9602f, 15.8701f, 12.7702f, 15.1501f, 13.7702f);
            instancePath.cubicTo(14.7701f, 14.2902f, 14.5001f, 15.1802f, 14.3601f, 16.0102f);
            instancePath.cubicTo(14.2601f, 16.5902f, 13.7601f, 17.0002f, 13.1801f, 17.0002f);
            instancePath.lineTo(10.8601f, 17.0002f);
            instancePath.cubicTo(10.3901f, 17.0002f, 10.0001f, 16.6202f, 10.0001f, 16.1402f);
            instancePath.cubicTo(10.0001f, 15.6602f, 10.3801f, 15.2802f, 10.8601f, 15.2802f);
            instancePath.lineTo(11.6801f, 15.2802f);
            instancePath.cubicTo(12.1001f, 15.2802f, 12.9101f, 15.3502f, 12.9101f, 15.3502f);
            instancePath.cubicTo(13.0801f, 14.4602f, 13.3901f, 13.6102f, 13.9101f, 12.8902f);
            instancePath.cubicTo(14.7325f, 11.7523f, 15.8658f, 10.8704f, 16.0071f, 10.7604f);
            instancePath.cubicTo(16.0135f, 10.7554f, 16.0179f, 10.752f, 16.0201f, 10.7502f);
            instancePath.cubicTo(16.9101f, 10.0802f, 17.9801f, 8.96024f, 17.9801f, 7.47024f);
            instancePath.cubicTo(17.9801f, 5.33024f, 15.6901f, 3.02024f, 12.0001f, 3.02024f);
            instancePath.cubicTo(8.31012f, 3.02024f, 6.02012f, 5.33024f, 6.02012f, 7.47024f);
            instancePath.cubicTo(6.02012f, 8.99024f, 7.11012f, 10.4402f, 8.86012f, 11.2602f);
            instancePath.cubicTo(9.24012f, 11.4402f, 9.41012f, 11.8902f, 9.23012f, 12.2702f);
            instancePath.cubicTo(9.05012f, 12.6502f, 8.60012f, 12.8202f, 8.22012f, 12.6402f);
            instancePath.cubicTo(5.92012f, 11.5702f, 4.50012f, 9.59024f, 4.50012f, 7.48024f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-16777216);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(14.0001f, 21.0002f);
            instancePath2.cubicTo(14.0001f, 21.8287f, 13.1943f, 22.5002f, 12.2001f, 22.5002f);
            instancePath2.cubicTo(11.206f, 22.5002f, 10.4001f, 21.8287f, 10.4001f, 21.0002f);
            instancePath2.cubicTo(10.4001f, 20.1718f, 11.206f, 19.5002f, 12.2001f, 19.5002f);
            instancePath2.cubicTo(13.1943f, 19.5002f, 14.0001f, 20.1718f, 14.0001f, 21.0002f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
