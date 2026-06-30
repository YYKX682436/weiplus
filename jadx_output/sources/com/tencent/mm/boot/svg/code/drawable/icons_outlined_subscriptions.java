package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_subscriptions extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
        }
        if (i17 == 2) {
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
            instancePath.moveTo(12.0f, 9.0f);
            instancePath.cubicTo(12.0f, 7.343146f, 13.343145f, 6.0f, 15.0f, 6.0f);
            instancePath.lineTo(57.0f, 6.0f);
            instancePath.cubicTo(58.656853f, 6.0f, 60.0f, 7.343146f, 60.0f, 9.0f);
            instancePath.lineTo(60.0f, 63.0f);
            instancePath.cubicTo(60.0f, 64.65685f, 58.656853f, 66.0f, 57.0f, 66.0f);
            instancePath.lineTo(15.0f, 66.0f);
            instancePath.cubicTo(13.343145f, 66.0f, 12.0f, 64.65685f, 12.0f, 63.0f);
            instancePath.lineTo(12.0f, 9.0f);
            instancePath.close();
            instancePath.moveTo(15.6f, 9.6f);
            instancePath.lineTo(15.6f, 62.4f);
            instancePath.lineTo(56.4f, 62.4f);
            instancePath.lineTo(56.4f, 9.6f);
            instancePath.lineTo(15.6f, 9.6f);
            instancePath.close();
            instancePath.moveTo(25.5f, 24.0f);
            instancePath.cubicTo(23.014719f, 24.0f, 21.0f, 21.985281f, 21.0f, 19.5f);
            instancePath.cubicTo(21.0f, 17.014719f, 23.014719f, 15.0f, 25.5f, 15.0f);
            instancePath.cubicTo(27.985281f, 15.0f, 30.0f, 17.014719f, 30.0f, 19.5f);
            instancePath.cubicTo(30.0f, 21.985281f, 27.985281f, 24.0f, 25.5f, 24.0f);
            instancePath.close();
            instancePath.moveTo(21.0f, 30.0f);
            instancePath.lineTo(43.5f, 30.0f);
            instancePath.lineTo(43.5f, 33.6f);
            instancePath.lineTo(21.0f, 33.6f);
            instancePath.lineTo(21.0f, 30.0f);
            instancePath.close();
            instancePath.moveTo(21.0f, 39.0f);
            instancePath.lineTo(33.0f, 39.0f);
            instancePath.lineTo(33.0f, 42.6f);
            instancePath.lineTo(21.0f, 42.6f);
            instancePath.lineTo(21.0f, 39.0f);
            instancePath.close();
            instancePath.moveTo(21.0f, 48.0f);
            instancePath.lineTo(33.0f, 48.0f);
            instancePath.lineTo(33.0f, 51.6f);
            instancePath.lineTo(21.0f, 51.6f);
            instancePath.lineTo(21.0f, 48.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
