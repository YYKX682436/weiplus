package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class video_off_filled extends l95.c {
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
        instancePath.moveTo(18.4688f, 20.5304f);
        instancePath.lineTo(1.46875f, 3.53039f);
        instancePath.lineTo(2.52941f, 2.46973f);
        instancePath.lineTo(5.55968f, 5.5f);
        instancePath.lineTo(16.5f, 5.5f);
        instancePath.cubicTo(17.0523f, 5.5f, 17.5f, 5.94772f, 17.5f, 6.5f);
        instancePath.lineTo(17.5f, 17.4403f);
        instancePath.lineTo(19.5294f, 19.4697f);
        instancePath.lineTo(18.4688f, 20.5304f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(21.3356f, 7.47943f);
        instancePath2.cubicTo(21.9805f, 6.90619f, 23.0f, 7.364f, 23.0f, 8.22684f);
        instancePath2.lineTo(23.0f, 15.7732f);
        instancePath2.cubicTo(23.0f, 16.636f, 21.9805f, 17.0938f, 21.3356f, 16.5206f);
        instancePath2.lineTo(18.5f, 14.0f);
        instancePath2.lineTo(18.5f, 10.0f);
        instancePath2.lineTo(21.3356f, 7.47943f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(2.0f, 6.5f);
        instancePath3.cubicTo(2.0f, 6.40336f, 2.01371f, 6.30992f, 2.03929f, 6.22153f);
        instancePath3.lineTo(14.3178f, 18.5f);
        instancePath3.lineTo(3.0f, 18.5f);
        instancePath3.cubicTo(2.44772f, 18.5f, 2.0f, 18.0523f, 2.0f, 17.5f);
        instancePath3.lineTo(2.0f, 6.5f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
