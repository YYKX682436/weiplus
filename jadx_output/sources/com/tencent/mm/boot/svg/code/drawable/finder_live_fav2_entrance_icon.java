package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_fav2_entrance_icon extends l95.c {
    private final int width = 18;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 18;
        }
        if (i17 == 1) {
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
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(1.03973f, 15.9425f);
        instancePath.cubicTo(0.752713f, 15.9425f, 0.478466f, 15.8238f, 0.281947f, 15.6146f);
        instancePath.cubicTo(0.0854294f, 15.4055f, -0.0158765f, 15.1243f, 0.0020269f, 14.8379f);
        instancePath.lineTo(0.868465f, 0.97487f);
        instancePath.cubicTo(0.902713f, 0.426898f, 1.35713f, 0.0f, 1.90617f, 0.0f);
        instancePath.lineTo(13.1699f, 0.0f);
        instancePath.cubicTo(13.7189f, 0.0f, 14.1733f, 0.426898f, 14.2076f, 0.97487f);
        instancePath.lineTo(14.5365f, 6.23852f);
        instancePath.lineTo(13.4948f, 6.23852f);
        instancePath.lineTo(13.1699f, 1.03973f);
        instancePath.lineTo(1.90617f, 1.03973f);
        instancePath.lineTo(1.03973f, 14.9027f);
        instancePath.lineTo(8.69921f, 14.9027f);
        instancePath.lineTo(8.69921f, 15.9425f);
        instancePath.lineTo(1.03973f, 15.9425f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(7.53818f, 6.75839f);
        instancePath2.cubicTo(5.33699f, 6.75839f, 3.55257f, 4.97397f, 3.55257f, 2.77277f);
        instancePath2.lineTo(4.59229f, 2.77277f);
        instancePath2.cubicTo(4.59229f, 4.39974f, 5.91121f, 5.71866f, 7.53818f, 5.71866f);
        instancePath2.cubicTo(9.16515f, 5.71866f, 10.4841f, 4.39974f, 10.4841f, 2.77277f);
        instancePath2.lineTo(11.5238f, 2.77277f);
        instancePath2.cubicTo(11.5238f, 4.97397f, 9.73938f, 6.75839f, 7.53818f, 6.75839f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-436207616);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(15.1029f, 9.21999f);
        instancePath3.cubicTo(15.134f, 8.08786f, 14.2738f, 7.33056f, 13.4635f, 7.46947f);
        instancePath3.cubicTo(12.9127f, 7.56389f, 12.7328f, 8.08014f, 12.6728f, 8.32686f);
        instancePath3.cubicTo(12.6011f, 8.62126f, 12.5995f, 8.92887f, 12.5995f, 9.06176f);
        instancePath3.cubicTo(12.5995f, 9.19967f, 12.5512f, 9.50404f, 12.1347f, 10.3729f);
        instancePath3.cubicTo(12.0516f, 10.5462f, 11.9014f, 10.6628f, 11.7135f, 10.7346f);
        instancePath3.cubicTo(11.5158f, 10.8101f, 11.3277f, 10.815f, 11.2551f, 10.8038f);
        instancePath3.cubicTo(11.2288f, 10.7997f, 11.2023f, 10.7977f, 11.1756f, 10.7977f);
        instancePath3.lineTo(10.5652f, 10.7977f);
        instancePath3.cubicTo(10.2036f, 10.7977f, 9.91039f, 11.0909f, 9.91039f, 11.4525f);
        instancePath3.lineTo(9.91039f, 15.3462f);
        instancePath3.cubicTo(9.91039f, 15.7078f, 10.2036f, 16.001f, 10.5652f, 16.001f);
        instancePath3.lineTo(15.9094f, 16.001f);
        instancePath3.cubicTo(16.4728f, 16.001f, 16.9597f, 15.6073f, 17.0777f, 15.0564f);
        instancePath3.lineTo(17.7376f, 11.9739f);
        instancePath3.cubicTo(17.9149f, 11.1461f, 17.2838f, 10.3657f, 16.4373f, 10.3657f);
        instancePath3.lineTo(15.0535f, 10.3657f);
        instancePath3.cubicTo(15.0721f, 10.038f, 15.0918f, 9.62758f, 15.1029f, 9.21999f);
        instancePath3.close();
        instancePath3.moveTo(13.683f, 8.57277f);
        instancePath3.cubicTo(13.6894f, 8.5464f, 13.6959f, 8.52472f, 13.702f, 8.50718f);
        instancePath3.cubicTo(13.8244f, 8.54848f, 14.077f, 8.7034f, 14.0636f, 9.19151f);
        instancePath3.cubicTo(14.0447f, 9.88222f, 14.0004f, 10.585f, 13.9809f, 10.8469f);
        instancePath3.cubicTo(13.9701f, 10.9911f, 14.0199f, 11.1333f, 14.1182f, 11.2392f);
        instancePath3.cubicTo(14.2166f, 11.3452f, 14.3547f, 11.4054f, 14.4993f, 11.4054f);
        instancePath3.lineTo(16.4373f, 11.4054f);
        instancePath3.cubicTo(16.622f, 11.4054f, 16.7596f, 11.5757f, 16.721f, 11.7562f);
        instancePath3.lineTo(16.061f, 14.8387f);
        instancePath3.cubicTo(16.0457f, 14.9102f, 15.9825f, 14.9613f, 15.9094f, 14.9613f);
        instancePath3.lineTo(10.9501f, 14.9613f);
        instancePath3.lineTo(10.9501f, 11.8374f);
        instancePath3.lineTo(11.1409f, 11.8374f);
        instancePath3.cubicTo(11.4005f, 11.8683f, 11.7496f, 11.8338f, 12.0844f, 11.7059f);
        instancePath3.cubicTo(12.4487f, 11.5668f, 12.8444f, 11.2975f, 13.0722f, 10.8224f);
        instancePath3.cubicTo(13.4956f, 9.93935f, 13.6393f, 9.45181f, 13.6393f, 9.06176f);
        instancePath3.cubicTo(13.6393f, 8.93068f, 13.6437f, 8.73433f, 13.683f, 8.57277f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
