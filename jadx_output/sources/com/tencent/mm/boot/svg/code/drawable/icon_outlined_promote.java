package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_outlined_promote extends l95.c {
    private final int width = 25;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 25;
        }
        if (i17 == 1) {
            return 24;
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
        instancePaint3.setColor(-436207616);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(11.1036f, 7.11304f);
        instancePath.cubicTo(10.908f, 6.9174f, 10.6963f, 6.74755f, 10.4729f, 6.6035f);
        instancePath.cubicTo(9.00127f, 5.65485f, 7.018f, 5.82472f, 5.72966f, 7.11307f);
        instancePath.cubicTo(4.24567f, 8.59706f, 4.24564f, 11.0031f, 5.72966f, 12.4871f);
        instancePath.lineTo(5.72965f, 12.4871f);
        instancePath.cubicTo(6.84043f, 13.5978f, 8.4688f, 13.878f, 9.84112f, 13.3242f);
        instancePath.cubicTo(10.2999f, 13.139f, 10.7303f, 12.8604f, 11.1036f, 12.487f);
        instancePath.lineTo(12.085f, 11.5057f);
        instancePath.lineTo(10.5656f, 11.5057f);
        instancePath.lineTo(10.5656f, 10.3057f);
        instancePath.lineTo(13.4335f, 10.3057f);
        instancePath.cubicTo(13.8202f, 10.3057f, 14.1336f, 10.6193f, 14.1336f, 11.0058f);
        instancePath.lineTo(14.1336f, 13.9057f);
        instancePath.lineTo(12.9336f, 13.9057f);
        instancePath.lineTo(12.9336f, 12.3541f);
        instancePath.lineTo(11.9522f, 13.3356f);
        instancePath.cubicTo(11.4627f, 13.825f, 10.8958f, 14.1925f, 10.2902f, 14.437f);
        instancePath.cubicTo(8.48735f, 15.1646f, 6.34417f, 14.7987f, 4.88109f, 13.3356f);
        instancePath.cubicTo(2.92847f, 11.383f, 2.92847f, 8.21713f, 4.88109f, 6.26451f);
        instancePath.cubicTo(6.3484f, 4.79721f, 8.50077f, 4.43252f, 10.3086f, 5.17043f);
        instancePath.cubicTo(10.9066f, 5.4145f, 11.4668f, 5.77919f, 11.9522f, 6.26451f);
        instancePath.lineTo(11.9522f, 6.26454f);
        instancePath.lineTo(12.6593f, 6.97165f);
        instancePath.lineTo(13.3664f, 6.26454f);
        instancePath.cubicTo(15.319f, 4.31193f, 18.4849f, 4.31197f, 20.4375f, 6.26454f);
        instancePath.cubicTo(22.3902f, 8.21719f, 22.3901f, 11.383f, 20.4375f, 13.3356f);
        instancePath.lineTo(13.2957f, 20.4774f);
        instancePath.cubicTo(12.9442f, 20.8288f, 12.3744f, 20.8288f, 12.0229f, 20.4774f);
        instancePath.lineTo(8.77024f, 17.2247f);
        instancePath.lineTo(9.61877f, 16.3762f);
        instancePath.lineTo(12.6593f, 19.4167f);
        instancePath.lineTo(19.589f, 12.4871f);
        instancePath.cubicTo(21.073f, 11.0031f, 21.073f, 8.59709f, 19.589f, 7.11307f);
        instancePath.cubicTo(18.105f, 5.62912f, 15.6989f, 5.62909f, 14.215f, 7.11307f);
        instancePath.lineTo(12.6593f, 8.6687f);
        instancePath.lineTo(11.1037f, 7.11307f);
        instancePath.lineTo(11.1036f, 7.11304f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
