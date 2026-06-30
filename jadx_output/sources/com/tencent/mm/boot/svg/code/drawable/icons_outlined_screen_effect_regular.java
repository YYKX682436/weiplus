package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_screen_effect_regular extends l95.c {
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
        instancePath.moveTo(10.6666f, 18.6666f);
        instancePath.cubicTo(12.6013f, 18.6666f, 14.2151f, 20.0401f, 14.5863f, 21.8651f);
        instancePath.lineTo(29.3333f, 21.8666f);
        instancePath.lineTo(29.3333f, 23.4666f);
        instancePath.lineTo(14.5866f, 23.4667f);
        instancePath.cubicTo(14.2159f, 25.2924f, 12.6017f, 26.6666f, 10.6666f, 26.6666f);
        instancePath.cubicTo(8.7315f, 26.6666f, 7.11733f, 25.2924f, 6.74667f, 23.4667f);
        instancePath.lineTo(2.66663f, 23.4666f);
        instancePath.lineTo(2.66663f, 21.8666f);
        instancePath.lineTo(6.74694f, 21.8651f);
        instancePath.cubicTo(7.11812f, 20.0401f, 8.73198f, 18.6666f, 10.6666f, 18.6666f);
        instancePath.close();
        instancePath.moveTo(10.6666f, 20.2666f);
        instancePath.cubicTo(9.34114f, 20.2666f, 8.26663f, 21.3411f, 8.26663f, 22.6666f);
        instancePath.cubicTo(8.26663f, 23.9921f, 9.34114f, 25.0666f, 10.6666f, 25.0666f);
        instancePath.cubicTo(11.9921f, 25.0666f, 13.0666f, 23.9921f, 13.0666f, 22.6666f);
        instancePath.cubicTo(13.0666f, 21.3411f, 11.9921f, 20.2666f, 10.6666f, 20.2666f);
        instancePath.close();
        instancePath.moveTo(21.3333f, 5.33325f);
        instancePath.cubicTo(24.0068f, 5.33325f, 26.2209f, 7.30046f, 26.607f, 9.86635f);
        instancePath.lineTo(29.3333f, 9.86659f);
        instancePath.lineTo(29.3333f, 11.4666f);
        instancePath.lineTo(26.6072f, 11.4655f);
        instancePath.cubicTo(26.2217f, 14.032f, 24.0073f, 15.9999f, 21.3333f, 15.9999f);
        instancePath.cubicTo(18.6593f, 15.9999f, 16.4449f, 14.032f, 16.0594f, 11.4655f);
        instancePath.lineTo(2.66663f, 11.4666f);
        instancePath.lineTo(2.66663f, 9.86659f);
        instancePath.lineTo(16.0596f, 9.86635f);
        instancePath.cubicTo(16.4457f, 7.30046f, 18.6598f, 5.33325f, 21.3333f, 5.33325f);
        instancePath.close();
        instancePath.moveTo(21.3333f, 6.93325f);
        instancePath.cubicTo(19.2714f, 6.93325f, 17.6f, 8.60472f, 17.6f, 10.6666f);
        instancePath.cubicTo(17.6f, 12.7284f, 19.2714f, 14.3999f, 21.3333f, 14.3999f);
        instancePath.cubicTo(23.3952f, 14.3999f, 25.0666f, 12.7284f, 25.0666f, 10.6666f);
        instancePath.cubicTo(25.0666f, 8.60472f, 23.3952f, 6.93325f, 21.3333f, 6.93325f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
