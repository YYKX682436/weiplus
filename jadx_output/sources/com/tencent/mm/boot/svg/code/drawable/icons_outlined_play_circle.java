package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_play_circle extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                instancePath.moveTo(36.0003f, 62.401f);
                instancePath.cubicTo(50.5806f, 62.401f, 62.4003f, 50.5813f, 62.4003f, 36.001f);
                instancePath.cubicTo(62.4003f, 21.4207f, 50.5806f, 9.60098f, 36.0003f, 9.60098f);
                instancePath.cubicTo(21.42f, 9.60098f, 9.60031f, 21.4207f, 9.60031f, 36.001f);
                instancePath.cubicTo(9.60031f, 50.5813f, 21.42f, 62.401f, 36.0003f, 62.401f);
                instancePath.close();
                instancePath.moveTo(36.0003f, 66.001f);
                instancePath.cubicTo(19.4318f, 66.001f, 6.00031f, 52.5695f, 6.00031f, 36.001f);
                instancePath.cubicTo(6.00031f, 19.4324f, 19.4318f, 6.00098f, 36.0003f, 6.00098f);
                instancePath.cubicTo(52.5689f, 6.00098f, 66.0003f, 19.4324f, 66.0003f, 36.001f);
                instancePath.cubicTo(66.0003f, 52.5695f, 52.5689f, 66.001f, 36.0003f, 66.001f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(31.2237f, 24.4049f);
                instancePath2.lineTo(49.0185f, 34.5733f);
                instancePath2.cubicTo(49.7953f, 35.0172f, 50.0652f, 36.0068f, 49.6213f, 36.7836f);
                instancePath2.cubicTo(49.4778f, 37.0347f, 49.2697f, 37.2429f, 49.0185f, 37.3864f);
                instancePath2.lineTo(31.2237f, 47.5549f);
                instancePath2.cubicTo(30.4469f, 47.9988f, 29.4573f, 47.7289f, 29.0134f, 46.952f);
                instancePath2.cubicTo(28.8736f, 46.7073f, 28.8f, 46.4302f, 28.8f, 46.1483f);
                instancePath2.lineTo(28.8f, 25.8114f);
                instancePath2.cubicTo(28.8f, 24.9167f, 29.5253f, 24.1914f, 30.42f, 24.1914f);
                instancePath2.cubicTo(30.7019f, 24.1914f, 30.979f, 24.265f, 31.2237f, 24.4049f);
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
