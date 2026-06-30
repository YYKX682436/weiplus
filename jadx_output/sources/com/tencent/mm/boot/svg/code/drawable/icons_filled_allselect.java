package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_allselect extends l95.c {
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
        instancePath.moveTo(65.435585f, 40.122665f);
        instancePath.lineTo(70.37511f, 45.062183f);
        instancePath.lineTo(50.637524f, 64.79977f);
        instancePath.lineTo(38.28873f, 52.45097f);
        instancePath.lineTo(43.223125f, 47.516575f);
        instancePath.lineTo(50.6324f, 54.92585f);
        instancePath.lineTo(65.435585f, 40.122665f);
        instancePath.close();
        instancePath.moveTo(51.758507f, 7.5f);
        instancePath.cubicTo(53.433002f, 7.5f, 54.801384f, 8.81064f, 54.893764f, 10.462035f);
        instancePath.lineTo(54.898735f, 10.640229f);
        instancePath.lineTo(54.898f, 43.446f);
        instancePath.lineTo(50.854694f, 47.49073f);
        instancePath.lineTo(43.431087f, 40.06637f);
        instancePath.lineTo(30.703167f, 52.79429f);
        instancePath.lineTo(41.235f, 63.326f);
        instancePath.lineTo(9.14023f, 63.326305f);
        instancePath.cubicTo(7.465732f, 63.326305f, 6.097351f, 62.015667f, 6.004971f, 60.364273f);
        instancePath.lineTo(6.0f, 60.186077f);
        instancePath.lineTo(6.0f, 10.640229f);
        instancePath.cubicTo(6.0f, 8.965733f, 7.31064f, 7.597351f, 8.962035f, 7.504971f);
        instancePath.lineTo(9.14023f, 7.5f);
        instancePath.lineTo(51.758507f, 7.5f);
        instancePath.close();
        instancePath.moveTo(30.449368f, 36.80881f);
        instancePath.lineTo(15.168513f, 36.80881f);
        instancePath.lineTo(15.168513f, 41.519154f);
        instancePath.lineTo(30.449368f, 41.519154f);
        instancePath.lineTo(30.449368f, 36.80881f);
        instancePath.close();
        instancePath.moveTo(45.73022f, 27.38812f);
        instancePath.lineTo(15.168513f, 27.38812f);
        instancePath.lineTo(15.168513f, 32.098465f);
        instancePath.lineTo(45.73022f, 32.098465f);
        instancePath.lineTo(45.73022f, 27.38812f);
        instancePath.close();
        instancePath.moveTo(45.73022f, 17.967432f);
        instancePath.lineTo(15.168513f, 17.967432f);
        instancePath.lineTo(15.168513f, 22.677776f);
        instancePath.lineTo(45.73022f, 22.677776f);
        instancePath.lineTo(45.73022f, 17.967432f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
