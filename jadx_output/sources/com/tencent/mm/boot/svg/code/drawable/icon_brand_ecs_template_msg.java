package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_brand_ecs_template_msg extends l95.c {
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
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(6.00156f, 10.3923f);
                instancePath.lineTo(6.00156f, 13.6073f);
                instancePath.lineTo(8.15307f, 14.2974f);
                instancePath.cubicTo(8.15728f, 14.2987f, 8.16149f, 14.3f, 8.16569f, 14.3014f);
                instancePath.lineTo(8.17996f, 14.306f);
                instancePath.lineTo(20.8016f, 18.3547f);
                instancePath.lineTo(20.8016f, 5.64495f);
                instancePath.lineTo(6.00156f, 10.3923f);
                instancePath.close();
                instancePath.moveTo(14.2597f, 17.5164f);
                instancePath.lineTo(20.9572f, 19.6648f);
                instancePath.cubicTo(21.4735f, 19.8304f, 22.0016f, 19.4453f, 22.0016f, 18.903f);
                instancePath.lineTo(22.0016f, 5.09657f);
                instancePath.cubicTo(22.0016f, 4.55434f, 21.4735f, 4.16918f, 20.9572f, 4.3348f);
                instancePath.lineTo(5.35721f, 9.33881f);
                instancePath.cubicTo(5.02614f, 9.44501f, 4.80156f, 9.75289f, 4.80156f, 10.1006f);
                instancePath.lineTo(4.80156f, 13.899f);
                instancePath.cubicTo(4.80156f, 14.2467f, 5.02614f, 14.5546f, 5.35721f, 14.6608f);
                instancePath.lineTo(7.09471f, 15.2181f);
                instancePath.lineTo(6.83879f, 17.3999f);
                instancePath.cubicTo(6.79437f, 17.7787f, 7.02345f, 18.1361f, 7.38613f, 18.2539f);
                instancePath.lineTo(12.2254f, 19.8263f);
                instancePath.cubicTo(12.5881f, 19.9442f, 12.9835f, 19.7896f, 13.1702f, 19.4571f);
                instancePath.lineTo(14.2597f, 17.5164f);
                instancePath.close();
                instancePath.moveTo(2.60156f, 9.4596f);
                instancePath.cubicTo(2.60156f, 9.15923f, 2.8406f, 8.96603f, 3.04033f, 9.10497f);
                instancePath.lineTo(3.64033f, 9.52236f);
                instancePath.cubicTo(3.73943f, 9.5913f, 3.80156f, 9.72797f, 3.80156f, 9.87699f);
                instancePath.lineTo(3.80156f, 14.1225f);
                instancePath.cubicTo(3.80156f, 14.2715f, 3.73943f, 14.4082f, 3.64033f, 14.4771f);
                instancePath.lineTo(3.04033f, 14.8945f);
                instancePath.cubicTo(2.8406f, 15.0335f, 2.60156f, 14.8402f, 2.60156f, 14.5399f);
                instancePath.lineTo(2.60156f, 9.4596f);
                instancePath.close();
                instancePath.moveTo(8.06883f, 17.214f);
                instancePath.lineTo(8.25891f, 15.5934f);
                instancePath.lineTo(13.0831f, 17.1609f);
                instancePath.lineTo(12.2844f, 18.5837f);
                instancePath.lineTo(8.06883f, 17.214f);
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
