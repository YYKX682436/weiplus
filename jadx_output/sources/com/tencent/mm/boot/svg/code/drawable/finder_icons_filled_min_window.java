package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_icons_filled_min_window extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(22.091883f, 45.66f);
        instancePath.lineTo(14.339999f, 45.66f);
        instancePath.lineTo(14.339999f, 39.66f);
        instancePath.lineTo(29.34f, 39.66f);
        instancePath.cubicTo(30.996853f, 39.66f, 32.34f, 41.003147f, 32.34f, 42.66f);
        instancePath.lineTo(32.34f, 57.66f);
        instancePath.lineTo(26.34f, 57.66f);
        instancePath.lineTo(26.34f, 49.900925f);
        instancePath.lineTo(13.2426405f, 62.994526f);
        instancePath.lineTo(9.0f, 58.751884f);
        instancePath.lineTo(22.091883f, 45.66f);
        instancePath.close();
        instancePath.moveTo(49.908115f, 26.334524f);
        instancePath.lineTo(57.66f, 26.334524f);
        instancePath.lineTo(57.66f, 32.334522f);
        instancePath.lineTo(42.66f, 32.334522f);
        instancePath.cubicTo(41.003147f, 32.334522f, 39.66f, 30.991379f, 39.66f, 29.334524f);
        instancePath.lineTo(39.66f, 14.334524f);
        instancePath.lineTo(45.66f, 14.334524f);
        instancePath.lineTo(45.66f, 22.093601f);
        instancePath.lineTo(58.75736f, 9.0f);
        instancePath.lineTo(63.0f, 13.2426405f);
        instancePath.lineTo(49.908115f, 26.334524f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
