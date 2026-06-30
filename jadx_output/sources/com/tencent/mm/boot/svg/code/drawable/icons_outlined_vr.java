package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_vr extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 32;
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
                instancePath.moveTo(25.3333f, 3.33331f);
                instancePath.cubicTo(26.0696f, 3.33331f, 26.6666f, 3.93027f, 26.6666f, 4.66665f);
                instancePath.lineTo(26.6666f, 27.3333f);
                instancePath.cubicTo(26.6666f, 28.0697f, 26.0696f, 28.6666f, 25.3333f, 28.6666f);
                instancePath.lineTo(6.66659f, 28.6666f);
                instancePath.cubicTo(5.93021f, 28.6666f, 5.33325f, 28.0697f, 5.33325f, 27.3333f);
                instancePath.lineTo(5.33325f, 4.66665f);
                instancePath.cubicTo(5.33325f, 3.93027f, 5.93021f, 3.33331f, 6.66659f, 3.33331f);
                instancePath.lineTo(25.3333f, 3.33331f);
                instancePath.close();
                instancePath.moveTo(25.0666f, 4.93331f);
                instancePath.lineTo(6.93325f, 4.93331f);
                instancePath.lineTo(6.93325f, 27.0666f);
                instancePath.lineTo(25.0666f, 27.0666f);
                instancePath.lineTo(25.0666f, 4.93331f);
                instancePath.close();
                instancePath.moveTo(9.9344f, 11.6666f);
                instancePath.lineTo(11.1575f, 16.045f);
                instancePath.cubicTo(11.4445f, 17.0423f, 11.6317f, 17.9423f, 11.9313f, 18.9518f);
                instancePath.lineTo(11.9937f, 18.9518f);
                instancePath.cubicTo(12.2807f, 17.9423f, 12.4929f, 17.0423f, 12.7799f, 16.045f);
                instancePath.lineTo(13.9781f, 11.6666f);
                instancePath.lineTo(15.8502f, 11.6666f);
                instancePath.lineTo(13.0171f, 20.6666f);
                instancePath.lineTo(10.8205f, 20.6666f);
                instancePath.lineTo(7.99992f, 11.6666f);
                instancePath.lineTo(9.9344f, 11.6666f);
                instancePath.close();
                instancePath.moveTo(20.131f, 11.6666f);
                instancePath.cubicTo(22.0654f, 11.6666f, 23.6005f, 12.3234f, 23.6005f, 14.391f);
                instancePath.cubicTo(23.6005f, 15.741f, 22.9016f, 16.5802f, 21.8408f, 16.9815f);
                instancePath.lineTo(23.9999f, 20.6666f);
                instancePath.lineTo(21.9406f, 20.6666f);
                instancePath.lineTo(20.0436f, 17.2612f);
                instancePath.lineTo(18.7581f, 17.2612f);
                instancePath.lineTo(18.7581f, 20.6666f);
                instancePath.lineTo(16.911f, 20.6666f);
                instancePath.lineTo(16.911f, 11.6666f);
                instancePath.lineTo(20.131f, 11.6666f);
                instancePath.close();
                instancePath.moveTo(19.9562f, 13.0896f);
                instancePath.lineTo(18.7581f, 13.0896f);
                instancePath.lineTo(18.7581f, 15.8383f);
                instancePath.lineTo(19.9562f, 15.8383f);
                instancePath.cubicTo(21.1419f, 15.8383f, 21.7909f, 15.3518f, 21.7909f, 14.391f);
                instancePath.cubicTo(21.7909f, 13.418f, 21.1419f, 13.0896f, 19.9562f, 13.0896f);
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
