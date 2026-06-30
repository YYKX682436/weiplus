package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_filled_voice_call extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(6.05493f, 2.50028f);
            instancePath.lineTo(6.03827f, 2.5f);
            instancePath.cubicTo(5.99203f, 2.5f, 5.94529f, 2.50274f, 5.89785f, 2.50785f);
            instancePath.cubicTo(5.80045f, 2.51834f, 5.70298f, 2.53831f, 5.60436f, 2.56515f);
            instancePath.lineTo(5.43288f, 2.61821f);
            instancePath.cubicTo(3.67781f, 3.26275f, 2.5f, 4.9059f, 2.5f, 6.77892f);
            instancePath.cubicTo(2.5f, 7.03517f, 2.52875f, 7.29131f, 2.57845f, 7.56135f);
            instancePath.lineTo(2.64383f, 7.88304f);
            instancePath.cubicTo(3.40018f, 11.2001f, 5.06832f, 14.1818f, 7.44288f, 16.5566f);
            instancePath.cubicTo(9.81745f, 18.9314f, 12.7989f, 20.5997f, 16.075f, 21.3486f);
            instancePath.cubicTo(16.3388f, 21.4247f, 16.7903f, 21.5f, 17.2197f, 21.5f);
            instancePath.cubicTo(19.0926f, 21.5f, 20.7356f, 20.3221f, 21.3751f, 18.5811f);
            instancePath.lineTo(21.4292f, 18.4256f);
            instancePath.cubicTo(21.4648f, 18.3113f, 21.489f, 18.1992f, 21.4972f, 18.0836f);
            instancePath.cubicTo(21.501f, 18.0286f, 21.5011f, 17.9741f, 21.4965f, 17.9199f);
            instancePath.cubicTo(21.454f, 17.2805f, 21.0774f, 16.7277f, 20.4991f, 16.483f);
            instancePath.lineTo(16.9948f, 15.1644f);
            instancePath.cubicTo(16.658f, 15.0518f, 16.4514f, 15.0893f, 16.1474f, 15.2551f);
            instancePath.lineTo(14.7733f, 16.0066f);
            instancePath.lineTo(13.9145f, 16.4671f);
            instancePath.lineTo(13.4421f, 16.7156f);
            instancePath.cubicTo(13.2974f, 16.7935f, 13.1622f, 16.829f, 13.0093f, 16.829f);
            instancePath.cubicTo(12.8554f, 16.829f, 12.7135f, 16.7865f, 12.5774f, 16.7027f);
            instancePath.cubicTo(11.3897f, 16.0029f, 10.3942f, 15.2544f, 9.57187f, 14.4181f);
            instancePath.cubicTo(8.7407f, 13.5868f, 7.99117f, 12.5849f, 7.30192f, 11.4146f);
            instancePath.cubicTo(7.21695f, 11.2764f, 7.1706f, 11.1193f, 7.1706f, 10.9743f);
            instancePath.cubicTo(7.1706f, 10.8303f, 7.20948f, 10.68f, 7.28049f, 10.5481f);
            instancePath.lineTo(7.65273f, 9.83456f);
            instancePath.lineTo(8.23995f, 8.74369f);
            instancePath.lineTo(8.73954f, 7.84445f);
            instancePath.cubicTo(8.91011f, 7.5319f, 8.95017f, 7.30491f, 8.837f, 6.99367f);
            instancePath.lineTo(7.52417f, 3.50266f);
            instancePath.cubicTo(7.26912f, 2.89872f, 6.70722f, 2.52202f, 6.05493f, 2.50028f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
