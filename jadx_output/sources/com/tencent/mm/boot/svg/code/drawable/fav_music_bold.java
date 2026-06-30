package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class fav_music_bold extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
        }
        if (i17 != 2) {
            return 0;
        }
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(18.6302f, 6.92912f);
        instancePath.cubicTo(16.9002f, 5.51912f, 15.1702f, 5.70912f, 13.8802f, 4.35912f);
        instancePath.cubicTo(13.5102f, 3.95912f, 13.3102f, 3.48912f, 13.2502f, 2.98912f);
        instancePath.cubicTo(13.1402f, 2.37912f, 12.5002f, 2.25912f, 12.0902f, 2.50912f);
        instancePath.cubicTo(12.0602f, 2.52912f, 12.0402f, 2.54912f, 12.0102f, 2.56912f);
        instancePath.cubicTo(11.9502f, 2.61912f, 11.9002f, 2.67912f, 11.8602f, 2.73912f);
        instancePath.cubicTo(11.6502f, 3.02912f, 11.5102f, 3.45912f, 11.5102f, 4.05912f);
        instancePath.lineTo(11.5102f, 12.0391f);
        instancePath.cubicTo(11.4602f, 14.5791f, 11.0302f, 14.5091f, 8.82021f, 15.0691f);
        instancePath.cubicTo(7.09021f, 15.5091f, 5.65021f, 16.6691f, 5.66021f, 18.4491f);
        instancePath.cubicTo(5.67021f, 20.2291f, 7.24021f, 21.7091f, 9.06021f, 21.6591f);
        instancePath.cubicTo(13.5702f, 21.5391f, 13.5102f, 16.8491f, 13.5002f, 14.9091f);
        instancePath.lineTo(13.5002f, 7.81912f);
        instancePath.cubicTo(13.5002f, 6.81912f, 14.1802f, 7.06912f, 15.4602f, 7.53912f);
        instancePath.lineTo(15.4502f, 7.53912f);
        instancePath.cubicTo(15.6402f, 7.59912f, 15.8302f, 7.66912f, 16.0202f, 7.71912f);
        instancePath.cubicTo(16.9202f, 8.07912f, 17.9502f, 8.50912f, 18.2802f, 9.38912f);
        instancePath.cubicTo(18.7002f, 10.7191f, 17.8102f, 11.9291f, 16.5102f, 12.5391f);
        instancePath.cubicTo(16.3202f, 12.6291f, 16.3902f, 12.9191f, 16.6002f, 12.9191f);
        instancePath.cubicTo(19.5202f, 12.9091f, 21.3302f, 9.02912f, 18.6202f, 6.92912f);
        instancePath.lineTo(18.6302f, 6.92912f);
        instancePath.close();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(looper);
        instancePaint5.setFlags(385);
        instancePaint5.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint4.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.0f);
        instancePaint5.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint5.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint5.setStrokeMiter(4.0f);
        instancePaint5.setPathEffect(null);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 12.8056f, 2.38672f, 12.8056f, 21.6604f, new int[]{-813269, -2277876}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
