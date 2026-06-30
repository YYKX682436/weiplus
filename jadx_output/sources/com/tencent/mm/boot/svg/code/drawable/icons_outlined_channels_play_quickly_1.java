package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_channels_play_quickly_1 extends l95.c {
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
                instancePath.moveTo(45.612f, 45.576f);
                instancePath.cubicTo(49.196f, 45.576f, 50.988f, 48.032f, 50.988f, 52.944f);
                instancePath.lineTo(50.988f, 55.896f);
                instancePath.cubicTo(50.988f, 60.856f, 49.196f, 63.336f, 45.612f, 63.336f);
                instancePath.cubicTo(42.028f, 63.336f, 40.236f, 60.856f, 40.236f, 55.896f);
                instancePath.lineTo(40.236f, 52.944f);
                instancePath.cubicTo(40.236f, 48.032f, 42.028f, 45.576f, 45.612f, 45.576f);
                instancePath.close();
                instancePath.moveTo(36.828f, 60.0f);
                instancePath.lineTo(36.828f, 63.0f);
                instancePath.lineTo(33.804f, 63.0f);
                instancePath.lineTo(33.804f, 60.0f);
                instancePath.lineTo(36.828f, 60.0f);
                instancePath.close();
                instancePath.moveTo(28.932f, 45.912f);
                instancePath.lineTo(28.932f, 63.0f);
                instancePath.lineTo(25.788f, 63.0f);
                instancePath.lineTo(25.788f, 49.992f);
                instancePath.lineTo(22.716f, 52.176f);
                instancePath.lineTo(21.012f, 49.68f);
                instancePath.lineTo(26.076f, 45.912f);
                instancePath.lineTo(28.932f, 45.912f);
                instancePath.close();
                instancePath.moveTo(45.612f, 48.552f);
                instancePath.cubicTo(44.844f, 48.552f, 44.276f, 48.904f, 43.908f, 49.608f);
                instancePath.cubicTo(43.54f, 50.312f, 43.356f, 51.392f, 43.356f, 52.848f);
                instancePath.lineTo(43.356f, 55.992f);
                instancePath.cubicTo(43.356f, 57.48f, 43.54f, 58.576f, 43.908f, 59.28f);
                instancePath.cubicTo(44.276f, 59.984f, 44.844f, 60.336f, 45.612f, 60.336f);
                instancePath.cubicTo(46.38f, 60.336f, 46.948f, 59.98f, 47.316f, 59.268f);
                instancePath.cubicTo(47.684f, 58.556f, 47.868f, 57.464f, 47.868f, 55.992f);
                instancePath.lineTo(47.868f, 52.848f);
                instancePath.cubicTo(47.868f, 51.392f, 47.68f, 50.312f, 47.304f, 49.608f);
                instancePath.cubicTo(46.928f, 48.904f, 46.364f, 48.552f, 45.612f, 48.552f);
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
                instancePath.moveTo(36.0f, 15.0f);
                instancePath.cubicTo(36.845173f, 15.0f, 37.546654f, 15.653162f, 37.60687f, 16.496187f);
                instancePath.lineTo(37.60687f, 16.496187f);
                instancePath.lineTo(38.745247f, 32.434105f);
                instancePath.cubicTo(39.812473f, 33.25694f, 40.5f, 34.54818f, 40.5f, 36.0f);
                instancePath.cubicTo(40.5f, 38.485283f, 38.485283f, 40.5f, 36.0f, 40.5f);
                instancePath.cubicTo(33.514717f, 40.5f, 31.5f, 38.485283f, 31.5f, 36.0f);
                instancePath.cubicTo(31.5f, 34.548634f, 32.1871f, 33.257744f, 33.253757f, 32.43487f);
                instancePath.lineTo(34.39313f, 16.496187f);
                instancePath.cubicTo(34.453346f, 15.653162f, 35.154827f, 15.0f, 36.0f, 15.0f);
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
