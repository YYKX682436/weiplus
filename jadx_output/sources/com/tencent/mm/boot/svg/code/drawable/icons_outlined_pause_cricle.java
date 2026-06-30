package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_pause_cricle extends l95.c {
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(36.0f, 66.0f);
        instancePath.cubicTo(52.5685f, 66.0f, 66.0f, 52.5685f, 66.0f, 36.0f);
        instancePath.cubicTo(66.0f, 19.4315f, 52.5685f, 6.0f, 36.0f, 6.0f);
        instancePath.cubicTo(19.4315f, 6.0f, 6.0f, 19.4315f, 6.0f, 36.0f);
        instancePath.cubicTo(6.0f, 52.5685f, 19.4315f, 66.0f, 36.0f, 66.0f);
        instancePath.close();
        instancePath.moveTo(36.0f, 62.4f);
        instancePath.cubicTo(50.5803f, 62.4f, 62.4f, 50.5803f, 62.4f, 36.0f);
        instancePath.cubicTo(62.4f, 21.4197f, 50.5803f, 9.6f, 36.0f, 9.6f);
        instancePath.cubicTo(21.4197f, 9.6f, 9.6f, 21.4197f, 9.6f, 36.0f);
        instancePath.cubicTo(9.6f, 50.5803f, 21.4197f, 62.4f, 36.0f, 62.4f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(29.7002f, 23.4004f);
        instancePath2.lineTo(27.3002f, 23.4004f);
        instancePath2.cubicTo(26.1404f, 23.4004f, 25.2002f, 24.3406f, 25.2002f, 25.5004f);
        instancePath2.lineTo(25.2002f, 46.5004f);
        instancePath2.cubicTo(25.2002f, 47.6602f, 26.1404f, 48.6004f, 27.3002f, 48.6004f);
        instancePath2.lineTo(29.7002f, 48.6004f);
        instancePath2.cubicTo(30.86f, 48.6004f, 31.8002f, 47.6602f, 31.8002f, 46.5004f);
        instancePath2.lineTo(31.8002f, 25.5004f);
        instancePath2.cubicTo(31.8002f, 24.3406f, 30.86f, 23.4004f, 29.7002f, 23.4004f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(42.3002f, 23.4004f);
        instancePath3.lineTo(44.7002f, 23.4004f);
        instancePath3.cubicTo(45.86f, 23.4004f, 46.8002f, 24.3406f, 46.8002f, 25.5004f);
        instancePath3.lineTo(46.8002f, 46.5004f);
        instancePath3.cubicTo(46.8002f, 47.6602f, 45.86f, 48.6004f, 44.7002f, 48.6004f);
        instancePath3.lineTo(42.3002f, 48.6004f);
        instancePath3.cubicTo(41.1404f, 48.6004f, 40.2002f, 47.6602f, 40.2002f, 46.5004f);
        instancePath3.lineTo(40.2002f, 25.5004f);
        instancePath3.cubicTo(40.2002f, 24.3406f, 41.1404f, 23.4004f, 42.3002f, 23.4004f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
