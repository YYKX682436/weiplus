package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_shopping_order extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(46.19922f, 4.800781f);
        instancePath.cubicTo(47.195312f, 4.800781f, 48.0f, 5.605469f, 48.0f, 6.601562f);
        instancePath.lineTo(47.996094f, 9.296875f);
        instancePath.lineTo(55.5f, 9.300781f);
        instancePath.cubicTo(57.984375f, 9.300781f, 60.0f, 11.316406f, 60.0f, 13.800781f);
        instancePath.lineTo(60.0f, 60.30078f);
        instancePath.cubicTo(60.0f, 62.785156f, 57.984375f, 64.80078f, 55.5f, 64.80078f);
        instancePath.lineTo(16.5f, 64.80078f);
        instancePath.cubicTo(14.015625f, 64.80078f, 12.0f, 62.785156f, 12.0f, 60.30078f);
        instancePath.lineTo(12.0f, 13.800781f);
        instancePath.cubicTo(12.0f, 11.316406f, 14.015625f, 9.300781f, 16.5f, 9.300781f);
        instancePath.lineTo(23.996094f, 9.296875f);
        instancePath.lineTo(24.0f, 6.601562f);
        instancePath.cubicTo(24.0f, 5.605469f, 24.804688f, 4.800781f, 25.800781f, 4.800781f);
        instancePath.cubicTo(26.792969f, 4.800781f, 27.601562f, 5.605469f, 27.601562f, 6.601562f);
        instancePath.lineTo(27.597656f, 9.296875f);
        instancePath.lineTo(44.398438f, 9.296875f);
        instancePath.lineTo(44.398438f, 6.601562f);
        instancePath.cubicTo(44.398438f, 5.605469f, 45.20703f, 4.800781f, 46.19922f, 4.800781f);
        instancePath.close();
        instancePath.moveTo(44.398438f, 12.898438f);
        instancePath.lineTo(27.597656f, 12.898438f);
        instancePath.lineTo(27.601562f, 16.5f);
        instancePath.cubicTo(27.601562f, 17.492188f, 26.792969f, 18.300781f, 25.800781f, 18.300781f);
        instancePath.cubicTo(24.804688f, 18.300781f, 24.0f, 17.492188f, 24.0f, 16.5f);
        instancePath.lineTo(23.996094f, 12.898438f);
        instancePath.lineTo(16.5f, 12.898438f);
        instancePath.cubicTo(16.003906f, 12.898438f, 15.601562f, 13.304688f, 15.601562f, 13.800781f);
        instancePath.lineTo(15.601562f, 60.30078f);
        instancePath.cubicTo(15.601562f, 60.796875f, 16.003906f, 61.19922f, 16.5f, 61.19922f);
        instancePath.lineTo(55.5f, 61.19922f);
        instancePath.cubicTo(55.996094f, 61.19922f, 56.398438f, 60.796875f, 56.398438f, 60.30078f);
        instancePath.lineTo(56.398438f, 13.800781f);
        instancePath.cubicTo(56.398438f, 13.304688f, 55.996094f, 12.898438f, 55.5f, 12.898438f);
        instancePath.lineTo(47.996094f, 12.898438f);
        instancePath.lineTo(48.0f, 16.5f);
        instancePath.cubicTo(48.0f, 17.492188f, 47.195312f, 18.300781f, 46.19922f, 18.300781f);
        instancePath.cubicTo(45.20703f, 18.300781f, 44.398438f, 17.492188f, 44.398438f, 16.5f);
        instancePath.close();
        instancePath.moveTo(49.19922f, 40.80078f);
        instancePath.cubicTo(50.195312f, 40.80078f, 51.0f, 41.60547f, 51.0f, 42.601562f);
        instancePath.cubicTo(51.0f, 43.59375f, 50.195312f, 44.398438f, 49.19922f, 44.398438f);
        instancePath.lineTo(22.800781f, 44.398438f);
        instancePath.cubicTo(21.804688f, 44.398438f, 21.0f, 43.59375f, 21.0f, 42.601562f);
        instancePath.cubicTo(21.0f, 41.60547f, 21.804688f, 40.80078f, 22.800781f, 40.80078f);
        instancePath.close();
        instancePath.moveTo(49.19922f, 30.300781f);
        instancePath.cubicTo(50.195312f, 30.300781f, 51.0f, 31.105469f, 51.0f, 32.101562f);
        instancePath.cubicTo(51.0f, 33.09375f, 50.195312f, 33.898438f, 49.19922f, 33.898438f);
        instancePath.lineTo(22.800781f, 33.898438f);
        instancePath.cubicTo(21.804688f, 33.898438f, 21.0f, 33.09375f, 21.0f, 32.101562f);
        instancePath.cubicTo(21.0f, 31.105469f, 21.804688f, 30.300781f, 22.800781f, 30.300781f);
        instancePath.close();
        instancePath.moveTo(49.19922f, 30.300781f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
