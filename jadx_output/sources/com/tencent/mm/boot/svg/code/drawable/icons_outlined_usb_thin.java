package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_usb_thin extends l95.c {
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
        instancePath.moveTo(1.45898f, 16.0312f);
        instancePath.cubicTo(1.45898f, 15.7057f, 1.5013f, 15.3932f, 1.58594f, 15.0938f);
        instancePath.cubicTo(1.67057f, 14.7943f, 1.77148f, 14.5111f, 1.88867f, 14.2441f);
        instancePath.lineTo(5.64844f, 6.03125f);
        instancePath.cubicTo(5.92839f, 5.40625f, 6.31576f, 4.93424f, 6.81055f, 4.61523f);
        instancePath.cubicTo(7.31185f, 4.29622f, 7.9043f, 4.13672f, 8.58789f, 4.13672f);
        instancePath.lineTo(16.3809f, 4.13672f);
        instancePath.cubicTo(17.0645f, 4.13672f, 17.6536f, 4.29622f, 18.1484f, 4.61523f);
        instancePath.cubicTo(18.6497f, 4.93424f, 19.0404f, 5.40625f, 19.3203f, 6.03125f);
        instancePath.lineTo(23.0605f, 14.2441f);
        instancePath.cubicTo(23.1777f, 14.5176f, 23.2819f, 14.804f, 23.373f, 15.1035f);
        instancePath.cubicTo(23.4642f, 15.3965f, 23.5098f, 15.7057f, 23.5098f, 16.0312f);
        instancePath.cubicTo(23.5098f, 16.7214f, 23.3372f, 17.3529f, 22.9922f, 17.9258f);
        instancePath.cubicTo(22.6536f, 18.4987f, 22.1947f, 18.9544f, 21.6152f, 19.293f);
        instancePath.cubicTo(21.0423f, 19.6315f, 20.3978f, 19.8008f, 19.6816f, 19.8008f);
        instancePath.lineTo(5.28711f, 19.8008f);
        instancePath.cubicTo(4.57096f, 19.8008f, 3.92318f, 19.6315f, 3.34375f, 19.293f);
        instancePath.cubicTo(2.77083f, 18.9544f, 2.31185f, 18.4987f, 1.9668f, 17.9258f);
        instancePath.cubicTo(1.62826f, 17.3529f, 1.45898f, 16.7214f, 1.45898f, 16.0312f);
        instancePath.close();
        instancePath.moveTo(2.18164f, 16.0312f);
        instancePath.cubicTo(2.18164f, 16.5911f, 2.31836f, 17.1022f, 2.5918f, 17.5645f);
        instancePath.cubicTo(2.86523f, 18.0267f, 3.23633f, 18.3978f, 3.70508f, 18.6777f);
        instancePath.cubicTo(4.18034f, 18.9512f, 4.70768f, 19.0879f, 5.28711f, 19.0879f);
        instancePath.lineTo(19.6816f, 19.0879f);
        instancePath.cubicTo(20.2676f, 19.0879f, 20.7949f, 18.9544f, 21.2637f, 18.6875f);
        instancePath.cubicTo(21.7324f, 18.4141f, 22.1035f, 18.0462f, 22.377f, 17.584f);
        instancePath.cubicTo(22.6504f, 17.1217f, 22.7871f, 16.6042f, 22.7871f, 16.0312f);
        instancePath.cubicTo(22.7871f, 15.4648f, 22.6504f, 14.9505f, 22.377f, 14.4883f);
        instancePath.cubicTo(22.1035f, 14.026f, 21.7324f, 13.6582f, 21.2637f, 13.3848f);
        instancePath.cubicTo(20.7949f, 13.1113f, 20.2676f, 12.9746f, 19.6816f, 12.9746f);
        instancePath.lineTo(5.28711f, 12.9746f);
        instancePath.cubicTo(4.70768f, 12.9746f, 4.18034f, 13.1113f, 3.70508f, 13.3848f);
        instancePath.cubicTo(3.23633f, 13.6582f, 2.86523f, 14.026f, 2.5918f, 14.4883f);
        instancePath.cubicTo(2.31836f, 14.9505f, 2.18164f, 15.4648f, 2.18164f, 16.0312f);
        instancePath.close();
        instancePath.moveTo(3.35352f, 12.8086f);
        instancePath.cubicTo(3.62695f, 12.6328f, 3.92643f, 12.4961f, 4.25195f, 12.3984f);
        instancePath.cubicTo(4.58398f, 12.3008f, 4.92904f, 12.252f, 5.28711f, 12.252f);
        instancePath.lineTo(19.6816f, 12.252f);
        instancePath.cubicTo(20.0332f, 12.252f, 20.3717f, 12.3008f, 20.6973f, 12.3984f);
        instancePath.cubicTo(21.0228f, 12.4896f, 21.3255f, 12.623f, 21.6055f, 12.7988f);
        instancePath.lineTo(18.627f, 6.24609f);
        instancePath.cubicTo(18.4121f, 5.77083f, 18.1224f, 5.41276f, 17.7578f, 5.17188f);
        instancePath.cubicTo(17.3932f, 4.92448f, 16.9603f, 4.80078f, 16.459f, 4.80078f);
        instancePath.lineTo(8.50977f, 4.80078f);
        instancePath.cubicTo(8.00846f, 4.80078f, 7.57552f, 4.92448f, 7.21094f, 5.17188f);
        instancePath.cubicTo(6.84635f, 5.41276f, 6.55664f, 5.77083f, 6.3418f, 6.24609f);
        instancePath.lineTo(3.35352f, 12.8086f);
        instancePath.close();
        instancePath.moveTo(18.5098f, 16.0312f);
        instancePath.cubicTo(18.5098f, 15.7318f, 18.6204f, 15.4714f, 18.8418f, 15.25f);
        instancePath.cubicTo(19.0697f, 15.0221f, 19.3398f, 14.9082f, 19.6523f, 14.9082f);
        instancePath.cubicTo(19.9453f, 14.9082f, 20.2025f, 15.0221f, 20.4238f, 15.25f);
        instancePath.cubicTo(20.6452f, 15.4714f, 20.7559f, 15.7318f, 20.7559f, 16.0312f);
        instancePath.cubicTo(20.7559f, 16.3372f, 20.6452f, 16.6009f, 20.4238f, 16.8223f);
        instancePath.cubicTo(20.2025f, 17.0371f, 19.9453f, 17.1445f, 19.6523f, 17.1445f);
        instancePath.cubicTo(19.3398f, 17.1445f, 19.0697f, 17.0404f, 18.8418f, 16.832f);
        instancePath.cubicTo(18.6204f, 16.6172f, 18.5098f, 16.3503f, 18.5098f, 16.0312f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
