package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class person_regular extends l95.c {
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
                instancePath.moveTo(20.3f, 19.8f);
                instancePath.lineTo(20.3f, 19.3155f);
                instancePath.cubicTo(20.3f, 19.0861f, 20.0647f, 18.71f, 19.8598f, 18.6101f);
                instancePath.lineTo(14.1995f, 15.849f);
                instancePath.cubicTo(12.6729f, 15.1044f, 12.2956f, 13.3029f, 13.3893f, 12.0064f);
                instancePath.lineTo(13.7509f, 11.5778f);
                instancePath.cubicTo(14.3022f, 10.9243f, 14.8f, 9.56439f, 14.8f, 8.71019f);
                instancePath.lineTo(14.8f, 7.00021f);
                instancePath.cubicTo(14.8f, 5.45491f, 13.5456f, 4.2f, 12.0f, 4.2f);
                instancePath.cubicTo(10.4563f, 4.2f, 9.2f, 5.4552f, 9.2f, 6.99958f);
                instancePath.lineTo(9.2f, 8.70929f);
                instancePath.cubicTo(9.2f, 9.56566f, 9.69575f, 10.9205f, 10.2491f, 11.5763f);
                instancePath.lineTo(10.6106f, 12.0048f);
                instancePath.cubicTo(11.7066f, 13.3039f, 11.3252f, 15.1037f, 9.80072f, 15.8476f);
                instancePath.lineTo(4.14037f, 18.6098f);
                instancePath.cubicTo(3.93702f, 18.709f, 3.7f, 19.0887f, 3.7f, 19.3155f);
                instancePath.lineTo(3.7f, 19.8f);
                instancePath.lineTo(20.3f, 19.8f);
                instancePath.close();
                instancePath.moveTo(2.5f, 20.0f);
                instancePath.lineTo(2.5f, 19.3155f);
                instancePath.cubicTo(2.5f, 18.6304f, 2.99815f, 17.8319f, 3.6141f, 17.5313f);
                instancePath.lineTo(9.27445f, 14.7691f);
                instancePath.cubicTo(10.0954f, 14.3685f, 10.2863f, 13.4813f, 9.69345f, 12.7786f);
                instancePath.lineTo(9.33191f, 12.3501f);
                instancePath.cubicTo(8.59632f, 11.4783f, 8.0f, 9.8495f, 8.0f, 8.70929f);
                instancePath.lineTo(8.0f, 6.99958f);
                instancePath.cubicTo(8.0f, 4.79067f, 9.79536f, 3.0f, 12.0f, 3.0f);
                instancePath.cubicTo(14.2091f, 3.0f, 16.0f, 4.79298f, 16.0f, 7.00021f);
                instancePath.lineTo(16.0f, 8.71019f);
                instancePath.cubicTo(16.0f, 9.8493f, 15.4009f, 11.4829f, 14.6681f, 12.3516f);
                instancePath.lineTo(14.3066f, 12.7801f);
                instancePath.cubicTo(13.717f, 13.479f, 13.9012f, 14.3684f, 14.7255f, 14.7705f);
                instancePath.lineTo(20.3859f, 17.5316f);
                instancePath.cubicTo(21.0012f, 17.8317f, 21.5f, 18.6252f, 21.5f, 19.3155f);
                instancePath.lineTo(21.5f, 20.0f);
                instancePath.cubicTo(21.5f, 20.5523f, 21.0523f, 21.0f, 20.5f, 21.0f);
                instancePath.lineTo(3.5f, 21.0f);
                instancePath.cubicTo(2.94772f, 21.0f, 2.5f, 20.5523f, 2.5f, 20.0f);
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
