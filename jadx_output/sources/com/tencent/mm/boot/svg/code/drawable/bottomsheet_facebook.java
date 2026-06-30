package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class bottomsheet_facebook extends l95.c {
    private final int width = 144;
    private final int height = 144;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 144;
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
        instancePaint3.setColor(-9276814);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(15.052474f, 8.0f);
        instancePath.cubicTo(11.166417f, 8.0f, 8.0f, 11.165231f, 8.0f, 15.049831f);
        instancePath.lineTo(8.0f, 128.9022f);
        instancePath.cubicTo(8.0f, 132.78682f, 11.166417f, 135.95204f, 15.052474f, 135.95204f);
        instancePath.lineTo(76.365814f, 135.95204f);
        instancePath.lineTo(76.365814f, 86.41139f);
        instancePath.lineTo(59.670166f, 86.41139f);
        instancePath.lineTo(59.670166f, 67.084305f);
        instancePath.lineTo(76.365814f, 67.084305f);
        instancePath.lineTo(76.365814f, 52.840763f);
        instancePath.cubicTo(76.365814f, 36.295242f, 86.488754f, 27.32709f, 101.21739f, 27.32709f);
        instancePath.cubicTo(108.26987f, 27.32709f, 114.362816f, 27.854628f, 116.13793f, 28.094418f);
        instancePath.lineTo(116.13793f, 45.35931f);
        instancePath.lineTo(105.91904f, 45.35931f);
        instancePath.cubicTo(97.90704f, 45.35931f, 96.32384f, 49.147995f, 96.32384f, 54.759087f);
        instancePath.lineTo(96.32384f, 67.084305f);
        instancePath.lineTo(115.46627f, 67.084305f);
        instancePath.lineTo(112.97151f, 86.41139f);
        instancePath.lineTo(96.32384f, 86.41139f);
        instancePath.lineTo(96.32384f, 136.0f);
        instancePath.lineTo(128.94753f, 136.0f);
        instancePath.cubicTo(132.83359f, 136.0f, 136.0f, 132.83476f, 136.0f, 128.95016f);
        instancePath.lineTo(136.0f, 15.049831f);
        instancePath.cubicTo(136.0f, 11.117272f, 132.88156f, 8.0f, 128.94753f, 8.0f);
        instancePath.lineTo(15.052474f, 8.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
