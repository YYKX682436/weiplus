package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_top_off extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(7.267f, 9.388f);
        instancePath.lineTo(16.071068f, 18.192f);
        instancePath.lineTo(16.071068f, 21.071068f);
        instancePath.cubicTo(16.071068f, 21.623352f, 15.623353f, 22.071068f, 15.071068f, 22.071068f);
        instancePath.lineTo(9.071068f, 22.071068f);
        instancePath.cubicTo(8.518783f, 22.071068f, 8.071068f, 21.623352f, 8.071068f, 21.071068f);
        instancePath.lineTo(8.071068f, 13.071068f);
        instancePath.lineTo(6.0f, 13.071068f);
        instancePath.cubicTo(5.4477153f, 13.071068f, 5.0f, 12.623353f, 5.0f, 12.071068f);
        instancePath.cubicTo(5.0f, 11.805851f, 5.1053567f, 11.551497f, 5.2928934f, 11.363961f);
        instancePath.lineTo(7.267f, 9.388f);
        instancePath.close();
        instancePath.moveTo(5.1213202f, 3.0f);
        instancePath.lineTo(9.38766f, 7.267f);
        instancePath.lineTo(11.363961f, 5.2928934f);
        instancePath.cubicTo(11.754485f, 4.902369f, 12.3876505f, 4.902369f, 12.778174f, 5.2928934f);
        instancePath.lineTo(18.849243f, 11.363961f);
        instancePath.cubicTo(19.239767f, 11.754485f, 19.239767f, 12.3876505f, 18.849243f, 12.778174f);
        instancePath.cubicTo(18.661707f, 12.965711f, 18.407352f, 13.071068f, 18.142136f, 13.071068f);
        instancePath.lineTo(16.071068f, 13.071068f);
        instancePath.lineTo(16.07066f, 13.949f);
        instancePath.lineTo(22.091883f, 19.970562f);
        instancePath.lineTo(21.031223f, 21.031223f);
        instancePath.lineTo(4.0606604f, 4.0606604f);
        instancePath.lineTo(5.1213202f, 3.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
