package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_regular_preview_on extends l95.c {
    private final int width = 25;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 25;
        }
        if (i17 == 1) {
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
        instancePath.moveTo(2.875f, 4.8499f);
        instancePath.cubicTo(2.875f, 4.29762f, 3.32272f, 3.8499f, 3.875f, 3.8499f);
        instancePath.lineTo(21.875f, 3.8499f);
        instancePath.cubicTo(22.4273f, 3.8499f, 22.875f, 4.29762f, 22.875f, 4.8499f);
        instancePath.lineTo(22.875f, 19.8499f);
        instancePath.cubicTo(22.875f, 20.4022f, 22.4273f, 20.8499f, 21.875f, 20.8499f);
        instancePath.lineTo(3.875f, 20.8499f);
        instancePath.cubicTo(3.32272f, 20.8499f, 2.875f, 20.4022f, 2.875f, 19.8499f);
        instancePath.lineTo(2.875f, 4.8499f);
        instancePath.close();
        instancePath.moveTo(4.075f, 19.6499f);
        instancePath.lineTo(4.075f, 5.0499f);
        instancePath.lineTo(21.675f, 5.0499f);
        instancePath.lineTo(21.675f, 19.6499f);
        instancePath.lineTo(4.075f, 19.6499f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(7.375f, 2.2f);
        instancePath2.lineTo(8.575f, 2.2f);
        instancePath2.lineTo(8.575f, 4.2f);
        instancePath2.lineTo(7.375f, 4.2f);
        instancePath2.lineTo(7.375f, 2.2f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(17.175f, 2.2f);
        instancePath3.lineTo(18.375f, 2.2f);
        instancePath3.lineTo(18.375f, 4.2f);
        instancePath3.lineTo(17.175f, 4.2f);
        instancePath3.lineTo(17.175f, 2.2f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(2.875f, 7.5999f);
        instancePath4.lineTo(22.875f, 7.5999f);
        instancePath4.lineTo(22.875f, 8.6999f);
        instancePath4.lineTo(2.875f, 8.6999f);
        instancePath4.lineTo(2.875f, 7.5999f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-16777216);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(17.4993f, 11.5527f);
        instancePath5.lineTo(16.6222f, 10.6756f);
        instancePath5.lineTo(11.792f, 15.5058f);
        instancePath5.lineTo(9.52784f, 13.2417f);
        instancePath5.lineTo(8.65075f, 14.1188f);
        instancePath5.lineTo(11.278f, 16.746f);
        instancePath5.cubicTo(11.5619f, 17.0299f, 12.0221f, 17.0299f, 12.306f, 16.746f);
        instancePath5.lineTo(17.4993f, 11.5527f);
        instancePath5.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
