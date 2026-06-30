package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class trash_off_filled extends l95.c {
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
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(20.2681f, 5.32718f);
                instancePath.lineTo(4.51118f, 2.54881f);
                instancePath.cubicTo(4.23923f, 2.50086f, 3.9799f, 2.68244f, 3.93195f, 2.95439f);
                instancePath.lineTo(3.7583f, 3.9392f);
                instancePath.lineTo(18.2813f, 6.5f);
                instancePath.lineTo(5.58829f, 6.5f);
                instancePath.lineTo(6.38931f, 20.1174f);
                instancePath.cubicTo(6.4515f, 21.1746f, 7.32691f, 22.0f, 8.38586f, 22.0f);
                instancePath.lineTo(15.6142f, 22.0f);
                instancePath.cubicTo(16.6732f, 22.0f, 17.5486f, 21.1746f, 17.6108f, 20.1174f);
                instancePath.lineTo(18.4105f, 6.52277f);
                instancePath.lineTo(20.5f, 6.89122f);
                instancePath.lineTo(20.6737f, 5.90641f);
                instancePath.cubicTo(20.7216f, 5.63446f, 20.54f, 5.37513f, 20.2681f, 5.32718f);
                instancePath.close();
                instancePath.moveTo(14.7934f, 1.82331f);
                instancePath.lineTo(10.8541f, 1.12871f);
                instancePath.cubicTo(10.5822f, 1.08076f, 10.3229f, 1.26235f, 10.2749f, 1.53429f);
                instancePath.lineTo(10.1013f, 2.51907f);
                instancePath.lineTo(15.0253f, 3.38731f);
                instancePath.lineTo(15.1989f, 2.40253f);
                instancePath.cubicTo(15.2469f, 2.13059f, 15.0653f, 1.87126f, 14.7934f, 1.82331f);
                instancePath.close();
                instancePath.moveTo(9.50005f, 18.0f);
                instancePath.lineTo(9.00005f, 8.99998f);
                instancePath.lineTo(10.6001f, 8.99998f);
                instancePath.lineTo(11.0001f, 18.0f);
                instancePath.lineTo(9.50005f, 18.0f);
                instancePath.close();
                instancePath.moveTo(13.0001f, 18.0f);
                instancePath.lineTo(13.5001f, 8.99998f);
                instancePath.lineTo(15.0001f, 8.99998f);
                instancePath.lineTo(14.5001f, 18.0f);
                instancePath.lineTo(13.0001f, 18.0f);
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
