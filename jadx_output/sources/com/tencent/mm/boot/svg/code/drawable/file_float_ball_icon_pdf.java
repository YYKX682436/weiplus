package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class file_float_ball_icon_pdf extends l95.c {
    private final int width = 48;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 48;
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
        instancePaint3.setColor(-1686720);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(48.0f, 0.0f);
        instancePath.lineTo(48.0f, 48.0f);
        instancePath.lineTo(0.0f, 48.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(9.44873f, 18.021973f);
        instancePath2.lineTo(14.105469f, 18.021973f);
        instancePath2.cubicTo(16.487793f, 18.021973f, 18.139648f, 19.640625f, 18.139648f, 22.03125f);
        instancePath2.cubicTo(18.139648f, 24.421875f, 16.437988f, 26.040527f, 14.01416f, 26.040527f);
        instancePath2.lineTo(11.590332f, 26.040527f);
        instancePath2.lineTo(11.590332f, 30.0f);
        instancePath2.lineTo(9.44873f, 30.0f);
        instancePath2.lineTo(9.44873f, 18.021973f);
        instancePath2.close();
        instancePath2.moveTo(11.590332f, 19.773438f);
        instancePath2.lineTo(11.590332f, 24.313965f);
        instancePath2.lineTo(13.532715f, 24.313965f);
        instancePath2.cubicTo(15.068359f, 24.313965f, 15.964844f, 23.483887f, 15.964844f, 22.03125f);
        instancePath2.cubicTo(15.964844f, 20.595215f, 15.07666f, 19.773438f, 13.541016f, 19.773438f);
        instancePath2.lineTo(11.590332f, 19.773438f);
        instancePath2.close();
        instancePath2.moveTo(19.700195f, 18.021973f);
        instancePath2.lineTo(24.074707f, 18.021973f);
        instancePath2.cubicTo(27.652344f, 18.021973f, 29.769043f, 20.188477f, 29.769043f, 23.981934f);
        instancePath2.cubicTo(29.769043f, 27.77539f, 27.660645f, 30.0f, 24.074707f, 30.0f);
        instancePath2.lineTo(19.700195f, 30.0f);
        instancePath2.lineTo(19.700195f, 18.021973f);
        instancePath2.close();
        instancePath2.moveTo(21.841797f, 19.831543f);
        instancePath2.lineTo(21.841797f, 28.19043f);
        instancePath2.lineTo(23.850586f, 28.19043f);
        instancePath2.cubicTo(26.257812f, 28.19043f, 27.585938f, 26.721191f, 27.585938f, 23.990234f);
        instancePath2.cubicTo(27.585938f, 21.309082f, 26.24121f, 19.831543f, 23.850586f, 19.831543f);
        instancePath2.lineTo(21.841797f, 19.831543f);
        instancePath2.close();
        instancePath2.moveTo(33.612305f, 30.0f);
        instancePath2.lineTo(31.470703f, 30.0f);
        instancePath2.lineTo(31.470703f, 18.021973f);
        instancePath2.lineTo(39.10742f, 18.021973f);
        instancePath2.lineTo(39.10742f, 19.831543f);
        instancePath2.lineTo(33.612305f, 19.831543f);
        instancePath2.lineTo(33.612305f, 23.367676f);
        instancePath2.lineTo(38.634277f, 23.367676f);
        instancePath2.lineTo(38.634277f, 25.11084f);
        instancePath2.lineTo(33.612305f, 25.11084f);
        instancePath2.lineTo(33.612305f, 30.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
