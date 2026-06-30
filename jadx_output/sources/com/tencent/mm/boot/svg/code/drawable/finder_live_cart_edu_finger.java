package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_cart_edu_finger extends l95.c {
    private final int width = 30;
    private final int height = 36;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 30;
        }
        if (i17 == 1) {
            return 36;
        }
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
            instancePaint3.setColor(-1);
            instancePaint3.setColor(-1);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(8.30133f, 20.4974f);
            instancePath.lineTo(7.20042f, 3.56837f);
            instancePath.cubicTo(7.08503f, 1.79399f, 8.37577f, 0.238496f, 10.141f, 0.0246285f);
            instancePath.cubicTo(11.9198f, -0.190886f, 13.5534f, 1.03123f, 13.8488f, 2.79853f);
            instancePath.lineTo(15.3199f, 11.5996f);
            instancePath.lineTo(23.2265f, 12.889f);
            instancePath.cubicTo(27.6911f, 13.617f, 30.6859f, 17.8717f, 29.8648f, 22.3202f);
            instancePath.lineTo(27.9718f, 32.5764f);
            instancePath.cubicTo(27.6578f, 34.2777f, 26.1742f, 35.5126f, 24.4441f, 35.5126f);
            instancePath.lineTo(11.2152f, 35.5126f);
            instancePath.cubicTo(10.6569f, 35.5126f, 10.1311f, 35.2496f, 9.79629f, 34.8028f);
            instancePath.lineTo(0.650823f, 22.6002f);
            instancePath.cubicTo(-0.26891f, 21.373f, -0.208332f, 19.6706f, 0.796295f, 18.5119f);
            instancePath.cubicTo(1.94038f, 17.1923f, 3.92142f, 17.0095f, 5.28762f, 18.0975f);
            instancePath.lineTo(8.30133f, 20.4974f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
