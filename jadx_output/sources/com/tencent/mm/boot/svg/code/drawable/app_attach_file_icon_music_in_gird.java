package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_attach_file_icon_music_in_gird extends l95.c {
    private final int width = 80;
    private final int height = 80;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 80;
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
                instancePaint3.setColor(-1);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(32.10879f, 26.734407f);
                instancePath.lineTo(32.10879f, 56.345825f);
                instancePath.lineTo(32.10879f, 59.81005f);
                instancePath.cubicTo(32.10879f, 63.036148f, 30.576809f, 66.21981f, 27.572372f, 67.575066f);
                instancePath.cubicTo(27.01386f, 67.827f, 23.48564f, 68.58973f, 23.024942f, 68.679375f);
                instancePath.cubicTo(18.598322f, 69.540695f, 15.1971445f, 67.022964f, 15.009837f, 63.314568f);
                instancePath.cubicTo(14.82253f, 59.606167f, 17.336971f, 57.663437f, 20.254364f, 57.095776f);
                instancePath.lineTo(26.388245f, 55.79136f);
                instancePath.cubicTo(27.481236f, 55.558926f, 28.347324f, 54.479134f, 28.347324f, 53.37434f);
                instancePath.lineTo(28.347324f, 25.242409f);
                instancePath.cubicTo(28.341309f, 25.10356f, 28.354797f, 24.967648f, 28.385284f, 24.836742f);
                instancePath.lineTo(28.385284f, 21.949265f);
                instancePath.cubicTo(28.385284f, 21.397732f, 28.814762f, 20.83892f, 29.348425f, 20.700115f);
                instancePath.lineTo(63.430626f, 11.835335f);
                instancePath.cubicTo(63.962555f, 11.69698f, 64.39377f, 12.039573f, 64.39377f, 12.589663f);
                instancePath.lineTo(64.39377f, 17.198563f);
                instancePath.cubicTo(64.40323f, 17.2652f, 64.40813f, 17.333122f, 64.40813f, 17.402126f);
                instancePath.lineTo(64.40813f, 48.572945f);
                instancePath.lineTo(64.40813f, 52.037174f);
                instancePath.cubicTo(64.40813f, 55.263268f, 62.876144f, 58.44693f, 59.871708f, 59.802193f);
                instancePath.cubicTo(59.313194f, 60.054127f, 55.784973f, 60.816853f, 55.32428f, 60.906494f);
                instancePath.cubicTo(50.89766f, 61.767815f, 47.49648f, 59.250088f, 47.309174f, 55.541687f);
                instancePath.cubicTo(47.121864f, 51.83329f, 49.636307f, 49.890556f, 52.5537f, 49.3229f);
                instancePath.lineTo(58.68758f, 48.01848f);
                instancePath.cubicTo(59.78057f, 47.786045f, 60.64666f, 46.706253f, 60.64666f, 45.601463f);
                instancePath.lineTo(60.64666f, 19.191336f);
                instancePath.lineTo(32.10879f, 26.734407f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
