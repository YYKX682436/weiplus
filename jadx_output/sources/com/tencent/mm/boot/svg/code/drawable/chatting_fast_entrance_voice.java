package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class chatting_fast_entrance_voice extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 96;
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
                instancePaint3.setColor(-2500135);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 21.0f, 0.0f, 1.0f, 21.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(1.7508265f, 9.118188f);
                instancePath.cubicTo(3.893294f, 5.1235943f, 7.759701f, 2.3841593f, 11.516493f, 0.043187827f);
                instancePath.cubicTo(13.110888f, -0.28554434f, 13.8184f, 1.3381933f, 14.665422f, 2.344313f);
                instancePath.cubicTo(16.967329f, 5.7113276f, 19.49843f, 8.928918f, 21.72062f, 12.355701f);
                instancePath.cubicTo(22.48792f, 13.341898f, 21.899988f, 14.786327f, 20.813807f, 15.254521f);
                instancePath.cubicTo(18.37239f, 16.977875f, 15.622059f, 18.173265f, 12.911589f, 19.398539f);
                instancePath.cubicTo(14.197069f, 23.56248f, 16.658415f, 27.228342f, 19.588116f, 30.416048f);
                instancePath.cubicTo(23.753471f, 34.95853f, 28.58648f, 39.24201f, 34.595356f, 41.0849f);
                instancePath.cubicTo(36.080135f, 38.026695f, 37.35565f, 34.759296f, 39.6177f, 32.169285f);
                instancePath.cubicTo(41.381496f, 31.37236f, 42.7168f, 33.14552f, 44.101933f, 33.922523f);
                instancePath.cubicTo(47.29072f, 36.402958f, 50.828285f, 38.43512f, 53.837704f, 41.13471f);
                instancePath.cubicTo(54.455532f, 42.59906f, 53.160088f, 43.744644f, 52.45257f, 44.880264f);
                instancePath.cubicTo(50.150665f, 47.908585f, 47.70925f, 51.235752f, 44.01225f, 52.61045f);
                instancePath.cubicTo(41.411392f, 53.61657f, 38.66106f, 52.461025f, 36.20968f, 51.54456f);
                instancePath.cubicTo(20.993176f, 45.03965f, 8.477179f, 32.44821f, 2.17932f, 17.127298f);
                instancePath.cubicTo(1.1927884f, 14.616981f, 0.32583636f, 11.658391f, 1.7508265f, 9.118188f);
                instancePath.lineTo(1.7508265f, 9.118188f);
                instancePath.lineTo(1.7508265f, 9.118188f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
