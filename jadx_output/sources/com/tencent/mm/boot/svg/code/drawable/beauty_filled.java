package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class beauty_filled extends l95.c {
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
        instancePath.moveTo(21.7243f, 9.65817f);
        instancePath.cubicTo(21.9045f, 10.4094f, 22.0f, 11.1935f, 22.0f, 12.0f);
        instancePath.cubicTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f);
        instancePath.cubicTo(6.47715f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f);
        instancePath.cubicTo(2.0f, 6.47715f, 6.47715f, 2.0f, 12.0f, 2.0f);
        instancePath.cubicTo(14.6271f, 2.0f, 17.0176f, 3.01305f, 18.8022f, 4.66983f);
        instancePath.cubicTo(17.8309f, 5.25504f, 17.2214f, 5.56162f, 16.1484f, 6.08594f);
        instancePath.lineTo(17.7806f, 6.89809f);
        instancePath.cubicTo(17.7806f, 6.89809f, 18.8831f, 7.47706f, 19.2495f, 7.87452f);
        instancePath.cubicTo(19.616f, 8.27198f, 20.1934f, 9.59215f, 20.1934f, 9.59215f);
        instancePath.lineTo(20.974f, 11.4741f);
        instancePath.lineTo(21.7243f, 9.65817f);
        instancePath.close();
        instancePath.moveTo(17.0f, 10.2998f);
        instancePath.cubicTo(17.0f, 9.47138f, 16.3284f, 8.7998f, 15.5f, 8.7998f);
        instancePath.cubicTo(14.6716f, 8.7998f, 14.0f, 9.47138f, 14.0f, 10.2998f);
        instancePath.cubicTo(14.0f, 11.1282f, 14.6716f, 11.7998f, 15.5f, 11.7998f);
        instancePath.cubicTo(16.3284f, 11.7998f, 17.0f, 11.1282f, 17.0f, 10.2998f);
        instancePath.close();
        instancePath.moveTo(8.5f, 8.7998f);
        instancePath.cubicTo(9.32843f, 8.7998f, 10.0f, 9.47138f, 10.0f, 10.2998f);
        instancePath.cubicTo(10.0f, 11.1282f, 9.32843f, 11.7998f, 8.5f, 11.7998f);
        instancePath.cubicTo(7.67157f, 11.7998f, 7.0f, 11.1282f, 7.0f, 10.2998f);
        instancePath.cubicTo(7.0f, 9.47138f, 7.67157f, 8.7998f, 8.5f, 8.7998f);
        instancePath.close();
        instancePath.moveTo(12.0005f, 16.8618f);
        instancePath.cubicTo(10.5023f, 16.8618f, 9.27266f, 15.7119f, 9.14602f, 14.2466f);
        instancePath.lineTo(14.8549f, 14.2466f);
        instancePath.cubicTo(14.7283f, 15.7119f, 13.4986f, 16.8618f, 12.0005f, 16.8618f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(20.9712f, 2.77686f);
        instancePath2.cubicTo(20.9712f, 2.77686f, 21.5732f, 4.26352f, 22.107f, 4.84732f);
        instancePath2.cubicTo(22.6407f, 5.43112f, 24.0f, 6.0896f, 24.0f, 6.0896f);
        instancePath2.cubicTo(24.0f, 6.0896f, 22.6075f, 6.78447f, 22.107f, 7.33188f);
        instancePath2.cubicTo(21.6065f, 7.87928f, 20.9712f, 9.40234f, 20.9712f, 9.40234f);
        instancePath2.cubicTo(20.9712f, 9.40234f, 20.3276f, 7.87029f, 19.8354f, 7.33188f);
        instancePath2.cubicTo(19.3431f, 6.79347f, 17.9424f, 6.0896f, 17.9424f, 6.0896f);
        instancePath2.cubicTo(17.9424f, 6.0896f, 19.3346f, 5.395f, 19.8354f, 4.84732f);
        instancePath2.cubicTo(20.3361f, 4.29964f, 20.9712f, 2.77686f, 20.9712f, 2.77686f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
