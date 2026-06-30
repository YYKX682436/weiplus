package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class float_ball_icon_audio_play extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(19.860521f, 9.206012f);
                instancePath.lineTo(61.052155f, 32.744087f);
                instancePath.cubicTo(62.850346f, 33.771626f, 63.475082f, 36.062332f, 62.447544f, 37.86052f);
                instancePath.cubicTo(62.115334f, 38.441887f, 61.633522f, 38.923702f, 61.052155f, 39.255913f);
                instancePath.lineTo(19.860521f, 62.793987f);
                instancePath.cubicTo(18.06233f, 63.821526f, 15.7716255f, 63.19679f, 14.744088f, 61.398598f);
                instancePath.cubicTo(14.420307f, 60.83198f, 14.25f, 60.190678f, 14.25f, 59.538074f);
                instancePath.lineTo(14.25f, 12.461924f);
                instancePath.cubicTo(14.25f, 10.390856f, 15.928932f, 8.711924f, 18.0f, 8.711924f);
                instancePath.cubicTo(18.652601f, 8.711924f, 19.293905f, 8.882231f, 19.860521f, 9.206012f);
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
