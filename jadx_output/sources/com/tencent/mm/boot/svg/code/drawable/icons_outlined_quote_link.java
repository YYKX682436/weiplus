package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_quote_link extends l95.c {
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.5f);
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint5, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(54.401455f, 36.016678f);
        instancePath.lineTo(51.643738f, 33.258965f);
        instancePath.lineTo(58.53803f, 26.364672f);
        instancePath.cubicTo(62.0918f, 22.810902f, 62.0918f, 17.049099f, 58.53803f, 13.495328f);
        instancePath.cubicTo(54.98426f, 9.941557f, 49.222458f, 9.941557f, 45.668686f, 13.495328f);
        instancePath.lineTo(33.029152f, 26.134863f);
        instancePath.cubicTo(29.475382f, 29.688633f, 29.475382f, 35.450436f, 33.029152f, 39.004204f);
        instancePath.lineTo(30.271437f, 41.76192f);
        instancePath.cubicTo(25.19462f, 36.685104f, 25.19462f, 28.453962f, 30.271437f, 23.377146f);
        instancePath.lineTo(42.91097f, 10.737612f);
        instancePath.cubicTo(47.987785f, 5.660796f, 56.21893f, 5.660796f, 61.295746f, 10.737612f);
        instancePath.cubicTo(66.37257f, 15.814427f, 66.37257f, 24.045572f, 61.295746f, 29.122389f);
        instancePath.lineTo(54.401455f, 36.016678f);
        instancePath.close();
        instancePath.moveTo(17.631903f, 36.016678f);
        instancePath.lineTo(20.38962f, 38.774395f);
        instancePath.lineTo(13.495328f, 45.668686f);
        instancePath.cubicTo(9.941557f, 49.222458f, 9.941557f, 54.98426f, 13.495328f, 58.53803f);
        instancePath.cubicTo(17.049099f, 62.0918f, 22.810902f, 62.0918f, 26.364672f, 58.53803f);
        instancePath.lineTo(39.004204f, 45.898495f);
        instancePath.cubicTo(42.557976f, 42.344727f, 42.557976f, 36.582924f, 39.004204f, 33.029152f);
        instancePath.lineTo(41.76192f, 30.271437f);
        instancePath.cubicTo(46.838737f, 35.34825f, 46.838737f, 43.579395f, 41.76192f, 48.65621f);
        instancePath.lineTo(29.122389f, 61.295746f);
        instancePath.cubicTo(24.045572f, 66.37257f, 15.814427f, 66.37257f, 10.737612f, 61.295746f);
        instancePath.cubicTo(5.660796f, 56.21893f, 5.660796f, 47.987785f, 10.737612f, 42.91097f);
        instancePath.lineTo(17.631903f, 36.016678f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint6);
        canvas.drawPath(instancePath, instancePaint7);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
