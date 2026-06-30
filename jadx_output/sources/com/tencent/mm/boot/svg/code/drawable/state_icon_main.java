package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class state_icon_main extends l95.c {
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
        instancePath.moveTo(10.019531f, 21.0f);
        instancePath.cubicTo(18.304688f, 6.652344f, 36.652344f, 1.734375f, 51.0f, 10.019531f);
        instancePath.lineTo(51.29297f, 10.210938f);
        instancePath.cubicTo(52.5f, 11.109375f, 52.867188f, 12.785156f, 52.097656f, 14.117188f);
        instancePath.cubicTo(51.328125f, 15.449219f, 49.691406f, 15.96875f, 48.3125f, 15.371094f);
        instancePath.lineTo(48.0f, 15.214844f);
        instancePath.cubicTo(36.51953f, 8.589844f, 21.84375f, 12.519531f, 15.214844f, 24.0f);
        instancePath.cubicTo(10.773438f, 31.691406f, 11.074219f, 40.820312f, 15.210938f, 48.0f);
        instancePath.lineTo(15.214844f, 48.0f);
        instancePath.cubicTo(15.832031f, 49.066406f, 16.515625f, 50.066406f, 17.261719f, 51.0f);
        instancePath.cubicTo(17.324219f, 51.085938f, 17.390625f, 51.16797f, 17.460938f, 51.25f);
        instancePath.lineTo(17.261719f, 51.0f);
        instancePath.cubicTo(17.597656f, 51.421875f, 17.949219f, 51.83203f, 18.3125f, 52.226562f);
        instancePath.cubicTo(18.378906f, 52.304688f, 18.449219f, 52.378906f, 18.519531f, 52.453125f);
        instancePath.lineTo(18.3125f, 52.226562f);
        instancePath.cubicTo(18.417969f, 52.347656f, 18.53125f, 52.464844f, 18.640625f, 52.58203f);
        instancePath.lineTo(18.519531f, 52.453125f);
        instancePath.cubicTo(20.085938f, 54.117188f, 21.917969f, 55.58203f, 24.0f, 56.785156f);
        instancePath.lineTo(24.324219f, 56.972656f);
        instancePath.cubicTo(31.453125f, 60.933594f, 40.42578f, 61.160156f, 48.0f, 56.785156f);
        instancePath.cubicTo(59.48047f, 50.15625f, 63.410156f, 35.48047f, 56.785156f, 24.0f);
        instancePath.lineTo(56.628906f, 23.6875f);
        instancePath.cubicTo(56.03125f, 22.308594f, 56.55078f, 20.671875f, 57.882812f, 19.902344f);
        instancePath.cubicTo(59.214844f, 19.132812f, 60.890625f, 19.5f, 61.789062f, 20.707031f);
        instancePath.lineTo(61.98047f, 21.0f);
        instancePath.cubicTo(70.265625f, 35.347656f, 65.34766f, 53.695312f, 51.0f, 61.98047f);
        instancePath.cubicTo(39.085938f, 68.859375f, 24.410156f, 66.63672f, 15.035156f, 57.46875f);
        instancePath.cubicTo(14.964844f, 57.402344f, 14.898438f, 57.335938f, 14.832031f, 57.26953f);
        instancePath.cubicTo(14.714844f, 57.152344f, 14.597656f, 57.03125f, 14.476562f, 56.910156f);
        instancePath.cubicTo(5.355469f, 47.53125f, 3.152344f, 32.890625f, 10.019531f, 21.0f);
        instancePath.close();
        instancePath.moveTo(10.019531f, 21.0f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
