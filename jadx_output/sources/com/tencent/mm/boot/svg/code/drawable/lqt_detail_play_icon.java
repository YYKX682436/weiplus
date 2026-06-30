package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class lqt_detail_play_icon extends l95.c {
    private final int width = 40;
    private final int height = 40;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 40;
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(637534208);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(20.0f, 0.0f);
            instancePath.cubicTo(31.045696f, 0.0f, 40.0f, 8.954305f, 40.0f, 20.0f);
            instancePath.cubicTo(40.0f, 31.045696f, 31.045696f, 40.0f, 20.0f, 40.0f);
            instancePath.cubicTo(8.954305f, 40.0f, 0.0f, 31.045696f, 0.0f, 20.0f);
            instancePath.cubicTo(0.0f, 8.954305f, 8.954305f, 0.0f, 20.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(20.0f, 0.0f);
            instancePath2.cubicTo(31.045694f, 0.0f, 40.0f, 8.954305f, 40.0f, 20.0f);
            instancePath2.cubicTo(40.0f, 31.045694f, 31.045694f, 40.0f, 20.0f, 40.0f);
            instancePath2.cubicTo(8.954305f, 40.0f, 0.0f, 31.045694f, 0.0f, 20.0f);
            instancePath2.cubicTo(0.0f, 8.954305f, 8.954305f, 0.0f, 20.0f, 0.0f);
            instancePath2.close();
            instancePath2.moveTo(20.0f, 1.2f);
            instancePath2.cubicTo(9.617046f, 1.2f, 1.2f, 9.617046f, 1.2f, 20.0f);
            instancePath2.cubicTo(1.2f, 30.382954f, 9.617046f, 38.8f, 20.0f, 38.8f);
            instancePath2.cubicTo(30.382954f, 38.8f, 38.8f, 30.382954f, 38.8f, 20.0f);
            instancePath2.cubicTo(38.8f, 9.617046f, 30.382954f, 1.2f, 20.0f, 1.2f);
            instancePath2.close();
            instancePath2.moveTo(16.0f, 12.72318f);
            instancePath2.cubicTo(16.174026f, 12.72318f, 16.345041f, 12.768595f, 16.49614f, 12.854937f);
            instancePath2.lineTo(27.480574f, 19.131758f);
            instancePath2.cubicTo(27.960093f, 19.405767f, 28.126688f, 20.01662f, 27.852678f, 20.49614f);
            instancePath2.cubicTo(27.76409f, 20.65117f, 27.635605f, 20.779654f, 27.480574f, 20.868242f);
            instancePath2.lineTo(16.49614f, 27.145063f);
            instancePath2.cubicTo(16.01662f, 27.419073f, 15.4057665f, 27.252478f, 15.131757f, 26.772959f);
            instancePath2.cubicTo(15.045415f, 26.621862f, 15.0f, 26.450848f, 15.0f, 26.276821f);
            instancePath2.lineTo(15.0f, 13.72318f);
            instancePath2.cubicTo(15.0f, 13.170895f, 15.447716f, 12.72318f, 16.0f, 12.72318f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
