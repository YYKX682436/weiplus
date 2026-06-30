package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_follow extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
        }
        if (i17 == 2) {
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
            instancePaint3.setColor(-16777216);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(50.244003f, 56.653404f);
            instancePath.lineTo(64.84218f, 42.055225f);
            instancePath.lineTo(68.51913f, 45.732174f);
            instancePath.lineTo(51.608696f, 62.637745f);
            instancePath.cubicTo(50.98391f, 63.262634f, 50.01399f, 63.331936f, 49.312534f, 62.84585f);
            instancePath.lineTo(49.06327f, 62.63722f);
            instancePath.lineTo(49.06327f, 62.63722f);
            instancePath.lineTo(40.614532f, 54.18394f);
            instancePath.lineTo(44.194534f, 50.60394f);
            instancePath.lineTo(50.244003f, 56.653404f);
            instancePath.close();
            instancePath.moveTo(35.7f, 9.0f);
            instancePath.cubicTo(42.327415f, 9.0f, 47.7f, 14.378941f, 47.7f, 21.000622f);
            instancePath.lineTo(47.7f, 26.130558f);
            instancePath.cubicTo(47.7f, 29.547888f, 45.902798f, 34.44858f, 43.70426f, 37.054718f);
            instancePath.lineTo(42.619663f, 38.340397f);
            instancePath.cubicTo(41.160698f, 40.06985f, 41.281265f, 42.18849f, 42.756573f, 43.554497f);
            instancePath.lineTo(36.37303f, 49.94016f);
            instancePath.cubicTo(34.03147f, 52.284f, 34.030964f, 56.08211f, 36.37189f, 58.42658f);
            instancePath.lineTo(40.941f, 63.0f);
            instancePath.lineTo(10.2042885f, 63.0f);
            instancePath.cubicTo(8.545066f, 63.0f, 7.2f, 61.667267f, 7.2f, 60.004684f);
            instancePath.lineTo(7.2f, 57.94639f);
            instancePath.cubicTo(7.2f, 55.891125f, 8.694452f, 53.495724f, 10.542293f, 52.593998f);
            instancePath.lineTo(27.523352f, 44.30743f);
            instancePath.cubicTo(29.986132f, 43.10562f, 30.558777f, 40.443787f, 28.780336f, 38.33592f);
            instancePath.lineTo(27.695738f, 37.050415f);
            instancePath.cubicTo(25.488953f, 34.434856f, 23.7f, 29.548489f, 23.7f, 26.127872f);
            instancePath.lineTo(23.7f, 20.998741f);
            instancePath.cubicTo(23.7f, 14.37202f, 29.08607f, 9.0f, 35.7f, 9.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
