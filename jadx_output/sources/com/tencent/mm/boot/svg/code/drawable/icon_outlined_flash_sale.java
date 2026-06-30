package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_outlined_flash_sale extends l95.c {
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
        instancePath.moveTo(11.6775f, 10.7633f);
        instancePath.cubicTo(11.8575f, 10.476f, 12.2416f, 10.3858f, 12.5354f, 10.5618f);
        instancePath.cubicTo(12.7998f, 10.7202f, 12.9009f, 11.0403f, 12.7873f, 11.3121f);
        instancePath.lineTo(12.7414f, 11.4007f);
        instancePath.lineTo(11.8921f, 13.3197f);
        instancePath.lineTo(13.7521f, 13.3199f);
        instancePath.cubicTo(14.2113f, 13.3199f, 14.5018f, 13.7823f, 14.3242f, 14.1741f);
        instancePath.lineTo(14.2789f, 14.2568f);
        instancePath.lineTo(12.1682f, 17.509f);
        instancePath.cubicTo(11.9836f, 17.7934f, 11.5981f, 17.8777f, 11.3072f, 17.6972f);
        instancePath.cubicTo(11.0454f, 17.5347f, 10.9494f, 17.2131f, 11.0674f, 16.9431f);
        instancePath.lineTo(11.1147f, 16.8552f);
        instancePath.lineTo(12.1682f, 14.5397f);
        instancePath.lineTo(10.4248f, 14.54f);
        instancePath.cubicTo(9.96983f, 14.54f, 9.67891f, 14.085f, 9.84923f, 13.6939f);
        instancePath.lineTo(9.89289f, 13.6113f);
        instancePath.lineTo(11.6775f, 10.7633f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(7.5f, 6.5f);
        instancePath2.cubicTo(7.5f, 4.01472f, 9.51472f, 2.0f, 12.0f, 2.0f);
        instancePath2.cubicTo(14.4853f, 2.0f, 16.5f, 4.01472f, 16.5f, 6.5f);
        instancePath2.lineTo(16.5f, 7.0f);
        instancePath2.lineTo(18.9991f, 7.0f);
        instancePath2.cubicTo(19.5485f, 7.0f, 20.0f, 7.44551f, 20.0f, 8.00748f);
        instancePath2.lineTo(20.0f, 20.0081f);
        instancePath2.cubicTo(20.0f, 21.1079f, 19.1058f, 22.0f, 18.0059f, 22.0f);
        instancePath2.lineTo(5.99406f, 22.0f);
        instancePath2.cubicTo(4.89267f, 22.0f, 4.0f, 21.1065f, 4.0f, 20.0081f);
        instancePath2.lineTo(4.0f, 8.00748f);
        instancePath2.cubicTo(4.0f, 7.44506f, 4.4506f, 7.0f, 5.00087f, 7.0f);
        instancePath2.lineTo(7.5f, 7.0f);
        instancePath2.lineTo(7.5f, 6.5f);
        instancePath2.close();
        instancePath2.moveTo(12.0f, 3.2f);
        instancePath2.cubicTo(10.1775f, 3.2f, 8.7f, 4.67746f, 8.7f, 6.5f);
        instancePath2.lineTo(8.7f, 7.0f);
        instancePath2.lineTo(15.3f, 7.0f);
        instancePath2.lineTo(15.3f, 6.5f);
        instancePath2.cubicTo(15.3f, 4.67746f, 13.8225f, 3.2f, 12.0f, 3.2f);
        instancePath2.close();
        instancePath2.moveTo(5.2f, 20.0081f);
        instancePath2.lineTo(5.2f, 8.2f);
        instancePath2.lineTo(18.8f, 8.2f);
        instancePath2.lineTo(18.8f, 20.0081f);
        instancePath2.cubicTo(18.8f, 20.4436f, 18.4446f, 20.8f, 18.0059f, 20.8f);
        instancePath2.lineTo(5.99406f, 20.8f);
        instancePath2.cubicTo(5.55493f, 20.8f, 5.2f, 20.4433f, 5.2f, 20.0081f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
