package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_reward_new extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(17.125824f, 22.215218f);
            instancePath.cubicTo(23.146244f, 22.99172f, 28.474106f, 24.881105f, 32.877087f, 27.526522f);
            instancePath.cubicTo(30.966658f, 29.089598f, 29.277954f, 30.8048f, 27.835758f, 32.636482f);
            instancePath.lineTo(27.835758f, 32.636482f);
            instancePath.lineTo(30.664242f, 34.863518f);
            instancePath.lineTo(31.13953f, 34.276737f);
            instancePath.cubicTo(32.52694f, 32.61116f, 34.15383f, 31.05592f, 36.001335f, 29.645966f);
            instancePath.cubicTo(38.059605f, 31.21876f, 39.848797f, 32.97498f, 41.33576f, 34.863518f);
            instancePath.lineTo(41.33576f, 34.863518f);
            instancePath.lineTo(44.16424f, 32.636482f);
            instancePath.lineTo(43.66493f, 32.01885f);
            instancePath.cubicTo(42.336803f, 30.41835f, 40.81704f, 28.912622f, 39.12109f, 27.527876f);
            instancePath.cubicTo(43.51424f, 24.888115f, 48.825695f, 23.00168f, 54.826622f, 22.221376f);
            instancePath.cubicTo(60.30647f, 26.486378f, 63.604507f, 31.839163f, 64.53269f, 38.002533f);
            instancePath.cubicTo(64.66999f, 38.91423f, 64.75544f, 39.843662f, 64.788414f, 40.789936f);
            instancePath.cubicTo(64.80248f, 41.18679f, 64.80298f, 41.57904f, 64.789955f, 41.96661f);
            instancePath.cubicTo(64.79936f, 57.49941f, 51.60173f, 65.039925f, 36.06872f, 65.039925f);
            instancePath.cubicTo(20.691042f, 65.039925f, 7.4118032f, 57.649464f, 7.1477566f, 42.429993f);
            instancePath.lineTo(7.14375f, 41.9664f);
            instancePath.cubicTo(7.140127f, 41.57904f, 7.1406283f, 41.18679f, 7.154694f, 40.789936f);
            instancePath.cubicTo(7.4070816f, 33.54789f, 10.732542f, 27.292068f, 16.856752f, 22.425255f);
            instancePath.close();
            instancePath.moveTo(36.32625f, 5.625f);
            instancePath.cubicTo(39.95397f, 5.625f, 43.080387f, 7.7713532f, 44.50487f, 10.863438f);
            instancePath.cubicTo(45.42551f, 10.391221f, 46.46979f, 10.125f, 47.57625f, 10.125f);
            instancePath.cubicTo(51.304173f, 10.125f, 54.32625f, 13.147078f, 54.32625f, 16.875f);
            instancePath.cubicTo(54.32625f, 17.503834f, 54.24026f, 18.112585f, 54.0794f, 18.690134f);
            instancePath.cubicTo(47.119686f, 19.635084f, 40.987972f, 21.97058f, 36.002697f, 25.240389f);
            instancePath.cubicTo(31.106855f, 22.031912f, 25.108948f, 19.722368f, 18.309086f, 18.743448f);
            instancePath.cubicTo(18.136559f, 18.151379f, 18.045f, 17.523882f, 18.045f, 16.875f);
            instancePath.cubicTo(18.045f, 13.147078f, 21.067078f, 10.125f, 24.795f, 10.125f);
            instancePath.cubicTo(25.993025f, 10.125f, 27.118153f, 10.437107f, 28.09351f, 10.984447f);
            instancePath.cubicTo(29.49035f, 7.827913f, 32.651043f, 5.625f, 36.32625f, 5.625f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
