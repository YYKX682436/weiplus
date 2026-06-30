package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class msg_channel_mark extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 16;
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
                instancePaint3.setColor(-8548183);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(11.8191f, 5.18372f);
                instancePath.lineTo(12.7134f, 2.65039f);
                instancePath.lineTo(11.1134f, 2.65039f);
                instancePath.lineTo(10.2194f, 5.18306f);
                instancePath.lineTo(8.48322f, 5.18347f);
                instancePath.lineTo(7.91841f, 6.78347f);
                instancePath.lineTo(9.65455f, 6.78306f);
                instancePath.lineTo(7.34801f, 13.3171f);
                instancePath.lineTo(8.94801f, 13.3171f);
                instancePath.lineTo(9.84253f, 10.7831f);
                instancePath.lineTo(11.709f, 10.7837f);
                instancePath.lineTo(12.2738f, 9.18373f);
                instancePath.lineTo(10.4073f, 9.18306f);
                instancePath.lineTo(11.2543f, 6.78372f);
                instancePath.lineTo(13.121f, 6.78372f);
                instancePath.lineTo(13.6858f, 5.18372f);
                instancePath.lineTo(11.8191f, 5.18372f);
                instancePath.close();
                instancePath.moveTo(6.40664f, 9.18311f);
                instancePath.lineTo(8.71338f, 2.65044f);
                instancePath.lineTo(7.11338f, 2.65044f);
                instancePath.lineTo(6.21934f, 5.18311f);
                instancePath.lineTo(4.35243f, 5.18377f);
                instancePath.lineTo(3.78762f, 6.78377f);
                instancePath.lineTo(5.65452f, 6.78311f);
                instancePath.lineTo(4.80707f, 9.18377f);
                instancePath.lineTo(2.94041f, 9.18377f);
                instancePath.lineTo(2.3756f, 10.7838f);
                instancePath.lineTo(4.24226f, 10.7838f);
                instancePath.lineTo(3.34798f, 13.3171f);
                instancePath.lineTo(4.94798f, 13.3171f);
                instancePath.lineTo(5.84183f, 10.7831f);
                instancePath.lineTo(7.57968f, 10.7835f);
                instancePath.lineTo(8.14449f, 9.18353f);
                instancePath.lineTo(6.40664f, 9.18311f);
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
