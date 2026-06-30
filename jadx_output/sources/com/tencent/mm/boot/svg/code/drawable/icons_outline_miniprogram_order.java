package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outline_miniprogram_order extends l95.c {
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
        android.graphics.Matrix instanceMatrix = l95.c.instanceMatrix(looper);
        float[] instanceMatrixArray = l95.c.instanceMatrixArray(looper);
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(56.30078f, 5.144531f);
        instancePath.cubicTo(59.44922f, 5.144531f, 61.527344f, 7.042969f, 61.703125f, 10.085938f);
        instancePath.lineTo(61.714844f, 10.507812f);
        instancePath.lineTo(61.710938f, 24.371094f);
        instancePath.lineTo(58.11328f, 27.96875f);
        instancePath.lineTo(58.11328f, 10.507812f);
        instancePath.cubicTo(58.11328f, 9.328125f, 57.695312f, 8.820312f, 56.589844f, 8.75f);
        instancePath.lineTo(56.30078f, 8.742188f);
        instancePath.lineTo(15.699219f, 8.742188f);
        instancePath.cubicTo(14.476562f, 8.742188f, 13.964844f, 9.15625f, 13.894531f, 10.226562f);
        instancePath.lineTo(13.886719f, 10.507812f);
        instancePath.lineTo(13.886719f, 61.492188f);
        instancePath.cubicTo(13.886719f, 62.671875f, 14.304688f, 63.179688f, 15.410156f, 63.25f);
        instancePath.lineTo(15.699219f, 63.257812f);
        instancePath.lineTo(56.30078f, 63.257812f);
        instancePath.cubicTo(57.523438f, 63.257812f, 58.035156f, 62.84375f, 58.10547f, 61.773438f);
        instancePath.lineTo(58.11328f, 61.492188f);
        instancePath.lineTo(58.11328f, 46.15625f);
        instancePath.lineTo(61.710938f, 42.554688f);
        instancePath.lineTo(61.714844f, 61.492188f);
        instancePath.cubicTo(61.714844f, 64.63672f, 59.773438f, 66.67578f, 56.722656f, 66.84375f);
        instancePath.lineTo(56.30078f, 66.85547f);
        instancePath.lineTo(15.699219f, 66.85547f);
        instancePath.cubicTo(12.550781f, 66.85547f, 10.472656f, 64.95703f, 10.296875f, 61.914062f);
        instancePath.lineTo(10.285156f, 61.492188f);
        instancePath.lineTo(10.285156f, 10.507812f);
        instancePath.cubicTo(10.285156f, 7.363281f, 12.226562f, 5.324219f, 15.277344f, 5.15625f);
        instancePath.lineTo(15.699219f, 5.144531f);
        instancePath.close();
        instancePath.moveTo(56.30078f, 5.144531f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(20.570312f, 18.0f);
        instancePath2.lineTo(51.429688f, 18.0f);
        instancePath2.lineTo(51.429688f, 21.601562f);
        instancePath2.lineTo(20.570312f, 21.601562f);
        instancePath2.close();
        instancePath2.moveTo(20.570312f, 18.0f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(20.570312f, 30.855469f);
        instancePath3.lineTo(46.285156f, 30.855469f);
        instancePath3.lineTo(46.285156f, 34.45703f);
        instancePath3.lineTo(20.570312f, 34.45703f);
        instancePath3.close();
        instancePath3.moveTo(20.570312f, 30.855469f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint6.setColor(-16268704);
        instancePaint6.setStrokeWidth(1.2f);
        instancePaint6.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint6.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint6.setStrokeMiter(4.0f);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 2.12132f, 2.12132f, -12.080901f, -2.12132f, 2.12132f, 45.478657f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(21.428877f, 14.583318f);
        instancePath4.lineTo(11.142683f, 14.583318f);
        instancePath4.lineTo(11.142683f, 10.298324f);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(34.804688f, 42.296875f);
        instancePath5.lineTo(42.621094f, 50.117188f);
        instancePath5.lineTo(63.16797f, 29.570312f);
        instancePath5.lineTo(65.71484f, 32.117188f);
        instancePath5.lineTo(42.621094f, 55.20703f);
        instancePath5.lineTo(32.257812f, 44.84375f);
        instancePath5.close();
        instancePath5.moveTo(34.804688f, 42.296875f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 1);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
