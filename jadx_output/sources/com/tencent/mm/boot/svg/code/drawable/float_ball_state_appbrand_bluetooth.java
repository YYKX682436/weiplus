package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class float_ball_state_appbrand_bluetooth extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(24.0f, 0.0f);
                instancePath.lineTo(24.0f, 24.0f);
                instancePath.lineTo(0.0f, 24.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16268960);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(8.889356f, 1.4676479f);
                instancePath2.lineTo(12.712133f, 5.287867f);
                instancePath2.cubicTo(13.005328f, 5.5804577f, 13.005487f, 6.0553317f, 12.712692f, 6.348323f);
                instancePath2.cubicTo(12.712625f, 6.348391f, 12.712556f, 6.348459f, 12.712284f, 6.348323f);
                instancePath2.lineTo(10.060529f, 8.99981f);
                instancePath2.lineTo(10.060529f, 8.99981f);
                instancePath2.lineTo(12.712316f, 11.651646f);
                instancePath2.cubicTo(13.005169f, 11.944557f, 13.005177f, 12.419411f, 12.712333f, 12.712333f);
                instancePath2.lineTo(8.889455f, 16.535522f);
                instancePath2.cubicTo(8.743014f, 16.681974f, 8.505578f, 16.681984f, 8.359125f, 16.535543f);
                instancePath2.cubicTo(8.288793f, 16.465216f, 8.249279f, 16.36983f, 8.249279f, 16.270367f);
                instancePath2.lineTo(8.249279f, 10.811061f);
                instancePath2.lineTo(8.249279f, 10.811061f);
                instancePath2.lineTo(5.287689f, 13.772971f);
                instancePath2.lineTo(4.2270293f, 12.712311f);
                instancePath2.lineTo(7.9387794f, 8.99981f);
                instancePath2.lineTo(4.2270293f, 5.287689f);
                instancePath2.lineTo(5.287689f, 4.2270293f);
                instancePath2.lineTo(8.249279f, 7.1885605f);
                instancePath2.lineTo(8.249279f, 1.7329017f);
                instancePath2.cubicTo(8.249279f, 1.5257949f, 8.417172f, 1.3579017f, 8.624279f, 1.3579017f);
                instancePath2.cubicTo(8.723692f, 1.3579017f, 8.8190365f, 1.3973761f, 8.889356f, 1.4676479f);
                instancePath2.close();
                instancePath2.moveTo(9.749279f, 10.81031f);
                instancePath2.lineTo(9.749279f, 13.554561f);
                instancePath2.lineTo(11.121779f, 12.18206f);
                instancePath2.lineTo(9.749279f, 10.81031f);
                instancePath2.close();
                instancePath2.moveTo(9.749279f, 4.4488106f);
                instancePath2.lineTo(9.749279f, 7.1893106f);
                instancePath2.lineTo(11.119529f, 5.819061f);
                instancePath2.lineTo(9.749279f, 4.4488106f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
