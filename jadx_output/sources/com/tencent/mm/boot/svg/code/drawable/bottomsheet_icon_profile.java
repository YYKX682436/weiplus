package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class bottomsheet_icon_profile extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 96;
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-8617851);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(80.0f, 73.0f);
                instancePath.lineTo(80.0f, 73.0f);
                instancePath.lineTo(79.0f, 73.0f);
                instancePath.cubicTo(79.29834f, 73.19833f, 79.27355f, 73.192024f, 79.0f, 73.0f);
                instancePath.lineTo(57.0f, 67.0f);
                instancePath.lineTo(57.0f, 62.0f);
                instancePath.cubicTo(56.61111f, 60.643684f, 57.962963f, 59.314816f, 58.0f, 59.0f);
                instancePath.lineTo(58.0f, 59.0f);
                instancePath.cubicTo(63.88858f, 54.7762f, 67.90448f, 45.9815f, 68.0f, 35.0f);
                instancePath.cubicTo(67.8842f, 21.389061f, 59.20126f, 12.0f, 49.0f, 12.0f);
                instancePath.cubicTo(37.79874f, 12.0f, 29.131117f, 21.389061f, 29.0f, 35.0f);
                instancePath.cubicTo(29.151396f, 45.98015f, 33.179913f, 54.775295f, 39.0f, 59.0f);
                instancePath.lineTo(39.0f, 59.0f);
                instancePath.cubicTo(39.037037f, 59.314816f, 40.38889f, 60.643684f, 40.0f, 62.0f);
                instancePath.lineTo(40.0f, 65.0f);
                instancePath.cubicTo(40.38889f, 66.18132f, 39.252434f, 66.882484f, 38.0f, 67.0f);
                instancePath.lineTo(18.0f, 73.0f);
                instancePath.cubicTo(17.725994f, 73.192024f, 17.70166f, 73.19833f, 18.0f, 73.0f);
                instancePath.lineTo(17.0f, 73.0f);
                instancePath.lineTo(17.0f, 73.0f);
                instancePath.cubicTo(14.2589445f, 74.41951f, 12.0f, 77.41431f, 12.0f, 81.0f);
                instancePath.lineTo(12.0f, 85.0f);
                instancePath.lineTo(13.0f, 85.0f);
                instancePath.lineTo(27.0f, 85.0f);
                instancePath.lineTo(70.0f, 85.0f);
                instancePath.lineTo(84.0f, 85.0f);
                instancePath.lineTo(85.0f, 85.0f);
                instancePath.lineTo(85.0f, 81.0f);
                instancePath.cubicTo(85.0f, 77.41431f, 82.74061f, 74.41951f, 80.0f, 73.0f);
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
