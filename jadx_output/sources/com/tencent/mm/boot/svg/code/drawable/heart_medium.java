package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class heart_medium extends l95.c {
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(11.2905f, 6.26427f);
                instancePath.lineTo(11.6766f, 6.64144f);
                instancePath.lineTo(11.9976f, 6.94635f);
                instancePath.lineTo(12.4599f, 6.50502f);
                instancePath.lineTo(12.7047f, 6.26427f);
                instancePath.cubicTo(14.6573f, 4.31165f, 17.8231f, 4.31165f, 19.7758f, 6.26427f);
                instancePath.cubicTo(21.7102f, 8.19873f, 21.7282f, 11.3239f, 19.8297f, 13.2805f);
                instancePath.lineTo(12.7046f, 20.4064f);
                instancePath.cubicTo(12.3442f, 20.7669f, 11.777f, 20.7947f, 11.3847f, 20.4897f);
                instancePath.lineTo(11.2905f, 20.4064f);
                instancePath.lineTo(4.16501f, 13.2809f);
                instancePath.cubicTo(2.26695f, 11.3239f, 2.28494f, 8.19873f, 4.2194f, 6.26427f);
                instancePath.cubicTo(6.17202f, 4.31165f, 9.33785f, 4.31165f, 11.2905f, 6.26427f);
                instancePath.close();
                instancePath.moveTo(10.2298f, 7.32493f);
                instancePath.cubicTo(8.86297f, 5.9581f, 6.6469f, 5.9581f, 5.28006f, 7.32493f);
                instancePath.cubicTo(3.97578f, 8.62921f, 3.91468f, 10.7102f, 5.08999f, 12.072f);
                instancePath.lineTo(5.22567f, 12.2203f);
                instancePath.lineTo(11.9949f, 18.9938f);
                instancePath.lineTo(18.7532f, 12.236f);
                instancePath.cubicTo(20.0357f, 10.9142f, 20.0671f, 8.83275f, 18.8549f, 7.47297f);
                instancePath.lineTo(18.7151f, 7.32493f);
                instancePath.cubicTo(17.3971f, 6.00691f, 15.2894f, 5.95984f, 13.9071f, 7.19153f);
                instancePath.lineTo(13.7566f, 7.33364f);
                instancePath.lineTo(13.4956f, 7.59007f);
                instancePath.lineTo(12.0f, 9.0177f);
                instancePath.lineTo(10.6286f, 7.71454f);
                instancePath.lineTo(10.2298f, 7.32493f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
