package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_regular_preview_off extends l95.c {
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(6.50002f, 2.2002f);
        instancePath.lineTo(7.70002f, 2.2002f);
        instancePath.lineTo(7.70002f, 3.84998f);
        instancePath.lineTo(16.3f, 3.84998f);
        instancePath.lineTo(16.3f, 2.2002f);
        instancePath.lineTo(17.5f, 2.2002f);
        instancePath.lineTo(17.5f, 3.84998f);
        instancePath.lineTo(21.0f, 3.84998f);
        instancePath.cubicTo(21.5523f, 3.84998f, 22.0f, 4.29769f, 22.0f, 4.84998f);
        instancePath.lineTo(22.0f, 7.59998f);
        instancePath.lineTo(22.0f, 8.69998f);
        instancePath.lineTo(22.0f, 12.375f);
        instancePath.lineTo(20.8f, 12.375f);
        instancePath.lineTo(20.8f, 8.69998f);
        instancePath.lineTo(3.20002f, 8.69998f);
        instancePath.lineTo(3.20002f, 19.65f);
        instancePath.lineTo(15.0f, 19.65f);
        instancePath.lineTo(15.0f, 20.85f);
        instancePath.lineTo(3.00002f, 20.85f);
        instancePath.cubicTo(2.44773f, 20.85f, 2.00002f, 20.4023f, 2.00002f, 19.85f);
        instancePath.lineTo(2.00002f, 8.69998f);
        instancePath.lineTo(2.00002f, 7.59998f);
        instancePath.lineTo(2.00002f, 4.84998f);
        instancePath.cubicTo(2.00002f, 4.29769f, 2.44773f, 3.84998f, 3.00002f, 3.84998f);
        instancePath.lineTo(6.50002f, 3.84998f);
        instancePath.lineTo(6.50002f, 2.2002f);
        instancePath.close();
        instancePath.moveTo(20.8f, 5.04998f);
        instancePath.lineTo(20.8f, 7.59998f);
        instancePath.lineTo(3.20002f, 7.59998f);
        instancePath.lineTo(3.20002f, 5.04998f);
        instancePath.lineTo(20.8f, 5.04998f);
        instancePath.close();
        instancePath.moveTo(15.7472f, 10.6758f);
        instancePath.lineTo(16.6243f, 11.5529f);
        instancePath.lineTo(11.431f, 16.7461f);
        instancePath.cubicTo(11.1471f, 17.03f, 10.6869f, 17.03f, 10.403f, 16.7461f);
        instancePath.lineTo(7.77576f, 14.1189f);
        instancePath.lineTo(8.65285f, 13.2418f);
        instancePath.lineTo(10.917f, 15.506f);
        instancePath.lineTo(15.7472f, 10.6758f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(22.5f, 16.0762f);
        instancePath2.cubicTo(22.5f, 14.6955f, 21.3807f, 13.5762f, 20.0f, 13.5762f);
        instancePath2.cubicTo(18.6193f, 13.5762f, 17.5f, 14.6955f, 17.5f, 16.0762f);
        instancePath2.lineTo(17.5f, 16.3757f);
        instancePath2.cubicTo(16.9477f, 16.3757f, 16.5f, 16.8234f, 16.5f, 17.3757f);
        instancePath2.lineTo(16.5f, 21.0021f);
        instancePath2.cubicTo(16.5f, 21.5544f, 16.9477f, 22.0021f, 17.5f, 22.0021f);
        instancePath2.lineTo(22.5f, 22.0021f);
        instancePath2.cubicTo(23.0523f, 22.0021f, 23.5f, 21.5544f, 23.5f, 21.0021f);
        instancePath2.lineTo(23.5f, 17.3757f);
        instancePath2.cubicTo(23.5f, 16.8234f, 23.0523f, 16.3757f, 22.5f, 16.3757f);
        instancePath2.lineTo(22.5f, 16.0762f);
        instancePath2.close();
        instancePath2.moveTo(17.7f, 20.802f);
        instancePath2.lineTo(17.7f, 17.5749f);
        instancePath2.lineTo(22.3f, 17.5749f);
        instancePath2.lineTo(22.3f, 20.802f);
        instancePath2.lineTo(17.7f, 20.802f);
        instancePath2.close();
        instancePath2.moveTo(18.7067f, 15.9433f);
        instancePath2.cubicTo(18.7733f, 15.2877f, 19.3269f, 14.7762f, 20.0f, 14.7762f);
        instancePath2.lineTo(20.1329f, 14.7829f);
        instancePath2.cubicTo(20.7884f, 14.8495f, 21.3f, 15.4031f, 21.3f, 16.0762f);
        instancePath2.lineTo(21.3f, 16.3752f);
        instancePath2.lineTo(18.699f, 16.3752f);
        instancePath2.lineTo(18.7f, 16.0762f);
        instancePath2.lineTo(18.7067f, 15.9433f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
