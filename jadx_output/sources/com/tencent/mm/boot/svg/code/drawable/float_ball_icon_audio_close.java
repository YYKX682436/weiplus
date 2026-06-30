package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class float_ball_icon_audio_close extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(21.327534f, 13.902913f);
        instancePath.lineTo(34.937027f, 27.51484f);
        instancePath.cubicTo(35.522747f, 28.100693f, 36.472496f, 28.100779f, 37.058334f, 27.515043f);
        instancePath.cubicTo(37.05834f, 27.51504f, 37.058342f, 27.515034f, 37.058334f, 27.515013f);
        instancePath.lineTo(50.672466f, 13.902913f);
        instancePath.lineTo(50.672466f, 13.902913f);
        instancePath.cubicTo(52.234562f, 12.340816f, 54.33192f, 11.905515f, 55.357048f, 12.930641f);
        instancePath.lineTo(59.06936f, 16.642952f);
        instancePath.cubicTo(60.094486f, 17.668077f, 59.659184f, 19.765436f, 58.097088f, 21.327534f);
        instancePath.lineTo(44.483414f, 34.937096f);
        instancePath.cubicTo(43.897392f, 35.522644f, 43.89725f, 36.472393f, 44.48295f, 37.05827f);
        instancePath.cubicTo(44.482998f, 37.058315f, 44.483044f, 37.058365f, 44.483242f, 37.05827f);
        instancePath.lineTo(58.097088f, 50.672466f);
        instancePath.lineTo(58.097088f, 50.672466f);
        instancePath.cubicTo(59.659184f, 52.234562f, 60.094486f, 54.33192f, 59.06936f, 55.357048f);
        instancePath.lineTo(55.357048f, 59.06936f);
        instancePath.cubicTo(54.33192f, 60.094486f, 52.234562f, 59.659184f, 50.672466f, 58.097088f);
        instancePath.lineTo(37.05827f, 44.483242f);
        instancePath.cubicTo(36.472622f, 43.897316f, 35.522873f, 43.897327f, 34.937096f, 44.48312f);
        instancePath.cubicTo(34.937046f, 44.48317f, 34.936996f, 44.48322f, 34.937096f, 44.483414f);
        instancePath.lineTo(21.327534f, 58.097088f);
        instancePath.lineTo(21.327534f, 58.097088f);
        instancePath.cubicTo(19.765436f, 59.659184f, 17.668077f, 60.094486f, 16.642952f, 59.06936f);
        instancePath.lineTo(12.930641f, 55.357048f);
        instancePath.cubicTo(11.905515f, 54.33192f, 12.340816f, 52.234562f, 13.902913f, 50.672466f);
        instancePath.lineTo(27.515013f, 37.058334f);
        instancePath.cubicTo(28.10077f, 36.47252f, 28.1007f, 35.52277f, 27.51487f, 34.937027f);
        instancePath.cubicTo(27.514866f, 34.937023f, 27.51486f, 34.93702f, 27.51484f, 34.937027f);
        instancePath.lineTo(13.902913f, 21.327534f);
        instancePath.lineTo(13.902913f, 21.327534f);
        instancePath.cubicTo(12.340816f, 19.765436f, 11.905515f, 17.668077f, 12.930641f, 16.642952f);
        instancePath.lineTo(16.642952f, 12.930641f);
        instancePath.cubicTo(17.668077f, 11.905515f, 19.765436f, 12.340816f, 21.327534f, 13.902913f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
