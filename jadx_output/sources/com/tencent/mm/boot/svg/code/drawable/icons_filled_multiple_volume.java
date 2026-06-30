package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_multiple_volume extends l95.c {
    private final int width = 36;
    private final int height = 36;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 36;
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
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(28.9893f, 25.6569f);
        instancePath.lineTo(27.2247f, 23.8922f);
        instancePath.lineTo(27.3851f, 23.7318f);
        instancePath.cubicTo(29.4706f, 21.6463f, 30.4332f, 19.0794f, 30.4332f, 16.1918f);
        instancePath.cubicTo(30.4332f, 13.3041f, 29.3102f, 10.7372f, 27.3851f, 8.65169f);
        instancePath.lineTo(27.2247f, 8.49126f);
        instancePath.lineTo(28.9893f, 6.72656f);
        instancePath.lineTo(29.1498f, 6.88699f);
        instancePath.cubicTo(31.5562f, 9.29339f, 33.0f, 12.6624f, 33.0f, 16.1918f);
        instancePath.cubicTo(33.0f, 19.7211f, 31.7166f, 22.9297f, 29.1498f, 25.4965f);
        instancePath.lineTo(28.9893f, 25.6569f);
        instancePath.close();
        instancePath.moveTo(25.7808f, 22.4484f);
        instancePath.lineTo(24.0161f, 20.6837f);
        instancePath.lineTo(24.1765f, 20.5233f);
        instancePath.cubicTo(25.2995f, 19.4003f, 25.9412f, 17.796f, 25.9412f, 16.1918f);
        instancePath.cubicTo(25.9412f, 14.5875f, 25.2995f, 12.9832f, 24.1765f, 11.8602f);
        instancePath.lineTo(24.0161f, 11.6998f);
        instancePath.lineTo(25.7808f, 9.9351f);
        instancePath.lineTo(25.9412f, 10.0955f);
        instancePath.cubicTo(27.5455f, 11.6998f, 28.5081f, 13.9458f, 28.5081f, 16.1918f);
        instancePath.cubicTo(28.5081f, 18.4377f, 27.5455f, 20.6837f, 25.9412f, 22.288f);
        instancePath.lineTo(25.7808f, 22.4484f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(11.8235f, 10.5775f);
        instancePath2.lineTo(17.9197f, 4.48128f);
        instancePath2.cubicTo(18.5614f, 3.83957f, 19.524f, 3.83957f, 20.1657f, 4.48128f);
        instancePath2.cubicTo(20.4865f, 4.80213f, 20.647f, 5.12299f, 20.647f, 5.60427f);
        instancePath2.lineTo(20.647f, 26.7806f);
        instancePath2.cubicTo(20.647f, 27.7432f, 20.0053f, 28.3849f, 19.0427f, 28.3849f);
        instancePath2.cubicTo(18.5614f, 28.3849f, 18.2406f, 28.2245f, 17.9197f, 27.9036f);
        instancePath2.lineTo(15.9584f, 25.9423f);
        instancePath2.cubicTo(15.5545f, 22.0417f, 12.2575f, 19.0f, 8.25f, 19.0f);
        instancePath2.cubicTo(6.29274f, 19.0f, 4.50495f, 19.7256f, 3.14091f, 20.9224f);
        instancePath2.cubicTo(3.04924f, 20.7118f, 3.0f, 20.4698f, 3.0f, 20.2031f);
        instancePath2.lineTo(3.0f, 12.1818f);
        instancePath2.cubicTo(3.0f, 11.2192f, 3.64171f, 10.5775f, 4.60427f, 10.5775f);
        instancePath2.lineTo(11.8235f, 10.5775f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-436207616);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(2.0f, 26.75f);
        instancePath3.cubicTo(2.0f, 30.2018f, 4.79822f, 33.0f, 8.25f, 33.0f);
        instancePath3.cubicTo(11.7018f, 33.0f, 14.5f, 30.2018f, 14.5f, 26.75f);
        instancePath3.cubicTo(14.5f, 23.2982f, 11.7018f, 20.5f, 8.25f, 20.5f);
        instancePath3.cubicTo(4.79822f, 20.5f, 2.0f, 23.2982f, 2.0f, 26.75f);
        instancePath3.close();
        instancePath3.moveTo(8.24994f, 27.688f);
        instancePath3.cubicTo(8.76771f, 27.688f, 9.18744f, 27.2683f, 9.18744f, 26.7505f);
        instancePath3.cubicTo(9.18744f, 26.2327f, 8.76771f, 25.813f, 8.24994f, 25.813f);
        instancePath3.cubicTo(7.73217f, 25.813f, 7.31244f, 26.2327f, 7.31244f, 26.7505f);
        instancePath3.cubicTo(7.31244f, 27.2683f, 7.73217f, 27.688f, 8.24994f, 27.688f);
        instancePath3.close();
        instancePath3.moveTo(11.9999f, 26.7505f);
        instancePath3.cubicTo(11.9999f, 27.2683f, 11.5802f, 27.688f, 11.0624f, 27.688f);
        instancePath3.cubicTo(10.5447f, 27.688f, 10.1249f, 27.2683f, 10.1249f, 26.7505f);
        instancePath3.cubicTo(10.1249f, 26.2327f, 10.5447f, 25.813f, 11.0624f, 25.813f);
        instancePath3.cubicTo(11.5802f, 25.813f, 11.9999f, 26.2327f, 11.9999f, 26.7505f);
        instancePath3.close();
        instancePath3.moveTo(5.43744f, 27.688f);
        instancePath3.cubicTo(5.95521f, 27.688f, 6.37494f, 27.2683f, 6.37494f, 26.7505f);
        instancePath3.cubicTo(6.37494f, 26.2327f, 5.95521f, 25.813f, 5.43744f, 25.813f);
        instancePath3.cubicTo(4.91967f, 25.813f, 4.49994f, 26.2327f, 4.49994f, 26.7505f);
        instancePath3.cubicTo(4.49994f, 27.2683f, 4.91967f, 27.688f, 5.43744f, 27.688f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
