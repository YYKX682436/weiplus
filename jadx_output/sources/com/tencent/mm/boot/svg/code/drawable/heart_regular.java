package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class heart_regular extends l95.c {
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
                instancePath.moveTo(11.2905f, 6.26451f);
                instancePath.lineTo(11.6766f, 6.64168f);
                instancePath.lineTo(11.9976f, 6.94659f);
                instancePath.lineTo(12.4599f, 6.50527f);
                instancePath.lineTo(12.7047f, 6.26451f);
                instancePath.cubicTo(14.6573f, 4.31189f, 17.8231f, 4.31189f, 19.7758f, 6.26451f);
                instancePath.cubicTo(21.7102f, 8.19897f, 21.7282f, 11.3242f, 19.8297f, 13.2808f);
                instancePath.lineTo(12.7046f, 20.4066f);
                instancePath.cubicTo(12.3442f, 20.7671f, 11.777f, 20.7949f, 11.3847f, 20.4899f);
                instancePath.lineTo(11.2905f, 20.4067f);
                instancePath.lineTo(4.16501f, 13.2812f);
                instancePath.cubicTo(2.26695f, 11.3242f, 2.28494f, 8.19897f, 4.2194f, 6.26451f);
                instancePath.cubicTo(6.17202f, 4.31189f, 9.33785f, 4.31189f, 11.2905f, 6.26451f);
                instancePath.close();
                instancePath.moveTo(10.4419f, 7.11304f);
                instancePath.cubicTo(8.95795f, 5.62905f, 6.55192f, 5.62905f, 5.06793f, 7.11304f);
                instancePath.cubicTo(3.65004f, 8.53093f, 3.58535f, 10.7942f, 4.87066f, 12.2769f);
                instancePath.lineTo(5.01354f, 12.4327f);
                instancePath.lineTo(11.9959f, 19.418f);
                instancePath.lineTo(18.9685f, 12.4451f);
                instancePath.cubicTo(20.3628f, 11.0081f, 20.3952f, 8.74434f, 19.074f, 7.26812f);
                instancePath.lineTo(18.9272f, 7.11304f);
                instancePath.cubicTo(17.4432f, 5.62905f, 15.0372f, 5.62905f, 13.5532f, 7.11304f);
                instancePath.lineTo(13.1512f, 7.5058f);
                instancePath.lineTo(11.9976f, 8.59532f);
                instancePath.lineTo(10.6975f, 7.36447f);
                instancePath.lineTo(10.4419f, 7.11304f);
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
