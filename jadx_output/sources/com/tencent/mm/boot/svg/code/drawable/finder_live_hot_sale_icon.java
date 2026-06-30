package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_hot_sale_icon extends l95.c {
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
                instancePath.moveTo(11.4006f, 2.51758f);
                instancePath.cubicTo(13.1693f, 2.51758f, 14.5621f, 4.005f, 15.0308f, 5.4906f);
                instancePath.cubicTo(15.2123f, 6.06577f, 15.193f, 6.66419f, 15.1257f, 7.22946f);
                instancePath.lineTo(15.0377f, 7.84843f);
                instancePath.lineTo(14.9804f, 8.23673f);
                instancePath.cubicTo(14.8958f, 8.86399f, 14.8853f, 9.38437f, 15.2472f, 9.68774f);
                instancePath.cubicTo(15.8556f, 10.1976f, 16.5845f, 9.67632f, 17.1428f, 8.99595f);
                instancePath.lineTo(17.3131f, 8.77683f);
                instancePath.lineTo(17.47f, 8.55323f);
                instancePath.cubicTo(17.4949f, 8.51593f, 17.5192f, 8.4787f, 17.5428f, 8.44166f);
                instancePath.lineTo(17.6758f, 8.22281f);
                instancePath.cubicTo(18.6004f, 9.88816f, 19.15f, 11.8276f, 19.15f, 13.8505f);
                instancePath.cubicTo(19.15f, 17.3532f, 16.6313f, 20.2676f, 13.3062f, 20.8813f);
                instancePath.cubicTo(13.5455f, 20.5907f, 13.6891f, 20.2179f, 13.6891f, 19.8115f);
                instancePath.cubicTo(13.6891f, 18.7051f, 13.1262f, 17.6014f, 12.0003f, 16.5002f);
                instancePath.cubicTo(10.8744f, 17.6014f, 10.3115f, 18.7051f, 10.3115f, 19.8115f);
                instancePath.cubicTo(10.3115f, 20.2179f, 10.4551f, 20.5907f, 10.6942f, 20.8821f);
                instancePath.cubicTo(7.36905f, 20.2672f, 4.85059f, 17.353f, 4.85059f, 13.8505f);
                instancePath.cubicTo(4.85059f, 10.7051f, 6.78484f, 8.52418f, 7.7326f, 7.68914f);
                instancePath.cubicTo(7.53721f, 8.5932f, 7.5348f, 10.4164f, 7.89471f, 10.6776f);
                instancePath.cubicTo(7.89921f, 10.6809f, 7.9112f, 10.6675f, 7.91263f, 10.6579f);
                instancePath.cubicTo(8.1497f, 9.07786f, 8.80695f, 7.92458f, 9.50306f, 6.97619f);
                instancePath.lineTo(9.76518f, 6.62972f);
                instancePath.lineTo(10.1554f, 6.14033f);
                instancePath.lineTo(10.6468f, 5.53079f);
                instancePath.lineTo(10.87f, 5.23858f);
                instancePath.cubicTo(11.5104f, 4.37061f, 11.8683f, 3.56891f, 11.4006f, 2.51758f);
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
