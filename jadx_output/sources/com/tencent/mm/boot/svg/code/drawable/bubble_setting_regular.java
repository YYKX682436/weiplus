package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class bubble_setting_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(20.0f, 6.5f);
        instancePath.cubicTo(20.0f, 5.11929f, 18.8807f, 4.0f, 17.5f, 4.0f);
        instancePath.lineTo(4.5f, 4.0f);
        instancePath.cubicTo(3.11929f, 4.0f, 2.0f, 5.11929f, 2.0f, 6.5f);
        instancePath.lineTo(2.0f, 15.0f);
        instancePath.cubicTo(2.0f, 16.3807f, 3.11929f, 17.5f, 4.5f, 17.5f);
        instancePath.lineTo(7.0f, 17.5f);
        instancePath.lineTo(7.0f, 19.09f);
        instancePath.cubicTo(7.0f, 19.3552f, 7.10536f, 19.6025f, 7.29289f, 19.79f);
        instancePath.cubicTo(7.68342f, 20.1805f, 8.31658f, 20.1805f, 8.70711f, 19.79f);
        instancePath.lineTo(11.0f, 17.5f);
        instancePath.lineTo(12.5f, 17.5f);
        instancePath.lineTo(12.5f, 16.3002f);
        instancePath.lineTo(10.5034f, 16.3f);
        instancePath.lineTo(8.199f, 18.6f);
        instancePath.lineTo(8.2f, 16.3f);
        instancePath.lineTo(4.5f, 16.3f);
        instancePath.lineTo(4.36708f, 16.2933f);
        instancePath.cubicTo(3.71155f, 16.2267f, 3.2f, 15.6731f, 3.2f, 15.0f);
        instancePath.lineTo(3.2f, 6.5f);
        instancePath.lineTo(3.20671f, 6.36708f);
        instancePath.cubicTo(3.27328f, 5.71155f, 3.8269f, 5.2f, 4.5f, 5.2f);
        instancePath.lineTo(17.5f, 5.2f);
        instancePath.lineTo(17.6329f, 5.20671f);
        instancePath.cubicTo(18.2885f, 5.27328f, 18.8f, 5.8269f, 18.8f, 6.5f);
        instancePath.lineTo(18.8f, 11.0626f);
        instancePath.cubicTo(18.8174f, 11.0713f, 18.8347f, 11.0807f, 18.8517f, 11.0905f);
        instancePath.lineTo(20.0005f, 11.7556f);
        instancePath.lineTo(20.0f, 6.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(18.3501f, 19.0f);
        instancePath2.cubicTo(19.1785f, 19.0f, 19.8501f, 18.3284f, 19.8501f, 17.5f);
        instancePath2.cubicTo(19.8501f, 16.6716f, 19.1785f, 16.0f, 18.3501f, 16.0f);
        instancePath2.cubicTo(17.5217f, 16.0f, 16.8501f, 16.6716f, 16.8501f, 17.5f);
        instancePath2.cubicTo(16.8501f, 18.3284f, 17.5217f, 19.0f, 18.3501f, 19.0f);
        instancePath2.close();
        instancePath2.moveTo(18.3501f, 18.0f);
        instancePath2.cubicTo(18.6262f, 18.0f, 18.8501f, 17.7761f, 18.8501f, 17.5f);
        instancePath2.cubicTo(18.8501f, 17.2239f, 18.6262f, 17.0f, 18.3501f, 17.0f);
        instancePath2.cubicTo(18.074f, 17.0f, 17.8501f, 17.2239f, 17.8501f, 17.5f);
        instancePath2.cubicTo(17.8501f, 17.7761f, 18.074f, 18.0f, 18.3501f, 18.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(18.8501f, 12.7887f);
        instancePath3.cubicTo(18.5407f, 12.61f, 18.1595f, 12.61f, 17.8501f, 12.7887f);
        instancePath3.lineTo(14.52f, 14.7113f);
        instancePath3.cubicTo(14.2106f, 14.89f, 14.02f, 15.2201f, 14.02f, 15.5774f);
        instancePath3.lineTo(14.02f, 19.4226f);
        instancePath3.cubicTo(14.02f, 19.7799f, 14.2106f, 20.11f, 14.52f, 20.2887f);
        instancePath3.lineTo(17.8501f, 22.2113f);
        instancePath3.cubicTo(18.1595f, 22.39f, 18.5407f, 22.39f, 18.8501f, 22.2113f);
        instancePath3.lineTo(22.1802f, 20.2887f);
        instancePath3.cubicTo(22.4896f, 20.11f, 22.6802f, 19.7799f, 22.6802f, 19.4226f);
        instancePath3.lineTo(22.6802f, 15.5774f);
        instancePath3.cubicTo(22.6802f, 15.2201f, 22.4896f, 14.89f, 22.1802f, 14.7113f);
        instancePath3.lineTo(18.8501f, 12.7887f);
        instancePath3.close();
        instancePath3.moveTo(18.3501f, 13.8856f);
        instancePath3.lineTo(15.22f, 15.6928f);
        instancePath3.lineTo(15.22f, 19.3072f);
        instancePath3.lineTo(18.3501f, 21.1144f);
        instancePath3.lineTo(21.4802f, 19.3072f);
        instancePath3.lineTo(21.4802f, 15.6928f);
        instancePath3.lineTo(18.3501f, 13.8856f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
