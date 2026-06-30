package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class magnifying_glass_regular extends l95.c {
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
                instancePath.moveTo(15.4529f, 16.4014f);
                instancePath.cubicTo(14.2428f, 17.4001f, 12.6915f, 18.0f, 11.0f, 18.0f);
                instancePath.cubicTo(7.134f, 18.0f, 4.0f, 14.866f, 4.0f, 11.0f);
                instancePath.cubicTo(4.0f, 7.134f, 7.134f, 4.0f, 11.0f, 4.0f);
                instancePath.cubicTo(14.866f, 4.0f, 18.0f, 7.134f, 18.0f, 11.0f);
                instancePath.cubicTo(18.0f, 12.7425f, 17.3633f, 14.3363f, 16.3099f, 15.5614f);
                instancePath.lineTo(20.4243f, 19.6757f);
                instancePath.lineTo(19.5757f, 20.5243f);
                instancePath.lineTo(15.4529f, 16.4014f);
                instancePath.close();
                instancePath.moveTo(16.8f, 11.0f);
                instancePath.cubicTo(16.8f, 14.2033f, 14.2033f, 16.8f, 11.0f, 16.8f);
                instancePath.cubicTo(7.79674f, 16.8f, 5.2f, 14.2033f, 5.2f, 11.0f);
                instancePath.cubicTo(5.2f, 7.79676f, 7.79674f, 5.20001f, 11.0f, 5.20001f);
                instancePath.cubicTo(14.2033f, 5.20001f, 16.8f, 7.79676f, 16.8f, 11.0f);
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
