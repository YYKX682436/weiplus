package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_giff_effect_on extends l95.c {
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
                instancePaint3.setColor(-436207616);
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(57.087f, 48.0f);
                instancePath.lineTo(59.3587f, 54.6413f);
                instancePath.lineTo(66.0f, 56.913f);
                instancePath.lineTo(59.3587f, 59.1848f);
                instancePath.lineTo(57.087f, 66.0f);
                instancePath.lineTo(54.8152f, 59.1848f);
                instancePath.lineTo(48.0f, 56.913f);
                instancePath.lineTo(54.8152f, 54.6413f);
                instancePath.lineTo(57.087f, 48.0f);
                instancePath.close();
                instancePath.moveTo(30.2089f, 38.6092f);
                instancePath.lineTo(33.3911f, 41.7909f);
                instancePath.lineTo(10.5952f, 64.5909f);
                instancePath.lineTo(7.4129f, 61.4092f);
                instancePath.lineTo(30.2089f, 38.6092f);
                instancePath.close();
                instancePath.moveTo(36.4309f, 2.98864f);
                instancePath.lineTo(36.6773f, 3.14553f);
                instancePath.lineTo(48.4872f, 12.0045f);
                instancePath.lineTo(62.2854f, 7.44241f);
                instancePath.cubicTo(63.69f, 6.97782f, 65.0242f, 8.312f, 64.5596f, 9.7166f);
                instancePath.lineTo(59.9953f, 23.5127f);
                instancePath.lineTo(68.8565f, 35.3247f);
                instancePath.cubicTo(69.6978f, 36.4459f, 68.9877f, 38.012f, 67.6685f, 38.1887f);
                instancePath.lineTo(67.3768f, 38.2046f);
                instancePath.lineTo(52.7744f, 37.8783f);
                instancePath.lineTo(44.4579f, 49.7174f);
                instancePath.cubicTo(43.656f, 50.859f, 41.9539f, 50.6779f, 41.3713f, 49.4827f);
                instancePath.lineTo(41.2703f, 49.2302f);
                instancePath.lineTo(36.7923f, 35.2054f);
                instancePath.lineTo(22.7718f, 30.7317f);
                instancePath.cubicTo(21.4428f, 30.3073f, 21.1072f, 28.6288f, 22.0739f, 27.7159f);
                instancePath.lineTo(22.2846f, 27.5441f);
                instancePath.lineTo(34.1216f, 19.2255f);
                instancePath.lineTo(33.7974f, 4.62518f);
                instancePath.cubicTo(33.7663f, 3.22371f, 35.2555f, 2.3641f, 36.4309f, 2.98864f);
                instancePath.close();
                instancePath.moveTo(38.4194f, 10.0741f);
                instancePath.lineTo(38.6738f, 21.5265f);
                instancePath.lineTo(29.3232f, 28.0969f);
                instancePath.lineTo(40.3728f, 31.6243f);
                instancePath.lineTo(43.903f, 42.6767f);
                instancePath.lineTo(50.473f, 33.3257f);
                instancePath.lineTo(61.9236f, 33.5784f);
                instancePath.lineTo(54.9844f, 24.3319f);
                instancePath.lineTo(58.5995f, 13.3982f);
                instancePath.lineTo(47.6676f, 17.0151f);
                instancePath.lineTo(38.4194f, 10.0741f);
                instancePath.close();
                instancePath.moveTo(12.1174f, 6.00002f);
                instancePath.lineTo(13.5259f, 10.4741f);
                instancePath.lineTo(18.0f, 12.1174f);
                instancePath.lineTo(13.5259f, 13.5259f);
                instancePath.lineTo(12.1174f, 18.0f);
                instancePath.lineTo(10.4741f, 13.5259f);
                instancePath.lineTo(6.0f, 12.1174f);
                instancePath.lineTo(10.4741f, 10.4741f);
                instancePath.lineTo(12.1174f, 6.00002f);
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
