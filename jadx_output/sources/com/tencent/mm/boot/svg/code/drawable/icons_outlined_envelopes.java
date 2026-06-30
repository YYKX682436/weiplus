package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_envelopes extends l95.c {
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 10.5f, 0.0f, 1.0f, 5.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(25.5f, 30.5f);
        instancePath.cubicTo(28.606602f, 30.5f, 31.125f, 27.981602f, 31.125f, 24.875f);
        instancePath.cubicTo(31.125f, 21.768398f, 28.606602f, 19.25f, 25.5f, 19.25f);
        instancePath.cubicTo(22.393398f, 19.25f, 19.875f, 21.768398f, 19.875f, 24.875f);
        instancePath.cubicTo(19.875f, 27.981602f, 22.393398f, 30.5f, 25.5f, 30.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(4.95f);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(46.65f, 3.0943847f);
        instancePath2.cubicTo(46.96066f, 3.0943847f, 47.24191f, 3.2203047f, 47.445496f, 3.4238896f);
        instancePath2.cubicTo(47.64908f, 3.6274745f, 47.775f, 3.9087245f, 47.775f, 4.2193847f);
        instancePath2.lineTo(47.775f, 4.2193847f);
        instancePath2.lineTo(47.775f, 56.848732f);
        instancePath2.cubicTo(47.775f, 57.15939f, 47.64908f, 57.44064f, 47.445496f, 57.644226f);
        instancePath2.cubicTo(47.24191f, 57.84781f, 46.96066f, 57.973732f, 46.65f, 57.973732f);
        instancePath2.lineTo(46.65f, 57.973732f);
        instancePath2.lineTo(4.35f, 57.973732f);
        instancePath2.cubicTo(4.03934f, 57.973732f, 3.7580898f, 57.84781f, 3.5545049f, 57.644226f);
        instancePath2.cubicTo(3.35092f, 57.44064f, 3.225f, 57.15939f, 3.225f, 56.848732f);
        instancePath2.lineTo(3.225f, 56.848732f);
        instancePath2.lineTo(3.225f, 4.2193847f);
        instancePath2.cubicTo(3.225f, 3.9087245f, 3.35092f, 3.6274745f, 3.5545049f, 3.4238896f);
        instancePath2.cubicTo(3.7580898f, 3.2203047f, 4.03934f, 3.0943847f, 4.35f, 3.0943847f);
        instancePath2.lineTo(4.35f, 3.0943847f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-16777216);
        instancePaint7.setColor(-16777216);
        instancePaint7.setStrokeWidth(2.25f);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(3.0280151f, 7.681593f);
        instancePath3.cubicTo(3.0280151f, 15.295336f, 10.917f, 21.71345f, 19.6848f, 23.7188f);
        instancePath3.cubicTo(19.5684f, 24.20165f, 19.5f, 24.703764f, 19.5f, 25.2239f);
        instancePath3.cubicTo(19.5f, 25.430214f, 19.5108f, 25.634043f, 19.53f, 25.835386f);
        instancePath3.cubicTo(13.7418f, 24.903242f, 7.0864153f, 22.641865f, 3.0280151f, 19.46885f);
        instancePath3.lineTo(3.0280151f, 7.681593f);
        instancePath3.cubicTo(3.0280151f, 7.681593f, 2.6176949f, 4.320863f, 3.0280151f, 3.3357544f);
        instancePath3.cubicTo(3.4383354f, 2.3506463f, 5.257324f, 2.3294067f, 5.257324f, 2.3294067f);
        instancePath3.lineTo(44.426514f, 2.3294067f);
        instancePath3.lineTo(47.220886f, 3.3357544f);
        instancePath3.lineTo(48.046143f, 7.681593f);
        instancePath3.lineTo(48.046143f, 19.46885f);
        instancePath3.cubicTo(43.987743f, 22.641865f, 37.2582f, 24.903242f, 31.47f, 25.835386f);
        instancePath3.cubicTo(31.4892f, 25.634043f, 31.5f, 25.430214f, 31.5f, 25.2239f);
        instancePath3.cubicTo(31.5f, 24.703764f, 31.4316f, 24.20165f, 31.3152f, 23.7188f);
        instancePath3.cubicTo(40.083f, 21.71345f, 48.046143f, 15.295336f, 48.046143f, 7.681593f);
        instancePath3.cubicTo(48.046143f, 7.681593f, 47.672394f, 2.9179604f, 44.426514f, 2.3294067f);
        instancePath3.cubicTo(35.889668f, 0.78147715f, 14.429889f, 2.3294067f, 5.257324f, 2.3294067f);
        instancePath3.cubicTo(3.9174805f, 2.3294067f, 3.0280151f, 7.681593f, 3.0280151f, 7.681593f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
