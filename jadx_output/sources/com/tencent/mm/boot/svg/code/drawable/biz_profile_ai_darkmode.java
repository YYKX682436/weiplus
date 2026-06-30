package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class biz_profile_ai_darkmode extends l95.c {
    private final int width = 20;
    private final int height = 14;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 20;
        }
        if (i17 == 1) {
            return 14;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(looper);
        instancePaint3.setFlags(385);
        instancePaint3.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint3.setColor(-16777216);
        instancePaint4.setStrokeWidth(1.0f);
        instancePaint4.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint4.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint4.setStrokeMiter(4.0f);
        instancePaint4.setPathEffect(null);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        l95.c.instancePaint(instancePaint3, looper).setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(18.6667f, 0.0f);
        instancePath2.lineTo(18.6667f, 14.0f);
        instancePath2.lineTo(0.0f, 14.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.833313f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.addPath(instancePath, instanceMatrix, instancePath2, true);
        canvas.clipPath(instancePath);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(872415231);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(0.833313f, 2.91667f);
        instancePath3.cubicTo(0.833313f, 1.3058376f, 2.1391506f, 0.0f, 3.749983f, 0.0f);
        instancePath3.lineTo(16.583344f, 0.0f);
        instancePath3.cubicTo(18.194176f, 0.0f, 19.500013f, 1.3058376f, 19.500013f, 2.91667f);
        instancePath3.lineTo(19.500013f, 11.08333f);
        instancePath3.cubicTo(19.500013f, 12.694162f, 18.194176f, 14.0f, 16.583344f, 14.0f);
        instancePath3.lineTo(3.749983f, 14.0f);
        instancePath3.cubicTo(2.1391506f, 14.0f, 0.833313f, 12.694162f, 0.833313f, 11.08333f);
        instancePath3.lineTo(0.833313f, 2.91667f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(14.6006f, 3.2666f);
        instancePath4.lineTo(13.4126f, 3.2666f);
        instancePath4.lineTo(13.4126f, 11.1206f);
        instancePath4.lineTo(14.6006f, 11.1206f);
        instancePath4.lineTo(14.6006f, 3.2666f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-1);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(8.89718f, 3.26661f);
        instancePath5.lineTo(7.53318f, 3.26661f);
        instancePath5.lineTo(4.50818f, 11.1206f);
        instancePath5.lineTo(5.78418f, 11.1206f);
        instancePath5.lineTo(6.52118f, 9.09661f);
        instancePath5.lineTo(9.89818f, 9.09661f);
        instancePath5.lineTo(10.6352f, 11.1206f);
        instancePath5.lineTo(11.9222f, 11.1206f);
        instancePath5.lineTo(8.89718f, 3.26661f);
        instancePath5.close();
        instancePath5.moveTo(9.53518f, 8.10661f);
        instancePath5.lineTo(6.88418f, 8.10661f);
        instancePath5.lineTo(8.19318f, 4.55361f);
        instancePath5.lineTo(8.23718f, 4.55361f);
        instancePath5.lineTo(9.53518f, 8.10661f);
        instancePath5.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
