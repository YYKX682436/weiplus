package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_locate_to_chat_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        instancePaint3.setColor(-16777216);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(20.1293f, 15.2646f);
        instancePath.lineTo(18.0317f, 15.2646f);
        instancePath.lineTo(21.1157f, 18.3477f);
        instancePath.lineTo(20.6918f, 18.7725f);
        instancePath.lineTo(20.267f, 19.1963f);
        instancePath.lineTo(17.1733f, 16.1016f);
        instancePath.lineTo(17.1733f, 18.2207f);
        instancePath.lineTo(15.9741f, 18.2207f);
        instancePath.lineTo(15.9741f, 15.0654f);
        instancePath.cubicTo(15.9741f, 14.5132f, 16.4218f, 14.0655f, 16.9741f, 14.0654f);
        instancePath.lineTo(20.1293f, 14.0654f);
        instancePath.lineTo(20.1293f, 15.2646f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(18.4995f, 11.0f);
        instancePath2.cubicTo(21.5369f, 11.0f, 23.9993f, 13.4626f, 23.9995f, 16.5f);
        instancePath2.cubicTo(23.9993f, 19.5375f, 21.5369f, 22.0f, 18.4995f, 22.0f);
        instancePath2.cubicTo(15.4621f, 21.9998f, 12.9996f, 19.5374f, 12.9995f, 16.5f);
        instancePath2.cubicTo(12.9997f, 13.4627f, 15.4621f, 11.0002f, 18.4995f, 11.0f);
        instancePath2.close();
        instancePath2.moveTo(18.4995f, 12.2002f);
        instancePath2.cubicTo(16.1249f, 12.2004f, 14.1999f, 14.1254f, 14.1997f, 16.5f);
        instancePath2.cubicTo(14.1998f, 18.8746f, 16.1248f, 20.7996f, 18.4995f, 20.7998f);
        instancePath2.cubicTo(20.8742f, 20.7998f, 22.7991f, 18.8747f, 22.7993f, 16.5f);
        instancePath2.cubicTo(22.7991f, 14.1253f, 20.8742f, 12.2002f, 18.4995f, 12.2002f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(20.4067f, 3.00781f);
        instancePath3.cubicTo(21.1627f, 3.08496f, 21.7534f, 3.7236f, 21.7534f, 4.5f);
        instancePath3.lineTo(21.7534f, 9.74023f);
        instancePath3.cubicTo(21.3705f, 9.55562f, 20.9688f, 9.40423f, 20.5532f, 9.28613f);
        instancePath3.lineTo(20.5532f, 4.5f);
        instancePath3.cubicTo(20.5532f, 4.33457f, 20.4187f, 4.20061f, 20.2534f, 4.2002f);
        instancePath3.lineTo(4.50043f, 4.2002f);
        instancePath3.cubicTo(4.33444f, 4.20023f, 4.19965f, 4.33469f, 4.19965f, 4.5f);
        instancePath3.lineTo(4.19965f, 8.06152f);
        instancePath3.lineTo(1.87446f, 10.0f);
        instancePath3.lineTo(4.19965f, 11.9385f);
        instancePath3.lineTo(4.19965f, 15.5f);
        instancePath3.cubicTo(4.19965f, 15.6653f, 4.33444f, 15.7998f, 4.50043f, 15.7998f);
        instancePath3.lineTo(11.0336f, 15.7998f);
        instancePath3.cubicTo(11.0123f, 16.0304f, 10.9995f, 16.2638f, 10.9995f, 16.5f);
        instancePath3.cubicTo(10.9995f, 16.6681f, 11.0071f, 16.8347f, 11.018f, 17.0f);
        instancePath3.lineTo(4.50043f, 17.0f);
        instancePath3.lineTo(4.34711f, 16.9922f);
        instancePath3.cubicTo(3.64113f, 16.9205f, 3.07999f, 16.3593f, 3.00825f, 15.6533f);
        instancePath3.lineTo(3.00043f, 15.5f);
        instancePath3.lineTo(3.00043f, 12.5f);
        instancePath3.lineTo(0.51313f, 10.4268f);
        instancePath3.cubicTo(0.2466f, 10.2046f, 0.2466f, 9.79535f, 0.51313f, 9.57324f);
        instancePath3.lineTo(3.00043f, 7.5f);
        instancePath3.lineTo(3.00043f, 4.5f);
        instancePath3.cubicTo(3.00043f, 3.72335f, 3.59069f, 3.08462f, 4.34711f, 3.00781f);
        instancePath3.lineTo(4.50043f, 3.0f);
        instancePath3.lineTo(20.2534f, 3.0f);
        instancePath3.lineTo(20.4067f, 3.00781f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
