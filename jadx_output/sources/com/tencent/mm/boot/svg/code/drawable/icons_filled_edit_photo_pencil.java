package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_edit_photo_pencil extends l95.c {
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
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(14.0768f, 5.46615f);
                instancePath.lineTo(16.1981f, 3.34483f);
                instancePath.cubicTo(16.5886f, 2.95431f, 17.2218f, 2.95431f, 17.6123f, 3.34483f);
                instancePath.lineTo(20.1579f, 5.89042f);
                instancePath.cubicTo(20.5484f, 6.28094f, 20.5484f, 6.91411f, 20.1579f, 7.30463f);
                instancePath.lineTo(18.0366f, 9.42595f);
                instancePath.lineTo(14.0768f, 5.46615f);
                instancePath.close();
                instancePath.moveTo(3.32881f, 16.2142f);
                instancePath.lineTo(12.9454f, 6.59753f);
                instancePath.lineTo(16.9052f, 10.5573f);
                instancePath.lineTo(7.28859f, 20.1739f);
                instancePath.lineTo(7.28858f, 20.174f);
                instancePath.lineTo(7.28855f, 20.1739f);
                instancePath.lineTo(3.8871f, 20.7742f);
                instancePath.cubicTo(3.20345f, 20.8948f, 2.60789f, 20.2993f, 2.72853f, 19.6156f);
                instancePath.lineTo(3.32878f, 16.2142f);
                instancePath.lineTo(3.32879f, 16.2141f);
                instancePath.lineTo(3.32881f, 16.2142f);
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
