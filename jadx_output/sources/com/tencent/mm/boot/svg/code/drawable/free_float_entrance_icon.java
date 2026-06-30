package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class free_float_entrance_icon extends l95.c {
    private final int width = 12;
    private final int height = 12;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 12;
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
                instancePaint3.setColor(-2130706433);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(6.0f, 0.750244f);
                instancePath.cubicTo(7.24264f, 0.750244f, 8.25f, 1.7576f, 8.25f, 3.00024f);
                instancePath.lineTo(8.2496f, 4.24944f);
                instancePath.lineTo(9.45013f, 4.25024f);
                instancePath.cubicTo(9.75381f, 4.25024f, 10.0f, 4.49711f, 10.0f, 4.80443f);
                instancePath.lineTo(10.0f, 10.1961f);
                instancePath.cubicTo(10.0f, 10.5021f, 9.7518f, 10.7502f, 9.45013f, 10.7502f);
                instancePath.lineTo(2.54987f, 10.7502f);
                instancePath.cubicTo(2.24619f, 10.7502f, 2.0f, 10.5034f, 2.0f, 10.1961f);
                instancePath.lineTo(2.0f, 4.80443f);
                instancePath.cubicTo(2.0f, 4.49836f, 2.2482f, 4.25024f, 2.54987f, 4.25024f);
                instancePath.lineTo(3.7496f, 4.24944f);
                instancePath.lineTo(3.75f, 3.00024f);
                instancePath.cubicTo(3.75f, 1.7576f, 4.75736f, 0.750244f, 6.0f, 0.750244f);
                instancePath.close();
                instancePath.moveTo(6.0f, 6.25024f);
                instancePath.cubicTo(5.58579f, 6.25024f, 5.25f, 6.58603f, 5.25f, 7.00024f);
                instancePath.cubicTo(5.25f, 7.30784f, 5.43517f, 7.57219f, 5.70013f, 7.68789f);
                instancePath.lineTo(5.7f, 8.75024f);
                instancePath.lineTo(6.3f, 8.75024f);
                instancePath.lineTo(6.30104f, 7.68738f);
                instancePath.cubicTo(6.56537f, 7.57141f, 6.75f, 7.30739f, 6.75f, 7.00024f);
                instancePath.cubicTo(6.75f, 6.58603f, 6.41421f, 6.25024f, 6.0f, 6.25024f);
                instancePath.close();
                instancePath.moveTo(6.0f, 1.50024f);
                instancePath.cubicTo(5.17157f, 1.50024f, 4.5f, 2.17182f, 4.5f, 3.00024f);
                instancePath.lineTo(4.4996f, 4.24944f);
                instancePath.lineTo(7.4996f, 4.24944f);
                instancePath.lineTo(7.5f, 3.00024f);
                instancePath.cubicTo(7.5f, 2.17182f, 6.82843f, 1.50024f, 6.0f, 1.50024f);
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
