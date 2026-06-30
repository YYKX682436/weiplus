package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_template extends l95.c {
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
                instancePath.moveTo(5.36798f, 6.00164f);
                instancePath.lineTo(15.4361f, 6.0f);
                instancePath.cubicTo(16.3276f, 6.0f, 16.6509f, 6.09283f, 16.9768f, 6.26713f);
                instancePath.cubicTo(17.3028f, 6.44144f, 17.5586f, 6.69723f, 17.7329f, 7.02315f);
                instancePath.cubicTo(17.9072f, 7.34908f, 18.0f, 7.67237f, 18.0f, 8.56389f);
                instancePath.lineTo(18.0f, 18.4361f);
                instancePath.cubicTo(18.0f, 19.3276f, 17.9072f, 19.6509f, 17.7329f, 19.9768f);
                instancePath.cubicTo(17.5586f, 20.3028f, 17.3028f, 20.5586f, 16.9768f, 20.7329f);
                instancePath.cubicTo(16.6509f, 20.9072f, 16.3276f, 21.0f, 15.4361f, 21.0f);
                instancePath.lineTo(5.56389f, 21.0f);
                instancePath.cubicTo(4.67237f, 21.0f, 4.34908f, 20.9072f, 4.02315f, 20.7329f);
                instancePath.cubicTo(3.69723f, 20.5586f, 3.44144f, 20.3028f, 3.26713f, 19.9768f);
                instancePath.cubicTo(3.10623f, 19.676f, 3.01476f, 19.3774f, 3.00164f, 18.632f);
                instancePath.lineTo(3.0f, 8.56389f);
                instancePath.cubicTo(3.0f, 7.67237f, 3.09283f, 7.34908f, 3.26713f, 7.02315f);
                instancePath.cubicTo(3.44144f, 6.69723f, 3.69723f, 6.44144f, 4.02315f, 6.26713f);
                instancePath.cubicTo(4.32401f, 6.10623f, 4.62261f, 6.01476f, 5.36798f, 6.00164f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(20.5089f, 4.44786f);
                instancePath2.lineTo(11.0191f, 1.7267f);
                instancePath2.cubicTo(10.1622f, 1.48097f, 9.82581f, 1.48109f, 9.46446f, 1.5588f);
                instancePath2.cubicTo(9.10312f, 1.63652f, 8.78673f, 1.8119f, 8.52934f, 2.07715f);
                instancePath2.cubicTo(8.50954f, 2.09756f, 8.49021f, 2.11808f, 8.47128f, 2.13897f);
                instancePath2.lineTo(8.36198f, 2.27075f);
                instancePath2.cubicTo(8.18605f, 2.50448f, 8.0369f, 2.82535f, 7.84787f, 3.48456f);
                instancePath2.lineTo(7.52707f, 4.60129f);
                instancePath2.lineTo(15.4361f, 4.6f);
                instancePath2.cubicTo(16.7241f, 4.6f, 17.1715f, 4.78359f, 17.6371f, 5.03259f);
                instancePath2.cubicTo(18.2106f, 5.33931f, 18.6607f, 5.78941f, 18.9674f, 6.36292f);
                instancePath2.cubicTo(19.2164f, 6.82851f, 19.4f, 7.27589f, 19.4f, 8.56389f);
                instancePath2.lineTo(19.4f, 17.5736f);
                instancePath2.cubicTo(19.4465f, 17.4401f, 19.4946f, 17.2868f, 19.5456f, 17.1089f);
                instancePath2.lineTo(22.3192f, 7.43035f);
                instancePath2.cubicTo(22.5121f, 6.71025f, 22.5064f, 6.398f, 22.4347f, 6.06445f);
                instancePath2.cubicTo(22.357f, 5.7031f, 22.1816f, 5.38672f, 21.9164f, 5.12933f);
                instancePath2.lineTo(21.7905f, 5.01561f);
                instancePath2.cubicTo(21.5498f, 4.81546f, 21.2341f, 4.65579f, 20.5089f, 4.44786f);
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
