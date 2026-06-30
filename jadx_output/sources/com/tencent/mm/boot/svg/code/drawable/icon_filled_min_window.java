package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_filled_min_window extends l95.c {
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
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(7.363961f, 15.22f);
        instancePath.lineTo(4.7799997f, 15.22f);
        instancePath.lineTo(4.7799997f, 13.22f);
        instancePath.lineTo(9.78f, 13.22f);
        instancePath.cubicTo(10.332285f, 13.22f, 10.78f, 13.667715f, 10.78f, 14.22f);
        instancePath.lineTo(10.78f, 19.220001f);
        instancePath.lineTo(8.78f, 19.220001f);
        instancePath.lineTo(8.78f, 16.63364f);
        instancePath.lineTo(4.4142137f, 20.998175f);
        instancePath.lineTo(3.0f, 19.583961f);
        instancePath.lineTo(7.363961f, 15.22f);
        instancePath.close();
        instancePath.moveTo(16.63604f, 8.778174f);
        instancePath.lineTo(19.220001f, 8.778174f);
        instancePath.lineTo(19.220001f, 10.778174f);
        instancePath.lineTo(14.22f, 10.778174f);
        instancePath.cubicTo(13.667715f, 10.778174f, 13.22f, 10.33046f, 13.22f, 9.778174f);
        instancePath.lineTo(13.22f, 4.7781744f);
        instancePath.lineTo(15.22f, 4.7781744f);
        instancePath.lineTo(15.22f, 7.364534f);
        instancePath.lineTo(19.585787f, 3.0f);
        instancePath.lineTo(21.0f, 4.4142137f);
        instancePath.lineTo(16.63604f, 8.778174f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
