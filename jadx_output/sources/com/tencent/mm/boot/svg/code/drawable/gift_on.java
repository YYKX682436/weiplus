package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class gift_on extends l95.c {
    private final int width = 40;
    private final int height = 40;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 40;
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
        instancePaint3.setColor(-855638017);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(14.2708f, 4.16699f);
        instancePath.cubicTo(17.0085f, 4.16699f, 19.3589f, 6.04344f, 20.0015f, 8.6545f);
        instancePath.cubicTo(20.6165f, 6.14332f, 22.8142f, 4.31156f, 25.4169f, 4.17516f);
        instancePath.lineTo(25.8333f, 4.16699f);
        instancePath.cubicTo(28.5948f, 4.16699f, 30.8333f, 6.40557f, 30.8333f, 9.16699f);
        instancePath.cubicTo(30.8333f, 10.0782f, 30.5896f, 10.9325f, 30.1637f, 11.6682f);
        instancePath.lineTo(33.3333f, 11.667f);
        instancePath.cubicTo(34.2538f, 11.667f, 35.0f, 12.4132f, 35.0f, 13.3337f);
        instancePath.lineTo(35.0f, 21.667f);
        instancePath.lineTo(33.3333f, 21.667f);
        instancePath.lineTo(33.3333f, 33.3337f);
        instancePath.cubicTo(33.3333f, 34.2541f, 32.5871f, 35.0003f, 31.6667f, 35.0003f);
        instancePath.lineTo(8.33333f, 35.0003f);
        instancePath.cubicTo(7.41286f, 35.0003f, 6.66667f, 34.2541f, 6.66667f, 33.3337f);
        instancePath.lineTo(6.66667f, 21.667f);
        instancePath.lineTo(5.0f, 21.667f);
        instancePath.lineTo(5.0f, 13.3337f);
        instancePath.cubicTo(5.0f, 12.4132f, 5.74619f, 11.667f, 6.66667f, 11.667f);
        instancePath.lineTo(9.83627f, 11.6682f);
        instancePath.cubicTo(9.41042f, 10.9325f, 9.16667f, 10.0782f, 9.16667f, 9.16699f);
        instancePath.cubicTo(9.16667f, 6.40557f, 11.4052f, 4.16699f, 14.1667f, 4.16699f);
        instancePath.lineTo(14.2708f, 4.16699f);
        instancePath.close();
        instancePath.moveTo(18.9983f, 21.667f);
        instancePath.lineTo(8.66667f, 21.667f);
        instancePath.lineTo(8.66667f, 32.9987f);
        instancePath.lineTo(18.9983f, 32.997f);
        instancePath.lineTo(18.9983f, 21.667f);
        instancePath.close();
        instancePath.moveTo(31.3333f, 21.667f);
        instancePath.lineTo(20.9983f, 21.667f);
        instancePath.lineTo(20.9983f, 32.997f);
        instancePath.lineTo(31.3333f, 32.9987f);
        instancePath.lineTo(31.3333f, 21.667f);
        instancePath.close();
        instancePath.moveTo(33.0f, 13.667f);
        instancePath.lineTo(7.0f, 13.667f);
        instancePath.lineTo(7.0f, 19.667f);
        instancePath.lineTo(33.0f, 19.667f);
        instancePath.lineTo(33.0f, 13.667f);
        instancePath.close();
        instancePath.moveTo(14.2708f, 6.16699f);
        instancePath.lineTo(14.1667f, 6.16699f);
        instancePath.cubicTo(12.5098f, 6.16699f, 11.1667f, 7.51014f, 11.1667f, 9.16699f);
        instancePath.cubicTo(11.1667f, 10.2111f, 11.7001f, 11.1307f, 12.5093f, 11.668f);
        instancePath.lineTo(18.4467f, 11.667f);
        instancePath.lineTo(18.1325f, 9.50635f);
        instancePath.cubicTo(17.8802f, 7.77628f, 16.517f, 6.44969f, 14.8296f, 6.20688f);
        instancePath.lineTo(14.5455f, 6.17656f);
        instancePath.lineTo(14.2708f, 6.16699f);
        instancePath.close();
        instancePath.moveTo(25.8333f, 6.16699f);
        instancePath.lineTo(25.7292f, 6.16699f);
        instancePath.cubicTo(23.8837f, 6.16699f, 22.3044f, 7.45667f, 21.9166f, 9.23589f);
        instancePath.lineTo(21.8675f, 9.50635f);
        instancePath.lineTo(21.5517f, 11.667f);
        instancePath.lineTo(27.491f, 11.6678f);
        instancePath.cubicTo(28.2359f, 11.1731f, 28.747f, 10.3545f, 28.8234f, 9.41304f);
        instancePath.lineTo(28.8333f, 9.16699f);
        instancePath.cubicTo(28.8333f, 7.59298f, 27.6211f, 6.30209f, 26.0794f, 6.17694f);
        instancePath.lineTo(25.8333f, 6.16699f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
