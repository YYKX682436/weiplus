package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class vip_filled_new extends l95.c {
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
                instancePath.moveTo(11.137f, 2.20425f);
                instancePath.cubicTo(11.6136f, 1.93182f, 12.3867f, 1.93202f, 12.863f, 2.20425f);
                instancePath.lineTo(20.137f, 6.36221f);
                instancePath.cubicTo(20.6136f, 6.63464f, 21.0f, 7.29759f, 21.0f, 7.83273f);
                instancePath.lineTo(21.0f, 16.1673f);
                instancePath.cubicTo(21.0f, 16.707f, 20.6133f, 17.3656f, 20.137f, 17.6378f);
                instancePath.lineTo(12.863f, 21.7958f);
                instancePath.cubicTo(12.3864f, 22.0682f, 11.6133f, 22.068f, 11.137f, 21.7958f);
                instancePath.lineTo(3.86296f, 17.6378f);
                instancePath.cubicTo(3.38636f, 17.3654f, 3.0f, 16.7024f, 3.0f, 16.1673f);
                instancePath.lineTo(3.0f, 7.83273f);
                instancePath.cubicTo(3.0f, 7.29301f, 3.38672f, 6.63443f, 3.86296f, 6.36221f);
                instancePath.lineTo(11.137f, 2.20425f);
                instancePath.close();
                instancePath.moveTo(14.2241f, 8.96858f);
                instancePath.cubicTo(14.2241f, 10.3319f, 13.2283f, 11.4372f, 12.0f, 11.4372f);
                instancePath.cubicTo(10.7716f, 11.4372f, 9.7758f, 10.3319f, 9.7758f, 8.96858f);
                instancePath.cubicTo(9.7758f, 7.60522f, 10.7716f, 6.5f, 12.0f, 6.5f);
                instancePath.cubicTo(13.2283f, 6.5f, 14.2241f, 7.60522f, 14.2241f, 8.96858f);
                instancePath.close();
                instancePath.moveTo(12.0f, 16.4292f);
                instancePath.cubicTo(16.4108f, 16.4292f, 16.8f, 16.2746f, 16.8f, 15.1496f);
                instancePath.cubicTo(16.8f, 14.0245f, 15.1135f, 12.26f, 12.0f, 12.26f);
                instancePath.cubicTo(8.88644f, 12.26f, 7.19995f, 14.0096f, 7.19995f, 15.1496f);
                instancePath.cubicTo(7.19995f, 16.2895f, 7.58914f, 16.4292f, 12.0f, 16.4292f);
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
