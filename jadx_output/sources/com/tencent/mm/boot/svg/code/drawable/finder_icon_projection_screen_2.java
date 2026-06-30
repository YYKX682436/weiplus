package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_icon_projection_screen_2 extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                instancePaint3.setColor(-16268960);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(37.8585f, 42.2231f);
                instancePath.lineTo(52.1415f, 60.0768f);
                instancePath.cubicTo(53.1679f, 61.3599f, 52.6327f, 62.4f, 50.9926f, 62.4f);
                instancePath.lineTo(21.0074f, 62.4f);
                instancePath.cubicTo(19.3465f, 62.4f, 18.844f, 61.345f, 19.8585f, 60.0768f);
                instancePath.lineTo(34.1415f, 42.2231f);
                instancePath.cubicTo(35.1679f, 40.9401f, 36.844f, 40.955f, 37.8585f, 42.2231f);
                instancePath.close();
                instancePath.moveTo(63.0f, 12.0f);
                instancePath.cubicTo(64.6569f, 12.0f, 66.0f, 13.3431f, 66.0f, 15.0f);
                instancePath.lineTo(66.0f, 54.0f);
                instancePath.cubicTo(66.0f, 55.6569f, 64.6569f, 57.0f, 63.0f, 57.0f);
                instancePath.lineTo(54.0f, 57.0f);
                instancePath.lineTo(54.0f, 52.5f);
                instancePath.lineTo(61.5f, 52.5f);
                instancePath.lineTo(61.5f, 16.5f);
                instancePath.lineTo(10.5f, 16.5f);
                instancePath.lineTo(10.5f, 52.5f);
                instancePath.lineTo(18.0f, 52.5f);
                instancePath.lineTo(18.0f, 57.0f);
                instancePath.lineTo(9.0f, 57.0f);
                instancePath.cubicTo(7.34315f, 57.0f, 6.0f, 55.6569f, 6.0f, 54.0f);
                instancePath.lineTo(6.0f, 15.0f);
                instancePath.cubicTo(6.0f, 13.3431f, 7.34315f, 12.0f, 9.0f, 12.0f);
                instancePath.lineTo(63.0f, 12.0f);
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
