package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class voice_chat_on_filled extends l95.c {
    private final int width = 20;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 20;
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
            instancePaint3.setColor(-1);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(3.33334f, 15.0669f);
            instancePath.lineTo(3.33334f, 4.88147f);
            instancePath.cubicTo(3.33334f, 4.56582f, 3.51168f, 4.27727f, 3.794f, 4.13611f);
            instancePath.lineTo(6.71324f, 2.67649f);
            instancePath.cubicTo(7.58536f, 2.24043f, 8.64392f, 2.64289f, 9.00606f, 3.54822f);
            instancePath.lineTo(12.1718f, 11.4625f);
            instancePath.cubicTo(12.3499f, 11.9077f, 12.1164f, 12.411f, 11.6616f, 12.5626f);
            instancePath.lineTo(10.0f, 13.1164f);
            instancePath.lineTo(9.51572f, 16.0222f);
            instancePath.cubicTo(9.33806f, 17.0882f, 8.2085f, 17.7058f, 7.2152f, 17.2801f);
            instancePath.lineTo(3.83841f, 15.8329f);
            instancePath.cubicTo(3.53201f, 15.7016f, 3.33334f, 15.4003f, 3.33334f, 15.0669f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(16.2502f, 11.0332f);
            instancePath2.cubicTo(16.2502f, 12.529f, 15.6439f, 13.8832f, 14.6637f, 14.8634f);
            instancePath2.lineTo(15.5476f, 15.7473f);
            instancePath2.cubicTo(16.754f, 14.5408f, 17.5002f, 12.8742f, 17.5002f, 11.0332f);
            instancePath2.cubicTo(17.5002f, 9.19227f, 16.754f, 7.5256f, 15.5476f, 6.31917f);
            instancePath2.lineTo(14.6637f, 7.20306f);
            instancePath2.cubicTo(15.6439f, 8.18328f, 16.2502f, 9.53745f, 16.2502f, 11.0332f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-1);
            android.graphics.Path instancePath3 = l95.c.instancePath(looper);
            instancePath3.moveTo(15.0002f, 11.0332f);
            instancePath3.cubicTo(15.0002f, 9.88262f, 14.5338f, 8.84096f, 13.7798f, 8.08694f);
            instancePath3.lineTo(12.8959f, 8.97082f);
            instancePath3.cubicTo(13.4237f, 9.49864f, 13.7502f, 10.2278f, 13.7502f, 11.0332f);
            instancePath3.cubicTo(13.7502f, 11.8386f, 13.4237f, 12.5678f, 12.8959f, 13.0956f);
            instancePath3.lineTo(13.7798f, 13.9795f);
            instancePath3.cubicTo(14.5338f, 13.2255f, 15.0002f, 12.1838f, 15.0002f, 11.0332f);
            instancePath3.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
            canvas.drawPath(instancePath3, instancePaint5);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
