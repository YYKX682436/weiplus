package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_anonymous_0 extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(24.0f, 0.0f);
        instancePath.lineTo(24.0f, 24.0f);
        instancePath.lineTo(0.0f, 24.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(17.0f, 12.0f);
        instancePath2.cubicTo(19.761423f, 12.0f, 22.0f, 14.238576f, 22.0f, 17.0f);
        instancePath2.cubicTo(22.0f, 19.761423f, 19.761423f, 22.0f, 17.0f, 22.0f);
        instancePath2.cubicTo(14.238576f, 22.0f, 12.0f, 19.761423f, 12.0f, 17.0f);
        instancePath2.cubicTo(12.0f, 14.238576f, 14.238576f, 12.0f, 17.0f, 12.0f);
        instancePath2.close();
        instancePath2.moveTo(13.9221945f, 14.770833f);
        instancePath2.cubicTo(13.467889f, 15.397004f, 13.2f, 16.167217f, 13.2f, 17.0f);
        instancePath2.cubicTo(13.2f, 19.098682f, 14.901318f, 20.8f, 17.0f, 20.8f);
        instancePath2.cubicTo(17.832783f, 20.8f, 18.602997f, 20.53211f, 19.229166f, 20.077806f);
        instancePath2.lineTo(13.9221945f, 14.770833f);
        instancePath2.close();
        instancePath2.moveTo(21.0f, 4.0f);
        instancePath2.cubicTo(21.552284f, 4.0f, 22.0f, 4.4477153f, 22.0f, 5.0f);
        instancePath2.lineTo(22.000792f, 13.334314f);
        instancePath2.cubicTo(21.65948f, 12.869475f, 21.254915f, 12.453972f, 20.799784f, 12.100487f);
        instancePath2.lineTo(20.8f, 5.2f);
        instancePath2.lineTo(3.2f, 5.2f);
        instancePath2.lineTo(3.2f, 18.8f);
        instancePath2.lineTo(11.065645f, 18.801044f);
        instancePath2.cubicTo(11.193127f, 19.221645f, 11.3640995f, 19.623339f, 11.573329f, 20.000893f);
        instancePath2.lineTo(3.0f, 20.0f);
        instancePath2.cubicTo(2.4477153f, 20.0f, 2.0f, 19.552284f, 2.0f, 19.0f);
        instancePath2.lineTo(2.0f, 5.0f);
        instancePath2.cubicTo(2.0f, 4.4477153f, 2.4477153f, 4.0f, 3.0f, 4.0f);
        instancePath2.lineTo(21.0f, 4.0f);
        instancePath2.close();
        instancePath2.moveTo(17.0f, 13.2f);
        instancePath2.cubicTo(16.167217f, 13.2f, 15.397004f, 13.467889f, 14.770833f, 13.9221945f);
        instancePath2.lineTo(20.077806f, 19.229166f);
        instancePath2.cubicTo(20.53211f, 18.602997f, 20.8f, 17.832783f, 20.8f, 17.0f);
        instancePath2.cubicTo(20.8f, 14.901318f, 19.098682f, 13.2f, 17.0f, 13.2f);
        instancePath2.close();
        instancePath2.moveTo(9.0f, 7.4f);
        instancePath2.cubicTo(10.268768f, 7.4f, 11.28421f, 8.472286f, 11.28421f, 9.77787f);
        instancePath2.lineTo(11.28421f, 10.53786f);
        instancePath2.cubicTo(11.28421f, 11.231911f, 11.062039f, 12.056151f, 10.682667f, 12.530843f);
        instancePath2.lineTo(10.538f, 12.711f);
        instancePath2.lineTo(11.916993f, 13.44899f);
        instancePath2.cubicTo(11.688365f, 13.775646f, 11.490423f, 14.125358f, 11.327351f, 14.493942f);
        instancePath2.lineTo(9.963494f, 13.76478f);
        instancePath2.cubicTo(9.27614f, 13.410871f, 9.1104765f, 12.575939f, 9.593034f, 11.972137f);
        instancePath2.lineTo(9.745258f, 11.781667f);
        instancePath2.cubicTo(9.93169f, 11.548393f, 10.08421f, 10.982551f, 10.08421f, 10.53786f);
        instancePath2.lineTo(10.08421f, 9.77787f);
        instancePath2.cubicTo(10.08421f, 9.120852f, 9.59097f, 8.6f, 9.0f, 8.6f);
        instancePath2.cubicTo(8.409793f, 8.6f, 7.9157896f, 9.120989f, 7.9157896f, 9.777592f);
        instancePath2.lineTo(7.9157896f, 10.537462f);
        instancePath2.cubicTo(7.9157896f, 10.969663f, 8.076574f, 11.540281f, 8.269466f, 11.781605f);
        instancePath2.lineTo(8.421691f, 11.97205f);
        instancePath2.cubicTo(8.90522f, 12.576984f, 8.737739f, 13.411173f, 8.058296f, 13.761096f);
        instancePath2.lineTo(5.743846f, 14.991766f);
        instancePath2.cubicTo(5.687162f, 15.020964f, 5.6f, 15.168342f, 5.6f, 15.251317f);
        instancePath2.lineTo(5.6f, 15.4f);
        instancePath2.lineTo(11.008459f, 15.399856f);
        instancePath2.cubicTo(10.905475f, 15.786457f, 10.838913f, 16.187918f, 10.8126745f, 16.600336f);
        instancePath2.lineTo(5.4210525f, 16.6f);
        instancePath2.cubicTo(4.857141f, 16.6f, 4.4f, 16.142859f, 4.4f, 15.578947f);
        instancePath2.lineTo(4.4f, 15.251317f);
        instancePath2.cubicTo(4.4f, 14.725102f, 4.7325215f, 14.162857f, 5.1873903f, 13.928613f);
        instancePath2.lineTo(7.476f, 12.71f);
        instancePath2.lineTo(7.332108f, 12.530844f);
        instancePath2.cubicTo(6.9883437f, 12.100767f, 6.7641373f, 11.38406f, 6.7227335f, 10.746536f);
        instancePath2.lineTo(6.7157893f, 10.537462f);
        instancePath2.lineTo(6.7157893f, 9.777592f);
        instancePath2.cubicTo(6.7157893f, 8.472099f, 7.732358f, 7.4f, 9.0f, 7.4f);
        instancePath2.close();
        instancePath2.moveTo(19.0f, 9.4f);
        instancePath2.lineTo(19.0f, 10.6f);
        instancePath2.lineTo(13.0f, 10.6f);
        instancePath2.lineTo(13.0f, 9.4f);
        instancePath2.lineTo(19.0f, 9.4f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
