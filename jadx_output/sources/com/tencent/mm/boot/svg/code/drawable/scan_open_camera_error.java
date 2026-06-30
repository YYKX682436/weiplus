package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class scan_open_camera_error extends l95.c {
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
        instancePaint3.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(22.8874f, 6.66663f);
        instancePath.cubicTo(23.166f, 6.66663f, 23.4262f, 6.80588f, 23.5807f, 7.03771f);
        instancePath.lineTo(26.6667f, 11.6666f);
        instancePath.lineTo(33.3333f, 11.6666f);
        instancePath.cubicTo(34.2538f, 11.6666f, 35.0f, 12.4128f, 35.0f, 13.3333f);
        instancePath.lineTo(35.0f, 18.2503f);
        instancePath.cubicTo(34.3753f, 17.8568f, 33.7054f, 17.5283f, 33.0f, 17.2744f);
        instancePath.lineTo(33.0f, 13.6666f);
        instancePath.lineTo(25.5963f, 13.6666f);
        instancePath.lineTo(22.263f, 8.66663f);
        instancePath.lineTo(14.4037f, 8.66663f);
        instancePath.lineTo(11.0704f, 13.6666f);
        instancePath.lineTo(3.66667f, 13.6666f);
        instancePath.lineTo(3.66667f, 31.3333f);
        instancePath.lineTo(20.1164f, 31.3333f);
        instancePath.cubicTo(20.447f, 32.0479f, 20.8567f, 32.7183f, 21.3344f, 33.3333f);
        instancePath.lineTo(3.33334f, 33.3333f);
        instancePath.cubicTo(2.41286f, 33.3333f, 1.66667f, 32.5871f, 1.66667f, 31.6666f);
        instancePath.lineTo(1.66667f, 13.3333f);
        instancePath.cubicTo(1.66667f, 12.4128f, 2.41286f, 11.6666f, 3.33334f, 11.6666f);
        instancePath.lineTo(10.0f, 11.6666f);
        instancePath.lineTo(13.0859f, 7.03771f);
        instancePath.cubicTo(13.2405f, 6.80588f, 13.5007f, 6.66663f, 13.7793f, 6.66663f);
        instancePath.lineTo(22.8874f, 6.66663f);
        instancePath.close();
        instancePath.moveTo(24.0431f, 18.2233f);
        instancePath.cubicTo(22.8756f, 16.2915f, 20.7553f, 15.0f, 18.3333f, 15.0f);
        instancePath.cubicTo(14.6514f, 15.0f, 11.6667f, 17.9847f, 11.6667f, 21.6666f);
        instancePath.cubicTo(11.6667f, 25.3485f, 14.6514f, 28.3333f, 18.3333f, 28.3333f);
        instancePath.cubicTo(18.6423f, 28.3333f, 18.9464f, 28.3123f, 19.2441f, 28.2716f);
        instancePath.cubicTo(19.193f, 27.8549f, 19.1667f, 27.4305f, 19.1667f, 27.0f);
        instancePath.cubicTo(19.1667f, 26.7492f, 19.1756f, 26.5005f, 19.1932f, 26.2542f);
        instancePath.cubicTo(18.9145f, 26.3062f, 18.6271f, 26.3333f, 18.3333f, 26.3333f);
        instancePath.cubicTo(15.756f, 26.3333f, 13.6667f, 24.244f, 13.6667f, 21.6666f);
        instancePath.cubicTo(13.6667f, 19.0893f, 15.756f, 17.0f, 18.3333f, 17.0f);
        instancePath.cubicTo(20.1094f, 17.0f, 21.6537f, 17.9921f, 22.4422f, 19.4523f);
        instancePath.cubicTo(22.9334f, 18.9929f, 23.4695f, 18.5808f, 24.0431f, 18.2233f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint4.setColor(-1);
        instancePaint4.setStrokeWidth(2.0f);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(29.5f, 19.58337f);
        instancePath2.cubicTo(33.550087f, 19.58337f, 36.83333f, 22.866613f, 36.83333f, 26.9167f);
        instancePath2.cubicTo(36.83333f, 30.966787f, 33.550087f, 34.25003f, 29.5f, 34.25003f);
        instancePath2.cubicTo(25.449913f, 34.25003f, 22.16667f, 30.966787f, 22.16667f, 26.9167f);
        instancePath2.cubicTo(22.16667f, 22.866613f, 25.449913f, 19.58337f, 29.5f, 19.58337f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(30.6569f, 22.5f);
        instancePath3.lineTo(30.5104f, 28.1667f);
        instancePath3.lineTo(28.6061f, 28.1667f);
        instancePath3.lineTo(28.4596f, 22.5f);
        instancePath3.lineTo(30.6569f, 22.5f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(28.1667f, 30.5119f);
        instancePath4.cubicTo(28.1667f, 31.2931f, 28.777f, 31.9035f, 29.5583f, 31.9035f);
        instancePath4.cubicTo(30.3517f, 31.9035f, 30.9499f, 31.2931f, 30.9499f, 30.5119f);
        instancePath4.cubicTo(30.9499f, 29.7184f, 30.3517f, 29.1203f, 29.5583f, 29.1203f);
        instancePath4.cubicTo(28.777f, 29.1203f, 28.1667f, 29.7184f, 28.1667f, 30.5119f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
