package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class live_announce_icon extends l95.c {
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
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(20.2716f, 18.7008f);
        instancePath.cubicTo(20.085f, 18.7008f, 19.8997f, 18.6703f, 19.7228f, 18.6103f);
        instancePath.lineTo(13.4135f, 16.4216f);
        instancePath.lineTo(14.9814f, 19.4379f);
        instancePath.cubicTo(15.4255f, 20.2924f, 15.1006f, 21.3492f, 14.2557f, 21.7984f);
        instancePath.cubicTo(14.0076f, 21.9302f, 13.7316f, 21.9991f, 13.4515f, 21.9991f);
        instancePath.lineTo(10.8165f, 21.9991f);
        instancePath.cubicTo(10.11f, 21.9991f, 9.47469f, 21.5643f, 9.21201f, 20.9011f);
        instancePath.lineTo(6.91156f, 15.0945f);
        instancePath.lineTo(6.69136f, 15.0945f);
        instancePath.lineTo(6.69136f, 15.0946f);
        instancePath.cubicTo(4.10039f, 15.0946f, 2.0f, 12.9705f, 2.0f, 10.3502f);
        instancePath.cubicTo(2.0f, 7.72996f, 4.10039f, 5.60583f, 6.69136f, 5.60583f);
        instancePath.lineTo(6.69136f, 5.60577f);
        instancePath.lineTo(9.58808f, 5.60577f);
        instancePath.lineTo(19.7228f, 2.08996f);
        instancePath.cubicTo(20.6279f, 1.78342f, 21.6074f, 2.27699f, 21.9105f, 3.19239f);
        instancePath.cubicTo(21.9698f, 3.3713f, 22.0f, 3.55874f, 22.0f, 3.74743f);
        instancePath.lineTo(22.0f, 16.9529f);
        instancePath.cubicTo(22.0f, 17.9182f, 21.2262f, 18.7008f, 20.2716f, 18.7008f);
        instancePath.close();
        instancePath.moveTo(9.58808f, 15.0945f);
        instancePath.lineTo(11.3717f, 15.7133f);
        instancePath.lineTo(13.67f, 20.135f);
        instancePath.cubicTo(13.7335f, 20.257f, 13.687f, 20.408f, 13.5663f, 20.4722f);
        instancePath.cubicTo(13.5309f, 20.491f, 13.4915f, 20.5009f, 13.4515f, 20.5009f);
        instancePath.lineTo(10.8165f, 20.5009f);
        instancePath.cubicTo(10.7156f, 20.5009f, 10.6248f, 20.4388f, 10.5873f, 20.344f);
        instancePath.lineTo(8.50814f, 15.0945f);
        instancePath.lineTo(9.58808f, 15.0945f);
        instancePath.close();
        instancePath.moveTo(6.69136f, 7.104f);
        instancePath.lineTo(6.69136f, 7.10406f);
        instancePath.cubicTo(4.91859f, 7.10406f, 3.48148f, 8.55741f, 3.48148f, 10.3502f);
        instancePath.cubicTo(3.48148f, 12.143f, 4.91859f, 13.5964f, 6.69136f, 13.5964f);
        instancePath.lineTo(6.69136f, 13.5963f);
        instancePath.lineTo(8.37032f, 13.5963f);
        instancePath.lineTo(8.37032f, 7.104f);
        instancePath.lineTo(6.69136f, 7.104f);
        instancePath.close();
        instancePath.moveTo(9.8518f, 7.09628f);
        instancePath.lineTo(20.1932f, 3.51065f);
        instancePath.cubicTo(20.3225f, 3.46685f, 20.4624f, 3.53737f, 20.5057f, 3.66814f);
        instancePath.cubicTo(20.5142f, 3.6937f, 20.5185f, 3.72047f, 20.5185f, 3.74743f);
        instancePath.lineTo(20.5185f, 16.9529f);
        instancePath.cubicTo(20.5185f, 17.0908f, 20.408f, 17.2026f, 20.2716f, 17.2026f);
        instancePath.cubicTo(20.245f, 17.2026f, 20.2185f, 17.1982f, 20.1932f, 17.1897f);
        instancePath.lineTo(9.8518f, 13.604f);
        instancePath.lineTo(9.8518f, 7.09628f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
