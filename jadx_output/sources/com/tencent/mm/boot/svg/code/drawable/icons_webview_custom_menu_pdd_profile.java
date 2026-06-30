package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_webview_custom_menu_pdd_profile extends l95.c {
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
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(12.0f, 3.09996f);
                instancePath.cubicTo(10.0762f, 3.09996f, 8.51665f, 4.6595f, 8.51665f, 6.5833f);
                instancePath.cubicTo(8.51665f, 8.50709f, 10.0762f, 10.0666f, 12.0f, 10.0666f);
                instancePath.cubicTo(13.9238f, 10.0666f, 15.4833f, 8.50709f, 15.4833f, 6.5833f);
                instancePath.cubicTo(15.4833f, 4.6595f, 13.9238f, 3.09996f, 12.0f, 3.09996f);
                instancePath.close();
                instancePath.moveTo(7.31665f, 6.5833f);
                instancePath.cubicTo(7.31665f, 3.99676f, 9.41345f, 1.89996f, 12.0f, 1.89996f);
                instancePath.cubicTo(14.5865f, 1.89996f, 16.6833f, 3.99676f, 16.6833f, 6.5833f);
                instancePath.cubicTo(16.6833f, 9.16983f, 14.5865f, 11.2666f, 12.0f, 11.2666f);
                instancePath.cubicTo(9.41345f, 11.2666f, 7.31665f, 9.16983f, 7.31665f, 6.5833f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-436207616);
                instancePaint4.setColor(-436207616);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(13.5138f, 13.2f);
                instancePath2.lineTo(10.4861f, 13.2f);
                instancePath2.cubicTo(9.34987f, 13.2f, 8.91093f, 13.2033f, 8.54112f, 13.2588f);
                instancePath2.cubicTo(6.61631f, 13.5481f, 5.00492f, 14.8691f, 4.3438f, 16.6998f);
                instancePath2.cubicTo(4.21678f, 17.0516f, 4.12749f, 17.4813f, 3.90465f, 18.5955f);
                instancePath2.cubicTo(3.77471f, 19.2452f, 3.75003f, 19.3978f, 3.74952f, 19.493f);
                instancePath2.cubicTo(3.74617f, 20.118f, 4.18794f, 20.6568f, 4.80139f, 20.7761f);
                instancePath2.cubicTo(4.89485f, 20.7943f, 5.04933f, 20.8f, 5.71187f, 20.8f);
                instancePath2.lineTo(18.2881f, 20.8f);
                instancePath2.cubicTo(18.9506f, 20.8f, 19.1051f, 20.7943f, 19.1986f, 20.7761f);
                instancePath2.cubicTo(19.812f, 20.6568f, 20.2538f, 20.118f, 20.2505f, 19.493f);
                instancePath2.cubicTo(20.25f, 19.3978f, 20.2253f, 19.2452f, 20.0953f, 18.5955f);
                instancePath2.cubicTo(19.8725f, 17.4813f, 19.7832f, 17.0516f, 19.6562f, 16.6998f);
                instancePath2.cubicTo(18.9951f, 14.8691f, 17.3837f, 13.5481f, 15.4589f, 13.2588f);
                instancePath2.cubicTo(15.089f, 13.2033f, 14.6501f, 13.2f, 13.5138f, 13.2f);
                instancePath2.close();
                instancePath2.moveTo(3.21514f, 16.2922f);
                instancePath2.cubicTo(3.05019f, 16.749f, 2.94277f, 17.2861f, 2.72795f, 18.3602f);
                instancePath2.cubicTo(2.60987f, 18.9506f, 2.55083f, 19.2458f, 2.54954f, 19.4866f);
                instancePath2.cubicTo(2.54309f, 20.6884f, 3.39266f, 21.7247f, 4.57237f, 21.954f);
                instancePath2.cubicTo(4.80872f, 22.0f, 5.10977f, 22.0f, 5.71187f, 22.0f);
                instancePath2.lineTo(18.2881f, 22.0f);
                instancePath2.cubicTo(18.8902f, 22.0f, 19.1913f, 22.0f, 19.4276f, 21.954f);
                instancePath2.cubicTo(20.6073f, 21.7247f, 21.4569f, 20.6884f, 21.4504f, 19.4866f);
                instancePath2.cubicTo(21.4492f, 19.2458f, 21.3901f, 18.9506f, 21.272f, 18.3602f);
                instancePath2.lineTo(21.272f, 18.3602f);
                instancePath2.cubicTo(21.0572f, 17.2861f, 20.9498f, 16.749f, 20.7848f, 16.2922f);
                instancePath2.cubicTo(19.974f, 14.047f, 17.9978f, 12.4269f, 15.6372f, 12.0722f);
                instancePath2.cubicTo(15.1569f, 12.0f, 14.6092f, 12.0f, 13.5138f, 12.0f);
                instancePath2.lineTo(10.4861f, 12.0f);
                instancePath2.cubicTo(9.39076f, 12.0f, 8.84306f, 12.0f, 8.3628f, 12.0722f);
                instancePath2.cubicTo(6.00218f, 12.4269f, 4.02594f, 14.047f, 3.21514f, 16.2922f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
