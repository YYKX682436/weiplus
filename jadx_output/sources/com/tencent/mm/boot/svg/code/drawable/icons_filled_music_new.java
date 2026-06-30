package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_music_new extends l95.c {
    private final int width = 24;
    private final int height = 25;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 24;
        }
        if (i17 == 1) {
            return 25;
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1946157056);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(13.2658f, 2.60541f);
            instancePath.cubicTo(13.5971f, 2.60541f, 13.8658f, 2.87404f, 13.8658f, 3.20541f);
            instancePath.lineTo(13.8658f, 3.59265f);
            instancePath.cubicTo(13.8658f, 3.83417f, 14.0392f, 4.03864f, 14.2707f, 4.1073f);
            instancePath.cubicTo(16.4288f, 4.74726f, 19.4027f, 7.4567f, 16.9338f, 11.3695f);
            instancePath.cubicTo(16.8558f, 11.493f, 16.6687f, 11.4368f, 16.6649f, 11.2908f);
            instancePath.cubicTo(16.601f, 8.86355f, 16.0098f, 7.06537f, 14.0916f, 6.68597f);
            instancePath.cubicTo(13.973f, 6.66249f, 13.8658f, 6.75622f, 13.8658f, 6.87719f);
            instancePath.lineTo(13.8658f, 18.8661f);
            instancePath.cubicTo(13.9587f, 20.6633f, 12.3742f, 22.2648f, 10.3892f, 22.7417f);
            instancePath.cubicTo(8.20702f, 23.266f, 5.8385f, 22.3595f, 5.35597f, 20.351f);
            instancePath.cubicTo(4.87345f, 18.3426f, 6.57165f, 16.459f, 8.75386f, 15.9348f);
            instancePath.cubicTo(9.98084f, 15.64f, 11.2667f, 15.7975f, 12.2431f, 16.349f);
            instancePath.cubicTo(12.4236f, 16.4509f, 12.6658f, 16.3282f, 12.6658f, 16.121f);
            instancePath.lineTo(12.6658f, 3.20541f);
            instancePath.cubicTo(12.6658f, 2.87404f, 12.9344f, 2.60541f, 13.2658f, 2.60541f);
            instancePath.close();
            instancePath.moveTo(6.52277f, 20.0707f);
            instancePath.cubicTo(6.25693f, 18.9642f, 7.20441f, 17.5412f, 9.03418f, 17.1016f);
            instancePath.cubicTo(10.864f, 16.662f, 12.3545f, 17.4993f, 12.6203f, 18.6058f);
            instancePath.cubicTo(12.8862f, 19.7123f, 11.9387f, 21.1353f, 10.1089f, 21.5749f);
            instancePath.cubicTo(8.27913f, 22.0145f, 6.78862f, 21.1772f, 6.52277f, 20.0707f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
