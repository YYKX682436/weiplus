package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class at_all_avater extends l95.c {
    private final int width = 108;
    private final int height = 108;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 108;
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
                instancePaint3.setColor(-13917627);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(108.0f, 0.0f);
                instancePath.lineTo(108.0f, 108.0f);
                instancePath.lineTo(0.0f, 108.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(54.752f, 27.584f);
                instancePath2.cubicTo(46.472f, 27.584f, 39.704f, 30.248f, 34.376f, 35.648f);
                instancePath2.cubicTo(29.264f, 40.688f, 26.744f, 46.952f, 26.744f, 54.512f);
                instancePath2.cubicTo(26.744f, 62.576f, 29.264f, 68.984f, 34.376f, 73.88f);
                instancePath2.cubicTo(39.344f, 78.632f, 46.112f, 81.008f, 54.752f, 81.008f);
                instancePath2.cubicTo(60.44f, 81.008f, 65.552f, 79.856f, 70.16f, 77.624f);
                instancePath2.cubicTo(74.912f, 75.32f, 78.512f, 72.008f, 81.032f, 67.688f);
                instancePath2.lineTo(75.992f, 67.688f);
                instancePath2.cubicTo(73.976f, 70.568f, 71.312f, 72.8f, 68.0f, 74.456f);
                instancePath2.cubicTo(64.256f, 76.256f, 59.792f, 77.192f, 54.752f, 77.192f);
                instancePath2.cubicTo(47.696f, 77.192f, 42.152f, 75.248f, 38.12f, 71.504f);
                instancePath2.cubicTo(33.8f, 67.544f, 31.712f, 61.928f, 31.712f, 54.656f);
                instancePath2.cubicTo(31.712f, 48.032f, 33.8f, 42.488f, 38.048f, 38.168f);
                instancePath2.cubicTo(42.368f, 33.776f, 47.84f, 31.616f, 54.464f, 31.616f);
                instancePath2.cubicTo(60.656f, 31.616f, 65.696f, 33.416f, 69.44f, 37.088f);
                instancePath2.cubicTo(72.896f, 40.472f, 74.624f, 44.72f, 74.624f, 49.832f);
                instancePath2.cubicTo(74.624f, 54.296f, 73.328f, 58.184f, 70.736f, 61.496f);
                instancePath2.cubicTo(68.504f, 64.304f, 66.272f, 65.744f, 64.04f, 65.744f);
                instancePath2.cubicTo(62.672f, 65.744f, 62.024f, 65.096f, 62.024f, 63.944f);
                instancePath2.cubicTo(62.024f, 63.08f, 62.312f, 61.64f, 62.888f, 59.552f);
                instancePath2.lineTo(68.0f, 40.76f);
                instancePath2.lineTo(63.32f, 40.76f);
                instancePath2.lineTo(62.24f, 44.792f);
                instancePath2.cubicTo(61.088f, 41.192f, 58.784f, 39.392f, 55.328f, 39.392f);
                instancePath2.cubicTo(51.008f, 39.392f, 47.336f, 41.264f, 44.168f, 45.152f);
                instancePath2.cubicTo(40.856f, 49.04f, 39.272f, 53.72f, 39.272f, 59.048f);
                instancePath2.cubicTo(39.272f, 62.144f, 40.208f, 64.736f, 42.08f, 66.752f);
                instancePath2.cubicTo(43.952f, 68.768f, 46.4f, 69.848f, 49.424f, 69.848f);
                instancePath2.cubicTo(53.024f, 69.848f, 56.048f, 68.192f, 58.496f, 64.952f);
                instancePath2.cubicTo(58.784f, 68.12f, 60.44f, 69.704f, 63.464f, 69.704f);
                instancePath2.cubicTo(67.208f, 69.704f, 70.664f, 67.688f, 73.832f, 63.728f);
                instancePath2.cubicTo(77.0f, 59.552f, 78.656f, 54.944f, 78.656f, 49.76f);
                instancePath2.cubicTo(78.656f, 43.568f, 76.64f, 38.456f, 72.608f, 34.352f);
                instancePath2.cubicTo(68.216f, 29.816f, 62.24f, 27.584f, 54.752f, 27.584f);
                instancePath2.close();
                instancePath2.moveTo(56.12f, 43.928f);
                instancePath2.cubicTo(57.56f, 43.928f, 58.712f, 44.504f, 59.648f, 45.656f);
                instancePath2.cubicTo(60.44f, 46.592f, 60.872f, 47.744f, 60.872f, 49.04f);
                instancePath2.cubicTo(60.872f, 49.472f, 60.584f, 50.624f, 60.152f, 52.496f);
                instancePath2.lineTo(58.568f, 58.4f);
                instancePath2.cubicTo(57.992f, 60.272f, 56.84f, 62.0f, 55.112f, 63.44f);
                instancePath2.cubicTo(53.384f, 64.88f, 51.584f, 65.6f, 49.784f, 65.6f);
                instancePath2.cubicTo(47.984f, 65.6f, 46.616f, 65.024f, 45.68f, 63.872f);
                instancePath2.cubicTo(44.744f, 62.72f, 44.312f, 61.208f, 44.312f, 59.264f);
                instancePath2.cubicTo(44.312f, 55.016f, 45.536f, 51.416f, 47.984f, 48.392f);
                instancePath2.cubicTo(50.288f, 45.368f, 53.024f, 43.928f, 56.12f, 43.928f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
