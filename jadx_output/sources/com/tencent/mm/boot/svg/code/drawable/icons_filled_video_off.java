package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_video_off extends l95.c {
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
        instancePath.moveTo(2.12978f, 5.24512f);
        instancePath.cubicTo(1.55598f, 5.24512f, 1.09082f, 5.71028f, 1.09082f, 6.28408f);
        instancePath.lineTo(1.09082f, 17.7127f);
        instancePath.cubicTo(1.09082f, 18.2865f, 1.55598f, 18.7516f, 2.12978f, 18.7516f);
        instancePath.lineTo(10.2083f, 18.7516f);
        instancePath.cubicTo(10.0883f, 18.2518f, 10.0248f, 17.7301f, 10.0248f, 17.1935f);
        instancePath.cubicTo(10.0248f, 13.5211f, 13.0018f, 10.5441f, 16.6741f, 10.5441f);
        instancePath.cubicTo(16.8493f, 10.5441f, 17.0229f, 10.5509f, 17.1947f, 10.5642f);
        instancePath.lineTo(17.1947f, 6.28408f);
        instancePath.cubicTo(17.1947f, 5.71028f, 16.7296f, 5.24512f, 16.1558f, 5.24512f);
        instancePath.lineTo(2.12978f, 5.24512f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(22.909f, 8.0782f);
        instancePath2.lineTo(22.909f, 14.8774f);
        instancePath2.cubicTo(22.1454f, 12.8226f, 20.395f, 11.2475f, 18.2337f, 10.728f);
        instancePath2.lineTo(18.2337f, 9.92044f);
        instancePath2.lineTo(21.1798f, 7.30167f);
        instancePath2.cubicTo(21.8498f, 6.70609f, 22.909f, 7.18174f, 22.909f, 8.0782f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-436207616);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(22.2548f, 17.4116f);
        instancePath3.cubicTo(22.2548f, 14.3991f, 19.8127f, 11.957f, 16.8002f, 11.957f);
        instancePath3.cubicTo(13.7878f, 11.957f, 11.3457f, 14.3991f, 11.3457f, 17.4116f);
        instancePath3.cubicTo(11.3457f, 20.424f, 13.7878f, 22.8661f, 16.8002f, 22.8661f);
        instancePath3.cubicTo(19.8127f, 22.8661f, 22.2548f, 20.424f, 22.2548f, 17.4116f);
        instancePath3.close();
        instancePath3.moveTo(12.6544f, 17.4107f);
        instancePath3.cubicTo(12.6544f, 16.5025f, 12.9465f, 15.6625f, 13.4418f, 14.9795f);
        instancePath3.lineTo(19.2311f, 20.7687f);
        instancePath3.cubicTo(18.5481f, 21.2641f, 17.7081f, 21.5562f, 16.7998f, 21.5562f);
        instancePath3.cubicTo(14.5104f, 21.5562f, 12.6544f, 19.7002f, 12.6544f, 17.4107f);
        instancePath3.close();
        instancePath3.moveTo(20.1569f, 19.8432f);
        instancePath3.lineTo(14.3673f, 14.0536f);
        instancePath3.cubicTo(15.0505f, 13.5577f, 15.891f, 13.2653f, 16.7998f, 13.2653f);
        instancePath3.cubicTo(19.0893f, 13.2653f, 20.9453f, 15.1213f, 20.9453f, 17.4107f);
        instancePath3.cubicTo(20.9453f, 18.3195f, 20.6528f, 19.16f, 20.1569f, 19.8432f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
