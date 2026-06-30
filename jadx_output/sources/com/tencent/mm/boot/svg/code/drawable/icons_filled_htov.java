package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_htov extends l95.c {
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
        instancePath.moveTo(14.4697f, 3.53039f);
        instancePath.lineTo(16.4697f, 5.53039f);
        instancePath.lineTo(17.5303f, 4.46973f);
        instancePath.lineTo(16.8107f, 3.75011f);
        instancePath.lineTo(17.0001f, 3.75011f);
        instancePath.cubicTo(19.8996f, 3.75011f, 22.2501f, 6.10062f, 22.2501f, 9.00011f);
        instancePath.lineTo(23.7501f, 9.00011f);
        instancePath.cubicTo(23.7501f, 5.27219f, 20.728f, 2.25011f, 17.0001f, 2.25011f);
        instancePath.lineTo(16.8106f, 2.25011f);
        instancePath.lineTo(17.5303f, 1.53039f);
        instancePath.lineTo(16.4697f, 0.469727f);
        instancePath.lineTo(14.4697f, 2.46973f);
        instancePath.cubicTo(14.1768f, 2.76262f, 14.1768f, 3.23749f, 14.4697f, 3.53039f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(3.0f, 8.00012f);
        instancePath2.cubicTo(2.44772f, 8.00012f, 2.0f, 8.44784f, 2.0f, 9.00012f);
        instancePath2.lineTo(2.0f, 18.0001f);
        instancePath2.cubicTo(2.0f, 18.5524f, 2.44772f, 19.0001f, 3.0f, 19.0001f);
        instancePath2.lineTo(18.0f, 19.0001f);
        instancePath2.cubicTo(18.5523f, 19.0001f, 19.0f, 18.5524f, 19.0f, 18.0001f);
        instancePath2.lineTo(19.0f, 9.00012f);
        instancePath2.cubicTo(19.0f, 8.44784f, 18.5523f, 8.00012f, 18.0f, 8.00012f);
        instancePath2.lineTo(3.0f, 8.00012f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
