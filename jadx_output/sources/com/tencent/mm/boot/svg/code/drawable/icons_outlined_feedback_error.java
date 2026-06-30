package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_feedback_error extends l95.c {
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
                instancePath.moveTo(22.0f, 12.0f);
                instancePath.cubicTo(22.0f, 6.47715f, 17.5228f, 2.0f, 12.0f, 2.0f);
                instancePath.cubicTo(6.47715f, 2.0f, 2.0f, 6.47715f, 2.0f, 12.0f);
                instancePath.cubicTo(2.0f, 17.5228f, 6.47715f, 22.0f, 12.0f, 22.0f);
                instancePath.cubicTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f);
                instancePath.close();
                instancePath.moveTo(3.2f, 12.0f);
                instancePath.cubicTo(3.2f, 7.13989f, 7.1398897f, 3.1999998f, 12.0f, 3.1999998f);
                instancePath.cubicTo(16.8601f, 3.2f, 20.8f, 7.13989f, 20.8f, 12.0f);
                instancePath.cubicTo(20.8f, 16.8601f, 16.8601f, 20.8f, 12.0f, 20.8f);
                instancePath.cubicTo(7.13989f, 20.8f, 3.2f, 16.8601f, 3.2f, 12.0f);
                instancePath.close();
                instancePath.moveTo(10.0f, 9.0f);
                instancePath.cubicTo(10.0f, 9.82843f, 9.32843f, 10.5f, 8.5f, 10.5f);
                instancePath.cubicTo(7.67157f, 10.5f, 7.0f, 9.82843f, 7.0f, 9.0f);
                instancePath.cubicTo(7.0f, 8.17157f, 7.67157f, 7.5f, 8.5f, 7.5f);
                instancePath.cubicTo(9.32843f, 7.5f, 10.0f, 8.17157f, 10.0f, 9.0f);
                instancePath.close();
                instancePath.moveTo(17.0f, 9.0f);
                instancePath.cubicTo(17.0f, 9.82843f, 16.3284f, 10.5f, 15.5f, 10.5f);
                instancePath.cubicTo(14.6716f, 10.5f, 14.0f, 9.82843f, 14.0f, 9.0f);
                instancePath.cubicTo(14.0f, 8.17157f, 14.6716f, 7.5f, 15.5f, 7.5f);
                instancePath.cubicTo(16.3284f, 7.5f, 17.0f, 8.17157f, 17.0f, 9.0f);
                instancePath.close();
                instancePath.moveTo(8.57441f, 16.2379f);
                instancePath.cubicTo(9.29991f, 15.1583f, 10.56f, 14.4391f, 12.0f, 14.4391f);
                instancePath.cubicTo(13.44f, 14.4391f, 14.7001f, 15.1583f, 15.4256f, 16.2379f);
                instancePath.lineTo(16.4216f, 15.5685f);
                instancePath.cubicTo(15.4768f, 14.1627f, 13.8462f, 13.2391f, 12.0f, 13.2391f);
                instancePath.cubicTo(10.1538f, 13.2391f, 8.52318f, 14.1627f, 7.57843f, 15.5685f);
                instancePath.lineTo(8.57441f, 16.2379f);
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
