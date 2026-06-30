package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_cmaerastar extends l95.c {
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(20.0278f, 2.27068f);
                instancePath.lineTo(19.4317f, 0.80983f);
                instancePath.lineTo(18.8204f, 2.26441f);
                instancePath.cubicTo(18.4243f, 3.20712f, 18.1039f, 3.75848f, 17.8731f, 4.00902f);
                instancePath.cubicTo(17.6456f, 4.25599f, 17.1453f, 4.59921f, 16.2819f, 5.0267f);
                instancePath.lineTo(15.1035f, 5.61015f);
                instancePath.lineTo(16.2802f, 6.19698f);
                instancePath.cubicTo(17.1511f, 6.63129f, 17.651f, 6.97436f, 17.8731f, 7.21549f);
                instancePath.cubicTo(18.0986f, 7.46024f, 18.4188f, 8.01113f, 18.8211f, 8.96165f);
                instancePath.lineTo(19.4249f, 10.3883f);
                instancePath.lineTo(20.0252f, 8.96015f);
                instancePath.cubicTo(20.4215f, 8.01721f, 20.7419f, 7.46587f, 20.9725f, 7.21549f);
                instancePath.cubicTo(21.1999f, 6.9687f, 21.7002f, 6.62548f, 22.5638f, 6.19779f);
                instancePath.lineTo(23.7637f, 5.60356f);
                instancePath.lineTo(22.557f, 5.02338f);
                instancePath.cubicTo(21.723f, 4.62244f, 21.2211f, 4.27887f, 20.9725f, 4.00902f);
                instancePath.cubicTo(20.7208f, 3.73575f, 20.4f, 3.18277f, 20.0278f, 2.27068f);
                instancePath.close();
                instancePath.moveTo(14.7324f, 4.0f);
                instancePath.cubicTo(14.8579f, 4.0f, 14.9772f, 4.04708f, 15.0681f, 4.12939f);
                instancePath.cubicTo(14.7881f, 4.28472f, 14.4759f, 4.44823f, 14.1297f, 4.61966f);
                instancePath.lineTo(12.1133f, 5.61801f);
                instancePath.lineTo(14.1268f, 6.62212f);
                instancePath.cubicTo(15.617f, 7.36527f, 16.4724f, 7.95229f, 16.8526f, 8.36489f);
                instancePath.cubicTo(17.2384f, 8.78367f, 17.7862f, 9.72631f, 18.4746f, 11.3527f);
                instancePath.lineTo(19.5079f, 13.7938f);
                instancePath.lineTo(20.535f, 11.3502f);
                instancePath.cubicTo(21.1279f, 9.93941f, 21.6215f, 9.04092f, 22.0f, 8.55105f);
                instancePath.lineTo(22.0f, 19.0f);
                instancePath.cubicTo(22.0f, 19.5523f, 21.5523f, 20.0f, 21.0f, 20.0f);
                instancePath.lineTo(3.0f, 20.0f);
                instancePath.cubicTo(2.44772f, 20.0f, 2.0f, 19.5523f, 2.0f, 19.0f);
                instancePath.lineTo(2.0f, 8.0f);
                instancePath.cubicTo(2.0f, 7.44772f, 2.44772f, 7.0f, 3.0f, 7.0f);
                instancePath.lineTo(7.0f, 7.0f);
                instancePath.lineTo(8.85157f, 4.22265f);
                instancePath.cubicTo(8.9443f, 4.08355f, 9.10042f, 4.0f, 9.26759f, 4.0f);
                instancePath.lineTo(14.7324f, 4.0f);
                instancePath.close();
                instancePath.moveTo(15.5f, 13.0f);
                instancePath.cubicTo(15.5f, 14.933f, 13.933f, 16.5f, 12.0f, 16.5f);
                instancePath.cubicTo(10.067f, 16.5f, 8.5f, 14.933f, 8.5f, 13.0f);
                instancePath.cubicTo(8.5f, 11.067f, 10.067f, 9.5f, 12.0f, 9.5f);
                instancePath.cubicTo(13.933f, 9.5f, 15.5f, 11.067f, 15.5f, 13.0f);
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
