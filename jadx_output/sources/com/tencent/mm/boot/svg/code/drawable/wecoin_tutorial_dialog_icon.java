package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class wecoin_tutorial_dialog_icon extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint3.setStrokeWidth(1.0f);
            canvas.save();
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -195.0f, 0.0f, 1.0f, -606.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 558.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 195.0f, 0.0f, 1.0f, 48.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray3);
            canvas.concat(instanceMatrix);
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(24.0f, 0.0f);
            instancePath.lineTo(24.0f, 24.0f);
            instancePath.lineTo(0.0f, 24.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.saveLayerAlpha(null, 0, 31);
            canvas.drawPath(instancePath, l95.c.instancePaint(instancePaint4, looper));
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
            instancePaint5.setColor(1275068416);
            instancePaint5.setStrokeWidth(1.2f);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(10.130432f, 10.2078705f);
            instancePath2.cubicTo(10.130432f, 10.2078705f, 13.099432f, 8.420871f, 13.363432f, 4.9158707f);
            instancePath2.cubicTo(13.434432f, 3.9878707f, 13.132432f, 2.5408707f, 12.721432f, 2.1248705f);
            instancePath2.cubicTo(12.476432f, 1.8758706f, 12.055431f, 2.0208707f, 12.022431f, 2.3688707f);
            instancePath2.cubicTo(11.966432f, 2.9388707f, 11.754432f, 4.018871f, 11.199431f, 4.7588706f);
            instancePath2.cubicTo(10.753432f, 5.3528705f, 9.809432f, 6.0378704f, 9.471432f, 6.2718706f);
            instancePath2.cubicTo(8.657432f, 6.749871f, 7.8724318f, 7.3488708f, 7.152432f, 8.068871f);
            instancePath2.cubicTo(3.626432f, 11.594871f, 2.9574318f, 16.64187f, 5.657432f, 19.34287f);
            instancePath2.cubicTo(8.358432f, 22.042871f, 13.405432f, 21.37387f, 16.931433f, 17.84787f);
            instancePath2.cubicTo(20.457432f, 14.321871f, 21.126432f, 9.27387f, 18.426432f, 6.5738707f);
            instancePath2.cubicTo(17.480433f, 5.6278706f, 16.081432f, 5.0628705f, 15.037432f, 4.945871f);
            instancePath2.cubicTo(13.993432f, 4.8298707f, 13.397431f, 4.9158707f, 13.397431f, 4.9158707f);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
