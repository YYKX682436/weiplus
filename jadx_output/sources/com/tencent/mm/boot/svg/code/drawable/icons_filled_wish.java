package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_wish extends l95.c {
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
        instancePath.moveTo(14.7895f, 7.57559f);
        instancePath.lineTo(18.1459f, 8.72176f);
        instancePath.lineTo(19.2921f, 12.0782f);
        instancePath.cubicTo(19.3167f, 12.1504f, 19.4189f, 12.1504f, 19.4435f, 12.0782f);
        instancePath.lineTo(20.5897f, 8.72176f);
        instancePath.lineTo(23.9461f, 7.57559f);
        instancePath.cubicTo(24.0183f, 7.55093f, 24.0183f, 7.44883f, 23.9461f, 7.42417f);
        instancePath.lineTo(20.5897f, 6.278f);
        instancePath.lineTo(19.4435f, 2.92158f);
        instancePath.cubicTo(19.4189f, 2.84938f, 19.3167f, 2.84938f, 19.2921f, 2.92158f);
        instancePath.lineTo(18.1459f, 6.278f);
        instancePath.lineTo(14.7895f, 7.42417f);
        instancePath.cubicTo(14.7173f, 7.44883f, 14.7173f, 7.55093f, 14.7895f, 7.57559f);
        instancePath.close();
        instancePath.moveTo(16.8677f, 9.91816f);
        instancePath.lineTo(18.3507f, 14.2611f);
        instancePath.lineTo(11.9215f, 20.6689f);
        instancePath.cubicTo(11.4779f, 21.111f, 10.7586f, 21.111f, 10.3149f, 20.6689f);
        instancePath.lineTo(2.22012f, 12.6021f);
        instancePath.cubicTo(0.063854f, 10.3865f, 0.084296f, 6.84844f, 2.28191f, 4.65842f);
        instancePath.cubicTo(4.50016f, 2.44784f, 8.09665f, 2.44784f, 10.3149f, 4.65842f);
        instancePath.lineTo(10.5929f, 4.93098f);
        instancePath.lineTo(11.1182f, 5.43061f);
        instancePath.lineTo(11.6434f, 4.93098f);
        instancePath.lineTo(11.9215f, 4.65842f);
        instancePath.cubicTo(13.433f, 3.15211f, 15.5845f, 2.67222f, 17.5038f, 3.21873f);
        instancePath.lineTo(16.8677f, 5.08154f);
        instancePath.lineTo(12.5572f, 6.5535f);
        instancePath.cubicTo(11.6548f, 6.86168f, 11.6548f, 8.13802f, 12.5572f, 8.44619f);
        instancePath.lineTo(16.8677f, 9.91816f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
