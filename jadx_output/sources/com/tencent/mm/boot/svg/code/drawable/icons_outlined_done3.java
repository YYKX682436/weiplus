package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_done3 extends l95.c {
    private final int width = 80;
    private final int height = 80;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 80;
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
                instancePaint3.setColor(14211288);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(80.0f, 0.0f);
                instancePath.lineTo(80.0f, 80.0f);
                instancePath.lineTo(0.0f, 80.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16268960);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 11.0f, 0.0f, 1.0f, 11.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(29.0f, 4.8333335f);
                instancePath2.cubicTo(42.34688f, 4.8333335f, 53.166668f, 15.653118f, 53.166668f, 29.0f);
                instancePath2.cubicTo(53.166668f, 42.34688f, 42.34688f, 53.166668f, 29.0f, 53.166668f);
                instancePath2.cubicTo(15.653118f, 53.166668f, 4.8333335f, 42.34688f, 4.8333335f, 29.0f);
                instancePath2.cubicTo(4.8333335f, 15.653118f, 15.653118f, 4.8333335f, 29.0f, 4.8333335f);
                instancePath2.close();
                instancePath2.moveTo(29.0f, 7.733333f);
                instancePath2.cubicTo(17.254744f, 7.733333f, 7.733333f, 17.254744f, 7.733333f, 29.0f);
                instancePath2.cubicTo(7.733333f, 40.745255f, 17.254744f, 50.266666f, 29.0f, 50.266666f);
                instancePath2.cubicTo(40.745255f, 50.266666f, 50.266666f, 40.745255f, 50.266666f, 29.0f);
                instancePath2.cubicTo(50.266666f, 17.254744f, 40.745255f, 7.733333f, 29.0f, 7.733333f);
                instancePath2.close();
                instancePath2.moveTo(40.205486f, 21.145834f);
                instancePath2.lineTo(42.256096f, 23.196444f);
                instancePath2.lineTo(27.87754f, 37.575f);
                instancePath2.cubicTo(26.933773f, 38.51877f, 25.403625f, 38.51877f, 24.459858f, 37.575f);
                instancePath2.lineTo(16.916666f, 30.031809f);
                instancePath2.lineTo(18.967276f, 27.9812f);
                instancePath2.lineTo(26.1687f, 35.18262f);
                instancePath2.lineTo(40.205486f, 21.145834f);
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
