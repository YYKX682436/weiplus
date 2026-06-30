package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_volume_up extends l95.c {
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
                instancePath.moveTo(4.0f, 8.4999f);
                instancePath.lineTo(8.5f, 8.4999f);
                instancePath.lineTo(12.2929f, 4.70701f);
                instancePath.cubicTo(12.9229f, 4.07704f, 14.0f, 4.52321f, 14.0f, 5.41411f);
                instancePath.lineTo(14.0f, 18.5857f);
                instancePath.cubicTo(14.0f, 19.4766f, 12.9229f, 19.9228f, 12.2929f, 19.2928f);
                instancePath.lineTo(8.5f, 15.4999f);
                instancePath.lineTo(4.0f, 15.4999f);
                instancePath.cubicTo(3.44772f, 15.4999f, 3.0f, 15.0522f, 3.0f, 14.4999f);
                instancePath.lineTo(3.0f, 9.4999f);
                instancePath.cubicTo(3.0f, 8.94762f, 3.44772f, 8.4999f, 4.0f, 8.4999f);
                instancePath.close();
                instancePath.moveTo(12.8f, 18.1028f);
                instancePath.lineTo(8.99706f, 14.2999f);
                instancePath.lineTo(4.2f, 14.2999f);
                instancePath.lineTo(4.2f, 9.6999f);
                instancePath.lineTo(8.99706f, 9.6999f);
                instancePath.lineTo(12.8f, 5.89696f);
                instancePath.lineTo(12.8f, 18.1028f);
                instancePath.close();
                instancePath.moveTo(20.3f, 11.9996f);
                instancePath.cubicTo(20.3f, 13.8774f, 19.5389f, 15.5774f, 18.3083f, 16.808f);
                instancePath.lineTo(19.1568f, 17.6565f);
                instancePath.cubicTo(20.6045f, 16.2088f, 21.5f, 14.2088f, 21.5f, 11.9996f);
                instancePath.cubicTo(21.5f, 9.7905f, 20.6045f, 7.7905f, 19.1568f, 6.34279f);
                instancePath.lineTo(18.3083f, 7.19132f);
                instancePath.cubicTo(19.5389f, 8.42187f, 20.3f, 10.1219f, 20.3f, 11.9996f);
                instancePath.close();
                instancePath.moveTo(19.0f, 11.9996f);
                instancePath.cubicTo(19.0f, 10.4809f, 18.3844f, 9.10586f, 17.3891f, 8.11056f);
                instancePath.lineTo(16.5405f, 8.95908f);
                instancePath.cubicTo(17.3187f, 9.73723f, 17.8f, 10.8122f, 17.8f, 11.9996f);
                instancePath.cubicTo(17.8f, 13.1871f, 17.3187f, 14.2621f, 16.5405f, 15.0402f);
                instancePath.lineTo(17.3891f, 15.8887f);
                instancePath.cubicTo(18.3844f, 14.8934f, 19.0f, 13.5184f, 19.0f, 11.9996f);
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
