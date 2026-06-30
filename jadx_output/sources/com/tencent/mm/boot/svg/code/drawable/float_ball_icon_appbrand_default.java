package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class float_ball_icon_appbrand_default extends l95.c {
    private final int width = 48;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 48;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
            if (i17 == 2) {
                android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
                android.os.Looper looper = (android.os.Looper) objArr[1];
                android.graphics.Matrix instanceMatrix = l95.c.instanceMatrix(looper);
                float[] instanceMatrixArray = l95.c.instanceMatrixArray(looper);
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
                instancePaint3.setColor(-855310);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(48.0f, 0.0f);
                instancePath.lineTo(48.0f, 48.0f);
                instancePath.lineTo(0.0f, 48.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-436207616);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(17.004295f, 12.990751f);
                instancePath2.lineTo(16.76837f, 12.994569f);
                instancePath2.cubicTo(16.055016f, 12.994569f, 15.639927f, 12.471272f, 15.9080925f, 11.86796f);
                instancePath2.cubicTo(16.091732f, 11.439467f, 16.50604f, 11.108546f, 16.995338f, 10.999859f);
                instancePath2.cubicTo(18.304462f, 10.683864f, 19.19393f, 9.660716f, 19.19393f, 8.471246f);
                instancePath2.cubicTo(19.19393f, 7.0291724f, 17.81712f, 5.8539934f, 16.097445f, 5.8539934f);
                instancePath2.cubicTo(14.377769f, 5.8539934f, 13.000958f, 7.0291724f, 13.000958f, 8.471246f);
                instancePath2.lineTo(13.000958f, 15.659744f);
                instancePath2.cubicTo(13.000958f, 18.191664f, 10.737898f, 20.23099f, 7.950479f, 20.23099f);
                instancePath2.cubicTo(5.1630607f, 20.23099f, 2.9f, 18.191664f, 2.9f, 15.659744f);
                instancePath2.cubicTo(2.9f, 13.439664f, 4.652343f, 11.544662f, 7.039936f, 11.184345f);
                instancePath2.lineTo(7.2316294f, 11.184345f);
                instancePath2.cubicTo(7.771693f, 11.184345f, 8.160703f, 11.507646f, 8.160703f, 11.9693575f);
                instancePath2.cubicTo(8.160933f, 12.048471f, 8.159011f, 12.08503f, 8.1512f, 12.131896f);
                instancePath2.cubicTo(8.140671f, 12.195074f, 8.120168f, 12.255544f, 8.0919075f, 12.310954f);
                instancePath2.cubicTo(7.919784f, 12.712574f, 7.479771f, 13.0602865f, 7.004661f, 13.179055f);
                instancePath2.cubicTo(5.7049966f, 13.492767f, 4.8060703f, 14.509667f, 4.8060703f, 15.659744f);
                instancePath2.cubicTo(4.8060703f, 17.101818f, 6.1828814f, 18.276997f, 7.902556f, 18.276997f);
                instancePath2.cubicTo(9.622231f, 18.276997f, 10.999042f, 17.101818f, 10.999042f, 15.659744f);
                instancePath2.lineTo(10.999042f, 8.471246f);
                instancePath2.cubicTo(10.999042f, 5.9393272f, 13.262102f, 3.9f, 16.04952f, 3.9f);
                instancePath2.cubicTo(18.836939f, 3.9f, 21.1f, 5.9393272f, 21.1f, 8.471246f);
                instancePath2.cubicTo(21.1f, 10.703113f, 19.388876f, 12.576041f, 17.004295f, 12.990751f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
