package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class shortvideo_pause_btn extends l95.c {
    private final int width = 120;
    private final int height = 120;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 120;
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
        instancePaint3.setColor(637534208);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(60.0f, 0.0f);
        instancePath.cubicTo(93.137085f, 0.0f, 120.0f, 26.862915f, 120.0f, 60.0f);
        instancePath.cubicTo(120.0f, 93.137085f, 93.137085f, 120.0f, 60.0f, 120.0f);
        instancePath.cubicTo(26.862915f, 120.0f, 0.0f, 93.137085f, 0.0f, 60.0f);
        instancePath.cubicTo(0.0f, 26.862915f, 26.862915f, 0.0f, 60.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(60.0f, 0.0f);
        instancePath2.cubicTo(93.137085f, 0.0f, 120.0f, 26.862915f, 120.0f, 60.0f);
        instancePath2.cubicTo(120.0f, 93.137085f, 93.137085f, 120.0f, 60.0f, 120.0f);
        instancePath2.cubicTo(26.862915f, 120.0f, 0.0f, 93.137085f, 0.0f, 60.0f);
        instancePath2.cubicTo(0.0f, 26.862915f, 26.862915f, 0.0f, 60.0f, 0.0f);
        instancePath2.close();
        instancePath2.moveTo(60.0f, 3.6f);
        instancePath2.cubicTo(28.851141f, 3.6f, 3.6f, 28.851141f, 3.6f, 60.0f);
        instancePath2.cubicTo(3.6f, 91.14886f, 28.851141f, 116.4f, 60.0f, 116.4f);
        instancePath2.cubicTo(91.14886f, 116.4f, 116.4f, 91.14886f, 116.4f, 60.0f);
        instancePath2.cubicTo(116.4f, 28.851141f, 91.14886f, 3.6f, 60.0f, 3.6f);
        instancePath2.close();
        instancePath2.moveTo(45.615383f, 38.0f);
        instancePath2.lineTo(50.846153f, 38.0f);
        instancePath2.cubicTo(52.290592f, 38.0f, 53.46154f, 39.313297f, 53.46154f, 40.933334f);
        instancePath2.lineTo(53.46154f, 79.066666f);
        instancePath2.cubicTo(53.46154f, 80.6867f, 52.290592f, 82.0f, 50.846153f, 82.0f);
        instancePath2.lineTo(45.615383f, 82.0f);
        instancePath2.cubicTo(44.170948f, 82.0f, 43.0f, 80.6867f, 43.0f, 79.066666f);
        instancePath2.lineTo(43.0f, 40.933334f);
        instancePath2.cubicTo(43.0f, 39.313297f, 44.170948f, 38.0f, 45.615383f, 38.0f);
        instancePath2.close();
        instancePath2.moveTo(69.15385f, 38.0f);
        instancePath2.lineTo(74.38461f, 38.0f);
        instancePath2.cubicTo(75.829056f, 38.0f, 77.0f, 39.313297f, 77.0f, 40.933334f);
        instancePath2.lineTo(77.0f, 79.066666f);
        instancePath2.cubicTo(77.0f, 80.6867f, 75.829056f, 82.0f, 74.38461f, 82.0f);
        instancePath2.lineTo(69.15385f, 82.0f);
        instancePath2.cubicTo(67.70941f, 82.0f, 66.53846f, 80.6867f, 66.53846f, 79.066666f);
        instancePath2.lineTo(66.53846f, 40.933334f);
        instancePath2.cubicTo(66.53846f, 39.313297f, 67.70941f, 38.0f, 69.15385f, 38.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
