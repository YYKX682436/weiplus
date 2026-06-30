package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_attach_file_arrow_down extends l95.c {
    private final int width = 36;
    private final int height = 36;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 36;
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, -6.123234E-17f, -1.0f, 33.0f, -1.0f, 6.123234E-17f, 37.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(1.0f, -2.2737368E-13f);
        instancePath.lineTo(37.0f, -2.2737368E-13f);
        instancePath.lineTo(37.0f, 30.0f);
        instancePath.lineTo(1.0f, 30.0f);
        instancePath.lineTo(1.0f, -2.2737368E-13f);
        instancePath.close();
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(11.684951f, 3.75f);
        instancePath2.lineTo(15.354067f, 7.5f);
        instancePath2.lineTo(10.609327f, 12.348f);
        instancePath2.lineTo(21.433258f, 12.34835f);
        instancePath2.lineTo(21.433258f, 17.65165f);
        instancePath2.lineTo(10.610328f, 17.651f);
        instancePath2.lineTo(15.354067f, 22.5f);
        instancePath2.lineTo(11.684951f, 26.25f);
        instancePath2.lineTo(1.2001371f, 15.534054f);
        instancePath2.cubicTo(0.9097244f, 15.237239f, 0.9097244f, 14.762761f, 1.2001371f, 14.465946f);
        instancePath2.lineTo(4.3467183f, 11.25f);
        instancePath2.lineTo(11.684951f, 3.75f);
        instancePath2.close();
        instancePath2.moveTo(29.216629f, 12.34835f);
        instancePath2.lineTo(29.216629f, 17.65165f);
        instancePath2.lineTo(24.027716f, 17.65165f);
        instancePath2.lineTo(24.027716f, 12.34835f);
        instancePath2.lineTo(29.216629f, 12.34835f);
        instancePath2.close();
        instancePath2.moveTo(37.0f, 12.34835f);
        instancePath2.lineTo(37.0f, 17.65165f);
        instancePath2.lineTo(31.811087f, 17.65165f);
        instancePath2.lineTo(31.811087f, 12.34835f);
        instancePath2.lineTo(37.0f, 12.34835f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
