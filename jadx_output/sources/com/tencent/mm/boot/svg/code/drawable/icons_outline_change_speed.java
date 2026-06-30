package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outline_change_speed extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                instancePath.moveTo(36.0f, 6.0f);
                instancePath.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
                instancePath.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
                instancePath.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
                instancePath.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
                instancePath.close();
                instancePath.moveTo(36.0f, 10.8f);
                instancePath.cubicTo(22.082424f, 10.8f, 10.8f, 22.082424f, 10.8f, 36.0f);
                instancePath.cubicTo(10.8f, 49.917576f, 22.082424f, 61.2f, 36.0f, 61.2f);
                instancePath.cubicTo(49.917576f, 61.2f, 61.2f, 49.917576f, 61.2f, 36.0f);
                instancePath.cubicTo(61.2f, 22.082424f, 49.917576f, 10.8f, 36.0f, 10.8f);
                instancePath.close();
                instancePath.moveTo(47.39183f, 23.515844f);
                instancePath.cubicTo(47.463448f, 23.661095f, 47.473305f, 23.829126f, 47.419167f, 23.981754f);
                instancePath.lineTo(42.45432f, 37.982044f);
                instancePath.cubicTo(41.60756f, 40.74275f, 39.03819f, 42.75f, 36.0f, 42.75f);
                instancePath.cubicTo(32.27208f, 42.75f, 29.25f, 39.72792f, 29.25f, 36.0f);
                instancePath.cubicTo(29.25f, 33.34366f, 30.784407f, 31.045694f, 33.015236f, 29.944092f);
                instancePath.lineTo(33.008957f, 29.938238f);
                instancePath.lineTo(46.58836f, 23.243027f);
                instancePath.cubicTo(46.885567f, 23.09649f, 47.245296f, 23.218636f, 47.39183f, 23.515844f);
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
