package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_filled_awesome_status extends l95.c {
    private final int width = 60;
    private final int height = 60;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 60;
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
                instancePaint3.setColor(-855638017);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(32.7151f, 13.0273f);
                instancePath.cubicTo(37.9356f, 7.80673f, 46.3097f, 7.66172f, 51.7054f, 12.5922f);
                instancePath.lineTo(52.1605f, 13.0273f);
                instancePath.cubicTo(57.3801f, 18.2571f, 57.517f, 26.6234f, 52.586f, 32.0089f);
                instancePath.lineTo(52.1509f, 32.4631f);
                instancePath.lineTo(30.5893f, 53.9823f);
                instancePath.cubicTo(30.264f, 54.307f, 29.7372f, 54.307f, 29.4119f, 53.9823f);
                instancePath.lineTo(7.85028f, 32.4631f);
                instancePath.cubicTo(2.62973f, 27.2529f, 2.47661f, 18.8872f, 7.39695f, 13.4919f);
                instancePath.lineTo(7.8407f, 13.0273f);
                instancePath.cubicTo(13.2104f, 7.65757f, 21.9164f, 7.65757f, 27.2861f, 13.0273f);
                instancePath.lineTo(29.9999f, 15.74f);
                instancePath.lineTo(32.7151f, 13.0273f);
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
