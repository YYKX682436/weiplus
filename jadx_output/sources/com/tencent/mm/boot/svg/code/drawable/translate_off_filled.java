package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class translate_off_filled extends l95.c {
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
        android.graphics.Matrix instanceMatrix = l95.c.instanceMatrix(looper);
        float[] instanceMatrixArray = l95.c.instanceMatrixArray(looper);
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
        instancePaint3.setColor(-436207616);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, 0.70710677f, -1.6820195f, -0.70710677f, 0.70710677f, 4.060585f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(4.06055f, 4.06067f);
        instancePath.lineTo(5.56055f, 4.06067f);
        instancePath.lineTo(5.56055f, 28.060669f);
        instancePath.lineTo(4.06055f, 28.060669f);
        instancePath.lineTo(4.06055f, 4.06067f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(15.4746f, 9.26953f);
        instancePath2.lineTo(17.1211f, 9.26953f);
        instancePath2.lineTo(17.5508f, 10.6367f);
        instancePath2.lineTo(18.8047f, 10.6367f);
        instancePath2.lineTo(16.8438f, 5.0f);
        instancePath2.lineTo(15.457f, 5.0f);
        instancePath2.lineTo(14.2419f, 8.5f);
        instancePath2.lineTo(10.0f, 8.5f);
        instancePath2.lineTo(10.0f, 3.00247f);
        instancePath2.cubicTo(10.0f, 2.45576f, 10.4488f, 2.0f, 11.0025f, 2.0f);
        instancePath2.lineTo(20.9975f, 2.0f);
        instancePath2.cubicTo(21.5442f, 2.0f, 22.0f, 2.44882f, 22.0f, 3.00247f);
        instancePath2.lineTo(22.0f, 12.9975f);
        instancePath2.cubicTo(22.0f, 13.5442f, 21.5512f, 14.0f, 20.9975f, 14.0f);
        instancePath2.lineTo(15.5f, 14.0f);
        instancePath2.lineTo(15.5f, 9.49269f);
        instancePath2.cubicTo(15.5f, 9.41596f, 15.4912f, 9.34126f, 15.4746f, 9.26953f);
        instancePath2.close();
        instancePath2.moveTo(16.1172f, 6.07812f);
        instancePath2.lineTo(16.1445f, 6.07812f);
        instancePath2.lineTo(16.8672f, 8.38672f);
        instancePath2.lineTo(15.3945f, 8.38672f);
        instancePath2.lineTo(16.1172f, 6.07812f);
        instancePath2.close();
        instancePath2.moveTo(7.87869f, 10.0f);
        instancePath2.lineTo(3.00247f, 10.0f);
        instancePath2.cubicTo(2.44882f, 10.0f, 2.0f, 10.4558f, 2.0f, 11.0025f);
        instancePath2.lineTo(2.0f, 20.9975f);
        instancePath2.cubicTo(2.0f, 21.5512f, 2.45576f, 22.0f, 3.00247f, 22.0f);
        instancePath2.lineTo(12.9975f, 22.0f);
        instancePath2.cubicTo(13.5512f, 22.0f, 14.0f, 21.5442f, 14.0f, 20.9975f);
        instancePath2.lineTo(14.0f, 16.1213f);
        instancePath2.lineTo(7.87869f, 10.0f);
        instancePath2.close();
        instancePath2.moveTo(10.0f, 10.0f);
        instancePath2.lineTo(14.0f, 14.0f);
        instancePath2.lineTo(14.0f, 11.0025f);
        instancePath2.cubicTo(14.0f, 10.4488f, 13.5442f, 10.0f, 12.9975f, 10.0f);
        instancePath2.lineTo(10.0f, 10.0f);
        instancePath2.close();
        instancePath2.moveTo(11.2253f, 13.669f);
        instancePath2.lineTo(11.2253f, 14.6969f);
        instancePath2.lineTo(10.1322f, 14.6969f);
        instancePath2.cubicTo(9.79197f, 15.6814f, 9.32868f, 16.4994f, 8.73509f, 17.1726f);
        instancePath2.cubicTo(9.45898f, 17.6938f, 10.3349f, 18.0775f, 11.3845f, 18.3091f);
        instancePath2.cubicTo(11.1456f, 18.5407f, 10.8344f, 19.004f, 10.6751f, 19.2936f);
        instancePath2.cubicTo(9.56032f, 19.004f, 8.65546f, 18.5552f, 7.90986f, 17.9544f);
        instancePath2.cubicTo(7.12082f, 18.5769f, 6.16529f, 19.033f, 5.02154f, 19.3515f);
        instancePath2.cubicTo(4.90572f, 19.0981f, 4.58721f, 18.6059f, 4.38452f, 18.3598f);
        instancePath2.cubicTo(5.49207f, 18.1137f, 6.39693f, 17.7372f, 7.12806f, 17.2016f);
        instancePath2.cubicTo(6.52723f, 16.5066f, 6.06394f, 15.6741f, 5.68752f, 14.6969f);
        instancePath2.lineTo(4.54378f, 14.6969f);
        instancePath2.lineTo(4.54378f, 13.669f);
        instancePath2.lineTo(7.5262f, 13.669f);
        instancePath2.cubicTo(7.45381f, 13.3794f, 7.32351f, 13.0102f, 7.18597f, 12.7207f);
        instancePath2.lineTo(8.31524f, 12.3877f);
        instancePath2.cubicTo(8.49621f, 12.7279f, 8.6989f, 13.184f, 8.77128f, 13.488f);
        instancePath2.lineTo(8.18494f, 13.669f);
        instancePath2.lineTo(11.2253f, 13.669f);
        instancePath2.close();
        instancePath2.moveTo(7.9315f, 16.4704f);
        instancePath2.cubicTo(8.35859f, 15.9782f, 8.69882f, 15.3918f, 8.94494f, 14.6969f);
        instancePath2.lineTo(6.78052f, 14.6969f);
        instancePath2.cubicTo(7.06283f, 15.3629f, 7.44649f, 15.9565f, 7.9315f, 16.4704f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
