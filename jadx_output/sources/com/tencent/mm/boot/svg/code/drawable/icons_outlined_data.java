package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_data extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                instancePath.moveTo(31.4f, 33.0f);
                instancePath.lineTo(31.398f, 59.3982f);
                instancePath.lineTo(40.599f, 59.3982f);
                instancePath.lineTo(40.6f, 40.5f);
                instancePath.lineTo(44.2f, 40.5f);
                instancePath.lineTo(44.199f, 59.3982f);
                instancePath.lineTo(53.397f, 59.3982f);
                instancePath.lineTo(53.4f, 36.0f);
                instancePath.lineTo(57.0f, 36.0f);
                instancePath.lineTo(56.997f, 59.3982f);
                instancePath.lineTo(63.0f, 59.4f);
                instancePath.lineTo(63.0f, 63.0f);
                instancePath.lineTo(9.0f, 63.0f);
                instancePath.lineTo(9.0f, 59.4f);
                instancePath.lineTo(15.0f, 59.3982f);
                instancePath.lineTo(15.0f, 42.0f);
                instancePath.lineTo(18.6f, 42.0f);
                instancePath.lineTo(18.6f, 59.3982f);
                instancePath.lineTo(27.798f, 59.3982f);
                instancePath.lineTo(27.8f, 33.0f);
                instancePath.lineTo(31.4f, 33.0f);
                instancePath.close();
                instancePath.moveTo(30.0206f, 11.5283f);
                instancePath.lineTo(46.9911f, 28.4989f);
                instancePath.lineTo(58.983f, 16.5023f);
                instancePath.lineTo(54.3826f, 16.5011f);
                instancePath.lineTo(54.3826f, 12.9011f);
                instancePath.lineTo(65.1826f, 12.9011f);
                instancePath.lineTo(65.1826f, 23.7011f);
                instancePath.lineTo(61.5826f, 23.7011f);
                instancePath.lineTo(61.578f, 18.9983f);
                instancePath.lineTo(46.9911f, 33.59f);
                instancePath.lineTo(30.0206f, 16.6195f);
                instancePath.lineTo(14.3228f, 32.3173f);
                instancePath.lineTo(11.7772f, 29.7717f);
                instancePath.lineTo(30.0206f, 11.5283f);
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
