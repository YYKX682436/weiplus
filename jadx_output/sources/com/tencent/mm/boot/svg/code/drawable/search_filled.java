package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class search_filled extends l95.c {
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
                instancePath.moveTo(11.3433f, 7.34475f);
                instancePath.lineTo(12.8955f, 4.12087f);
                instancePath.cubicTo(13.0746f, 3.73281f, 13.0746f, 3.34475f, 12.9254f, 2.98654f);
                instancePath.cubicTo(12.7761f, 2.62833f, 12.4776f, 2.35967f, 12.0597f, 2.21042f);
                instancePath.lineTo(11.7313f, 2.09102f);
                instancePath.cubicTo(11.5821f, 2.03132f, 11.4328f, 2.00146f, 11.2836f, 2.00146f);
                instancePath.cubicTo(10.6269f, 2.00146f, 10.0896f, 2.44923f, 9.9403f, 3.10594f);
                instancePath.lineTo(9.25373f, 6.59848f);
                instancePath.cubicTo(9.07463f, 7.4343f, 9.34328f, 8.21042f, 9.8209f, 8.38952f);
                instancePath.cubicTo(9.8806f, 8.41938f, 9.9403f, 8.41938f, 10.0299f, 8.41938f);
                instancePath.cubicTo(10.4776f, 8.44923f, 11.0149f, 8.00146f, 11.3433f, 7.34475f);
                instancePath.close();
                instancePath.moveTo(7.67164f, 9.61341f);
                instancePath.cubicTo(7.73134f, 9.10594f, 7.10448f, 8.56863f, 6.26866f, 8.38952f);
                instancePath.lineTo(3.70149f, 7.76266f);
                instancePath.cubicTo(3.58209f, 7.73281f, 3.46269f, 7.73281f, 3.34328f, 7.73281f);
                instancePath.cubicTo(2.65672f, 7.73281f, 2.08955f, 8.24027f, 2.02985f, 8.92684f);
                instancePath.lineTo(2.0f, 9.28505f);
                instancePath.cubicTo(2.0f, 9.70296f, 2.14925f, 10.091f, 2.41791f, 10.3597f);
                instancePath.cubicTo(2.65672f, 10.5985f, 2.98507f, 10.7179f, 3.34328f, 10.7179f);
                instancePath.cubicTo(4.24705f, 10.7179f, 5.15682f, 10.6395f, 6.0597f, 10.5985f);
                instancePath.cubicTo(6.92537f, 10.5089f, 7.61194f, 10.091f, 7.67164f, 9.61341f);
                instancePath.close();
                instancePath.moveTo(8.26866f, 12.4815f);
                instancePath.cubicTo(7.76119f, 12.3323f, 7.07463f, 12.8099f, 6.74627f, 13.586f);
                instancePath.lineTo(4.23881f, 19.0785f);
                instancePath.cubicTo(4.0597f, 19.4666f, 4.0597f, 19.8547f, 4.23881f, 20.2129f);
                instancePath.cubicTo(4.41791f, 20.5711f, 4.89172f, 20.8709f, 5.13433f, 20.9591f);
                instancePath.cubicTo(5.32349f, 21.0279f, 5.58507f, 21.0785f, 5.67164f, 21.0785f);
                instancePath.cubicTo(6.38806f, 21.0785f, 7.19403f, 20.7502f, 7.37314f, 20.0636f);
                instancePath.lineTo(8.83582f, 14.2129f);
                instancePath.cubicTo(8.98507f, 13.4069f, 8.77612f, 12.6308f, 8.26866f, 12.4815f);
                instancePath.close();
                instancePath.moveTo(12.6567f, 13.1382f);
                instancePath.cubicTo(12.2687f, 12.7203f, 11.7612f, 12.4517f, 11.3433f, 12.4517f);
                instancePath.cubicTo(11.1642f, 12.4517f, 11.0149f, 12.5114f, 10.8955f, 12.6009f);
                instancePath.cubicTo(10.5075f, 12.9293f, 10.5672f, 13.7352f, 11.0746f, 14.4517f);
                instancePath.lineTo(15.8209f, 21.377f);
                instancePath.cubicTo(16.0896f, 21.7949f, 16.5373f, 22.0039f, 16.9851f, 22.0039f);
                instancePath.cubicTo(17.3134f, 22.0039f, 17.6418f, 21.8845f, 17.9104f, 21.6755f);
                instancePath.lineTo(18.1791f, 21.4666f);
                instancePath.cubicTo(18.5075f, 21.1979f, 18.6866f, 20.8397f, 18.7164f, 20.4218f);
                instancePath.cubicTo(18.7463f, 20.0039f, 18.597f, 19.6158f, 18.3284f, 19.3173f);
                instancePath.lineTo(12.6567f, 13.1382f);
                instancePath.close();
                instancePath.moveTo(21.9701f, 9.3746f);
                instancePath.cubicTo(21.9104f, 8.50893f, 21.194f, 7.88206f, 20.3284f, 8.00146f);
                instancePath.lineTo(13.2836f, 9.04624f);
                instancePath.cubicTo(12.4478f, 9.16564f, 11.791f, 9.67311f, 11.8209f, 10.2104f);
                instancePath.cubicTo(11.8507f, 10.7477f, 12.5373f, 11.1656f, 13.403f, 11.1656f);
                instancePath.lineTo(20.3582f, 11.2552f);
                instancePath.lineTo(20.3881f, 11.2552f);
                instancePath.cubicTo(20.8358f, 11.2552f, 21.2836f, 11.0462f, 21.6119f, 10.7179f);
                instancePath.cubicTo(21.8806f, 10.4194f, 22.0f, 10.0612f, 22.0f, 9.70296f);
                instancePath.lineTo(21.9701f, 9.3746f);
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
