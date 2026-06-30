package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_volume_mute extends l95.c {
    private final int width = 48;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 48;
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
        instancePath.moveTo(3.53613f, 4.89891f);
        instancePath.lineTo(43.2919f, 44.6542f);
        instancePath.lineTo(45.5361f, 42.4099f);
        instancePath.lineTo(34.8159f, 31.6898f);
        instancePath.lineTo(34.8159f, 7.85796f);
        instancePath.cubicTo(34.8159f, 5.50163f, 31.967f, 4.32158f, 30.3008f, 5.98775f);
        instancePath.lineTo(20.2689f, 16.0195f);
        instancePath.lineTo(19.1454f, 16.0195f);
        instancePath.lineTo(5.78041f, 2.65466f);
        instancePath.lineTo(3.53613f, 4.89891f);
        instancePath.close();
        instancePath.moveTo(21.9514f, 18.8255f);
        instancePath.lineTo(31.642f, 9.13502f);
        instancePath.lineTo(31.642f, 28.516f);
        instancePath.lineTo(21.9514f, 18.8255f);
        instancePath.close();
        instancePath.moveTo(8.89585f, 19.1933f);
        instancePath.lineTo(14.2644f, 19.1933f);
        instancePath.lineTo(11.0905f, 16.0195f);
        instancePath.lineTo(8.36687f, 16.0195f);
        instancePath.cubicTo(6.90613f, 16.0195f, 5.72196f, 17.2036f, 5.72196f, 18.6643f);
        instancePath.lineTo(5.72196f, 31.8887f);
        instancePath.cubicTo(5.72196f, 33.3494f, 6.90613f, 34.5336f, 8.36687f, 34.5336f);
        instancePath.lineTo(20.2689f, 34.5336f);
        instancePath.lineTo(30.3008f, 44.5653f);
        instancePath.cubicTo(31.967f, 46.2315f, 34.8159f, 45.0514f, 34.8159f, 42.6951f);
        instancePath.lineTo(34.8159f, 39.7447f);
        instancePath.lineTo(31.642f, 36.5708f);
        instancePath.lineTo(31.642f, 41.418f);
        instancePath.lineTo(21.5836f, 31.3597f);
        instancePath.lineTo(8.89585f, 31.3597f);
        instancePath.lineTo(8.89585f, 25.2765f);
        instancePath.lineTo(8.89585f, 19.1933f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
