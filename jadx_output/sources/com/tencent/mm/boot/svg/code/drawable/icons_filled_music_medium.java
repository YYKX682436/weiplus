package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_music_medium extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(18.4897f, 7.11079f);
            instancePath.cubicTo(17.0397f, 5.88079f, 14.9497f, 5.88079f, 13.7097f, 4.49079f);
            instancePath.cubicTo(13.3497f, 4.08079f, 13.1297f, 3.58079f, 13.0897f, 3.07079f);
            instancePath.cubicTo(13.0297f, 2.59079f, 12.5197f, 2.48079f, 12.2097f, 2.68079f);
            instancePath.cubicTo(12.1897f, 2.69079f, 12.1697f, 2.70079f, 12.1597f, 2.72079f);
            instancePath.cubicTo(12.1097f, 2.76079f, 12.0697f, 2.81079f, 12.0397f, 2.86079f);
            instancePath.cubicTo(11.8797f, 3.09079f, 11.7897f, 3.46079f, 11.7897f, 4.06079f);
            instancePath.lineTo(11.7897f, 11.8608f);
            instancePath.cubicTo(11.7897f, 15.3408f, 11.0997f, 14.6008f, 8.89969f, 15.1608f);
            instancePath.cubicTo(7.27969f, 15.5708f, 5.92969f, 16.6608f, 5.92969f, 18.3308f);
            instancePath.cubicTo(5.92969f, 20.0008f, 7.40969f, 21.3908f, 9.12969f, 21.3308f);
            instancePath.cubicTo(13.4097f, 21.2008f, 13.2797f, 16.6608f, 13.2797f, 14.9108f);
            instancePath.lineTo(13.2797f, 7.85079f);
            instancePath.cubicTo(13.3397f, 6.49079f, 14.2997f, 6.82079f, 16.1297f, 7.49079f);
            instancePath.cubicTo(16.6597f, 7.70079f, 17.1697f, 7.93079f, 17.6197f, 8.24079f);
            instancePath.cubicTo(19.3997f, 9.45079f, 18.5097f, 11.5908f, 16.8597f, 12.4608f);
            instancePath.cubicTo(16.6597f, 12.5708f, 16.7697f, 12.8708f, 16.9897f, 12.8308f);
            instancePath.cubicTo(19.5197f, 12.3908f, 20.9597f, 9.01079f, 18.4897f, 7.11079f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
