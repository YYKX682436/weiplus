package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_square extends l95.c {
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
        instancePath.moveTo(4.5f, 4.5f);
        instancePath.lineTo(4.5f, 19.5f);
        instancePath.lineTo(19.5f, 19.5f);
        instancePath.lineTo(19.5f, 4.5f);
        instancePath.lineTo(4.5f, 4.5f);
        instancePath.close();
        instancePath.moveTo(4.0f, 3.0f);
        instancePath.cubicTo(3.44772f, 3.0f, 3.0f, 3.44772f, 3.0f, 4.0f);
        instancePath.lineTo(3.0f, 20.0f);
        instancePath.cubicTo(3.0f, 20.5523f, 3.44772f, 21.0f, 4.0f, 21.0f);
        instancePath.lineTo(20.0f, 21.0f);
        instancePath.cubicTo(20.5523f, 21.0f, 21.0f, 20.5523f, 21.0f, 20.0f);
        instancePath.lineTo(21.0f, 4.0f);
        instancePath.cubicTo(21.0f, 3.44772f, 20.5523f, 3.0f, 20.0f, 3.0f);
        instancePath.lineTo(4.0f, 3.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(9.27441f, 15.6315f);
        instancePath2.lineTo(9.27441f, 8.29999f);
        instancePath2.lineTo(7.83496f, 8.29999f);
        instancePath2.cubicTo(7.5485f, 8.50767f, 7.26025f, 8.71535f, 6.97021f, 8.92303f);
        instancePath2.cubicTo(6.68018f, 9.13072f, 6.39014f, 9.3384f, 6.1001f, 9.54608f);
        instancePath2.lineTo(6.1001f, 10.8781f);
        instancePath2.cubicTo(6.2863f, 10.7456f, 6.4707f, 10.6149f, 6.65332f, 10.486f);
        instancePath2.cubicTo(6.83952f, 10.3535f, 7.02572f, 10.221f, 7.21191f, 10.0886f);
        instancePath2.cubicTo(7.39811f, 9.95608f, 7.58252f, 9.82538f, 7.76514f, 9.69647f);
        instancePath2.lineTo(7.83496f, 9.69647f);
        instancePath2.lineTo(7.83496f, 15.6315f);
        instancePath2.lineTo(9.27441f, 15.6315f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(10.9717f, 13.8537f);
        instancePath3.cubicTo(10.9717f, 14.1258f, 11.063f, 14.3443f, 11.2456f, 14.509f);
        instancePath3.cubicTo(11.4282f, 14.6737f, 11.6484f, 14.756f, 11.9062f, 14.756f);
        instancePath3.cubicTo(12.1712f, 14.756f, 12.395f, 14.6737f, 12.5776f, 14.509f);
        instancePath3.cubicTo(12.7638f, 14.3443f, 12.8569f, 14.1258f, 12.8569f, 13.8537f);
        instancePath3.cubicTo(12.8569f, 13.578f, 12.7638f, 13.356f, 12.5776f, 13.1877f);
        instancePath3.cubicTo(12.395f, 13.0194f, 12.1712f, 12.9352f, 11.9062f, 12.9352f);
        instancePath3.cubicTo(11.6449f, 12.9352f, 11.4229f, 13.0194f, 11.2402f, 13.1877f);
        instancePath3.cubicTo(11.0612f, 13.3524f, 10.9717f, 13.5744f, 10.9717f, 13.8537f);
        instancePath3.close();
        instancePath3.moveTo(10.9717f, 10.2497f);
        instancePath3.cubicTo(10.9717f, 10.5218f, 11.063f, 10.7403f, 11.2456f, 10.905f);
        instancePath3.cubicTo(11.4282f, 11.0697f, 11.6484f, 11.152f, 11.9062f, 11.152f);
        instancePath3.cubicTo(12.1712f, 11.152f, 12.395f, 11.0697f, 12.5776f, 10.905f);
        instancePath3.cubicTo(12.7638f, 10.7403f, 12.8569f, 10.5218f, 12.8569f, 10.2497f);
        instancePath3.cubicTo(12.8569f, 9.97398f, 12.7638f, 9.75197f, 12.5776f, 9.58368f);
        instancePath3.cubicTo(12.395f, 9.4118f, 12.1712f, 9.32587f, 11.9062f, 9.32587f);
        instancePath3.cubicTo(11.6449f, 9.32587f, 11.4229f, 9.41001f, 11.2402f, 9.57831f);
        instancePath3.cubicTo(11.0612f, 9.74302f, 10.9717f, 9.96682f, 10.9717f, 10.2497f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(17.3955f, 15.6315f);
        instancePath4.lineTo(17.3955f, 8.29999f);
        instancePath4.lineTo(15.9561f, 8.29999f);
        instancePath4.cubicTo(15.6696f, 8.50767f, 15.3813f, 8.71535f, 15.0913f, 8.92303f);
        instancePath4.cubicTo(14.8013f, 9.13072f, 14.5112f, 9.3384f, 14.2212f, 9.54608f);
        instancePath4.lineTo(14.2212f, 10.8781f);
        instancePath4.cubicTo(14.4074f, 10.7456f, 14.5918f, 10.6149f, 14.7744f, 10.486f);
        instancePath4.cubicTo(14.9606f, 10.3535f, 15.1468f, 10.221f, 15.333f, 10.0886f);
        instancePath4.cubicTo(15.5192f, 9.95608f, 15.7036f, 9.82538f, 15.8862f, 9.69647f);
        instancePath4.lineTo(15.9561f, 9.69647f);
        instancePath4.lineTo(15.9561f, 15.6315f);
        instancePath4.lineTo(17.3955f, 15.6315f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
