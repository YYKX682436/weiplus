package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_sound_effects_regular extends l95.c {
    private final int width = 25;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 25;
        }
        if (i17 == 1) {
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
            instancePath.moveTo(16.4327f, 1.88987f);
            instancePath.cubicTo(16.7527f, 1.97561f, 16.9428f, 2.30463f, 16.857f, 2.62471f);
            instancePath.lineTo(16.7568f, 2.99876f);
            instancePath.cubicTo(16.6943f, 3.23205f, 16.8088f, 3.47443f, 17.0147f, 3.60067f);
            instancePath.cubicTo(18.9336f, 4.77738f, 21.1049f, 8.1642f, 17.7074f, 11.3047f);
            instancePath.cubicTo(17.6001f, 11.4038f, 17.434f, 11.3011f, 17.4681f, 11.1591f);
            instancePath.cubicTo(18.0346f, 8.79798f, 17.9289f, 6.90806f, 16.1743f, 6.04512f);
            instancePath.cubicTo(16.0658f, 5.99174f, 15.938f, 6.05453f, 15.9067f, 6.17138f);
            instancePath.lineTo(12.8037f, 17.7518f);
            instancePath.cubicTo(12.4283f, 19.5118f, 10.4833f, 20.6486f, 8.4425f, 20.5955f);
            instancePath.cubicTo(6.19898f, 20.5372f, 4.14578f, 19.0485f, 4.19953f, 16.9836f);
            instancePath.cubicTo(4.25327f, 14.9187f, 6.38111f, 13.5388f, 8.62464f, 13.5973f);
            instancePath.cubicTo(9.88611f, 13.6301f, 11.0874f, 14.115f, 11.8878f, 14.9005f);
            instancePath.cubicTo(12.0358f, 15.0456f, 12.3015f, 14.9898f, 12.3551f, 14.7896f);
            instancePath.lineTo(15.6979f, 2.31413f);
            instancePath.cubicTo(15.7837f, 1.99405f, 16.1126f, 1.80409f, 16.4327f, 1.88987f);
            instancePath.close();
            instancePath.moveTo(5.39912f, 17.0148f);
            instancePath.cubicTo(5.42872f, 15.8772f, 6.71222f, 14.7479f, 8.59342f, 14.7969f);
            instancePath.cubicTo(10.4747f, 14.8459f, 11.6977f, 16.0404f, 11.668f, 17.178f);
            instancePath.cubicTo(11.6385f, 18.3156f, 10.355f, 19.4449f, 8.47374f, 19.3959f);
            instancePath.cubicTo(6.59254f, 19.347f, 5.36953f, 18.1524f, 5.39912f, 17.0148f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-16777216);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(6.36376f, 5.0f);
            instancePath2.cubicTo(6.73001f, 5.89754f, 7.07548f, 6.52254f, 7.40018f, 6.875f);
            instancePath2.cubicTo(7.72489f, 7.22746f, 8.30068f, 7.60246f, 9.12755f, 8.0f);
            instancePath2.cubicTo(8.28044f, 8.41951f, 7.70465f, 8.79451f, 7.40018f, 9.125f);
            instancePath2.cubicTo(7.09572f, 9.45548f, 6.75025f, 10.0805f, 6.36376f, 11.0f);
            instancePath2.cubicTo(5.97228f, 10.0751f, 5.6268f, 9.45005f, 5.32734f, 9.125f);
            instancePath2.cubicTo(5.02788f, 8.79995f, 4.4521f, 8.42495f, 3.59998f, 8.0f);
            instancePath2.cubicTo(4.44694f, 7.58065f, 5.02273f, 7.20565f, 5.32734f, 6.875f);
            instancePath2.cubicTo(5.63196f, 6.54435f, 5.97743f, 5.91935f, 6.36376f, 5.0f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-16777216);
            android.graphics.Path instancePath3 = l95.c.instancePath(looper);
            instancePath3.moveTo(19.7764f, 14.6423f);
            instancePath3.cubicTo(20.0856f, 15.4f, 20.3772f, 15.9276f, 20.6513f, 16.2251f);
            instancePath3.cubicTo(20.9254f, 16.5227f, 21.4115f, 16.8392f, 22.1095f, 17.1748f);
            instancePath3.cubicTo(21.3944f, 17.5289f, 20.9083f, 17.8455f, 20.6513f, 18.1245f);
            instancePath3.cubicTo(20.3943f, 18.4035f, 20.1027f, 18.9311f, 19.7764f, 19.7073f);
            instancePath3.cubicTo(19.446f, 18.9265f, 19.1543f, 18.3989f, 18.9015f, 18.1245f);
            instancePath3.cubicTo(18.6487f, 17.8501f, 18.1627f, 17.5335f, 17.4434f, 17.1748f);
            instancePath3.cubicTo(18.1583f, 16.8208f, 18.6444f, 16.5042f, 18.9015f, 16.2251f);
            instancePath3.cubicTo(19.1587f, 15.946f, 19.4503f, 15.4184f, 19.7764f, 14.6423f);
            instancePath3.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
            canvas.drawPath(instancePath3, instancePaint5);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
