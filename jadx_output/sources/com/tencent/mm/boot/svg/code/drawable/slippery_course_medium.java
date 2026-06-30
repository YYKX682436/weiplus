package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class slippery_course_medium extends l95.c {
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
        instancePath.moveTo(19.8984f, 8.8999f);
        instancePath.cubicTo(19.4901f, 10.6757f, 17.8997f, 12.0f, 16.0f, 12.0f);
        instancePath.cubicTo(14.1003f, 12.0f, 12.5099f, 10.6757f, 12.1016f, 8.8999f);
        instancePath.lineTo(2.0f, 8.8999f);
        instancePath.lineTo(2.0f, 7.3999f);
        instancePath.lineTo(12.0447f, 7.3999f);
        instancePath.cubicTo(12.3342f, 5.47544f, 13.9948f, 4.0f, 16.0f, 4.0f);
        instancePath.cubicTo(18.0193f, 4.0f, 19.6891f, 5.49628f, 19.9612f, 7.44059f);
        instancePath.cubicTo(19.9593f, 7.42701f, 19.9573f, 7.41344f, 19.9553f, 7.3999f);
        instancePath.lineTo(22.0f, 7.3999f);
        instancePath.lineTo(22.0f, 8.8999f);
        instancePath.lineTo(19.8984f, 8.8999f);
        instancePath.close();
        instancePath.moveTo(18.5f, 8.0f);
        instancePath.cubicTo(18.5f, 9.38071f, 17.3807f, 10.5f, 16.0f, 10.5f);
        instancePath.cubicTo(14.6193f, 10.5f, 13.5f, 9.38071f, 13.5f, 8.0f);
        instancePath.cubicTo(13.5f, 6.61929f, 14.6193f, 5.5f, 16.0f, 5.5f);
        instancePath.cubicTo(17.3807f, 5.5f, 18.5f, 6.61929f, 18.5f, 8.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(11.0039f, 17.0f);
        instancePath2.cubicTo(11.0039f, 18.6569f, 9.66076f, 20.0f, 8.00391f, 20.0f);
        instancePath2.cubicTo(6.66615f, 20.0f, 5.53291f, 19.1244f, 5.14601f, 17.915f);
        instancePath2.lineTo(2.0f, 17.915f);
        instancePath2.lineTo(2.0f, 16.415f);
        instancePath2.lineTo(5.0609f, 16.415f);
        instancePath2.cubicTo(5.33303f, 15.0382f, 6.54722f, 14.0f, 8.00391f, 14.0f);
        instancePath2.cubicTo(9.66076f, 14.0f, 11.0039f, 15.3431f, 11.0039f, 17.0f);
        instancePath2.close();
        instancePath2.moveTo(9.50391f, 17.0f);
        instancePath2.cubicTo(9.50391f, 17.8284f, 8.83233f, 18.5f, 8.00391f, 18.5f);
        instancePath2.cubicTo(7.17548f, 18.5f, 6.50391f, 17.8284f, 6.50391f, 17.0f);
        instancePath2.cubicTo(6.50391f, 16.1716f, 7.17548f, 15.5f, 8.00391f, 15.5f);
        instancePath2.cubicTo(8.83233f, 15.5f, 9.50391f, 16.1716f, 9.50391f, 17.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(11.0039f, 17.0f);
        instancePath3.cubicTo(11.0039f, 17.3191f, 10.9546f, 17.6266f, 10.8623f, 17.915f);
        instancePath3.lineTo(22.0f, 17.915f);
        instancePath3.lineTo(22.0f, 16.415f);
        instancePath3.lineTo(10.9474f, 16.415f);
        instancePath3.cubicTo(10.9848f, 16.6042f, 11.0039f, 16.7998f, 11.0039f, 17.0f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
