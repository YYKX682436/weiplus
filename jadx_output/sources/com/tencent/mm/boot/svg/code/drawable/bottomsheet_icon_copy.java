package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class bottomsheet_icon_copy extends l95.c {
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-8683387);
                canvas.save();
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(44.0f, 26.0f);
                instancePath.lineTo(38.0f, 32.0f);
                instancePath.cubicTo(38.86063f, 32.18764f, 39.391327f, 32.618652f, 40.0f, 33.0f);
                instancePath.cubicTo(43.856228f, 37.084045f, 43.856228f, 43.524426f, 40.0f, 47.0f);
                instancePath.lineTo(25.0f, 62.0f);
                instancePath.cubicTo(21.528116f, 65.855446f, 15.087992f, 65.855446f, 11.0f, 62.0f);
                instancePath.cubicTo(7.1437726f, 57.91035f, 7.1437726f, 51.469517f, 11.0f, 47.0f);
                instancePath.lineTo(16.0f, 43.0f);
                instancePath.cubicTo(14.604678f, 39.43273f, 14.147989f, 35.501705f, 15.0f, 32.0f);
                instancePath.lineTo(5.0f, 42.0f);
                instancePath.cubicTo(-1.7873816f, 48.893364f, -1.7873816f, 60.486504f, 5.0f, 68.0f);
                instancePath.cubicTo(12.512122f, 74.787575f, 24.103985f, 74.787575f, 31.0f, 68.0f);
                instancePath.lineTo(46.0f, 53.0f);
                instancePath.cubicTo(52.78738f, 46.10103f, 52.78738f, 34.507442f, 46.0f, 27.0f);
                instancePath.cubicTo(45.151382f, 26.870602f, 44.642796f, 26.420181f, 44.0f, 26.0f);
                instancePath.moveTo(68.0f, 5.0f);
                instancePath.cubicTo(60.488327f, -1.7875781f, 48.896015f, -1.7875781f, 42.0f, 5.0f);
                instancePath.lineTo(27.0f, 20.0f);
                instancePath.cubicTo(20.212618f, 26.898972f, 20.212618f, 38.492558f, 27.0f, 46.0f);
                instancePath.cubicTo(27.848618f, 46.1294f, 28.357655f, 46.57982f, 29.0f, 47.0f);
                instancePath.lineTo(35.0f, 41.0f);
                instancePath.cubicTo(34.13982f, 40.81236f, 33.608673f, 40.381348f, 33.0f, 40.0f);
                instancePath.cubicTo(29.143772f, 35.915955f, 29.143772f, 29.475574f, 33.0f, 26.0f);
                instancePath.lineTo(48.0f, 11.0f);
                instancePath.cubicTo(51.472336f, 7.144558f, 57.91201f, 7.144558f, 62.0f, 11.0f);
                instancePath.cubicTo(65.856224f, 15.08965f, 65.856224f, 21.530483f, 62.0f, 26.0f);
                instancePath.lineTo(57.0f, 30.0f);
                instancePath.cubicTo(58.395775f, 33.56727f, 58.852013f, 37.498295f, 58.0f, 41.0f);
                instancePath.lineTo(68.0f, 31.0f);
                instancePath.cubicTo(74.787384f, 24.106634f, 74.787384f, 12.513497f, 68.0f, 5.0f);
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
