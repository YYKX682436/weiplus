package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class bubble_plus_circle_regular extends l95.c {
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
        instancePath.moveTo(19.0078f, 16.9189f);
        instancePath.lineTo(20.8984f, 16.9189f);
        instancePath.lineTo(20.8984f, 17.999f);
        instancePath.lineTo(19.0078f, 17.999f);
        instancePath.lineTo(19.0078f, 19.8623f);
        instancePath.lineTo(17.9277f, 19.8623f);
        instancePath.lineTo(17.9277f, 17.999f);
        instancePath.lineTo(16.1064f, 17.999f);
        instancePath.lineTo(16.1064f, 16.9189f);
        instancePath.lineTo(17.9277f, 16.9189f);
        instancePath.lineTo(17.9277f, 15.1152f);
        instancePath.lineTo(19.0078f, 15.1152f);
        instancePath.lineTo(19.0078f, 16.9189f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(18.5f, 13.0f);
        instancePath2.cubicTo(20.9853f, 13.0f, 23.0f, 15.0147f, 23.0f, 17.5f);
        instancePath2.cubicTo(23.0f, 19.9853f, 20.9853f, 22.0f, 18.5f, 22.0f);
        instancePath2.cubicTo(16.6194f, 22.0f, 15.0086f, 20.8462f, 14.3359f, 19.208f);
        instancePath2.cubicTo(14.3272f, 19.1868f, 14.3199f, 19.165f, 14.3115f, 19.1436f);
        instancePath2.cubicTo(14.2839f, 19.0733f, 14.2575f, 19.0026f, 14.2334f, 18.9307f);
        instancePath2.cubicTo(14.2309f, 18.9231f, 14.2281f, 18.9157f, 14.2256f, 18.9082f);
        instancePath2.lineTo(14.2021f, 18.8379f);
        instancePath2.cubicTo(14.0707f, 18.4153f, 14.0f, 17.9659f, 14.0f, 17.5f);
        instancePath2.cubicTo(14.0f, 15.0147f, 16.0147f, 13.0f, 18.5f, 13.0f);
        instancePath2.close();
        instancePath2.moveTo(18.5f, 14.0801f);
        instancePath2.cubicTo(16.6112f, 14.0801f, 15.0801f, 15.6112f, 15.0801f, 17.5f);
        instancePath2.cubicTo(15.0801f, 19.3888f, 16.6112f, 20.9199f, 18.5f, 20.9199f);
        instancePath2.cubicTo(20.3888f, 20.9199f, 21.9199f, 19.3888f, 21.9199f, 17.5f);
        instancePath2.cubicTo(21.9199f, 15.6112f, 20.3888f, 14.0801f, 18.5f, 14.0801f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(11.0f, 2.98633f);
        instancePath3.cubicTo(16.5228f, 2.98633f, 21.0f, 6.79191f, 21.0f, 11.4863f);
        instancePath3.cubicTo(21.0f, 11.7782f, 20.9792f, 12.0663f, 20.9453f, 12.3506f);
        instancePath3.cubicTo(20.5761f, 12.1749f, 20.1851f, 12.0387f, 19.7773f, 11.9453f);
        instancePath3.cubicTo(19.7897f, 11.7933f, 19.7998f, 11.6405f, 19.7998f, 11.4863f);
        instancePath3.cubicTo(19.7998f, 7.50181f, 15.8994f, 4.18652f, 11.0f, 4.18652f);
        instancePath3.cubicTo(6.10057f, 4.18652f, 2.2002f, 7.50181f, 2.2002f, 11.4863f);
        instancePath3.cubicTo(2.2002f, 13.5622f, 3.25699f, 15.5122f, 5.10059f, 16.8975f);
        instancePath3.lineTo(5.65137f, 17.3115f);
        instancePath3.lineTo(5.41602f, 19.334f);
        instancePath3.lineTo(7.66699f, 18.2539f);
        instancePath3.lineTo(8.10742f, 18.3818f);
        instancePath3.cubicTo(9.02865f, 18.6486f, 10.0023f, 18.7861f, 11.0f, 18.7861f);
        instancePath3.cubicTo(11.6566f, 18.7861f, 12.2947f, 18.7238f, 12.9082f, 18.6104f);
        instancePath3.cubicTo(12.9874f, 19.0113f, 13.1091f, 19.3968f, 13.2676f, 19.7627f);
        instancePath3.cubicTo(12.539f, 19.9074f, 11.7803f, 19.9863f, 11.0f, 19.9863f);
        instancePath3.cubicTo(9.87102f, 19.9863f, 8.78571f, 19.8273f, 7.77344f, 19.5342f);
        instancePath3.lineTo(4.79004f, 20.9648f);
        instancePath3.cubicTo(4.70504f, 21.0055f, 4.6102f, 21.0216f, 4.5166f, 21.0107f);
        instancePath3.cubicTo(4.24233f, 20.9789f, 4.04627f, 20.7303f, 4.07812f, 20.4561f);
        instancePath3.lineTo(4.37988f, 17.8574f);
        instancePath3.cubicTo(2.30712f, 16.3f, 1.0f, 14.0227f, 1.0f, 11.4863f);
        instancePath3.cubicTo(1.0f, 6.79191f, 5.47715f, 2.98633f, 11.0f, 2.98633f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
