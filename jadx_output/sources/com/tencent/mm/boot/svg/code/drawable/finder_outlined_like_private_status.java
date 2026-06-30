package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_outlined_like_private_status extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(22.0f, 20.8f);
        instancePath.lineTo(22.0f, 22.0f);
        instancePath.lineTo(15.5f, 22.0f);
        instancePath.lineTo(15.5f, 20.8f);
        instancePath.lineTo(22.0f, 20.8f);
        instancePath.close();
        instancePath.moveTo(11.290586f, 6.064466f);
        instancePath.lineTo(11.676765f, 6.4416356f);
        instancePath.lineTo(11.997693f, 6.7465453f);
        instancePath.lineTo(12.460042f, 6.3052197f);
        instancePath.lineTo(12.704801f, 6.064466f);
        instancePath.cubicTo(14.657422f, 4.1118445f, 17.823246f, 4.1118445f, 19.775867f, 6.064466f);
        instancePath.cubicTo(21.710327f, 7.9989243f, 21.728321f, 11.124121f, 19.829851f, 13.080731f);
        instancePath.lineTo(19.009f, 13.9f);
        instancePath.lineTo(17.313f, 13.9f);
        instancePath.lineTo(18.968624f, 12.245095f);
        instancePath.cubicTo(20.362944f, 10.808074f, 20.395308f, 8.544291f, 19.07408f, 7.0680733f);
        instancePath.lineTo(18.92734f, 6.9129944f);
        instancePath.cubicTo(17.443348f, 5.429002f, 15.03732f, 5.429002f, 13.5533285f, 6.9129944f);
        instancePath.lineTo(13.151276f, 7.3057504f);
        instancePath.lineTo(11.997693f, 8.395275f);
        instancePath.lineTo(10.697619f, 7.164419f);
        instancePath.lineTo(10.442059f, 6.9129944f);
        instancePath.cubicTo(8.958066f, 5.429002f, 6.552039f, 5.429002f, 5.068047f, 6.9129944f);
        instancePath.cubicTo(3.6501608f, 8.33088f, 3.5854633f, 10.594131f, 4.870776f, 12.076815f);
        instancePath.lineTo(5.013654f, 12.232613f);
        instancePath.lineTo(11.996f, 19.218f);
        instancePath.lineTo(13.999f, 17.214f);
        instancePath.lineTo(13.999f, 18.911f);
        instancePath.lineTo(12.704763f, 20.206564f);
        instancePath.cubicTo(12.344332f, 20.567102f, 11.777105f, 20.594864f, 11.384798f, 20.28986f);
        instancePath.lineTo(11.290586f, 20.206602f);
        instancePath.lineTo(4.165126f, 13.081141f);
        instancePath.cubicTo(2.2670662f, 11.124121f, 2.2850606f, 7.9989243f, 4.2195187f, 6.064466f);
        instancePath.cubicTo(6.17214f, 4.1118445f, 9.337965f, 4.1118445f, 11.290586f, 6.064466f);
        instancePath.close();
        instancePath.moveTo(22.0f, 18.1f);
        instancePath.lineTo(22.0f, 19.3f);
        instancePath.lineTo(15.5f, 19.3f);
        instancePath.lineTo(15.5f, 18.1f);
        instancePath.lineTo(22.0f, 18.1f);
        instancePath.close();
        instancePath.moveTo(22.0f, 15.4f);
        instancePath.lineTo(22.0f, 16.6f);
        instancePath.lineTo(15.5f, 16.6f);
        instancePath.lineTo(15.5f, 15.4f);
        instancePath.lineTo(22.0f, 15.4f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
