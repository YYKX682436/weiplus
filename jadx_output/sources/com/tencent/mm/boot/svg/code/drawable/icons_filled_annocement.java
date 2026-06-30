package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_annocement extends l95.c {
    private final int width = 14;
    private final int height = 15;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 14;
        }
        if (i17 == 1) {
            return 15;
        }
        if (i17 == 2) {
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
            instancePaint3.setColor(-855638017);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(2.77301f, 5.74969f);
            instancePath.cubicTo(2.86781f, 5.74969f, 2.96162f, 5.73043f, 3.04875f, 5.69309f);
            instancePath.lineTo(10.4329f, 2.52847f);
            instancePath.cubicTo(10.7408f, 2.3965f, 11.0834f, 2.62238f, 11.0834f, 2.9574f);
            instancePath.lineTo(11.0834f, 12.0512f);
            instancePath.cubicTo(11.0834f, 12.3838f, 10.7453f, 12.6097f, 10.4381f, 12.4824f);
            instancePath.lineTo(3.04534f, 9.41965f);
            instancePath.cubicTo(2.96041f, 9.38446f, 2.86937f, 9.36635f, 2.77743f, 9.36635f);
            instancePath.lineTo(1.86669f, 9.36635f);
            instancePath.cubicTo(1.48009f, 9.36635f, 1.16669f, 9.05295f, 1.16669f, 8.66635f);
            instancePath.lineTo(1.16669f, 6.44969f);
            instancePath.cubicTo(1.16669f, 6.06309f, 1.48009f, 5.74969f, 1.86669f, 5.74969f);
            instancePath.lineTo(2.77301f, 5.74969f);
            instancePath.close();
            instancePath.moveTo(12.7167f, 7.49989f);
            instancePath.cubicTo(12.7167f, 8.07978f, 12.2466f, 8.54989f, 11.6667f, 8.54989f);
            instancePath.lineTo(11.6667f, 6.44997f);
            instancePath.lineTo(11.6535f, 6.44997f);
            instancePath.lineTo(11.6667f, 6.44989f);
            instancePath.cubicTo(12.2466f, 6.44989f, 12.7167f, 6.91999f, 12.7167f, 7.49989f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
