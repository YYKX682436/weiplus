package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class language_transfer_filled extends l95.c {
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
        instancePaint3.setColor(-436207616);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(4.0f, 3.0f);
        instancePath.cubicTo(3.44775f, 3.0f, 3.0f, 3.44775f, 3.0f, 4.0f);
        instancePath.lineTo(3.0f, 20.0f);
        instancePath.cubicTo(3.0f, 20.5522f, 3.44775f, 21.0f, 4.0f, 21.0f);
        instancePath.lineTo(20.0f, 21.0f);
        instancePath.cubicTo(20.5522f, 21.0f, 21.0f, 20.5522f, 21.0f, 20.0f);
        instancePath.lineTo(21.0f, 4.0f);
        instancePath.cubicTo(21.0f, 3.44775f, 20.5522f, 3.0f, 20.0f, 3.0f);
        instancePath.lineTo(4.0f, 3.0f);
        instancePath.close();
        instancePath.moveTo(12.0f, 8.76465f);
        instancePath.cubicTo(10.2134f, 8.76465f, 8.76465f, 10.2131f, 8.76465f, 12.0f);
        instancePath.lineTo(7.0f, 12.0f);
        instancePath.cubicTo(7.0f, 9.23853f, 9.23877f, 7.0f, 12.0f, 7.0f);
        instancePath.cubicTo(13.3193f, 7.0f, 14.519f, 7.51123f, 15.4116f, 8.34497f);
        instancePath.lineTo(15.4116f, 7.31396f);
        instancePath.lineTo(16.8232f, 7.31396f);
        instancePath.lineTo(16.8232f, 10.2573f);
        instancePath.cubicTo(16.8232f, 10.6472f, 16.5073f, 10.9634f, 16.1177f, 10.9634f);
        instancePath.lineTo(13.1743f, 10.9634f);
        instancePath.lineTo(13.1743f, 9.55151f);
        instancePath.lineTo(14.1147f, 9.55151f);
        instancePath.cubicTo(13.5474f, 9.06079f, 12.8081f, 8.76465f, 12.0f, 8.76465f);
        instancePath.close();
        instancePath.moveTo(12.0f, 15.2354f);
        instancePath.cubicTo(13.7866f, 15.2354f, 15.2354f, 13.7869f, 15.2354f, 12.0f);
        instancePath.lineTo(17.0f, 12.0f);
        instancePath.cubicTo(17.0f, 14.7615f, 14.7612f, 17.0f, 12.0f, 17.0f);
        instancePath.cubicTo(10.6807f, 17.0f, 9.48096f, 16.4885f, 8.58838f, 15.655f);
        instancePath.lineTo(8.58838f, 16.7473f);
        instancePath.lineTo(7.17627f, 16.7473f);
        instancePath.lineTo(7.17627f, 13.8008f);
        instancePath.cubicTo(7.17627f, 13.4111f, 7.49268f, 13.095f, 7.88232f, 13.095f);
        instancePath.lineTo(10.8286f, 13.095f);
        instancePath.lineTo(10.8286f, 14.5068f);
        instancePath.lineTo(9.95459f, 14.5068f);
        instancePath.cubicTo(10.5122f, 14.9626f, 11.2246f, 15.2354f, 12.0f, 15.2354f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
