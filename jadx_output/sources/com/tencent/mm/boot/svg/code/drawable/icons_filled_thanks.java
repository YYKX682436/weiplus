package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_thanks extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
        }
        if (i17 != 2) {
            return 0;
        }
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
        instancePath.moveTo(27.9852f, 18.2959f);
        instancePath.cubicTo(27.5651f, 19.0679f, 26.5845f, 19.3922f, 25.7773f, 19.0444f);
        instancePath.cubicTo(23.8229f, 18.2024f, 20.3986f, 17.0772f, 18.4998f, 18.5012f);
        instancePath.cubicTo(16.1269f, 20.2808f, 16.5595f, 22.9383f, 17.0286f, 25.8203f);
        instancePath.cubicTo(17.1054f, 26.2923f, 17.1832f, 26.7703f, 17.2498f, 27.2514f);
        instancePath.cubicTo(19.2233f, 41.5031f, 25.9077f, 45.179f, 33.0029f, 45.8676f);
        instancePath.cubicTo(33.001f, 45.9117f, 33.0f, 45.956f, 33.0f, 46.0005f);
        instancePath.lineTo(33.0f, 61.0009f);
        instancePath.cubicTo(33.0f, 62.6578f, 34.3431f, 64.0009f, 36.0f, 64.0009f);
        instancePath.cubicTo(37.6569f, 64.0009f, 39.0f, 62.6578f, 39.0f, 61.0009f);
        instancePath.lineTo(39.0f, 46.0005f);
        instancePath.cubicTo(39.0f, 45.956f, 38.999f, 45.9116f, 38.9971f, 45.8676f);
        instancePath.cubicTo(46.0922f, 45.1789f, 52.7767f, 41.503f, 54.7499f, 27.2514f);
        instancePath.cubicTo(54.8165f, 26.7702f, 54.8943f, 26.2921f, 54.9711f, 25.8201f);
        instancePath.cubicTo(55.4402f, 22.9381f, 55.8727f, 20.2808f, 53.4999f, 18.5012f);
        instancePath.cubicTo(51.6011f, 17.0772f, 48.1768f, 18.2024f, 46.2224f, 19.0444f);
        instancePath.cubicTo(45.4152f, 19.3922f, 44.4346f, 19.0679f, 44.0145f, 18.2959f);
        instancePath.cubicTo(42.6605f, 15.8076f, 39.5815f, 11.001f, 35.9999f, 11.001f);
        instancePath.cubicTo(32.4182f, 11.001f, 29.3392f, 15.8076f, 27.9852f, 18.2959f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(15.4207f, 43.6959f);
        instancePath2.cubicTo(14.1478f, 42.6352f, 12.2561f, 42.8072f, 11.1954f, 44.08f);
        instancePath2.cubicTo(10.1347f, 45.3528f, 10.3067f, 47.2445f, 11.5795f, 48.3052f);
        instancePath2.lineTo(23.9485f, 58.613f);
        instancePath2.cubicTo(25.2213f, 59.6737f, 27.113f, 59.5017f, 28.1737f, 58.2289f);
        instancePath2.cubicTo(29.2344f, 56.9561f, 29.0625f, 55.0644f, 27.7896f, 54.0037f);
        instancePath2.lineTo(15.4207f, 43.6959f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(56.5793f, 43.6959f);
        instancePath3.cubicTo(57.8522f, 42.6352f, 59.7439f, 42.8072f, 60.8046f, 44.08f);
        instancePath3.cubicTo(61.8653f, 45.3528f, 61.6933f, 47.2445f, 60.4205f, 48.3052f);
        instancePath3.lineTo(48.0515f, 58.613f);
        instancePath3.cubicTo(46.7787f, 59.6737f, 44.887f, 59.5017f, 43.8263f, 58.2289f);
        instancePath3.cubicTo(42.7656f, 56.9561f, 42.9375f, 55.0644f, 44.2104f, 54.0037f);
        instancePath3.lineTo(56.5793f, 43.6959f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
