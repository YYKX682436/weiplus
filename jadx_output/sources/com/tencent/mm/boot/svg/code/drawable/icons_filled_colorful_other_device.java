package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_colorful_other_device extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
        instancePaint3.setColor(-16268960);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(28.0f, 7.0f);
        instancePath.cubicTo(29.10457f, 7.0f, 30.0f, 7.8954306f, 30.0f, 9.0f);
        instancePath.lineTo(30.0f, 13.0f);
        instancePath.cubicTo(30.0f, 14.104569f, 29.10457f, 15.0f, 28.0f, 15.0f);
        instancePath.lineTo(4.0f, 15.0f);
        instancePath.cubicTo(2.8954306f, 15.0f, 2.0f, 14.104569f, 2.0f, 13.0f);
        instancePath.lineTo(2.0f, 9.0f);
        instancePath.cubicTo(2.0f, 7.8954306f, 2.8954306f, 7.0f, 4.0f, 7.0f);
        instancePath.lineTo(28.0f, 7.0f);
        instancePath.close();
        instancePath.moveTo(12.0f, 10.0f);
        instancePath.lineTo(6.0f, 10.0f);
        instancePath.cubicTo(5.4477153f, 10.0f, 5.0f, 10.447716f, 5.0f, 11.0f);
        instancePath.cubicTo(5.0f, 11.552284f, 5.4477153f, 12.0f, 6.0f, 12.0f);
        instancePath.lineTo(6.0f, 12.0f);
        instancePath.lineTo(12.0f, 12.0f);
        instancePath.cubicTo(12.552284f, 12.0f, 13.0f, 11.552284f, 13.0f, 11.0f);
        instancePath.cubicTo(13.0f, 10.447716f, 12.552284f, 10.0f, 12.0f, 10.0f);
        instancePath.lineTo(12.0f, 10.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16268960);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(28.0f, 17.0f);
        instancePath2.cubicTo(29.10457f, 17.0f, 30.0f, 17.89543f, 30.0f, 19.0f);
        instancePath2.lineTo(30.0f, 23.0f);
        instancePath2.cubicTo(30.0f, 24.10457f, 29.10457f, 25.0f, 28.0f, 25.0f);
        instancePath2.lineTo(4.0f, 25.0f);
        instancePath2.cubicTo(2.8954306f, 25.0f, 2.0f, 24.10457f, 2.0f, 23.0f);
        instancePath2.lineTo(2.0f, 19.0f);
        instancePath2.cubicTo(2.0f, 17.89543f, 2.8954306f, 17.0f, 4.0f, 17.0f);
        instancePath2.lineTo(28.0f, 17.0f);
        instancePath2.close();
        instancePath2.moveTo(12.0f, 20.0f);
        instancePath2.lineTo(6.0f, 20.0f);
        instancePath2.cubicTo(5.4477153f, 20.0f, 5.0f, 20.447716f, 5.0f, 21.0f);
        instancePath2.cubicTo(5.0f, 21.552284f, 5.4477153f, 22.0f, 6.0f, 22.0f);
        instancePath2.lineTo(6.0f, 22.0f);
        instancePath2.lineTo(12.0f, 22.0f);
        instancePath2.cubicTo(12.552284f, 22.0f, 13.0f, 21.552284f, 13.0f, 21.0f);
        instancePath2.cubicTo(13.0f, 20.447716f, 12.552284f, 20.0f, 12.0f, 20.0f);
        instancePath2.lineTo(12.0f, 20.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
