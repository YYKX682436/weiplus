package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_error_red extends l95.c {
    private final int width = 18;
    private final int height = 18;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 18;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                instancePaint3.setColor(-372399);
                instancePaint3.setColor(-372399);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(9.00033f, 17.3327f);
                instancePath.cubicTo(4.39795f, 17.3327f, 0.666992f, 13.6017f, 0.666992f, 8.99935f);
                instancePath.cubicTo(0.666992f, 4.39698f, 4.39795f, 0.666016f, 9.00033f, 0.666016f);
                instancePath.cubicTo(13.6027f, 0.666016f, 17.3337f, 4.39698f, 17.3337f, 8.99935f);
                instancePath.cubicTo(17.3337f, 13.6017f, 13.6027f, 17.3327f, 9.00033f, 17.3327f);
                instancePath.close();
                instancePath.moveTo(8.15285f, 3.99935f);
                instancePath.lineTo(9.84591f, 3.99935f);
                instancePath.lineTo(9.74876f, 10.7466f);
                instancePath.lineTo(8.25f, 10.7466f);
                instancePath.lineTo(8.15285f, 3.99935f);
                instancePath.close();
                instancePath.moveTo(8.04197f, 13.0675f);
                instancePath.cubicTo(8.04197f, 13.6026f, 8.46987f, 14.0107f, 8.99656f, 14.0107f);
                instancePath.cubicTo(9.53464f, 14.0107f, 9.95685f, 13.6026f, 9.95685f, 13.0675f);
                instancePath.cubicTo(9.95685f, 12.5325f, 9.53464f, 12.1243f, 8.99656f, 12.1243f);
                instancePath.cubicTo(8.46987f, 12.1243f, 8.04197f, 12.5325f, 8.04197f, 13.0675f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
