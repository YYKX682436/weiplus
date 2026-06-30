package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_channels_turn extends l95.c {
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
            l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(38.484375f, 18.009768f);
            instancePath.cubicTo(40.426003f, 18.009768f, 42.0f, 19.520807f, 42.0f, 21.384768f);
            instancePath.lineTo(42.0f, 59.635456f);
            instancePath.cubicTo(42.0f, 61.499416f, 40.426003f, 63.010456f, 38.484375f, 63.010456f);
            instancePath.lineTo(15.515625f, 63.010456f);
            instancePath.cubicTo(13.573998f, 63.010456f, 12.0f, 61.499416f, 12.0f, 59.635456f);
            instancePath.lineTo(12.0f, 21.384768f);
            instancePath.cubicTo(12.0f, 19.520807f, 13.573998f, 18.009768f, 15.515625f, 18.009768f);
            instancePath.lineTo(38.484375f, 18.009768f);
            instancePath.close();
            instancePath.moveTo(38.403f, 21.611223f);
            instancePath.lineTo(15.603f, 21.611223f);
            instancePath.lineTo(15.603f, 59.411224f);
            instancePath.lineTo(38.403f, 59.411224f);
            instancePath.lineTo(38.403f, 21.611223f);
            instancePath.close();
            instancePath.moveTo(39.09f, 6.0f);
            instancePath.cubicTo(49.792572f, 6.0f, 58.511837f, 14.491551f, 58.878025f, 25.104883f);
            instancePath.lineTo(58.89493f, 27.675732f);
            instancePath.lineTo(63.46284f, 23.113476f);
            instancePath.lineTo(66.00348f, 25.654112f);
            instancePath.lineTo(59.215252f, 32.442337f);
            instancePath.cubicTo(58.04368f, 33.61391f, 56.144184f, 33.61391f, 54.97261f, 32.442337f);
            instancePath.lineTo(48.184387f, 25.654112f);
            instancePath.lineTo(50.722286f, 23.11621f);
            instancePath.lineTo(55.29293f, 27.684216f);
            instancePath.lineTo(55.29f, 25.8f);
            instancePath.cubicTo(55.29f, 17.071207f, 48.3865f, 9.954812f, 39.741554f, 9.612864f);
            instancePath.lineTo(39.09f, 9.6f);
            instancePath.lineTo(39.09f, 6.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
