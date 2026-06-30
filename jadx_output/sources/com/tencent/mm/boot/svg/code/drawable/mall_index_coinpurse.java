package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class mall_index_coinpurse extends l95.c {
    private final int width = 90;
    private final int height = 70;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 90;
        }
        if (i17 == 1) {
            return 70;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(69.0f, 50.0f);
        instancePath.lineTo(21.0f, 50.0f);
        instancePath.lineTo(21.0f, 52.008118f);
        instancePath.cubicTo(21.0f, 53.108204f, 20.113445f, 54.0f, 18.994081f, 54.0f);
        instancePath.lineTo(16.005919f, 54.0f);
        instancePath.cubicTo(14.898081f, 54.0f, 14.0f, 53.1066f, 14.0f, 52.008118f);
        instancePath.lineTo(14.0f, 50.0f);
        instancePath.lineTo(0.0f, 50.0f);
        instancePath.lineTo(0.0f, 43.0f);
        instancePath.lineTo(14.0f, 43.0f);
        instancePath.lineTo(14.0f, 43.0f);
        instancePath.lineTo(14.0f, 40.991882f);
        instancePath.cubicTo(14.0f, 39.891796f, 14.886555f, 39.0f, 16.005919f, 39.0f);
        instancePath.lineTo(18.994081f, 39.0f);
        instancePath.cubicTo(20.10192f, 39.0f, 21.0f, 39.8934f, 21.0f, 40.991882f);
        instancePath.lineTo(21.0f, 43.0f);
        instancePath.lineTo(69.0f, 43.0f);
        instancePath.lineTo(69.0f, 40.991882f);
        instancePath.cubicTo(69.0f, 39.891796f, 69.88656f, 39.0f, 71.00592f, 39.0f);
        instancePath.lineTo(73.99408f, 39.0f);
        instancePath.cubicTo(75.10192f, 39.0f, 76.0f, 39.8934f, 76.0f, 40.991882f);
        instancePath.lineTo(76.0f, 43.0f);
        instancePath.lineTo(90.0f, 43.0f);
        instancePath.lineTo(90.0f, 50.0f);
        instancePath.lineTo(76.0f, 50.0f);
        instancePath.lineTo(76.0f, 52.008118f);
        instancePath.cubicTo(76.0f, 53.108204f, 75.11344f, 54.0f, 73.99408f, 54.0f);
        instancePath.lineTo(71.00592f, 54.0f);
        instancePath.cubicTo(69.89808f, 54.0f, 69.0f, 53.1066f, 69.0f, 52.008118f);
        instancePath.lineTo(69.0f, 50.0f);
        instancePath.close();
        instancePath.moveTo(0.0f, 3.99323f);
        instancePath.cubicTo(0.0f, 2.8923995f, 0.8907616f, 2.0f, 2.0059645f, 2.0f);
        instancePath.lineTo(87.99403f, 2.0f);
        instancePath.cubicTo(89.1019f, 2.0f, 90.0f, 2.8954434f, 90.0f, 3.99323f);
        instancePath.lineTo(90.0f, 66.00677f);
        instancePath.cubicTo(90.0f, 67.1076f, 89.10924f, 68.0f, 87.99403f, 68.0f);
        instancePath.lineTo(2.0059645f, 68.0f);
        instancePath.cubicTo(0.898101f, 68.0f, 0.0f, 67.10455f, 0.0f, 66.00677f);
        instancePath.lineTo(0.0f, 3.99323f);
        instancePath.close();
        canvas.saveLayerAlpha(null, 128, 31);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
