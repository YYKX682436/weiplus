package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_artist extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                instancePath.moveTo(49.7024f, 20.9147f);
                instancePath.cubicTo(49.7024f, 28.488f, 43.563f, 34.6274f, 35.9897f, 34.6274f);
                instancePath.cubicTo(28.4164f, 34.6274f, 22.277f, 28.488f, 22.277f, 20.9147f);
                instancePath.cubicTo(22.277f, 13.3414f, 28.4164f, 7.202f, 35.9897f, 7.202f);
                instancePath.cubicTo(43.563f, 7.202f, 49.7024f, 13.3414f, 49.7024f, 20.9147f);
                instancePath.close();
                instancePath.moveTo(45.2024f, 20.9147f);
                instancePath.cubicTo(45.2024f, 26.0028f, 41.0777f, 30.1274f, 35.9897f, 30.1274f);
                instancePath.cubicTo(30.9017f, 30.1274f, 26.777f, 26.0028f, 26.777f, 20.9147f);
                instancePath.cubicTo(26.777f, 15.8267f, 30.9017f, 11.702f, 35.9897f, 11.702f);
                instancePath.cubicTo(41.0777f, 11.702f, 45.2024f, 15.8267f, 45.2024f, 20.9147f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(35.9394f, 64.8012f);
                instancePath2.cubicTo(61.6566f, 64.8012f, 64.8014f, 64.8012f, 64.8014f, 55.9637f);
                instancePath2.cubicTo(64.8014f, 48.5133f, 50.3704f, 39.2001f, 35.9394f, 39.2001f);
                instancePath2.cubicTo(21.5084f, 39.2001f, 7.19897f, 48.5133f, 7.19897f, 55.9637f);
                instancePath2.cubicTo(7.19897f, 64.8012f, 10.2222f, 64.8012f, 35.9394f, 64.8012f);
                instancePath2.close();
                instancePath2.moveTo(60.3014f, 55.9637f);
                instancePath2.cubicTo(60.3014f, 58.1043f, 60.0659f, 58.7243f, 59.9828f, 58.8725f);
                instancePath2.lineTo(59.9802f, 58.8771f);
                instancePath2.cubicTo(59.9729f, 58.8837f, 59.9559f, 58.898f, 59.9245f, 58.9192f);
                instancePath2.cubicTo(59.8095f, 58.9972f, 59.4995f, 59.1703f, 58.8167f, 59.3588f);
                instancePath2.cubicTo(57.3665f, 59.7592f, 55.0223f, 60.0288f, 51.1398f, 60.1659f);
                instancePath2.cubicTo(47.3265f, 60.3005f, 42.4011f, 60.3012f, 35.9394f, 60.3012f);
                instancePath2.cubicTo(29.4775f, 60.3012f, 24.5601f, 60.3005f, 20.7585f, 60.1659f);
                instancePath2.cubicTo(16.8863f, 60.0288f, 14.5617f, 59.7591f, 13.1314f, 59.3612f);
                instancePath2.cubicTo(12.4594f, 59.1742f, 12.1615f, 59.0043f, 12.0569f, 58.9325f);
                instancePath2.cubicTo(12.0351f, 58.9176f, 12.0215f, 58.9068f, 12.0141f, 58.9005f);
                instancePath2.cubicTo(11.9292f, 58.7465f, 11.699f, 58.1188f, 11.699f, 55.9637f);
                instancePath2.cubicTo(11.699f, 55.5233f, 11.9412f, 54.5242f, 13.1472f, 53.0458f);
                instancePath2.cubicTo(14.3128f, 51.617f, 16.1212f, 50.0712f, 18.489f, 48.637f);
                instancePath2.cubicTo(23.2392f, 45.7596f, 29.6263f, 43.7001f, 35.9394f, 43.7001f);
                instancePath2.cubicTo(42.2543f, 43.7001f, 48.6754f, 45.7607f, 53.4602f, 48.6427f);
                instancePath2.cubicTo(55.8451f, 50.0793f, 57.6686f, 51.6274f, 58.8443f, 53.0582f);
                instancePath2.cubicTo(60.062f, 54.5402f, 60.3014f, 55.535f, 60.3014f, 55.9637f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
