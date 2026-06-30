package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_finder_music extends l95.c {
    private final int width = 806;
    private final int height = 817;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 806;
        }
        if (i17 == 1) {
            return 817;
        }
        if (i17 == 2) {
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
            instancePaint3.setColor(-9216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(639.674f, 86.9135f);
            instancePath.lineTo(626.804f, 3.82038f);
            instancePath.lineTo(581.999f, 52.0526f);
            instancePath.cubicTo(528.613f, 25.7875f, 468.554f, 10.506f, 404.682f, 10.506f);
            instancePath.cubicTo(183.513f, 10.506f, 4.28992f, 190.064f, 4.28992f, 411.645f);
            instancePath.cubicTo(4.28992f, 633.227f, 183.513f, 812.785f, 404.682f, 812.785f);
            instancePath.cubicTo(625.851f, 812.785f, 805.074f, 633.227f, 805.074f, 411.645f);
            instancePath.cubicTo(805.551f, 277.932f, 740.249f, 159.501f, 639.674f, 86.9135f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(568.652f, 541.061f);
            instancePath2.lineTo(403.252f, 255.965f);
            instancePath2.cubicTo(486.667f, 212.508f, 587.242f, 122.252f, 627.281f, 3.82038f);
            instancePath2.cubicTo(523.846f, 79.7503f, 393.719f, 98.3747f, 278.845f, 97.4196f);
            instancePath2.cubicTo(262.638f, 97.4196f, 252.628f, 114.611f, 260.732f, 128.46f);
            instancePath2.lineTo(294.098f, 186.243f);
            instancePath2.lineTo(457.591f, 468.951f);
            instancePath2.cubicTo(438.048f, 464.653f, 417.075f, 463.221f, 395.626f, 465.131f);
            instancePath2.cubicTo(295.528f, 473.727f, 220.216f, 550.134f, 227.842f, 635.137f);
            instancePath2.cubicTo(235.469f, 720.141f, 322.697f, 781.744f, 422.795f, 773.149f);
            instancePath2.cubicTo(522.893f, 764.553f, 598.205f, 688.145f, 590.579f, 603.142f);
            instancePath2.cubicTo(588.195f, 580.697f, 580.569f, 559.685f, 568.652f, 541.061f);
            instancePath2.close();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(looper);
            instancePaint5.setFlags(385);
            instancePaint5.setStyle(android.graphics.Paint.Style.FILL);
            android.graphics.Paint instancePaint6 = l95.c.instancePaint(looper);
            instancePaint6.setFlags(385);
            instancePaint6.setStyle(android.graphics.Paint.Style.STROKE);
            instancePaint5.setColor(-16777216);
            instancePaint6.setStrokeWidth(1.0f);
            instancePaint6.setStrokeCap(android.graphics.Paint.Cap.BUTT);
            instancePaint6.setStrokeJoin(android.graphics.Paint.Join.MITER);
            instancePaint6.setStrokeMiter(4.0f);
            instancePaint6.setPathEffect(null);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint4, 226.965f, 3.74301f, 226.965f, 774.126f, new int[]{-16725045, -15742798, -14105461, -13516164, -14565257, -16138895, -16728978}, new float[]{0.0f, 0.1617f, 0.4497f, 0.6f, 0.7f, 0.8857f, 1.0f}, instanceMatrix, 0);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
