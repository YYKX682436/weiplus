package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class star_filled extends l95.c {
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
        instancePath.moveTo(11.9999f, 18.309f);
        instancePath.lineTo(6.91507f, 20.9823f);
        instancePath.cubicTo(6.12562f, 21.3973f, 5.18874f, 20.6934f, 5.33597f, 19.835f);
        instancePath.lineTo(6.30708f, 14.173f);
        instancePath.lineTo(2.19336f, 10.1631f);
        instancePath.cubicTo(1.55468f, 9.54052f, 1.93466f, 8.43197f, 2.79653f, 8.30673f);
        instancePath.lineTo(8.48155f, 7.48065f);
        instancePath.lineTo(11.024f, 2.32915f);
        instancePath.cubicTo(11.4187f, 1.52934f, 12.5904f, 1.54816f, 12.9759f, 2.32915f);
        instancePath.lineTo(15.5183f, 7.48065f);
        instancePath.lineTo(21.2033f, 8.30673f);
        instancePath.cubicTo(22.0859f, 8.43499f, 22.4301f, 9.55517f, 21.8065f, 10.1631f);
        instancePath.lineTo(17.6927f, 14.173f);
        instancePath.lineTo(18.6639f, 19.835f);
        instancePath.cubicTo(18.8146f, 20.7141f, 17.8556f, 21.3876f, 17.0847f, 20.9823f);
        instancePath.lineTo(11.9999f, 18.309f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
