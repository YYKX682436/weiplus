package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_screen_effect_medium extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
        }
        if (i17 != 2) {
            return 0;
        }
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
        instancePath.moveTo(10.6666f, 18.6666f);
        instancePath.cubicTo(12.5303f, 18.6666f, 14.0964f, 19.9412f, 14.5405f, 21.6663f);
        instancePath.lineTo(29.3333f, 21.6666f);
        instancePath.lineTo(29.3333f, 23.6666f);
        instancePath.lineTo(14.5402f, 23.6682f);
        instancePath.cubicTo(14.0956f, 25.3926f, 12.5299f, 26.6666f, 10.6666f, 26.6666f);
        instancePath.cubicTo(8.80339f, 26.6666f, 7.23769f, 25.3926f, 6.79307f, 23.6682f);
        instancePath.lineTo(2.66663f, 23.6666f);
        instancePath.lineTo(2.66663f, 21.6666f);
        instancePath.lineTo(6.79273f, 21.6663f);
        instancePath.cubicTo(7.23689f, 19.9412f, 8.80291f, 18.6666f, 10.6666f, 18.6666f);
        instancePath.close();
        instancePath.moveTo(10.6666f, 20.6666f);
        instancePath.cubicTo(9.56206f, 20.6666f, 8.66663f, 21.562f, 8.66663f, 22.6666f);
        instancePath.cubicTo(8.66663f, 23.7712f, 9.56206f, 24.6666f, 10.6666f, 24.6666f);
        instancePath.cubicTo(11.7712f, 24.6666f, 12.6666f, 23.7712f, 12.6666f, 22.6666f);
        instancePath.cubicTo(12.6666f, 21.562f, 11.7712f, 20.6666f, 10.6666f, 20.6666f);
        instancePath.close();
        instancePath.moveTo(21.3333f, 5.33325f);
        instancePath.cubicTo(23.9372f, 5.33325f, 26.1053f, 7.19932f, 26.5731f, 9.66711f);
        instancePath.lineTo(29.3333f, 9.66659f);
        instancePath.lineTo(29.3333f, 11.6666f);
        instancePath.lineTo(26.5729f, 11.6674f);
        instancePath.cubicTo(26.1045f, 14.1345f, 23.9367f, 15.9999f, 21.3333f, 15.9999f);
        instancePath.cubicTo(18.7299f, 15.9999f, 16.5621f, 14.1345f, 16.0937f, 11.6674f);
        instancePath.lineTo(2.66663f, 11.6666f);
        instancePath.lineTo(2.66663f, 9.66659f);
        instancePath.lineTo(16.0935f, 9.66711f);
        instancePath.cubicTo(16.5613f, 7.19932f, 18.7294f, 5.33325f, 21.3333f, 5.33325f);
        instancePath.close();
        instancePath.moveTo(21.3333f, 7.33325f);
        instancePath.cubicTo(19.4923f, 7.33325f, 18.0f, 8.82564f, 18.0f, 10.6666f);
        instancePath.cubicTo(18.0f, 12.5075f, 19.4923f, 13.9999f, 21.3333f, 13.9999f);
        instancePath.cubicTo(23.1742f, 13.9999f, 24.6666f, 12.5075f, 24.6666f, 10.6666f);
        instancePath.cubicTo(24.6666f, 8.82564f, 23.1742f, 7.33325f, 21.3333f, 7.33325f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
