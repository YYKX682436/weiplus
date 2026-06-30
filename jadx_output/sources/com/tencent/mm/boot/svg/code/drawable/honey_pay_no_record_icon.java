package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class honey_pay_no_record_icon extends l95.c {
    private final int width = 26;
    private final int height = 30;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 26;
        }
        if (i17 == 1) {
            return 30;
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -174.0f, 0.0f, 1.0f, -448.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-3684409);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(199.0f, 450.0f);
        instancePath.cubicTo(199.55229f, 450.0f, 200.0f, 450.44772f, 200.0f, 451.0f);
        instancePath.lineTo(200.0f, 477.0f);
        instancePath.cubicTo(200.0f, 477.55228f, 199.55229f, 478.0f, 199.0f, 478.0f);
        instancePath.lineTo(175.0f, 478.0f);
        instancePath.cubicTo(174.44771f, 478.0f, 174.0f, 477.55228f, 174.0f, 477.0f);
        instancePath.lineTo(174.0f, 451.0f);
        instancePath.cubicTo(174.0f, 450.44772f, 174.44771f, 450.0f, 175.0f, 450.0f);
        instancePath.lineTo(177.0f, 450.0f);
        instancePath.cubicTo(177.55229f, 450.0f, 178.0f, 450.44772f, 178.0f, 451.0f);
        instancePath.cubicTo(178.0f, 451.55228f, 177.55229f, 452.0f, 177.0f, 452.0f);
        instancePath.lineTo(176.0f, 452.0f);
        instancePath.lineTo(176.0f, 476.0f);
        instancePath.lineTo(198.0f, 476.0f);
        instancePath.lineTo(198.0f, 452.0f);
        instancePath.lineTo(197.0f, 452.0f);
        instancePath.cubicTo(196.44771f, 452.0f, 196.0f, 451.55228f, 196.0f, 451.0f);
        instancePath.cubicTo(196.0f, 450.44772f, 196.44771f, 450.0f, 197.0f, 450.0f);
        instancePath.lineTo(199.0f, 450.0f);
        instancePath.close();
        instancePath.moveTo(181.0f, 448.0f);
        instancePath.cubicTo(181.55229f, 448.0f, 182.0f, 448.44772f, 182.0f, 449.0f);
        instancePath.lineTo(182.0f, 453.0f);
        instancePath.cubicTo(182.0f, 453.55228f, 181.55229f, 454.0f, 181.0f, 454.0f);
        instancePath.cubicTo(180.44771f, 454.0f, 180.0f, 453.55228f, 180.0f, 453.0f);
        instancePath.lineTo(180.0f, 449.0f);
        instancePath.cubicTo(180.0f, 448.44772f, 180.44771f, 448.0f, 181.0f, 448.0f);
        instancePath.close();
        instancePath.moveTo(193.0f, 448.0f);
        instancePath.cubicTo(193.55229f, 448.0f, 194.0f, 448.44772f, 194.0f, 449.0f);
        instancePath.lineTo(194.0f, 453.0f);
        instancePath.cubicTo(194.0f, 453.55228f, 193.55229f, 454.0f, 193.0f, 454.0f);
        instancePath.cubicTo(192.44771f, 454.0f, 192.0f, 453.55228f, 192.0f, 453.0f);
        instancePath.lineTo(192.0f, 449.0f);
        instancePath.cubicTo(192.0f, 448.44772f, 192.44771f, 448.0f, 193.0f, 448.0f);
        instancePath.close();
        instancePath.moveTo(185.0f, 450.0f);
        instancePath.lineTo(189.0f, 450.0f);
        instancePath.cubicTo(189.55229f, 450.0f, 190.0f, 450.44772f, 190.0f, 451.0f);
        instancePath.cubicTo(190.0f, 451.55228f, 189.55229f, 452.0f, 189.0f, 452.0f);
        instancePath.lineTo(185.0f, 452.0f);
        instancePath.cubicTo(184.44771f, 452.0f, 184.0f, 451.55228f, 184.0f, 451.0f);
        instancePath.cubicTo(184.0f, 450.44772f, 184.44771f, 450.0f, 185.0f, 450.0f);
        instancePath.close();
        instancePath.moveTo(181.0f, 460.0f);
        instancePath.lineTo(193.0f, 460.0f);
        instancePath.cubicTo(193.55229f, 460.0f, 194.0f, 460.44772f, 194.0f, 461.0f);
        instancePath.cubicTo(194.0f, 461.55228f, 193.55229f, 462.0f, 193.0f, 462.0f);
        instancePath.lineTo(181.0f, 462.0f);
        instancePath.cubicTo(180.44771f, 462.0f, 180.0f, 461.55228f, 180.0f, 461.0f);
        instancePath.cubicTo(180.0f, 460.44772f, 180.44771f, 460.0f, 181.0f, 460.0f);
        instancePath.close();
        instancePath.moveTo(181.0f, 468.0f);
        instancePath.lineTo(193.0f, 468.0f);
        instancePath.cubicTo(193.55229f, 468.0f, 194.0f, 468.44772f, 194.0f, 469.0f);
        instancePath.cubicTo(194.0f, 469.55228f, 193.55229f, 470.0f, 193.0f, 470.0f);
        instancePath.lineTo(181.0f, 470.0f);
        instancePath.cubicTo(180.44771f, 470.0f, 180.0f, 469.55228f, 180.0f, 469.0f);
        instancePath.cubicTo(180.0f, 468.44772f, 180.44771f, 468.0f, 181.0f, 468.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
