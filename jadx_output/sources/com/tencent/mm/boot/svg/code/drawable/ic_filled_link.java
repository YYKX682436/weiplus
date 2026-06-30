package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ic_filled_link extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(16.2427f, 10.5858f);
        instancePath.lineTo(17.6569f, 12.0f);
        instancePath.lineTo(19.7782f, 9.87867f);
        instancePath.cubicTo(21.3403f, 8.31658f, 21.3403f, 5.78392f, 19.7782f, 4.22182f);
        instancePath.cubicTo(18.2161f, 2.65972f, 15.6835f, 2.65972f, 14.1214f, 4.22182f);
        instancePath.lineTo(9.87873f, 8.46446f);
        instancePath.cubicTo(8.31663f, 10.0266f, 8.31663f, 12.5592f, 9.87873f, 14.1213f);
        instancePath.lineTo(11.2929f, 12.7071f);
        instancePath.cubicTo(10.5119f, 11.9261f, 10.5119f, 10.6597f, 11.2929f, 9.87867f);
        instancePath.lineTo(15.5356f, 5.63603f);
        instancePath.cubicTo(16.3166f, 4.85498f, 17.583f, 4.85498f, 18.364f, 5.63603f);
        instancePath.cubicTo(19.1451f, 6.41708f, 19.1451f, 7.68341f, 18.364f, 8.46446f);
        instancePath.lineTo(16.2427f, 10.5858f);
        instancePath.close();
        instancePath.moveTo(7.7574f, 13.4142f);
        instancePath.lineTo(6.34319f, 12.0f);
        instancePath.lineTo(4.22187f, 14.1213f);
        instancePath.cubicTo(2.65977f, 15.6834f, 2.65977f, 18.2161f, 4.22187f, 19.7782f);
        instancePath.cubicTo(5.78396f, 21.3403f, 8.31662f, 21.3403f, 9.87872f, 19.7782f);
        instancePath.lineTo(14.1214f, 15.5355f);
        instancePath.cubicTo(15.6835f, 13.9734f, 15.6835f, 11.4408f, 14.1214f, 9.87869f);
        instancePath.lineTo(12.7071f, 11.2929f);
        instancePath.cubicTo(13.4882f, 12.0739f, 13.4882f, 13.3403f, 12.7071f, 14.1213f);
        instancePath.lineTo(8.46451f, 18.364f);
        instancePath.cubicTo(7.68346f, 19.145f, 6.41713f, 19.145f, 5.63608f, 18.364f);
        instancePath.cubicTo(4.85503f, 17.5829f, 4.85503f, 16.3166f, 5.63608f, 15.5355f);
        instancePath.lineTo(7.7574f, 13.4142f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
