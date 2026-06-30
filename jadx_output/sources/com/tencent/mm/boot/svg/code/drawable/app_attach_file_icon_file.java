package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_attach_file_icon_file extends l95.c {
    private final int width = 180;
    private final int height = 180;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 180;
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-13917627);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(180.0f, 0.0f);
                instancePath.lineTo(180.0f, 180.0f);
                instancePath.lineTo(0.0f, 180.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(49.799175f, 34.8f);
                instancePath2.cubicTo(48.142776f, 34.8f, 46.8f, 36.136326f, 46.8f, 37.79583f);
                instancePath2.lineTo(46.8f, 142.20418f);
                instancePath2.cubicTo(46.8f, 143.85872f, 48.139797f, 145.2f, 49.799175f, 145.2f);
                instancePath2.lineTo(130.20082f, 145.2f);
                instancePath2.cubicTo(131.85722f, 145.2f, 133.2f, 143.86368f, 133.2f, 142.20418f);
                instancePath2.lineTo(133.2f, 37.79583f);
                instancePath2.cubicTo(133.2f, 36.141277f, 131.8602f, 34.8f, 130.20082f, 34.8f);
                instancePath2.lineTo(49.799175f, 34.8f);
                instancePath2.close();
                instancePath2.moveTo(88.8f, 84.0f);
                instancePath2.lineTo(88.8f, 90.0f);
                instancePath2.lineTo(57.6f, 90.0f);
                instancePath2.lineTo(57.6f, 84.0f);
                instancePath2.lineTo(88.8f, 84.0f);
                instancePath2.close();
                instancePath2.moveTo(108.0f, 67.2f);
                instancePath2.lineTo(108.0f, 73.2f);
                instancePath2.lineTo(57.6f, 73.2f);
                instancePath2.lineTo(57.6f, 67.2f);
                instancePath2.lineTo(108.0f, 67.2f);
                instancePath2.close();
                instancePath2.moveTo(122.4f, 51.6f);
                instancePath2.lineTo(122.4f, 57.6f);
                instancePath2.lineTo(57.6f, 57.6f);
                instancePath2.lineTo(57.6f, 51.6f);
                instancePath2.lineTo(122.4f, 51.6f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
