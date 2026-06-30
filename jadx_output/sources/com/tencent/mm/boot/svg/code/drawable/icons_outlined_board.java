package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_board extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(24.0f, 0.0f);
        instancePath.lineTo(24.0f, 24.0f);
        instancePath.lineTo(0.0f, 24.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(21.0f, 3.0f);
        instancePath2.cubicTo(21.552284f, 3.0f, 22.0f, 3.4477153f, 22.0f, 4.0f);
        instancePath2.lineTo(22.0f, 15.0f);
        instancePath2.cubicTo(22.0f, 15.552284f, 21.552284f, 16.0f, 21.0f, 16.0f);
        instancePath2.lineTo(15.937f, 16.0f);
        instancePath2.lineTo(18.799038f, 20.955128f);
        instancePath2.lineTo(17.5f, 21.705128f);
        instancePath2.lineTo(15.937f, 19.0f);
        instancePath2.lineTo(8.06f, 19.0f);
        instancePath2.lineTo(6.499038f, 21.705128f);
        instancePath2.lineTo(5.2f, 20.955128f);
        instancePath2.lineTo(8.059f, 16.0f);
        instancePath2.lineTo(3.0f, 16.0f);
        instancePath2.cubicTo(2.4477153f, 16.0f, 2.0f, 15.552284f, 2.0f, 15.0f);
        instancePath2.lineTo(2.0f, 4.0f);
        instancePath2.cubicTo(2.0f, 3.4477153f, 2.4477153f, 3.0f, 3.0f, 3.0f);
        instancePath2.lineTo(21.0f, 3.0f);
        instancePath2.close();
        instancePath2.moveTo(15.36f, 18.0f);
        instancePath2.lineTo(14.205f, 16.0f);
        instancePath2.lineTo(9.792f, 16.0f);
        instancePath2.lineTo(8.637f, 18.0f);
        instancePath2.lineTo(15.36f, 18.0f);
        instancePath2.close();
        instancePath2.moveTo(20.8f, 4.2f);
        instancePath2.lineTo(3.2f, 4.2f);
        instancePath2.lineTo(3.2f, 14.8f);
        instancePath2.lineTo(20.8f, 14.8f);
        instancePath2.lineTo(20.8f, 4.2f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
