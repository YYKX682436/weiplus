package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_pay_credit_card extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        instancePath.moveTo(63.0f, 12.0f);
        instancePath.cubicTo(64.65685f, 12.0f, 66.0f, 13.343145f, 66.0f, 15.0f);
        instancePath.lineTo(66.0f, 57.0f);
        instancePath.cubicTo(66.0f, 58.656853f, 64.65685f, 60.0f, 63.0f, 60.0f);
        instancePath.lineTo(9.0f, 60.0f);
        instancePath.cubicTo(7.343146f, 60.0f, 6.0f, 58.656853f, 6.0f, 57.0f);
        instancePath.lineTo(6.0f, 15.0f);
        instancePath.cubicTo(6.0f, 13.343145f, 7.343146f, 12.0f, 9.0f, 12.0f);
        instancePath.lineTo(63.0f, 12.0f);
        instancePath.close();
        instancePath.moveTo(18.75f, 39.0f);
        instancePath.lineTo(14.25f, 39.0f);
        instancePath.cubicTo(13.0073595f, 39.0f, 12.0f, 40.00736f, 12.0f, 41.25f);
        instancePath.lineTo(12.0f, 41.25f);
        instancePath.lineTo(12.0f, 45.75f);
        instancePath.cubicTo(12.0f, 46.99264f, 13.0073595f, 48.0f, 14.25f, 48.0f);
        instancePath.lineTo(14.25f, 48.0f);
        instancePath.lineTo(18.75f, 48.0f);
        instancePath.cubicTo(19.992641f, 48.0f, 21.0f, 46.99264f, 21.0f, 45.75f);
        instancePath.lineTo(21.0f, 45.75f);
        instancePath.lineTo(21.0f, 41.25f);
        instancePath.cubicTo(21.0f, 40.00736f, 19.992641f, 39.0f, 18.75f, 39.0f);
        instancePath.lineTo(18.75f, 39.0f);
        instancePath.close();
        instancePath.moveTo(60.0f, 24.0f);
        instancePath.lineTo(12.0f, 24.0f);
        instancePath.lineTo(12.0f, 30.0f);
        instancePath.lineTo(60.0f, 30.0f);
        instancePath.lineTo(60.0f, 24.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
