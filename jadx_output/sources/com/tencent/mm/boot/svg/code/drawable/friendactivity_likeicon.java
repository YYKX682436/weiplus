package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class friendactivity_likeicon extends l95.c {
    private final int width = 90;
    private final int height = 90;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 90;
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
                instancePaint3.setColor(-11048043);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(71.1331f, 24.4856f);
                instancePath.cubicTo(68.5289f, 21.8813f, 65.1512f, 20.5581f, 61.6891f, 20.5581f);
                instancePath.cubicTo(58.2601f, 20.5581f, 54.6961f, 21.8563f, 51.6857f, 24.5752f);
                instancePath.lineTo(45.0153f, 31.2457f);
                instancePath.lineTo(37.6783f, 23.9679f);
                instancePath.cubicTo(35.0008f, 21.5641f, 31.6037f, 20.4006f, 28.2205f, 20.4803f);
                instancePath.cubicTo(24.823f, 20.5603f, 21.4579f, 21.8945f, 18.8669f, 24.4856f);
                instancePath.cubicTo(16.1936f, 27.1588f, 14.8578f, 30.657f, 14.8578f, 34.1644f);
                instancePath.cubicTo(14.8578f, 37.6548f, 16.1808f, 41.1361f, 18.8283f, 43.8044f);
                instancePath.lineTo(44.9973f, 67.9201f);
                instancePath.lineTo(71.6923f, 43.2505f);
                instancePath.cubicTo(74.068f, 40.5803f, 75.2176f, 37.2028f, 75.1384f, 33.8392f);
                instancePath.cubicTo(75.0583f, 30.4416f, 73.7241f, 27.0766f, 71.1331f, 24.4856f);
                instancePath.close();
                instancePath.moveTo(61.6891f, 14.9331f);
                instancePath.cubicTo(66.6099f, 14.9331f, 71.4282f, 16.8257f, 75.1106f, 20.5081f);
                instancePath.cubicTo(78.7642f, 24.1617f, 80.6491f, 28.9214f, 80.7618f, 33.7067f);
                instancePath.cubicTo(80.8745f, 38.4913f, 79.217f, 43.3207f, 75.7825f, 47.1146f);
                instancePath.lineTo(75.6983f, 47.2076f);
                instancePath.lineTo(47.6713f, 73.1081f);
                instancePath.cubicTo(46.1641f, 74.501f, 43.8398f, 74.5026f, 42.3306f, 73.1119f);
                instancePath.lineTo(14.93f, 47.8613f);
                instancePath.lineTo(14.8894f, 47.8207f);
                instancePath.cubicTo(11.1189f, 44.0502f, 9.23282f, 39.1026f, 9.23282f, 34.1644f);
                instancePath.cubicTo(9.23281f, 29.2261f, 11.1189f, 24.2786f, 14.8894f, 20.5081f);
                instancePath.cubicTo(18.5431f, 16.8544f, 23.3027f, 14.9696f, 28.088f, 14.8569f);
                instancePath.cubicTo(32.8742f, 14.7441f, 37.7053f, 16.4027f, 41.4997f, 19.8396f);
                instancePath.lineTo(41.547f, 19.8824f);
                instancePath.lineTo(44.9992f, 23.3068f);
                instancePath.lineTo(47.8038f, 20.5023f);
                instancePath.lineTo(47.8528f, 20.4576f);
                instancePath.cubicTo(51.8712f, 16.8012f, 56.7921f, 14.9331f, 61.6891f, 14.9331f);
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
