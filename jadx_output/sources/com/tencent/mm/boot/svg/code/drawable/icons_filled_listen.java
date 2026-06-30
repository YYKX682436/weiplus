package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_listen extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(16.2634f, 3.61809f);
                instancePath.cubicTo(13.9474f, 3.21009f, 11.5204f, 4.25609f, 10.2764f, 6.41109f);
                instancePath.cubicTo(8.68642f, 9.16509f, 9.62943f, 12.6871f, 12.3834f, 14.2771f);
                instancePath.cubicTo(12.7234f, 14.4731f, 13.0754f, 14.6301f, 13.4334f, 14.7501f);
                instancePath.lineTo(11.0674f, 18.8491f);
                instancePath.cubicTo(10.4304f, 19.9521f, 10.8084f, 21.3621f, 11.9114f, 21.9991f);
                instancePath.cubicTo(12.1514f, 22.1371f, 12.4064f, 22.2281f, 12.6644f, 22.2731f);
                instancePath.cubicTo(13.5914f, 22.4371f, 14.5634f, 22.0181f, 15.0614f, 21.1551f);
                instancePath.lineTo(20.2494f, 12.1691f);
                instancePath.cubicTo(21.8394f, 9.41509f, 20.8964f, 5.89409f, 18.1414f, 4.30309f);
                instancePath.cubicTo(17.5424f, 3.95809f, 16.9074f, 3.73209f, 16.2634f, 3.61809f);
                instancePath.close();
                instancePath.moveTo(12.8246f, 10.2423f);
                instancePath.cubicTo(12.7311f, 10.226f, 12.6403f, 10.1935f, 12.5536f, 10.1433f);
                instancePath.cubicTo(12.1565f, 9.91431f, 12.021f, 9.40746f, 12.25f, 9.00902f);
                instancePath.lineTo(13.4508f, 6.93009f);
                instancePath.cubicTo(13.6798f, 6.53165f, 14.1866f, 6.39477f, 14.5851f, 6.62652f);
                instancePath.cubicTo(14.9822f, 6.8542f, 15.1177f, 7.36241f, 14.8887f, 7.75949f);
                instancePath.lineTo(13.6879f, 9.83977f);
                instancePath.cubicTo(13.5077f, 10.1501f, 13.158f, 10.3006f, 12.8246f, 10.2423f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(7.25981f, 8.1798f);
                instancePath2.cubicTo(7.59101f, 6.30179f, 8.45382f, 4.65298f, 9.65742f, 3.34257f);
                instancePath2.lineTo(8.59302f, 2.36816f);
                instancePath2.cubicTo(7.21181f, 3.87297f, 6.22301f, 5.76899f, 5.84141f, 7.9302f);
                instancePath2.cubicTo(5.69861f, 8.74261f, 5.65421f, 9.54901f, 5.68901f, 10.341f);
                instancePath2.lineTo(7.12781f, 10.2786f);
                instancePath2.cubicTo(7.09781f, 9.58861f, 7.13501f, 8.88661f, 7.25981f, 8.1798f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
                instancePaint5.setColor(-16777216);
                android.graphics.Path instancePath3 = l95.c.instancePath(looper);
                instancePath3.moveTo(4.2248f, 7.74234f);
                instancePath3.cubicTo(4.67962f, 5.16111f, 5.86526f, 2.89429f, 7.52012f, 1.09426f);
                instancePath3.lineTo(6.45448f, 0.118652f);
                instancePath3.cubicTo(4.62321f, 2.11428f, 3.31157f, 4.62831f, 2.80635f, 7.49274f);
                instancePath3.cubicTo(2.61674f, 8.57035f, 2.55794f, 9.63837f, 2.60354f, 10.6884f);
                instancePath3.lineTo(4.04359f, 10.626f);
                instancePath3.cubicTo(4.00159f, 9.67797f, 4.05319f, 8.71436f, 4.2248f, 7.74234f);
                instancePath3.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
                canvas.drawPath(instancePath3, instancePaint5);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
