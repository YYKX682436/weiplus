package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_add_friends extends l95.c {
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
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(56.24998f, 32.25f);
                instancePath.lineTo(56.24998f, 24.0f);
                instancePath.lineTo(60.74998f, 24.0f);
                instancePath.lineTo(60.74998f, 32.25f);
                instancePath.lineTo(69.0f, 32.25f);
                instancePath.lineTo(69.0f, 36.75f);
                instancePath.lineTo(60.74998f, 36.75f);
                instancePath.lineTo(60.74998f, 45.0f);
                instancePath.lineTo(56.24998f, 45.0f);
                instancePath.lineTo(56.24998f, 36.75f);
                instancePath.lineTo(48.0f, 36.75f);
                instancePath.lineTo(48.0f, 34.5f);
                instancePath.lineTo(48.0f, 32.25f);
                instancePath.close();
                instancePath.moveTo(23.495739f, 37.050415f);
                instancePath.cubicTo(21.288954f, 34.434856f, 19.5f, 29.54849f, 19.5f, 26.127872f);
                instancePath.lineTo(19.5f, 20.998741f);
                instancePath.cubicTo(19.5f, 14.372019f, 24.886068f, 9.0f, 31.5f, 9.0f);
                instancePath.cubicTo(38.12742f, 9.0f, 43.5f, 14.378941f, 43.5f, 21.000622f);
                instancePath.lineTo(43.5f, 26.130556f);
                instancePath.cubicTo(43.5f, 29.547886f, 41.702797f, 34.448578f, 39.50426f, 37.054718f);
                instancePath.lineTo(38.419662f, 38.340397f);
                instancePath.cubicTo(36.651096f, 40.43685f, 37.20356f, 43.10519f, 39.676647f, 44.31153f);
                instancePath.lineTo(56.657707f, 52.594673f);
                instancePath.cubicTo(58.503605f, 53.49508f, 60.0f, 55.87551f, 60.0f, 57.946392f);
                instancePath.lineTo(60.0f, 60.00469f);
                instancePath.cubicTo(60.0f, 61.658955f, 58.647224f, 63.000004f, 56.995712f, 63.000004f);
                instancePath.lineTo(6.0042915f, 63.000004f);
                instancePath.cubicTo(4.345069f, 63.000004f, 3.0000026f, 61.66727f, 3.0000026f, 60.00469f);
                instancePath.lineTo(3.0000026f, 57.946392f);
                instancePath.cubicTo(3.0000026f, 55.891125f, 4.4944553f, 53.495728f, 6.3422956f, 52.594f);
                instancePath.lineTo(23.323357f, 44.307434f);
                instancePath.cubicTo(25.786137f, 43.105625f, 26.358782f, 40.443794f, 24.58034f, 38.335922f);
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
