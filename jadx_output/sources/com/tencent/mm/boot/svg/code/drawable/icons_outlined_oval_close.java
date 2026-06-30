package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_oval_close extends l95.c {
    private final int width = 20;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 20;
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
                instancePaint3.setColor(-1);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(10.0f, 20.0f);
                instancePath.cubicTo(4.47715f, 20.0f, 0.0f, 15.5228f, 0.0f, 10.0f);
                instancePath.cubicTo(0.0f, 4.47715f, 4.47715f, 0.0f, 10.0f, 0.0f);
                instancePath.cubicTo(15.5228f, 0.0f, 20.0f, 4.47715f, 20.0f, 10.0f);
                instancePath.cubicTo(20.0f, 15.5228f, 15.5228f, 20.0f, 10.0f, 20.0f);
                instancePath.close();
                instancePath.moveTo(10.0f, 18.8f);
                instancePath.cubicTo(14.8601f, 18.8f, 18.8f, 14.8601f, 18.8f, 10.0f);
                instancePath.cubicTo(18.8f, 5.13989f, 14.8601f, 1.2f, 10.0f, 1.2f);
                instancePath.cubicTo(5.13989f, 1.2f, 1.2f, 5.13989f, 1.2f, 10.0f);
                instancePath.cubicTo(1.2f, 14.8601f, 5.13989f, 18.8f, 10.0f, 18.8f);
                instancePath.close();
                instancePath.moveTo(13.1113f, 6.0402f);
                instancePath.lineTo(13.9598f, 6.88873f);
                instancePath.lineTo(10.8485f, 10.0f);
                instancePath.lineTo(13.9598f, 13.1113f);
                instancePath.lineTo(13.1113f, 13.9598f);
                instancePath.lineTo(10.0f, 10.8485f);
                instancePath.lineTo(6.88873f, 13.9598f);
                instancePath.lineTo(6.0402f, 13.1113f);
                instancePath.lineTo(9.15147f, 10.0f);
                instancePath.lineTo(6.0402f, 6.88873f);
                instancePath.lineTo(6.88873f, 6.0402f);
                instancePath.lineTo(10.0f, 9.15147f);
                instancePath.lineTo(13.1113f, 6.0402f);
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
