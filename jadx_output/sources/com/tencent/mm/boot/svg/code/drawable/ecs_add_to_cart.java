package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ecs_add_to_cart extends l95.c {
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
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(12.3001f, 8.20026f);
        instancePath.lineTo(13.7001f, 8.20026f);
        instancePath.lineTo(13.7001f, 10.5002f);
        instancePath.lineTo(16.0001f, 10.5002f);
        instancePath.lineTo(16.0001f, 11.9002f);
        instancePath.lineTo(13.7001f, 11.9002f);
        instancePath.lineTo(13.7001f, 14.2003f);
        instancePath.lineTo(12.3001f, 14.2003f);
        instancePath.lineTo(12.3001f, 11.9002f);
        instancePath.lineTo(10.0001f, 11.9002f);
        instancePath.lineTo(10.0001f, 10.5002f);
        instancePath.lineTo(12.3001f, 10.5002f);
        instancePath.lineTo(12.3001f, 8.20026f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(3.38292f, 4.25269f);
        instancePath2.cubicTo(4.35494f, 8.40328f, 5.3333f, 12.5515f, 6.3114f, 16.7f);
        instancePath2.cubicTo(6.42103f, 17.165f, 6.84429f, 17.4875f, 7.32172f, 17.4698f);
        instancePath2.lineTo(19.1907f, 17.0302f);
        instancePath2.cubicTo(19.6626f, 17.0128f, 20.058f, 16.6675f, 20.1389f, 16.2023f);
        instancePath2.lineTo(21.7997f, 6.65241f);
        instancePath2.cubicTo(21.9049f, 6.0473f, 21.4449f, 5.49122f, 20.8308f, 5.48121f);
        instancePath2.lineTo(5.04824f, 5.22389f);
        instancePath2.lineTo(4.71307f, 3.79265f);
        instancePath2.cubicTo(4.59498f, 3.28843f, 4.16676f, 2.91684f, 3.65093f, 2.87099f);
        instancePath2.lineTo(1.76105f, 2.70299f);
        instancePath2.cubicTo(1.37597f, 2.66876f, 1.03605f, 2.95318f, 1.00182f, 3.33826f);
        instancePath2.cubicTo(0.967584f, 3.72334f, 1.252f, 4.06326f, 1.63708f, 4.09749f);
        instancePath2.lineTo(3.38292f, 4.25269f);
        instancePath2.close();
        instancePath2.moveTo(7.59857f, 16.0586f);
        instancePath2.lineTo(5.37741f, 6.62944f);
        instancePath2.lineTo(20.3403f, 6.87339f);
        instancePath2.lineTo(18.8151f, 15.6432f);
        instancePath2.lineTo(7.59857f, 16.0586f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-436207616);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(6.40008f, 19.8002f);
        instancePath3.cubicTo(6.40008f, 20.463f, 5.86282f, 21.0002f, 5.20008f, 21.0002f);
        instancePath3.cubicTo(4.53734f, 21.0002f, 4.00008f, 20.463f, 4.00008f, 19.8002f);
        instancePath3.cubicTo(4.00008f, 19.1375f, 4.53734f, 18.6002f, 5.20008f, 18.6002f);
        instancePath3.cubicTo(5.86282f, 18.6002f, 6.40008f, 19.1375f, 6.40008f, 19.8002f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-436207616);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(19.2001f, 21.0002f);
        instancePath4.cubicTo(19.8628f, 21.0002f, 20.4001f, 20.463f, 20.4001f, 19.8002f);
        instancePath4.cubicTo(20.4001f, 19.1375f, 19.8628f, 18.6002f, 19.2001f, 18.6002f);
        instancePath4.cubicTo(18.5373f, 18.6002f, 18.0001f, 19.1375f, 18.0001f, 19.8002f);
        instancePath4.cubicTo(18.0001f, 20.463f, 18.5373f, 21.0002f, 19.2001f, 21.0002f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
