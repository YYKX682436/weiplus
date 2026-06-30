package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_transfer extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(22.590546f, 27.0f);
                instancePath.lineTo(60.0f, 27.0f);
                instancePath.lineTo(60.0f, 31.5f);
                instancePath.lineTo(13.496722f, 31.5f);
                instancePath.cubicTo(12.668295f, 31.5f, 11.996722f, 30.828426f, 11.996722f, 30.0f);
                instancePath.cubicTo(11.996722f, 29.56789f, 12.183069f, 29.15677f, 12.508029f, 28.871954f);
                instancePath.lineTo(27.306252f, 15.901824f);
                instancePath.cubicTo(27.804653f, 15.464992f, 28.562809f, 15.514904f, 28.999641f, 16.013306f);
                instancePath.cubicTo(29.36046f, 16.42498f, 29.39694f, 17.028662f, 29.08832f, 17.480791f);
                instancePath.lineTo(22.590546f, 27.0f);
                instancePath.close();
                instancePath.moveTo(49.406178f, 45.0f);
                instancePath.lineTo(11.996722f, 45.0f);
                instancePath.lineTo(11.996722f, 40.5f);
                instancePath.lineTo(53.996723f, 40.5f);
                instancePath.lineTo(58.5f, 40.5f);
                instancePath.cubicTo(59.328426f, 40.5f, 60.0f, 41.171574f, 60.0f, 42.0f);
                instancePath.cubicTo(60.0f, 42.43211f, 59.813652f, 42.84323f, 59.488693f, 43.128044f);
                instancePath.lineTo(44.69047f, 56.098175f);
                instancePath.cubicTo(44.19207f, 56.535007f, 43.433914f, 56.485096f, 42.99708f, 55.986694f);
                instancePath.cubicTo(42.63626f, 55.57502f, 42.59978f, 54.971336f, 42.9084f, 54.51921f);
                instancePath.lineTo(49.406178f, 45.0f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
