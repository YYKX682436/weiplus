package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_brand_we_app_logo_dyeing_template extends l95.c {
    private final int width = 44;
    private final int height = 40;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 44;
        }
        if (i17 == 1) {
            return 40;
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
            l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-9074981);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -298.0f, 0.0f, 1.0f, -661.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(322.0f, 663.0f);
            instancePath.cubicTo(320.0f, 664.0f, 316.5f, 668.1991f, 317.0f, 672.0f);
            instancePath.lineTo(317.0f, 689.0f);
            instancePath.cubicTo(316.5f, 691.797f, 313.4775f, 695.2222f, 310.0f, 695.0f);
            instancePath.cubicTo(306.02176f, 695.2222f, 303.0f, 691.797f, 303.0f, 689.0f);
            instancePath.cubicTo(303.0f, 686.67645f, 305.0f, 683.0f, 307.0f, 683.0f);
            instancePath.cubicTo(309.0f, 683.0f, 311.0f, 681.0f, 310.0f, 679.0f);
            instancePath.cubicTo(309.0f, 677.0f, 306.0f, 677.87036f, 305.0f, 678.0f);
            instancePath.cubicTo(304.0f, 678.12964f, 300.0f, 681.0f, 299.0f, 683.0f);
            instancePath.cubicTo(298.0f, 685.0f, 298.0f, 686.8411f, 298.0f, 689.0f);
            instancePath.cubicTo(298.0f, 694.9784f, 302.7195f, 701.0f, 310.0f, 701.0f);
            instancePath.cubicTo(312.23026f, 701.0f, 315.0f, 700.0f, 317.0f, 699.0f);
            instancePath.cubicTo(319.0f, 698.0f, 322.5f, 692.8009f, 322.0f, 689.0f);
            instancePath.lineTo(322.0f, 672.0f);
            instancePath.cubicTo(322.5f, 669.203f, 325.52176f, 666.7778f, 329.0f, 667.0f);
            instancePath.cubicTo(332.9775f, 666.7778f, 337.0f, 669.203f, 337.0f, 672.0f);
            instancePath.cubicTo(337.0f, 674.41455f, 335.0f, 677.0f, 332.0f, 678.0f);
            instancePath.cubicTo(329.0f, 679.0f, 328.0f, 680.0f, 329.0f, 682.0f);
            instancePath.cubicTo(330.0f, 684.0f, 333.0f, 683.0f, 334.0f, 683.0f);
            instancePath.cubicTo(335.0f, 683.0f, 339.0f, 680.0f, 340.0f, 678.0f);
            instancePath.cubicTo(341.0f, 676.0f, 342.0f, 674.1589f, 342.0f, 672.0f);
            instancePath.cubicTo(342.0f, 666.0216f, 336.2805f, 661.0f, 329.0f, 661.0f);
            instancePath.cubicTo(326.76974f, 661.0f, 324.0f, 662.0f, 322.0f, 663.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
