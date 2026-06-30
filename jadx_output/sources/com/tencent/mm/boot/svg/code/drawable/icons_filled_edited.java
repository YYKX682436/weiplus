package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_edited extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(8.04675f, 5.39871f);
        instancePath.lineTo(10.9449f, 6.3884f);
        instancePath.lineTo(11.9346f, 9.28658f);
        instancePath.cubicTo(11.9559f, 9.34892f, 12.0441f, 9.34892f, 12.0654f, 9.28658f);
        instancePath.lineTo(13.0551f, 6.3884f);
        instancePath.lineTo(15.9532f, 5.39871f);
        instancePath.cubicTo(16.0156f, 5.37742f, 16.0156f, 5.28925f, 15.9532f, 5.26796f);
        instancePath.lineTo(13.0551f, 4.27827f);
        instancePath.lineTo(12.0654f, 1.38009f);
        instancePath.cubicTo(12.0441f, 1.31775f, 11.9559f, 1.31775f, 11.9346f, 1.38009f);
        instancePath.lineTo(10.9449f, 4.27827f);
        instancePath.lineTo(8.04675f, 5.26796f);
        instancePath.cubicTo(7.98442f, 5.28925f, 7.98442f, 5.37742f, 8.04675f, 5.39871f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(10.6373f, 8.58206f);
        instancePath2.lineTo(10.9882f, 9.60974f);
        instancePath2.cubicTo(11.3177f, 10.5745f, 12.6822f, 10.5745f, 13.0117f, 9.60975f);
        instancePath2.lineTo(13.789f, 7.33334f);
        instancePath2.lineTo(14.0f, 7.33334f);
        instancePath2.lineTo(14.0f, 13.2836f);
        instancePath2.cubicTo(14.0f, 13.6808f, 13.7039f, 14.0f, 13.3388f, 14.0f);
        instancePath2.lineTo(1.32783f, 14.0f);
        instancePath2.cubicTo(0.970163f, 14.0f, 0.666626f, 13.6792f, 0.666626f, 13.2836f);
        instancePath2.lineTo(0.666626f, 4.04977f);
        instancePath2.cubicTo(0.666626f, 3.65257f, 0.962656f, 3.33334f, 1.32783f, 3.33334f);
        instancePath2.lineTo(10.2109f, 3.33334f);
        instancePath2.lineTo(10.1572f, 3.49056f);
        instancePath2.lineTo(7.72355f, 4.32162f);
        instancePath2.cubicTo(7.5116f, 4.394f, 7.34621f, 4.51633f, 7.22738f, 4.66667f);
        instancePath2.lineTo(1.99996f, 4.66667f);
        instancePath2.lineTo(1.99996f, 9.63017f);
        instancePath2.lineTo(4.79946f, 7.36618f);
        instancePath2.cubicTo(5.10782f, 7.11679f, 5.60304f, 7.12889f, 5.90029f, 7.39006f);
        instancePath2.lineTo(8.88457f, 10.0122f);
        instancePath2.lineTo(10.406f, 8.71833f);
        instancePath2.cubicTo(10.4753f, 8.6594f, 10.5538f, 8.614f, 10.6373f, 8.58206f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
