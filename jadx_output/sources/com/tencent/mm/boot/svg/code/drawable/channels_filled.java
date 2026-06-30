package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class channels_filled extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(21.6491f, 4.9411f);
                instancePath.cubicTo(22.3641f, 6.66967f, 21.8268f, 10.0509f, 21.4428f, 11.9126f);
                instancePath.cubicTo(20.8631f, 14.724f, 19.9295f, 17.524f, 19.0643f, 19.0461f);
                instancePath.cubicTo(18.4889f, 20.0584f, 17.9137f, 20.5747f, 17.2547f, 20.6709f);
                instancePath.cubicTo(17.1487f, 20.6864f, 17.0408f, 20.6942f, 16.9341f, 20.6942f);
                instancePath.cubicTo(14.9855f, 20.6942f, 13.1307f, 18.1503f, 11.9998f, 16.2119f);
                instancePath.cubicTo(10.8689f, 18.1505f, 9.01391f, 20.6942f, 7.06592f, 20.6942f);
                instancePath.cubicTo(6.95919f, 20.6942f, 6.85146f, 20.6864f, 6.74573f, 20.6709f);
                instancePath.cubicTo(6.08626f, 20.5747f, 5.51106f, 20.0584f, 4.93567f, 19.0461f);
                instancePath.cubicTo(4.07049f, 17.5238f, 3.13694f, 14.724f, 2.55717f, 11.9126f);
                instancePath.cubicTo(2.17318f, 10.0509f, 1.63595f, 6.66967f, 2.35087f, 4.9411f);
                instancePath.cubicTo(2.86922f, 3.68795f, 3.73559f, 3.4415f, 4.20624f, 3.40592f);
                instancePath.cubicTo(5.95389f, 3.27613f, 8.03246f, 5.42487f, 11.1446f, 10.5915f);
                instancePath.cubicTo(11.4594f, 11.114f, 11.7498f, 11.5994f, 12.0f, 12.0191f);
                instancePath.cubicTo(12.2516f, 11.5974f, 12.5424f, 11.1112f, 12.8554f, 10.5915f);
                instancePath.cubicTo(15.8287f, 5.65582f, 17.8505f, 3.47248f, 19.5574f, 3.40209f);
                instancePath.cubicTo(20.5342f, 3.38981f, 21.2898f, 4.072f, 21.6491f, 4.9411f);
                instancePath.close();
                instancePath.moveTo(4.21364f, 5.84156f);
                instancePath.cubicTo(3.84944f, 6.9618f, 4.1306f, 9.84839f, 4.91778f, 12.9771f);
                instancePath.cubicTo(5.68219f, 16.0157f, 6.5098f, 17.7304f, 6.9417f, 18.3815f);
                instancePath.cubicTo(7.05002f, 18.545f, 7.26249f, 18.6013f, 7.4356f, 18.5091f);
                instancePath.cubicTo(7.81642f, 18.3057f, 8.47906f, 17.7727f, 9.43686f, 16.3798f);
                instancePath.cubicTo(10.0369f, 15.5069f, 10.5338f, 14.6111f, 10.8198f, 14.0665f);
                instancePath.cubicTo(10.5133f, 13.549f, 9.9886f, 12.6659f, 9.37942f, 11.6546f);
                instancePath.cubicTo(6.67338f, 7.16218f, 5.24235f, 5.92791f, 4.66636f, 5.58904f);
                instancePath.cubicTo(4.43208f, 5.45106f, 4.29248f, 5.65658f, 4.21364f, 5.84156f);
                instancePath.close();
                instancePath.moveTo(19.7435f, 5.72399f);
                instancePath.cubicTo(19.6747f, 5.55883f, 19.4926f, 5.49542f, 19.3384f, 5.58586f);
                instancePath.cubicTo(18.7674f, 5.92036f, 17.3352f, 7.14827f, 14.6206f, 11.6546f);
                instancePath.cubicTo(14.0094f, 12.6693f, 13.4831f, 13.5547f, 13.1772f, 14.0715f);
                instancePath.cubicTo(14.3348f, 16.3271f, 15.6664f, 17.9697f, 16.4763f, 18.4733f);
                instancePath.cubicTo(16.6833f, 18.6019f, 16.9553f, 18.5452f, 17.0869f, 18.3403f);
                instancePath.cubicTo(17.5228f, 17.6624f, 18.3331f, 15.9557f, 19.0822f, 12.9771f);
                instancePath.cubicTo(19.8975f, 9.73665f, 20.17f, 6.75593f, 19.7453f, 5.72856f);
                instancePath.lineTo(19.7435f, 5.72399f);
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
