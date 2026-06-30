package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class mike_circle_regular extends l95.c {
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
        instancePath.moveTo(8.53711f, 12.4033f);
        instancePath.cubicTo(8.53758f, 14.4288f, 10.1805f, 16.0711f, 12.2061f, 16.0713f);
        instancePath.cubicTo(14.2317f, 16.0712f, 15.8736f, 14.4289f, 15.874f, 12.4033f);
        instancePath.lineTo(15.874f, 11.4883f);
        instancePath.lineTo(17.0742f, 11.4883f);
        instancePath.lineTo(17.0742f, 12.4033f);
        instancePath.cubicTo(17.0738f, 14.8887f, 15.2113f, 16.937f, 12.8057f, 17.2324f);
        instancePath.lineTo(12.8057f, 18.501f);
        instancePath.lineTo(11.6064f, 18.501f);
        instancePath.lineTo(11.6064f, 17.2324f);
        instancePath.cubicTo(9.20121f, 16.9367f, 7.33832f, 14.8885f, 7.33789f, 12.4033f);
        instancePath.lineTo(7.33789f, 11.4883f);
        instancePath.lineTo(8.53711f, 11.4883f);
        instancePath.lineTo(8.53711f, 12.4033f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(12.4863f, 6.01465f);
        instancePath2.cubicTo(13.87f, 6.15513f, 14.9502f, 7.32336f, 14.9502f, 8.74414f);
        instancePath2.lineTo(14.9502f, 12.4023f);
        instancePath2.lineTo(14.9355f, 12.6836f);
        instancePath2.cubicTo(14.7948f, 14.067f, 13.6266f, 15.1464f, 12.2061f, 15.1465f);
        instancePath2.lineTo(11.9258f, 15.1328f);
        instancePath2.cubicTo(10.6345f, 15.0017f, 9.6079f, 13.9748f, 9.47656f, 12.6836f);
        instancePath2.lineTo(9.46191f, 12.4023f);
        instancePath2.lineTo(9.46191f, 8.74414f);
        instancePath2.cubicTo(9.46191f, 7.22882f, 10.6908f, 6.00023f, 12.2061f, 6.0f);
        instancePath2.lineTo(12.4863f, 6.01465f);
        instancePath2.close();
        instancePath2.moveTo(12.2061f, 7.2002f);
        instancePath2.cubicTo(11.3535f, 7.20043f, 10.6621f, 7.89156f, 10.6621f, 8.74414f);
        instancePath2.lineTo(10.6621f, 12.4023f);
        instancePath2.cubicTo(10.6621f, 13.2549f, 11.3535f, 13.9461f, 12.2061f, 13.9463f);
        instancePath2.cubicTo(13.0587f, 13.9462f, 13.75f, 13.255f, 13.75f, 12.4023f);
        instancePath2.lineTo(13.75f, 8.74414f);
        instancePath2.cubicTo(13.75f, 7.89146f, 13.0587f, 7.20027f, 12.2061f, 7.2002f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(12.2061f, 2.0f);
        instancePath3.cubicTo(17.7289f, 2.0f, 22.2061f, 6.47715f, 22.2061f, 12.0f);
        instancePath3.cubicTo(22.2061f, 17.5228f, 17.7289f, 22.0f, 12.2061f, 22.0f);
        instancePath3.cubicTo(6.68335f, 21.9998f, 2.20605f, 17.5227f, 2.20605f, 12.0f);
        instancePath3.cubicTo(2.20605f, 6.47725f, 6.68335f, 2.00016f, 12.2061f, 2.0f);
        instancePath3.close();
        instancePath3.moveTo(12.2061f, 3.2002f);
        instancePath3.cubicTo(7.34609f, 3.20036f, 3.40625f, 7.14f, 3.40625f, 12.0f);
        instancePath3.cubicTo(3.40625f, 16.86f, 7.34609f, 20.7996f, 12.2061f, 20.7998f);
        instancePath3.cubicTo(17.0662f, 20.7998f, 21.0059f, 16.8601f, 21.0059f, 12.0f);
        instancePath3.cubicTo(21.0059f, 7.13989f, 17.0662f, 3.2002f, 12.2061f, 3.2002f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
