package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_star_off extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
        instancePath.moveTo(26.5105f, 13.9183f);
        instancePath.lineTo(21.2553f, 19.0409f);
        instancePath.lineTo(21.9897f, 23.3231f);
        instancePath.lineTo(23.9492f, 25.2825f);
        instancePath.lineTo(22.9744f, 19.5995f);
        instancePath.lineTo(28.0142f, 14.6868f);
        instancePath.cubicTo(28.2242f, 14.4822f, 28.3609f, 14.214f, 28.403f, 13.9238f);
        instancePath.cubicTo(28.5089f, 13.1951f, 28.004f, 12.5185f, 27.2753f, 12.4126f);
        instancePath.lineTo(20.3104f, 11.4005f);
        instancePath.lineTo(17.1957f, 5.08931f);
        instancePath.cubicTo(17.0659f, 4.82636f, 16.8531f, 4.61352f, 16.5901f, 4.48375f);
        instancePath.cubicTo(15.9298f, 4.15785f, 15.1303f, 4.42897f, 14.8044f, 5.08931f);
        instancePath.lineTo(11.6896f, 11.4005f);
        instancePath.lineTo(10.273f, 11.6064f);
        instancePath.lineTo(11.6847f, 13.0181f);
        instancePath.lineTo(12.7521f, 12.8629f);
        instancePath.lineTo(16.0f, 6.28194f);
        instancePath.lineTo(19.2479f, 12.8629f);
        instancePath.lineTo(26.5105f, 13.9183f);
        instancePath.close();
        instancePath.moveTo(9.70902f, 13.3051f);
        instancePath.lineTo(8.29734f, 11.8935f);
        instancePath.lineTo(4.72473f, 12.4126f);
        instancePath.cubicTo(4.43455f, 12.4548f, 4.16636f, 12.5914f, 3.96168f, 12.8014f);
        instancePath.cubicTo(3.44768f, 13.3287f, 3.45847f, 14.1728f, 3.98578f, 14.6868f);
        instancePath.lineTo(9.0256f, 19.5995f);
        instancePath.lineTo(7.83586f, 26.5362f);
        instancePath.cubicTo(7.78629f, 26.8252f, 7.83337f, 27.1225f, 7.96983f, 27.382f);
        instancePath.cubicTo(8.31249f, 28.0338f, 9.11866f, 28.2844f, 9.77046f, 27.9417f);
        instancePath.lineTo(16.0f, 24.6667f);
        instancePath.lineTo(22.2296f, 27.9417f);
        instancePath.cubicTo(22.4891f, 28.0782f, 22.7864f, 28.1253f, 23.0754f, 28.0757f);
        instancePath.cubicTo(23.4375f, 28.0136f, 23.7402f, 27.811f, 23.9373f, 27.5334f);
        instancePath.lineTo(22.4582f, 26.0543f);
        instancePath.lineTo(22.4959f, 26.2741f);
        instancePath.lineTo(16.0f, 22.859f);
        instancePath.lineTo(9.50417f, 26.2741f);
        instancePath.lineTo(10.7448f, 19.0409f);
        instancePath.lineTo(5.48952f, 13.9183f);
        instancePath.lineTo(9.70902f, 13.3051f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(5.13135f, 6.46471f);
        instancePath2.lineTo(6.26272f, 5.33334f);
        instancePath2.lineTo(28.5666f, 27.6372f);
        instancePath2.lineTo(27.4352f, 28.7686f);
        instancePath2.lineTo(5.13135f, 6.46471f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
