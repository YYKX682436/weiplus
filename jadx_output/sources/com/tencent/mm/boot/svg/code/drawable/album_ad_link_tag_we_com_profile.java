package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class album_ad_link_tag_we_com_profile extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.666016f, 13.3333f);
        instancePath.lineTo(0.666016f, 12.877f);
        instancePath.cubicTo(0.666016f, 12.4202f, 0.998116f, 11.8879f, 1.40875f, 11.6876f);
        instancePath.lineTo(5.18232f, 9.8461f);
        instancePath.cubicTo(5.7296f, 9.57903f, 5.85685f, 8.98751f, 5.46165f, 8.51909f);
        instancePath.lineTo(5.22062f, 8.23343f);
        instancePath.cubicTo(4.73023f, 7.65219f, 4.33268f, 6.56633f, 4.33268f, 5.80619f);
        instancePath.lineTo(4.33268f, 4.66639f);
        instancePath.cubicTo(4.33268f, 3.19378f, 5.52959f, 2.0f, 6.99935f, 2.0f);
        instancePath.cubicTo(8.47211f, 2.0f, 9.66601f, 3.19532f, 9.66601f, 4.66681f);
        instancePath.lineTo(9.66601f, 5.80679f);
        instancePath.cubicTo(9.66601f, 6.5662f, 9.26664f, 7.65524f, 8.77807f, 8.23438f);
        instancePath.lineTo(8.53705f, 8.52009f);
        instancePath.cubicTo(8.14404f, 8.98597f, 8.26681f, 9.57893f, 8.81638f, 9.84701f);
        instancePath.lineTo(12.5899f, 11.6877f);
        instancePath.cubicTo(13.0001f, 11.8878f, 13.3327f, 12.4168f, 13.3327f, 12.877f);
        instancePath.lineTo(13.3327f, 13.3333f);
        instancePath.cubicTo(13.3327f, 13.7015f, 13.0342f, 14.0f, 12.666f, 14.0f);
        instancePath.lineTo(1.33268f, 14.0f);
        instancePath.cubicTo(0.964492f, 14.0f, 0.666016f, 13.7015f, 0.666016f, 13.3333f);
        instancePath.close();
        instancePath.moveTo(12.3327f, 13.0f);
        instancePath.lineTo(12.3327f, 12.8774f);
        instancePath.cubicTo(12.3327f, 12.8786f, 12.3323f, 12.8625f, 12.3219f, 12.83f);
        instancePath.cubicTo(12.3112f, 12.7964f, 12.2931f, 12.7563f, 12.2674f, 12.7153f);
        instancePath.cubicTo(12.2418f, 12.6742f, 12.2136f, 12.6405f, 12.1882f, 12.6162f);
        instancePath.cubicTo(12.1667f, 12.5957f, 12.1532f, 12.5876f, 12.1512f, 12.5864f);
        instancePath.cubicTo(12.151f, 12.5862f, 12.1512f, 12.5864f, 12.1512f, 12.5864f);
        instancePath.lineTo(8.37797f, 10.7458f);
        instancePath.cubicTo(7.8615f, 10.4939f, 7.46582f, 10.0421f, 7.34448f, 9.46272f);
        instancePath.cubicTo(7.2233f, 8.88413f, 7.40383f, 8.31254f, 7.7727f, 7.87529f);
        instancePath.lineTo(8.01372f, 7.58958f);
        instancePath.cubicTo(8.15995f, 7.41625f, 8.33129f, 7.11297f, 8.4662f, 6.74443f);
        instancePath.cubicTo(8.60113f, 6.37584f, 8.66602f, 6.03374f, 8.66602f, 5.80679f);
        instancePath.lineTo(8.66602f, 4.66681f);
        instancePath.cubicTo(8.66602f, 3.74723f, 7.91944f, 3.0f, 6.99935f, 3.0f);
        instancePath.cubicTo(6.08104f, 3.0f, 5.33268f, 3.7469f, 5.33268f, 4.66639f);
        instancePath.lineTo(5.33268f, 5.80619f);
        instancePath.cubicTo(5.33268f, 6.03403f, 5.39736f, 6.37569f, 5.53186f, 6.74327f);
        instancePath.cubicTo(5.66633f, 7.11077f, 5.83758f, 7.41393f, 5.98493f, 7.58857f);
        instancePath.lineTo(6.22595f, 7.87424f);
        instancePath.cubicTo(6.5963f, 8.31319f, 6.77647f, 8.88607f, 6.65369f, 9.46542f);
        instancePath.cubicTo(6.53105f, 10.0441f, 6.13478f, 10.494f, 5.62087f, 10.7448f);
        instancePath.lineTo(1.84813f, 12.5859f);
        instancePath.cubicTo(1.84604f, 12.5871f, 1.83254f, 12.5954f, 1.81155f, 12.6155f);
        instancePath.cubicTo(1.78603f, 12.64f, 1.75762f, 12.6741f, 1.73167f, 12.7157f);
        instancePath.cubicTo(1.70572f, 12.7573f, 1.6875f, 12.7978f, 1.67668f, 12.8316f);
        instancePath.cubicTo(1.66774f, 12.8595f, 1.66628f, 12.8751f, 1.66605f, 12.8775f);
        instancePath.lineTo(1.66602f, 13.0f);
        instancePath.lineTo(12.3327f, 13.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(12.4993f, 8.16667f);
        instancePath2.lineTo(10.666f, 8.16667f);
        instancePath2.lineTo(10.666f, 7.16667f);
        instancePath2.lineTo(12.4993f, 7.16667f);
        instancePath2.lineTo(12.4993f, 5.33333f);
        instancePath2.lineTo(13.4993f, 5.33333f);
        instancePath2.lineTo(13.4993f, 7.16667f);
        instancePath2.lineTo(15.3327f, 7.16667f);
        instancePath2.lineTo(15.3327f, 8.16667f);
        instancePath2.lineTo(13.4993f, 8.16667f);
        instancePath2.lineTo(13.4993f, 10.0f);
        instancePath2.lineTo(12.4993f, 10.0f);
        instancePath2.lineTo(12.4993f, 8.16667f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
