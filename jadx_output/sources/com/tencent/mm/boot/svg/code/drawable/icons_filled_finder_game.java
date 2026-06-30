package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_finder_game extends l95.c {
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(50.910156f, 15.0f);
            instancePath.cubicTo(56.820312f, 15.0f, 63.734375f, 20.710938f, 65.40234f, 36.746094f);
            instancePath.cubicTo(66.61328f, 48.390625f, 65.99609f, 55.214844f, 63.453125f, 58.222656f);
            instancePath.cubicTo(62.460938f, 59.402344f, 61.17578f, 60.0f, 59.648438f, 60.0f);
            instancePath.cubicTo(55.71875f, 60.0f, 53.48047f, 57.503906f, 50.878906f, 54.621094f);
            instancePath.cubicTo(49.960938f, 53.601562f, 49.007812f, 52.539062f, 47.90625f, 51.48828f);
            instancePath.cubicTo(45.0f, 48.73828f, 42.07422f, 48.35547f, 39.347656f, 48.35547f);
            instancePath.cubicTo(38.86328f, 48.35547f, 38.382812f, 48.371094f, 37.92578f, 48.382812f);
            instancePath.cubicTo(37.48828f, 48.39453f, 37.0625f, 48.402344f, 36.660156f, 48.402344f);
            instancePath.lineTo(35.347656f, 48.402344f);
            instancePath.cubicTo(34.945312f, 48.402344f, 34.51953f, 48.390625f, 34.078125f, 48.382812f);
            instancePath.cubicTo(33.625f, 48.371094f, 33.148438f, 48.35547f, 32.65625f, 48.35547f);
            instancePath.cubicTo(29.925781f, 48.35547f, 27.003906f, 48.73828f, 24.101562f, 51.48828f);
            instancePath.cubicTo(22.992188f, 52.539062f, 22.042969f, 53.597656f, 21.121094f, 54.621094f);
            instancePath.cubicTo(18.527344f, 57.503906f, 16.28125f, 60.0f, 12.351562f, 60.0f);
            instancePath.cubicTo(10.824219f, 60.0f, 9.542969f, 59.402344f, 8.546875f, 58.222656f);
            instancePath.cubicTo(6.003906f, 55.20703f, 5.386719f, 48.382812f, 6.597656f, 36.746094f);
            instancePath.cubicTo(8.273438f, 20.710938f, 15.179688f, 15.0f, 21.089844f, 15.0f);
            instancePath.close();
            instancePath.moveTo(27.300781f, 27.0f);
            instancePath.lineTo(23.699219f, 27.0f);
            instancePath.lineTo(23.699219f, 31.195312f);
            instancePath.lineTo(19.5f, 31.199219f);
            instancePath.lineTo(19.5f, 34.80078f);
            instancePath.lineTo(23.699219f, 34.796875f);
            instancePath.lineTo(23.699219f, 39.0f);
            instancePath.lineTo(27.300781f, 39.0f);
            instancePath.lineTo(27.300781f, 34.796875f);
            instancePath.lineTo(31.5f, 34.80078f);
            instancePath.lineTo(31.5f, 31.199219f);
            instancePath.lineTo(27.300781f, 31.195312f);
            instancePath.close();
            instancePath.moveTo(48.0f, 27.0f);
            instancePath.cubicTo(44.6875f, 27.0f, 42.0f, 29.6875f, 42.0f, 33.0f);
            instancePath.cubicTo(42.0f, 36.3125f, 44.6875f, 39.0f, 48.0f, 39.0f);
            instancePath.cubicTo(51.3125f, 39.0f, 54.0f, 36.3125f, 54.0f, 33.0f);
            instancePath.cubicTo(54.0f, 29.6875f, 51.3125f, 27.0f, 48.0f, 27.0f);
            instancePath.close();
            instancePath.moveTo(48.0f, 30.601562f);
            instancePath.cubicTo(49.32422f, 30.601562f, 50.398438f, 31.675781f, 50.398438f, 33.0f);
            instancePath.cubicTo(50.398438f, 34.32422f, 49.32422f, 35.398438f, 48.0f, 35.398438f);
            instancePath.cubicTo(46.67578f, 35.398438f, 45.601562f, 34.32422f, 45.601562f, 33.0f);
            instancePath.cubicTo(45.601562f, 31.675781f, 46.67578f, 30.601562f, 48.0f, 30.601562f);
            instancePath.close();
            instancePath.moveTo(48.0f, 30.601562f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
