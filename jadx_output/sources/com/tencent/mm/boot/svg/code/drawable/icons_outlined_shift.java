package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_shift extends l95.c {
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(18.0f, 6.0f);
                instancePath.lineTo(18.0f, 7.2003f);
                instancePath.lineTo(8.192f, 7.2f);
                instancePath.lineTo(17.924242f, 16.93516f);
                instancePath.lineTo(17.075714f, 17.7839f);
                instancePath.lineTo(7.198f, 7.903f);
                instancePath.lineTo(7.2f, 18.0f);
                instancePath.lineTo(6.0f, 18.0f);
                instancePath.lineTo(6.0f, 6.595082f);
                instancePath.lineTo(6.003f, 6.563f);
                instancePath.lineTo(6.007971f, 6.5028024f);
                instancePath.lineTo(6.031519f, 6.40699f);
                instancePath.cubicTo(6.041712f, 6.3774304f, 6.054218f, 6.3489013f, 6.0688024f, 6.3216076f);
                instancePath.lineTo(6.093588f, 6.2795477f);
                instancePath.cubicTo(6.200504f, 6.111543f, 6.3876815f, 6.0f, 6.595082f, 6.0f);
                instancePath.lineTo(18.0f, 6.0f);
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
