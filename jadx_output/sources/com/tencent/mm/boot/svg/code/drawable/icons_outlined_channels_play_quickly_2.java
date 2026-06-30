package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_channels_play_quickly_2 extends l95.c {
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(47.112f, 48.576f);
                instancePath.cubicTo(50.696f, 48.576f, 52.488f, 51.032f, 52.488f, 55.944f);
                instancePath.lineTo(52.488f, 58.896f);
                instancePath.cubicTo(52.488f, 63.856f, 50.696f, 66.336f, 47.112f, 66.336f);
                instancePath.cubicTo(43.528f, 66.336f, 41.736f, 63.856f, 41.736f, 58.896f);
                instancePath.lineTo(41.736f, 55.944f);
                instancePath.cubicTo(41.736f, 51.032f, 43.528f, 48.576f, 47.112f, 48.576f);
                instancePath.close();
                instancePath.moveTo(26.808f, 48.576f);
                instancePath.cubicTo(27.784f, 48.576f, 28.664f, 48.784f, 29.448f, 49.2f);
                instancePath.cubicTo(30.232f, 49.616f, 30.852f, 50.188f, 31.308f, 50.916f);
                instancePath.cubicTo(31.764f, 51.644f, 31.992f, 52.464f, 31.992f, 53.376f);
                instancePath.cubicTo(31.992f, 54.256f, 31.788f, 55.14f, 31.38f, 56.028f);
                instancePath.cubicTo(30.972f, 56.916f, 30.288f, 57.88f, 29.328f, 58.92f);
                instancePath.lineTo(25.44f, 63.12f);
                instancePath.lineTo(32.112f, 63.12f);
                instancePath.lineTo(32.112f, 66.0f);
                instancePath.lineTo(21.048f, 66.0f);
                instancePath.lineTo(21.048f, 63.648f);
                instancePath.lineTo(26.928f, 57.288f);
                instancePath.cubicTo(27.648f, 56.52f, 28.152f, 55.832f, 28.44f, 55.224f);
                instancePath.cubicTo(28.728f, 54.616f, 28.872f, 54.048f, 28.872f, 53.52f);
                instancePath.cubicTo(28.872f, 52.944f, 28.668f, 52.476f, 28.26f, 52.116f);
                instancePath.cubicTo(27.852f, 51.756f, 27.328f, 51.576f, 26.688f, 51.576f);
                instancePath.cubicTo(26.048f, 51.576f, 25.464f, 51.808f, 24.936f, 52.272f);
                instancePath.cubicTo(24.408f, 52.736f, 23.968f, 53.384f, 23.616f, 54.216f);
                instancePath.lineTo(21.024f, 52.8f);
                instancePath.cubicTo(21.584f, 51.488f, 22.356f, 50.456f, 23.34f, 49.704f);
                instancePath.cubicTo(24.324f, 48.952f, 25.48f, 48.576f, 26.808f, 48.576f);
                instancePath.close();
                instancePath.moveTo(38.328f, 63.0f);
                instancePath.lineTo(38.328f, 66.0f);
                instancePath.lineTo(35.304f, 66.0f);
                instancePath.lineTo(35.304f, 63.0f);
                instancePath.lineTo(38.328f, 63.0f);
                instancePath.close();
                instancePath.moveTo(47.112f, 51.552f);
                instancePath.cubicTo(46.344f, 51.552f, 45.776f, 51.904f, 45.408f, 52.608f);
                instancePath.cubicTo(45.04f, 53.312f, 44.856f, 54.392f, 44.856f, 55.848f);
                instancePath.lineTo(44.856f, 58.992f);
                instancePath.cubicTo(44.856f, 60.48f, 45.04f, 61.576f, 45.408f, 62.28f);
                instancePath.cubicTo(45.776f, 62.984f, 46.344f, 63.336f, 47.112f, 63.336f);
                instancePath.cubicTo(47.88f, 63.336f, 48.448f, 62.98f, 48.816f, 62.268f);
                instancePath.cubicTo(49.184f, 61.556f, 49.368f, 60.464f, 49.368f, 58.992f);
                instancePath.lineTo(49.368f, 55.848f);
                instancePath.cubicTo(49.368f, 54.392f, 49.18f, 53.312f, 48.804f, 52.608f);
                instancePath.cubicTo(48.428f, 51.904f, 47.864f, 51.552f, 47.112f, 51.552f);
                instancePath.close();
                instancePath.moveTo(36.0f, 6.0f);
                instancePath.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
                instancePath.cubicTo(66.0f, 40.82369f, 64.86155f, 45.381477f, 62.838688f, 49.419334f);
                instancePath.lineTo(59.618267f, 47.80858f);
                instancePath.cubicTo(61.39825f, 44.255367f, 62.4f, 40.24467f, 62.4f, 36.0f);
                instancePath.cubicTo(62.4f, 21.419683f, 50.58032f, 9.6f, 36.0f, 9.6f);
                instancePath.cubicTo(21.419683f, 9.6f, 9.6f, 21.419683f, 9.6f, 36.0f);
                instancePath.cubicTo(9.6f, 40.245068f, 10.601939f, 44.256123f, 12.3822365f, 47.80958f);
                instancePath.lineTo(9.161311f, 49.419334f);
                instancePath.cubicTo(7.138447f, 45.381477f, 6.0f, 40.82369f, 6.0f, 36.0f);
                instancePath.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
                instancePath.close();
                instancePath.moveTo(49.49854f, 19.913067f);
                instancePath.cubicTo(50.105515f, 20.42238f, 50.246742f, 21.290276f, 49.85353f, 21.960785f);
                instancePath.lineTo(49.767742f, 22.09209f);
                instancePath.lineTo(40.395844f, 35.032978f);
                instancePath.cubicTo(40.464054f, 35.34447f, 40.5f, 35.668037f, 40.5f, 36.0f);
                instancePath.cubicTo(40.5f, 38.485283f, 38.485283f, 40.5f, 36.0f, 40.5f);
                instancePath.cubicTo(33.514717f, 40.5f, 31.5f, 38.485283f, 31.5f, 36.0f);
                instancePath.cubicTo(31.5f, 33.514717f, 33.514717f, 31.5f, 36.0f, 31.5f);
                instancePath.cubicTo(36.063267f, 31.5f, 36.126232f, 31.501307f, 36.18886f, 31.503891f);
                instancePath.lineTo(47.305874f, 20.026337f);
                instancePath.cubicTo(47.89389f, 19.419247f, 48.851097f, 19.369799f, 49.49854f, 19.913067f);
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
