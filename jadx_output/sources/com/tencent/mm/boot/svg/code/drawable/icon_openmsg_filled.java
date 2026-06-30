package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_openmsg_filled extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                instancePaint3.setColor(-16777216);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(4.92893f, 4.92892f);
                instancePath.cubicTo(8.83418f, 1.02367f, 15.1658f, 1.02367f, 19.0711f, 4.92892f);
                instancePath.cubicTo(22.9763f, 8.83416f, 22.9763f, 15.1658f, 19.0711f, 19.0711f);
                instancePath.cubicTo(15.1658f, 22.9763f, 8.83417f, 22.9763f, 4.92893f, 19.0711f);
                instancePath.cubicTo(1.02369f, 15.1658f, 1.02369f, 8.83416f, 4.92893f, 4.92892f);
                instancePath.close();
                instancePath.moveTo(13.9854f, 14.7658f);
                instancePath.lineTo(14.0332f, 11.3126f);
                instancePath.lineTo(8.88947f, 16.4564f);
                instancePath.lineTo(7.54597f, 15.1129f);
                instancePath.lineTo(12.6931f, 9.9657f);
                instancePath.lineTo(9.18628f, 9.96571f);
                instancePath.lineTo(9.18628f, 8.06581f);
                instancePath.lineTo(14.5363f, 8.06581f);
                instancePath.cubicTo(15.2819f, 8.06581f, 15.8863f, 8.67023f, 15.8863f, 9.41581f);
                instancePath.lineTo(15.8863f, 14.7658f);
                instancePath.lineTo(13.9854f, 14.7658f);
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
