package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class radar_regular extends l95.c {
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
                instancePath.moveTo(2.0f, 12.0f);
                instancePath.cubicTo(2.0f, 17.5228f, 6.47715f, 22.0f, 12.0f, 22.0f);
                instancePath.cubicTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f);
                instancePath.cubicTo(22.0f, 6.47715f, 17.5228f, 2.0f, 12.0f, 2.0f);
                instancePath.cubicTo(6.47715f, 2.0f, 2.0f, 6.47715f, 2.0f, 12.0f);
                instancePath.close();
                instancePath.moveTo(20.8f, 12.0f);
                instancePath.cubicTo(20.8f, 16.8601f, 16.8601f, 20.8f, 12.0f, 20.8f);
                instancePath.cubicTo(7.13989f, 20.8f, 3.2f, 16.8601f, 3.2f, 12.0f);
                instancePath.cubicTo(3.2f, 7.13989f, 7.13989f, 3.2f, 12.0f, 3.2f);
                instancePath.cubicTo(14.2247f, 3.2f, 16.2565f, 4.02551f, 17.806f, 5.38692f);
                instancePath.lineTo(15.82f, 7.37292f);
                instancePath.cubicTo(14.7823f, 6.5153f, 13.4513f, 6.0f, 12.0f, 6.0f);
                instancePath.cubicTo(8.68629f, 6.0f, 6.0f, 8.68629f, 6.0f, 12.0f);
                instancePath.cubicTo(6.0f, 15.3137f, 8.68629f, 18.0f, 12.0f, 18.0f);
                instancePath.cubicTo(15.3137f, 18.0f, 18.0f, 15.3137f, 18.0f, 12.0f);
                instancePath.cubicTo(18.0f, 10.5698f, 17.4996f, 9.2565f, 16.6644f, 8.22559f);
                instancePath.lineTo(18.6517f, 6.23826f);
                instancePath.cubicTo(19.9901f, 7.78204f, 20.8f, 9.79644f, 20.8f, 12.0f);
                instancePath.close();
                instancePath.moveTo(14.9666f, 8.22626f);
                instancePath.cubicTo(14.1501f, 7.58347f, 13.1198f, 7.2f, 12.0f, 7.2f);
                instancePath.cubicTo(9.34903f, 7.2f, 7.2f, 9.34903f, 7.2f, 12.0f);
                instancePath.cubicTo(7.2f, 14.651f, 9.34903f, 16.8f, 12.0f, 16.8f);
                instancePath.cubicTo(14.651f, 16.8f, 16.8f, 14.651f, 16.8f, 12.0f);
                instancePath.cubicTo(16.8f, 10.9014f, 16.4309f, 9.88896f, 15.81f, 9.07998f);
                instancePath.lineTo(13.4081f, 11.4818f);
                instancePath.cubicTo(13.4675f, 11.6433f, 13.5f, 11.8179f, 13.5f, 12.0f);
                instancePath.cubicTo(13.5f, 12.8284f, 12.8284f, 13.5f, 12.0f, 13.5f);
                instancePath.cubicTo(11.1716f, 13.5f, 10.5f, 12.8284f, 10.5f, 12.0f);
                instancePath.cubicTo(10.5f, 11.1716f, 11.1716f, 10.5f, 12.0f, 10.5f);
                instancePath.cubicTo(12.2047f, 10.5f, 12.3998f, 10.541f, 12.5776f, 10.6153f);
                instancePath.lineTo(14.9666f, 8.22626f);
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
