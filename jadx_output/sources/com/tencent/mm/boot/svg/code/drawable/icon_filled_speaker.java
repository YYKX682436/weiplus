package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_filled_speaker extends l95.c {
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(11.3f, 4.7f);
                instancePath.cubicTo(11.7f, 4.3f, 12.3f, 4.3f, 12.7f, 4.7f);
                instancePath.cubicTo(12.9f, 4.9f, 13.0f, 5.1f, 13.0f, 5.4f);
                instancePath.lineTo(13.0f, 18.6f);
                instancePath.cubicTo(13.0f, 19.2f, 12.6f, 19.6f, 12.0f, 19.6f);
                instancePath.cubicTo(11.7f, 19.6f, 11.5f, 19.5f, 11.3f, 19.3f);
                instancePath.lineTo(7.5f, 15.5f);
                instancePath.lineTo(3.0f, 15.5f);
                instancePath.cubicTo(2.4f, 15.5f, 2.0f, 15.1f, 2.0f, 14.5f);
                instancePath.lineTo(2.0f, 9.5f);
                instancePath.cubicTo(2.0f, 8.9f, 2.4f, 8.5f, 3.0f, 8.5f);
                instancePath.lineTo(7.5f, 8.5f);
                instancePath.lineTo(11.3f, 4.7f);
                instancePath.close();
                instancePath.moveTo(18.2f, 17.9f);
                instancePath.lineTo(17.1f, 16.8f);
                instancePath.lineTo(17.2f, 16.7f);
                instancePath.cubicTo(18.5f, 15.4f, 19.1f, 13.8f, 19.1f, 12.0f);
                instancePath.cubicTo(19.1f, 10.2f, 18.4f, 8.6f, 17.2f, 7.3f);
                instancePath.lineTo(17.1f, 7.2f);
                instancePath.lineTo(18.2f, 6.1f);
                instancePath.lineTo(18.3f, 6.2f);
                instancePath.cubicTo(19.8f, 7.7f, 20.7f, 9.8f, 20.7f, 12.0f);
                instancePath.cubicTo(20.7f, 14.2f, 19.9f, 16.2f, 18.3f, 17.8f);
                instancePath.lineTo(18.2f, 17.9f);
                instancePath.close();
                instancePath.moveTo(16.2f, 15.9f);
                instancePath.lineTo(15.1f, 14.8f);
                instancePath.lineTo(15.2f, 14.7f);
                instancePath.cubicTo(15.9f, 14.0f, 16.3f, 13.0f, 16.3f, 12.0f);
                instancePath.cubicTo(16.3f, 11.0f, 15.9f, 10.0f, 15.2f, 9.3f);
                instancePath.lineTo(15.1f, 9.2f);
                instancePath.lineTo(16.2f, 8.1f);
                instancePath.lineTo(16.3f, 8.2f);
                instancePath.cubicTo(17.3f, 9.2f, 17.9f, 10.6f, 17.9f, 12.0f);
                instancePath.cubicTo(17.9f, 13.4f, 17.3f, 14.8f, 16.3f, 15.8f);
                instancePath.lineTo(16.2f, 15.9f);
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
