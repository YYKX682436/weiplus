package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_gesture_effect_icon extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 32;
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(16.562565f, 3.9695206f);
                instancePath.cubicTo(17.27375f, 3.0059059f, 18.60242f, 2.7185006f, 19.6657f, 3.2982798f);
                instancePath.cubicTo(20.629496f, 3.8238125f, 21.014992f, 4.985186f, 20.576586f, 5.9559183f);
                instancePath.lineTo(20.500483f, 6.1074867f);
                instancePath.lineTo(14.552813f, 16.107164f);
                instancePath.cubicTo(14.511202f, 16.184921f, 14.511202f, 16.232418f, 14.552813f, 16.249653f);
                instancePath.cubicTo(14.615229f, 16.275505f, 14.664518f, 16.20597f, 14.672111f, 16.19644f);
                instancePath.cubicTo(16.749569f, 13.588172f, 17.718643f, 12.273439f, 17.718643f, 12.273439f);
                instancePath.cubicTo(17.718643f, 12.273439f, 18.6235f, 11.348317f, 19.811647f, 12.20701f);
                instancePath.cubicTo(20.449547f, 12.671835f, 20.695078f, 13.290182f, 20.548239f, 14.06205f);
                instancePath.cubicTo(18.884089f, 16.515192f, 18.217505f, 17.589558f, 18.548485f, 17.285147f);
                instancePath.cubicTo(18.996878f, 16.87275f, 19.895645f, 16.027271f, 21.24479f, 14.748713f);
                instancePath.cubicTo(21.24479f, 14.748713f, 21.954586f, 14.176556f, 22.893341f, 15.008927f);
                instancePath.cubicTo(23.832096f, 15.841299f, 23.334055f, 16.639883f, 23.334055f, 16.639883f);
                instancePath.lineTo(21.268147f, 19.49179f);
                instancePath.cubicTo(21.256853f, 19.50613f, 21.259174f, 19.526823f, 21.273369f, 19.538332f);
                instancePath.cubicTo(21.283224f, 19.546324f, 21.295977f, 19.548855f, 21.307661f, 19.545984f);
                instancePath.lineTo(21.323893f, 19.537632f);
                instancePath.cubicTo(21.763187f, 19.205217f, 22.350113f, 18.738377f, 23.084671f, 18.13711f);
                instancePath.cubicTo(23.186289f, 18.044214f, 24.08777f, 17.719666f, 24.852339f, 19.004032f);
                instancePath.cubicTo(25.328066f, 19.803188f, 24.55975f, 21.46917f, 23.888554f, 22.596088f);
                instancePath.cubicTo(21.146496f, 27.199928f, 18.169443f, 29.31163f, 15.3686695f, 28.962952f);
                instancePath.cubicTo(13.089384f, 28.679142f, 10.934813f, 27.365396f, 8.903269f, 25.023111f);
                instancePath.cubicTo(7.580131f, 23.49539f, 6.905175f, 21.529478f, 7.0107517f, 19.537632f);
                instancePath.lineTo(7.035598f, 19.205488f);
                instancePath.lineTo(7.1786594f, 18.024027f);
                instancePath.cubicTo(7.2531357f, 17.408974f, 7.420122f, 16.8115f, 7.672056f, 16.250633f);
                instancePath.cubicTo(8.261434f, 14.6647f, 8.5827f, 13.463419f, 8.635856f, 12.6467905f);
                instancePath.lineTo(8.643143f, 12.477686f);
                instancePath.lineTo(8.651355f, 11.817879f);
                instancePath.cubicTo(8.643146f, 10.738837f, 8.521143f, 9.662826f, 8.287323f, 8.607283f);
                instancePath.lineTo(8.096989f, 7.815241f);
                instancePath.cubicTo(7.7862105f, 6.4203315f, 7.9741373f, 5.410376f, 8.660769f, 4.785374f);
                instancePath.lineTo(8.825798f, 4.648133f);
                instancePath.lineTo(8.907323f, 4.578396f);
                instancePath.lineTo(9.2198f, 4.3239365f);
                instancePath.lineTo(9.298911f, 4.2661843f);
                instancePath.lineTo(9.471737f, 4.1506944f);
                instancePath.cubicTo(10.108936f, 3.7525256f, 11.073079f, 3.4599543f, 11.975783f, 4.5992365f);
                instancePath.cubicTo(13.298427f, 6.268515f, 13.168272f, 8.190934f, 12.2959585f, 9.620318f);
                instancePath.lineTo(12.187764f, 9.78943f);
                instancePath.lineTo(7.681936f, 16.249653f);
                instancePath.lineTo(16.562565f, 3.9695206f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
