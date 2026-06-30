package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_all_member extends l95.c {
    private final int width = 40;
    private final int height = 40;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 40;
        }
        if (i17 != 2) {
            return 0;
        }
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
        instancePaint3.setColor(436207615);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 20.0f);
        instancePath.cubicTo(0.0f, 8.954305f, 8.954305f, 0.0f, 20.0f, 0.0f);
        instancePath.lineTo(20.0f, 0.0f);
        instancePath.cubicTo(31.045696f, 0.0f, 40.0f, 8.954305f, 40.0f, 20.0f);
        instancePath.lineTo(40.0f, 20.0f);
        instancePath.cubicTo(40.0f, 31.045696f, 31.045696f, 40.0f, 20.0f, 40.0f);
        instancePath.lineTo(20.0f, 40.0f);
        instancePath.cubicTo(8.954305f, 40.0f, 0.0f, 31.045696f, 0.0f, 20.0f);
        instancePath.lineTo(0.0f, 20.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-855638017);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(23.1111f, 12.0017f);
        instancePath2.cubicTo(24.92f, 12.0597f, 26.3684f, 13.5308f, 26.3684f, 15.3334f);
        instancePath2.lineTo(26.3684f, 16.7584f);
        instancePath2.cubicTo(26.3684f, 17.7076f, 25.8639f, 19.0689f, 25.2468f, 19.7928f);
        instancePath2.lineTo(24.9424f, 20.15f);
        instancePath2.cubicTo(24.4459f, 20.7323f, 24.601f, 21.4735f, 25.2952f, 21.8086f);
        instancePath2.lineTo(30.0618f, 24.1095f);
        instancePath2.cubicTo(30.58f, 24.3596f, 31.0f, 25.0208f, 31.0f, 25.5961f);
        instancePath2.lineTo(31.0f, 26.1678f);
        instancePath2.cubicTo(31.0f, 26.6274f, 30.6203f, 26.9999f, 30.1567f, 26.9999f);
        instancePath2.lineTo(29.4832f, 26.9999f);
        instancePath2.cubicTo(29.3608f, 25.8392f, 28.5814f, 24.6895f, 27.5435f, 24.1833f);
        instancePath2.lineTo(22.1269f, 21.5411f);
        instancePath2.lineTo(22.3146f, 21.3186f);
        instancePath2.cubicTo(23.2765f, 20.1784f, 24.0f, 18.202f, 24.0f, 16.7101f);
        instancePath2.lineTo(24.0f, 15.0001f);
        instancePath2.cubicTo(24.0f, 13.8942f, 23.6733f, 12.8643f, 23.1111f, 12.0017f);
        instancePath2.close();
        instancePath2.moveTo(15.8319f, 20.3501f);
        instancePath2.cubicTo(15.0963f, 19.4783f, 14.5f, 17.8495f, 14.5f, 16.7093f);
        instancePath2.lineTo(14.5f, 14.9996f);
        instancePath2.cubicTo(14.5f, 12.7907f, 16.2954f, 11.0f, 18.5f, 11.0f);
        instancePath2.cubicTo(20.7091f, 11.0f, 22.5f, 12.793f, 22.5f, 15.0002f);
        instancePath2.lineTo(22.5f, 16.7102f);
        instancePath2.cubicTo(22.5f, 17.8493f, 21.9009f, 19.4829f, 21.1681f, 20.3516f);
        instancePath2.lineTo(20.8066f, 20.7801f);
        instancePath2.cubicTo(20.217f, 21.479f, 20.4012f, 22.3684f, 21.2255f, 22.7705f);
        instancePath2.lineTo(26.8859f, 25.5316f);
        instancePath2.cubicTo(27.5012f, 25.8317f, 28.0f, 26.6252f, 28.0f, 27.3155f);
        instancePath2.lineTo(28.0f, 28.0016f);
        instancePath2.cubicTo(28.0f, 28.553f, 27.5491f, 29.0f, 26.9986f, 29.0f);
        instancePath2.lineTo(10.0014f, 29.0f);
        instancePath2.cubicTo(9.44836f, 29.0f, 9.0f, 28.5558f, 9.0f, 28.0016f);
        instancePath2.lineTo(9.0f, 27.3155f);
        instancePath2.cubicTo(9.0f, 26.6304f, 9.49815f, 25.8319f, 10.1141f, 25.5313f);
        instancePath2.lineTo(15.7745f, 22.7691f);
        instancePath2.cubicTo(16.5954f, 22.3685f, 16.7863f, 21.4813f, 16.1934f, 20.7786f);
        instancePath2.lineTo(15.8319f, 20.3501f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
