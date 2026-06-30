package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_vtoh extends l95.c {
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
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(19.25f, 7.0f);
        instancePath.cubicTo(19.25f, 4.1005f, 16.8995f, 1.75f, 14.0f, 1.75f);
        instancePath.lineTo(14.0f, 0.25f);
        instancePath.cubicTo(17.7279f, 0.25f, 20.75f, 3.27208f, 20.75f, 7.0f);
        instancePath.lineTo(20.75f, 7.18945f);
        instancePath.lineTo(21.4697f, 6.46973f);
        instancePath.lineTo(22.5304f, 7.53039f);
        instancePath.lineTo(20.5304f, 9.53039f);
        instancePath.cubicTo(20.2375f, 9.82328f, 19.7626f, 9.82328f, 19.4697f, 9.53039f);
        instancePath.lineTo(17.4697f, 7.53039f);
        instancePath.lineTo(18.5304f, 6.46973f);
        instancePath.lineTo(19.25f, 7.18934f);
        instancePath.lineTo(19.25f, 7.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(5.0f, 5.0f);
        instancePath2.cubicTo(4.44772f, 5.0f, 4.0f, 5.44772f, 4.0f, 6.0f);
        instancePath2.lineTo(4.0f, 21.0f);
        instancePath2.cubicTo(4.0f, 21.5523f, 4.44771f, 22.0f, 5.0f, 22.0f);
        instancePath2.lineTo(14.0f, 22.0f);
        instancePath2.cubicTo(14.5523f, 22.0f, 15.0f, 21.5523f, 15.0f, 21.0f);
        instancePath2.lineTo(15.0f, 6.0f);
        instancePath2.cubicTo(15.0f, 5.44772f, 14.5523f, 5.0f, 14.0f, 5.0f);
        instancePath2.lineTo(5.0f, 5.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
