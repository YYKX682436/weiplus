package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_mini_win_ear extends l95.c {
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
        instancePath2.lineTo(24.0f, 0.0f);
        instancePath2.lineTo(24.0f, 24.0f);
        instancePath2.lineTo(0.0f, 24.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.addPath(instancePath, instanceMatrix, instancePath2, true);
        canvas.clipPath(instancePath);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-436207616);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(7.63653f, 13.091f);
        instancePath3.cubicTo(8.23907f, 13.2918f, 8.89034f, 12.9662f, 9.09118f, 12.3636f);
        instancePath3.cubicTo(9.29203f, 11.7611f, 8.96639f, 11.1098f, 8.36386f, 10.909f);
        instancePath3.cubicTo(7.38469f, 10.5826f, 6.92072f, 9.32333f, 6.92072f, 8.34221f);
        instancePath3.cubicTo(6.92072f, 5.0f, 9.5001f, 2.30359f, 13.2501f, 2.30359f);
        instancePath3.cubicTo(17.0001f, 2.30359f, 19.7501f, 5.05478f, 19.7501f, 8.44855f);
        instancePath3.cubicTo(19.7501f, 9.77481f, 18.8735f, 11.0808f, 18.2501f, 12.2514f);
        instancePath3.lineTo(13.7728f, 20.4596f);
        instancePath3.cubicTo(13.2023f, 21.5308f, 11.9057f, 21.9852f, 10.7914f, 21.5044f);
        instancePath3.cubicTo(9.85854f, 21.1021f, 9.22915f, 20.0105f, 9.19973f, 19.0099f);
        instancePath3.cubicTo(9.18027f, 18.348f, 9.19545f, 17.8243f, 9.20696f, 17.1623f);
        instancePath3.cubicTo(9.21938f, 16.5328f, 8.71915f, 16.0124f, 8.08967f, 16.0f);
        instancePath3.cubicTo(7.46019f, 15.9876f, 6.93983f, 16.4879f, 6.92741f, 17.1174f);
        instancePath3.cubicTo(6.91523f, 17.8167f, 6.90016f, 18.3776f, 6.92072f, 19.0769f);
        instancePath3.cubicTo(6.97532f, 20.9799f, 8.11105f, 22.8572f, 9.87894f, 23.6199f);
        instancePath3.cubicTo(12.0942f, 24.5755f, 14.6722f, 23.6721f, 15.8063f, 21.5426f);
        instancePath3.lineTo(20.1776f, 13.3344f);
        instancePath3.cubicTo(20.9787f, 11.8305f, 21.9f, 10.5462f, 21.9f, 8.84221f);
        instancePath3.cubicTo(22.2606f, 4.2883f, 18.1363f, -2.44141E-4f, 13.2501f, -2.44141E-4f);
        instancePath3.cubicTo(8.36386f, -2.44141E-4f, 4.6001f, 3.5f, 4.6001f, 8.44855f);
        instancePath3.cubicTo(4.6001f, 10.4107f, 5.73187f, 12.4561f, 7.63653f, 13.091f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-436207616);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(8.8971f, 8.38721f);
        instancePath4.cubicTo(8.8971f, 8.67929f, 9.00947f, 8.96016f, 9.21093f, 9.17163f);
        instancePath4.lineTo(9.21093f, 9.17163f);
        instancePath4.cubicTo(9.64601f, 9.62832f, 10.3696f, 9.64368f, 10.8237f, 9.20586f);
        instancePath4.lineTo(10.8443f, 9.18601f);
        instancePath4.cubicTo(11.0721f, 8.96631f, 11.2008f, 8.65872f, 11.2008f, 8.34221f);
        instancePath4.lineTo(11.2008f, 8.34221f);
        instancePath4.cubicTo(11.2008f, 7.37568f, 12.0001f, 6.57801f, 13.2501f, 6.57801f);
        instancePath4.cubicTo(14.3894f, 6.57801f, 15.2501f, 7.37567f, 15.2501f, 8.34221f);
        instancePath4.cubicTo(15.2501f, 8.75598f, 14.6946f, 9.63492f, 14.5001f, 10.0f);
        instancePath4.lineTo(12.4669f, 13.3222f);
        instancePath4.cubicTo(12.1223f, 13.8853f, 12.3232f, 14.6225f, 12.906f, 14.9328f);
        instancePath4.lineTo(12.906f, 14.9328f);
        instancePath4.cubicTo(13.4437f, 15.2192f, 14.1116f, 15.035f, 14.4265f, 14.5135f);
        instancePath4.lineTo(16.8001f, 10.583f);
        instancePath4.cubicTo(17.1721f, 9.8845f, 17.6001f, 9.13366f, 17.6001f, 8.34221f);
        instancePath4.cubicTo(17.6001f, 6.1033f, 15.489f, 4.2883f, 13.2501f, 4.2883f);
        instancePath4.cubicTo(11.0112f, 4.2883f, 8.8971f, 6.1033f, 8.8971f, 8.34221f);
        instancePath4.lineTo(8.8971f, 8.38721f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
