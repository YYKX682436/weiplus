package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class invite_friends_by_mail extends l95.c {
    private final int width = 108;
    private final int height = 108;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 108;
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-14187817);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(108.0f, 0.0f);
        instancePath.lineTo(108.0f, 108.0f);
        instancePath.lineTo(0.0f, 108.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 22.0f, 0.0f, 1.0f, 32.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(60.154037f, 3.58796f);
        instancePath2.lineTo(60.154037f, 40.412003f);
        instancePath2.lineTo(3.845964f, 40.40884f);
        instancePath2.lineTo(3.845964f, 3.58796f);
        instancePath2.lineTo(60.154037f, 3.58796f);
        instancePath2.close();
        instancePath2.moveTo(0.0f, 2.3516667f);
        instancePath2.lineTo(0.0f, 41.64496f);
        instancePath2.cubicTo(0.0f, 42.94329f, 1.0471251f, 43.996597f, 2.3367088f, 43.99667f);
        instancePath2.lineTo(61.66312f, 44.0f);
        instancePath2.cubicTo(62.953594f, 44.000072f, 64.0f, 42.948074f, 64.0f, 41.64831f);
        instancePath2.lineTo(64.0f, 2.3517354f);
        instancePath2.cubicTo(64.0f, 1.0533575f, 62.95285f, 0.0f, 61.663208f, 0.0f);
        instancePath2.lineTo(2.3367934f, 0.0f);
        instancePath2.cubicTo(1.046383f, 0.0f, 0.0f, 1.0519472f, 0.0f, 2.3516667f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(2.9155135f, 0.0f);
        instancePath3.lineTo(-3.5527137E-15f, 2.9199913f);
        instancePath3.lineTo(32.030815f, 35.0f);
        instancePath3.lineTo(62.492252f, 4.491779f);
        instancePath3.lineTo(63.02122f, 2.0014334f);
        instancePath3.lineTo(61.084488f, 0.061725732f);
        instancePath3.lineTo(32.030815f, 29.160017f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(2.874115f, 43.0f);
        instancePath4.lineTo(23.0f, 22.874115f);
        instancePath4.lineTo(20.125885f, 20.0f);
        instancePath4.lineTo(0.0f, 40.125885f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(63.0f, 41.125885f);
        instancePath5.lineTo(42.874115f, 21.0f);
        instancePath5.lineTo(40.0f, 23.874115f);
        instancePath5.lineTo(60.125885f, 44.0f);
        instancePath5.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 1);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 1);
        canvas.drawPath(instancePath5, instancePaint8);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
