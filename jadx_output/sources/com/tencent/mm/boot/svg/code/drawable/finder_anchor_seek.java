package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_anchor_seek extends l95.c {
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(65.25f, 16.5f);
        instancePath.cubicTo(66.4926f, 16.5f, 67.5f, 17.5074f, 67.5f, 18.75f);
        instancePath.lineTo(67.5f, 53.25f);
        instancePath.cubicTo(67.5f, 54.4926f, 66.4926f, 55.5f, 65.25f, 55.5f);
        instancePath.lineTo(63.75f, 55.5f);
        instancePath.cubicTo(62.5074f, 55.5f, 61.5f, 54.4926f, 61.5f, 53.25f);
        instancePath.lineTo(61.5f, 18.75f);
        instancePath.cubicTo(61.5f, 17.5074f, 62.5074f, 16.5f, 63.75f, 16.5f);
        instancePath.lineTo(65.25f, 16.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(57.9883f, 38.4575f);
        instancePath2.cubicTo(59.6944f, 37.2632f, 59.6944f, 34.7364f, 57.9883f, 33.5421f);
        instancePath2.lineTo(36.2197f, 18.3042f);
        instancePath2.cubicTo(34.2313f, 16.9124f, 31.4993f, 18.3349f, 31.4993f, 20.7619f);
        instancePath2.lineTo(31.4993f, 33.992f);
        instancePath2.cubicTo(31.3505f, 33.8277f, 31.1802f, 33.6765f, 30.9883f, 33.5421f);
        instancePath2.lineTo(9.21965f, 18.3042f);
        instancePath2.cubicTo(7.23132f, 16.9124f, 4.49927f, 18.3349f, 4.49927f, 20.7619f);
        instancePath2.lineTo(4.49927f, 51.238f);
        instancePath2.cubicTo(4.49927f, 53.6651f, 7.23133f, 55.0875f, 9.21966f, 53.6957f);
        instancePath2.lineTo(30.9883f, 38.4575f);
        instancePath2.cubicTo(31.1802f, 38.3232f, 31.3505f, 38.172f, 31.4993f, 38.0077f);
        instancePath2.lineTo(31.4993f, 51.238f);
        instancePath2.cubicTo(31.4993f, 53.6651f, 34.2313f, 55.0875f, 36.2197f, 53.6957f);
        instancePath2.lineTo(57.9883f, 38.4575f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
