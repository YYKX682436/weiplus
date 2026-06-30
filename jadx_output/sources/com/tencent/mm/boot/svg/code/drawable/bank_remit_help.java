package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class bank_remit_help extends l95.c {
    private final int width = 54;
    private final int height = 54;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 54;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
            if (i17 == 2) {
                android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
                android.os.Looper looper = (android.os.Looper) objArr[1];
                l95.c.instanceMatrix(looper);
                l95.c.instanceMatrixArray(looper);
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
                instancePaint4.setColor(-13290187);
                instancePaint4.setStrokeWidth(4.0f);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(27.0f, 2.0f);
                instancePath.cubicTo(40.80712f, 2.0f, 52.0f, 13.192881f, 52.0f, 27.0f);
                instancePath.cubicTo(52.0f, 40.80712f, 40.80712f, 52.0f, 27.0f, 52.0f);
                instancePath.cubicTo(13.192881f, 52.0f, 2.0f, 40.80712f, 2.0f, 27.0f);
                instancePath.cubicTo(2.0f, 13.192881f, 13.192881f, 2.0f, 27.0f, 2.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
                instancePaint5.setColor(-13290187);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(18.515137f, 20.405273f);
                instancePath2.lineTo(22.760254f, 20.405273f);
                instancePath2.cubicTo(22.944824f, 17.780273f, 24.77002f, 16.11914f, 27.600098f, 16.11914f);
                instancePath2.cubicTo(30.409668f, 16.11914f, 32.234863f, 17.759766f, 32.234863f, 20.015625f);
                instancePath2.cubicTo(32.234863f, 22.086914f, 31.353027f, 23.25586f, 28.871582f, 24.75293f);
                instancePath2.cubicTo(26.062012f, 26.43457f, 24.811035f, 28.280273f, 24.913574f, 31.233398f);
                instancePath2.lineTo(24.934082f, 32.791992f);
                instancePath2.lineTo(29.1792f, 32.791992f);
                instancePath2.lineTo(29.1792f, 31.561523f);
                instancePath2.cubicTo(29.1792f, 29.490234f, 29.937988f, 28.40332f, 32.583496f, 26.844727f);
                instancePath2.cubicTo(35.290527f, 25.22461f, 36.890137f, 22.989258f, 36.890137f, 19.831055f);
                instancePath2.cubicTo(36.890137f, 15.380859f, 33.239746f, 12.161133f, 27.825684f, 12.161133f);
                instancePath2.cubicTo(21.878418f, 12.161133f, 18.699707f, 15.688477f, 18.515137f, 20.405273f);
                instancePath2.close();
                instancePath2.moveTo(27.312988f, 42.47168f);
                instancePath2.cubicTo(29.199707f, 42.47168f, 30.471191f, 41.220703f, 30.471191f, 39.354492f);
                instancePath2.cubicTo(30.471191f, 37.447266f, 29.199707f, 36.19629f, 27.312988f, 36.19629f);
                instancePath2.cubicTo(25.42627f, 36.19629f, 24.134277f, 37.447266f, 24.134277f, 39.354492f);
                instancePath2.cubicTo(24.134277f, 41.220703f, 25.42627f, 42.47168f, 27.312988f, 42.47168f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
