package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_self_feed_like_arrow extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, -1.0f, 1.2246469E-16f, 19.0f, -1.2246469E-16f, -1.0f, 17.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(13.0f, 4.25f);
        instancePath.lineTo(13.0f, 5.75f);
        instancePath.lineTo(2.8711069f, 5.749359f);
        instancePath.lineTo(5.303301f, 8.18198f);
        instancePath.lineTo(4.2426405f, 9.2426405f);
        instancePath.lineTo(0.35355338f, 5.3535533f);
        instancePath.cubicTo(0.15829125f, 5.1582913f, 0.15829125f, 4.8417087f, 0.35355338f, 4.6464467f);
        instancePath.lineTo(1.0606601f, 3.9393399f);
        instancePath.lineTo(1.0611068f, 3.9393594f);
        instancePath.lineTo(4.2426405f, 0.7573593f);
        instancePath.lineTo(5.303301f, 1.8180195f);
        instancePath.lineTo(2.8711069f, 4.249359f);
        instancePath.lineTo(13.0f, 4.25f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
