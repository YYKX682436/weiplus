package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_square_play extends l95.c {
    private final int width = 20;
    private final int height = 21;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 20;
        }
        if (i17 == 1) {
            return 21;
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
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(4.16659f, 2.16675f);
            instancePath.cubicTo(3.70635f, 2.16675f, 3.33325f, 2.53984f, 3.33325f, 3.00008f);
            instancePath.lineTo(3.33325f, 18.0001f);
            instancePath.cubicTo(3.33325f, 18.4603f, 3.70635f, 18.8334f, 4.16659f, 18.8334f);
            instancePath.lineTo(15.8333f, 18.8334f);
            instancePath.cubicTo(16.2935f, 18.8334f, 16.6666f, 18.4603f, 16.6666f, 18.0001f);
            instancePath.lineTo(16.6666f, 3.00008f);
            instancePath.cubicTo(16.6666f, 2.53984f, 16.2935f, 2.16675f, 15.8333f, 2.16675f);
            instancePath.lineTo(4.16659f, 2.16675f);
            instancePath.close();
            instancePath.moveTo(13.1648f, 10.1927f);
            instancePath.lineTo(8.46494f, 7.22185f);
            instancePath.cubicTo(8.40798f, 7.18584f, 8.34216f, 7.16675f, 8.27499f, 7.16675f);
            instancePath.cubicTo(8.07705f, 7.16675f, 7.91658f, 7.32904f, 7.91658f, 7.52923f);
            instancePath.lineTo(7.91658f, 13.4709f);
            instancePath.cubicTo(7.91658f, 13.5388f, 7.93546f, 13.6054f, 7.97106f, 13.663f);
            instancePath.cubicTo(8.07597f, 13.8328f, 8.29709f, 13.8844f, 8.46494f, 13.7783f);
            instancePath.lineTo(13.1648f, 10.8074f);
            instancePath.cubicTo(13.2109f, 10.7783f, 13.2499f, 10.7389f, 13.2787f, 10.6922f);
            instancePath.cubicTo(13.3836f, 10.5224f, 13.3326f, 10.2988f, 13.1648f, 10.1927f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
