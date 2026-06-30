package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_picture_regular extends l95.c {
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
                instancePath.moveTo(2.9918f, 4.0f);
                instancePath.lineTo(21.0082f, 4.0f);
                instancePath.cubicTo(21.5447f, 4.0f, 22.0f, 4.48114f, 22.0f, 5.07465f);
                instancePath.lineTo(22.0f, 15.5f);
                instancePath.lineTo(22.0f, 18.9254f);
                instancePath.cubicTo(22.0f, 19.5212f, 21.556f, 20.0f, 21.0082f, 20.0f);
                instancePath.lineTo(2.9918f, 20.0f);
                instancePath.cubicTo(2.45531f, 20.0f, 2.0f, 19.5189f, 2.0f, 18.9254f);
                instancePath.lineTo(2.0f, 5.07465f);
                instancePath.cubicTo(2.0f, 4.47885f, 2.44405f, 4.0f, 2.9918f, 4.0f);
                instancePath.close();
                instancePath.moveTo(20.8f, 14.4088f);
                instancePath.lineTo(20.8f, 5.2f);
                instancePath.lineTo(3.2f, 5.2f);
                instancePath.lineTo(3.2f, 14.0922f);
                instancePath.lineTo(8.19925f, 10.0493f);
                instancePath.cubicTo(8.6618f, 9.67518f, 9.40463f, 9.69333f, 9.8505f, 10.0851f);
                instancePath.lineTo(14.3269f, 14.0182f);
                instancePath.lineTo(16.6091f, 12.0775f);
                instancePath.cubicTo(17.0713f, 11.6844f, 17.8067f, 11.6924f, 18.2554f, 12.0951f);
                instancePath.lineTo(20.8f, 14.4088f);
                instancePath.close();
                instancePath.moveTo(3.2f, 15.6355f);
                instancePath.lineTo(9.00606f, 10.9401f);
                instancePath.lineTo(14.8112f, 16.0f);
                instancePath.lineTo(16.5824f, 16.0f);
                instancePath.lineTo(15.238f, 14.8187f);
                instancePath.lineTo(17.4262f, 12.9579f);
                instancePath.lineTo(20.8f, 15.9936f);
                instancePath.lineTo(20.8f, 18.8f);
                instancePath.lineTo(3.2f, 18.8f);
                instancePath.lineTo(3.2f, 15.6355f);
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
