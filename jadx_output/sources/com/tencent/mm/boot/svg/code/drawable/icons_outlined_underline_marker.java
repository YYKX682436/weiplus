package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_underline_marker extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
        }
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
            instancePaint3.setColor(-436207616);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(23.6937f, 4.45401f);
            instancePath.cubicTo(23.9956f, 4.15223f, 24.4584f, 4.12528f, 24.7269f, 4.39346f);
            instancePath.lineTo(27.6429f, 7.31045f);
            instancePath.cubicTo(27.911f, 7.57889f, 27.8841f, 8.04077f, 27.5823f, 8.34268f);
            instancePath.lineTo(11.9534f, 24.453f);
            instancePath.cubicTo(11.8358f, 24.574f, 11.6953f, 24.6712f, 11.5413f, 24.7401f);
            instancePath.lineTo(8.51106f, 26.0985f);
            instancePath.cubicTo(8.25888f, 26.2113f, 7.96334f, 26.156f, 7.76789f, 25.9608f);
            instancePath.lineTo(7.74446f, 25.9374f);
            instancePath.lineTo(6.07551f, 27.6064f);
            instancePath.cubicTo(5.56517f, 28.1166f, 4.39679f, 28.1494f, 4.14387f, 27.8974f);
            instancePath.cubicTo(3.89162f, 27.6448f, 3.85292f, 26.5478f, 4.43489f, 25.9657f);
            instancePath.cubicTo(4.81154f, 25.589f, 5.59652f, 24.8041f, 6.10383f, 24.2968f);
            instancePath.lineTo(6.06184f, 24.2548f);
            instancePath.cubicTo(5.86573f, 24.0585f, 5.81158f, 23.7614f, 5.9261f, 23.5087f);
            instancePath.lineTo(7.29621f, 20.4911f);
            instancePath.cubicTo(7.36494f, 20.3398f, 7.46128f, 20.2027f, 7.58039f, 20.0868f);
            instancePath.lineTo(23.6937f, 4.45401f);
            instancePath.close();
            instancePath.moveTo(29.3333f, 27.7333f);
            instancePath.lineTo(11.6126f, 27.7333f);
            instancePath.lineTo(15.3333f, 26.1337f);
            instancePath.lineTo(29.3333f, 26.1337f);
            instancePath.lineTo(29.3333f, 27.7333f);
            instancePath.close();
            instancePath.moveTo(8.73176f, 21.1991f);
            instancePath.lineTo(7.65071f, 23.581f);
            instancePath.lineTo(8.44368f, 24.3749f);
            instancePath.lineTo(10.8411f, 23.3017f);
            instancePath.lineTo(25.8743f, 7.80362f);
            instancePath.lineTo(24.2327f, 6.16202f);
            instancePath.lineTo(8.73176f, 21.1991f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
