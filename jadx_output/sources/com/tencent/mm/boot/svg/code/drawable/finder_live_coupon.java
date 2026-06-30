package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_coupon extends l95.c {
    private final int width = 20;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 20;
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
        instancePaint3.setColor(14211288);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(20.0f, 0.0f);
        instancePath.lineTo(20.0f, 20.0f);
        instancePath.lineTo(0.0f, 20.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-40634);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(16.196762f, 3.3333333f);
        instancePath2.cubicTo(16.939695f, 3.3333333f, 17.2091f, 3.410688f, 17.480705f, 3.555944f);
        instancePath2.cubicTo(17.75231f, 3.7011998f, 17.965467f, 3.914357f, 18.110723f, 4.1859617f);
        instancePath2.cubicTo(18.25598f, 4.4575667f, 18.333334f, 4.726972f, 18.333334f, 5.4699044f);
        instancePath2.lineTo(18.333334f, 8.333333f);
        instancePath2.cubicTo(17.412859f, 8.333333f, 16.666666f, 9.079525f, 16.666666f, 10.0f);
        instancePath2.cubicTo(16.666666f, 10.920475f, 17.412859f, 11.666667f, 18.333334f, 11.666667f);
        instancePath2.lineTo(18.333334f, 14.530096f);
        instancePath2.cubicTo(18.333334f, 15.273028f, 18.25598f, 15.542433f, 18.110723f, 15.814038f);
        instancePath2.cubicTo(17.965467f, 16.085644f, 17.75231f, 16.2988f, 17.480705f, 16.444056f);
        instancePath2.cubicTo(17.2091f, 16.589312f, 16.939695f, 16.666666f, 16.196762f, 16.666666f);
        instancePath2.lineTo(3.8032377f, 16.666666f);
        instancePath2.cubicTo(3.0603054f, 16.666666f, 2.7909002f, 16.589312f, 2.5192952f, 16.444056f);
        instancePath2.cubicTo(2.2476902f, 16.2988f, 2.0345333f, 16.085644f, 1.8892772f, 15.814038f);
        instancePath2.cubicTo(1.7551949f, 15.563326f, 1.6789691f, 15.314487f, 1.6680355f, 14.693353f);
        instancePath2.lineTo(1.6666666f, 11.666667f);
        instancePath2.cubicTo(2.5871413f, 11.666667f, 3.3333333f, 10.920475f, 3.3333333f, 10.0f);
        instancePath2.cubicTo(3.3333333f, 9.079525f, 2.5871413f, 8.333333f, 1.6666666f, 8.333333f);
        instancePath2.lineTo(1.6666666f, 5.4699044f);
        instancePath2.cubicTo(1.6666666f, 4.726972f, 1.7440213f, 4.4575667f, 1.8892772f, 4.1859617f);
        instancePath2.cubicTo(2.0345333f, 3.914357f, 2.2476902f, 3.7011998f, 2.5192952f, 3.555944f);
        instancePath2.cubicTo(2.7700076f, 3.4218616f, 3.0188453f, 3.345636f, 3.639981f, 3.3347023f);
        instancePath2.lineTo(16.196762f, 3.3333333f);
        instancePath2.close();
        instancePath2.moveTo(16.331081f, 4.3340297f);
        instancePath2.lineTo(3.6689193f, 4.3340297f);
        instancePath2.cubicTo(3.2510262f, 4.338728f, 3.1217973f, 4.367749f, 2.990894f, 4.437757f);
        instancePath2.cubicTo(2.8935575f, 4.4898133f, 2.8231466f, 4.5602245f, 2.7710905f, 4.657561f);
        instancePath2.cubicTo(2.7010827f, 4.788464f, 2.6720612f, 4.9176927f, 2.6673632f, 5.335586f);
        instancePath2.lineTo(2.6666667f, 7.5266666f);
        instancePath2.cubicTo(3.601929f, 7.907913f, 4.2702756f, 8.796911f, 4.329112f, 9.848678f);
        instancePath2.lineTo(4.3333335f, 10.0f);
        instancePath2.cubicTo(4.3333335f, 11.061402f, 3.7132256f, 11.977971f, 2.8155348f, 12.407181f);
        instancePath2.lineTo(2.6666667f, 12.4725f);
        instancePath2.lineTo(2.6673632f, 14.664413f);
        instancePath2.lineTo(2.673234f, 14.882833f);
        instancePath2.cubicTo(2.6837997f, 15.102661f, 2.707917f, 15.209497f, 2.751301f, 15.302928f);
        instancePath2.lineTo(2.7710905f, 15.34244f);
        instancePath2.cubicTo(2.8231466f, 15.439775f, 2.8935575f, 15.510187f, 2.990894f, 15.5622425f);
        instancePath2.cubicTo(3.1217973f, 15.632251f, 3.2510262f, 15.661272f, 3.6689193f, 15.66597f);
        instancePath2.lineTo(16.196762f, 15.666667f);
        instancePath2.cubicTo(16.723145f, 15.666667f, 16.865112f, 15.639252f, 17.009106f, 15.5622425f);
        instancePath2.cubicTo(17.106441f, 15.510187f, 17.176853f, 15.439775f, 17.22891f, 15.34244f);
        instancePath2.cubicTo(17.298918f, 15.211536f, 17.327938f, 15.082307f, 17.332638f, 14.664413f);
        instancePath2.lineTo(17.333334f, 12.4725f);
        instancePath2.cubicTo(16.398071f, 12.092087f, 15.729725f, 11.203089f, 15.670888f, 10.151322f);
        instancePath2.lineTo(15.666667f, 10.0f);
        instancePath2.cubicTo(15.666667f, 8.938598f, 16.286774f, 8.022029f, 17.184465f, 7.5928197f);
        instancePath2.lineTo(17.333334f, 7.5266666f);
        instancePath2.lineTo(17.333334f, 5.4699044f);
        instancePath2.cubicTo(17.333334f, 4.991375f, 17.310677f, 4.8305435f, 17.2487f, 4.697072f);
        instancePath2.lineTo(17.22891f, 4.657561f);
        instancePath2.cubicTo(17.176853f, 4.5602245f, 17.106441f, 4.4898133f, 17.009106f, 4.437757f);
        instancePath2.cubicTo(16.878202f, 4.367749f, 16.748974f, 4.338728f, 16.331081f, 4.3340297f);
        instancePath2.close();
        instancePath2.moveTo(10.0f, 7.5f);
        instancePath2.cubicTo(11.380712f, 7.5f, 12.5f, 8.619288f, 12.5f, 10.0f);
        instancePath2.cubicTo(12.5f, 11.380712f, 11.380712f, 12.5f, 10.0f, 12.5f);
        instancePath2.cubicTo(8.619288f, 12.5f, 7.5f, 11.380712f, 7.5f, 10.0f);
        instancePath2.cubicTo(7.5f, 8.619288f, 8.619288f, 7.5f, 10.0f, 7.5f);
        instancePath2.close();
        instancePath2.moveTo(10.0f, 8.5f);
        instancePath2.cubicTo(9.171573f, 8.5f, 8.5f, 9.171573f, 8.5f, 10.0f);
        instancePath2.cubicTo(8.5f, 10.828427f, 9.171573f, 11.5f, 10.0f, 11.5f);
        instancePath2.cubicTo(10.828427f, 11.5f, 11.5f, 10.828427f, 11.5f, 10.0f);
        instancePath2.cubicTo(11.5f, 9.171573f, 10.828427f, 8.5f, 10.0f, 8.5f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
