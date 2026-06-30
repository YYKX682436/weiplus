package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_recommend_group extends l95.c {
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
        instancePath.moveTo(5.14874f, 20.7875f);
        instancePath.cubicTo(5.43047f, 17.3729f, 7.21756f, 14.3837f, 9.84752f, 12.4864f);
        instancePath.lineTo(9.14544f, 11.5132f);
        instancePath.cubicTo(6.24157f, 13.6082f, 4.26444f, 16.9116f, 3.9528f, 20.6888f);
        instancePath.lineTo(5.14874f, 20.7875f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(11.4626f, 16.3013f);
        instancePath2.lineTo(11.7641f, 15.7825f);
        instancePath2.lineTo(10.7267f, 15.1795f);
        instancePath2.lineTo(10.4251f, 15.6982f);
        instancePath2.cubicTo(9.68687f, 16.9682f, 9.20472f, 18.4058f, 9.04964f, 19.9396f);
        instancePath2.lineTo(8.98928f, 20.5366f);
        instancePath2.lineTo(10.1832f, 20.6573f);
        instancePath2.lineTo(10.2435f, 20.0604f);
        instancePath2.cubicTo(10.381f, 18.7006f, 10.8082f, 17.427f, 11.4626f, 16.3013f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-436207616);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(9.88494f, 7.09258f);
        instancePath3.lineTo(13.2318f, 6.22182f);
        instancePath3.lineTo(13.9852f, 2.8466f);
        instancePath3.cubicTo(14.179f, 1.97846f, 15.3248f, 1.77643f, 15.8038f, 2.52593f);
        instancePath3.lineTo(17.6662f, 5.43991f);
        instancePath3.lineTo(21.1091f, 5.11347f);
        instancePath3.cubicTo(21.9946f, 5.0295f, 22.5408f, 6.05677f, 21.976f, 6.74395f);
        instancePath3.lineTo(19.7802f, 9.41566f);
        instancePath3.lineTo(21.1545f, 12.5891f);
        instancePath3.cubicTo(21.508f, 13.4054f, 20.6998f, 14.2423f, 19.8717f, 13.9175f);
        instancePath3.lineTo(16.6522f, 12.6547f);
        instancePath3.lineTo(14.0588f, 14.9425f);
        instancePath3.cubicTo(13.3917f, 15.5309f, 12.346f, 15.0209f, 12.3991f, 14.133f);
        instancePath3.lineTo(12.6051f, 10.6808f);
        instancePath3.lineTo(9.62794f, 8.92125f);
        instancePath3.cubicTo(8.86218f, 8.46868f, 9.0241f, 7.31655f, 9.88494f, 7.09258f);
        instancePath3.close();
        instancePath3.moveTo(15.0517f, 3.57734f);
        instancePath3.lineTo(17.0498f, 6.70374f);
        instancePath3.lineTo(20.7436f, 6.3535f);
        instancePath3.lineTo(18.3877f, 9.21997f);
        instancePath3.lineTo(19.8623f, 12.6248f);
        instancePath3.lineTo(16.4081f, 11.2699f);
        instancePath3.lineTo(13.6256f, 13.7245f);
        instancePath3.lineTo(13.8467f, 10.0207f);
        instancePath3.lineTo(10.6525f, 8.13285f);
        instancePath3.lineTo(14.2433f, 7.1986f);
        instancePath3.lineTo(15.0517f, 3.57734f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-436207616);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(7.44693f, 10.5497f);
        instancePath4.cubicTo(5.6817f, 11.3216f, 4.14894f, 12.5282f, 2.98459f, 14.0346f);
        instancePath4.lineTo(2.03516f, 13.3007f);
        instancePath4.cubicTo(3.32106f, 11.6371f, 5.01423f, 10.3038f, 6.96615f, 9.45023f);
        instancePath4.lineTo(7.44693f, 10.5497f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
