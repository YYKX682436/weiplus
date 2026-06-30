package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_add_chosen extends l95.c {
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
                instancePaint3.setColor(-855638017);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(13.0018f, 2.17811f);
                instancePath.cubicTo(12.383f, 1.82084f, 11.6206f, 1.82084f, 11.0018f, 2.17811f);
                instancePath.lineTo(3.99512f, 6.2234f);
                instancePath.cubicTo(3.37632f, 6.58067f, 2.99512f, 7.24092f, 2.99512f, 7.95546f);
                instancePath.lineTo(2.99512f, 16.0461f);
                instancePath.cubicTo(2.99512f, 16.7606f, 3.37632f, 17.4208f, 3.99512f, 17.7781f);
                instancePath.lineTo(11.0018f, 21.8234f);
                instancePath.cubicTo(11.6206f, 22.1807f, 12.383f, 22.1807f, 13.0018f, 21.8234f);
                instancePath.lineTo(20.0084f, 17.7781f);
                instancePath.cubicTo(20.6272f, 17.4208f, 21.0084f, 16.7606f, 21.0084f, 16.0461f);
                instancePath.lineTo(21.0084f, 7.95546f);
                instancePath.cubicTo(21.0084f, 7.24092f, 20.6272f, 6.58067f, 20.0084f, 6.2234f);
                instancePath.lineTo(13.0018f, 2.17811f);
                instancePath.close();
                instancePath.moveTo(13.4697f, 9.978f);
                instancePath.lineTo(12.0002f, 7.00054f);
                instancePath.lineTo(10.5307f, 9.978f);
                instancePath.lineTo(7.24491f, 10.4555f);
                instancePath.lineTo(9.62255f, 12.7731f);
                instancePath.lineTo(9.06126f, 16.0456f);
                instancePath.lineTo(12.0002f, 14.5005f);
                instancePath.lineTo(14.9391f, 16.0456f);
                instancePath.lineTo(14.3778f, 12.7731f);
                instancePath.lineTo(16.7555f, 10.4555f);
                instancePath.lineTo(13.4697f, 9.978f);
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
