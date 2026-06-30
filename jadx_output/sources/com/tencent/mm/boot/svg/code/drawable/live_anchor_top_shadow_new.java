package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class live_anchor_top_shadow_new extends l95.c {
    private final int width = 414;
    private final int height = 260;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 414;
        }
        if (i17 == 1) {
            return 260;
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
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(414.0f, 260.0f);
            instancePath.lineTo(0.0f, 260.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.lineTo(414.0f, 0.0f);
            instancePath.lineTo(414.0f, 260.0f);
            instancePath.close();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(looper);
            instancePaint4.setFlags(385);
            instancePaint4.setStyle(android.graphics.Paint.Style.FILL);
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(looper);
            instancePaint5.setFlags(385);
            instancePaint5.setStyle(android.graphics.Paint.Style.STROKE);
            instancePaint4.setColor(-16777216);
            instancePaint5.setStrokeWidth(1.0f);
            instancePaint5.setStrokeCap(android.graphics.Paint.Cap.BUTT);
            instancePaint5.setStrokeJoin(android.graphics.Paint.Join.MITER);
            instancePaint5.setStrokeMiter(4.0f);
            instancePaint5.setPathEffect(null);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 20717.6f, -1235.29f, 20717.6f, -25740.0f, new int[]{0, 201326592, 1275068416}, new float[]{0.0f, 0.341528f, 1.0f}, instanceMatrix, 0);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
