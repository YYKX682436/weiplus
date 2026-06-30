package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class info_circle_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(2.0f, 12.0f);
                instancePath.cubicTo(2.0f, 17.5228f, 6.47715f, 22.0f, 12.0f, 22.0f);
                instancePath.cubicTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f);
                instancePath.cubicTo(22.0f, 6.47715f, 17.5228f, 2.0f, 12.0f, 2.0f);
                instancePath.cubicTo(6.47715f, 2.0f, 2.0f, 6.47715f, 2.0f, 12.0f);
                instancePath.close();
                instancePath.moveTo(20.8f, 12.0f);
                instancePath.cubicTo(20.8f, 16.8601f, 16.8601f, 20.8f, 12.0f, 20.8f);
                instancePath.cubicTo(7.13989f, 20.8f, 3.2f, 16.8601f, 3.2f, 12.0f);
                instancePath.cubicTo(3.2f, 7.13989f, 7.13989f, 3.2f, 12.0f, 3.2f);
                instancePath.cubicTo(16.8601f, 3.2f, 20.8f, 7.13989f, 20.8f, 12.0f);
                instancePath.close();
                instancePath.moveTo(12.6f, 10.0f);
                instancePath.lineTo(12.6f, 17.0f);
                instancePath.lineTo(11.4f, 17.0f);
                instancePath.lineTo(11.4f, 10.0f);
                instancePath.lineTo(12.6f, 10.0f);
                instancePath.close();
                instancePath.moveTo(12.0f, 9.0f);
                instancePath.cubicTo(12.5523f, 9.0f, 13.0f, 8.55228f, 13.0f, 8.0f);
                instancePath.cubicTo(13.0f, 7.44772f, 12.5523f, 7.0f, 12.0f, 7.0f);
                instancePath.cubicTo(11.4477f, 7.0f, 11.0f, 7.44772f, 11.0f, 8.0f);
                instancePath.cubicTo(11.0f, 8.55228f, 11.4477f, 9.0f, 12.0f, 9.0f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
