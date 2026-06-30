package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class my_life_around_default_icon extends l95.c {
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint3.setStrokeWidth(1.0f);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-372399);
            instancePaint4.setStrokeWidth(3.7565217f);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 13.0f, 0.0f, 1.0f, 8.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(33.423096f, 23.393011f);
            instancePath.cubicTo(33.423096f, 28.885603f, 28.958527f, 33.335987f, 23.453514f, 33.335987f);
            instancePath.cubicTo(17.946226f, 33.335987f, 13.483933f, 28.885603f, 13.483933f, 23.393011f);
            instancePath.cubicTo(13.483933f, 17.90042f, 17.946226f, 13.450035f, 23.453514f, 13.450035f);
            instancePath.cubicTo(28.958527f, 13.450035f, 33.423096f, 17.90042f, 33.423096f, 23.393011f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint4, looper);
            instancePaint6.setStrokeJoin(android.graphics.Paint.Join.MITER);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(36.644825f, 43.30803f);
            instancePath2.lineTo(23.453743f, 56.466183f);
            instancePath2.lineTo(14.822849f, 47.85832f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint6);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint4, looper);
            android.graphics.Path instancePath3 = l95.c.instancePath(looper);
            instancePath3.moveTo(40.033207f, 39.928688f);
            instancePath3.cubicTo(49.190014f, 30.796316f, 49.190014f, 15.989706f, 40.033207f, 6.857335f);
            instancePath3.cubicTo(30.876402f, -2.275036f, 16.030172f, -2.275036f, 6.873366f, 6.857335f);
            instancePath3.cubicTo(-2.2834404f, 15.989706f, -2.2834404f, 30.796316f, 6.873366f, 39.928688f);
            instancePath3.lineTo(11.679438f, 44.721935f);
            canvas.drawPath(instancePath3, instancePaint7);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
