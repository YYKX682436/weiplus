package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class mike_exclamation_heavy extends l95.c {
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(19.0f, 20.4854f);
        instancePath.cubicTo(19.414f, 20.4854f, 19.7498f, 20.8204f, 19.75f, 21.2344f);
        instancePath.cubicTo(19.7499f, 21.6484f, 19.4141f, 21.9844f, 19.0f, 21.9844f);
        instancePath.cubicTo(18.586f, 21.9843f, 18.2501f, 21.6484f, 18.25f, 21.2344f);
        instancePath.cubicTo(18.2502f, 20.8205f, 18.5861f, 20.4854f, 19.0f, 20.4854f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(19.0f, 16.0703f);
        instancePath2.cubicTo(19.4303f, 16.0703f, 19.7707f, 16.435f, 19.7402f, 16.8643f);
        instancePath2.lineTo(19.5459f, 19.5938f);
        instancePath2.cubicTo(19.5254f, 19.8802f, 19.2872f, 20.1025f, 19.0f, 20.1025f);
        instancePath2.cubicTo(18.7128f, 20.1025f, 18.4746f, 19.8802f, 18.4541f, 19.5938f);
        instancePath2.lineTo(18.2607f, 16.8643f);
        instancePath2.cubicTo(18.2303f, 16.4351f, 18.5698f, 16.0704f, 19.0f, 16.0703f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(19.0f, 14.0f);
        instancePath3.cubicTo(21.7614f, 14.0f, 24.0f, 16.2386f, 24.0f, 19.0f);
        instancePath3.cubicTo(24.0f, 21.7614f, 21.7614f, 24.0f, 19.0f, 24.0f);
        instancePath3.cubicTo(16.2386f, 24.0f, 14.0f, 21.7614f, 14.0f, 19.0f);
        instancePath3.cubicTo(14.0f, 16.2386f, 16.2386f, 14.0f, 19.0f, 14.0f);
        instancePath3.close();
        instancePath3.moveTo(19.0f, 15.5f);
        instancePath3.cubicTo(17.067f, 15.5f, 15.5f, 17.067f, 15.5f, 19.0f);
        instancePath3.cubicTo(15.5f, 20.933f, 17.067f, 22.5f, 19.0f, 22.5f);
        instancePath3.cubicTo(20.933f, 22.5f, 22.5f, 20.933f, 22.5f, 19.0f);
        instancePath3.cubicTo(22.5f, 17.067f, 20.933f, 15.5f, 19.0f, 15.5f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(6.0f, 12.5f);
        instancePath4.cubicTo(6.0f, 15.8137f, 8.68629f, 18.5f, 12.0f, 18.5f);
        instancePath4.cubicTo(12.0907f, 18.5f, 12.1808f, 18.4971f, 12.2705f, 18.4932f);
        instancePath4.cubicTo(12.2581f, 18.6605f, 12.25f, 18.8295f, 12.25f, 19.0f);
        instancePath4.cubicTo(12.25f, 20.1143f, 12.5219f, 21.1645f, 13.0f, 22.0908f);
        instancePath4.lineTo(13.0f, 23.0f);
        instancePath4.lineTo(11.0f, 23.0f);
        instancePath4.lineTo(11.0f, 20.4355f);
        instancePath4.cubicTo(7.05384f, 19.9433f, 4.0f, 16.5795f, 4.0f, 12.5f);
        instancePath4.lineTo(4.0f, 11.0f);
        instancePath4.lineTo(6.0f, 11.0f);
        instancePath4.lineTo(6.0f, 12.5f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-16777216);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(12.0f, 2.0f);
        instancePath5.cubicTo(14.4853f, 2.0f, 16.5f, 4.01472f, 16.5f, 6.5f);
        instancePath5.lineTo(16.5f, 12.5f);
        instancePath5.lineTo(16.4941f, 12.7314f);
        instancePath5.cubicTo(14.6288f, 13.4781f, 13.1738f, 15.0327f, 12.5635f, 16.9629f);
        instancePath5.cubicTo(12.3788f, 16.986f, 12.1909f, 17.0f, 12.0f, 17.0f);
        instancePath5.cubicTo(9.59234f, 17.0f, 7.62632f, 15.1092f, 7.50586f, 12.7314f);
        instancePath5.lineTo(7.5f, 12.5f);
        instancePath5.lineTo(7.5f, 6.5f);
        instancePath5.cubicTo(7.5f, 4.01472f, 9.51472f, 2.0f, 12.0f, 2.0f);
        instancePath5.close();
        instancePath5.moveTo(12.0f, 4.0f);
        instancePath5.cubicTo(10.6193f, 4.0f, 9.5f, 5.11929f, 9.5f, 6.5f);
        instancePath5.lineTo(9.5f, 12.5f);
        instancePath5.cubicTo(9.5f, 13.8807f, 10.6193f, 15.0f, 12.0f, 15.0f);
        instancePath5.cubicTo(13.3807f, 15.0f, 14.5f, 13.8807f, 14.5f, 12.5f);
        instancePath5.lineTo(14.5f, 6.5f);
        instancePath5.cubicTo(14.5f, 5.11929f, 13.3807f, 4.0f, 12.0f, 4.0f);
        instancePath5.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
