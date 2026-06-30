package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class audio extends l95.c {
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(14.5536f, 7.03784f);
        instancePath.cubicTo(15.2439f, 7.03784f, 15.8036f, 6.4782f, 15.8036f, 5.78784f);
        instancePath.cubicTo(15.8036f, 5.09749f, 15.2439f, 4.53784f, 14.5536f, 4.53784f);
        instancePath.cubicTo(13.8632f, 4.53784f, 13.3036f, 5.09749f, 13.3036f, 5.78784f);
        instancePath.cubicTo(13.3036f, 6.4782f, 13.8632f, 7.03784f, 14.5536f, 7.03784f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(3.5f, 8.95306f);
        instancePath2.cubicTo(3.5f, 8.53885f, 3.83579f, 8.20306f, 4.25f, 8.20306f);
        instancePath2.cubicTo(4.66421f, 8.20306f, 5.0f, 8.53885f, 5.0f, 8.95306f);
        instancePath2.lineTo(5.0f, 13.4531f);
        instancePath2.cubicTo(5.0f, 13.8673f, 4.66421f, 14.2031f, 4.25f, 14.2031f);
        instancePath2.cubicTo(3.83579f, 14.2031f, 3.5f, 13.8673f, 3.5f, 13.4531f);
        instancePath2.lineTo(3.5f, 8.95306f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(8.65179f, 10.2593f);
        instancePath3.cubicTo(8.65179f, 9.84506f, 8.98758f, 9.50928f, 9.40179f, 9.50928f);
        instancePath3.cubicTo(9.81601f, 9.50928f, 10.1518f, 9.84506f, 10.1518f, 10.2593f);
        instancePath3.lineTo(10.1518f, 19.8844f);
        instancePath3.cubicTo(10.1518f, 20.2986f, 9.81601f, 20.6344f, 9.40179f, 20.6344f);
        instancePath3.cubicTo(8.98758f, 20.6344f, 8.65179f, 20.2986f, 8.65179f, 19.8844f);
        instancePath3.lineTo(8.65179f, 10.2593f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        instancePaint6.setColor(-16777216);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(13.8036f, 8.95306f);
        instancePath4.cubicTo(13.8036f, 8.53885f, 14.1394f, 8.20306f, 14.5536f, 8.20306f);
        instancePath4.cubicTo(14.9678f, 8.20306f, 15.3036f, 8.53885f, 15.3036f, 8.95306f);
        instancePath4.lineTo(15.3036f, 16.0995f);
        instancePath4.cubicTo(15.3036f, 16.5137f, 14.9678f, 16.8495f, 14.5536f, 16.8495f);
        instancePath4.cubicTo(14.1394f, 16.8495f, 13.8036f, 16.5137f, 13.8036f, 16.0995f);
        instancePath4.lineTo(13.8036f, 8.95306f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-16777216);
        instancePaint7.setColor(-16777216);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(18.9554f, 10.2236f);
        instancePath5.cubicTo(18.9554f, 9.80942f, 19.2912f, 9.47363f, 19.7054f, 9.47363f);
        instancePath5.cubicTo(20.1196f, 9.47363f, 20.4554f, 9.80942f, 20.4554f, 10.2236f);
        instancePath5.lineTo(20.4554f, 13.4531f);
        instancePath5.cubicTo(20.4554f, 13.8673f, 20.1196f, 14.2031f, 19.7054f, 14.2031f);
        instancePath5.cubicTo(19.2912f, 14.2031f, 18.9554f, 13.8673f, 18.9554f, 13.4531f);
        instancePath5.lineTo(18.9554f, 10.2236f);
        instancePath5.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 1);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
