package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class mini_program_circle_filled extends l95.c {
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
                instancePath.moveTo(2.0f, 12.0f);
                instancePath.cubicTo(2.0f, 17.5228f, 6.47715f, 22.0f, 12.0f, 22.0f);
                instancePath.cubicTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f);
                instancePath.cubicTo(22.0f, 6.47715f, 17.5228f, 2.0f, 12.0f, 2.0f);
                instancePath.cubicTo(6.47715f, 2.0f, 2.0f, 6.47715f, 2.0f, 12.0f);
                instancePath.close();
                instancePath.moveTo(15.0061f, 12.7242f);
                instancePath.lineTo(15.1787f, 12.7198f);
                instancePath.cubicTo(16.7498f, 12.4466f, 17.8818f, 11.2075f, 17.8818f, 9.72727f);
                instancePath.cubicTo(17.8818f, 8.04739f, 16.3866f, 6.7f, 14.5515f, 6.7f);
                instancePath.cubicTo(12.7164f, 6.7f, 11.2212f, 8.04739f, 11.2212f, 9.72727f);
                instancePath.lineTo(11.2212f, 14.2727f);
                instancePath.cubicTo(11.2212f, 15.1038f, 10.4162f, 15.7909f, 9.4f, 15.7909f);
                instancePath.cubicTo(8.38376f, 15.7909f, 7.57879f, 15.1038f, 7.57879f, 14.2727f);
                instancePath.cubicTo(7.57879f, 13.6121f, 8.10106f, 13.0213f, 8.86433f, 12.8371f);
                instancePath.cubicTo(9.20564f, 12.7518f, 9.51898f, 12.5042f, 9.64544f, 12.2091f);
                instancePath.cubicTo(9.66569f, 12.1699f, 9.68311f, 12.1186f, 9.69213f, 12.0645f);
                instancePath.cubicTo(9.6986f, 12.0257f, 9.70016f, 11.9959f, 9.7f, 11.9388f);
                instancePath.cubicTo(9.7f, 11.5655f, 9.38777f, 11.3061f, 8.97576f, 11.3061f);
                instancePath.lineTo(8.85454f, 11.3061f);
                instancePath.cubicTo(7.25945f, 11.5453f, 6.1f, 12.7991f, 6.1f, 14.2727f);
                instancePath.cubicTo(6.1f, 15.9526f, 7.59521f, 17.3f, 9.4303f, 17.3f);
                instancePath.cubicTo(11.2654f, 17.3f, 12.7606f, 15.9526f, 12.7606f, 14.2727f);
                instancePath.lineTo(12.7606f, 9.72727f);
                instancePath.cubicTo(12.7606f, 8.89618f, 13.5656f, 8.20909f, 14.5818f, 8.20909f);
                instancePath.cubicTo(15.5981f, 8.20909f, 16.403f, 8.89618f, 16.403f, 9.72727f);
                instancePath.cubicTo(16.403f, 10.4133f, 15.8864f, 11.0076f, 15.1175f, 11.1932f);
                instancePath.cubicTo(14.7684f, 11.2707f, 14.4702f, 11.5089f, 14.3364f, 11.8212f);
                instancePath.cubicTo(14.1243f, 12.2982f, 14.4623f, 12.7242f, 15.0061f, 12.7242f);
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
