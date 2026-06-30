package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class circle_3_filled extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
        }
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
            instancePath.moveTo(16.4963f, 9.78201f);
            instancePath.cubicTo(17.5344f, 7.50339f, 16.6898f, 4.76572f, 14.4767f, 3.48802f);
            instancePath.cubicTo(12.124f, 2.12969f, 9.11565f, 2.93578f, 7.75732f, 5.28848f);
            instancePath.cubicTo(6.39899f, 7.64118f, 7.20508f, 10.6496f, 9.55778f, 12.0079f);
            instancePath.cubicTo(10.1574f, 12.3541f, 10.7995f, 12.5596f, 11.4461f, 12.6349f);
            instancePath.cubicTo(12.5839f, 10.8492f, 14.5049f, 9.83462f, 16.4963f, 9.78201f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-16777216);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(6.57186f, 11.3989f);
            instancePath2.cubicTo(4.06194f, 11.641f, 2.09961f, 13.756f, 2.09961f, 16.3294f);
            instancePath2.cubicTo(2.09961f, 19.0653f, 4.31742f, 21.2831f, 7.05322f, 21.2831f);
            instancePath2.cubicTo(9.78903f, 21.2831f, 12.0068f, 19.0653f, 12.0068f, 16.3294f);
            instancePath2.cubicTo(12.0068f, 15.6322f, 11.8628f, 14.9687f, 11.6028f, 14.3669f);
            instancePath2.cubicTo(9.47261f, 14.2737f, 7.62049f, 13.1092f, 6.57186f, 11.3989f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-16777216);
            android.graphics.Path instancePath3 = l95.c.instancePath(looper);
            instancePath3.moveTo(19.3657f, 12.0453f);
            instancePath3.cubicTo(17.137f, 10.7586f, 14.3241f, 11.4005f, 12.8596f, 13.4532f);
            instancePath3.cubicTo(13.8164f, 15.2164f, 13.8988f, 17.4027f, 12.9144f, 19.2941f);
            instancePath3.cubicTo(13.3056f, 19.8201f, 13.8082f, 20.2766f, 14.412f, 20.6252f);
            instancePath3.cubicTo(16.7813f, 21.9931f, 19.8109f, 21.1814f, 21.1788f, 18.8121f);
            instancePath3.cubicTo(22.5467f, 16.4428f, 21.7349f, 13.4132f, 19.3657f, 12.0453f);
            instancePath3.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
            canvas.drawPath(instancePath3, instancePaint5);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
