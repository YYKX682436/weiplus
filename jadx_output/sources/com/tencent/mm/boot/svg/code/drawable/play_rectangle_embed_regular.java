package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class play_rectangle_embed_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
            if (i17 == 2) {
                android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
                android.os.Looper looper = (android.os.Looper) objArr[1];
                l95.c.instanceMatrix(looper);
                l95.c.instanceMatrixArray(looper);
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(2.5f, 4.9375f);
                instancePath.cubicTo(2.5f, 4.41973f, 2.92533f, 4.0f, 3.45f, 4.0f);
                instancePath.lineTo(20.55f, 4.0f);
                instancePath.cubicTo(21.0747f, 4.0f, 21.5f, 4.41973f, 21.5f, 4.9375f);
                instancePath.lineTo(21.5f, 15.4592f);
                instancePath.lineTo(20.36f, 14.3192f);
                instancePath.lineTo(20.36f, 5.125f);
                instancePath.lineTo(3.64f, 5.125f);
                instancePath.lineTo(3.64f, 17.875f);
                instancePath.lineTo(10.7749f, 17.875f);
                instancePath.cubicTo(10.6746f, 18.2429f, 10.6761f, 18.6328f, 10.7794f, 19.0f);
                instancePath.lineTo(3.45f, 19.0f);
                instancePath.cubicTo(2.92533f, 19.0f, 2.5f, 18.5803f, 2.5f, 18.0625f);
                instancePath.lineTo(2.5f, 4.9375f);
                instancePath.close();
                instancePath.moveTo(15.748f, 12.0971f);
                instancePath.lineTo(10.2026f, 15.25f);
                instancePath.cubicTo(9.83289f, 15.4585f, 9.33117f, 15.3282f, 9.11991f, 14.9634f);
                instancePath.cubicTo(9.04069f, 14.8331f, 9.01429f, 14.7028f, 9.01429f, 14.5725f);
                instancePath.lineTo(9.01429f, 8.26666f);
                instancePath.cubicTo(9.01429f, 7.82369f, 9.35757f, 7.48494f, 9.80649f, 7.48494f);
                instancePath.cubicTo(9.93852f, 7.48494f, 10.0706f, 7.511f, 10.2026f, 7.58917f);
                instancePath.lineTo(15.748f, 10.7421f);
                instancePath.cubicTo(16.1177f, 10.9506f, 16.2497f, 11.4456f, 16.0385f, 11.8104f);
                instancePath.cubicTo(15.9592f, 11.9407f, 15.88f, 12.0189f, 15.748f, 12.0971f);
                instancePath.close();
                instancePath.moveTo(10.1545f, 13.9791f);
                instancePath.lineTo(14.6562f, 11.4196f);
                instancePath.lineTo(10.1545f, 8.86007f);
                instancePath.lineTo(10.1545f, 13.9791f);
                instancePath.close();
                instancePath.moveTo(15.8121f, 21.1047f);
                instancePath.lineTo(17.3288f, 15.4443f);
                instancePath.lineTo(18.4879f, 15.7549f);
                instancePath.lineTo(16.9713f, 21.4152f);
                instancePath.lineTo(15.8121f, 21.1047f);
                instancePath.close();
                instancePath.moveTo(12.3765f, 18.0046f);
                instancePath.lineTo(14.4665f, 15.9146f);
                instancePath.lineTo(15.315f, 16.7631f);
                instancePath.lineTo(13.6492f, 18.4289f);
                instancePath.lineTo(15.315f, 20.0947f);
                instancePath.lineTo(14.4665f, 20.9432f);
                instancePath.lineTo(12.3765f, 18.8532f);
                instancePath.cubicTo(12.1421f, 18.6188f, 12.1421f, 18.239f, 12.3765f, 18.0046f);
                instancePath.close();
                instancePath.moveTo(21.9243f, 18.0046f);
                instancePath.lineTo(19.8342f, 15.9146f);
                instancePath.lineTo(18.9857f, 16.7631f);
                instancePath.lineTo(20.6515f, 18.4289f);
                instancePath.lineTo(18.9857f, 20.0947f);
                instancePath.lineTo(19.8342f, 20.9432f);
                instancePath.lineTo(21.9243f, 18.8532f);
                instancePath.cubicTo(22.1586f, 18.6188f, 22.1586f, 18.239f, 21.9243f, 18.0046f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
