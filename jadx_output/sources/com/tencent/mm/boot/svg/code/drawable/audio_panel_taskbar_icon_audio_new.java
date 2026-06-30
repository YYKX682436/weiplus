package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class audio_panel_taskbar_icon_audio_new extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16727297);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(42.299f, 16.1719f);
        instancePath.cubicTo(40.1329f, 16.1719f, 38.377f, 17.9279f, 38.377f, 20.094f);
        instancePath.cubicTo(38.377f, 22.2601f, 40.1329f, 24.016f, 42.299f, 24.016f);
        instancePath.cubicTo(44.4651f, 24.016f, 46.2211f, 22.2601f, 46.2211f, 20.094f);
        instancePath.cubicTo(46.2211f, 17.9279f, 44.4651f, 16.1719f, 42.299f, 16.1719f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16727297);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(17.2188f, 30.1879f);
        instancePath2.cubicTo(17.2188f, 28.6143f, 18.4944f, 27.3387f, 20.0679f, 27.3387f);
        instancePath2.cubicTo(21.6414f, 27.3387f, 22.9171f, 28.6143f, 22.9171f, 30.1879f);
        instancePath2.lineTo(22.9171f, 38.7353f);
        instancePath2.cubicTo(22.9171f, 40.3089f, 21.6414f, 41.5845f, 20.0679f, 41.5845f);
        instancePath2.cubicTo(18.4944f, 41.5845f, 17.2188f, 40.3089f, 17.2188f, 38.7353f);
        instancePath2.lineTo(17.2188f, 30.1879f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16727297);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(39.442f, 30.1879f);
        instancePath3.cubicTo(39.442f, 28.6143f, 40.7176f, 27.3387f, 42.2911f, 27.3387f);
        instancePath3.cubicTo(43.8647f, 27.3387f, 45.1403f, 28.6143f, 45.1403f, 30.1879f);
        instancePath3.lineTo(45.1403f, 44.4336f);
        instancePath3.cubicTo(45.1403f, 46.0072f, 43.8647f, 47.2828f, 42.2911f, 47.2828f);
        instancePath3.cubicTo(40.7176f, 47.2828f, 39.442f, 46.0072f, 39.442f, 44.4336f);
        instancePath3.lineTo(39.442f, 30.1879f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16727297);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(50.5536f, 33.0371f);
        instancePath4.cubicTo(50.5536f, 31.4635f, 51.8292f, 30.1879f, 53.4027f, 30.1879f);
        instancePath4.cubicTo(54.9763f, 30.1879f, 56.2519f, 31.4635f, 56.2519f, 33.0371f);
        instancePath4.lineTo(56.2519f, 38.7354f);
        instancePath4.cubicTo(56.2519f, 40.3089f, 54.9763f, 41.5845f, 53.4027f, 41.5845f);
        instancePath4.cubicTo(51.8292f, 41.5845f, 50.5536f, 40.3089f, 50.5536f, 38.7354f);
        instancePath4.lineTo(50.5536f, 33.0371f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-16727297);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(31.1795f, 30.1879f);
        instancePath5.cubicTo(29.606f, 30.1879f, 28.3304f, 31.4635f, 28.3304f, 33.0371f);
        instancePath5.lineTo(28.3304f, 52.9811f);
        instancePath5.cubicTo(28.3304f, 54.5547f, 29.606f, 55.8303f, 31.1795f, 55.8303f);
        instancePath5.cubicTo(32.7531f, 55.8303f, 34.0287f, 54.5547f, 34.0287f, 52.9811f);
        instancePath5.lineTo(34.0287f, 33.0371f);
        instancePath5.cubicTo(34.0287f, 31.4635f, 32.7531f, 30.1879f, 31.1795f, 30.1879f);
        instancePath5.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 1);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
