package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class light_bulb_filled extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(12.0002f, 3.0f);
            instancePath.cubicTo(15.9764f, 3.00022f, 19.1995f, 6.28643f, 19.1995f, 10.3398f);
            instancePath.cubicTo(19.1994f, 12.5975f, 18.1983f, 14.6156f, 16.6252f, 15.9619f);
            instancePath.lineTo(16.0715f, 16.5898f);
            instancePath.cubicTo(15.4509f, 17.2931f, 15.102f, 18.195f, 15.0872f, 19.1328f);
            instancePath.cubicTo(15.0866f, 19.1699f, 15.0559f, 19.2002f, 15.0188f, 19.2002f);
            instancePath.lineTo(8.98071f, 19.2002f);
            instancePath.cubicTo(8.94465f, 19.2002f, 8.91525f, 19.1708f, 8.91528f, 19.1348f);
            instancePath.cubicTo(8.92031f, 18.1985f, 8.57781f, 17.2933f, 7.95435f, 16.5947f);
            instancePath.lineTo(7.4397f, 16.0186f);
            instancePath.cubicTo(5.82866f, 14.6726f, 4.80012f, 12.6289f, 4.80005f, 10.3398f);
            instancePath.cubicTo(4.80005f, 6.28629f, 8.02391f, 3.0f, 12.0002f, 3.0f);
            instancePath.close();
            instancePath.moveTo(12.4407f, 7.58887f);
            instancePath.cubicTo(12.1518f, 7.41581f, 11.774f, 7.5038f, 11.5969f, 7.78613f);
            instancePath.lineTo(9.84204f, 10.5879f);
            instancePath.lineTo(9.79907f, 10.6689f);
            instancePath.cubicTo(9.63157f, 11.0536f, 9.91796f, 11.501f, 10.3655f, 11.501f);
            instancePath.lineTo(12.0793f, 11.501f);
            instancePath.lineTo(11.0432f, 13.7783f);
            instancePath.lineTo(10.9973f, 13.8643f);
            instancePath.cubicTo(10.8813f, 14.1298f, 10.9753f, 14.4466f, 11.2327f, 14.6064f);
            instancePath.cubicTo(11.5188f, 14.784f, 11.8978f, 14.7007f, 12.0793f, 14.4209f);
            instancePath.lineTo(14.1555f, 11.2227f);
            instancePath.lineTo(14.2004f, 11.1416f);
            instancePath.cubicTo(14.3751f, 10.7563f, 14.0893f, 10.301f, 13.6379f, 10.3008f);
            instancePath.lineTo(11.8079f, 10.3008f);
            instancePath.lineTo(12.6438f, 8.41309f);
            instancePath.lineTo(12.6887f, 8.32617f);
            instancePath.cubicTo(12.8003f, 8.05887f, 12.7006f, 7.74463f, 12.4407f, 7.58887f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint4.setColor(-16777216);
            instancePaint4.setStrokeWidth(0.899975f);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(10.29f, 20.3701f);
            instancePath2.lineTo(13.71f, 20.3701f);
            instancePath2.cubicTo(13.7596f, 20.3702f, 13.7998f, 20.4103f, 13.7998f, 20.46f);
            instancePath2.cubicTo(13.7998f, 20.5096f, 13.7596f, 20.5498f, 13.71f, 20.5498f);
            instancePath2.lineTo(10.29f, 20.5498f);
            instancePath2.cubicTo(10.2404f, 20.5498f, 10.2002f, 20.5096f, 10.2002f, 20.46f);
            instancePath2.cubicTo(10.2002f, 20.4103f, 10.2403f, 20.3701f, 10.29f, 20.3701f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
