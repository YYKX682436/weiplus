package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class note_filled_camera extends l95.c {
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(14.732409f, 4.0f);
        instancePath.cubicTo(14.899585f, 4.0f, 15.0557f, 4.0835505f, 15.148434f, 4.22265f);
        instancePath.lineTo(17.0f, 7.0f);
        instancePath.lineTo(21.0f, 7.0f);
        instancePath.cubicTo(21.552284f, 7.0f, 22.0f, 7.4477153f, 22.0f, 8.0f);
        instancePath.lineTo(22.0f, 19.0f);
        instancePath.cubicTo(22.0f, 19.552284f, 21.552284f, 20.0f, 21.0f, 20.0f);
        instancePath.lineTo(3.0f, 20.0f);
        instancePath.cubicTo(2.4477153f, 20.0f, 2.0f, 19.552284f, 2.0f, 19.0f);
        instancePath.lineTo(2.0f, 8.0f);
        instancePath.cubicTo(2.0f, 7.4477153f, 2.4477153f, 7.0f, 3.0f, 7.0f);
        instancePath.lineTo(7.0f, 7.0f);
        instancePath.lineTo(8.851566f, 4.22265f);
        instancePath.cubicTo(8.9443f, 4.0835505f, 9.100415f, 4.0f, 9.267591f, 4.0f);
        instancePath.lineTo(14.732409f, 4.0f);
        instancePath.close();
        instancePath.moveTo(12.0f, 16.5f);
        instancePath.cubicTo(13.932997f, 16.5f, 15.5f, 14.932997f, 15.5f, 13.0f);
        instancePath.cubicTo(15.5f, 11.067003f, 13.932997f, 9.5f, 12.0f, 9.5f);
        instancePath.cubicTo(10.067003f, 9.5f, 8.5f, 11.067003f, 8.5f, 13.0f);
        instancePath.cubicTo(8.5f, 14.932997f, 10.067003f, 16.5f, 12.0f, 16.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
