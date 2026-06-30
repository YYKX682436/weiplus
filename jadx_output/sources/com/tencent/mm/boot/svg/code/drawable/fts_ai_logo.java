package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class fts_ai_logo extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(looper);
        instancePaint3.setFlags(385);
        instancePaint3.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint3.setColor(-16777216);
        instancePaint4.setStrokeWidth(1.0f);
        instancePaint4.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint4.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint4.setStrokeMiter(4.0f);
        instancePaint4.setPathEffect(null);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-1);
        instancePaint5.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(16.0f, 0.0f);
        instancePath2.lineTo(16.0f, 16.0f);
        instancePath2.lineTo(0.0f, 16.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.addPath(instancePath, instanceMatrix, instancePath2, true);
        canvas.clipPath(instancePath);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        instancePaint6.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(11.1243f, 1.0273399f);
        instancePath3.cubicTo(12.090798f, 1.0273399f, 12.8743f, 1.8108416f, 12.8743f, 2.77734f);
        instancePath3.cubicTo(12.8743f, 3.7438383f, 12.090798f, 4.52734f, 11.1243f, 4.52734f);
        instancePath3.cubicTo(10.157802f, 4.52734f, 9.3743f, 3.7438383f, 9.3743f, 2.77734f);
        instancePath3.cubicTo(9.3743f, 1.8108416f, 10.157802f, 1.0273399f, 11.1243f, 1.0273399f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-16777216);
        instancePaint7.setColor(-16777216);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(13.0616f, 6.14532f);
        instancePath4.cubicTo(13.8266f, 6.04845f, 14.0695f, 7.1336f, 13.3577f, 7.4303f);
        instancePath4.cubicTo(11.1037f, 8.36986f, 9.70381f, 10.6976f, 9.97136f, 13.1249f);
        instancePath4.lineTo(9.98505f, 13.2491f);
        instancePath4.cubicTo(10.0646f, 13.9708f, 9.06187f, 14.2329f, 8.77812f, 13.5645f);
        instancePath4.cubicTo(7.83492f, 11.3427f, 5.51971f, 10.0287f, 3.12858f, 10.3581f);
        instancePath4.lineTo(2.97811f, 10.3789f);
        instancePath4.cubicTo(2.22867f, 10.4821f, 1.93796f, 9.43939f, 2.62885f, 9.13119f);
        instancePath4.cubicTo(4.87472f, 8.12933f, 6.20128f, 5.76846f, 5.88222f, 3.33005f);
        instancePath4.lineTo(5.86858f, 3.2258f);
        instancePath4.cubicTo(5.77056f, 2.47671f, 6.81245f, 2.1892f, 7.11247f, 2.88255f);
        instancePath4.cubicTo(8.08851f, 5.13818f, 10.4375f, 6.47759f, 12.8758f, 6.16885f);
        instancePath4.lineTo(13.0616f, 6.14532f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
