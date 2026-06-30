package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_nine_grid extends l95.c {
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
        instancePaint3.setColor(-16777216);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(15.7939f, 20.7998f);
        instancePath.lineTo(20.7998f, 20.7998f);
        instancePath.lineTo(20.7998f, 15.7969f);
        instancePath.lineTo(15.7939f, 15.7969f);
        instancePath.lineTo(15.7939f, 20.7998f);
        instancePath.close();
        instancePath.moveTo(9.35938f, 20.7998f);
        instancePath.lineTo(14.5938f, 20.7998f);
        instancePath.lineTo(14.5938f, 15.7969f);
        instancePath.lineTo(9.35938f, 15.7969f);
        instancePath.lineTo(9.35938f, 20.7998f);
        instancePath.close();
        instancePath.moveTo(3.2002f, 20.7998f);
        instancePath.lineTo(8.15918f, 20.7998f);
        instancePath.lineTo(8.15918f, 15.7969f);
        instancePath.lineTo(3.2002f, 15.7969f);
        instancePath.lineTo(3.2002f, 20.7998f);
        instancePath.close();
        instancePath.moveTo(15.7939f, 14.5967f);
        instancePath.lineTo(20.7998f, 14.5967f);
        instancePath.lineTo(20.7998f, 9.48145f);
        instancePath.lineTo(15.7939f, 9.48145f);
        instancePath.lineTo(15.7939f, 14.5967f);
        instancePath.close();
        instancePath.moveTo(9.35938f, 14.5967f);
        instancePath.lineTo(14.5938f, 14.5967f);
        instancePath.lineTo(14.5938f, 9.48145f);
        instancePath.lineTo(9.35938f, 9.48145f);
        instancePath.lineTo(9.35938f, 14.5967f);
        instancePath.close();
        instancePath.moveTo(3.2002f, 14.5967f);
        instancePath.lineTo(8.15918f, 14.5967f);
        instancePath.lineTo(8.15918f, 9.48145f);
        instancePath.lineTo(3.2002f, 9.48145f);
        instancePath.lineTo(3.2002f, 14.5967f);
        instancePath.close();
        instancePath.moveTo(15.7939f, 8.28125f);
        instancePath.lineTo(20.7998f, 8.28125f);
        instancePath.lineTo(20.7998f, 3.2002f);
        instancePath.lineTo(15.7939f, 3.2002f);
        instancePath.lineTo(15.7939f, 8.28125f);
        instancePath.close();
        instancePath.moveTo(9.35938f, 8.28125f);
        instancePath.lineTo(14.5938f, 8.28125f);
        instancePath.lineTo(14.5938f, 3.2002f);
        instancePath.lineTo(9.35938f, 3.2002f);
        instancePath.lineTo(9.35938f, 8.28125f);
        instancePath.close();
        instancePath.moveTo(3.2002f, 8.28125f);
        instancePath.lineTo(8.15918f, 8.28125f);
        instancePath.lineTo(8.15918f, 3.2002f);
        instancePath.lineTo(3.2002f, 3.2002f);
        instancePath.lineTo(3.2002f, 8.28125f);
        instancePath.close();
        instancePath.moveTo(22.0f, 21.0f);
        instancePath.cubicTo(22.0f, 21.5523f, 21.5523f, 22.0f, 21.0f, 22.0f);
        instancePath.lineTo(3.0f, 22.0f);
        instancePath.cubicTo(2.44772f, 22.0f, 2.0f, 21.5523f, 2.0f, 21.0f);
        instancePath.lineTo(2.0f, 3.0f);
        instancePath.cubicTo(2.0f, 2.44772f, 2.44772f, 2.0f, 3.0f, 2.0f);
        instancePath.lineTo(21.0f, 2.0f);
        instancePath.cubicTo(21.5523f, 2.0f, 22.0f, 2.44772f, 22.0f, 3.0f);
        instancePath.lineTo(22.0f, 21.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
