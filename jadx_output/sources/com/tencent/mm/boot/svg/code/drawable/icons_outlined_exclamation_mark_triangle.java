package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_exclamation_mark_triangle extends l95.c {
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
                instancePaint3.setColor(-436207616);
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(2.73202f, 21.0542f);
                instancePath.cubicTo(2.17973f, 21.0543f, 1.73198f, 20.6066f, 1.73193f, 20.0543f);
                instancePath.cubicTo(1.73192f, 19.8788f, 1.77811f, 19.7063f, 1.86585f, 19.5543f);
                instancePath.lineTo(11.1323f, 3.50014f);
                instancePath.cubicTo(11.4084f, 3.02182f, 12.0199f, 2.85787f, 12.4983f, 3.13396f);
                instancePath.cubicTo(12.6503f, 3.22172f, 12.7766f, 3.34796f, 12.8644f, 3.49998f);
                instancePath.lineTo(22.1339f, 19.5526f);
                instancePath.cubicTo(22.4101f, 20.0309f, 22.2463f, 20.6425f, 21.768f, 20.9187f);
                instancePath.cubicTo(21.616f, 21.0064f, 21.4435f, 21.0527f, 21.268f, 21.0527f);
                instancePath.lineTo(2.73202f, 21.0542f);
                instancePath.close();
                instancePath.moveTo(11.9985f, 4.40009f);
                instancePath.lineTo(3.07837f, 19.8542f);
                instancePath.lineTo(20.9215f, 19.8527f);
                instancePath.lineTo(11.9985f, 4.40009f);
                instancePath.close();
                instancePath.moveTo(11.3726f, 9.9541f);
                instancePath.lineTo(12.6274f, 9.9541f);
                instancePath.lineTo(12.5298f, 14.6758f);
                instancePath.lineTo(11.4702f, 14.6758f);
                instancePath.lineTo(11.3726f, 9.9541f);
                instancePath.close();
                instancePath.moveTo(11.9976f, 17.0977f);
                instancePath.cubicTo(11.6021f, 17.0977f, 11.2896f, 16.79f, 11.2896f, 16.4043f);
                instancePath.cubicTo(11.2896f, 16.0186f, 11.6021f, 15.7158f, 11.9976f, 15.7158f);
                instancePath.cubicTo(12.3979f, 15.7158f, 12.7104f, 16.0186f, 12.7104f, 16.4043f);
                instancePath.cubicTo(12.7104f, 16.79f, 12.3979f, 17.0977f, 11.9976f, 17.0977f);
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
