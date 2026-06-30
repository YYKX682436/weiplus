package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class miniwindow_filled extends l95.c {
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(5.19995f, 5.0f);
        instancePath.lineTo(13.2f, 5.0f);
        instancePath.lineTo(13.2f, 19.0f);
        instancePath.lineTo(5.19995f, 19.0f);
        instancePath.lineTo(5.19995f, 5.0f);
        instancePath.close();
        instancePath.moveTo(3.19995f, 5.0f);
        instancePath.cubicTo(3.19995f, 3.89543f, 4.09538f, 3.0f, 5.19995f, 3.0f);
        instancePath.lineTo(13.2f, 3.0f);
        instancePath.cubicTo(14.3045f, 3.0f, 15.2f, 3.89543f, 15.2f, 5.0f);
        instancePath.lineTo(15.2f, 19.0f);
        instancePath.cubicTo(15.2f, 20.1046f, 14.3045f, 21.0f, 13.2f, 21.0f);
        instancePath.lineTo(5.19995f, 21.0f);
        instancePath.cubicTo(4.09538f, 21.0f, 3.19995f, 20.1046f, 3.19995f, 19.0f);
        instancePath.lineTo(3.19995f, 5.0f);
        instancePath.close();
        instancePath.moveTo(18.5999f, 19.0f);
        instancePath.lineTo(17.2f, 19.0f);
        instancePath.lineTo(17.2f, 17.0f);
        instancePath.lineTo(18.47f, 17.0f);
        instancePath.lineTo(18.47f, 7.0f);
        instancePath.lineTo(17.2f, 7.0f);
        instancePath.lineTo(17.2f, 5.0f);
        instancePath.lineTo(18.5999f, 5.0f);
        instancePath.cubicTo(19.6309f, 5.0f, 20.4666f, 5.83574f, 20.4666f, 6.86667f);
        instancePath.lineTo(20.4666f, 17.1333f);
        instancePath.cubicTo(20.4666f, 18.1643f, 19.6309f, 19.0f, 18.5999f, 19.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
