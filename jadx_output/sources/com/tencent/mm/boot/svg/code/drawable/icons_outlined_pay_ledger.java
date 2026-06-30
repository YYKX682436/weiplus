package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_pay_ledger extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(60.0f, 6.0f);
            instancePath.cubicTo(61.656853f, 6.0f, 63.0f, 7.343146f, 63.0f, 9.0f);
            instancePath.lineTo(63.0f, 63.0f);
            instancePath.cubicTo(63.0f, 64.65685f, 61.656853f, 66.0f, 60.0f, 66.0f);
            instancePath.lineTo(12.0f, 66.0f);
            instancePath.cubicTo(10.343145f, 66.0f, 9.0f, 64.65685f, 9.0f, 63.0f);
            instancePath.lineTo(9.0f, 9.0f);
            instancePath.cubicTo(9.0f, 7.343146f, 10.343145f, 6.0f, 12.0f, 6.0f);
            instancePath.lineTo(60.0f, 6.0f);
            instancePath.close();
            instancePath.moveTo(19.799f, 9.599f);
            instancePath.lineTo(12.6f, 9.6f);
            instancePath.lineTo(12.6f, 62.4f);
            instancePath.lineTo(19.799f, 62.4f);
            instancePath.lineTo(19.799f, 9.599f);
            instancePath.close();
            instancePath.moveTo(59.4f, 9.6f);
            instancePath.lineTo(23.4f, 9.599f);
            instancePath.lineTo(23.4f, 62.4f);
            instancePath.lineTo(59.4f, 62.4f);
            instancePath.lineTo(59.4f, 9.6f);
            instancePath.close();
            instancePath.moveTo(35.7f, 29.7f);
            instancePath.lineTo(40.5f, 39.3f);
            instancePath.lineTo(42.9f, 39.3f);
            instancePath.lineTo(47.7f, 29.7f);
            instancePath.lineTo(52.2f, 29.7f);
            instancePath.lineTo(47.4f, 39.3f);
            instancePath.lineTo(52.2f, 39.300037f);
            instancePath.lineTo(52.2f, 42.900036f);
            instancePath.lineTo(43.5f, 42.9f);
            instancePath.lineTo(43.5f, 46.2f);
            instancePath.lineTo(52.2f, 46.2f);
            instancePath.lineTo(52.2f, 49.8f);
            instancePath.lineTo(43.5f, 49.8f);
            instancePath.lineTo(43.500072f, 55.2f);
            instancePath.lineTo(39.90007f, 55.2f);
            instancePath.lineTo(39.9f, 49.8f);
            instancePath.lineTo(31.2f, 49.8f);
            instancePath.lineTo(31.2f, 46.2f);
            instancePath.lineTo(39.9f, 46.2f);
            instancePath.lineTo(39.9f, 42.9f);
            instancePath.lineTo(31.2f, 42.900036f);
            instancePath.lineTo(31.2f, 39.300037f);
            instancePath.lineTo(36.0f, 39.3f);
            instancePath.lineTo(31.2f, 29.7f);
            instancePath.lineTo(35.7f, 29.7f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
