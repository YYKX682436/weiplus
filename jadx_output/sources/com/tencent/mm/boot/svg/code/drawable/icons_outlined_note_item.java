package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_note_item extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(7.4f, 5.2f);
        instancePath.lineTo(20.4f, 5.2f);
        instancePath.lineTo(20.4f, 6.4f);
        instancePath.lineTo(7.4f, 6.4f);
        instancePath.lineTo(7.4f, 5.2f);
        instancePath.close();
        instancePath.moveTo(7.8f, 18.8f);
        instancePath.lineTo(20.8f, 18.8f);
        instancePath.lineTo(20.8f, 20.0f);
        instancePath.lineTo(7.8f, 20.0f);
        instancePath.lineTo(7.8f, 18.8f);
        instancePath.close();
        instancePath.moveTo(7.8f, 12.0f);
        instancePath.lineTo(20.8f, 12.0f);
        instancePath.lineTo(20.8f, 13.2f);
        instancePath.lineTo(7.8f, 13.2f);
        instancePath.lineTo(7.8f, 12.0f);
        instancePath.close();
        instancePath.moveTo(3.4f, 11.6f);
        instancePath.lineTo(3.5f, 11.6f);
        instancePath.cubicTo(4.0522847f, 11.6f, 4.5f, 12.047715f, 4.5f, 12.6f);
        instancePath.lineTo(4.5f, 12.7f);
        instancePath.cubicTo(4.5f, 13.252285f, 4.0522847f, 13.7f, 3.5f, 13.7f);
        instancePath.lineTo(3.4f, 13.7f);
        instancePath.cubicTo(2.8477151f, 13.7f, 2.4f, 13.252285f, 2.4f, 12.7f);
        instancePath.lineTo(2.4f, 12.6f);
        instancePath.cubicTo(2.4f, 12.047715f, 2.8477151f, 11.6f, 3.4f, 11.6f);
        instancePath.close();
        instancePath.moveTo(3.4f, 18.3f);
        instancePath.lineTo(3.5f, 18.3f);
        instancePath.cubicTo(4.0522847f, 18.3f, 4.5f, 18.747715f, 4.5f, 19.3f);
        instancePath.lineTo(4.5f, 19.4f);
        instancePath.cubicTo(4.5f, 19.952284f, 4.0522847f, 20.4f, 3.5f, 20.4f);
        instancePath.lineTo(3.4f, 20.4f);
        instancePath.cubicTo(2.8477151f, 20.4f, 2.4f, 19.952284f, 2.4f, 19.4f);
        instancePath.lineTo(2.4f, 19.3f);
        instancePath.cubicTo(2.4f, 18.747715f, 2.8477151f, 18.3f, 3.4f, 18.3f);
        instancePath.close();
        instancePath.moveTo(3.4f, 4.8f);
        instancePath.lineTo(3.5f, 4.8f);
        instancePath.cubicTo(4.0522847f, 4.8f, 4.5f, 5.2477155f, 4.5f, 5.8f);
        instancePath.lineTo(4.5f, 5.9f);
        instancePath.cubicTo(4.5f, 6.452285f, 4.0522847f, 6.9f, 3.5f, 6.9f);
        instancePath.lineTo(3.4f, 6.9f);
        instancePath.cubicTo(2.8477151f, 6.9f, 2.4f, 6.452285f, 2.4f, 5.9f);
        instancePath.lineTo(2.4f, 5.8f);
        instancePath.cubicTo(2.4f, 5.2477155f, 2.8477151f, 4.8f, 3.4f, 4.8f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
