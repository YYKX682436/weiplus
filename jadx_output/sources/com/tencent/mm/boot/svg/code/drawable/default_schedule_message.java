package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class default_schedule_message extends l95.c {
    private final int width = 192;
    private final int height = 192;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 192;
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
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 4.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-12493);
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
                instancePaint4.setColor(-1);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(22.6665f, 34.6665f);
                instancePath2.lineTo(14.9155f, 34.6665f);
                instancePath2.cubicTo(13.8409f, 34.6665f, 13.2013f, 33.4145f, 13.841f, 32.5438f);
                instancePath2.cubicTo(15.2803f, 30.5847f, 15.9999f, 28.6256f, 15.9999f, 26.6665f);
                instancePath2.lineTo(15.9999f, 21.3332f);
                instancePath2.cubicTo(15.9999f, 17.8363f, 18.2435f, 14.8634f, 21.3697f, 13.7756f);
                instancePath2.cubicTo(21.3457f, 13.6317f, 21.3332f, 13.4839f, 21.3332f, 13.3332f);
                instancePath2.cubicTo(21.3332f, 11.8604f, 22.5271f, 10.6665f, 23.9999f, 10.6665f);
                instancePath2.cubicTo(25.4726f, 10.6665f, 26.6665f, 11.8604f, 26.6665f, 13.3332f);
                instancePath2.cubicTo(26.6665f, 13.4839f, 26.654f, 13.6317f, 26.63f, 13.7756f);
                instancePath2.cubicTo(29.7562f, 14.8634f, 31.9999f, 17.8363f, 31.9999f, 21.3332f);
                instancePath2.lineTo(31.9999f, 26.6665f);
                instancePath2.cubicTo(31.9999f, 28.6256f, 32.7195f, 30.5847f, 34.1587f, 32.5437f);
                instancePath2.cubicTo(34.7834f, 33.3941f, 34.1587f, 34.6665f, 33.0842f, 34.6665f);
                instancePath2.lineTo(25.3332f, 34.6665f);
                instancePath2.lineTo(25.3332f, 34.9332f);
                instancePath2.cubicTo(25.3332f, 35.6696f, 24.7362f, 36.2665f, 23.9999f, 36.2665f);
                instancePath2.cubicTo(23.2635f, 36.2665f, 22.6665f, 35.6696f, 22.6665f, 34.9332f);
                instancePath2.lineTo(22.6665f, 34.6665f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
