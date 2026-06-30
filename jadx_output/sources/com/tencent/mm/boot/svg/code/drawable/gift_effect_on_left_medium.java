package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class gift_effect_on_left_medium extends l95.c {
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
                instancePaint3.setColor(-16767386);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(4.97101f, 16.0f);
                instancePath.lineTo(4.21376f, 18.2138f);
                instancePath.lineTo(2.0f, 18.971f);
                instancePath.lineTo(4.21376f, 19.7283f);
                instancePath.lineTo(4.97101f, 22.0f);
                instancePath.lineTo(5.72825f, 19.7283f);
                instancePath.lineTo(8.0f, 18.971f);
                instancePath.lineTo(5.72825f, 18.2138f);
                instancePath.lineTo(4.97101f, 16.0f);
                instancePath.close();
                instancePath.moveTo(13.9304f, 12.8697f);
                instancePath.lineTo(12.8696f, 13.9303f);
                instancePath.lineTo(20.4683f, 21.5303f);
                instancePath.lineTo(21.529f, 20.4697f);
                instancePath.lineTo(13.9304f, 12.8697f);
                instancePath.close();
                instancePath.moveTo(11.8564f, 0.996214f);
                instancePath.lineTo(11.7742f, 1.04851f);
                instancePath.lineTo(7.83761f, 4.00151f);
                instancePath.lineTo(3.2382f, 2.4808f);
                instancePath.cubicTo(2.77f, 2.32594f, 2.32528f, 2.77067f, 2.48014f, 3.23887f);
                instancePath.lineTo(4.00155f, 7.83756f);
                instancePath.lineTo(1.04785f, 11.7749f);
                instancePath.cubicTo(0.76739f, 12.1486f, 1.00409f, 12.6707f, 1.44384f, 12.7296f);
                instancePath.lineTo(1.54107f, 12.7349f);
                instancePath.lineTo(6.40854f, 12.6261f);
                instancePath.lineTo(9.18069f, 16.5725f);
                instancePath.cubicTo(9.448f, 16.953f, 10.0154f, 16.8926f, 10.2096f, 16.4942f);
                instancePath.lineTo(10.2432f, 16.4101f);
                instancePath.lineTo(11.7359f, 11.7351f);
                instancePath.lineTo(16.4094f, 10.2439f);
                instancePath.cubicTo(16.8524f, 10.1024f, 16.9643f, 9.54294f, 16.642f, 9.23862f);
                instancePath.lineTo(16.5718f, 9.18135f);
                instancePath.lineTo(12.6261f, 6.4085f);
                instancePath.lineTo(12.7342f, 1.54173f);
                instancePath.cubicTo(12.7446f, 1.07457f, 12.2482f, 0.788034f, 11.8564f, 0.996214f);
                instancePath.close();
                instancePath.moveTo(11.1935f, 3.35804f);
                instancePath.lineTo(11.1087f, 7.17549f);
                instancePath.lineTo(14.2256f, 9.36562f);
                instancePath.lineTo(10.5424f, 10.5414f);
                instancePath.lineTo(9.36567f, 14.2256f);
                instancePath.lineTo(7.17565f, 11.1086f);
                instancePath.lineTo(3.35879f, 11.1928f);
                instancePath.lineTo(5.67186f, 8.11064f);
                instancePath.lineTo(4.46683f, 4.46608f);
                instancePath.lineTo(8.1108f, 5.6717f);
                instancePath.lineTo(11.1935f, 3.35804f);
                instancePath.close();
                instancePath.moveTo(19.9609f, 2.00001f);
                instancePath.lineTo(19.4914f, 3.49138f);
                instancePath.lineTo(18.0f, 4.03913f);
                instancePath.lineTo(19.4914f, 4.50864f);
                instancePath.lineTo(19.9609f, 6.00001f);
                instancePath.lineTo(20.5086f, 4.50864f);
                instancePath.lineTo(22.0f, 4.03913f);
                instancePath.lineTo(20.5086f, 3.49138f);
                instancePath.lineTo(19.9609f, 2.00001f);
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
