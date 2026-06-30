package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class album_test_close extends l95.c {
    private final int width = 45;
    private final int height = 45;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 45;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                instancePaint3.setColor(-11184811);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(14.634262f, 3.4369836f);
                instancePath.cubicTo(15.279194f, 1.8675201f, 16.155897f, -0.3917077f, 18.31239f, 0.058138534f);
                instancePath.cubicTo(20.186722f, 0.08812828f, 20.589804f, 2.1574209f, 21.315353f, 3.4469802f);
                instancePath.cubicTo(24.09662f, 4.796519f, 26.817427f, 6.6258936f, 28.07706f, 9.564889f);
                instancePath.cubicTo(31.13041f, 15.372904f, 29.185537f, 22.17058f, 31.251333f, 28.218513f);
                instancePath.cubicTo(32.138115f, 30.637686f, 33.831062f, 32.656998f, 35.0f, 34.93622f);
                instancePath.cubicTo(23.673386f, 35.026188f, 12.336693f, 35.01619f, 1.0f, 34.93622f);
                instancePath.cubicTo(2.1487849f, 32.647f, 3.861885f, 30.657679f, 4.7486663f, 28.22851f);
                instancePath.cubicTo(6.8144636f, 22.190573f, 4.8595138f, 15.372904f, 7.9229403f, 9.564889f);
                instancePath.cubicTo(9.182572f, 6.6558833f, 11.873148f, 4.8065157f, 14.634262f, 3.4369836f);
                instancePath.lineTo(14.634262f, 3.4369836f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
