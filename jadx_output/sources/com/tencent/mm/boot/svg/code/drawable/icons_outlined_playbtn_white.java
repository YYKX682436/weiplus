package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_playbtn_white extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
            l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(16.0f, 0.0f);
            instancePath.cubicTo(24.836555f, 0.0f, 32.0f, 7.163444f, 32.0f, 16.0f);
            instancePath.cubicTo(32.0f, 24.836555f, 24.836555f, 32.0f, 16.0f, 32.0f);
            instancePath.cubicTo(7.163444f, 32.0f, 0.0f, 24.836555f, 0.0f, 16.0f);
            instancePath.cubicTo(0.0f, 7.163444f, 7.163444f, 0.0f, 16.0f, 0.0f);
            instancePath.close();
            instancePath.moveTo(16.0f, 1.0f);
            instancePath.cubicTo(7.7157288f, 1.0f, 1.0f, 7.7157288f, 1.0f, 16.0f);
            instancePath.cubicTo(1.0f, 24.284271f, 7.7157288f, 31.0f, 16.0f, 31.0f);
            instancePath.cubicTo(24.284271f, 31.0f, 31.0f, 24.284271f, 31.0f, 16.0f);
            instancePath.cubicTo(31.0f, 7.7157288f, 24.284271f, 1.0f, 16.0f, 1.0f);
            instancePath.close();
            instancePath.moveTo(12.8f, 10.178544f);
            instancePath.cubicTo(12.939221f, 10.178544f, 13.076033f, 10.214876f, 13.196911f, 10.283949f);
            instancePath.lineTo(21.984459f, 15.305406f);
            instancePath.cubicTo(22.368074f, 15.524613f, 22.50135f, 16.013298f, 22.282143f, 16.396912f);
            instancePath.cubicTo(22.211271f, 16.520937f, 22.108484f, 16.623724f, 21.984459f, 16.694595f);
            instancePath.lineTo(13.196911f, 21.716051f);
            instancePath.cubicTo(12.813297f, 21.935259f, 12.324614f, 21.801981f, 12.105406f, 21.418367f);
            instancePath.cubicTo(12.036332f, 21.29749f, 12.0f, 21.160677f, 12.0f, 21.021456f);
            instancePath.lineTo(12.0f, 10.978543f);
            instancePath.cubicTo(12.0f, 10.5367155f, 12.358172f, 10.178544f, 12.8f, 10.178544f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
