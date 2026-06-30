package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_camera_medium extends l95.c {
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
        instancePath.moveTo(16.0f, 13.0f);
        instancePath.cubicTo(16.0f, 15.2091f, 14.2091f, 17.0f, 12.0f, 17.0f);
        instancePath.cubicTo(9.79086f, 17.0f, 8.0f, 15.2091f, 8.0f, 13.0f);
        instancePath.cubicTo(8.0f, 10.7909f, 9.79086f, 9.0f, 12.0f, 9.0f);
        instancePath.cubicTo(14.2091f, 9.0f, 16.0f, 10.7909f, 16.0f, 13.0f);
        instancePath.close();
        instancePath.moveTo(14.5f, 13.0f);
        instancePath.cubicTo(14.5f, 14.3807f, 13.3807f, 15.5f, 12.0f, 15.5f);
        instancePath.cubicTo(10.6193f, 15.5f, 9.5f, 14.3807f, 9.5f, 13.0f);
        instancePath.cubicTo(9.5f, 11.6193f, 10.6193f, 10.5f, 12.0f, 10.5f);
        instancePath.cubicTo(13.3807f, 10.5f, 14.5f, 11.6193f, 14.5f, 13.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(15.1484f, 4.22265f);
        instancePath2.cubicTo(15.0557f, 4.08355f, 14.8996f, 4.0f, 14.7324f, 4.0f);
        instancePath2.lineTo(9.26759f, 4.0f);
        instancePath2.cubicTo(9.10042f, 4.0f, 8.9443f, 4.08355f, 8.85157f, 4.22265f);
        instancePath2.lineTo(7.0f, 7.0f);
        instancePath2.lineTo(3.0f, 7.0f);
        instancePath2.cubicTo(2.44772f, 7.0f, 2.0f, 7.44772f, 2.0f, 8.0f);
        instancePath2.lineTo(2.0f, 19.0f);
        instancePath2.cubicTo(2.0f, 19.5523f, 2.44772f, 20.0f, 3.0f, 20.0f);
        instancePath2.lineTo(21.0f, 20.0f);
        instancePath2.cubicTo(21.5523f, 20.0f, 22.0f, 19.5523f, 22.0f, 19.0f);
        instancePath2.lineTo(22.0f, 8.0f);
        instancePath2.cubicTo(22.0f, 7.44772f, 21.5523f, 7.0f, 21.0f, 7.0f);
        instancePath2.lineTo(17.0f, 7.0f);
        instancePath2.lineTo(15.1484f, 4.22265f);
        instancePath2.close();
        instancePath2.moveTo(7.80278f, 8.5f);
        instancePath2.lineTo(9.80278f, 5.5f);
        instancePath2.lineTo(14.1972f, 5.5f);
        instancePath2.lineTo(16.1972f, 8.5f);
        instancePath2.lineTo(20.5f, 8.5f);
        instancePath2.lineTo(20.5f, 18.5f);
        instancePath2.lineTo(3.5f, 18.5f);
        instancePath2.lineTo(3.5f, 8.5f);
        instancePath2.lineTo(7.80278f, 8.5f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
