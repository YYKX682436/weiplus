package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_fire extends l95.c {
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
                instancePath.moveTo(34.200806f, 7.552002f);
                instancePath.cubicTo(39.507114f, 7.552002f, 43.685303f, 12.014282f, 45.091553f, 16.47107f);
                instancePath.cubicTo(46.656857f, 21.431944f, 43.243286f, 26.969238f, 45.740845f, 29.0625f);
                instancePath.cubicTo(48.238403f, 31.155762f, 51.413086f, 27.455933f, 53.026497f, 24.667688f);
                instancePath.cubicTo(55.80043f, 29.66374f, 57.44912f, 35.48198f, 57.44912f, 41.55088f);
                instancePath.cubicTo(57.44912f, 52.05834f, 49.89365f, 60.801117f, 39.919163f, 62.642773f);
                instancePath.cubicTo(40.636597f, 61.769173f, 41.06638f, 60.65159f, 41.06638f, 59.43362f);
                instancePath.cubicTo(41.06638f, 56.11458f, 39.377586f, 52.80337f, 36.0f, 49.5f);
                instancePath.cubicTo(32.622414f, 52.80337f, 30.933619f, 56.11458f, 30.933619f, 59.43362f);
                instancePath.cubicTo(30.933619f, 60.65159f, 31.363403f, 61.769173f, 32.079586f, 62.642994f);
                instancePath.cubicTo(22.105341f, 60.79995f, 14.550882f, 52.057636f, 14.550882f, 41.55088f);
                instancePath.cubicTo(14.550882f, 32.11453f, 20.35364f, 25.571796f, 23.196913f, 23.066687f);
                instancePath.cubicTo(22.610746f, 25.77886f, 22.603514f, 31.248344f, 23.683264f, 32.03204f);
                instancePath.cubicTo(23.696754f, 32.041832f, 23.732718f, 32.001656f, 23.737024f, 31.972952f);
                instancePath.cubicTo(25.737291f, 18.641375f, 37.708652f, 15.437002f, 34.200806f, 7.552002f);
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
