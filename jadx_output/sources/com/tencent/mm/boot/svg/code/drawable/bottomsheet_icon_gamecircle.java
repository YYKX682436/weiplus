package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class bottomsheet_icon_gamecircle extends l95.c {
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
        instancePaint3.setColor(-15616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(8.23423f, 11.3848f);
        instancePath.cubicTo(8.50539f, 9.77786f, 9.77613f, 8.51078f, 11.3848f, 8.24492f);
        instancePath.lineTo(11.3848f, 3.58845f);
        instancePath.cubicTo(11.3848f, 3.30604f, 11.156f, 3.07715f, 10.8736f, 3.07715f);
        instancePath.lineTo(10.7532f, 3.07715f);
        instancePath.cubicTo(10.6177f, 3.07715f, 10.4876f, 3.13105f, 10.3917f, 3.22693f);
        instancePath.lineTo(3.22686f, 10.3918f);
        instancePath.cubicTo(3.13098f, 10.4876f, 3.07715f, 10.6177f, 3.07715f, 10.7532f);
        instancePath.lineTo(3.07715f, 10.8736f);
        instancePath.cubicTo(3.07715f, 11.156f, 3.30604f, 11.3848f, 3.58838f, 11.3848f);
        instancePath.lineTo(8.23423f, 11.3848f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-15683841);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(12.4619f, 8.24795f);
        instancePath2.cubicTo(14.0619f, 8.52045f, 15.3239f, 9.78404f, 15.594f, 11.3848f);
        instancePath2.lineTo(20.1732f, 11.3848f);
        instancePath2.cubicTo(20.5025f, 11.3848f, 20.7696f, 11.1179f, 20.7696f, 10.7885f);
        instancePath2.lineTo(20.7696f, 10.7764f);
        instancePath2.cubicTo(20.7696f, 10.6182f, 20.7068f, 10.4665f, 20.5949f, 10.3547f);
        instancePath2.lineTo(13.4921f, 3.25183f);
        instancePath2.cubicTo(13.3802f, 3.13993f, 13.2285f, 3.07715f, 13.0704f, 3.07715f);
        instancePath2.lineTo(13.0583f, 3.07715f);
        instancePath2.cubicTo(12.7289f, 3.07715f, 12.4619f, 3.34414f, 12.4619f, 3.67353f);
        instancePath2.lineTo(12.4619f, 8.24795f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-372399);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(11.3848f, 15.6089f);
        instancePath3.cubicTo(9.77376f, 15.3427f, 8.50169f, 14.0722f, 8.23306f, 12.4619f);
        instancePath3.lineTo(3.67352f, 12.4619f);
        instancePath3.cubicTo(3.34421f, 12.4619f, 3.07715f, 12.7289f, 3.07715f, 13.0583f);
        instancePath3.lineTo(3.07715f, 13.0636f);
        instancePath3.cubicTo(3.07715f, 13.2217f, 3.14f, 13.3734f, 3.25183f, 13.4853f);
        instancePath3.lineTo(10.3615f, 20.5949f);
        instancePath3.cubicTo(10.4733f, 20.7068f, 10.625f, 20.7696f, 10.7832f, 20.7696f);
        instancePath3.lineTo(10.7885f, 20.7696f);
        instancePath3.cubicTo(11.1179f, 20.7696f, 11.3848f, 20.5025f, 11.3848f, 20.1732f);
        instancePath3.lineTo(11.3848f, 15.6089f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16268960);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(15.5952f, 12.4619f);
        instancePath4.cubicTo(15.3275f, 14.0661f, 14.0643f, 15.3329f, 12.4619f, 15.6059f);
        instancePath4.lineTo(12.4619f, 20.1732f);
        instancePath4.cubicTo(12.4619f, 20.5025f, 12.7289f, 20.7696f, 13.0583f, 20.7696f);
        instancePath4.lineTo(13.0757f, 20.7696f);
        instancePath4.cubicTo(13.2338f, 20.7696f, 13.3855f, 20.7068f, 13.4973f, 20.5949f);
        instancePath4.lineTo(20.5949f, 13.4973f);
        instancePath4.cubicTo(20.7068f, 13.3855f, 20.7696f, 13.2338f, 20.7696f, 13.0757f);
        instancePath4.lineTo(20.7696f, 13.0583f);
        instancePath4.cubicTo(20.7696f, 12.7289f, 20.5025f, 12.4619f, 20.1732f, 12.4619f);
        instancePath4.lineTo(15.5952f, 12.4619f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
