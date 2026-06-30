package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class settings extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        instancePath.moveTo(56.9808f, 48.6911f);
        instancePath.cubicTo(57.2902f, 48.5125f, 57.4808f, 48.1823f, 57.4808f, 47.8251f);
        instancePath.lineTo(57.4808f, 24.1759f);
        instancePath.cubicTo(57.4808f, 23.8186f, 57.2902f, 23.4885f, 56.9808f, 23.3099f);
        instancePath.lineTo(36.5f, 11.4853f);
        instancePath.cubicTo(36.1906f, 11.3067f, 35.8094f, 11.3067f, 35.5f, 11.4853f);
        instancePath.lineTo(15.0193f, 23.3099f);
        instancePath.cubicTo(14.7099f, 23.4885f, 14.5193f, 23.8186f, 14.5193f, 24.1759f);
        instancePath.lineTo(14.5193f, 47.8251f);
        instancePath.cubicTo(14.5193f, 48.1823f, 14.7099f, 48.5125f, 15.0193f, 48.6911f);
        instancePath.lineTo(35.5f, 60.5157f);
        instancePath.cubicTo(35.8094f, 60.6943f, 36.1906f, 60.6943f, 36.5f, 60.5157f);
        instancePath.lineTo(56.9808f, 48.6911f);
        instancePath.close();
        instancePath.moveTo(35.5f, 65.7118f);
        instancePath.cubicTo(35.8094f, 65.8905f, 36.1906f, 65.8905f, 36.5f, 65.7118f);
        instancePath.lineTo(61.4808f, 51.2892f);
        instancePath.cubicTo(61.7902f, 51.1105f, 61.9808f, 50.7804f, 61.9808f, 50.4231f);
        instancePath.lineTo(61.9808f, 21.5778f);
        instancePath.cubicTo(61.9808f, 21.2206f, 61.7902f, 20.8904f, 61.4808f, 20.7118f);
        instancePath.lineTo(36.5f, 6.28916f);
        instancePath.cubicTo(36.1906f, 6.11053f, 35.8094f, 6.11053f, 35.5f, 6.28916f);
        instancePath.lineTo(10.5193f, 20.7118f);
        instancePath.cubicTo(10.2099f, 20.8904f, 10.0193f, 21.2206f, 10.0193f, 21.5778f);
        instancePath.lineTo(10.0193f, 50.4231f);
        instancePath.cubicTo(10.0193f, 50.7804f, 10.2099f, 51.1105f, 10.5193f, 51.2892f);
        instancePath.lineTo(35.5f, 65.7118f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(36.0f, 43.5f);
        instancePath2.cubicTo(40.1421f, 43.5f, 43.5f, 40.1421f, 43.5f, 36.0f);
        instancePath2.cubicTo(43.5f, 31.8579f, 40.1421f, 28.5f, 36.0f, 28.5f);
        instancePath2.cubicTo(31.8579f, 28.5f, 28.5f, 31.8579f, 28.5f, 36.0f);
        instancePath2.cubicTo(28.5f, 40.1421f, 31.8579f, 43.5f, 36.0f, 43.5f);
        instancePath2.close();
        instancePath2.moveTo(36.0f, 48.0f);
        instancePath2.cubicTo(42.6274f, 48.0f, 48.0f, 42.6274f, 48.0f, 36.0f);
        instancePath2.cubicTo(48.0f, 29.3726f, 42.6274f, 24.0f, 36.0f, 24.0f);
        instancePath2.cubicTo(29.3726f, 24.0f, 24.0f, 29.3726f, 24.0f, 36.0f);
        instancePath2.cubicTo(24.0f, 42.6274f, 29.3726f, 48.0f, 36.0f, 48.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
