package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_mike extends l95.c {
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
            l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(38.25f, 56.88088f);
            instancePath.lineTo(38.25f, 66.0f);
            instancePath.lineTo(33.75f, 66.0f);
            instancePath.lineTo(33.75f, 56.88088f);
            instancePath.cubicTo(23.210026f, 55.75819f, 15.0f, 46.83787f, 15.0f, 36.0f);
            instancePath.lineTo(15.0f, 30.0f);
            instancePath.lineTo(19.5f, 30.0f);
            instancePath.lineTo(19.5f, 36.0f);
            instancePath.cubicTo(19.5f, 45.112698f, 26.887302f, 52.5f, 36.0f, 52.5f);
            instancePath.cubicTo(45.112698f, 52.5f, 52.5f, 45.112698f, 52.5f, 36.0f);
            instancePath.lineTo(52.5f, 30.0f);
            instancePath.lineTo(57.0f, 30.0f);
            instancePath.lineTo(57.0f, 36.0f);
            instancePath.cubicTo(57.0f, 46.83787f, 48.789974f, 55.75819f, 38.25f, 56.88088f);
            instancePath.close();
            instancePath.moveTo(24.0f, 18.0f);
            instancePath.cubicTo(24.0f, 11.372583f, 29.372583f, 6.0f, 36.0f, 6.0f);
            instancePath.cubicTo(42.62742f, 6.0f, 48.0f, 11.372583f, 48.0f, 18.0f);
            instancePath.lineTo(48.0f, 36.0f);
            instancePath.cubicTo(48.0f, 42.62742f, 42.62742f, 48.0f, 36.0f, 48.0f);
            instancePath.cubicTo(29.372583f, 48.0f, 24.0f, 42.62742f, 24.0f, 36.0f);
            instancePath.lineTo(24.0f, 18.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
