package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_locate_to_chat_filled extends l95.c {
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(18.4996f, 11.0f);
        instancePath.cubicTo(21.537f, 11.0001f, 23.9994f, 13.4627f, 23.9996f, 16.5f);
        instancePath.cubicTo(23.9995f, 19.5374f, 21.537f, 21.9999f, 18.4996f, 22.0f);
        instancePath.cubicTo(15.4623f, 21.9999f, 12.9998f, 19.5374f, 12.9996f, 16.5f);
        instancePath.cubicTo(12.9998f, 13.4627f, 15.4623f, 11.0001f, 18.4996f, 11.0f);
        instancePath.close();
        instancePath.moveTo(16.5592f, 13.25f);
        instancePath.cubicTo(15.7864f, 13.2502f, 15.1593f, 13.8777f, 15.1588f, 14.6504f);
        instancePath.lineTo(15.1588f, 18.5947f);
        instancePath.lineTo(16.9586f, 18.5947f);
        instancePath.lineTo(16.9586f, 16.3096f);
        instancePath.lineTo(20.569f, 19.9219f);
        instancePath.lineTo(21.2057f, 19.2842f);
        instancePath.lineTo(21.8434f, 18.6475f);
        instancePath.lineTo(18.2438f, 15.0498f);
        instancePath.lineTo(20.5035f, 15.0498f);
        instancePath.lineTo(20.5035f, 13.25f);
        instancePath.lineTo(16.5592f, 13.25f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(20.2526f, 3.0f);
        instancePath2.cubicTo(21.081f, 3.0f, 21.7526f, 3.67157f, 21.7526f, 4.5f);
        instancePath2.lineTo(21.7526f, 9.74023f);
        instancePath2.cubicTo(20.7687f, 9.26592f, 19.665f, 9.00007f, 18.4996f, 9.0f);
        instancePath2.cubicTo(14.3577f, 9.00026f, 10.9996f, 12.358f, 10.9996f, 16.5f);
        instancePath2.cubicTo(10.9996f, 16.668f, 11.0063f, 16.8347f, 11.0172f, 17.0f);
        instancePath2.lineTo(4.49964f, 17.0f);
        instancePath2.cubicTo(3.67143f, 16.9997f, 2.99964f, 16.3283f, 2.99964f, 15.5f);
        instancePath2.lineTo(2.99964f, 12.5f);
        instancePath2.lineTo(0.511359f, 10.4268f);
        instancePath2.cubicTo(0.245594f, 10.2047f, 0.245531f, 9.79528f, 0.511359f, 9.57324f);
        instancePath2.lineTo(2.99964f, 7.5f);
        instancePath2.lineTo(2.99964f, 4.5f);
        instancePath2.cubicTo(2.99964f, 3.67173f, 3.67143f, 3.00026f, 4.49964f, 3.0f);
        instancePath2.lineTo(20.2526f, 3.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
