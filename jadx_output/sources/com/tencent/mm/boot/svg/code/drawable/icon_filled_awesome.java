package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_filled_awesome extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(12.664062f, 19.394531f);
            instancePath.cubicTo(18.523438f, 13.535156f, 28.019531f, 13.535156f, 33.878906f, 19.394531f);
            instancePath.cubicTo(34.42578f, 19.941406f, 35.132812f, 20.625f, 36.0f, 21.441406f);
            instancePath.cubicTo(36.867188f, 20.625f, 37.57422f, 19.941406f, 38.121094f, 19.394531f);
            instancePath.cubicTo(43.98047f, 13.535156f, 53.476562f, 13.535156f, 59.335938f, 19.394531f);
            instancePath.cubicTo(65.13672f, 25.195312f, 65.19141f, 34.57422f, 59.496094f, 40.441406f);
            instancePath.lineTo(38.121094f, 61.820312f);
            instancePath.cubicTo(36.94922f, 62.992188f, 35.05078f, 62.992188f, 33.878906f, 61.820312f);
            instancePath.lineTo(12.503906f, 40.445312f);
            instancePath.cubicTo(6.808594f, 34.57422f, 6.863281f, 25.195312f, 12.664062f, 19.394531f);
            instancePath.close();
            instancePath.moveTo(12.664062f, 19.394531f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
