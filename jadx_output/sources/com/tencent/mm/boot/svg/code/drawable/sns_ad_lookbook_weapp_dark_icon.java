package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sns_ad_lookbook_weapp_dark_icon extends l95.c {
    private final int width = 12;
    private final int height = 12;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 12;
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
                instancePaint3.setColor(1291845631);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(10.425f, 4.23582f);
                instancePath.cubicTo(10.425f, 3.04196f, 9.35212f, 2.0752f, 8.02471f, 2.0752f);
                instancePath.cubicTo(6.6973f, 2.0752f, 5.62447f, 3.04196f, 5.62447f, 4.23582f);
                instancePath.lineTo(5.62447f, 7.83007f);
                instancePath.cubicTo(5.62447f, 8.62492f, 4.8761f, 9.26369f, 3.95123f, 9.26369f);
                instancePath.cubicTo(3.02636f, 9.26369f, 2.27799f, 8.62492f, 2.27799f, 7.83007f);
                instancePath.cubicTo(2.27799f, 7.19414f, 2.76962f, 6.63798f, 3.47236f, 6.46836f);
                instancePath.cubicTo(3.70383f, 6.41049f, 3.95597f, 6.2144f, 3.9553f, 5.98502f);
                instancePath.cubicTo(3.9553f, 5.75227f, 3.74339f, 5.68439f, 3.53115f, 5.71652f);
                instancePath.cubicTo(2.40414f, 5.88714f, 1.57495f, 6.78383f, 1.57495f, 7.83007f);
                instancePath.cubicTo(1.57495f, 9.02392f, 2.64778f, 9.99069f, 3.97519f, 9.99069f);
                instancePath.cubicTo(5.3026f, 9.99069f, 6.37543f, 9.02392f, 6.37543f, 7.83007f);
                instancePath.lineTo(6.37543f, 4.23582f);
                instancePath.cubicTo(6.37543f, 3.44097f, 7.1238f, 2.80219f, 8.04867f, 2.80219f);
                instancePath.cubicTo(8.97354f, 2.80219f, 9.72192f, 3.44097f, 9.72192f, 4.23582f);
                instancePath.cubicTo(9.72192f, 4.89096f, 9.23536f, 5.45064f, 8.52562f, 5.62194f);
                instancePath.cubicTo(8.31855f, 5.66795f, 8.14452f, 5.80695f, 8.06849f, 5.98433f);
                instancePath.cubicTo(7.93306f, 6.28904f, 8.23112f, 6.4164f, 8.48662f, 6.37138f);
                instancePath.cubicTo(9.61794f, 6.17203f, 10.425f, 5.28687f, 10.425f, 4.23582f);
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
