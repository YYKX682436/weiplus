package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class album_twitter_icon_normal extends l95.c {
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(15.75f, 0.0f);
        instancePath.cubicTo(16.992f, 0.0f, 18.0f, 1.008f, 18.0f, 2.25f);
        instancePath.lineTo(18.0f, 15.75f);
        instancePath.cubicTo(18.0f, 16.992f, 16.992f, 18.0f, 15.75f, 18.0f);
        instancePath.lineTo(2.25f, 18.0f);
        instancePath.cubicTo(1.008f, 18.0f, 0.0f, 16.992f, 0.0f, 15.75f);
        instancePath.lineTo(0.0f, 2.25f);
        instancePath.cubicTo(0.0f, 1.008f, 1.008f, 0.0f, 2.25f, 0.0f);
        instancePath.lineTo(15.75f, 0.0f);
        instancePath.close();
        instancePath.moveTo(11.1645f, 4.428f);
        instancePath.cubicTo(9.891f, 4.428f, 8.856f, 5.463f, 8.856f, 6.7365f);
        instancePath.cubicTo(8.856f, 6.9165f, 8.8785f, 7.092f, 8.9145f, 7.263f);
        instancePath.cubicTo(6.9975f, 7.1685f, 5.2965f, 6.246f, 4.158f, 4.851f);
        instancePath.cubicTo(3.96f, 5.193f, 3.8475f, 5.589f, 3.8475f, 6.012f);
        instancePath.cubicTo(3.8475f, 6.813f, 4.257f, 7.5195f, 4.8735f, 7.9335f);
        instancePath.cubicTo(4.4955f, 7.92f, 4.14f, 7.8165f, 3.8295f, 7.6455f);
        instancePath.lineTo(3.8295f, 7.677f);
        instancePath.lineTo(3.8295f, 7.677f);
        instancePath.cubicTo(3.8295f, 8.793f, 4.626f, 9.729f, 5.679f, 9.9405f);
        instancePath.cubicTo(5.4855f, 9.9945f, 5.283f, 10.0215f, 5.0715f, 10.0215f);
        instancePath.cubicTo(4.923f, 10.0215f, 4.779f, 10.008f, 4.6395f, 9.981f);
        instancePath.cubicTo(4.932f, 10.899f, 5.787f, 11.565f, 6.795f, 11.583f);
        instancePath.cubicTo(6.003f, 12.204f, 5.0085f, 12.573f, 3.9285f, 12.573f);
        instancePath.cubicTo(3.744f, 12.573f, 3.5595f, 12.564f, 3.3795f, 12.5415f);
        instancePath.cubicTo(4.3965f, 13.1895f, 5.6115f, 13.572f, 6.912f, 13.572f);
        instancePath.cubicTo(11.1555f, 13.572f, 13.4775f, 10.053f, 13.4775f, 7.0065f);
        instancePath.cubicTo(13.4775f, 6.9075f, 13.4775f, 6.8085f, 13.473f, 6.7095f);
        instancePath.cubicTo(13.923f, 6.3855f, 14.3145f, 5.976f, 14.625f, 5.5125f);
        instancePath.cubicTo(14.211f, 5.697f, 13.7655f, 5.8185f, 13.2975f, 5.877f);
        instancePath.cubicTo(13.7745f, 5.5935f, 14.139f, 5.139f, 14.3145f, 4.599f);
        instancePath.cubicTo(13.869f, 4.8645f, 13.374f, 5.0535f, 12.8475f, 5.157f);
        instancePath.cubicTo(12.4245f, 4.707f, 11.826f, 4.428f, 11.1645f, 4.428f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
