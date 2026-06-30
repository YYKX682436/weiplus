package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_two_grid extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            instancePaint3.setColor(-16777216);
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(12.5996f, 20.7998f);
            instancePath.lineTo(19.7998f, 20.7998f);
            instancePath.lineTo(19.7998f, 3.2002f);
            instancePath.lineTo(12.5996f, 3.2002f);
            instancePath.lineTo(12.5996f, 20.7998f);
            instancePath.close();
            instancePath.moveTo(4.2002f, 20.7998f);
            instancePath.lineTo(11.4004f, 20.7998f);
            instancePath.lineTo(11.4004f, 3.2002f);
            instancePath.lineTo(4.2002f, 3.2002f);
            instancePath.lineTo(4.2002f, 20.7998f);
            instancePath.close();
            instancePath.moveTo(21.0f, 21.0f);
            instancePath.cubicTo(21.0f, 21.5523f, 20.5523f, 22.0f, 20.0f, 22.0f);
            instancePath.lineTo(4.0f, 22.0f);
            instancePath.lineTo(3.89746f, 21.9951f);
            instancePath.cubicTo(3.39333f, 21.9438f, 3.0f, 21.5177f, 3.0f, 21.0f);
            instancePath.lineTo(3.0f, 3.0f);
            instancePath.cubicTo(3.0f, 2.44772f, 3.44772f, 2.0f, 4.0f, 2.0f);
            instancePath.lineTo(20.0f, 2.0f);
            instancePath.cubicTo(20.5523f, 2.0f, 21.0f, 2.44772f, 21.0f, 3.0f);
            instancePath.lineTo(21.0f, 21.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
