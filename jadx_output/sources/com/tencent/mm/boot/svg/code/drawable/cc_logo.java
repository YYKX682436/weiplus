package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class cc_logo extends l95.c {
    private final int width = 20;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 20;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(2.08496f, 5.81964f);
        instancePath.cubicTo(4.16621f, 3.1206f, 7.03297f, 7.95941f, 7.96094f, 9.59796f);
        instancePath.cubicTo(8.30172f, 10.2005f, 8.59186f, 10.7809f, 8.87012f, 11.346f);
        instancePath.cubicTo(10.7758f, 8.15312f, 13.2225f, 4.20726f, 14.6982f, 5.87042f);
        instancePath.cubicTo(15.091f, 6.32181f, 14.9737f, 6.99909f, 14.4639f, 7.31671f);
        instancePath.lineTo(14.4639f, 7.29914f);
        instancePath.cubicTo(12.4942f, 8.69339f, 10.9325f, 11.2586f, 9.74219f, 13.0667f);
        instancePath.cubicTo(10.1381f, 13.7971f, 10.5825f, 14.5158f, 11.1709f, 15.2405f);
        instancePath.cubicTo(11.5302f, 15.6834f, 11.973f, 16.1007f, 12.2822f, 16.0677f);
        instancePath.cubicTo(12.767f, 16.0175f, 14.4563f, 11.83f, 14.707f, 9.56476f);
        instancePath.cubicTo(14.7322f, 9.08837f, 15.5093f, 9.11371f, 15.501f, 9.59015f);
        instancePath.cubicTo(15.434f, 12.2484f, 14.1462f, 17.3637f, 12.3574f, 17.556f);
        instancePath.cubicTo(11.1228f, 17.6865f, 9.78634f, 15.9751f, 8.87109f, 14.5179f);
        instancePath.cubicTo(8.51295f, 15.0738f, 8.11946f, 15.6127f, 7.65137f, 16.1429f);
        instancePath.cubicTo(7.18329f, 16.6528f, 6.28938f, 17.614f, 5.25293f, 17.5472f);
        instancePath.cubicTo(4.59257f, 17.5137f, 4.29195f, 17.0707f, 4.1582f, 16.9202f);
        instancePath.cubicTo(3.18867f, 15.6665f, 2.85345f, 14.1876f, 2.43555f, 12.8001f);
        instancePath.cubicTo(2.0176f, 11.1534f, 1.68371f, 9.49753f, 1.66699f, 7.7923f);
        instancePath.cubicTo(1.69203f, 7.2073f, 1.6504f, 6.58848f, 2.08496f, 5.81964f);
        instancePath.close();
        instancePath.moveTo(3.61426f, 6.73957f);
        instancePath.cubicTo(3.09623f, 6.87357f, 3.22143f, 8.59481f, 3.33008f, 9.38898f);
        instancePath.cubicTo(3.73131f, 11.554f, 4.81827f, 15.5751f, 5.46191f, 15.7757f);
        instancePath.cubicTo(5.81292f, 15.8841f, 6.17224f, 15.3319f, 6.84082f, 14.5296f);
        instancePath.cubicTo(7.14316f, 14.1695f, 7.52394f, 13.5749f, 7.95996f, 12.8587f);
        instancePath.cubicTo(7.57227f, 11.9809f, 7.01705f, 11.0814f, 6.50684f, 10.1497f);
        instancePath.cubicTo(5.79631f, 8.84571f, 4.36655f, 6.53895f, 3.61426f, 6.73957f);
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
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 5.0f, 18.0004f, 17.9845f, 0.256865f, new int[]{-1411072, -352965, -352965, -10930, -15616}, new float[]{0.0f, 0.218509f, 0.301225f, 0.793269f, 1.0f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(16.7715f, 0.143862f);
        instancePath2.cubicTo(16.8385f, -0.0479656f, 17.1053f, -0.0479425f, 17.1807f, 0.143862f);
        instancePath2.lineTo(17.54f, 1.12238f);
        instancePath2.cubicTo(17.7657f, 1.7409f, 18.2594f, 2.23361f, 18.8779f, 2.45929f);
        instancePath2.lineTo(19.8555f, 2.81867f);
        instancePath2.cubicTo(20.0477f, 2.88554f, 20.0477f, 3.15359f, 19.8555f, 3.22882f);
        instancePath2.lineTo(18.8779f, 3.5882f);
        instancePath2.cubicTo(18.2594f, 3.81386f, 17.7658f, 4.30666f, 17.54f, 4.92511f);
        instancePath2.lineTo(17.1807f, 5.90363f);
        instancePath2.cubicTo(17.1137f, 6.09563f, 16.8468f, 6.09565f, 16.7715f, 5.90363f);
        instancePath2.lineTo(16.4121f, 4.92511f);
        instancePath2.cubicTo(16.1864f, 4.30667f, 15.6927f, 3.81386f, 15.0742f, 3.5882f);
        instancePath2.lineTo(14.0967f, 3.22882f);
        instancePath2.cubicTo(13.9044f, 3.16195f, 13.9044f, 2.8939f, 14.0967f, 2.81867f);
        instancePath2.lineTo(15.0742f, 2.45929f);
        instancePath2.cubicTo(15.6927f, 2.23361f, 16.1864f, 1.74088f, 16.4121f, 1.12238f);
        instancePath2.lineTo(16.7715f, 0.143862f);
        instancePath2.close();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(looper);
        instancePaint7.setFlags(385);
        instancePaint7.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(looper);
        instancePaint8.setFlags(385);
        instancePaint8.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint7.setColor(-16777216);
        instancePaint8.setStrokeWidth(1.0f);
        instancePaint8.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint8.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint8.setStrokeMiter(4.0f);
        instancePaint8.setPathEffect(null);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint6, 5.0f, 18.0004f, 17.9845f, 0.256865f, new int[]{-1411072, -352965, -352965, -10930, -15616}, new float[]{0.0f, 0.218509f, 0.301225f, 0.793269f, 1.0f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
