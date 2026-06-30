package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class voice2txt_trans_eng_img extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(5.3333335f, 4.0f);
        instancePath.lineTo(26.666666f, 4.0f);
        instancePath.cubicTo(27.403046f, 4.0f, 28.0f, 4.596954f, 28.0f, 5.3333335f);
        instancePath.lineTo(28.0f, 26.666666f);
        instancePath.cubicTo(28.0f, 27.403046f, 27.403046f, 28.0f, 26.666666f, 28.0f);
        instancePath.lineTo(5.3333335f, 28.0f);
        instancePath.cubicTo(4.596954f, 28.0f, 4.0f, 27.403046f, 4.0f, 26.666666f);
        instancePath.lineTo(4.0f, 5.3333335f);
        instancePath.cubicTo(4.0f, 4.596954f, 4.596954f, 4.0f, 5.3333335f, 4.0f);
        instancePath.close();
        instancePath.moveTo(8.0f, 10.666667f);
        instancePath.lineTo(8.0f, 21.495667f);
        instancePath.lineTo(16.038334f, 21.495667f);
        instancePath.lineTo(16.038334f, 20.085167f);
        instancePath.lineTo(9.653167f, 20.085167f);
        instancePath.lineTo(9.653167f, 16.642334f);
        instancePath.lineTo(15.4165f, 16.642334f);
        instancePath.lineTo(15.4165f, 15.231833f);
        instancePath.lineTo(9.653167f, 15.231833f);
        instancePath.lineTo(9.653167f, 12.077167f);
        instancePath.lineTo(15.7805f, 12.077167f);
        instancePath.lineTo(15.7805f, 10.666667f);
        instancePath.lineTo(8.0f, 10.666667f);
        instancePath.close();
        instancePath.moveTo(21.543833f, 13.442166f);
        instancePath.cubicTo(21.0585f, 13.442166f, 20.618668f, 13.533167f, 20.224333f, 13.7455f);
        instancePath.cubicTo(19.83f, 13.942667f, 19.481167f, 14.230833f, 19.177834f, 14.625167f);
        instancePath.lineTo(19.177834f, 13.6545f);
        instancePath.lineTo(17.570168f, 13.6545f);
        instancePath.lineTo(17.570168f, 21.495667f);
        instancePath.lineTo(19.177834f, 21.495667f);
        instancePath.lineTo(19.177834f, 16.778833f);
        instancePath.cubicTo(19.2385f, 16.141832f, 19.466f, 15.641334f, 19.83f, 15.277333f);
        instancePath.cubicTo(20.163666f, 14.943666f, 20.573166f, 14.792f, 21.028166f, 14.792f);
        instancePath.cubicTo(22.2415f, 14.792f, 22.863333f, 15.459333f, 22.863333f, 16.794f);
        instancePath.lineTo(22.863333f, 21.495667f);
        instancePath.lineTo(24.471f, 21.495667f);
        instancePath.lineTo(24.471f, 16.6575f);
        instancePath.cubicTo(24.471f, 14.503834f, 23.485167f, 13.442166f, 21.543833f, 13.442166f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
