package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class language_transfer_regular extends l95.c {
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
        instancePath.moveTo(4.2f, 19.8f);
        instancePath.lineTo(4.2f, 4.2f);
        instancePath.lineTo(19.8f, 4.2f);
        instancePath.lineTo(19.8f, 19.8f);
        instancePath.lineTo(4.2f, 19.8f);
        instancePath.close();
        instancePath.moveTo(3.0f, 4.0f);
        instancePath.cubicTo(3.0f, 3.44772f, 3.44772f, 3.0f, 4.0f, 3.0f);
        instancePath.lineTo(20.0f, 3.0f);
        instancePath.cubicTo(20.5523f, 3.0f, 21.0f, 3.44772f, 21.0f, 4.0f);
        instancePath.lineTo(21.0f, 20.0f);
        instancePath.cubicTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f);
        instancePath.lineTo(4.0f, 21.0f);
        instancePath.cubicTo(3.44772f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f);
        instancePath.lineTo(3.0f, 4.0f);
        instancePath.close();
        instancePath.moveTo(8.46342f, 12.0f);
        instancePath.cubicTo(8.46342f, 10.0468f, 10.0468f, 8.46342f, 12.0f, 8.46342f);
        instancePath.cubicTo(12.8132f, 8.46342f, 13.5626f, 8.73768f, 14.1604f, 9.19965f);
        instancePath.lineTo(13.0998f, 9.19965f);
        instancePath.lineTo(13.0998f, 10.6631f);
        instancePath.lineTo(15.8437f, 10.6631f);
        instancePath.cubicTo(16.2478f, 10.6631f, 16.5754f, 10.3355f, 16.5754f, 9.93135f);
        instancePath.lineTo(16.5754f, 7.18745f);
        instancePath.lineTo(15.112f, 7.18745f);
        instancePath.lineTo(15.112f, 8.08642f);
        instancePath.cubicTo(14.2584f, 7.40676f, 13.1768f, 7.0f, 12.0f, 7.0f);
        instancePath.cubicTo(9.23858f, 7.0f, 7.0f, 9.23858f, 7.0f, 12.0f);
        instancePath.lineTo(8.46342f, 12.0f);
        instancePath.close();
        instancePath.moveTo(15.5367f, 12.0f);
        instancePath.cubicTo(15.5367f, 13.9532f, 13.9533f, 15.5366f, 12.0001f, 15.5366f);
        instancePath.cubicTo(11.1192f, 15.5366f, 10.3134f, 15.2149f, 9.69375f, 14.6813f);
        instancePath.lineTo(10.9073f, 14.6813f);
        instancePath.lineTo(10.9073f, 13.2178f);
        instancePath.lineTo(8.16342f, 13.2178f);
        instancePath.cubicTo(7.75931f, 13.2178f, 7.43171f, 13.5454f, 7.43171f, 13.9496f);
        instancePath.lineTo(7.43171f, 16.6935f);
        instancePath.lineTo(8.89513f, 16.6935f);
        instancePath.lineTo(8.89513f, 15.9192f);
        instancePath.cubicTo(9.74766f, 16.5954f, 10.8266f, 17.0f, 12.0001f, 17.0f);
        instancePath.cubicTo(14.7615f, 17.0f, 17.0001f, 14.7614f, 17.0001f, 12.0f);
        instancePath.lineTo(15.5367f, 12.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
